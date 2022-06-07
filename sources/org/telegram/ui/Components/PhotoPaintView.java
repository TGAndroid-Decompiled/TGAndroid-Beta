package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import java.math.BigInteger;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$InputDocument;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_inputDocument;
import org.telegram.tgnet.TLRPC$TL_maskCoords;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PhotoFace;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Paint.Views.ColorPicker;
import org.telegram.ui.Components.Paint.Views.EntitiesContainerView;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.StickerMasksAlert;
import org.telegram.ui.PhotoViewer;

@SuppressLint({"NewApi"})
public class PhotoPaintView extends FrameLayout implements EntityView.EntityViewDelegate {
    private FrameLayout backgroundView;
    private float baseScale;
    private Bitmap bitmapToEdit;
    private Swatch brushSwatch;
    private TextView cancelTextView;
    private ColorPicker colorPicker;
    int currentBrush;
    private MediaController.CropState currentCropState;
    private EntityView currentEntityView;
    private FrameLayout curtainView;
    private FrameLayout dimView;
    private TextView doneTextView;
    private Point editedTextPosition;
    private float editedTextRotation;
    private float editedTextScale;
    private boolean editingText;
    private EntitiesContainerView entitiesView;
    private ArrayList<PhotoFace> faces;
    private Bitmap facesBitmap;
    private boolean ignoreLayout;
    private boolean inBubbleMode;
    private String initialText;
    private BigInteger lcm;
    private int originalBitmapRotation;
    private ImageView paintButton;
    private Size paintingSize;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private RenderView renderView;
    private final Theme.ResourcesProvider resourcesProvider;
    private FrameLayout selectionContainerView;
    private FrameLayout textDimView;
    private FrameLayout toolsView;
    private float transformX;
    private float transformY;
    private UndoStore undoStore;
    private Brush[] brushes = {new Brush.Radial(), new Brush.Elliptical(), new Brush.Neon(), new Brush.Arrow()};
    private float[] temp = new float[2];
    private int selectedTextType = 2;
    private int[] pos = new int[2];
    private DispatchQueue queue = new DispatchQueue("Paint");

    protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
    }

    protected void onOpenCloseStickersAlert(boolean z) {
    }

    protected void onTextAdd() {
    }

    public PhotoPaintView(Context context, Bitmap bitmap, Bitmap bitmap2, int i, ArrayList<VideoEditedInfo.MediaEntity> arrayList, MediaController.CropState cropState, final Runnable runnable, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        StickerView stickerView;
        this.resourcesProvider = resourcesProvider;
        this.inBubbleMode = context instanceof BubbleActivity;
        this.currentCropState = cropState;
        this.originalBitmapRotation = i;
        this.bitmapToEdit = bitmap;
        this.facesBitmap = bitmap2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.setDelegate(new UndoStore.UndoStoreDelegate() {
            @Override
            public final void historyChanged() {
                PhotoPaintView.this.lambda$new$0();
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.curtainView = frameLayout;
        frameLayout.setBackgroundColor(570425344);
        this.curtainView.setVisibility(4);
        addView(this.curtainView, LayoutHelper.createFrame(-1, -1.0f));
        RenderView renderView = new RenderView(context, new Painting(getPaintingSize()), bitmap);
        this.renderView = renderView;
        renderView.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public void onFirstDraw() {
                runnable.run();
            }

            @Override
            public void onBeganDrawing() {
                if (PhotoPaintView.this.currentEntityView != null) {
                    PhotoPaintView.this.selectEntity(null);
                }
            }

            @Override
            public void onFinishedDrawing(boolean z) {
                PhotoPaintView.this.colorPicker.setUndoEnabled(PhotoPaintView.this.undoStore.canUndo());
            }

            @Override
            public boolean shouldDraw() {
                boolean z = PhotoPaintView.this.currentEntityView == null;
                if (!z) {
                    PhotoPaintView.this.selectEntity(null);
                }
                return z;
            }
        });
        this.renderView.setUndoStore(this.undoStore);
        this.renderView.setQueue(this.queue);
        this.renderView.setVisibility(4);
        this.renderView.setBrush(this.brushes[0]);
        addView(this.renderView, LayoutHelper.createFrame(-1, -1, 51));
        EntitiesContainerView entitiesContainerView = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() {
            @Override
            public boolean shouldReceiveTouches() {
                return PhotoPaintView.this.textDimView.getVisibility() != 0;
            }

            @Override
            public EntityView onSelectedEntityRequest() {
                return PhotoPaintView.this.currentEntityView;
            }

            @Override
            public void onEntityDeselect() {
                PhotoPaintView.this.selectEntity(null);
            }
        });
        this.entitiesView = entitiesContainerView;
        addView(entitiesContainerView);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.dimView = frameLayout2;
        frameLayout2.setAlpha(0.0f);
        this.dimView.setBackgroundColor(1711276032);
        this.dimView.setVisibility(8);
        addView(this.dimView);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.textDimView = frameLayout3;
        frameLayout3.setAlpha(0.0f);
        this.textDimView.setBackgroundColor(1711276032);
        this.textDimView.setVisibility(8);
        this.textDimView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$new$1(view);
            }
        });
        this.backgroundView = new FrameLayout(context);
        Drawable mutate = getResources().getDrawable(R.drawable.gradient_bottom).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        this.backgroundView.setBackground(mutate);
        addView(this.backgroundView, LayoutHelper.createFrame(-1, 72, 87));
        FrameLayout frameLayout4 = new FrameLayout(this, context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.selectionContainerView = frameLayout4;
        addView(frameLayout4);
        ColorPicker colorPicker = new ColorPicker(context);
        this.colorPicker = colorPicker;
        addView(colorPicker);
        this.colorPicker.setDelegate(new ColorPicker.ColorPickerDelegate() {
            @Override
            public void onBeganColorPicking() {
                if (!(PhotoPaintView.this.currentEntityView instanceof TextPaintView)) {
                    PhotoPaintView.this.setDimVisibility(true);
                }
            }

            @Override
            public void onColorValueChanged() {
                PhotoPaintView photoPaintView = PhotoPaintView.this;
                photoPaintView.setCurrentSwatch(photoPaintView.colorPicker.getSwatch(), false);
            }

            @Override
            public void onFinishedColorPicking() {
                PhotoPaintView photoPaintView = PhotoPaintView.this;
                photoPaintView.setCurrentSwatch(photoPaintView.colorPicker.getSwatch(), false);
                if (!(PhotoPaintView.this.currentEntityView instanceof TextPaintView)) {
                    PhotoPaintView.this.setDimVisibility(false);
                }
            }

            @Override
            public void onSettingsPressed() {
                if (PhotoPaintView.this.currentEntityView == null) {
                    PhotoPaintView.this.showBrushSettings();
                } else if (PhotoPaintView.this.currentEntityView instanceof StickerView) {
                    PhotoPaintView.this.mirrorSticker();
                } else if (PhotoPaintView.this.currentEntityView instanceof TextPaintView) {
                    PhotoPaintView.this.showTextSettings();
                }
            }

            @Override
            public void onUndoPressed() {
                PhotoPaintView.this.undoStore.undo();
            }
        });
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.toolsView = frameLayout5;
        frameLayout5.setBackgroundColor(-16777216);
        addView(this.toolsView, LayoutHelper.createFrame(-1, 48, 83));
        TextView textView = new TextView(context);
        this.cancelTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.cancelTextView.setTextColor(-1);
        this.cancelTextView.setGravity(17);
        this.cancelTextView.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0));
        this.cancelTextView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.cancelTextView.setText(LocaleController.getString("Cancel", R.string.Cancel).toUpperCase());
        this.cancelTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.toolsView.addView(this.cancelTextView, LayoutHelper.createFrame(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.doneTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        this.doneTextView.setTextColor(getThemedColor("dialogFloatingButton"));
        this.doneTextView.setGravity(17);
        this.doneTextView.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0));
        this.doneTextView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.doneTextView.setText(LocaleController.getString("Done", R.string.Done).toUpperCase());
        this.doneTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.toolsView.addView(this.doneTextView, LayoutHelper.createFrame(-2, -1, 53));
        ImageView imageView = new ImageView(context);
        this.paintButton = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.paintButton.setContentDescription(LocaleController.getString("AccDescrPaint", R.string.AccDescrPaint));
        this.paintButton.setImageResource(R.drawable.msg_photo_draw);
        this.paintButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.toolsView.addView(this.paintButton, LayoutHelper.createFrame(54, -1.0f, 17, 0.0f, 0.0f, 56.0f, 0.0f));
        this.paintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$new$2(view);
            }
        });
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_sticker);
        imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.toolsView.addView(imageView2, LayoutHelper.createFrame(54, -1, 17));
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$new$3(view);
            }
        });
        ImageView imageView3 = new ImageView(context);
        imageView3.setScaleType(ImageView.ScaleType.CENTER);
        imageView3.setContentDescription(LocaleController.getString("AccDescrPlaceText", R.string.AccDescrPlaceText));
        imageView3.setImageResource(R.drawable.msg_photo_text);
        imageView3.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.toolsView.addView(imageView3, LayoutHelper.createFrame(54, -1.0f, 17, 56.0f, 0.0f, 0.0f, 0.0f));
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$new$4(view);
            }
        });
        this.colorPicker.setUndoEnabled(false);
        setCurrentSwatch(this.colorPicker.getSwatch(), false);
        updateSettingsButton();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                VideoEditedInfo.MediaEntity mediaEntity = arrayList.get(i2);
                byte b = mediaEntity.type;
                if (b == 0) {
                    StickerView createSticker = createSticker(mediaEntity.parentObject, mediaEntity.document, false);
                    if ((mediaEntity.subType & 2) != 0) {
                        createSticker.mirror();
                    }
                    ViewGroup.LayoutParams layoutParams = createSticker.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    stickerView = createSticker;
                } else if (b == 1) {
                    TextPaintView createText = createText(false);
                    byte b2 = mediaEntity.subType;
                    createText.setType((b2 & 1) != 0 ? 0 : (b2 & 4) != 0 ? 2 : 1);
                    createText.setText(mediaEntity.text);
                    Swatch swatch = createText.getSwatch();
                    swatch.color = mediaEntity.color;
                    createText.setSwatch(swatch);
                    stickerView = createText;
                }
                stickerView.setX((mediaEntity.x * this.paintingSize.width) - ((mediaEntity.viewWidth * (1.0f - mediaEntity.scale)) / 2.0f));
                stickerView.setY((mediaEntity.y * this.paintingSize.height) - ((mediaEntity.viewHeight * (1.0f - mediaEntity.scale)) / 2.0f));
                stickerView.setPosition(new Point(stickerView.getX() + (mediaEntity.viewWidth / 2), stickerView.getY() + (mediaEntity.viewHeight / 2)));
                stickerView.setScaleX(mediaEntity.scale);
                stickerView.setScaleY(mediaEntity.scale);
                double d = -mediaEntity.rotation;
                Double.isNaN(d);
                stickerView.setRotation((float) ((d / 3.141592653589793d) * 180.0d));
            }
        }
        this.entitiesView.setVisibility(4);
    }

    public void lambda$new$0() {
        this.colorPicker.setUndoEnabled(this.undoStore.canUndo());
    }

    public void lambda$new$1(View view) {
        closeTextEnter(true);
    }

    public void lambda$new$2(View view) {
        selectEntity(null);
    }

    public void lambda$new$3(View view) {
        openStickersView();
    }

    public void lambda$new$4(View view) {
        createText(true);
    }

    public void onResume() {
        this.renderView.redraw();
    }

    public boolean onTouch(MotionEvent motionEvent) {
        if (this.currentEntityView != null) {
            if (this.editingText) {
                closeTextEnter(true);
            } else {
                selectEntity(null);
            }
        }
        float x = ((motionEvent.getX() - this.renderView.getTranslationX()) - (getMeasuredWidth() / 2)) / this.renderView.getScaleX();
        float y = (((motionEvent.getY() - this.renderView.getTranslationY()) - (getMeasuredHeight() / 2)) + AndroidUtilities.dp(32.0f)) / this.renderView.getScaleY();
        double d = x;
        double radians = (float) Math.toRadians(-this.renderView.getRotation());
        double cos = Math.cos(radians);
        Double.isNaN(d);
        double d2 = y;
        double sin = Math.sin(radians);
        Double.isNaN(d2);
        float measuredWidth = ((float) ((cos * d) - (sin * d2))) + (this.renderView.getMeasuredWidth() / 2);
        double sin2 = Math.sin(radians);
        Double.isNaN(d);
        double cos2 = Math.cos(radians);
        Double.isNaN(d2);
        MotionEvent obtain = MotionEvent.obtain(0L, 0L, motionEvent.getActionMasked(), measuredWidth, ((float) ((d * sin2) + (d2 * cos2))) + (this.renderView.getMeasuredHeight() / 2), 0);
        this.renderView.onTouch(obtain);
        obtain.recycle();
        return true;
    }

    private Size getPaintingSize() {
        float f;
        float f2;
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        Size size2 = new Size(this.bitmapToEdit.getWidth(), this.bitmapToEdit.getHeight());
        size2.width = 1280.0f;
        float floor = (float) Math.floor((1280.0f * f2) / f);
        size2.height = floor;
        if (floor > 1280.0f) {
            size2.height = 1280.0f;
            size2.width = (float) Math.floor((1280.0f * f) / f2);
        }
        this.paintingSize = size2;
        return size2;
    }

    private void updateSettingsButton() {
        this.colorPicker.settingsButton.setContentDescription(LocaleController.getString("AccDescrBrushType", R.string.AccDescrBrushType));
        EntityView entityView = this.currentEntityView;
        int i = R.drawable.photo_paint_brush;
        if (entityView != null) {
            if (entityView instanceof StickerView) {
                i = R.drawable.msg_photo_flip;
                this.colorPicker.settingsButton.setContentDescription(LocaleController.getString("AccDescrMirror", R.string.AccDescrMirror));
            } else if (entityView instanceof TextPaintView) {
                i = R.drawable.photo_outline;
                this.colorPicker.settingsButton.setContentDescription(LocaleController.getString("PaintOutlined", R.string.PaintOutlined));
            }
            this.paintButton.setImageResource(R.drawable.msg_photo_draw);
            this.paintButton.setColorFilter((ColorFilter) null);
        } else {
            Swatch swatch = this.brushSwatch;
            if (swatch != null) {
                setCurrentSwatch(swatch, true);
                this.brushSwatch = null;
            }
            this.paintButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY));
            this.paintButton.setImageResource(R.drawable.msg_photo_draw);
        }
        this.backgroundView.setVisibility(this.currentEntityView instanceof TextPaintView ? 4 : 0);
        this.colorPicker.setSettingsButtonImage(i);
    }

    public void updateColors() {
        ImageView imageView = this.paintButton;
        if (!(imageView == null || imageView.getColorFilter() == null)) {
            this.paintButton.setColorFilter(new PorterDuffColorFilter(getThemedColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY));
        }
        TextView textView = this.doneTextView;
        if (textView != null) {
            textView.setTextColor(getThemedColor("dialogFloatingButton"));
        }
    }

    public void init() {
        this.entitiesView.setVisibility(0);
        this.renderView.setVisibility(0);
        if (this.facesBitmap != null) {
            detectFaces();
        }
    }

    public void shutdown() {
        this.renderView.shutdown();
        this.entitiesView.setVisibility(8);
        this.selectionContainerView.setVisibility(8);
        this.queue.postRunnable(PhotoPaintView$$ExternalSyntheticLambda18.INSTANCE);
    }

    public static void lambda$shutdown$5() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }

    public FrameLayout getToolsView() {
        return this.toolsView;
    }

    public FrameLayout getColorPickerBackground() {
        return this.backgroundView;
    }

    public FrameLayout getCurtainView() {
        return this.curtainView;
    }

    public TextView getDoneTextView() {
        return this.doneTextView;
    }

    public TextView getCancelTextView() {
        return this.cancelTextView;
    }

    public ColorPicker getColorPicker() {
        return this.colorPicker;
    }

    public boolean hasChanges() {
        return this.undoStore.canUndo();
    }

    public Bitmap getBitmap(ArrayList<VideoEditedInfo.MediaEntity> arrayList, Bitmap[] bitmapArr) {
        int i;
        int i2;
        boolean z;
        Canvas canvas;
        int i3;
        PhotoPaintView photoPaintView = this;
        ArrayList<VideoEditedInfo.MediaEntity> arrayList2 = arrayList;
        Bitmap resultBitmap = photoPaintView.renderView.getResultBitmap();
        photoPaintView.lcm = BigInteger.ONE;
        if (resultBitmap != null && photoPaintView.entitiesView.entitiesCount() > 0) {
            int childCount = photoPaintView.entitiesView.getChildCount();
            byte b = 0;
            Canvas canvas2 = null;
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = photoPaintView.entitiesView.getChildAt(i4);
                if (childAt instanceof EntityView) {
                    EntityView entityView = (EntityView) childAt;
                    Point position = entityView.getPosition();
                    if (arrayList2 != null) {
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        if (entityView instanceof TextPaintView) {
                            mediaEntity.type = (byte) 1;
                            TextPaintView textPaintView = (TextPaintView) entityView;
                            mediaEntity.text = textPaintView.getText();
                            int type = textPaintView.getType();
                            if (type == 0) {
                                mediaEntity.subType = (byte) (mediaEntity.subType | 1);
                            } else if (type == 2) {
                                mediaEntity.subType = (byte) (mediaEntity.subType | 4);
                            }
                            mediaEntity.color = textPaintView.getSwatch().color;
                            mediaEntity.fontSize = textPaintView.getTextSize();
                            z = false;
                        } else if (entityView instanceof StickerView) {
                            mediaEntity.type = b;
                            StickerView stickerView = (StickerView) entityView;
                            Size baseSize = stickerView.getBaseSize();
                            mediaEntity.width = baseSize.width;
                            mediaEntity.height = baseSize.height;
                            mediaEntity.document = stickerView.getSticker();
                            mediaEntity.parentObject = stickerView.getParentObject();
                            TLRPC$Document sticker = stickerView.getSticker();
                            mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                            if (MessageObject.isAnimatedStickerDocument(sticker, true) || MessageObject.isVideoStickerDocument(sticker)) {
                                boolean isAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(sticker, true);
                                mediaEntity.subType = (byte) (mediaEntity.subType | (isAnimatedStickerDocument ? (byte) 1 : (byte) 4));
                                long duration = isAnimatedStickerDocument ? stickerView.getDuration() : 5000L;
                                if (duration != 0) {
                                    BigInteger valueOf = BigInteger.valueOf(duration);
                                    photoPaintView.lcm = photoPaintView.lcm.multiply(valueOf).divide(photoPaintView.lcm.gcd(valueOf));
                                }
                                z = true;
                            } else {
                                z = false;
                            }
                            if (stickerView.isMirrored()) {
                                mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                            }
                        }
                        arrayList2.add(mediaEntity);
                        float scaleX = childAt.getScaleX();
                        float scaleY = childAt.getScaleY();
                        float x = childAt.getX();
                        float y = childAt.getY();
                        mediaEntity.viewWidth = childAt.getWidth();
                        mediaEntity.viewHeight = childAt.getHeight();
                        mediaEntity.width = (childAt.getWidth() * scaleX) / photoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.height = (childAt.getHeight() * scaleY) / photoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / photoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.y = (y + ((childAt.getHeight() * (1.0f - scaleY)) / 2.0f)) / photoPaintView.entitiesView.getMeasuredHeight();
                        i2 = i4;
                        double d = -childAt.getRotation();
                        Double.isNaN(d);
                        mediaEntity.rotation = (float) (d * 0.017453292519943295d);
                        mediaEntity.textViewX = (x + (childAt.getWidth() / 2)) / photoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.textViewY = (y + (childAt.getHeight() / 2)) / photoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.textViewWidth = mediaEntity.viewWidth / photoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.textViewHeight = mediaEntity.viewHeight / photoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.scale = scaleX;
                        if (bitmapArr[0] == null) {
                            bitmapArr[0] = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), resultBitmap.getConfig());
                            canvas2 = new Canvas(bitmapArr[0]);
                            canvas2.drawBitmap(resultBitmap, 0.0f, 0.0f, (Paint) null);
                        }
                        canvas = canvas2;
                    } else {
                        i2 = i4;
                        canvas = canvas2;
                        z = false;
                    }
                    Canvas canvas3 = new Canvas(resultBitmap);
                    int i5 = 0;
                    while (i5 < 2) {
                        Canvas canvas4 = i5 == 0 ? canvas3 : canvas;
                        if (canvas4 == null || (i5 == 0 && z)) {
                            i3 = childCount;
                        } else {
                            canvas4.save();
                            canvas4.translate(position.x, position.y);
                            canvas4.scale(childAt.getScaleX(), childAt.getScaleY());
                            canvas4.rotate(childAt.getRotation());
                            canvas4.translate((-entityView.getWidth()) / 2, (-entityView.getHeight()) / 2);
                            if (childAt instanceof TextPaintView) {
                                Bitmap createBitmap = Bitmaps.createBitmap(childAt.getWidth(), childAt.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas5 = new Canvas(createBitmap);
                                childAt.draw(canvas5);
                                i3 = childCount;
                                canvas4.drawBitmap(createBitmap, (Rect) null, new Rect(0, 0, createBitmap.getWidth(), createBitmap.getHeight()), (Paint) null);
                                try {
                                    canvas5.setBitmap(null);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                createBitmap.recycle();
                            } else {
                                i3 = childCount;
                                childAt.draw(canvas4);
                            }
                            canvas4.restore();
                        }
                        i5++;
                        childCount = i3;
                    }
                    i = childCount;
                    canvas2 = canvas;
                    i4 = i2 + 1;
                    photoPaintView = this;
                    arrayList2 = arrayList;
                    childCount = i;
                    b = 0;
                }
                i2 = i4;
                i = childCount;
                i4 = i2 + 1;
                photoPaintView = this;
                arrayList2 = arrayList;
                childCount = i;
                b = 0;
            }
        }
        return resultBitmap;
    }

    public long getLcm() {
        return this.lcm.longValue();
    }

    public void maybeShowDismissalAlert(PhotoViewer photoViewer, Activity activity, final Runnable runnable) {
        if (this.editingText) {
            closeTextEnter(false);
        } else if (!hasChanges()) {
            runnable.run();
        } else if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(LocaleController.getString("PhotoEditorDiscardAlert", R.string.PhotoEditorDiscardAlert));
            builder.setTitle(LocaleController.getString("DiscardChanges", R.string.DiscardChanges));
            builder.setPositiveButton(LocaleController.getString("PassportDiscard", R.string.PassportDiscard), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    runnable.run();
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            photoViewer.showAlertDialog(builder);
        }
    }

    public void setCurrentSwatch(Swatch swatch, boolean z) {
        this.renderView.setColor(swatch.color);
        this.renderView.setBrushSize(swatch.brushWeight);
        if (z) {
            if (this.brushSwatch == null && this.paintButton.getColorFilter() != null) {
                this.brushSwatch = this.colorPicker.getSwatch();
            }
            this.colorPicker.setSwatch(swatch);
        }
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setSwatch(swatch);
        }
    }

    public void setDimVisibility(final boolean z) {
        ObjectAnimator objectAnimator;
        if (z) {
            this.dimView.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.dimView, View.ALPHA, 0.0f, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.dimView, View.ALPHA, 1.0f, 0.0f);
        }
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    PhotoPaintView.this.dimView.setVisibility(8);
                }
            }
        });
        objectAnimator.setDuration(200L);
        objectAnimator.start();
    }

    private void setTextDimVisibility(final boolean z, EntityView entityView) {
        ObjectAnimator objectAnimator;
        if (z && entityView != null) {
            ViewGroup viewGroup = (ViewGroup) entityView.getParent();
            if (this.textDimView.getParent() != null) {
                ((EntitiesContainerView) this.textDimView.getParent()).removeView(this.textDimView);
            }
            viewGroup.addView(this.textDimView, viewGroup.indexOfChild(entityView));
        }
        entityView.setSelectionVisibility(!z);
        if (z) {
            this.textDimView.setVisibility(0);
            objectAnimator = ObjectAnimator.ofFloat(this.textDimView, View.ALPHA, 0.0f, 1.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(this.textDimView, View.ALPHA, 1.0f, 0.0f);
        }
        objectAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (!z) {
                    PhotoPaintView.this.textDimView.setVisibility(8);
                    if (PhotoPaintView.this.textDimView.getParent() != null) {
                        ((EntitiesContainerView) PhotoPaintView.this.textDimView.getParent()).removeView(PhotoPaintView.this.textDimView);
                    }
                }
            }
        });
        objectAnimator.setDuration(200L);
        objectAnimator.start();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight = (AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            f = bitmap.getWidth();
            f2 = this.bitmapToEdit.getHeight();
        } else {
            f = size;
            f2 = (size2 - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
        }
        float f3 = size;
        float floor = (float) Math.floor((f3 * f2) / f);
        float f4 = currentActionBarHeight;
        if (floor > f4) {
            f3 = (float) Math.floor((f * f4) / f2);
            floor = f4;
        }
        int i3 = (int) f3;
        int i4 = (int) floor;
        this.renderView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f5 = f3 / this.paintingSize.width;
        this.baseScale = f5;
        this.entitiesView.setScaleX(f5);
        this.entitiesView.setScaleY(this.baseScale);
        this.entitiesView.measure(View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.height, 1073741824));
        this.dimView.measure(i, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, Integer.MIN_VALUE));
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            entityView.updateSelectionView();
        }
        this.selectionContainerView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.colorPicker.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
        this.toolsView.measure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        this.curtainView.measure(i, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824));
        this.backgroundView.measure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(72.0f), 1073741824));
        this.ignoreLayout = false;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = (Build.VERSION.SDK_INT < 21 || this.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i7;
        int i8 = AndroidUtilities.displaySize.y;
        AndroidUtilities.dp(48.0f);
        int ceil = (int) Math.ceil((i5 - this.renderView.getMeasuredWidth()) / 2);
        int dp = ((((i6 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - this.renderView.getMeasuredHeight()) / 2) + AndroidUtilities.dp(8.0f) + i7;
        RenderView renderView = this.renderView;
        renderView.layout(ceil, dp, renderView.getMeasuredWidth() + ceil, this.renderView.getMeasuredHeight() + dp);
        int measuredWidth = ((this.renderView.getMeasuredWidth() - this.entitiesView.getMeasuredWidth()) / 2) + ceil;
        int measuredHeight = ((this.renderView.getMeasuredHeight() - this.entitiesView.getMeasuredHeight()) / 2) + dp;
        EntitiesContainerView entitiesContainerView = this.entitiesView;
        entitiesContainerView.layout(measuredWidth, measuredHeight, entitiesContainerView.getMeasuredWidth() + measuredWidth, this.entitiesView.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.dimView;
        frameLayout.layout(0, i7, frameLayout.getMeasuredWidth(), this.dimView.getMeasuredHeight() + i7);
        FrameLayout frameLayout2 = this.selectionContainerView;
        frameLayout2.layout(ceil, dp, frameLayout2.getMeasuredWidth() + ceil, this.selectionContainerView.getMeasuredHeight() + dp);
        ColorPicker colorPicker = this.colorPicker;
        colorPicker.layout(0, currentActionBarHeight, colorPicker.getMeasuredWidth(), this.colorPicker.getMeasuredHeight() + currentActionBarHeight);
        FrameLayout frameLayout3 = this.toolsView;
        frameLayout3.layout(0, i6 - frameLayout3.getMeasuredHeight(), this.toolsView.getMeasuredWidth(), i6);
        FrameLayout frameLayout4 = this.curtainView;
        frameLayout4.layout(0, dp, frameLayout4.getMeasuredWidth(), this.curtainView.getMeasuredHeight() + dp);
        this.backgroundView.layout(0, (i6 - AndroidUtilities.dp(45.0f)) - this.backgroundView.getMeasuredHeight(), this.backgroundView.getMeasuredWidth(), i6 - AndroidUtilities.dp(45.0f));
    }

    @Override
    public void requestLayout() {
        if (!this.ignoreLayout) {
            super.requestLayout();
        }
    }

    @Override
    public boolean onEntitySelected(EntityView entityView) {
        return selectEntity(entityView);
    }

    @Override
    public boolean onEntityLongClicked(EntityView entityView) {
        showMenuForEntity(entityView);
        return true;
    }

    @Override
    public float[] getTransformedTouch(float f, float f2) {
        Point point = AndroidUtilities.displaySize;
        float[] fArr = this.temp;
        double d = f - (point.x / 2);
        double radians = (float) Math.toRadians(-this.entitiesView.getRotation());
        double cos = Math.cos(radians);
        Double.isNaN(d);
        double d2 = f2 - (point.y / 2);
        double sin = Math.sin(radians);
        Double.isNaN(d2);
        fArr[0] = ((float) ((cos * d) - (sin * d2))) + (AndroidUtilities.displaySize.x / 2);
        float[] fArr2 = this.temp;
        double sin2 = Math.sin(radians);
        Double.isNaN(d);
        double cos2 = Math.cos(radians);
        Double.isNaN(d2);
        fArr2[1] = ((float) ((d * sin2) + (d2 * cos2))) + (AndroidUtilities.displaySize.y / 2);
        return this.temp;
    }

    @Override
    public int[] getCenterLocation(EntityView entityView) {
        return getCenterLocationInWindow(entityView);
    }

    @Override
    public boolean allowInteraction(EntityView entityView) {
        return !this.editingText;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        if ((view == this.renderView || view == this.entitiesView || view == this.selectionContainerView) && this.currentCropState != null) {
            canvas.save();
            if (Build.VERSION.SDK_INT >= 21 && !this.inBubbleMode) {
                i = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            MediaController.CropState cropState = this.currentCropState;
            int i2 = cropState.transformRotation;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float scaleX = measuredWidth * cropState.cropPw * view.getScaleX();
            MediaController.CropState cropState2 = this.currentCropState;
            int i3 = (int) (scaleX / cropState2.cropScale);
            int scaleY = (int) (((measuredHeight * cropState2.cropPh) * view.getScaleY()) / this.currentCropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - i3) / 2)) + this.transformX;
            float measuredHeight2 = ((((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - scaleY) / 2) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, measuredHeight2), Math.min(ceil + i3, getMeasuredWidth()), Math.min(getMeasuredHeight(), measuredHeight2 + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    private Point centerPositionForEntity() {
        MediaController.CropState cropState;
        Size paintingSize = getPaintingSize();
        float f = paintingSize.width / 2.0f;
        float f2 = paintingSize.height / 2.0f;
        if (this.currentCropState != null) {
            float radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            double d = this.currentCropState.cropPx;
            double d2 = radians;
            double cos = Math.cos(d2);
            Double.isNaN(d);
            double d3 = d * cos;
            double d4 = this.currentCropState.cropPy;
            double sin = Math.sin(d2);
            Double.isNaN(d4);
            float f3 = (float) (d3 - (d4 * sin));
            double d5 = this.currentCropState.cropPx;
            double sin2 = Math.sin(d2);
            Double.isNaN(d5);
            double d6 = d5 * sin2;
            double d7 = this.currentCropState.cropPy;
            double cos2 = Math.cos(d2);
            Double.isNaN(d7);
            f -= f3 * paintingSize.width;
            f2 -= ((float) (d6 + (d7 * cos2))) * paintingSize.height;
        }
        return new Point(f, f2);
    }

    private Point startPositionRelativeToEntity(EntityView entityView) {
        MediaController.CropState cropState = this.currentCropState;
        float f = 200.0f;
        if (cropState != null) {
            f = 200.0f / cropState.cropScale;
        }
        if (entityView != null) {
            Point position = entityView.getPosition();
            return new Point(position.x + f, position.y + f);
        }
        float f2 = 100.0f;
        if (cropState != null) {
            f2 = 100.0f / cropState.cropScale;
        }
        Point centerPositionForEntity = centerPositionForEntity();
        while (true) {
            boolean z = false;
            for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
                View childAt = this.entitiesView.getChildAt(i);
                if (childAt instanceof EntityView) {
                    Point position2 = ((EntityView) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.x - centerPositionForEntity.x, 2.0d) + Math.pow(position2.y - centerPositionForEntity.y, 2.0d))) < f2) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return centerPositionForEntity;
            }
            centerPositionForEntity = new Point(centerPositionForEntity.x + f, centerPositionForEntity.y + f);
        }
    }

    public ArrayList<TLRPC$InputDocument> getMasks() {
        int childCount = this.entitiesView.getChildCount();
        ArrayList<TLRPC$InputDocument> arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                TLRPC$Document sticker = ((StickerView) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                TLRPC$TL_inputDocument tLRPC$TL_inputDocument = new TLRPC$TL_inputDocument();
                tLRPC$TL_inputDocument.id = sticker.id;
                tLRPC$TL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tLRPC$TL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tLRPC$TL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tLRPC$TL_inputDocument);
            }
        }
        return arrayList;
    }

    public void setTransform(float f, float f2, float f3, float f4, float f5) {
        View view;
        float f6;
        float f7;
        float f8;
        float f9;
        MediaController.CropState cropState;
        float f10;
        this.transformX = f2;
        this.transformY = f3;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                view = this.entitiesView;
            } else if (i == 1) {
                view = this.selectionContainerView;
            } else {
                view = this.renderView;
            }
            MediaController.CropState cropState2 = this.currentCropState;
            float f11 = 1.0f;
            if (cropState2 != null) {
                float f12 = cropState2.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth != 0 && measuredHeight != 0) {
                    int i2 = this.currentCropState.transformRotation;
                    if (i2 == 90 || i2 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float f13 = measuredWidth;
                    float max = Math.max(f4 / ((int) (cropState.cropPw * f13)), f5 / ((int) (cropState.cropPh * f10)));
                    f9 = f12 * max;
                    MediaController.CropState cropState3 = this.currentCropState;
                    float f14 = cropState3.cropScale;
                    f6 = (cropState3.cropPx * f13 * f * max * f14) + f2;
                    f8 = f3 + (cropState3.cropPy * measuredHeight * f * max * f14);
                    f7 = cropState3.cropRotate + i2;
                } else {
                    return;
                }
            } else {
                f6 = f2;
                f9 = i == 0 ? this.baseScale * 1.0f : 1.0f;
                f7 = 0.0f;
                f8 = f3;
            }
            float f15 = f9 * f;
            if (!Float.isNaN(f15)) {
                f11 = f15;
            }
            view.setScaleX(f11);
            view.setScaleY(f11);
            view.setTranslationX(f6);
            view.setTranslationY(f8);
            view.setRotation(f7);
            view.invalidate();
            i++;
        }
        invalidate();
    }

    public boolean selectEntity(EntityView entityView) {
        boolean z;
        EntityView entityView2 = this.currentEntityView;
        boolean z2 = true;
        if (entityView2 == null) {
            z = false;
        } else if (entityView2 == entityView) {
            if (!this.editingText) {
                showMenuForEntity(entityView2);
            }
            return true;
        } else {
            entityView2.deselect();
            z = true;
        }
        EntityView entityView3 = this.currentEntityView;
        this.currentEntityView = entityView;
        if ((entityView3 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView3).getText())) {
            lambda$registerRemovalUndo$9(entityView3);
        }
        EntityView entityView4 = this.currentEntityView;
        if (entityView4 != null) {
            entityView4.select(this.selectionContainerView);
            this.entitiesView.bringViewToFront(this.currentEntityView);
            EntityView entityView5 = this.currentEntityView;
            if (entityView5 instanceof TextPaintView) {
                setCurrentSwatch(((TextPaintView) entityView5).getSwatch(), true);
            }
        } else {
            z2 = z;
        }
        updateSettingsButton();
        return z2;
    }

    public void lambda$registerRemovalUndo$9(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2) {
            entityView2.deselect();
            if (this.editingText) {
                closeTextEnter(false);
            }
            this.currentEntityView = null;
            updateSettingsButton();
        }
        this.entitiesView.removeView(entityView);
        this.undoStore.unregisterUndo(entityView.getUUID());
    }

    private void duplicateSelectedEntity() {
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            StickerView stickerView = null;
            Point startPositionRelativeToEntity = startPositionRelativeToEntity(entityView);
            EntityView entityView2 = this.currentEntityView;
            if (entityView2 instanceof StickerView) {
                StickerView stickerView2 = new StickerView(getContext(), (StickerView) this.currentEntityView, startPositionRelativeToEntity);
                stickerView2.setDelegate(this);
                this.entitiesView.addView(stickerView2);
                stickerView = stickerView2;
            } else if (entityView2 instanceof TextPaintView) {
                TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) this.currentEntityView, startPositionRelativeToEntity);
                textPaintView.setDelegate(this);
                textPaintView.setMaxWidth((int) (getPaintingSize().width - 20.0f));
                this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
                stickerView = textPaintView;
            }
            registerRemovalUndo(stickerView);
            selectEntity(stickerView);
            updateSettingsButton();
        }
    }

    private void openStickersView() {
        StickerMasksAlert stickerMasksAlert = new StickerMasksAlert(getContext(), this.facesBitmap == null, this.resourcesProvider);
        stickerMasksAlert.setDelegate(new StickerMasksAlert.StickerMasksAlertDelegate() {
            @Override
            public final void onStickerSelected(Object obj, TLRPC$Document tLRPC$Document) {
                PhotoPaintView.this.lambda$openStickersView$7(obj, tLRPC$Document);
            }
        });
        stickerMasksAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                PhotoPaintView.this.lambda$openStickersView$8(dialogInterface);
            }
        });
        stickerMasksAlert.show();
        onOpenCloseStickersAlert(true);
    }

    public void lambda$openStickersView$7(Object obj, TLRPC$Document tLRPC$Document) {
        createSticker(obj, tLRPC$Document, true);
    }

    public void lambda$openStickersView$8(DialogInterface dialogInterface) {
        onOpenCloseStickersAlert(false);
    }

    private Size baseStickerSize() {
        double d = getPaintingSize().width;
        Double.isNaN(d);
        float floor = (float) Math.floor(d * 0.5d);
        return new Size(floor, floor);
    }

    private void registerRemovalUndo(final EntityView entityView) {
        this.undoStore.registerUndo(entityView.getUUID(), new Runnable() {
            @Override
            public final void run() {
                PhotoPaintView.this.lambda$registerRemovalUndo$9(entityView);
            }
        });
    }

    private StickerView createSticker(Object obj, TLRPC$Document tLRPC$Document, boolean z) {
        StickerPosition calculateStickerPosition = calculateStickerPosition(tLRPC$Document);
        StickerView stickerView = new StickerView(getContext(), calculateStickerPosition.position, calculateStickerPosition.angle, calculateStickerPosition.scale, baseStickerSize(), tLRPC$Document, obj) {
            @Override
            protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                PhotoPaintView.this.didSetAnimatedSticker(rLottieDrawable);
            }
        };
        stickerView.setDelegate(this);
        this.entitiesView.addView(stickerView);
        if (z) {
            registerRemovalUndo(stickerView);
            selectEntity(stickerView);
        }
        return stickerView;
    }

    public void mirrorSticker() {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof StickerView) {
            ((StickerView) entityView).mirror();
        }
    }

    private TextPaintView createText(boolean z) {
        Swatch swatch;
        onTextAdd();
        Swatch swatch2 = this.colorPicker.getSwatch();
        int i = this.selectedTextType;
        if (i == 0) {
            swatch = new Swatch(-16777216, 0.85f, swatch2.brushWeight);
        } else if (i == 1) {
            swatch = new Swatch(-1, 1.0f, swatch2.brushWeight);
        } else {
            swatch = new Swatch(-1, 1.0f, swatch2.brushWeight);
        }
        Size paintingSize = getPaintingSize();
        TextPaintView textPaintView = new TextPaintView(getContext(), startPositionRelativeToEntity(null), (int) (paintingSize.width / 9.0f), "", swatch, this.selectedTextType);
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth((int) (paintingSize.width - 20.0f));
        this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            textPaintView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(textPaintView);
            selectEntity(textPaintView);
            editSelectedTextEntity();
        }
        setCurrentSwatch(swatch, true);
        return textPaintView;
    }

    private void editSelectedTextEntity() {
        if ((this.currentEntityView instanceof TextPaintView) && !this.editingText) {
            this.curtainView.setVisibility(0);
            TextPaintView textPaintView = (TextPaintView) this.currentEntityView;
            this.initialText = textPaintView.getText();
            this.editingText = true;
            this.editedTextPosition = textPaintView.getPosition();
            this.editedTextRotation = textPaintView.getRotation();
            this.editedTextScale = textPaintView.getScale();
            textPaintView.setPosition(centerPositionForEntity());
            MediaController.CropState cropState = this.currentCropState;
            if (cropState != null) {
                textPaintView.setRotation(-(cropState.transformRotation + cropState.cropRotate));
                textPaintView.setScale(1.0f / this.currentCropState.cropScale);
            } else {
                textPaintView.setRotation(0.0f);
                textPaintView.setScale(1.0f);
            }
            this.toolsView.setVisibility(8);
            setTextDimVisibility(true, textPaintView);
            textPaintView.beginEditing();
            View focusedView = textPaintView.getFocusedView();
            focusedView.requestFocus();
            AndroidUtilities.showKeyboard(focusedView);
        }
    }

    public void closeTextEnter(boolean z) {
        if (this.editingText) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                TextPaintView textPaintView = (TextPaintView) entityView;
                this.toolsView.setVisibility(0);
                AndroidUtilities.hideKeyboard(textPaintView.getFocusedView());
                textPaintView.getFocusedView().clearFocus();
                textPaintView.endEditing();
                if (!z) {
                    textPaintView.setText(this.initialText);
                }
                if (textPaintView.getText().trim().length() == 0) {
                    this.entitiesView.removeView(textPaintView);
                    selectEntity(null);
                } else {
                    textPaintView.setPosition(this.editedTextPosition);
                    textPaintView.setRotation(this.editedTextRotation);
                    textPaintView.setScale(this.editedTextScale);
                    this.editedTextPosition = null;
                    this.editedTextRotation = 0.0f;
                    this.editedTextScale = 0.0f;
                }
                setTextDimVisibility(false, textPaintView);
                this.editingText = false;
                this.initialText = null;
                this.curtainView.setVisibility(8);
            }
        }
    }

    private void setBrush(int i) {
        RenderView renderView = this.renderView;
        Brush[] brushArr = this.brushes;
        this.currentBrush = i;
        renderView.setBrush(brushArr[i]);
    }

    private void setType(int i) {
        this.selectedTextType = i;
        if (this.currentEntityView instanceof TextPaintView) {
            Swatch swatch = this.colorPicker.getSwatch();
            if (i == 0 && swatch.color == -1) {
                setCurrentSwatch(new Swatch(-16777216, 0.85f, swatch.brushWeight), true);
            } else if ((i == 1 || i == 2) && swatch.color == -16777216) {
                setCurrentSwatch(new Swatch(-1, 1.0f, swatch.brushWeight), true);
            }
            ((TextPaintView) this.currentEntityView).setType(i);
        }
    }

    private int[] getCenterLocationInWindow(View view) {
        view.getLocationInWindow(this.pos);
        float rotation = view.getRotation();
        MediaController.CropState cropState = this.currentCropState;
        float f = cropState != null ? cropState.cropRotate + cropState.transformRotation : 0.0f;
        double width = view.getWidth() * view.getScaleX() * this.entitiesView.getScaleX();
        double radians = (float) Math.toRadians(rotation + f);
        double cos = Math.cos(radians);
        Double.isNaN(width);
        double height = view.getHeight() * view.getScaleY() * this.entitiesView.getScaleY();
        double sin = Math.sin(radians);
        Double.isNaN(height);
        float f2 = (float) ((cos * width) - (sin * height));
        double sin2 = Math.sin(radians);
        Double.isNaN(width);
        double cos2 = Math.cos(radians);
        Double.isNaN(height);
        int[] iArr = this.pos;
        iArr[0] = (int) (iArr[0] + (f2 / 2.0f));
        iArr[1] = (int) (iArr[1] + (((float) ((width * sin2) + (height * cos2))) / 2.0f));
        return iArr;
    }

    @Override
    public float getCropRotation() {
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    private void showMenuForEntity(final EntityView entityView) {
        int[] centerLocationInWindow = getCenterLocationInWindow(entityView);
        showPopup(new Runnable() {
            @Override
            public final void run() {
                PhotoPaintView.this.lambda$showMenuForEntity$13(entityView);
            }
        }, this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f));
    }

    public void lambda$showMenuForEntity$13(final EntityView entityView) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        TextView textView = new TextView(getContext());
        textView.setTextColor(getThemedColor("actionBarDefaultSubmenuItem"));
        textView.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        textView.setGravity(16);
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 18.0f);
        textView.setTag(0);
        textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$showMenuForEntity$10(entityView, view);
            }
        });
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 48));
        if (entityView instanceof TextPaintView) {
            TextView textView2 = new TextView(getContext());
            textView2.setTextColor(getThemedColor("actionBarDefaultSubmenuItem"));
            textView2.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            textView2.setGravity(16);
            textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView2.setTextSize(1, 18.0f);
            textView2.setTag(1);
            textView2.setText(LocaleController.getString("PaintEdit", R.string.PaintEdit));
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoPaintView.this.lambda$showMenuForEntity$11(view);
                }
            });
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 48));
        }
        TextView textView3 = new TextView(getContext());
        textView3.setTextColor(getThemedColor("actionBarDefaultSubmenuItem"));
        textView3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        textView3.setGravity(16);
        textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView3.setTextSize(1, 18.0f);
        textView3.setTag(2);
        textView3.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$showMenuForEntity$12(view);
            }
        });
        linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 48));
        this.popupLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        linearLayout.setLayoutParams(layoutParams);
    }

    public void lambda$showMenuForEntity$10(EntityView entityView, View view) {
        lambda$registerRemovalUndo$9(entityView);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
        }
    }

    public void lambda$showMenuForEntity$11(View view) {
        editSelectedTextEntity();
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
        }
    }

    public void lambda$showMenuForEntity$12(View view) {
        duplicateSelectedEntity();
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
        }
    }

    private LinearLayout buttonForBrush(final int i, int i2, String str, boolean z) {
        LinearLayout linearLayout = new LinearLayout(this, getContext()) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        int i3 = 0;
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$buttonForBrush$14(i, view);
            }
        });
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(i2);
        imageView.setColorFilter(getThemedColor("actionBarDefaultSubmenuItem"));
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
        TextView textView = new TextView(getContext());
        textView.setTextColor(getThemedColor("actionBarDefaultSubmenuItem"));
        textView.setTextSize(1, 16.0f);
        textView.setText(str);
        textView.setMinWidth(AndroidUtilities.dp(70.0f));
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setImageResource(R.drawable.msg_text_check);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor("radioBackgroundChecked"), PorterDuff.Mode.MULTIPLY));
        if (!z) {
            i3 = 4;
        }
        imageView2.setVisibility(i3);
        linearLayout.addView(imageView2, LayoutHelper.createLinear(50, -1));
        return linearLayout;
    }

    public void lambda$buttonForBrush$14(int i, View view) {
        setBrush(i);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
        }
    }

    public void showBrushSettings() {
        showPopup(new Runnable() {
            @Override
            public final void run() {
                PhotoPaintView.this.lambda$showBrushSettings$15();
            }
        }, this, 85, 0, AndroidUtilities.dp(48.0f));
    }

    public void lambda$showBrushSettings$15() {
        boolean z = false;
        this.popupLayout.addView((View) buttonForBrush(0, R.drawable.msg_draw_pen, LocaleController.getString("PaintPen", R.string.PaintPen), this.currentBrush == 0), LayoutHelper.createLinear(-1, 54));
        this.popupLayout.addView((View) buttonForBrush(1, R.drawable.msg_draw_marker, LocaleController.getString("PaintMarker", R.string.PaintMarker), this.currentBrush == 1), LayoutHelper.createLinear(-1, 54));
        this.popupLayout.addView((View) buttonForBrush(2, R.drawable.msg_draw_neon, LocaleController.getString("PaintNeon", R.string.PaintNeon), this.currentBrush == 2), LayoutHelper.createLinear(-1, 54));
        String string = LocaleController.getString("PaintArrow", R.string.PaintArrow);
        if (this.currentBrush == 3) {
            z = true;
        }
        this.popupLayout.addView((View) buttonForBrush(3, R.drawable.msg_draw_arrow, string, z), LayoutHelper.createLinear(-1, 54));
    }

    private LinearLayout buttonForText(final int i, String str, int i2, boolean z) {
        LinearLayout linearLayout = new LinearLayout(this, getContext()) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return true;
            }
        };
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PhotoPaintView.this.lambda$buttonForText$16(i, view);
            }
        });
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(i2);
        imageView.setColorFilter(getThemedColor("actionBarDefaultSubmenuItem"));
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
        TextView textView = new TextView(getContext());
        textView.setTextColor(getThemedColor("actionBarDefaultSubmenuItem"));
        textView.setTextSize(1, 16.0f);
        textView.setText(str);
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
        if (z) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(R.drawable.msg_text_check);
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor("radioBackgroundChecked"), PorterDuff.Mode.MULTIPLY));
            linearLayout.addView(imageView2, LayoutHelper.createLinear(50, -1));
        }
        return linearLayout;
    }

    public void lambda$buttonForText$16(int i, View view) {
        setType(i);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss(true);
        }
    }

    public void showTextSettings() {
        showPopup(new Runnable() {
            @Override
            public final void run() {
                PhotoPaintView.this.lambda$showTextSettings$17();
            }
        }, this, 85, 0, AndroidUtilities.dp(48.0f));
    }

    public void lambda$showTextSettings$17() {
        int i;
        String str;
        for (int i2 = 0; i2 < 3; i2++) {
            boolean z = true;
            if (i2 == 0) {
                str = LocaleController.getString("PaintOutlined", R.string.PaintOutlined);
                i = R.drawable.msg_text_outlined;
            } else if (i2 == 1) {
                str = LocaleController.getString("PaintRegular", R.string.PaintRegular);
                i = R.drawable.msg_text_regular;
            } else {
                str = LocaleController.getString("PaintFramed", R.string.PaintFramed);
                i = R.drawable.msg_text_framed;
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
            if (this.selectedTextType != i2) {
                z = false;
            }
            actionBarPopupWindowLayout.addView((View) buttonForText(i2, str, i, z), LayoutHelper.createLinear(-1, 48));
        }
    }

    private void showPopup(Runnable runnable, View view, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            if (this.popupLayout == null) {
                this.popupRect = new Rect();
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext());
                this.popupLayout = actionBarPopupWindowLayout;
                actionBarPopupWindowLayout.setAnimationEnabled(false);
                this.popupLayout.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        boolean lambda$showPopup$18;
                        lambda$showPopup$18 = PhotoPaintView.this.lambda$showPopup$18(view2, motionEvent);
                        return lambda$showPopup$18;
                    }
                });
                this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                    @Override
                    public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                        PhotoPaintView.this.lambda$showPopup$19(keyEvent);
                    }
                });
                this.popupLayout.setShownFromBottom(true);
            }
            this.popupLayout.removeInnerViews();
            runnable.run();
            if (this.popupWindow == null) {
                ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout, -2, -2);
                this.popupWindow = actionBarPopupWindow2;
                actionBarPopupWindow2.setAnimationEnabled(false);
                this.popupWindow.setAnimationStyle(R.style.PopupAnimation);
                this.popupWindow.setOutsideTouchable(true);
                this.popupWindow.setClippingEnabled(true);
                this.popupWindow.setInputMethodMode(2);
                this.popupWindow.setSoftInputMode(0);
                this.popupWindow.getContentView().setFocusableInTouchMode(true);
                this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        PhotoPaintView.this.lambda$showPopup$20();
                    }
                });
            }
            this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
            this.popupWindow.setFocusable(true);
            if ((i & 48) != 0) {
                i2 -= this.popupLayout.getMeasuredWidth() / 2;
                i3 -= this.popupLayout.getMeasuredHeight();
            }
            this.popupWindow.showAtLocation(view, i, i2, i3);
            this.popupWindow.startAnimation();
            return;
        }
        this.popupWindow.dismiss();
    }

    public boolean lambda$showPopup$18(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.popupRect);
        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.popupWindow.dismiss();
        return false;
    }

    public void lambda$showPopup$19(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    public void lambda$showPopup$20() {
        this.popupLayout.removeInnerViews();
    }

    private int getFrameRotation() {
        int i = this.originalBitmapRotation;
        if (i == 90) {
            return 1;
        }
        if (i != 180) {
            return i != 270 ? 0 : 3;
        }
        return 2;
    }

    private boolean isSidewardOrientation() {
        int i = this.originalBitmapRotation;
        return i % 360 == 90 || i % 360 == 270;
    }

    private void detectFaces() {
        this.queue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                PhotoPaintView.this.lambda$detectFaces$21();
            }
        });
    }

    public void lambda$detectFaces$21() {
        int i;
        FaceDetector faceDetector = null;
        try {
            try {
                faceDetector = new FaceDetector.Builder(getContext()).setMode(1).setLandmarkType(1).setTrackingEnabled(false).build();
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                    return;
                }
            }
            if (!faceDetector.isOperational()) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e("face detection is not operational");
                }
                faceDetector.release();
                return;
            }
            try {
                SparseArray<Face> detect = faceDetector.detect(new Frame.Builder().setBitmap(this.facesBitmap).setRotation(getFrameRotation()).build());
                ArrayList<PhotoFace> arrayList = new ArrayList<>();
                Size paintingSize = getPaintingSize();
                for (i = 0; i < detect.size(); i++) {
                    PhotoFace photoFace = new PhotoFace(detect.get(detect.keyAt(i)), this.facesBitmap, paintingSize, isSidewardOrientation());
                    if (photoFace.isSufficient()) {
                        arrayList.add(photoFace);
                    }
                }
                this.faces = arrayList;
                faceDetector.release();
            } catch (Throwable th) {
                FileLog.e(th);
                faceDetector.release();
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                faceDetector.release();
            }
            throw th2;
        }
    }

    private StickerPosition calculateStickerPosition(TLRPC$Document tLRPC$Document) {
        TLRPC$TL_maskCoords tLRPC$TL_maskCoords;
        float f;
        ArrayList<PhotoFace> arrayList;
        int i;
        PhotoFace randomFaceWithVacantAnchor;
        int i2 = 0;
        while (true) {
            if (i2 >= tLRPC$Document.attributes.size()) {
                tLRPC$TL_maskCoords = null;
                break;
            }
            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i2);
            if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeSticker) {
                tLRPC$TL_maskCoords = tLRPC$DocumentAttribute.mask_coords;
                break;
            }
            i2++;
        }
        MediaController.CropState cropState = this.currentCropState;
        float f2 = 0.75f;
        if (cropState != null) {
            f = -(cropState.transformRotation + cropState.cropRotate);
            f2 = 0.75f / cropState.cropScale;
        } else {
            f = 0.0f;
        }
        StickerPosition stickerPosition = new StickerPosition(centerPositionForEntity(), f2, f);
        if (tLRPC$TL_maskCoords == null || (arrayList = this.faces) == null || arrayList.size() == 0 || (randomFaceWithVacantAnchor = getRandomFaceWithVacantAnchor((i = tLRPC$TL_maskCoords.n), tLRPC$Document.id, tLRPC$TL_maskCoords)) == null) {
            return stickerPosition;
        }
        Point pointForAnchor = randomFaceWithVacantAnchor.getPointForAnchor(i);
        float widthForAnchor = randomFaceWithVacantAnchor.getWidthForAnchor(i);
        float angle = randomFaceWithVacantAnchor.getAngle();
        double d = widthForAnchor / baseStickerSize().width;
        double d2 = tLRPC$TL_maskCoords.zoom;
        Double.isNaN(d);
        double radians = (float) Math.toRadians(angle);
        Double.isNaN(radians);
        double d3 = 1.5707963267948966d - radians;
        double sin = Math.sin(d3);
        double d4 = widthForAnchor;
        Double.isNaN(d4);
        double cos = Math.cos(d3);
        Double.isNaN(d4);
        Double.isNaN(radians);
        double d5 = radians + 1.5707963267948966d;
        double cos2 = Math.cos(d5);
        Double.isNaN(d4);
        double sin2 = Math.sin(d5);
        Double.isNaN(d4);
        return new StickerPosition(new Point(pointForAnchor.x + ((float) (sin * d4 * tLRPC$TL_maskCoords.x)) + ((float) (cos2 * d4 * tLRPC$TL_maskCoords.y)), pointForAnchor.y + ((float) (cos * d4 * tLRPC$TL_maskCoords.x)) + ((float) (sin2 * d4 * tLRPC$TL_maskCoords.y))), (float) (d * d2), angle);
    }

    private PhotoFace getRandomFaceWithVacantAnchor(int i, long j, TLRPC$TL_maskCoords tLRPC$TL_maskCoords) {
        if (i >= 0 && i <= 3 && !this.faces.isEmpty()) {
            int size = this.faces.size();
            int nextInt = Utilities.random.nextInt(size);
            for (int i2 = size; i2 > 0; i2--) {
                PhotoFace photoFace = this.faces.get(nextInt);
                if (!isFaceAnchorOccupied(photoFace, i, j, tLRPC$TL_maskCoords)) {
                    return photoFace;
                }
                nextInt = (nextInt + 1) % size;
            }
        }
        return null;
    }

    private boolean isFaceAnchorOccupied(PhotoFace photoFace, int i, long j, TLRPC$TL_maskCoords tLRPC$TL_maskCoords) {
        Point pointForAnchor = photoFace.getPointForAnchor(i);
        if (pointForAnchor == null) {
            return true;
        }
        float widthForAnchor = photoFace.getWidthForAnchor(0) * 1.1f;
        for (int i2 = 0; i2 < this.entitiesView.getChildCount(); i2++) {
            View childAt = this.entitiesView.getChildAt(i2);
            if (childAt instanceof StickerView) {
                StickerView stickerView = (StickerView) childAt;
                if (stickerView.getAnchor() != i) {
                    continue;
                } else {
                    Point position = stickerView.getPosition();
                    float hypot = (float) Math.hypot(position.x - pointForAnchor.x, position.y - pointForAnchor.y);
                    if ((j == stickerView.getSticker().id || this.faces.size() > 1) && hypot < widthForAnchor) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public static class StickerPosition {
        private float angle;
        private Point position;
        private float scale;

        StickerPosition(Point point, float f, float f2) {
            this.position = point;
            this.scale = f;
            this.angle = f2;
        }
    }
}

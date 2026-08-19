package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ChatActivityEnterViewAnimatedIconView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.IPhotoPaintView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.Paint.PaintTypeface;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.PhotoFace;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.Swatch;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;

public abstract class LPhotoPaintView extends SizeNotifierFrameLayoutPhoto implements IPhotoPaintView, PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, NotificationCenter.NotificationCenterDelegate {
    private float baseScale;
    private Bitmap bitmapToEdit;
    private BlurredBackgroundDrawable blurredBackgroundDrawableForTools;
    public FrameLayout bottomLayout;
    private boolean bottomPanelIgnoreOnce;
    public PaintCancelView cancelButton;
    private TextView cancelTextButton;
    private final Paint clearPaint;
    private Paint colorPickerRainbowPaint;
    private Swatch colorSwatch;
    private Paint colorSwatchOutlinePaint;
    private Paint colorSwatchPaint;
    private PaintColorsListView colorsListView;
    private int currentAccount;
    private MediaController.CropState currentCropState;
    private EntityView currentEntityView;
    private boolean destroyed;
    public PaintDoneView doneButton;
    private TextView doneTextButton;
    private boolean drawShadow;
    private TextView drawTab;
    private boolean editingText;
    private int emojiPadding;
    private EmojiView emojiView;
    public boolean emojiViewVisible;
    public boolean emojiViewWasVisible;
    private int emojiWasPadding;
    public EntitiesContainerView entitiesView;
    private ArrayList faces;
    private Bitmap facesBitmap;
    private boolean fillShapes;
    private boolean ignoreLayout;
    private boolean ignoreToolChangeAnimationOnce;
    private float imageHeight;
    private float imageWidth;
    private boolean inBubbleMode;
    private float inputTransformX;
    private float inputTransformY;
    public boolean isAnimatePopupClosing;
    private boolean isColorListShown;
    private boolean isTypefaceMenuShown;
    private int keyboardHeight;
    private int keyboardHeightLand;
    public boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private BigInteger lcm;
    private Matrix matrix;
    private float offsetTranslationY;
    private Runnable onDoneButtonClickedListener;
    private Runnable openKeyboardRunnable;
    private int originalBitmapRotation;
    public FrameLayout overlayLayout;
    private PaintToolsView paintToolsView;
    private Size paintingSize;
    private final PersistColorPalette palette;
    private float panTranslationProgress;
    private float panTranslationY;
    private float pany;
    private FrameLayout pipetteContainerLayout;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int[] pos2;
    private float[] position;
    private DispatchQueue queue;
    private View renderInputView;
    private RenderView renderView;
    private Theme.ResourcesProvider resourcesProvider;
    private float scale;
    private int selectedTextType;
    private FrameLayout selectionContainerView;
    private final AnimatedFloat shadowAlpha;
    private final Paint shadowPaint;
    private TextView stickerTab;
    public LinearLayout tabsLayout;
    private int tabsNewSelectedIndex;
    private int tabsSelectedIndex;
    private ValueAnimator tabsSelectionAnimator;
    private float tabsSelectionProgress;
    public PaintTextOptionsView textOptionsView;
    private TextView textTab;
    private ThanosEffect thanosEffect;
    private Paint toolsPaint;
    private SpringAnimation toolsTransformAnimation;
    private float toolsTransformProgress;
    private FrameLayout topLayout;
    private float transformX;
    private float transformY;
    private boolean translateBottomPanelAfterResize;
    private PaintTypefaceListView typefaceListView;
    private Paint typefaceMenuBackgroundPaint;
    private Paint typefaceMenuOutlinePaint;
    private SpringAnimation typefaceMenuTransformAnimation;
    private float typefaceMenuTransformProgress;
    private TextView undoAllButton;
    private ImageView undoButton;
    private UndoStore undoStore;
    private boolean waitingForKeyboardOpen;
    public PaintWeightChooserView weightChooserView;
    private PaintWeightChooserView.ValueOverride weightDefaultValueOverride;
    private LinearLayout zoomOutButton;
    private ImageView zoomOutImage;
    private TextView zoomOutText;
    private boolean zoomOutVisible;

    public static void $r8$lambda$4aiZhvQC2GURrN6CN5KcEZfpOL4() {
    }

    private void bottomPanelTranslationY(float f, float f2) {
    }

    protected abstract void didSetAnimatedSticker(RLottieDrawable rLottieDrawable);

    protected int getPKeyboardHeight() {
        return 0;
    }

    public View getView() {
        return IPhotoPaintView.CC.$default$getView(this);
    }

    @Override
    public boolean isEntityDeletable() {
        return EntityView.EntityViewDelegate.CC.$default$isEntityDeletable(this);
    }

    protected abstract void onEmojiViewCloseByClick();

    @Override
    public void onEntityDragEnd(boolean z) {
        EntityView.EntityViewDelegate.CC.$default$onEntityDragEnd(this, z);
    }

    @Override
    public void onEntityDragMultitouchEnd() {
        EntityView.EntityViewDelegate.CC.$default$onEntityDragMultitouchEnd(this);
    }

    @Override
    public void onEntityDragMultitouchStart() {
        EntityView.EntityViewDelegate.CC.$default$onEntityDragMultitouchStart(this);
    }

    @Override
    public void onEntityDragStart() {
        EntityView.EntityViewDelegate.CC.$default$onEntityDragStart(this);
    }

    @Override
    public void onEntityDragTrash(boolean z) {
        EntityView.EntityViewDelegate.CC.$default$onEntityDragTrash(this, z);
    }

    @Override
    public void onEntityDraggedBottom(boolean z) {
        EntityView.EntityViewDelegate.CC.$default$onEntityDraggedBottom(this, z);
    }

    @Override
    public void onEntityDraggedTop(boolean z) {
        EntityView.EntityViewDelegate.CC.$default$onEntityDraggedTop(this, z);
    }

    @Override
    public void onEntityHandleTouched() {
        EntityView.EntityViewDelegate.CC.$default$onEntityHandleTouched(this);
    }

    protected abstract void onOpenCloseStickersAlert(boolean z);

    protected abstract void onTextAdd();

    protected abstract void updateKeyboard();

    public LPhotoPaintView(final Context context, Activity activity, final int i, Bitmap bitmap, final Bitmap bitmap2, int i2, ArrayList arrayList, MediaController.CropState cropState, final Runnable runnable, final Theme.ResourcesProvider resourcesProvider) {
        float f;
        int i3;
        Emoji.EmojiSpan[] emojiSpanArr;
        StickerView stickerView;
        super(context, activity, true);
        byte b = 1;
        boolean z = false;
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        this.weightDefaultValueOverride = new PaintWeightChooserView.ValueOverride() {
            @Override
            public float get() {
                Brush currentBrush = LPhotoPaintView.this.renderView.getCurrentBrush();
                return currentBrush == null ? PersistColorPalette.getInstance(LPhotoPaintView.this.currentAccount).getCurrentWeight() : PersistColorPalette.getInstance(LPhotoPaintView.this.currentAccount).getWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(currentBrush)), currentBrush.getDefaultWeight());
            }

            @Override
            public void set(float f2) {
                PersistColorPalette.getInstance(LPhotoPaintView.this.currentAccount).setWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(LPhotoPaintView.this.renderView.getCurrentBrush())), f2);
                LPhotoPaintView.this.colorSwatch.brushWeight = f2;
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                lPhotoPaintView.setCurrentSwatch(lPhotoPaintView.colorSwatch, true);
            }
        };
        this.typefaceMenuOutlinePaint = new Paint(1);
        this.typefaceMenuBackgroundPaint = new Paint(1);
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        this.colorSwatchOutlinePaint = new Paint(1);
        this.colorSwatch = new Swatch(-1, 1.0f, 0.016773745f);
        this.fillShapes = false;
        this.toolsPaint = new Paint(1);
        this.zoomOutVisible = false;
        this.shadowAlpha = new AnimatedFloat(this, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.shadowPaint = new Paint(1);
        Paint paint = new Paint(1);
        this.clearPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.matrix = new Matrix();
        byte b2 = 2;
        this.position = new float[2];
        this.pos2 = new int[2];
        this.openKeyboardRunnable = new Runnable() {
            @Override
            public void run() {
                if (LPhotoPaintView.this.currentEntityView instanceof TextPaintView) {
                    EditTextOutline editText = ((TextPaintView) LPhotoPaintView.this.currentEntityView).getEditText();
                    if (LPhotoPaintView.this.destroyed || editText == null || !LPhotoPaintView.this.waitingForKeyboardOpen || LPhotoPaintView.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editText.requestFocus();
                    AndroidUtilities.showKeyboard(editText);
                    AndroidUtilities.cancelRunOnUIThread(LPhotoPaintView.this.openKeyboardRunnable);
                    AndroidUtilities.runOnUIThread(LPhotoPaintView.this.openKeyboardRunnable, 100L);
                }
            }
        };
        setDelegate(this);
        this.currentAccount = i;
        this.resourcesProvider = new Theme.ResourcesProvider() {
            @Override
            public void applyServiceShaderMatrix(int i4, int i5, float f2, float f3) {
                Theme.applyServiceShaderMatrix(i4, i5, f2, f3);
            }

            @Override
            public ColorFilter getAnimatedEmojiColorFilter() {
                return Theme.chat_animatedEmojiTextColorFilter;
            }

            @Override
            public final int getColor(int i4) {
                return LPhotoPaintView.$r8$lambda$6i0NVTYBdNPKqzxlYpb8bUqDG9g(resourcesProvider, i4);
            }

            @Override
            public int getColorOrDefault(int i4) {
                return getColor(i4);
            }

            @Override
            public int getCurrentColor(int i4) {
                return getColor(i4);
            }

            @Override
            public Drawable getDrawable(String str) {
                return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
            }

            @Override
            public Paint getPaint(String str) {
                return Theme.getThemePaint(str);
            }

            @Override
            public boolean hasGradientService() {
                return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
            }

            @Override
            public boolean isDark() {
                return Theme.isCurrentThemeDark();
            }

            @Override
            public void setAnimatedColor(int i4, int i5) {
                Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i4, i5);
            }
        };
        this.currentCropState = cropState;
        this.inBubbleMode = context instanceof BubbleActivity;
        PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
        this.palette = persistColorPalette;
        persistColorPalette.resetCurrentColor();
        this.colorSwatch.color = persistColorPalette.getCurrentColor();
        this.colorSwatch.brushWeight = persistColorPalette.getCurrentWeight();
        this.queue = new DispatchQueue("Paint");
        this.bitmapToEdit = bitmap;
        this.facesBitmap = bitmap2;
        this.originalBitmapRotation = i2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.setDelegate(new UndoStore.UndoStoreDelegate() {
            @Override
            public final void historyChanged() {
                LPhotoPaintView.$r8$lambda$dtkhRj7d3HqR1LLXztAMQIzmqgg(this.f$0);
            }
        });
        RenderView renderView = new RenderView(context, new Painting(getPaintingSize(), bitmap2, i2, null), this.bitmapToEdit, null, null) {
            @Override
            public void selectBrush(Brush brush) {
                int iIndexOf = Brush.BRUSHES_LIST.indexOf(brush);
                int i4 = iIndexOf + 1;
                if (i4 <= 1 || bitmap2 != null) {
                    iIndexOf = i4;
                }
                LPhotoPaintView.this.paintToolsView.select(iIndexOf);
                LPhotoPaintView.this.onBrushSelected(brush);
            }
        };
        this.renderView = renderView;
        renderView.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public void onFirstDraw() {
                runnable.run();
            }

            @Override
            public void onBeganDrawing() {
                if (LPhotoPaintView.this.currentEntityView != null) {
                    LPhotoPaintView.this.selectEntity(null);
                }
                LPhotoPaintView.this.weightChooserView.setViewHidden(true);
            }

            @Override
            public void onFinishedDrawing(boolean z2) {
                LPhotoPaintView.this.undoStore.getDelegate().historyChanged();
                LPhotoPaintView.this.weightChooserView.setViewHidden(false);
            }

            @Override
            public boolean shouldDraw() {
                boolean z2 = LPhotoPaintView.this.currentEntityView == null;
                if (!z2) {
                    LPhotoPaintView.this.selectEntity(null);
                }
                return z2;
            }

            @Override
            public void invalidateInputView() {
                if (LPhotoPaintView.this.renderInputView != null) {
                    LPhotoPaintView.this.renderInputView.invalidate();
                }
            }

            @Override
            public void resetBrush() {
                if (LPhotoPaintView.this.ignoreToolChangeAnimationOnce) {
                    LPhotoPaintView.this.ignoreToolChangeAnimationOnce = false;
                } else {
                    LPhotoPaintView.this.paintToolsView.select(1);
                    LPhotoPaintView.this.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                }
            }
        });
        this.renderView.setUndoStore(this.undoStore);
        this.renderView.setQueue(this.queue);
        this.renderView.setVisibility(4);
        addView(this.renderView, LayoutHelper.createFrame(-1, -1, 51));
        View view = new View(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (LPhotoPaintView.this.renderView != null) {
                    LPhotoPaintView.this.renderView.onDrawForInput(canvas);
                }
            }
        };
        this.renderInputView = view;
        view.setVisibility(4);
        addView(this.renderInputView, LayoutHelper.createFrame(-1, -1, 51));
        EntitiesContainerView entitiesContainerView = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() {
            @Override
            public EntityView onSelectedEntityRequest() {
                return LPhotoPaintView.this.currentEntityView;
            }

            @Override
            public void onEntityDeselect() {
                LPhotoPaintView.this.selectEntity(null);
            }
        }) {
            long lastUpdate;
            Paint linePaint = new Paint();
            float stickyXAlpha;
            float stickyYAlpha;

            {
                setWillNotDraw(false);
                this.linePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.linePaint.setStyle(Paint.Style.STROKE);
                this.linePaint.setColor(-1);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                int stickyX;
                int stickyY;
                float f2;
                float f3;
                super.onDraw(canvas);
                long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                if (LPhotoPaintView.this.currentEntityView != null && LPhotoPaintView.this.currentEntityView.hasTouchDown() && LPhotoPaintView.this.currentEntityView.hasPanned()) {
                    stickyX = LPhotoPaintView.this.currentEntityView.getStickyX();
                    stickyY = LPhotoPaintView.this.currentEntityView.getStickyY();
                } else {
                    stickyX = 0;
                    stickyY = 0;
                }
                if (stickyX != 0) {
                    float f4 = this.stickyXAlpha;
                    if (f4 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, f4 + (jMin / 150.0f));
                        invalidate();
                    } else if (stickyX == 0) {
                        f2 = this.stickyXAlpha;
                        if (f2 != 0.0f) {
                            this.stickyXAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyX == 0) {
                    f2 = this.stickyXAlpha;
                    if (f2 != 0.0f) {
                        this.stickyXAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                if (stickyY != 0) {
                    float f5 = this.stickyYAlpha;
                    if (f5 != 1.0f) {
                        this.stickyYAlpha = Math.min(1.0f, f5 + (jMin / 150.0f));
                        invalidate();
                    } else if (stickyY == 0) {
                        f3 = this.stickyYAlpha;
                        if (f3 != 0.0f) {
                            this.stickyYAlpha = Math.max(0.0f, f3 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyY == 0) {
                    f3 = this.stickyYAlpha;
                    if (f3 != 0.0f) {
                        this.stickyYAlpha = Math.max(0.0f, f3 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                float f6 = this.stickyYAlpha;
                if (f6 != 0.0f) {
                    this.linePaint.setAlpha((int) (f6 * 255.0f));
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    canvas.drawLine(0.0f, measuredHeight, getMeasuredWidth(), measuredHeight, this.linePaint);
                }
                float f7 = this.stickyXAlpha;
                if (f7 != 0.0f) {
                    this.linePaint.setAlpha((int) (f7 * 255.0f));
                    float measuredWidth = getMeasuredWidth() / 2.0f;
                    canvas.drawLine(measuredWidth, 0.0f, measuredWidth, getMeasuredHeight(), this.linePaint);
                }
            }
        };
        this.entitiesView = entitiesContainerView;
        addView(entitiesContainerView);
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i4);
                byte b3 = mediaEntity.type;
                if (b3 == 0) {
                    f = 1.0f;
                    StickerView stickerViewCreateSticker = createSticker(mediaEntity.parentObject, mediaEntity.document, z);
                    if ((mediaEntity.subType & b2) != 0) {
                        stickerViewCreateSticker.mirror();
                    }
                    ViewGroup.LayoutParams layoutParams = stickerViewCreateSticker.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i3 = size;
                    stickerView = stickerViewCreateSticker;
                } else {
                    f = 1.0f;
                    if (b3 == b) {
                        TextPaintView textPaintViewCreateText = createText(z);
                        textPaintViewCreateText.setType(mediaEntity.subType);
                        textPaintViewCreateText.setTypeface(mediaEntity.textTypeface);
                        textPaintViewCreateText.setBaseFontSize(mediaEntity.fontSize);
                        SpannableString spannableString = new SpannableString(mediaEntity.text);
                        ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                        int size2 = arrayList2.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i5);
                            int i6 = size;
                            AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiEntity.document_id, textPaintViewCreateText.getFontMetricsInt());
                            int i7 = emojiEntity.offset;
                            spannableString.setSpan(animatedEmojiSpan, i7, emojiEntity.length + i7, 33);
                            i5++;
                            size = i6;
                        }
                        i3 = size;
                        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableString, textPaintViewCreateText.getFontMetricsInt(), false);
                        if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                            for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                                emojiSpan.scale = 0.85f;
                            }
                        }
                        textPaintViewCreateText.setText(charSequenceReplaceEmoji);
                        setTextAlignment(textPaintViewCreateText, mediaEntity.textAlign);
                        Swatch swatch = textPaintViewCreateText.getSwatch();
                        swatch.color = mediaEntity.color;
                        textPaintViewCreateText.setSwatch(swatch);
                        stickerView = textPaintViewCreateText;
                    } else {
                        i3 = size;
                        if (b3 == 2) {
                            PhotoView photoViewCreatePhoto = createPhoto(mediaEntity.text, false);
                            photoViewCreatePhoto.preloadSegmented(mediaEntity.segmentedPath);
                            if ((mediaEntity.subType & 2) != 0) {
                                photoViewCreatePhoto.mirror();
                            }
                            if ((mediaEntity.subType & 16) != 0) {
                                photoViewCreatePhoto.toggleSegmented(false);
                            }
                            ViewGroup.LayoutParams layoutParams2 = photoViewCreatePhoto.getLayoutParams();
                            layoutParams2.width = mediaEntity.viewWidth;
                            layoutParams2.height = mediaEntity.viewHeight;
                            stickerView = photoViewCreatePhoto;
                        }
                        i4++;
                        size = i3;
                        b = 1;
                        z = false;
                        b2 = 2;
                    }
                }
                stickerView.setX((mediaEntity.x * this.paintingSize.width) - ((mediaEntity.viewWidth * (f - mediaEntity.scale)) / 2.0f));
                stickerView.setY((mediaEntity.y * this.paintingSize.height) - ((mediaEntity.viewHeight * (f - mediaEntity.scale)) / 2.0f));
                stickerView.setPosition(new PointF(stickerView.getX() + (mediaEntity.viewWidth / 2.0f), stickerView.getY() + (mediaEntity.viewHeight / 2.0f)));
                stickerView.setScale(mediaEntity.scale);
                stickerView.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                i4++;
                size = i3;
                b = 1;
                z = false;
                b2 = 2;
            }
        }
        this.entitiesView.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }
        };
        this.selectionContainerView = frameLayout;
        addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.topLayout = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout3 = this.topLayout;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout3.setBackground(new GradientDrawable(orientation, new int[]{-16777216, 0}));
        addView(this.topLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        this.undoButton.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.undoButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LPhotoPaintView.m2498$r8$lambda$QvELLTjwJ39hndfH0BFBKsuoqI(this.f$0, view2);
            }
        });
        this.undoButton.setAlpha(0.6f);
        this.undoButton.setClickable(false);
        this.topLayout.addView(this.undoButton, LayoutHelper.createFrame(32, 32.0f, 51, 12.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.zoomOutButton = linearLayout;
        linearLayout.setOrientation(0);
        this.zoomOutButton.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.zoomOutButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        TextView textView = new TextView(context);
        this.zoomOutText = textView;
        textView.setTextColor(-1);
        this.zoomOutText.setTypeface(AndroidUtilities.bold());
        this.zoomOutText.setTextSize(1, 16.0f);
        this.zoomOutText.setText(LocaleController.getString(R.string.PhotoEditorZoomOut));
        ImageView imageView2 = new ImageView(context);
        this.zoomOutImage = imageView2;
        imageView2.setImageResource(R.drawable.photo_zoomout);
        this.zoomOutButton.addView(this.zoomOutImage, LayoutHelper.createLinear(24, 24, 16, 0, 0, 8, 0));
        this.zoomOutButton.addView(this.zoomOutText, LayoutHelper.createLinear(-2, -2, 16));
        this.zoomOutButton.setAlpha(0.0f);
        this.zoomOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                PhotoViewer.getInstance().zoomOut();
            }
        });
        this.topLayout.addView(this.zoomOutButton, LayoutHelper.createFrame(-2, 32, 17));
        TextView textView2 = new TextView(context);
        this.undoAllButton = textView2;
        textView2.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.undoAllButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.undoAllButton.setText(LocaleController.getString(R.string.PhotoEditorClearAll));
        this.undoAllButton.setGravity(16);
        this.undoAllButton.setTextColor(-1);
        this.undoAllButton.setTypeface(AndroidUtilities.bold());
        this.undoAllButton.setTextSize(1, 16.0f);
        this.undoAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LPhotoPaintView.m2490$r8$lambda$3vPzSpUFaSjRzKEZKiTsLO9YzQ(this.f$0, view2);
            }
        });
        this.undoAllButton.setAlpha(0.6f);
        this.topLayout.addView(this.undoAllButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.cancelTextButton = textView3;
        textView3.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.cancelTextButton.setText(LocaleController.getString(R.string.Clear));
        this.cancelTextButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.cancelTextButton.setGravity(16);
        this.cancelTextButton.setTextColor(-1);
        this.cancelTextButton.setTypeface(AndroidUtilities.bold());
        this.cancelTextButton.setTextSize(1, 16.0f);
        this.cancelTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LPhotoPaintView.m2502$r8$lambda$bcCMUShoFppaXRpBOEgIWGZigM(this.f$0, view2);
            }
        });
        this.cancelTextButton.setAlpha(0.0f);
        this.cancelTextButton.setVisibility(8);
        this.topLayout.addView(this.cancelTextButton, LayoutHelper.createFrame(-2, 32.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.doneTextButton = textView4;
        textView4.setBackground(Theme.createSelectorDrawable(822083583, 7));
        this.doneTextButton.setText(LocaleController.getString(R.string.Done));
        this.doneTextButton.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.doneTextButton.setGravity(16);
        this.doneTextButton.setTextColor(-1);
        this.doneTextButton.setTypeface(AndroidUtilities.bold());
        this.doneTextButton.setTextSize(1, 16.0f);
        this.doneTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.selectEntity(null);
            }
        });
        this.doneTextButton.setAlpha(0.0f);
        this.doneTextButton.setVisibility(8);
        this.topLayout.addView(this.doneTextButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        BottomLayout bottomLayout = new BottomLayout(context);
        this.bottomLayout = bottomLayout;
        bottomLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        this.bottomLayout.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(this.bottomLayout, LayoutHelper.createFrame(-1, 104, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, bitmap2 != null);
        this.paintToolsView = paintToolsView;
        paintToolsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.paintToolsView.setDelegate(this);
        this.paintToolsView.setSelectedIndex(1);
        this.bottomLayout.addView(this.paintToolsView, LayoutHelper.createFrame(-1, 48.0f));
        PaintTextOptionsView paintTextOptionsView = new PaintTextOptionsView(context);
        this.textOptionsView = paintTextOptionsView;
        paintTextOptionsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.textOptionsView.setVisibility(8);
        this.textOptionsView.setDelegate(this);
        this.textOptionsView.setAlignment(PersistColorPalette.getInstance(i).getCurrentAlignment());
        this.bottomLayout.addView(this.textOptionsView, LayoutHelper.createFrame(-1, 48.0f));
        FrameLayout frameLayout4 = new FrameLayout(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && LPhotoPaintView.this.isTypefaceMenuShown) {
                    LPhotoPaintView.this.showTypefaceMenu(false);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                LPhotoPaintView.this.typefaceMenuOutlinePaint.setAlpha((int) (LPhotoPaintView.this.textOptionsView.getAlpha() * 102.0f * (1.0f - LPhotoPaintView.this.typefaceMenuTransformProgress)));
                PaintTextOptionsView paintTextOptionsView2 = LPhotoPaintView.this.textOptionsView;
                RectF rectF = AndroidUtilities.rectTmp;
                paintTextOptionsView2.getTypefaceCellBounds(rectF);
                float top = LPhotoPaintView.this.bottomLayout.getTop() + LPhotoPaintView.this.textOptionsView.getTop() + LPhotoPaintView.this.bottomLayout.getTranslationY() + LPhotoPaintView.this.textOptionsView.getTranslationY();
                rectF.set(AndroidUtilities.lerp(rectF.left, LPhotoPaintView.this.typefaceListView.getLeft(), LPhotoPaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.top + top, LPhotoPaintView.this.typefaceListView.getTop() - LPhotoPaintView.this.typefaceListView.getTranslationY(), LPhotoPaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.right, LPhotoPaintView.this.typefaceListView.getRight(), LPhotoPaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(top + rectF.bottom, LPhotoPaintView.this.typefaceListView.getBottom() - LPhotoPaintView.this.typefaceListView.getTranslationY(), LPhotoPaintView.this.typefaceMenuTransformProgress));
                float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, LPhotoPaintView.this.typefaceMenuTransformProgress));
                int alpha = LPhotoPaintView.this.typefaceMenuBackgroundPaint.getAlpha();
                LPhotoPaintView.this.typefaceMenuBackgroundPaint.setAlpha((int) (alpha * LPhotoPaintView.this.typefaceMenuTransformProgress));
                canvas.drawRoundRect(rectF, fDp, fDp, LPhotoPaintView.this.typefaceMenuBackgroundPaint);
                LPhotoPaintView.this.typefaceMenuBackgroundPaint.setAlpha(alpha);
                canvas.drawRoundRect(rectF, fDp, fDp, LPhotoPaintView.this.typefaceMenuOutlinePaint);
            }
        };
        this.overlayLayout = frameLayout4;
        addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        this.typefaceListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i8) {
                LPhotoPaintView.m2507$r8$lambda$q2G1p_1yknP8eQfhDE_Xj0_3ZE(this.f$0, view2, i8);
            }
        });
        this.textOptionsView.setTypefaceListView(this.typefaceListView);
        this.overlayLayout.addView(this.typefaceListView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        Paint paint2 = this.typefaceMenuOutlinePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        this.typefaceMenuOutlinePaint.setColor(1728053247);
        this.typefaceMenuOutlinePaint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(1.0f)));
        this.typefaceMenuBackgroundPaint.setColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        PaintColorsListView paintColorsListView = new PaintColorsListView(context) {
            private Path path = new Path();

            @Override
            public void draw(Canvas canvas) {
                ViewGroup barView = LPhotoPaintView.this.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, LPhotoPaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, LPhotoPaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), LPhotoPaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), LPhotoPaintView.this.toolsTransformProgress));
                this.path.rewind();
                this.path.addRoundRect(rectF, AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(this.path);
                super.draw(canvas);
                canvas.restore();
            }
        };
        this.colorsListView = paintColorsListView;
        paintColorsListView.setVisibility(8);
        this.colorsListView.setColorPalette(PersistColorPalette.getInstance(i));
        this.colorsListView.setColorListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                LPhotoPaintView.$r8$lambda$G90udHmx_d0xCs2SFpjOa265UXI(this.f$0, (Integer) obj);
            }
        });
        this.bottomLayout.addView(this.colorsListView, LayoutHelper.createFrame(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        PaintCancelView paintCancelView = new PaintCancelView(context);
        this.cancelButton = paintCancelView;
        paintCancelView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.cancelButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.bottomLayout.addView(this.cancelButton, LayoutHelper.createFrame(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        PaintDoneView paintDoneView = new PaintDoneView(context);
        this.doneButton = paintDoneView;
        paintDoneView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.doneButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LPhotoPaintView.$r8$lambda$ZOYWOjL0b6UCe6XnTswyuMjELzA(this.f$0, context, bitmap2, view2);
            }
        });
        this.bottomLayout.addView(this.doneButton, LayoutHelper.createFrame(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setColorSwatch(this.colorSwatch);
        this.weightChooserView.setRenderView(this.renderView);
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        this.weightChooserView.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.m2506$r8$lambda$oTRNNxaPguGS4kURZdWddBYv6I(this.f$0, i);
            }
        });
        addView(this.weightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout5;
        addView(frameLayout5, LayoutHelper.createFrame(-1, -1.0f));
        this.colorSwatchOutlinePaint.setStyle(style);
        this.colorSwatchOutlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setCurrentSwatch(this.colorSwatch, true);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        }
    }

    public static int $r8$lambda$6i0NVTYBdNPKqzxlYpb8bUqDG9g(Theme.ResourcesProvider resourcesProvider, int i) {
        if (i == Theme.key_actionBarDefaultSubmenuBackground) {
            return -14145495;
        }
        if (i == Theme.key_actionBarDefaultSubmenuItem) {
            return -1;
        }
        if (i == Theme.key_dialogBackground) {
            return -14737633;
        }
        if (i == Theme.key_dialogTextBlack) {
            return -592138;
        }
        if (i == Theme.key_dialogTextGray3) {
            return -8553091;
        }
        if (i == Theme.key_chat_emojiPanelBackground) {
            return -16777216;
        }
        if (i == Theme.key_chat_emojiPanelShadowLine) {
            return -1610612736;
        }
        if (i == Theme.key_chat_emojiBottomPanelIcon || i == Theme.key_chat_emojiPanelBackspace || i == Theme.key_chat_emojiPanelIcon) {
            return -9539985;
        }
        if (i == Theme.key_windowBackgroundWhiteBlackText) {
            return -1;
        }
        int i2 = Theme.key_featuredStickers_addedIcon;
        if (i == i2) {
            return -11754001;
        }
        if (i == Theme.key_listSelector) {
            return 536870911;
        }
        if (i == Theme.key_profile_tabSelectedText || i == Theme.key_profile_tabText || i == Theme.key_profile_tabSelectedLine) {
            return -1;
        }
        if (i == Theme.key_profile_tabSelector) {
            return 352321535;
        }
        if (i == Theme.key_chat_emojiSearchIcon || i == i2) {
            return -7895161;
        }
        if (i == Theme.key_chat_emojiSearchBackground) {
            return 780633991;
        }
        if (i == Theme.key_windowBackgroundGray) {
            return -15921907;
        }
        if (i == Theme.key_fastScrollInactive) {
            return -12500671;
        }
        if (i == Theme.key_fastScrollActive) {
            return -13133079;
        }
        if (i == Theme.key_fastScrollText) {
            return -1;
        }
        if (i == Theme.key_windowBackgroundWhite) {
            return -15198183;
        }
        if (i == Theme.key_divider) {
            return -16777216;
        }
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    public static void $r8$lambda$dtkhRj7d3HqR1LLXztAMQIzmqgg(LPhotoPaintView lPhotoPaintView) {
        boolean zCanUndo = lPhotoPaintView.undoStore.canUndo();
        lPhotoPaintView.undoButton.animate().cancel();
        lPhotoPaintView.undoButton.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        lPhotoPaintView.undoButton.setClickable(zCanUndo);
        lPhotoPaintView.undoAllButton.animate().cancel();
        lPhotoPaintView.undoAllButton.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        lPhotoPaintView.undoAllButton.setClickable(zCanUndo);
    }

    public static void m2498$r8$lambda$QvELLTjwJ39hndfH0BFBKsuoqI(LPhotoPaintView lPhotoPaintView, View view) {
        RenderView renderView = lPhotoPaintView.renderView;
        if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
            lPhotoPaintView.renderView.clearShape();
            lPhotoPaintView.paintToolsView.setSelectedIndex(1);
            lPhotoPaintView.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            return;
        }
        lPhotoPaintView.undoStore.undo();
    }

    public static void m2490$r8$lambda$3vPzSpUFaSjRzKEZKiTsLO9YzQ(LPhotoPaintView lPhotoPaintView, View view) {
        if (lPhotoPaintView.undoStore.canUndo()) {
            RenderView renderView = lPhotoPaintView.renderView;
            if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
                lPhotoPaintView.renderView.clearShape();
                lPhotoPaintView.paintToolsView.setSelectedIndex(1);
                lPhotoPaintView.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            }
            lPhotoPaintView.renderView.clearAll();
            lPhotoPaintView.undoStore.reset();
            lPhotoPaintView.entitiesView.removeAllViews();
        }
    }

    public static void m2502$r8$lambda$bcCMUShoFppaXRpBOEgIWGZigM(LPhotoPaintView lPhotoPaintView, View view) {
        EntityView entityView = lPhotoPaintView.currentEntityView;
        if (entityView instanceof TextPaintView) {
            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
        }
        if (lPhotoPaintView.emojiViewVisible) {
            lPhotoPaintView.hideEmojiPopup(false);
        }
        lPhotoPaintView.removeEntity(lPhotoPaintView.currentEntityView);
        lPhotoPaintView.selectEntity(null);
    }

    public static void m2507$r8$lambda$q2G1p_1yknP8eQfhDE_Xj0_3ZE(LPhotoPaintView lPhotoPaintView, View view, int i) {
        lPhotoPaintView.getClass();
        PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
        lPhotoPaintView.textOptionsView.setTypeface(paintTypeface.getKey());
        lPhotoPaintView.onTypefaceSelected(paintTypeface);
        lPhotoPaintView.showTypefaceMenu(false);
    }

    public static void $r8$lambda$G90udHmx_d0xCs2SFpjOa265UXI(LPhotoPaintView lPhotoPaintView, Integer num) {
        lPhotoPaintView.getClass();
        lPhotoPaintView.setNewColor(num.intValue());
        lPhotoPaintView.showColorList(false);
    }

    public static void $r8$lambda$ZOYWOjL0b6UCe6XnTswyuMjELzA(final LPhotoPaintView lPhotoPaintView, Context context, final Bitmap bitmap, View view) {
        if (lPhotoPaintView.isColorListShown) {
            new ColorPickerBottomSheet(context, lPhotoPaintView.resourcesProvider).setColor(lPhotoPaintView.colorSwatch.color).setPipetteDelegate(new ColorPickerBottomSheet.PipetteDelegate() {
                private boolean hasPipette;

                @Override
                public void onStartColorPipette() {
                    this.hasPipette = true;
                }

                @Override
                public void onStopColorPipette() {
                    this.hasPipette = false;
                }

                @Override
                public ViewGroup getContainerView() {
                    return LPhotoPaintView.this.pipetteContainerLayout;
                }

                @Override
                public View getSnapshotDrawingView() {
                    return LPhotoPaintView.this;
                }

                @Override
                public void onDrawImageOverCanvas(Bitmap bitmap2, Canvas canvas) {
                    Matrix matrix = LPhotoPaintView.this.renderView.getMatrix();
                    canvas.save();
                    canvas.translate(LPhotoPaintView.this.renderView.getX(), LPhotoPaintView.this.renderView.getY());
                    canvas.concat(matrix);
                    canvas.scale(LPhotoPaintView.this.renderView.getWidth() / bitmap.getWidth(), LPhotoPaintView.this.renderView.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                }

                @Override
                public boolean isPipetteVisible() {
                    return this.hasPipette;
                }

                @Override
                public boolean isPipetteAvailable() {
                    return bitmap != null;
                }

                @Override
                public void onColorSelected(int i) {
                    LPhotoPaintView.this.showColorList(false);
                    LPhotoPaintView.this.palette.selectColor(i);
                    LPhotoPaintView.this.palette.saveColors();
                    LPhotoPaintView.this.setNewColor(i);
                    LPhotoPaintView.this.colorsListView.setSelectedColorIndex(LPhotoPaintView.this.palette.getCurrentColorPosition());
                    LPhotoPaintView.this.colorsListView.getAdapter().notifyDataSetChanged();
                }
            }).setColorListener(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    LPhotoPaintView.$r8$lambda$ka6AVarTywKfZLcN4a9QhcGrojQ(this.f$0, (Integer) obj);
                }
            }).show();
            return;
        }
        Runnable runnable = lPhotoPaintView.onDoneButtonClickedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$ka6AVarTywKfZLcN4a9QhcGrojQ(LPhotoPaintView lPhotoPaintView, Integer num) {
        lPhotoPaintView.palette.selectColor(num.intValue());
        lPhotoPaintView.palette.saveColors();
        lPhotoPaintView.setNewColor(num.intValue());
        lPhotoPaintView.colorsListView.setSelectedColorIndex(lPhotoPaintView.palette.getCurrentColorPosition());
        lPhotoPaintView.colorsListView.getAdapter().notifyDataSetChanged();
    }

    public static void m2506$r8$lambda$oTRNNxaPguGS4kURZdWddBYv6I(LPhotoPaintView lPhotoPaintView, int i) {
        lPhotoPaintView.setCurrentSwatch(lPhotoPaintView.colorSwatch, true);
        PersistColorPalette.getInstance(i).setCurrentWeight(lPhotoPaintView.colorSwatch.brushWeight);
    }

    public void setDrawShadow(boolean z) {
        this.drawShadow = z;
        invalidate();
        setClipChildren(!z);
    }

    public void setNewColor(final int i) {
        Swatch swatch = this.colorSwatch;
        final int i2 = swatch.color;
        swatch.color = i;
        setCurrentSwatch(swatch, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LPhotoPaintView.$r8$lambda$NSTYqoyDJa9aqZFunE2HhN5jc8M(this.f$0, i2, i, valueAnimator);
            }
        });
        duration.start();
    }

    public static void $r8$lambda$NSTYqoyDJa9aqZFunE2HhN5jc8M(LPhotoPaintView lPhotoPaintView, int i, int i2, ValueAnimator valueAnimator) {
        lPhotoPaintView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lPhotoPaintView.colorSwatch.color = ColorUtils.blendARGB(i, i2, fFloatValue);
        lPhotoPaintView.bottomLayout.invalidate();
    }

    public void translateY(float f) {
        if (Math.abs(f - this.pany) > 0.1f) {
            this.pany = f;
            setTransform(this.scale, this.inputTransformX, this.inputTransformY, this.imageWidth, this.imageHeight);
        }
    }

    public boolean isCurrentText() {
        return this.currentEntityView instanceof TextPaintView;
    }

    public float getSelectedEntityBottom() {
        float y;
        float height;
        EntityView entityView = this.currentEntityView;
        if (entityView == null) {
            y = getY();
            height = this.entitiesView.getMeasuredHeight();
        } else {
            int[] iArr = new int[2];
            entityView.getLocationInWindow(iArr);
            y = iArr[1];
            height = this.currentEntityView.getHeight() * this.entitiesView.getScaleY();
        }
        return y + height;
    }

    private TextPaintView createText(boolean z) {
        onTextAdd();
        Size paintingSize = getPaintingSize();
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(null);
        TextPaintView textPaintView = new TextPaintView(getContext(), pointFStartPositionRelativeToEntity, (int) (paintingSize.width / 9.0f), "", this.colorSwatch, this.selectedTextType);
        float f = paintingSize.width / 9.0f;
        textPaintView.setMinMaxFontSize((int) (0.5f * f), (int) (f * 2.0f), new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.m2491$r8$lambda$6TO5v5daRjTkSx9jVCce9SjH3E(this.f$0);
            }
        });
        if (pointFStartPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            textPaintView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            textPaintView.setStickyY(2);
        }
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth((int) (paintingSize.width - 20.0f));
        textPaintView.setTypeface(PersistColorPalette.getInstance(this.currentAccount).getCurrentTypeface());
        textPaintView.setType(PersistColorPalette.getInstance(this.currentAccount).getCurrentTextType());
        this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            textPaintView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            textPaintView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(textPaintView);
            textPaintView.beginEditing();
            selectEntity(textPaintView, false);
            textPaintView.getFocusedView().requestFocus();
            AndroidUtilities.showKeyboard(textPaintView.getFocusedView());
            this.editingText = true;
            this.textOptionsView.setAlignment(PersistColorPalette.getInstance(this.currentAccount).getCurrentAlignment(), true);
            this.textOptionsView.setOutlineType(PersistColorPalette.getInstance(this.currentAccount).getCurrentTextType());
        }
        return textPaintView;
    }

    public static void m2491$r8$lambda$6TO5v5daRjTkSx9jVCce9SjH3E(LPhotoPaintView lPhotoPaintView) {
        PaintWeightChooserView paintWeightChooserView = lPhotoPaintView.weightChooserView;
        if (paintWeightChooserView != null) {
            paintWeightChooserView.invalidate();
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.onDoneButtonClickedListener = runnable;
    }

    private void editSelectedTextEntity() {
        EntityView entityView = this.currentEntityView;
        if (!(entityView instanceof TextPaintView) || this.editingText) {
            return;
        }
        TextPaintView textPaintView = (TextPaintView) entityView;
        this.editingText = true;
        textPaintView.beginEditing();
        View focusedView = textPaintView.getFocusedView();
        focusedView.requestFocus();
        AndroidUtilities.showKeyboard(focusedView);
    }

    public void updateZoom(boolean z) {
        boolean z2 = !z;
        if (this.zoomOutVisible != z2) {
            this.zoomOutVisible = z2;
            this.zoomOutButton.animate().cancel();
            this.zoomOutButton.animate().alpha(z ? 0.0f : 1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(240L).start();
        }
    }

    public boolean selectEntity(EntityView entityView) {
        return selectEntity(entityView, true);
    }

    private boolean selectEntity(EntityView entityView, boolean z) {
        boolean z2;
        int i;
        boolean z3 = entityView instanceof TextPaintView;
        int i2 = 2;
        if (z3 && (((i = this.tabsNewSelectedIndex) == -1 && this.tabsSelectedIndex != 2) || (i != -1 && i != 2))) {
            ValueAnimator valueAnimator = this.tabsSelectionAnimator;
            if (valueAnimator != null && i != 2) {
                valueAnimator.cancel();
            }
            if (this.isColorListShown) {
                showColorList(false);
            }
            switchTab(2);
        }
        if (z3 && z) {
            TextPaintView textPaintView = (TextPaintView) entityView;
            int gravity = textPaintView.getEditText().getGravity();
            if (gravity == 17) {
                i2 = 1;
            } else if (gravity != 21) {
                i2 = 0;
            }
            this.textOptionsView.setAlignment(i2);
            this.textOptionsView.setTypeface(textPaintView.getTypeface().getKey());
            this.textOptionsView.setOutlineType(textPaintView.getType(), true);
            this.overlayLayout.invalidate();
        }
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            z2 = false;
        } else {
            if (entityView2 == entityView) {
                if (!this.editingText) {
                    showMenuForEntity(entityView2);
                } else if (entityView2 instanceof TextPaintView) {
                    AndroidUtilities.showKeyboard(((TextPaintView) entityView2).getFocusedView());
                    hideEmojiPopup(false);
                }
                return true;
            }
            entityView2.deselect();
            EntityView entityView3 = this.currentEntityView;
            if (entityView3 instanceof TextPaintView) {
                ((TextPaintView) entityView3).endEditing();
                if (!z3) {
                    this.editingText = false;
                    AndroidUtilities.hideKeyboard(((TextPaintView) this.currentEntityView).getFocusedView());
                    hideEmojiPopup(false);
                }
            }
            z2 = true;
        }
        EntityView entityView4 = this.currentEntityView;
        this.currentEntityView = entityView;
        if ((entityView4 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView4).getText())) {
            removeEntity(entityView4);
        }
        EntityView entityView5 = this.currentEntityView;
        if (entityView5 != null) {
            entityView5.select(this.selectionContainerView);
            this.entitiesView.bringChildToFront(this.currentEntityView);
            EntityView entityView6 = this.currentEntityView;
            if (entityView6 instanceof TextPaintView) {
                final TextPaintView textPaintView2 = (TextPaintView) entityView6;
                textPaintView2.disableAutoresize(false);
                textPaintView2.getSwatch().brushWeight = this.colorSwatch.brushWeight;
                setCurrentSwatch(textPaintView2.getSwatch(), true);
                final float f = (int) (this.paintingSize.width / 9.0f);
                this.weightChooserView.setValueOverride(new PaintWeightChooserView.ValueOverride() {
                    @Override
                    public float get() {
                        return textPaintView2.getBaseFontSize() / f;
                    }

                    @Override
                    public void set(float f2) {
                        textPaintView2.disableAutoresize(true);
                        textPaintView2.setBaseFontSize((int) (f * f2));
                    }
                });
                this.weightChooserView.setShowPreview(false);
            } else {
                this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
                this.weightChooserView.setShowPreview(true);
                this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
                setCurrentSwatch(this.colorSwatch, true);
            }
            return true;
        }
        ValueAnimator valueAnimator2 = this.tabsSelectionAnimator;
        if (valueAnimator2 != null && this.tabsNewSelectedIndex != 0) {
            valueAnimator2.cancel();
        }
        if (this.isColorListShown) {
            showColorList(false);
        }
        switchTab(0);
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.weightChooserView.setShowPreview(true);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(this.colorSwatch, true);
        return z2;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        EntitiesContainerView entitiesContainerView;
        FrameLayout frameLayout;
        int i = 0;
        if (view == this.entitiesView) {
            float f = this.shadowAlpha.set(this.drawShadow);
            if (f > 0.0f) {
                this.shadowPaint.setShadowLayer(AndroidUtilities.dp(24.0f * f), 0.0f, 0.0f, Theme.multAlpha(1090519039, f));
                this.shadowPaint.setColor(0);
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                canvas.translate(this.entitiesView.getX(), this.entitiesView.getY());
                canvas.scale(this.entitiesView.getScaleX(), this.entitiesView.getScaleY(), this.entitiesView.getWidth() / 2.0f, this.entitiesView.getHeight() / 2.0f);
                canvas.drawRect(0.0f, 0.0f, this.entitiesView.getWidth(), this.entitiesView.getHeight(), this.shadowPaint);
                canvas.drawRect(0.0f, 0.0f, this.entitiesView.getWidth(), this.entitiesView.getHeight(), this.clearPaint);
                canvas.restore();
            }
        }
        if ((view == this.renderView || view == this.renderInputView || ((view == (entitiesContainerView = this.entitiesView) && entitiesContainerView.getClipChildren()) || (view == (frameLayout = this.selectionContainerView) && frameLayout.getClipChildren()))) && this.currentCropState != null) {
            canvas.save();
            i = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            MediaController.CropState cropState = this.currentCropState;
            int i2 = cropState.transformRotation;
            if (i2 != 90 && i2 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float scaleX = measuredHeight * cropState.cropPw * view.getScaleX();
            MediaController.CropState cropState2 = this.currentCropState;
            int i3 = (int) (scaleX / cropState2.cropScale);
            int scaleY = (int) (((measuredWidth * cropState2.cropPh) * view.getScaleY()) / this.currentCropState.cropScale);
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - i3) / 2.0f)) + this.transformX;
            float measuredHeight2 = ((((((getMeasuredHeight() - this.emojiPadding) - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) + getAdditionalBottom()) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, measuredHeight2), Math.min(fCeil + i3, getMeasuredWidth()), Math.min(getMeasuredHeight(), measuredHeight2 + scaleY));
            i = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public ViewGroup getBarView() {
        return this.tabsSelectedIndex == 2 ? this.textOptionsView : this.paintToolsView;
    }

    private void setupTabsLayout(Context context) {
        LinearLayout linearLayout = new LinearLayout(context) {
            Paint linePaint;

            {
                Paint paint = new Paint(1);
                this.linePaint = paint;
                paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
                this.linePaint.setStyle(Paint.Style.STROKE);
                this.linePaint.setStrokeCap(Paint.Cap.ROUND);
                setWillNotDraw(false);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                TextView textView = (TextView) getChildAt(LPhotoPaintView.this.tabsSelectedIndex);
                TextView textView2 = LPhotoPaintView.this.tabsNewSelectedIndex != -1 ? (TextView) getChildAt(LPhotoPaintView.this.tabsNewSelectedIndex) : null;
                this.linePaint.setColor(textView.getCurrentTextColor());
                float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout = textView.getLayout();
                Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout2 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(LPhotoPaintView.this.tabsSelectionProgress);
                float fLerp = AndroidUtilities.lerp(textView.getX() + layout.getPrimaryHorizontal(layout.getLineStart(0)), textView2 != null ? textView2.getX() + layout2.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation);
                canvas.drawLine(fLerp, y, fLerp + AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation), y, this.linePaint);
            }
        };
        this.tabsLayout = linearLayout;
        linearLayout.setClipToPadding(false);
        this.tabsLayout.setOrientation(0);
        this.bottomLayout.addView(this.tabsLayout, LayoutHelper.createFrame(-1, 40.0f, 80, 52.0f, 0.0f, 52.0f, 0.0f));
        TextView textView = new TextView(context);
        this.drawTab = textView;
        textView.setText(LocaleController.getString(R.string.PhotoEditorDraw).toUpperCase());
        TextView textView2 = this.drawTab;
        int i = Theme.key_listSelector;
        textView2.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 7));
        this.drawTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.drawTab.setTextColor(-1);
        this.drawTab.setTextSize(1, 14.0f);
        this.drawTab.setGravity(1);
        this.drawTab.setTypeface(AndroidUtilities.bold());
        this.drawTab.setSingleLine();
        this.drawTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LPhotoPaintView.m2492$r8$lambda$8Uowv1dCWlErULvvDP7YOeigr8(this.f$0, view);
            }
        });
        this.tabsLayout.addView(this.drawTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView3 = new TextView(context);
        this.stickerTab = textView3;
        textView3.setText(LocaleController.getString(R.string.PhotoEditorSticker).toUpperCase());
        this.stickerTab.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 7));
        this.stickerTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.stickerTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.openStickersView();
            }
        });
        this.stickerTab.setTextColor(-1);
        this.stickerTab.setTextSize(1, 14.0f);
        this.stickerTab.setGravity(1);
        this.stickerTab.setTypeface(AndroidUtilities.bold());
        this.stickerTab.setAlpha(0.6f);
        this.stickerTab.setSingleLine();
        this.tabsLayout.addView(this.stickerTab, LayoutHelper.createLinear(0, -2, 1.0f));
        TextView textView4 = new TextView(context);
        this.textTab = textView4;
        textView4.setText(LocaleController.getString(R.string.PhotoEditorText).toUpperCase());
        this.textTab.setBackground(Theme.createSelectorDrawable(getThemedColor(i), 7));
        this.textTab.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.textTab.setTextColor(-1);
        this.textTab.setTextSize(1, 14.0f);
        this.textTab.setGravity(1);
        this.textTab.setTypeface(AndroidUtilities.bold());
        this.textTab.setAlpha(0.6f);
        this.textTab.setSingleLine();
        this.textTab.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LPhotoPaintView.$r8$lambda$C3ClLwArVzf78HDAKgUxtAAupe0(this.f$0, view);
            }
        });
        this.tabsLayout.addView(this.textTab, LayoutHelper.createLinear(0, -2, 1.0f));
    }

    public static void m2492$r8$lambda$8Uowv1dCWlErULvvDP7YOeigr8(LPhotoPaintView lPhotoPaintView, View view) {
        if (lPhotoPaintView.editingText) {
            lPhotoPaintView.selectEntity(null);
        } else {
            lPhotoPaintView.switchTab(0);
        }
    }

    public static void $r8$lambda$C3ClLwArVzf78HDAKgUxtAAupe0(LPhotoPaintView lPhotoPaintView, View view) {
        lPhotoPaintView.switchTab(2);
        if (lPhotoPaintView.currentEntityView instanceof TextPaintView) {
            return;
        }
        lPhotoPaintView.createText(true);
    }

    public View getBarView(int i) {
        if (i == 0) {
            return this.paintToolsView;
        }
        if (i == 2) {
            return this.textOptionsView;
        }
        return null;
    }

    private void switchTab(final int i) {
        if (this.tabsSelectedIndex == i || this.tabsNewSelectedIndex == i) {
            return;
        }
        ValueAnimator valueAnimator = this.tabsSelectionAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final View barView = getBarView(this.tabsSelectedIndex);
        this.tabsNewSelectedIndex = i;
        final View barView2 = getBarView(i);
        PersistColorPalette.getInstance(this.currentAccount).setInTextMode(i == 2);
        this.colorSwatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        setCurrentSwatch(this.colorSwatch, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.tabsSelectionAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.tabsSelectionAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LPhotoPaintView.$r8$lambda$P3Cq0ROBiUHmP3euCfthM8ztW1Q(this.f$0, barView, barView2, valueAnimator2);
            }
        });
        this.tabsSelectionAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                View view;
                if (barView != null && (view = barView2) != null) {
                    view.setVisibility(0);
                }
                if (i != 2) {
                    Brush currentBrush = LPhotoPaintView.this.renderView.getCurrentBrush();
                    if ((currentBrush instanceof Brush.Blurer) || (currentBrush instanceof Brush.Eraser)) {
                        LPhotoPaintView.this.weightChooserView.setMinMax(0.4f, 1.75f);
                        return;
                    } else {
                        LPhotoPaintView.this.weightChooserView.setMinMax(0.05f, 1.0f);
                        return;
                    }
                }
                LPhotoPaintView.this.weightChooserView.setMinMax(0.5f, 2.0f);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                lPhotoPaintView.tabsSelectedIndex = lPhotoPaintView.tabsNewSelectedIndex;
                LPhotoPaintView.this.tabsNewSelectedIndex = -1;
                LPhotoPaintView.this.tabsLayout.invalidate();
                View view = barView;
                if (view != null && barView2 != null) {
                    view.setVisibility(8);
                }
                if (animator == LPhotoPaintView.this.tabsSelectionAnimator) {
                    LPhotoPaintView.this.tabsSelectionAnimator = null;
                }
            }
        });
        this.tabsSelectionAnimator.start();
    }

    public static void $r8$lambda$P3Cq0ROBiUHmP3euCfthM8ztW1Q(LPhotoPaintView lPhotoPaintView, View view, View view2, ValueAnimator valueAnimator) {
        float f;
        lPhotoPaintView.getClass();
        lPhotoPaintView.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lPhotoPaintView.tabsLayout.invalidate();
        lPhotoPaintView.bottomLayout.invalidate();
        lPhotoPaintView.overlayLayout.invalidate();
        int i = 0;
        while (i < lPhotoPaintView.tabsLayout.getChildCount()) {
            View childAt = lPhotoPaintView.tabsLayout.getChildAt(i);
            if (i == lPhotoPaintView.tabsNewSelectedIndex) {
                f = lPhotoPaintView.tabsSelectionProgress;
            } else {
                f = i == lPhotoPaintView.tabsSelectedIndex ? 1.0f - lPhotoPaintView.tabsSelectionProgress : 0.0f;
            }
            childAt.setAlpha((f * 0.4f) + 0.6f);
            i++;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(lPhotoPaintView.tabsSelectionProgress);
        if (view == null || view2 == null) {
            return;
        }
        float f2 = 1.0f - interpolation;
        float f3 = (f2 * 0.4f) + 0.6f;
        view.setScaleX(f3);
        view.setScaleY(f3);
        view.setTranslationY((AndroidUtilities.dp(16.0f) * Math.min(interpolation, 0.25f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(interpolation, 0.25f) / 0.25f));
        float f4 = (interpolation * 0.4f) + 0.6f;
        view2.setScaleX(f4);
        view2.setScaleY(f4);
        view2.setTranslationY(((-AndroidUtilities.dp(16.0f)) * Math.min(f2, 0.25f)) / 0.25f);
        view2.setAlpha(1.0f - (Math.min(f2, 0.25f) / 0.25f));
    }

    public void openStickersView() {
        final int i = this.tabsSelectedIndex;
        switchTab(1);
        postDelayed(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.$r8$lambda$TukG9dA2UcGprBsoZauzBwqXOZ0(this.f$0);
            }
        }, 350L);
        EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), false, this.resourcesProvider, false) {
            @Override
            public boolean canShowWidget(Integer num) {
                return num.intValue() == 2;
            }
        };
        emojiBottomSheet.whenDocumentSelected(new Utilities.Callback3Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3) {
                return LPhotoPaintView.$r8$lambda$pWth9pLjzgw8pQYmgUtZ9rLWFgs(this.f$0, obj, (TLRPC.Document) obj2, (Boolean) obj3);
            }
        });
        emojiBottomSheet.whenWidgetSelected(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return LPhotoPaintView.m2509$r8$lambda$vooKweSSVgWaVMpV7HH3gQncM8(this.f$0, (Integer) obj);
            }
        });
        emojiBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                LPhotoPaintView.$r8$lambda$o1sQRaQnWTFseIwLYhtCRyXSNgc(this.f$0, i, dialogInterface);
            }
        });
        emojiBottomSheet.show();
        onOpenCloseStickersAlert(true);
    }

    public static void $r8$lambda$TukG9dA2UcGprBsoZauzBwqXOZ0(LPhotoPaintView lPhotoPaintView) {
        if (lPhotoPaintView.facesBitmap != null) {
            lPhotoPaintView.detectFaces();
        }
    }

    public static Boolean $r8$lambda$pWth9pLjzgw8pQYmgUtZ9rLWFgs(LPhotoPaintView lPhotoPaintView, Object obj, TLRPC.Document document, Boolean bool) {
        StickerView stickerViewCreateSticker = lPhotoPaintView.createSticker(obj, document, true);
        if (bool.booleanValue()) {
            stickerViewCreateSticker.setScale(1.5f);
        }
        return Boolean.TRUE;
    }

    public static Boolean m2509$r8$lambda$vooKweSSVgWaVMpV7HH3gQncM8(LPhotoPaintView lPhotoPaintView, Integer num) {
        lPhotoPaintView.getClass();
        if (num.intValue() == 2) {
            lPhotoPaintView.showPhotoAlert();
        }
        return Boolean.TRUE;
    }

    public static void $r8$lambda$o1sQRaQnWTFseIwLYhtCRyXSNgc(LPhotoPaintView lPhotoPaintView, int i, DialogInterface dialogInterface) {
        lPhotoPaintView.onOpenCloseStickersAlert(false);
        lPhotoPaintView.switchTab(i);
    }

    private void showPhotoAlert() {
        final ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new ChatActivity(null) {
            @Override
            public long getDialogId() {
                return 0L;
            }

            @Override
            public boolean isKeyboardVisible() {
                return false;
            }

            @Override
            public boolean isLightStatusBar() {
                return false;
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return LPhotoPaintView.this.resourcesProvider;
            }

            @Override
            public Activity getParentActivity() {
                return AndroidUtilities.findActivity(LPhotoPaintView.this.getContext());
            }

            @Override
            public TLRPC.User getCurrentUser() {
                return UserConfig.getInstance(this.currentAccount).getCurrentUser();
            }
        }, false, false, false, this.resourcesProvider);
        chatAttachAlert.drawNavigationBar = true;
        chatAttachAlert.setupPhotoPicker(LocaleController.getString(R.string.AddImage));
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            long start;

            @Override
            public void didSelectBot(TLRPC.User user) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$didSelectBot(this, user);
            }

            @Override
            public void doOnIdle(Runnable runnable) {
                runnable.run();
            }

            @Override
            public boolean needEnterComment() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$needEnterComment(this);
            }

            @Override
            public void onCameraOpened() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onCameraOpened(this);
            }

            @Override
            public void onWallpaperSelected(Object obj) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$onWallpaperSelected(this, obj);
            }

            @Override
            public void openAvatarsSearch() {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$openAvatarsSearch(this);
            }

            @Override
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
            }

            @Override
            public boolean selectItemOnClicking() {
                this.start = System.currentTimeMillis();
                return true;
            }

            @Override
            public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
                try {
                    HashMap<Object, Object> selectedPhotos = chatAttachAlert.getPhotoLayout().getSelectedPhotos();
                    if (selectedPhotos.isEmpty()) {
                        return;
                    }
                    MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) selectedPhotos.values().iterator().next();
                    String str = photoEntry.imagePath;
                    if (str == null) {
                        str = photoEntry.path;
                    }
                    LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                    lPhotoPaintView.appearAnimation(lPhotoPaintView.createPhoto(str, true));
                    chatAttachAlert.dismiss();
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
        });
        chatAttachAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                MediaController.forceBroadcastNewPhotos = false;
            }
        });
        chatAttachAlert.setMaxSelectedPhotos(1, false);
        chatAttachAlert.init();
        MediaController.forceBroadcastNewPhotos = true;
        chatAttachAlert.getPhotoLayout().loadGalleryPhotos();
        chatAttachAlert.show();
    }

    public void appearAnimation(final View view) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        view.setScaleX(scaleX * 0.5f);
        view.setScaleY(0.5f * scaleY);
        view.setAlpha(0.0f);
        view.animate().scaleX(scaleX).scaleY(scaleY).alpha(1.0f).setInterpolator(new OvershootInterpolator(3.0f)).setDuration(240L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.$r8$lambda$I_Sge1lh7RT2O_xyycs0yWDMWCk(this.f$0, view);
            }
        }).start();
    }

    public static void $r8$lambda$I_Sge1lh7RT2O_xyycs0yWDMWCk(LPhotoPaintView lPhotoPaintView, View view) {
        lPhotoPaintView.getClass();
        if (view instanceof EntityView) {
            EntityView entityView = (EntityView) view;
            entityView.updateSelectionView();
            lPhotoPaintView.selectEntity(entityView);
        }
    }

    public PhotoView createPhoto(String str, boolean z) {
        Size sizeBasePhotoSize = basePhotoSize(str);
        Pair<Integer, Integer> imageOrientation = AndroidUtilities.getImageOrientation(str);
        if ((((Integer) imageOrientation.first).intValue() / 90) % 2 == 1) {
            float f = sizeBasePhotoSize.width;
            sizeBasePhotoSize.width = sizeBasePhotoSize.height;
            sizeBasePhotoSize.height = f;
        }
        PhotoView photoView = new PhotoView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, sizeBasePhotoSize, str, ((Integer) imageOrientation.first).intValue(), ((Integer) imageOrientation.second).intValue());
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        if (z) {
            registerRemovalUndo(photoView);
            selectEntity(photoView);
        }
        return photoView;
    }

    private Size basePhotoSize(String str) {
        float f;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            f = options.outWidth / options.outHeight;
        } catch (Exception e) {
            FileLog.e(e);
            f = 1.0f;
        }
        if (f > 1.0f) {
            float fFloor = (float) Math.floor(((double) this.entitiesView.getMeasuredWidth()) * 0.5d);
            return new Size(fFloor, fFloor / f);
        }
        float fFloor2 = (float) Math.floor(((double) this.entitiesView.getMeasuredHeight()) * 0.5d);
        return new Size(f * fFloor2, fFloor2);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        float currentActionBarHeight;
        float width;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int currentActionBarHeight2 = (((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - getAdditionalTop()) - getAdditionalBottom()) - AndroidUtilities.dp(48.0f);
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            width = bitmap.getWidth();
            currentActionBarHeight = this.bitmapToEdit.getHeight();
        } else {
            currentActionBarHeight = (size2 - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(48.0f);
            width = size;
        }
        float fFloor = size;
        float fFloor2 = (float) Math.floor((fFloor * currentActionBarHeight) / width);
        float f = currentActionBarHeight2;
        if (fFloor2 > f) {
            fFloor = (float) Math.floor((width * f) / currentActionBarHeight);
            fFloor2 = f;
        }
        int i3 = (int) fFloor;
        int i4 = (int) fFloor2;
        this.renderView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        this.renderInputView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f2 = fFloor / this.paintingSize.width;
        this.baseScale = f2;
        this.entitiesView.setScaleX(f2);
        this.entitiesView.setScaleY(this.baseScale);
        this.entitiesView.measure(View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.height, 1073741824));
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            thanosEffect.measure(View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.width, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.paintingSize.height, 1073741824));
            this.thanosEffect.setScaleX(this.baseScale);
            this.thanosEffect.setScaleY(this.baseScale);
        }
        updateEntitiesSelections();
        this.selectionContainerView.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        measureChild(this.bottomLayout, i, i2);
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.pipetteContainerLayout, i, i2);
        measureChild(this.overlayLayout, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(getPKeyboardHeight(), this.emojiPadding), 1073741824));
        FrameLayout frameLayout = this.topLayout;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, this.topLayout.getPaddingRight(), this.topLayout.getPaddingBottom());
        measureChild(this.topLayout, i, i2);
        this.ignoreLayout = false;
        if (!this.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0 && !this.emojiViewVisible && !this.isAnimatePopupClosing) {
            this.ignoreLayout = true;
            hideEmojiView();
            this.ignoreLayout = false;
        }
        if (AndroidUtilities.dp(20.0f) < 0) {
            hideEmojiView();
        }
        EmojiView emojiView = this.emojiView;
        if (emojiView != null) {
            measureChild(emojiView, i, i2);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iMeasureKeyboardHeight;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (this.emojiView != null) {
            if (AndroidUtilities.isTablet()) {
                iMeasureKeyboardHeight = i6 - this.emojiView.getMeasuredHeight();
            } else {
                iMeasureKeyboardHeight = (measureKeyboardHeight() + i6) - this.emojiView.getMeasuredHeight();
            }
            EmojiView emojiView = this.emojiView;
            emojiView.layout(0, iMeasureKeyboardHeight, emojiView.getMeasuredWidth(), this.emojiView.getMeasuredHeight() + iMeasureKeyboardHeight);
        }
        int i7 = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i7;
        int iCeil = (int) Math.ceil((i5 - this.renderView.getMeasuredWidth()) / 2.0f);
        int iDp = ((((i6 - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) - this.renderView.getMeasuredHeight()) / 2) + AndroidUtilities.dp(8.0f) + i7 + ((getAdditionalTop() - getAdditionalBottom()) / 2);
        RenderView renderView = this.renderView;
        renderView.layout(iCeil, iDp, renderView.getMeasuredWidth() + iCeil, this.renderView.getMeasuredHeight() + iDp);
        View view = this.renderInputView;
        view.layout(iCeil, iDp, view.getMeasuredWidth() + iCeil, this.renderInputView.getMeasuredHeight() + iDp);
        int measuredWidth = ((this.renderView.getMeasuredWidth() - this.entitiesView.getMeasuredWidth()) / 2) + iCeil;
        int measuredHeight = ((this.renderView.getMeasuredHeight() - this.entitiesView.getMeasuredHeight()) / 2) + iDp;
        EntitiesContainerView entitiesContainerView = this.entitiesView;
        entitiesContainerView.layout(measuredWidth, measuredHeight, entitiesContainerView.getMeasuredWidth() + measuredWidth, this.entitiesView.getMeasuredHeight() + measuredHeight);
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            thanosEffect.layout(measuredWidth, measuredHeight, this.entitiesView.getMeasuredWidth() + measuredWidth, this.entitiesView.getMeasuredHeight() + measuredHeight);
        }
        FrameLayout frameLayout = this.selectionContainerView;
        frameLayout.layout(iCeil, iDp, frameLayout.getMeasuredWidth() + iCeil, this.selectionContainerView.getMeasuredHeight() + iDp);
    }

    private Size getPaintingSize() {
        int i;
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        float width = this.bitmapToEdit.getWidth();
        float height = this.bitmapToEdit.getHeight();
        int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
        if (devicePerformanceClass != 0) {
            i = devicePerformanceClass != 2 ? 2560 : 3840;
        } else {
            i = 1280;
        }
        Size size2 = new Size(width, height);
        float f = i;
        size2.width = f;
        float fFloor = (float) Math.floor((f * height) / width);
        size2.height = fFloor;
        if (fFloor > f) {
            size2.height = f;
            size2.width = (float) Math.floor((f * width) / height);
        }
        this.paintingSize = size2;
        return size2;
    }

    public void init() {
        this.textOptionsView.setTypeface(PersistColorPalette.getInstance(this.currentAccount).getCurrentTypeface());
        this.entitiesView.setVisibility(0);
        this.renderView.setVisibility(0);
        this.renderInputView.setVisibility(0);
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
        int i = this.originalBitmapRotation % 360;
        return i == 90 || i == 270;
    }

    private void detectFaces() {
        this.queue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.m2495$r8$lambda$JUJ4kp5K8243TsX0pRa9E23RcE(this.f$0);
            }
        }, 200L);
    }

    public static void m2495$r8$lambda$JUJ4kp5K8243TsX0pRa9E23RcE(LPhotoPaintView lPhotoPaintView) {
        lPhotoPaintView.getClass();
        FaceDetector faceDetectorBuild = null;
        try {
            try {
                faceDetectorBuild = new FaceDetector.Builder(lPhotoPaintView.getContext()).setMode(1).setLandmarkType(1).setTrackingEnabled(false).build();
                if (!faceDetectorBuild.isOperational()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    faceDetectorBuild.release();
                    return;
                }
                try {
                    SparseArray sparseArrayDetect = faceDetectorBuild.detect(new Frame.Builder().setBitmap(lPhotoPaintView.facesBitmap).setRotation(lPhotoPaintView.getFrameRotation()).build());
                    ArrayList arrayList = new ArrayList();
                    Size paintingSize = lPhotoPaintView.getPaintingSize();
                    for (int i = 0; i < sparseArrayDetect.size(); i++) {
                        PhotoFace photoFace = new PhotoFace((Face) sparseArrayDetect.get(sparseArrayDetect.keyAt(i)), lPhotoPaintView.facesBitmap, paintingSize, lPhotoPaintView.isSidewardOrientation());
                        if (photoFace.isSufficient()) {
                            arrayList.add(photoFace);
                        }
                    }
                    lPhotoPaintView.faces = arrayList;
                    faceDetectorBuild.release();
                } catch (Throwable th) {
                    FileLog.e(th);
                    faceDetectorBuild.release();
                }
            } catch (Exception e) {
                FileLog.e(e);
                if (0 == 0) {
                }
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                faceDetectorBuild.release();
            }
            throw th2;
        }
    }

    public void shutdown() {
        this.renderView.shutdown();
        this.entitiesView.setVisibility(8);
        this.selectionContainerView.setVisibility(8);
        this.queue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.$r8$lambda$KxdBDoO2Zm3tTV73jojKahyzkgE();
            }
        });
    }

    public static void $r8$lambda$KxdBDoO2Zm3tTV73jojKahyzkgE() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }

    @Override
    public void onResume() {
        this.renderView.redraw();
    }

    public void onAnimationStateChanged(boolean z) {
        if (this.tabsSelectedIndex == 0) {
            this.weightChooserView.setLayerType(z ? 2 : 0, null);
            this.bottomLayout.setLayerType(z ? 2 : 0, null);
            this.topLayout.setLayerType(z ? 2 : 0, null);
        }
    }

    public void setOffsetTranslationX(float f) {
        if (this.tabsSelectedIndex == 0) {
            this.weightChooserView.setTranslationX(f);
        }
    }

    public void setOffsetTranslationY(float f, float f2, int i, boolean z) {
        this.offsetTranslationY = f;
        if (!z) {
            this.topLayout.setTranslationY(-f);
            this.bottomLayout.setTranslationY(f);
        } else {
            setTranslationY(0.0f);
        }
    }

    public float getOffsetTranslationY() {
        return this.offsetTranslationY;
    }

    @Override
    public void updateColors() {
        this.toolsPaint.setColor(-15132391);
    }

    public void setBlurredBackgroundDrawableForTools(BlurredBackgroundDrawable blurredBackgroundDrawable) {
        this.blurredBackgroundDrawableForTools = blurredBackgroundDrawable.setPadding(AndroidUtilities.dp(4.0f));
    }

    public boolean hasChanges() {
        return this.undoStore.canUndo();
    }

    public Bitmap getBitmap(ArrayList arrayList, Bitmap[] bitmapArr) {
        Canvas canvas;
        float f;
        boolean z;
        boolean z2;
        File fileSaveSegmentedImage;
        TextPaintView textPaintView;
        CharSequence charSequence;
        LPhotoPaintView lPhotoPaintView = this;
        int i = 0;
        Bitmap resultBitmap = lPhotoPaintView.renderView.getResultBitmap(false, false);
        lPhotoPaintView.lcm = BigInteger.ONE;
        if (resultBitmap != null && lPhotoPaintView.entitiesView.entitiesCount() > 0) {
            int childCount = lPhotoPaintView.entitiesView.getChildCount();
            Canvas canvas2 = null;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = lPhotoPaintView.entitiesView.getChildAt(i2);
                if (childAt instanceof EntityView) {
                    EntityView entityView = (EntityView) childAt;
                    PointF position = entityView.getPosition();
                    if (arrayList != 0) {
                        VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
                        f = 2.0f;
                        if (entityView instanceof TextPaintView) {
                            mediaEntity.type = (byte) 1;
                            TextPaintView textPaintView2 = (TextPaintView) entityView;
                            CharSequence text = textPaintView2.getText();
                            if (text instanceof Spanned) {
                                Spanned spanned = (Spanned) text;
                                AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i, text.length(), AnimatedEmojiSpan.class);
                                if (animatedEmojiSpanArr != null) {
                                    int i3 = 0;
                                    while (i3 < animatedEmojiSpanArr.length) {
                                        AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i3];
                                        Canvas canvas3 = canvas2;
                                        TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                                        if (documentFindDocument == null) {
                                            documentFindDocument = AnimatedEmojiDrawable.findDocument(lPhotoPaintView.currentAccount, animatedEmojiSpan.getDocumentId());
                                        }
                                        if (documentFindDocument != null) {
                                            AnimatedEmojiDrawable.getDocumentFetcher(lPhotoPaintView.currentAccount).putDocument(documentFindDocument);
                                        }
                                        VideoEditedInfo.EmojiEntity emojiEntity = new VideoEditedInfo.EmojiEntity();
                                        TextPaintView textPaintView3 = textPaintView2;
                                        CharSequence charSequence2 = text;
                                        emojiEntity.document_id = animatedEmojiSpan.getDocumentId();
                                        emojiEntity.document = documentFindDocument;
                                        emojiEntity.offset = spanned.getSpanStart(animatedEmojiSpan);
                                        emojiEntity.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity.offset;
                                        emojiEntity.documentAbsolutePath = FileLoader.getInstance(lPhotoPaintView.currentAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                                        boolean zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                        if (zIsAnimatedStickerDocument || MessageObject.isVideoStickerDocument(emojiEntity.document)) {
                                            emojiEntity.subType = (byte) ((zIsAnimatedStickerDocument ? (byte) 1 : (byte) 4) | emojiEntity.subType);
                                        }
                                        mediaEntity.entities.add(emojiEntity);
                                        if (documentFindDocument != null) {
                                            BigInteger bigIntegerValueOf = BigInteger.valueOf(5000L);
                                            lPhotoPaintView.lcm = lPhotoPaintView.lcm.multiply(bigIntegerValueOf).divide(lPhotoPaintView.lcm.gcd(bigIntegerValueOf));
                                        }
                                        textPaintView2 = textPaintView3;
                                        animatedEmojiSpanArr = animatedEmojiSpanArr;
                                        text = charSequence2;
                                        i3++;
                                        canvas2 = canvas3;
                                    }
                                }
                                canvas = canvas2;
                                textPaintView = textPaintView2;
                                charSequence = text;
                                mediaEntity.entities.isEmpty();
                            } else {
                                canvas = canvas2;
                                textPaintView = textPaintView2;
                                charSequence = text;
                            }
                            mediaEntity.text = charSequence.toString();
                            mediaEntity.subType = (byte) textPaintView.getType();
                            mediaEntity.color = textPaintView.getSwatch().color;
                            mediaEntity.fontSize = textPaintView.getTextSize();
                            mediaEntity.textTypeface = textPaintView.getTypeface();
                            mediaEntity.textAlign = textPaintView.getAlign();
                        } else {
                            canvas = canvas2;
                            if (entityView instanceof StickerView) {
                                mediaEntity.type = (byte) 0;
                                StickerView stickerView = (StickerView) entityView;
                                Size baseSize = stickerView.getBaseSize();
                                mediaEntity.width = baseSize.width;
                                mediaEntity.height = baseSize.height;
                                mediaEntity.document = stickerView.getSticker();
                                mediaEntity.parentObject = stickerView.getParentObject();
                                TLRPC.Document sticker = stickerView.getSticker();
                                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                if (MessageObject.isAnimatedStickerDocument(sticker, true) || MessageObject.isVideoStickerDocument(sticker)) {
                                    boolean zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    mediaEntity.subType = (byte) (mediaEntity.subType | (zIsAnimatedStickerDocument2 ? (byte) 1 : (byte) 4));
                                    long duration = zIsAnimatedStickerDocument2 ? stickerView.getDuration() : 5000L;
                                    if (duration != 0) {
                                        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(duration);
                                        lPhotoPaintView.lcm = lPhotoPaintView.lcm.multiply(bigIntegerValueOf2).divide(lPhotoPaintView.lcm.gcd(bigIntegerValueOf2));
                                    }
                                }
                                if (stickerView.isMirrored()) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                            } else {
                                if (entityView instanceof PhotoView) {
                                    PhotoView photoView = (PhotoView) entityView;
                                    mediaEntity.type = (byte) 2;
                                    Size baseSize2 = photoView.getBaseSize();
                                    mediaEntity.width = baseSize2.width;
                                    mediaEntity.height = baseSize2.height;
                                    mediaEntity.text = photoView.getPath(lPhotoPaintView.currentAccount);
                                    if (photoView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                    if (photoView.hasSegmentedImage() && photoView.isSegmented() && (fileSaveSegmentedImage = photoView.saveSegmentedImage(lPhotoPaintView.currentAccount)) != null) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 16);
                                        mediaEntity.segmentedPath = fileSaveSegmentedImage.getPath();
                                    }
                                    z2 = false;
                                }
                                i2++;
                                lPhotoPaintView = this;
                                i = 0;
                            }
                            arrayList.add(mediaEntity);
                            float scaleX = childAt.getScaleX();
                            float scaleY = childAt.getScaleY();
                            float x = childAt.getX();
                            float y = childAt.getY();
                            mediaEntity.viewWidth = childAt.getWidth();
                            mediaEntity.viewHeight = childAt.getHeight();
                            mediaEntity.width = (childAt.getWidth() * scaleX) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.height = (childAt.getHeight() * scaleY) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                            mediaEntity.textViewX = (x + (childAt.getWidth() / 2.0f)) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewY = (y + (childAt.getHeight() / 2.0f)) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.textViewWidth = mediaEntity.viewWidth / lPhotoPaintView.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewHeight = mediaEntity.viewHeight / lPhotoPaintView.entitiesView.getMeasuredHeight();
                            mediaEntity.scale = scaleX;
                            if (bitmapArr[0] == null) {
                                bitmapArr[0] = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), resultBitmap.getConfig());
                                Canvas canvas4 = new Canvas(bitmapArr[0]);
                                canvas4.drawBitmap(resultBitmap, 0.0f, 0.0f, (Paint) null);
                                canvas = canvas4;
                            }
                            z = z2;
                        }
                        z2 = true;
                        arrayList.add(mediaEntity);
                        float scaleX2 = childAt.getScaleX();
                        float scaleY2 = childAt.getScaleY();
                        float x2 = childAt.getX();
                        float y2 = childAt.getY();
                        mediaEntity.viewWidth = childAt.getWidth();
                        mediaEntity.viewHeight = childAt.getHeight();
                        mediaEntity.width = (childAt.getWidth() * scaleX2) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.height = (childAt.getHeight() * scaleY2) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX2)) / 2.0f) + x2) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY2)) / 2.0f) + y2) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                        mediaEntity.textViewX = (x2 + (childAt.getWidth() / 2.0f)) / lPhotoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.textViewY = (y2 + (childAt.getHeight() / 2.0f)) / lPhotoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.textViewWidth = mediaEntity.viewWidth / lPhotoPaintView.entitiesView.getMeasuredWidth();
                        mediaEntity.textViewHeight = mediaEntity.viewHeight / lPhotoPaintView.entitiesView.getMeasuredHeight();
                        mediaEntity.scale = scaleX2;
                        if (bitmapArr[0] == null) {
                            bitmapArr[0] = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), resultBitmap.getConfig());
                            Canvas canvas5 = new Canvas(bitmapArr[0]);
                            canvas5.drawBitmap(resultBitmap, 0.0f, 0.0f, (Paint) null);
                            canvas = canvas5;
                        }
                        z = z2;
                    } else {
                        canvas = canvas2;
                        f = 2.0f;
                        z = false;
                    }
                    Canvas canvas6 = new Canvas(resultBitmap);
                    int i4 = 0;
                    while (i4 < 2) {
                        Canvas canvas7 = i4 == 0 ? canvas6 : canvas;
                        if (canvas7 != null && (i4 != 0 || !z)) {
                            canvas7.save();
                            canvas7.translate(position.x, position.y);
                            canvas7.scale(childAt.getScaleX(), childAt.getScaleY());
                            canvas7.rotate(childAt.getRotation());
                            canvas7.translate((-entityView.getWidth()) / f, (-entityView.getHeight()) / f);
                            if ((childAt instanceof TextPaintView) && childAt.getHeight() > 0 && childAt.getWidth() > 0) {
                                Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(childAt.getWidth(), childAt.getHeight(), Bitmap.Config.ARGB_8888);
                                Canvas canvas8 = new Canvas(bitmapCreateBitmap);
                                childAt.draw(canvas8);
                                canvas7.drawBitmap(bitmapCreateBitmap, (Rect) null, new Rect(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), (Paint) null);
                                try {
                                    canvas8.setBitmap(null);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                bitmapCreateBitmap.recycle();
                            } else {
                                childAt.draw(canvas7);
                            }
                            canvas7.restore();
                        }
                        i4++;
                    }
                    canvas2 = canvas;
                    i2++;
                    lPhotoPaintView = this;
                    i = 0;
                } else {
                    canvas = canvas2;
                }
                canvas2 = canvas;
                i2++;
                lPhotoPaintView = this;
                i = 0;
            }
        }
        return resultBitmap;
    }

    public void onCleanupEntities() {
        this.entitiesView.removeAllViews();
    }

    public long getLcm() {
        return this.lcm.longValue();
    }

    public View getDoneView() {
        return this.doneButton;
    }

    public View getCancelView() {
        return this.cancelButton;
    }

    public void maybeShowDismissalAlert(PhotoViewer photoViewer, Activity activity, final Runnable runnable) {
        if (this.isColorListShown) {
            showColorList(false);
            return;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return;
        }
        if (this.editingText && this.currentEntityView != null) {
            selectEntity(null);
            return;
        }
        if (!hasChanges()) {
            runnable.run();
            return;
        }
        if (activity == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, this.resourcesProvider);
        builder.setMessage(LocaleController.getString(R.string.PhotoEditorDiscardAlert));
        builder.setTitle(LocaleController.getString(R.string.DiscardChanges));
        builder.setPositiveButton(LocaleController.getString(R.string.PassportDiscard), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        photoViewer.showAlertDialog(builder);
    }

    public boolean onTouch(MotionEvent motionEvent) {
        if (this.currentEntityView != null) {
            selectEntity(null);
        }
        float x = ((motionEvent.getX() - this.renderView.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / this.renderView.getScaleX();
        float y = ((((motionEvent.getY() - this.renderView.getTranslationY()) - (getMeasuredHeight() / 2.0f)) + AndroidUtilities.dp(32.0f)) - ((getAdditionalTop() - getAdditionalBottom()) / 2.0f)) / this.renderView.getScaleY();
        double d = x;
        double radians = (float) Math.toRadians(-this.renderView.getRotation());
        double d2 = y;
        float fCos = ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2))) + (this.renderView.getMeasuredWidth() / 2.0f);
        float fSin = ((float) ((d * Math.sin(radians)) + (d2 * Math.cos(radians)))) + (this.renderView.getMeasuredHeight() / 2.0f);
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(fCos, fSin);
        this.renderView.onTouch(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public int getAdditionalTop() {
        return AndroidUtilities.dp(48.0f);
    }

    public int getAdditionalBottom() {
        return AndroidUtilities.dp(24.0f);
    }

    public RenderView getRenderView() {
        return this.renderView;
    }

    public void setTransform(float f, float f2, float f3, float f4, float f5) {
        View view;
        float f6;
        float f7;
        float f8;
        float f9;
        this.scale = f;
        this.imageWidth = f4;
        this.imageHeight = f5;
        this.inputTransformX = f2;
        this.inputTransformY = f3;
        this.transformX = f2;
        float f10 = f3 + this.panTranslationY;
        this.transformY = f10;
        int i = 0;
        while (i < 4) {
            if (i == 0) {
                view = this.entitiesView;
            } else if (i == 1) {
                view = this.selectionContainerView;
            } else if (i == 2) {
                view = this.renderView;
            } else {
                view = this.renderInputView;
            }
            MediaController.CropState cropState = this.currentCropState;
            if (cropState != null) {
                float f11 = cropState.cropScale * 1.0f;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (measuredWidth == 0 || measuredHeight == 0) {
                    return;
                }
                MediaController.CropState cropState2 = this.currentCropState;
                int i2 = cropState2.transformRotation;
                if (i2 != 90 && i2 != 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float f12 = measuredHeight;
                float f13 = measuredWidth;
                float fMax = Math.max(f4 / ((int) (cropState2.cropPw * f12)), f5 / ((int) (cropState2.cropPh * f13)));
                f6 = f11 * fMax;
                MediaController.CropState cropState3 = this.currentCropState;
                float f14 = cropState3.cropPx * f12 * f * fMax;
                float f15 = cropState3.cropScale;
                f8 = (f14 * f15) + f2;
                f9 = (cropState3.cropPy * f13 * f * fMax * f15) + f10;
                f7 = cropState3.cropRotate + i2;
            } else {
                f6 = i == 0 ? this.baseScale * 1.0f : 1.0f;
                f7 = 0.0f;
                f8 = f2;
                f9 = f10;
            }
            float f16 = f9 + ((-this.emojiPadding) / 2.0f);
            float f17 = f6 * f;
            if (Float.isNaN(f17)) {
                f17 = 1.0f;
            }
            view.setScaleX(f17);
            view.setScaleY(f17);
            view.setTranslationX(f8);
            view.setTranslationY(f16);
            view.setRotation(f7);
            view.invalidate();
            i++;
        }
        updateEntitiesSelections();
        invalidate();
    }

    public void updateEntitiesSelections() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt == this.currentEntityView || ((childAt instanceof EntityView) && ((EntityView) childAt).isSelectedProgress())) {
                ((EntityView) childAt).updateSelectionView();
            }
        }
    }

    public List<TLRPC.InputDocument> getMasks() {
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int childCount = this.entitiesView.getChildCount();
        ArrayList arrayList = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                TLRPC.Document sticker = ((StickerView) childAt).getSticker();
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputDocument.id = sticker.id;
                tL_inputDocument.access_hash = sticker.access_hash;
                byte[] bArr = sticker.file_reference;
                tL_inputDocument.file_reference = bArr;
                if (bArr == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                arrayList.add(tL_inputDocument);
            } else if (childAt instanceof TextPaintView) {
                CharSequence text = ((TextPaintView) childAt).getText();
                if ((text instanceof Spanned) && (animatedEmojiSpanArr = (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) != null) {
                    for (AnimatedEmojiSpan animatedEmojiSpan : animatedEmojiSpanArr) {
                        if (animatedEmojiSpan != null) {
                            TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                            if (documentFindDocument == null) {
                                documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                            }
                            if (documentFindDocument != null) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                TLRPC.TL_inputDocument tL_inputDocument2 = new TLRPC.TL_inputDocument();
                                tL_inputDocument2.id = documentFindDocument.id;
                                tL_inputDocument2.access_hash = documentFindDocument.access_hash;
                                byte[] bArr2 = documentFindDocument.file_reference;
                                tL_inputDocument2.file_reference = bArr2;
                                if (bArr2 == null) {
                                    tL_inputDocument2.file_reference = new byte[0];
                                }
                                arrayList.add(tL_inputDocument2);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    @Override
    public void onBrushSelected(Brush brush) {
        if ((brush instanceof Brush.Blurer) || (brush instanceof Brush.Eraser)) {
            this.weightChooserView.setMinMax(0.4f, 1.75f);
        } else {
            this.weightChooserView.setMinMax(0.05f, 1.0f);
        }
        this.weightChooserView.setDrawCenter(!(brush instanceof Brush.Shape));
        if (this.renderView.getCurrentBrush() instanceof Brush.Shape) {
            this.ignoreToolChangeAnimationOnce = true;
        }
        this.renderView.setBrush(brush);
        Swatch swatch = this.colorSwatch;
        int i = swatch.color;
        swatch.color = PersistColorPalette.getInstance(this.currentAccount).getCurrentColor();
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(this.colorSwatch, true, Integer.valueOf(i));
        this.renderInputView.invalidate();
    }

    @Override
    public void onTypefaceButtonClicked() {
        showTypefaceMenu(true);
    }

    public void showTypefaceMenu(final boolean z) {
        if (this.isTypefaceMenuShown != z) {
            this.isTypefaceMenuShown = z;
            SpringAnimation springAnimation = this.typefaceMenuTransformAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
            this.typefaceMenuTransformAnimation = springAnimation2;
            springAnimation2.setSpring(new SpringForce().setFinalPosition(z ? 1000.0f : 0.0f).setStiffness(1250.0f).setDampingRatio(1.0f));
            if (z) {
                this.typefaceListView.setAlpha(0.0f);
                this.typefaceListView.setVisibility(0);
            }
            this.typefaceMenuTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    LPhotoPaintView.$r8$lambda$N646AP8eC5eCmfgJjYyyi7hqKwg(this.f$0, dynamicAnimation, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    LPhotoPaintView.m2489$r8$lambda$36iCkhKW197RfNnvW7ITvIfBM(this.f$0, z, dynamicAnimation, z2, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.start();
        }
    }

    public static void $r8$lambda$N646AP8eC5eCmfgJjYyyi7hqKwg(LPhotoPaintView lPhotoPaintView, DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        lPhotoPaintView.typefaceMenuTransformProgress = f3;
        lPhotoPaintView.typefaceListView.setAlpha(f3);
        lPhotoPaintView.typefaceListView.invalidate();
        lPhotoPaintView.overlayLayout.invalidate();
        lPhotoPaintView.textOptionsView.getTypefaceCell().setAlpha(1.0f - lPhotoPaintView.typefaceMenuTransformProgress);
    }

    public static void m2489$r8$lambda$36iCkhKW197RfNnvW7ITvIfBM(LPhotoPaintView lPhotoPaintView, boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == lPhotoPaintView.typefaceMenuTransformAnimation) {
            lPhotoPaintView.typefaceMenuTransformAnimation = null;
            if (!z) {
                lPhotoPaintView.typefaceListView.setVisibility(8);
            }
            lPhotoPaintView.typefaceListView.setMaskProvider(null);
        }
    }

    public void showColorList(final boolean z) {
        if (this.isColorListShown != z) {
            this.isColorListShown = z;
            SpringAnimation springAnimation = this.toolsTransformAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(z ? 0.0f : 1000.0f));
            this.toolsTransformAnimation = springAnimation2;
            springAnimation2.setSpring(new SpringForce().setFinalPosition(z ? 1000.0f : 0.0f).setStiffness(1250.0f).setDampingRatio(1.0f));
            final boolean[] zArr = {this.keyboardVisible || this.emojiViewVisible};
            final float translationY = this.bottomLayout.getTranslationY();
            final ViewGroup barView = getBarView();
            this.toolsTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    LPhotoPaintView.$r8$lambda$kemdRntWWL9MXFRjRpNxyrHEmS4(this.f$0, barView, z, zArr, translationY, dynamicAnimation, f, f2);
                }
            });
            this.toolsTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    LPhotoPaintView.m2497$r8$lambda$Qr9ZfE9Cd5xLmHWQOs8EjmOLzc(this.f$0, z, dynamicAnimation, z2, f, f2);
                }
            });
            this.toolsTransformAnimation.start();
            if (z) {
                this.colorsListView.setVisibility(0);
                this.colorsListView.setSelectedColorIndex(PersistColorPalette.getInstance(this.currentAccount).getCurrentColorPosition());
            }
        }
    }

    public static void $r8$lambda$kemdRntWWL9MXFRjRpNxyrHEmS4(LPhotoPaintView lPhotoPaintView, View view, boolean z, boolean[] zArr, float f, DynamicAnimation dynamicAnimation, float f2, float f3) {
        float f4 = f2 / 1000.0f;
        lPhotoPaintView.toolsTransformProgress = f4;
        float f5 = ((1.0f - f4) * 0.4f) + 0.6f;
        view.setScaleX(f5);
        view.setScaleY(f5);
        view.setTranslationY((AndroidUtilities.dp(16.0f) * Math.min(lPhotoPaintView.toolsTransformProgress, 0.25f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(lPhotoPaintView.toolsTransformProgress, 0.25f) / 0.25f));
        lPhotoPaintView.colorsListView.setProgress(lPhotoPaintView.toolsTransformProgress, z);
        lPhotoPaintView.doneButton.setProgress(lPhotoPaintView.toolsTransformProgress);
        lPhotoPaintView.cancelButton.setProgress(lPhotoPaintView.toolsTransformProgress);
        lPhotoPaintView.tabsLayout.setTranslationY(AndroidUtilities.dp(32.0f) * lPhotoPaintView.toolsTransformProgress);
        if (zArr[0]) {
            lPhotoPaintView.bottomLayout.setTranslationY(f - ((AndroidUtilities.dp(40.0f) * (z ? lPhotoPaintView.toolsTransformProgress : 1.0f - lPhotoPaintView.toolsTransformProgress)) * (z ? 1 : -1)));
        }
        lPhotoPaintView.bottomLayout.invalidate();
        if (view == lPhotoPaintView.textOptionsView) {
            lPhotoPaintView.overlayLayout.invalidate();
        }
    }

    public static void m2497$r8$lambda$Qr9ZfE9Cd5xLmHWQOs8EjmOLzc(LPhotoPaintView lPhotoPaintView, boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == lPhotoPaintView.toolsTransformAnimation) {
            lPhotoPaintView.toolsTransformAnimation = null;
            if (z) {
                return;
            }
            lPhotoPaintView.colorsListView.setVisibility(8);
            PersistColorPalette.getInstance(lPhotoPaintView.currentAccount).saveColors();
            lPhotoPaintView.colorsListView.getAdapter().notifyDataSetChanged();
        }
    }

    public void setCurrentSwatch(Swatch swatch, boolean z) {
        setCurrentSwatch(swatch, z, null);
    }

    private void setCurrentSwatch(Swatch swatch, boolean z, final Integer num) {
        Swatch swatch2 = this.colorSwatch;
        if (swatch2 != swatch) {
            swatch2.color = swatch.color;
            swatch2.colorLocation = swatch.colorLocation;
            swatch2.brushWeight = swatch.brushWeight;
            PersistColorPalette.getInstance(this.currentAccount).selectColor(swatch.color);
            PersistColorPalette.getInstance(this.currentAccount).setCurrentWeight(swatch.brushWeight);
        }
        this.renderView.setColor(swatch.color);
        this.renderView.setBrushSize(swatch.brushWeight);
        if (z) {
            final int i = this.colorSwatch.color;
            if (num != null && num.intValue() != i) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LPhotoPaintView.m2505$r8$lambda$n9dOsksmo6natzl2yAPwqKAEZA(this.f$0, num, i, valueAnimator);
                    }
                });
                duration.start();
            } else {
                FrameLayout frameLayout = this.bottomLayout;
                if (frameLayout != null) {
                    frameLayout.invalidate();
                }
            }
        }
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setSwatch(new Swatch(swatch.color, swatch.colorLocation, swatch.brushWeight));
        }
    }

    public static void m2505$r8$lambda$n9dOsksmo6natzl2yAPwqKAEZA(LPhotoPaintView lPhotoPaintView, Integer num, int i, ValueAnimator valueAnimator) {
        lPhotoPaintView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        lPhotoPaintView.colorSwatch.color = ColorUtils.blendARGB(num.intValue(), i, fFloatValue);
        FrameLayout frameLayout = lPhotoPaintView.bottomLayout;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    public boolean onBackPressed() {
        if (this.isColorListShown) {
            showColorList(false);
            return true;
        }
        if (this.emojiViewVisible) {
            hideEmojiPopup(true);
            return true;
        }
        if (!this.editingText) {
            return false;
        }
        selectEntity(null);
        return true;
    }

    @Override
    public void onColorPickerSelected() {
        showColorList(true);
    }

    @Override
    public void onTextOutlineSelected(View view) {
        setTextType((this.selectedTextType + 1) % 4);
    }

    private PopupButton buttonForPopup(String str, int i, boolean z, final Runnable runnable) {
        PopupButton popupButton = new PopupButton(getContext());
        popupButton.setIcon(i);
        popupButton.setText(str);
        popupButton.setSelected(z);
        if (runnable != null) {
            popupButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable.run();
                }
            });
        }
        return popupButton;
    }

    public class PopupButton extends LinearLayout {
        ImageView checkView;
        ImageView image2View;
        ValueAnimator imageSwitchAnimator;
        boolean imageSwitchFill;
        float imageSwitchT;
        ImageView imageView;
        FrameLayout imagesView;
        public TextView textView;

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        public PopupButton(Context context) {
            super(context);
            setOrientation(0);
            setBackground(Theme.getSelectorDrawable(Theme.getColor(Theme.key_listSelector, LPhotoPaintView.this.resourcesProvider), false));
            FrameLayout frameLayout = new FrameLayout(context) {
                Path path = new Path();

                @Override
                protected boolean drawChild(Canvas canvas, View view, long j) {
                    boolean z;
                    PopupButton popupButton = PopupButton.this;
                    if (popupButton.imageSwitchAnimator != null && (((z = popupButton.imageSwitchFill) && view == popupButton.image2View) || (!z && view == popupButton.imageView))) {
                        float measuredWidth = ((z ? popupButton.imageSwitchT : 1.0f - popupButton.imageSwitchT) * getMeasuredWidth()) / 2.0f;
                        canvas.save();
                        this.path.rewind();
                        this.path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                        canvas.clipPath(this.path);
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    }
                    return super.drawChild(canvas, view, j);
                }
            };
            this.imagesView = frameLayout;
            addView(frameLayout, LayoutHelper.createLinear(-2, -2, 19, 16, 0, 16, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            ImageView imageView2 = this.imageView;
            int i = Theme.key_actionBarDefaultSubmenuItem;
            imageView2.setColorFilter(LPhotoPaintView.this.getThemedColor(i));
            this.imagesView.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(scaleType);
            this.image2View.setColorFilter(LPhotoPaintView.this.getThemedColor(i));
            this.image2View.setVisibility(8);
            this.imagesView.addView(this.image2View, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(LPhotoPaintView.this.getThemedColor(i));
            this.textView.setTextSize(1, 16.0f);
            addView(this.textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
            ImageView imageView4 = new ImageView(context);
            this.checkView = imageView4;
            imageView4.setImageResource(R.drawable.msg_text_check);
            this.checkView.setScaleType(scaleType);
            this.checkView.setColorFilter(new PorterDuffColorFilter(LPhotoPaintView.this.getThemedColor(Theme.key_radioBackgroundChecked), PorterDuff.Mode.MULTIPLY));
            this.checkView.setVisibility(8);
            addView(this.checkView, LayoutHelper.createLinear(50, -1));
        }

        @Override
        public void setSelected(boolean z) {
            this.checkView.setVisibility(z ? 0 : 8);
        }

        public void setText(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        public void setIcon(int i) {
            setIcon(i, true, false);
        }

        public void setIcon(int i, final boolean z, boolean z2) {
            if (z2) {
                ValueAnimator valueAnimator = this.imageSwitchAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.imageSwitchAnimator = null;
                    setIcon(i, false, false);
                    return;
                }
                this.imageSwitchFill = z;
                this.image2View.setImageResource(i);
                this.image2View.setVisibility(0);
                this.image2View.setAlpha(1.0f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.imageSwitchAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        LPhotoPaintView.PopupButton.m2512$r8$lambda$Eff9JH2inrzK8PeGVT1oJW9SDQ(this.f$0, z, valueAnimator2);
                    }
                });
                this.imageSwitchAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        PopupButton popupButton = PopupButton.this;
                        ImageView imageView = popupButton.imageView;
                        popupButton.imageView = popupButton.image2View;
                        popupButton.image2View = imageView;
                        imageView.bringToFront();
                        PopupButton.this.image2View.setVisibility(8);
                        PopupButton.this.imageSwitchAnimator = null;
                    }
                });
                this.imageSwitchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.imageSwitchAnimator.setDuration(420L);
                this.imageSwitchAnimator.start();
                return;
            }
            this.imageView.setImageResource(i);
        }

        public static void m2512$r8$lambda$Eff9JH2inrzK8PeGVT1oJW9SDQ(PopupButton popupButton, boolean z, ValueAnimator valueAnimator) {
            popupButton.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            popupButton.imageSwitchT = fFloatValue;
            if (!z) {
                popupButton.imageView.setAlpha(1.0f - fFloatValue);
            }
            popupButton.imagesView.invalidate();
        }

        @Override
        public boolean performClick() {
            if (LPhotoPaintView.this.popupWindow != null && LPhotoPaintView.this.popupWindow.isShowing()) {
                LPhotoPaintView.this.popupWindow.dismiss(true);
            }
            return super.performClick();
        }
    }

    private void setTextType(int i) {
        this.selectedTextType = i;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setType(i);
        }
        PersistColorPalette.getInstance(this.currentAccount).setCurrentTextType(i);
        this.textOptionsView.setOutlineType(i);
    }

    @Override
    public void onNewTextSelected() {
        if (this.keyboardVisible || this.emojiViewVisible) {
            onEmojiButtonClick();
        } else {
            createText(true);
        }
    }

    public void onTypefaceSelected(PaintTypeface paintTypeface) {
        PersistColorPalette.getInstance(this.currentAccount).setCurrentTypeface(paintTypeface.getKey());
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            ((TextPaintView) entityView).setTypeface(paintTypeface);
        }
    }

    @Override
    public void onTextAlignmentSelected(int i) {
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            setTextAlignment((TextPaintView) entityView, i);
            PersistColorPalette.getInstance(this.currentAccount).setCurrentAlignment(i);
        }
    }

    private void setTextAlignment(TextPaintView textPaintView, int i) {
        int i2;
        textPaintView.setAlign(i);
        int i3 = 2;
        if (i != 1) {
            i2 = i != 2 ? 19 : 21;
        } else {
            i2 = 17;
        }
        textPaintView.getEditText().setGravity(i2);
        if (i == 1) {
            i3 = 4;
        } else if (i == 2 ? !LocaleController.isRTL : LocaleController.isRTL) {
            i3 = 3;
        }
        textPaintView.getEditText().setTextAlignment(i3);
    }

    @Override
    public void onAddButtonPressed(View view) {
        showPopup(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.m2501$r8$lambda$TlQTF2w4hfbTqI6xnw4ItXXX5w(this.f$0);
            }
        }, this, 53, 0, getHeight());
    }

    public static void m2501$r8$lambda$TlQTF2w4hfbTqI6xnw4ItXXX5w(final LPhotoPaintView lPhotoPaintView) {
        boolean fillShapes = PersistColorPalette.getInstance(lPhotoPaintView.currentAccount).getFillShapes();
        for (int i = 0; i < Brush.Shape.SHAPES_LIST.size(); i++) {
            final Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
            final int filledIconRes = fillShapes ? shape.getFilledIconRes() : shape.getIconRes();
            PopupButton popupButtonButtonForPopup = lPhotoPaintView.buttonForPopup(shape.getShapeName(), filledIconRes, false, new Runnable() {
                @Override
                public final void run() {
                    LPhotoPaintView.$r8$lambda$8NEmApo8BNKTpgT2YdP2k0NM79U(this.f$0, shape, filledIconRes);
                }
            });
            popupButtonButtonForPopup.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    return LPhotoPaintView.m2494$r8$lambda$DWWZCu5z4mcpQ3uTGjpmDRZrpU(this.f$0, view);
                }
            });
            lPhotoPaintView.popupLayout.addView((View) popupButtonButtonForPopup, LayoutHelper.createLinear(-1, 48));
        }
    }

    public static void $r8$lambda$8NEmApo8BNKTpgT2YdP2k0NM79U(LPhotoPaintView lPhotoPaintView, Brush.Shape shape, int i) {
        if (lPhotoPaintView.renderView.getCurrentBrush() instanceof Brush.Shape) {
            lPhotoPaintView.ignoreToolChangeAnimationOnce = true;
        }
        lPhotoPaintView.onBrushSelected(shape);
        lPhotoPaintView.paintToolsView.animatePlusToIcon(i);
    }

    public static boolean m2494$r8$lambda$DWWZCu5z4mcpQ3uTGjpmDRZrpU(LPhotoPaintView lPhotoPaintView, View view) {
        if (lPhotoPaintView.popupLayout != null) {
            PersistColorPalette.getInstance(lPhotoPaintView.currentAccount).toggleFillShapes();
            boolean fillShapes = PersistColorPalette.getInstance(lPhotoPaintView.currentAccount).getFillShapes();
            for (int i = 0; i < lPhotoPaintView.popupLayout.getItemsCount(); i++) {
                View itemAt = lPhotoPaintView.popupLayout.getItemAt(i);
                if (itemAt instanceof PopupButton) {
                    Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
                    ((PopupButton) itemAt).setIcon(fillShapes ? shape.getFilledIconRes() : shape.getIconRes(), fillShapes, true);
                }
            }
        }
        return true;
    }

    private void showMenuForEntity(final EntityView entityView) {
        int[] centerLocationInWindow = getCenterLocationInWindow(entityView);
        showPopup(new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.$r8$lambda$F6s3G8KVne5t1V3VsNZnZBxfiSk(this.f$0, entityView);
            }
        }, this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f));
    }

    public static void $r8$lambda$F6s3G8KVne5t1V3VsNZnZBxfiSk(final LPhotoPaintView lPhotoPaintView, final EntityView entityView) {
        float f;
        lPhotoPaintView.getClass();
        LinearLayout linearLayout = new LinearLayout(lPhotoPaintView.getContext());
        linearLayout.setOrientation(0);
        TextView textView = new TextView(lPhotoPaintView.getContext());
        int i = Theme.key_actionBarDefaultSubmenuItem;
        textView.setTextColor(lPhotoPaintView.getThemedColor(i));
        textView.setBackground(Theme.getSelectorDrawable(false));
        textView.setGravity(16);
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(0);
        textView.setText(LocaleController.getString(R.string.PaintDelete));
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LPhotoPaintView.$r8$lambda$qfuBwUAOOXn9jAMCdF5w1pkFOmI(this.f$0, entityView, view);
            }
        });
        linearLayout.addView(textView, LayoutHelper.createLinear(-2, 48));
        if (entityView instanceof TextPaintView) {
            TextView textView2 = new TextView(lPhotoPaintView.getContext());
            textView2.setTextColor(lPhotoPaintView.getThemedColor(i));
            textView2.setBackground(Theme.getSelectorDrawable(false));
            textView2.setGravity(16);
            textView2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView2.setTextSize(1, 14.0f);
            textView2.setEllipsize(truncateAt);
            textView2.setTag(1);
            textView2.setText(LocaleController.getString(R.string.PaintEdit));
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LPhotoPaintView.m2510$r8$lambda$zN7w4QgRHGkrgGdducCPIBIodA(this.f$0, view);
                }
            });
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 48));
        }
        if (entityView instanceof StickerView) {
            TextView textView3 = new TextView(lPhotoPaintView.getContext());
            textView3.setTextColor(lPhotoPaintView.getThemedColor(i));
            textView3.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            textView3.setGravity(16);
            textView3.setEllipsize(truncateAt);
            textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView3.setTextSize(1, 14.0f);
            textView3.setTag(2);
            textView3.setText(LocaleController.getString(R.string.Flip));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LPhotoPaintView.m2503$r8$lambda$goobWyh7IVU8E38RcBXBUdGdg(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 48));
        }
        boolean z = entityView instanceof PhotoView;
        if (z) {
            f = 16.0f;
        } else {
            TextView textView4 = new TextView(lPhotoPaintView.getContext());
            textView4.setTextColor(lPhotoPaintView.getThemedColor(i));
            textView4.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            textView4.setGravity(16);
            textView4.setEllipsize(truncateAt);
            f = 16.0f;
            textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(16.0f), 0);
            textView4.setTextSize(1, 14.0f);
            textView4.setTag(2);
            textView4.setText(LocaleController.getString(R.string.PaintDuplicate));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LPhotoPaintView.m2504$r8$lambda$iqA66xj6ykRteA_kTSRc4Fdqis(this.f$0, view);
                }
            });
            linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 48));
        }
        if (z) {
            final PhotoView photoView = (PhotoView) entityView;
            if (photoView.hasSegmentedImage()) {
                TextView textView5 = new TextView(lPhotoPaintView.getContext());
                textView5.setTextColor(lPhotoPaintView.getThemedColor(i));
                textView5.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                textView5.setGravity(16);
                textView5.setEllipsize(truncateAt);
                textView5.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(f), 0);
                textView5.setTextSize(1, 14.0f);
                textView5.setTag(5);
                textView5.setText(LocaleController.getString(photoView.isSegmented() ? R.string.SegmentationUndoCutOut : R.string.SegmentationCutOut));
                textView5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LPhotoPaintView.m2499$r8$lambda$SGUq_ctSfJh7AeJ90aD9CYlwdc(this.f$0, photoView, view);
                    }
                });
                linearLayout.addView(textView5, LayoutHelper.createLinear(-2, 44));
                photoView.highlightSegmented();
            }
        }
        lPhotoPaintView.popupLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        linearLayout.setLayoutParams(layoutParams);
    }

    public static void $r8$lambda$qfuBwUAOOXn9jAMCdF5w1pkFOmI(LPhotoPaintView lPhotoPaintView, EntityView entityView, View view) {
        lPhotoPaintView.removeEntity(entityView);
        ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        lPhotoPaintView.popupWindow.dismiss(true);
    }

    public static void m2510$r8$lambda$zN7w4QgRHGkrgGdducCPIBIodA(LPhotoPaintView lPhotoPaintView, View view) {
        lPhotoPaintView.editSelectedTextEntity();
        ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        lPhotoPaintView.popupWindow.dismiss(true);
    }

    public static void m2503$r8$lambda$goobWyh7IVU8E38RcBXBUdGdg(LPhotoPaintView lPhotoPaintView, EntityView entityView, View view) {
        lPhotoPaintView.getClass();
        ((StickerView) entityView).mirror(true);
        ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        lPhotoPaintView.popupWindow.dismiss(true);
    }

    public static void m2504$r8$lambda$iqA66xj6ykRteA_kTSRc4Fdqis(LPhotoPaintView lPhotoPaintView, View view) {
        lPhotoPaintView.duplicateSelectedEntity();
        ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        lPhotoPaintView.popupWindow.dismiss(true);
    }

    public static void m2499$r8$lambda$SGUq_ctSfJh7AeJ90aD9CYlwdc(LPhotoPaintView lPhotoPaintView, PhotoView photoView, View view) {
        lPhotoPaintView.getClass();
        photoView.toggleSegmented(true);
        if (photoView.isSegmented()) {
            lPhotoPaintView.onSwitchSegmentedAnimation(photoView);
        }
        ActionBarPopupWindow actionBarPopupWindow = lPhotoPaintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        lPhotoPaintView.popupWindow.dismiss(true);
    }

    private void duplicateSelectedEntity() {
        EntityView entityView;
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            return;
        }
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(entityView2);
        EntityView entityView3 = this.currentEntityView;
        if (entityView3 instanceof StickerView) {
            EntityView stickerView = new StickerView(getContext(), (StickerView) this.currentEntityView, pointFStartPositionRelativeToEntity);
            stickerView.setDelegate(this);
            this.entitiesView.addView(stickerView);
            entityView = stickerView;
        } else if (entityView3 instanceof TextPaintView) {
            TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) this.currentEntityView, pointFStartPositionRelativeToEntity);
            textPaintView.setDelegate(this);
            textPaintView.setMaxWidth((int) (getPaintingSize().width - 20.0f));
            this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
            entityView = textPaintView;
        } else {
            entityView = null;
        }
        registerRemovalUndo(entityView);
        selectEntity(entityView);
    }

    private PointF startPositionRelativeToEntity(EntityView entityView) {
        MediaController.CropState cropState = this.currentCropState;
        float f = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (entityView != null) {
            PointF position = entityView.getPosition();
            return new PointF(position.x + f, position.y + f);
        }
        float f2 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF pointFCenterPositionForEntity = centerPositionForEntity();
        while (true) {
            boolean z = false;
            for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
                View childAt = this.entitiesView.getChildAt(i);
                if (childAt instanceof EntityView) {
                    PointF position2 = ((EntityView) childAt).getPosition();
                    if (((float) Math.sqrt(Math.pow(position2.x - pointFCenterPositionForEntity.x, 2.0d) + Math.pow(position2.y - pointFCenterPositionForEntity.y, 2.0d))) < f2) {
                        z = true;
                    }
                }
            }
            if (!z) {
                return pointFCenterPositionForEntity;
            }
            pointFCenterPositionForEntity = new PointF(pointFCenterPositionForEntity.x + f, pointFCenterPositionForEntity.y + f);
        }
    }

    private void showPopup(Runnable runnable, View view, int i, int i2, int i3) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), this.resourcesProvider);
            this.popupLayout = actionBarPopupWindowLayout;
            actionBarPopupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setBackgroundColor(-14145495);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return LPhotoPaintView.$r8$lambda$saEbC3L5nQVUU_5gLJQhhQjm3z8(this.f$0, view2, motionEvent);
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    LPhotoPaintView.$r8$lambda$SXYclXqRZ9i87Y4PbPJD_NEnMUA(this.f$0, keyEvent);
                }
            });
            this.popupLayout.setShownFromBottom(true);
        }
        this.popupLayout.removeInnerViews();
        runnable.run();
        if (this.popupWindow == null) {
            ActionBarPopupWindow actionBarPopupWindow2 = new ActionBarPopupWindow(this.popupLayout, -2, -2);
            this.popupWindow = actionBarPopupWindow2;
            actionBarPopupWindow2.setAnimationEnabled(true);
            this.popupWindow.setAnimationStyle(R.style.PopupAnimation);
            this.popupWindow.setOutsideTouchable(true);
            this.popupWindow.setClippingEnabled(true);
            this.popupWindow.setInputMethodMode(2);
            this.popupWindow.setSoftInputMode(0);
            this.popupWindow.getContentView().setFocusableInTouchMode(true);
            this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    this.f$0.popupLayout.removeInnerViews();
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
        ActionBarPopupWindow.startAnimation(this.popupLayout);
    }

    public static boolean $r8$lambda$saEbC3L5nQVUU_5gLJQhhQjm3z8(LPhotoPaintView lPhotoPaintView, View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        lPhotoPaintView.getClass();
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = lPhotoPaintView.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(lPhotoPaintView.popupRect);
        if (lPhotoPaintView.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        lPhotoPaintView.popupWindow.dismiss();
        return false;
    }

    public static void $r8$lambda$SXYclXqRZ9i87Y4PbPJD_NEnMUA(LPhotoPaintView lPhotoPaintView, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        lPhotoPaintView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = lPhotoPaintView.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            lPhotoPaintView.popupWindow.dismiss();
        }
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public PersistColorPalette onGetPalette() {
        return PersistColorPalette.getInstance(this.currentAccount);
    }

    private Size baseStickerSize() {
        float fFloor = (float) Math.floor(((double) getPaintingSize().width) * 0.5d);
        return new Size(fFloor, fFloor);
    }

    private PointF centerPositionForEntity() {
        Size paintingSize = getPaintingSize();
        float f = paintingSize.width / 2.0f;
        float f2 = paintingSize.height / 2.0f;
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            double radians = (float) Math.toRadians(-(cropState.transformRotation + cropState.cropRotate));
            float fCos = (float) ((((double) this.currentCropState.cropPx) * Math.cos(radians)) - (((double) this.currentCropState.cropPy) * Math.sin(radians)));
            float fSin = (float) ((((double) this.currentCropState.cropPx) * Math.sin(radians)) + (((double) this.currentCropState.cropPy) * Math.cos(radians)));
            f -= fCos * paintingSize.width;
            f2 -= fSin * paintingSize.height;
        }
        return new PointF(f, f2);
    }

    private StickerPosition calculateStickerPosition(TLRPC.Document document) {
        TLRPC.TL_maskCoords tL_maskCoords;
        float f;
        ArrayList arrayList;
        int i;
        PhotoFace randomFaceWithVacantAnchor;
        int i2 = 0;
        while (true) {
            if (i2 >= document.attributes.size()) {
                tL_maskCoords = null;
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                tL_maskCoords = documentAttribute.mask_coords;
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
        if (tL_maskCoords == null || (arrayList = this.faces) == null || arrayList.size() == 0 || (randomFaceWithVacantAnchor = getRandomFaceWithVacantAnchor((i = tL_maskCoords.n), document.id, tL_maskCoords)) == null) {
            return stickerPosition;
        }
        PointF pointForAnchor = randomFaceWithVacantAnchor.getPointForAnchor(i);
        float widthForAnchor = randomFaceWithVacantAnchor.getWidthForAnchor(i);
        float angle = randomFaceWithVacantAnchor.getAngle();
        float f3 = (float) (((double) (widthForAnchor / baseStickerSize().width)) * tL_maskCoords.zoom);
        double radians = (float) Math.toRadians(angle);
        double d = 1.5707963267948966d - radians;
        double d2 = widthForAnchor;
        double d3 = radians + 1.5707963267948966d;
        return new StickerPosition(new PointF(pointForAnchor.x + ((float) (Math.sin(d) * d2 * tL_maskCoords.x)) + ((float) (Math.cos(d3) * d2 * tL_maskCoords.y)), pointForAnchor.y + ((float) (Math.cos(d) * d2 * tL_maskCoords.x)) + ((float) (Math.sin(d3) * d2 * tL_maskCoords.y))), f3, angle);
    }

    private PhotoFace getRandomFaceWithVacantAnchor(int i, long j, TLRPC.TL_maskCoords tL_maskCoords) {
        if (i >= 0 && i <= 3 && !this.faces.isEmpty()) {
            int size = this.faces.size();
            int iNextInt = Utilities.random.nextInt(size);
            int i2 = size;
            while (i2 > 0) {
                PhotoFace photoFace = (PhotoFace) this.faces.get(iNextInt);
                int i3 = i;
                long j2 = j;
                TLRPC.TL_maskCoords tL_maskCoords2 = tL_maskCoords;
                if (!isFaceAnchorOccupied(photoFace, i3, j2, tL_maskCoords2)) {
                    return photoFace;
                }
                iNextInt = (iNextInt + 1) % size;
                i2--;
                i = i3;
                j = j2;
                tL_maskCoords = tL_maskCoords2;
            }
        }
        return null;
    }

    private boolean isFaceAnchorOccupied(PhotoFace photoFace, int i, long j, TLRPC.TL_maskCoords tL_maskCoords) {
        PointF pointForAnchor = photoFace.getPointForAnchor(i);
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
                    PointF position = stickerView.getPosition();
                    float fHypot = (float) Math.hypot(position.x - pointForAnchor.x, position.y - pointForAnchor.y);
                    if ((j == stickerView.getSticker().id || this.faces.size() > 1) && fHypot < widthForAnchor) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private StickerView createSticker(Object obj, TLRPC.Document document, boolean z) {
        StickerPosition stickerPositionCalculateStickerPosition = calculateStickerPosition(document);
        StickerView stickerView = new StickerView(getContext(), stickerPositionCalculateStickerPosition.position, stickerPositionCalculateStickerPosition.angle, stickerPositionCalculateStickerPosition.scale, baseStickerSize(), document, obj) {
            @Override
            protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                LPhotoPaintView.this.didSetAnimatedSticker(rLottieDrawable);
            }
        };
        if (MessageObject.isTextColorEmoji(document)) {
            stickerView.centerImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        stickerView.centerImage.setLayerNum(12);
        if (stickerPositionCalculateStickerPosition.position.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            stickerView.setStickyX(2);
        }
        if (stickerPositionCalculateStickerPosition.position.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            stickerView.setStickyY(2);
        }
        stickerView.setDelegate(this);
        this.entitiesView.addView(stickerView);
        if (z) {
            registerRemovalUndo(stickerView);
            selectEntity(stickerView);
        }
        return stickerView;
    }

    public void removeEntity(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2 && entityView2 != null) {
            entityView2.deselect();
            this.currentEntityView = null;
            if (entityView instanceof TextPaintView) {
                ValueAnimator valueAnimator = this.tabsSelectionAnimator;
                if (valueAnimator != null && this.tabsNewSelectedIndex != 0) {
                    valueAnimator.cancel();
                }
                switchTab(0);
            }
        }
        this.entitiesView.removeView(entityView);
        if (entityView != null) {
            this.undoStore.unregisterUndo(entityView.getUUID());
        }
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.weightChooserView.setShowPreview(true);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(this.colorSwatch, true);
    }

    private void registerRemovalUndo(final EntityView entityView) {
        if (entityView == null) {
            return;
        }
        this.undoStore.registerUndo(entityView.getUUID(), new Runnable() {
            @Override
            public final void run() {
                this.f$0.removeEntity(entityView);
            }
        });
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
    public void getTransformedTouch(float f, float f2, float[] fArr) {
        Point point = AndroidUtilities.displaySize;
        float f3 = f - (point.x / 2.0f);
        float f4 = f2 - (point.y / 2.0f);
        double d = f3;
        double radians = (float) Math.toRadians(-this.entitiesView.getRotation());
        double d2 = f4;
        fArr[0] = ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2))) + (AndroidUtilities.displaySize.x / 2.0f);
        fArr[1] = ((float) ((d * Math.sin(radians)) + (d2 * Math.cos(radians)))) + (AndroidUtilities.displaySize.y / 2.0f);
    }

    @Override
    public int[] getCenterLocation(EntityView entityView) {
        return getCenterLocationInWindow(entityView);
    }

    private int[] getCenterLocationInWindow(View view) {
        this.position[0] = view.getWidth() / 2.0f;
        this.position[1] = view.getHeight() / 2.0f;
        view.getMatrix().mapPoints(this.position);
        float[] fArr = this.position;
        fArr[0] = fArr[0] + view.getLeft();
        float[] fArr2 = this.position;
        fArr2[1] = fArr2[1] + view.getTop();
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            float[] fArr3 = this.position;
            fArr3[0] = fArr3[0] - view2.getScrollX();
            float[] fArr4 = this.position;
            fArr4[1] = fArr4[1] - view2.getScrollY();
            view2.getMatrix().mapPoints(this.position);
            float[] fArr5 = this.position;
            fArr5[0] = fArr5[0] + view2.getLeft();
            float[] fArr6 = this.position;
            fArr6[1] = fArr6[1] + view2.getTop();
            parent = view2.getParent();
        }
        this.pos2[0] = Math.round(this.position[0]);
        this.pos2[1] = Math.round(this.position[1]);
        int[] iArr = this.pos2;
        float f = iArr[0];
        Point point = AndroidUtilities.displaySize;
        float f2 = f - (point.x / 2.0f);
        float f3 = iArr[1] - (point.y / 2.0f);
        double d = f2;
        double radians = (float) Math.toRadians(-this.entitiesView.getRotation());
        double d2 = f3;
        this.pos2[0] = ((int) ((Math.cos(radians) * d) - (Math.sin(radians) * d2))) + (AndroidUtilities.displaySize.x / 2);
        this.pos2[1] = ((int) ((d * Math.sin(radians)) + (d2 * Math.cos(radians)))) + (AndroidUtilities.displaySize.y / 2);
        return this.pos2;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean allowInteraction(EntityView entityView) {
        return !this.editingText;
    }

    public float getCropRotation() {
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            return cropState.cropRotate + cropState.transformRotation;
        }
        return 0.0f;
    }

    private static class StickerPosition {
        private float angle;
        private PointF position;
        private float scale;

        StickerPosition(PointF pointF, float f, float f2) {
            this.position = pointF;
            this.scale = f;
            this.angle = f2;
        }
    }

    public void onEmojiButtonClick() {
        boolean z = this.emojiViewVisible;
        if (z && (this.currentEntityView instanceof TextPaintView)) {
            this.bottomPanelIgnoreOnce = true;
        }
        if (z) {
            onEmojiViewCloseByClick();
        }
        showEmojiPopup(1 ^ (this.emojiViewVisible ? 1 : 0));
        if (z) {
            EntityView entityView = this.currentEntityView;
            if (entityView instanceof TextPaintView) {
                AndroidUtilities.showKeyboard(((TextPaintView) entityView).getEditText());
            }
        }
    }

    private void showEmojiPopup(int i) {
        this.bottomPanelIgnoreOnce = false;
        if (i == 1) {
            EmojiView emojiView = this.emojiView;
            boolean z = emojiView != null && emojiView.getVisibility() == 0;
            createEmojiView();
            this.emojiView.setVisibility(0);
            this.emojiViewWasVisible = this.emojiViewVisible;
            this.emojiViewVisible = true;
            EmojiView emojiView2 = this.emojiView;
            if (this.keyboardHeight <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeight = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeight = MessagesController.getGlobalEmojiSettings().getInt("kbd_height", AndroidUtilities.dp(200.0f));
                }
            }
            if (this.keyboardHeightLand <= 0) {
                if (AndroidUtilities.isTablet()) {
                    this.keyboardHeightLand = AndroidUtilities.dp(150.0f);
                } else {
                    this.keyboardHeightLand = MessagesController.getGlobalEmojiSettings().getInt("kbd_height_land3", AndroidUtilities.dp(200.0f));
                }
            }
            Point point = AndroidUtilities.displaySize;
            int i2 = point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
            layoutParams.height = i2;
            emojiView2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                EntityView entityView = this.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getEditText());
                }
            }
            this.emojiWasPadding = i2;
            this.emojiPadding = i2;
            requestLayout();
            updateKeyboard();
            ChatActivityEnterViewAnimatedIconView emojiButton = this.textOptionsView.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            onWindowSizeChanged();
            if (z || this.keyboardVisible) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LPhotoPaintView.m2493$r8$lambda$CtoDuoA6UT4ARwltOYf5W78NRs(this.f$0, valueAnimator);
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    LPhotoPaintView.this.emojiView.setTranslationY(0.0f);
                }
            });
            valueAnimatorOfFloat.start();
            return;
        }
        ChatActivityEnterViewAnimatedIconView emojiButton2 = this.textOptionsView.getEmojiButton();
        if (emojiButton2 != null) {
            emojiButton2.setState(ChatActivityEnterViewAnimatedIconView.State.SMILE, true);
        }
        EmojiView emojiView3 = this.emojiView;
        if (emojiView3 != null) {
            this.emojiViewWasVisible = this.emojiViewVisible;
            this.emojiViewVisible = false;
            if (AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow) {
                emojiView3.setVisibility(8);
            }
        }
        if (i == 0) {
            this.emojiPadding = 0;
        }
        updateKeyboard();
        requestLayout();
        onWindowSizeChanged();
    }

    public static void m2493$r8$lambda$CtoDuoA6UT4ARwltOYf5W78NRs(LPhotoPaintView lPhotoPaintView, ValueAnimator valueAnimator) {
        lPhotoPaintView.getClass();
        lPhotoPaintView.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void hideEmojiPopup(boolean z) {
        if (this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null && emojiView.getVisibility() == 0 && !this.waitingForKeyboardOpen) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                this.bottomPanelIgnoreOnce = false;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LPhotoPaintView.$r8$lambda$oe58j3atEzEtB3mdDQrDMGvDvC0(this.f$0, valueAnimator);
                    }
                });
                this.isAnimatePopupClosing = true;
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                        lPhotoPaintView.isAnimatePopupClosing = false;
                        lPhotoPaintView.emojiView.setTranslationY(0.0f);
                        LPhotoPaintView.this.hideEmojiView();
                    }
                });
                valueAnimatorOfFloat.setDuration(250L);
                valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                valueAnimatorOfFloat.start();
                return;
            }
            hideEmojiView();
        }
    }

    public static void $r8$lambda$oe58j3atEzEtB3mdDQrDMGvDvC0(LPhotoPaintView lPhotoPaintView, ValueAnimator valueAnimator) {
        lPhotoPaintView.getClass();
        lPhotoPaintView.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public int getEmojiPadding(boolean z) {
        if (this.translateBottomPanelAfterResize && z) {
            bottomPanelTranslationY(0.0f, 1.0f);
        }
        if (this.keyboardVisible && this.translateBottomPanelAfterResize && !z) {
            return 0;
        }
        return this.emojiPadding;
    }

    public void hideEmojiView() {
        EmojiView emojiView;
        if (this.emojiPadding > 0) {
            updateKeyboard();
        }
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        this.emojiPadding = 0;
    }

    private void onWindowSizeChanged() {
        getHeight();
    }

    @Override
    public void onSizeChanged(int i, boolean z) {
        boolean z2;
        if (i > AndroidUtilities.dp(50.0f) && this.keyboardVisible && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
            if (z) {
                this.keyboardHeightLand = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height_land3", this.keyboardHeightLand).commit();
            } else {
                this.keyboardHeight = i;
                MessagesController.getGlobalEmojiSettings().edit().putInt("kbd_height", this.keyboardHeight).commit();
            }
        }
        if (this.emojiViewVisible) {
            int i2 = z ? this.keyboardHeightLand : this.keyboardHeight;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = AndroidUtilities.displaySize.x;
            if (i3 != i4 || layoutParams.height != i2) {
                layoutParams.width = i4;
                layoutParams.height = i2;
                this.emojiView.setLayoutParams(layoutParams);
                int i5 = layoutParams.height;
                this.emojiWasPadding = i5;
                this.emojiPadding = i5;
                requestLayout();
                updateKeyboard();
                onWindowSizeChanged();
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            onWindowSizeChanged();
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            this.keyboardVisible = ((TextPaintView) entityView).getEditText().isFocused() && i > 0;
        } else {
            this.keyboardVisible = false;
        }
        if (this.keyboardVisible && this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            requestLayout();
            updateKeyboard();
        }
        if (z3 && !this.keyboardVisible && this.emojiPadding > 0 && this.translateBottomPanelAfterResize) {
            this.translateBottomPanelAfterResize = false;
            bottomPanelTranslationY(0.0f, 1.0f);
            this.weightChooserView.stopPanTransition();
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        onWindowSizeChanged();
    }

    public void updatePlusEmojiKeyboardButton() {
        PaintTextOptionsView paintTextOptionsView = this.textOptionsView;
        if (paintTextOptionsView != null) {
            if (this.keyboardVisible) {
                paintTextOptionsView.animatePlusToIcon(R.drawable.input_smile);
            } else if (this.emojiViewVisible) {
                paintTextOptionsView.animatePlusToIcon(R.drawable.input_keyboard);
            } else {
                paintTextOptionsView.animatePlusToIcon(R.drawable.msg_add);
            }
        }
        AndroidUtilities.updateViewShow(this.undoAllButton, (this.keyboardVisible || this.emojiViewVisible) ? false : true, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.undoButton, (this.keyboardVisible || this.emojiViewVisible) ? false : true, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.doneTextButton, this.keyboardVisible || this.emojiViewVisible, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.cancelTextButton, this.keyboardVisible || this.emojiViewVisible, false, 1.0f, true, null);
    }

    protected void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.allowEmojisForNonPremium(true);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass21());
        addView(this.emojiView);
    }

    class AnonymousClass21 implements EmojiView.EmojiViewDelegate {
        int innerTextChange;

        @Override
        public boolean canAddCaptionToGif(TLRPC.Document document) {
            return EmojiView.EmojiViewDelegate.CC.$default$canAddCaptionToGif(this, document);
        }

        @Override
        public boolean canSchedule() {
            return EmojiView.EmojiViewDelegate.CC.$default$canSchedule(this);
        }

        @Override
        public long getDialogId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getDialogId(this);
        }

        @Override
        public float getProgressToSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$getProgressToSearchOpened(this);
        }

        @Override
        public int getThreadId() {
            return EmojiView.EmojiViewDelegate.CC.$default$getThreadId(this);
        }

        @Override
        public void invalidateEnterView() {
            EmojiView.EmojiViewDelegate.CC.$default$invalidateEnterView(this);
        }

        @Override
        public boolean isExpanded() {
            return EmojiView.EmojiViewDelegate.CC.$default$isExpanded(this);
        }

        @Override
        public boolean isInScheduleMode() {
            return EmojiView.EmojiViewDelegate.CC.$default$isInScheduleMode(this);
        }

        @Override
        public boolean isSearchOpened() {
            return EmojiView.EmojiViewDelegate.CC.$default$isSearchOpened(this);
        }

        @Override
        public boolean isUserSelf() {
            return EmojiView.EmojiViewDelegate.CC.$default$isUserSelf(this);
        }

        @Override
        public void onAnimatedEmojiUnlockClick() {
        }

        @Override
        public void onEmojiSettingsClick(ArrayList arrayList) {
            EmojiView.EmojiViewDelegate.CC.$default$onEmojiSettingsClick(this, arrayList);
        }

        @Override
        public void onGifSelected(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelected(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public void onGifSelectedForAddCaption(View view, Object obj, String str, Object obj2, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onGifSelectedForAddCaption(this, view, obj, str, obj2, z, i, i2);
        }

        @Override
        public void onSearchOpenClose(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onSearchOpenClose(this, i);
        }

        @Override
        public void onShowStickerSet(TLRPC.StickerSet stickerSet, TLRPC.InputStickerSet inputStickerSet, boolean z) {
            EmojiView.EmojiViewDelegate.CC.$default$onShowStickerSet(this, stickerSet, inputStickerSet, z);
        }

        @Override
        public void onStickerSelected(View view, TLRPC.Document document, String str, Object obj, MessageObject.SendAnimationData sendAnimationData, boolean z, int i, int i2) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSelected(this, view, document, str, obj, sendAnimationData, z, i, i2);
        }

        @Override
        public void onStickerSetAdd(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetAdd(this, stickerSetCovered);
        }

        @Override
        public void onStickerSetRemove(TLRPC.StickerSetCovered stickerSetCovered) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickerSetRemove(this, stickerSetCovered);
        }

        @Override
        public void onStickersGroupClick(long j) {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersGroupClick(this, j);
        }

        @Override
        public void onStickersSettingsClick() {
            EmojiView.EmojiViewDelegate.CC.$default$onStickersSettingsClick(this);
        }

        @Override
        public void onTabOpened(int i) {
            EmojiView.EmojiViewDelegate.CC.$default$onTabOpened(this, i);
        }

        @Override
        public void showTrendingStickersAlert(TrendingStickersLayout trendingStickersLayout) {
            EmojiView.EmojiViewDelegate.CC.$default$showTrendingStickersAlert(this, trendingStickersLayout);
        }

        AnonymousClass21() {
        }

        @Override
        public boolean onBackspace() {
            EditTextOutline editText = ((TextPaintView) LPhotoPaintView.this.currentEntityView).getEditText();
            if (editText == null || editText.length() == 0) {
                return false;
            }
            editText.dispatchKeyEvent(new KeyEvent(0, 67));
            return true;
        }

        @Override
        public void onEmojiSelected(String str) {
            TextPaintView textPaintView;
            EditTextOutline editText;
            Emoji.EmojiSpan[] emojiSpanArr;
            if ((LPhotoPaintView.this.currentEntityView instanceof TextPaintView) && (editText = (textPaintView = (TextPaintView) LPhotoPaintView.this.currentEntityView).getEditText()) != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (selectionEnd < 0) {
                    selectionEnd = 0;
                }
                try {
                    this.innerTextChange = 2;
                    CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(str, textPaintView.getFontMetricsInt(), false);
                    if ((charSequenceReplaceEmoji instanceof Spanned) && (emojiSpanArr = (Emoji.EmojiSpan[]) ((Spanned) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Emoji.EmojiSpan.class)) != null) {
                        for (Emoji.EmojiSpan emojiSpan : emojiSpanArr) {
                            emojiSpan.scale = 0.85f;
                        }
                    }
                    editText.setText(editText.getText().insert(selectionEnd, charSequenceReplaceEmoji));
                    int length = selectionEnd + charSequenceReplaceEmoji.length();
                    editText.setSelection(length, length);
                } catch (Exception e) {
                    FileLog.e(e);
                } finally {
                    this.innerTextChange = 0;
                }
            }
        }

        @Override
        public void onCustomEmojiSelected(long j, TLRPC.Document document, String str, boolean z) {
            AnimatedEmojiSpan animatedEmojiSpan;
            EditTextOutline editText = ((TextPaintView) LPhotoPaintView.this.currentEntityView).getEditText();
            if (editText == null) {
                return;
            }
            int selectionEnd = editText.getSelectionEnd();
            if (selectionEnd < 0) {
                selectionEnd = 0;
            }
            try {
                this.innerTextChange = 2;
                SpannableString spannableString = new SpannableString(str);
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document, editText.getPaint().getFontMetricsInt());
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, editText.getPaint().getFontMetricsInt());
                }
                spannableString.setSpan(animatedEmojiSpan, 0, spannableString.length(), 33);
                editText.setText(editText.getText().insert(selectionEnd, spannableString));
                int length = selectionEnd + spannableString.length();
                editText.setSelection(length, length);
            } catch (Exception e) {
                FileLog.e(e);
            } finally {
                this.innerTextChange = 0;
            }
        }

        @Override
        public void onClearEmojiRecent() {
            AlertDialog.Builder builder = new AlertDialog.Builder(LPhotoPaintView.this.getContext(), LPhotoPaintView.this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    LPhotoPaintView.this.emojiView.clearRecentEmoji();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }
    }

    public float adjustPanLayoutHelperProgress() {
        return this.panTranslationProgress;
    }

    @Override
    protected void onAttachedToWindow() {
        this.destroyed = false;
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    protected void onDetachedFromWindow() {
        this.destroyed = true;
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.customTypefacesLoaded || this.entitiesView == null) {
            return;
        }
        for (int i3 = 0; i3 < this.entitiesView.getChildCount(); i3++) {
            View childAt = this.entitiesView.getChildAt(i3);
            if (childAt instanceof TextPaintView) {
                ((TextPaintView) childAt).updateTypeface();
            }
        }
    }

    public ThanosEffect getThanosEffect() {
        if (!ThanosEffect.supports()) {
            return null;
        }
        if (this.thanosEffect == null) {
            ThanosEffect thanosEffect = new ThanosEffect(getContext(), new Runnable() {
                @Override
                public final void run() {
                    LPhotoPaintView.$r8$lambda$viSqKAzZAoOEJFUVhrwspih8MWc(this.f$0);
                }
            });
            this.thanosEffect = thanosEffect;
            addView(thanosEffect);
        }
        return this.thanosEffect;
    }

    public static void $r8$lambda$viSqKAzZAoOEJFUVhrwspih8MWc(LPhotoPaintView lPhotoPaintView) {
        ThanosEffect thanosEffect = lPhotoPaintView.thanosEffect;
        if (thanosEffect != null) {
            lPhotoPaintView.thanosEffect = null;
            lPhotoPaintView.removeView(thanosEffect);
        }
    }

    public void onSwitchSegmentedAnimation(final PhotoView photoView) {
        float f;
        if (photoView == null) {
            return;
        }
        ThanosEffect thanosEffect = getThanosEffect();
        if (thanosEffect == null) {
            photoView.onSwitchSegmentedAnimationStarted(false);
            return;
        }
        Bitmap segmentedOutBitmap = photoView.getSegmentedOutBitmap();
        if (segmentedOutBitmap == null) {
            photoView.onSwitchSegmentedAnimationStarted(false);
            return;
        }
        Matrix matrix = new Matrix();
        float width = photoView.getWidth();
        float height = photoView.getHeight();
        float f2 = 0.0f;
        if (photoView.getRotation() != 0.0f) {
            float width2 = segmentedOutBitmap.getWidth();
            float height2 = segmentedOutBitmap.getHeight();
            float f3 = width2 / 2.0f;
            float f4 = height2 / 2.0f;
            float fSqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
            float f5 = fSqrt * 2.0f;
            int i = (int) f5;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.save();
            canvas.rotate(photoView.getRotation(), fSqrt, fSqrt);
            canvas.drawBitmap(segmentedOutBitmap, (f5 - width2) / 2.0f, (f5 - height2) / 2.0f, (Paint) null);
            segmentedOutBitmap.recycle();
            float f6 = width / 2.0f;
            float f7 = height / 2.0f;
            float fSqrt2 = ((float) Math.sqrt((f6 * f6) + (f7 * f7))) * 2.0f;
            f2 = (-(fSqrt2 - width)) / 2.0f;
            float f8 = (-(fSqrt2 - height)) / 2.0f;
            height = fSqrt2;
            f = f8;
            width = height;
            segmentedOutBitmap = bitmapCreateBitmap;
        } else {
            f = 0.0f;
        }
        matrix.postScale(width, height);
        matrix.postScale(photoView.getScaleX(), photoView.getScaleY(), width / 2.0f, height / 2.0f);
        matrix.postTranslate(photoView.getX() + f2, photoView.getY() + f);
        thanosEffect.animate(matrix, segmentedOutBitmap, new Runnable() {
            @Override
            public final void run() {
                photoView.onSwitchSegmentedAnimationStarted(true);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                LPhotoPaintView.$r8$lambda$4aiZhvQC2GURrN6CN5KcEZfpOL4();
            }
        });
    }

    private class BottomLayout extends FrameLayout {
        private float lastRainbowX;
        private float lastRainbowY;
        private Path path;

        public BottomLayout(Context context) {
            super(context);
            this.path = new Path();
            setWillNotDraw(false);
            LPhotoPaintView.this.colorPickerRainbowPaint.setStyle(Paint.Style.STROKE);
            LPhotoPaintView.this.colorPickerRainbowPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        }

        private void checkRainbow(float f, float f2) {
            if (f == this.lastRainbowX && f2 == this.lastRainbowY) {
                return;
            }
            this.lastRainbowX = f;
            this.lastRainbowY = f2;
            LPhotoPaintView.this.colorPickerRainbowPaint.setShader(new SweepGradient(f, f2, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            FrameLayout frameLayout = LPhotoPaintView.this.overlayLayout;
            if (frameLayout != null) {
                frameLayout.invalidate();
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float f;
            super.onDraw(canvas);
            ViewGroup barView = LPhotoPaintView.this.getBarView();
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(AndroidUtilities.lerp(barView.getLeft(), LPhotoPaintView.this.colorsListView.getLeft(), LPhotoPaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop(), LPhotoPaintView.this.colorsListView.getTop(), LPhotoPaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight(), LPhotoPaintView.this.colorsListView.getRight(), LPhotoPaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom(), LPhotoPaintView.this.colorsListView.getBottom(), LPhotoPaintView.this.toolsTransformProgress));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), LPhotoPaintView.this.toolsTransformProgress);
            if (LPhotoPaintView.this.blurredBackgroundDrawableForTools == null) {
                canvas.drawRoundRect(rectF, fLerp, fLerp, LPhotoPaintView.this.toolsPaint);
            } else {
                rect.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                LPhotoPaintView.this.blurredBackgroundDrawableForTools.setRadius(fLerp);
                LPhotoPaintView.this.blurredBackgroundDrawableForTools.setBounds(rect);
                LPhotoPaintView.this.blurredBackgroundDrawableForTools.draw(canvas);
            }
            if (barView.getChildCount() < 1 || LPhotoPaintView.this.toolsTransformProgress == 1.0f) {
                return;
            }
            canvas.save();
            canvas.translate(barView.getLeft(), barView.getTop());
            View childAt = barView.getChildAt(0);
            if (barView instanceof PaintTextOptionsView) {
                childAt = ((PaintTextOptionsView) barView).getColorClickableView();
            }
            View view = childAt;
            if (view.getAlpha() != 0.0f) {
                canvas.scale(view.getScaleX(), view.getScaleY(), view.getPivotX(), view.getPivotY());
                LPhotoPaintView.this.colorPickerRainbowPaint.setAlpha((int) ((1.0f - LPhotoPaintView.this.toolsTransformProgress) * view.getAlpha() * 255.0f));
                int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
                int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
                float x = view.getX() + view.getPaddingLeft() + (width / 2.0f);
                float y = view.getY() + view.getPaddingTop() + (height / 2.0f);
                int iBlendARGB = LPhotoPaintView.this.colorSwatch.color;
                if (LPhotoPaintView.this.tabsNewSelectedIndex != -1) {
                    LPhotoPaintView lPhotoPaintView = LPhotoPaintView.this;
                    ViewGroup viewGroup = (ViewGroup) lPhotoPaintView.getBarView(lPhotoPaintView.tabsNewSelectedIndex);
                    View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                    f = 1.0f;
                    if (viewGroup instanceof PaintTextOptionsView) {
                        childAt2 = ((PaintTextOptionsView) viewGroup).getColorClickableView();
                    }
                    x = AndroidUtilities.lerp(x, childAt2.getX() + childAt2.getPaddingLeft() + (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f), LPhotoPaintView.this.tabsSelectionProgress);
                    y = AndroidUtilities.lerp(y, childAt2.getY() + childAt2.getPaddingTop() + (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f), LPhotoPaintView.this.tabsSelectionProgress);
                } else {
                    f = 1.0f;
                }
                if (LPhotoPaintView.this.colorsListView != null && LPhotoPaintView.this.colorsListView.getChildCount() > 0) {
                    View childAt3 = LPhotoPaintView.this.colorsListView.getChildAt(0);
                    x = AndroidUtilities.lerp(x, (LPhotoPaintView.this.colorsListView.getX() - barView.getLeft()) + childAt3.getX() + (childAt3.getWidth() / 2.0f), LPhotoPaintView.this.toolsTransformProgress);
                    y = AndroidUtilities.lerp(y, (LPhotoPaintView.this.colorsListView.getY() - barView.getTop()) + childAt3.getY() + (childAt3.getHeight() / 2.0f), LPhotoPaintView.this.toolsTransformProgress);
                    iBlendARGB = ColorUtils.blendARGB(LPhotoPaintView.this.colorSwatch.color, LPhotoPaintView.this.palette.getColor(0), LPhotoPaintView.this.toolsTransformProgress);
                }
                checkRainbow(x, y);
                float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                if (LPhotoPaintView.this.colorsListView != null && LPhotoPaintView.this.colorsListView.getChildCount() > 0) {
                    View childAt4 = LPhotoPaintView.this.colorsListView.getChildAt(0);
                    fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), LPhotoPaintView.this.toolsTransformProgress);
                }
                float f2 = fMin;
                rectF.set(x - f2, y - f2, x + f2, y + f2);
                canvas.drawArc(rectF, 0.0f, 360.0f, false, LPhotoPaintView.this.colorPickerRainbowPaint);
                LPhotoPaintView.this.colorSwatchPaint.setColor(iBlendARGB);
                LPhotoPaintView.this.colorSwatchPaint.setAlpha((int) (LPhotoPaintView.this.colorSwatchPaint.getAlpha() * view.getAlpha()));
                LPhotoPaintView.this.colorSwatchOutlinePaint.setColor(iBlendARGB);
                LPhotoPaintView.this.colorSwatchOutlinePaint.setAlpha((int) (view.getAlpha() * 255.0f));
                float fDp = f2 - AndroidUtilities.dp(3.0f);
                if (LPhotoPaintView.this.colorsListView != null && LPhotoPaintView.this.colorsListView.getSelectedColorIndex() != 0) {
                    fDp = AndroidUtilities.lerp(f2 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f2, LPhotoPaintView.this.toolsTransformProgress);
                }
                PaintColorsListView.drawColorCircle(canvas, x, y, fDp, LPhotoPaintView.this.colorSwatchPaint.getColor());
                if (LPhotoPaintView.this.colorsListView != null && LPhotoPaintView.this.colorsListView.getSelectedColorIndex() == 0) {
                    LPhotoPaintView.this.colorSwatchOutlinePaint.setAlpha((int) (LPhotoPaintView.this.colorSwatchOutlinePaint.getAlpha() * LPhotoPaintView.this.toolsTransformProgress * view.getAlpha()));
                    canvas.drawCircle(x, y, f2 - ((AndroidUtilities.dp(3.0f) + LPhotoPaintView.this.colorSwatchOutlinePaint.getStrokeWidth()) * (f - LPhotoPaintView.this.toolsTransformProgress)), LPhotoPaintView.this.colorSwatchOutlinePaint);
                }
            }
            canvas.restore();
        }
    }
}

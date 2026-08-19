package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.location.Address;
import android.location.Geocoder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
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
import com.google.zxing.common.detector.MathUtils;
import j$.util.Objects;
import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ButtonBounce;
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
import org.telegram.ui.Components.Paint.Views.EditTextOutline;
import org.telegram.ui.Components.Paint.Views.EntitiesContainerView;
import org.telegram.ui.Components.Paint.Views.EntityView;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Paint.Views.LinkView;
import org.telegram.ui.Components.Paint.Views.LocationView;
import org.telegram.ui.Components.Paint.Views.MessageEntityView;
import org.telegram.ui.Components.Paint.Views.PaintCancelView;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.Paint.Views.PaintDoneView;
import org.telegram.ui.Components.Paint.Views.PaintTextOptionsView;
import org.telegram.ui.Components.Paint.Views.PaintToolsView;
import org.telegram.ui.Components.Paint.Views.PaintTypefaceListView;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.Paint.Views.ReactionWidgetEntityView;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.Paint.Views.StickerView;
import org.telegram.ui.Components.Paint.Views.TextPaintView;
import org.telegram.ui.Components.Paint.Views.WeatherView;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.Reactions.ReactionsUtils;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.Size;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayoutPhoto;
import org.telegram.ui.Components.TrendingStickersLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Stars.StarGiftUniqueActionLayout;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.WrappedResourceProvider;

public abstract class PaintView extends SizeNotifierFrameLayoutPhoto implements IPhotoPaintView, PaintToolsView.Delegate, EntityView.EntityViewDelegate, PaintTextOptionsView.Delegate, SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate, StoryRecorder.Touchable {
    private float baseScale;
    private Bitmap bitmapToEdit;
    private Bitmap blurBitmapToEdit;
    private BlurringShader.BlurManager blurManager;
    private FrameLayout bottomLayout;
    private PaintCancelView cancelButton;
    private TextView cancelTextButton;
    private ColorPickerBottomSheet colorPickerBottomSheet;
    private Paint colorPickerRainbowPaint;
    private Swatch colorSwatch;
    private Paint colorSwatchOutlinePaint;
    private Paint colorSwatchPaint;
    private PaintColorsListView colorsListView;
    private boolean creatingNewRound;
    private int currentAccount;
    private MediaController.CropState currentCropState;
    private EntityView currentEntityView;
    private boolean destroyed;
    private PaintDoneView doneButton;
    private TextView doneTextButton;
    public boolean drawForThemeToggle;
    private TextView drawTab;
    private boolean editingText;
    private int emojiPadding;
    private EmojiBottomSheet emojiPopup;
    public EmojiView emojiView;
    private boolean emojiViewVisible;
    private boolean emojiViewWasVisible;
    private int emojiWasPadding;
    public boolean enteredThroughText;
    public EntitiesContainerView entitiesView;
    private ArrayList faces;
    private Bitmap facesBitmap;
    private File file;
    private boolean fileFromGallery;
    private boolean fillShapes;
    private boolean forceChanges;
    private int h;
    private boolean hasAudio;
    private boolean ignoreLayout;
    private boolean ignoreToolChangeAnimationOnce;
    private boolean inBubbleMode;
    private ArrayList initialEntities;
    private StoryEntry initialEntry;
    private boolean invalidateReactionPosition;
    private boolean isAnimatePopupClosing;
    private boolean isBot;
    private boolean isColorListShown;
    public boolean isCoverPreview;
    private boolean isTypefaceMenuShown;
    private boolean isVideo;
    private AnimatorSet keyboardAnimator;
    private int keyboardHeight;
    private int keyboardHeightLand;
    public final KeyboardNotifier keyboardNotifier;
    private boolean keyboardVisible;
    private int lastSizeChangeValue1;
    private boolean lastSizeChangeValue2;
    private BigInteger lcm;
    private float offsetTranslationY;
    private Runnable onCancelButtonClickedListener;
    private Runnable onDoneButtonClickedListener;
    private Runnable openKeyboardRunnable;
    private int originalBitmapRotation;
    private FrameLayout overlayLayout;
    private PaintToolsView paintToolsView;
    private Size paintingSize;
    private StoryRecorder.WindowView parent;
    private FrameLayout pipetteContainerLayout;
    float[] points;
    private PopupWindowLayout popupLayout;
    private Rect popupRect;
    private ActionBarPopupWindow popupWindow;
    private int[] pos;
    private PreviewView previewView;
    private ObjectAnimator previewViewTranslationAnimator;
    private DispatchQueue queue;
    ReactionWidgetEntityView reactionForEntity;
    public ReactionsContainerLayout reactionLayout;
    private boolean reactionLayoutShowing;
    private float reactionShowProgress;
    private View renderInputView;
    private RenderView renderView;
    private Theme.ResourcesProvider resourcesProvider;
    private int selectedTextType;
    private FrameLayout selectionContainerView;
    private TextView stickerTab;
    private LinearLayout tabsLayout;
    private int tabsNewSelectedIndex;
    private int tabsSelectedIndex;
    private ValueAnimator tabsSelectionAnimator;
    private float tabsSelectionProgress;
    private View textDim;
    private PaintTextOptionsView textOptionsView;
    private TextView textTab;
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
    private PreviewView.TextureViewHolder videoTextureHolder;
    private int w;
    private boolean waitingForKeyboardOpen;
    private boolean wasKeyboardVisible;
    private PaintWeightChooserView weightChooserView;
    private final PaintWeightChooserView.ValueOverride weightDefaultValueOverride;
    private LinearLayout zoomOutButton;
    private ImageView zoomOutImage;
    private TextView zoomOutText;
    private boolean zoomOutVisible;

    protected abstract boolean checkAudioPermission(Runnable runnable);

    protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
    }

    protected abstract void dismiss();

    public View getView() {
        return IPhotoPaintView.CC.$default$getView(this);
    }

    protected abstract void onAudioSelect(MessageObject messageObject);

    public abstract void onCreateRound(RoundView roundView);

    public abstract void onDeleteRound();

    public abstract void onDeselectRound(RoundView roundView);

    protected abstract void onGalleryClick();

    public abstract void onOpenCloseStickersAlert(boolean z);

    public abstract void onSelectRound(RoundView roundView);

    public abstract void onSwitchSegmentedAnimation(PhotoView photoView);

    protected void onTextAdd() {
    }

    public abstract void onTryDeleteRound();

    public void setOffsetTranslationX(float f) {
        IPhotoPaintView.CC.$default$setOffsetTranslationX(this, f);
    }

    public void setHasAudio(boolean z) {
        if (z != this.hasAudio) {
            this.hasAudio = z;
            checkEntitiesIsVideo();
        }
    }

    public PaintView(final Context context, boolean z, File file, boolean z2, boolean z3, final StoryRecorder.WindowView windowView, Activity activity, final int i, Bitmap bitmap, Bitmap bitmap2, final Bitmap bitmap3, int i2, ArrayList arrayList, StoryEntry storyEntry, int i3, int i4, MediaController.CropState cropState, final Runnable runnable, BlurringShader.BlurManager blurManager, final Theme.ResourcesProvider resourcesProvider, PreviewView.TextureViewHolder textureViewHolder, PreviewView previewView) {
        int i5;
        super(context, activity, true);
        this.tabsSelectedIndex = 0;
        this.tabsNewSelectedIndex = -1;
        PaintWeightChooserView.ValueOverride valueOverride = new PaintWeightChooserView.ValueOverride() {
            @Override
            public float get() {
                Brush currentBrush = PaintView.this.renderView.getCurrentBrush();
                return currentBrush == null ? PersistColorPalette.getInstance(PaintView.this.currentAccount).getCurrentWeight() : PersistColorPalette.getInstance(PaintView.this.currentAccount).getWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(currentBrush)), currentBrush.getDefaultWeight());
            }

            @Override
            public void set(float f) {
                PersistColorPalette.getInstance(PaintView.this.currentAccount).setWeight(String.valueOf(Brush.BRUSHES_LIST.indexOf(PaintView.this.renderView.getCurrentBrush())), f);
                PaintView.this.colorSwatch.brushWeight = f;
                PaintView paintView = PaintView.this;
                paintView.setCurrentSwatch(paintView.colorSwatch, true);
            }
        };
        this.weightDefaultValueOverride = valueOverride;
        this.typefaceMenuOutlinePaint = new Paint(1);
        this.typefaceMenuBackgroundPaint = new Paint(1);
        this.colorPickerRainbowPaint = new Paint(1);
        this.colorSwatchPaint = new Paint(1);
        this.colorSwatchOutlinePaint = new Paint(1);
        this.colorSwatch = new Swatch(-1, 1.0f, 0.016773745f);
        this.fillShapes = false;
        this.toolsPaint = new Paint(1);
        this.zoomOutVisible = false;
        this.points = new float[2];
        this.isCoverPreview = false;
        this.pos = new int[2];
        this.openKeyboardRunnable = new Runnable() {
            @Override
            public void run() {
                if (PaintView.this.currentEntityView instanceof TextPaintView) {
                    EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
                    if (PaintView.this.destroyed || editText == null || !PaintView.this.waitingForKeyboardOpen || PaintView.this.keyboardVisible || AndroidUtilities.usingHardwareInput || AndroidUtilities.isInMultiwindow || !AndroidUtilities.isTablet()) {
                        return;
                    }
                    editText.requestFocus();
                    AndroidUtilities.showKeyboard(editText);
                    AndroidUtilities.cancelRunOnUIThread(PaintView.this.openKeyboardRunnable);
                    AndroidUtilities.runOnUIThread(PaintView.this.openKeyboardRunnable, 100L);
                }
            }
        };
        setDelegate(this);
        this.blurManager = blurManager;
        this.videoTextureHolder = textureViewHolder;
        this.fileFromGallery = z;
        this.file = file;
        this.isVideo = z2;
        this.isBot = z3;
        this.parent = windowView;
        this.w = i3;
        this.h = i4;
        this.previewView = previewView;
        this.currentAccount = i;
        this.resourcesProvider = new Theme.ResourcesProvider() {
            private ColorFilter animatedEmojiColorFilter;

            @Override
            public void applyServiceShaderMatrix(int i6, int i7, float f, float f2) {
                Theme.applyServiceShaderMatrix(i6, i7, f, f2);
            }

            @Override
            public int getColorOrDefault(int i6) {
                return getColor(i6);
            }

            @Override
            public int getCurrentColor(int i6) {
                return getColor(i6);
            }

            @Override
            public Drawable getDrawable(String str) {
                return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
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
            public void setAnimatedColor(int i6, int i7) {
                Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, i6, i7);
            }

            @Override
            public int getColor(int i6) {
                if (i6 == Theme.key_actionBarDefaultSubmenuBackground) {
                    return -14145495;
                }
                if (i6 == Theme.key_actionBarDefaultSubmenuItem) {
                    return -1;
                }
                if (i6 == Theme.key_dialogBackground) {
                    return -14737633;
                }
                if (i6 == Theme.key_dialogTextBlack) {
                    return -592138;
                }
                if (i6 == Theme.key_dialogTextGray3) {
                    return -8553091;
                }
                if (i6 == Theme.key_chat_emojiPanelBackground) {
                    return -16777216;
                }
                if (i6 == Theme.key_chat_emojiPanelShadowLine) {
                    return -1610612736;
                }
                if (i6 == Theme.key_chat_emojiBottomPanelIcon || i6 == Theme.key_chat_emojiPanelBackspace || i6 == Theme.key_chat_emojiPanelIcon) {
                    return -9539985;
                }
                if (i6 == Theme.key_windowBackgroundWhiteBlackText) {
                    return -1;
                }
                int i7 = Theme.key_featuredStickers_addedIcon;
                if (i6 == i7) {
                    return -11754001;
                }
                if (i6 == Theme.key_listSelector) {
                    return 536870911;
                }
                if (i6 == Theme.key_profile_tabSelectedText || i6 == Theme.key_profile_tabText || i6 == Theme.key_profile_tabSelectedLine) {
                    return -1;
                }
                if (i6 == Theme.key_profile_tabSelector) {
                    return 352321535;
                }
                if (i6 == Theme.key_chat_emojiSearchIcon || i6 == i7) {
                    return -7895161;
                }
                if (i6 == Theme.key_chat_emojiSearchBackground) {
                    return 780633991;
                }
                if (i6 == Theme.key_windowBackgroundGray) {
                    return -15921907;
                }
                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                if (resourcesProvider2 != null) {
                    return resourcesProvider2.getColor(i6);
                }
                return Theme.getColor(i6);
            }

            @Override
            public Paint getPaint(String str) {
                return resourcesProvider.getPaint(str);
            }

            @Override
            public ColorFilter getAnimatedEmojiColorFilter() {
                if (this.animatedEmojiColorFilter == null) {
                    this.animatedEmojiColorFilter = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return this.animatedEmojiColorFilter;
            }
        };
        this.currentCropState = cropState;
        this.inBubbleMode = context instanceof BubbleActivity;
        final PersistColorPalette persistColorPalette = PersistColorPalette.getInstance(i);
        persistColorPalette.resetCurrentColor();
        this.colorSwatch.color = persistColorPalette.getCurrentColor();
        this.colorSwatch.brushWeight = persistColorPalette.getCurrentWeight();
        this.queue = new DispatchQueue("Paint");
        this.bitmapToEdit = bitmap;
        this.blurBitmapToEdit = bitmap2;
        this.facesBitmap = bitmap3;
        this.originalBitmapRotation = i2;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.setDelegate(new UndoStore.UndoStoreDelegate() {
            @Override
            public final void historyChanged() {
                PaintView.m4537$r8$lambda$oBldUZaDbn8VHalkh5eS6GMZ6o(this.f$0);
            }
        });
        View view = new View(context);
        this.textDim = view;
        view.setVisibility(8);
        this.textDim.setBackgroundColor(1291845632);
        this.textDim.setAlpha(0.0f);
        RenderView renderView = new RenderView(context, new Painting(getPaintingSize(), bitmap3, i2, blurManager), this.bitmapToEdit, this.blurBitmapToEdit, (storyEntry == null || !storyEntry.isRepostMessage) ? blurManager : null) {
            @Override
            public void selectBrush(Brush brush) {
                int iIndexOf = Brush.BRUSHES_LIST.indexOf(brush);
                int i6 = iIndexOf + 1;
                if (i6 <= 1 || bitmap3 != null) {
                    iIndexOf = i6;
                }
                PaintView.this.paintToolsView.select(iIndexOf);
                PaintView.this.onBrushSelected(brush);
            }
        };
        this.renderView = renderView;
        renderView.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public void onFirstDraw() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }

            @Override
            public void onBeganDrawing() {
                if (PaintView.this.currentEntityView != null) {
                    PaintView.this.selectEntity(null);
                }
                PaintView.this.weightChooserView.setViewHidden(true);
            }

            @Override
            public void onFinishedDrawing(boolean z4) {
                PaintView.this.undoStore.getDelegate().historyChanged();
                PaintView.this.weightChooserView.setViewHidden(false);
            }

            @Override
            public boolean shouldDraw() {
                boolean z4 = PaintView.this.currentEntityView == null;
                if (!z4) {
                    PaintView.this.selectEntity(null);
                }
                return z4;
            }

            @Override
            public void invalidateInputView() {
                if (PaintView.this.renderInputView != null) {
                    PaintView.this.renderInputView.invalidate();
                }
            }

            @Override
            public void resetBrush() {
                if (PaintView.this.ignoreToolChangeAnimationOnce) {
                    PaintView.this.ignoreToolChangeAnimationOnce = false;
                } else {
                    PaintView.this.paintToolsView.select(1);
                    PaintView.this.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
                }
            }
        });
        this.renderView.setUndoStore(this.undoStore);
        this.renderView.setQueue(this.queue);
        this.renderView.setVisibility(4);
        View view2 = new View(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (PaintView.this.renderView != null) {
                    PaintView.this.renderView.onDrawForInput(canvas);
                }
            }
        };
        this.renderInputView = view2;
        view2.setVisibility(4);
        this.entitiesView = new EntitiesContainerView(context, new EntitiesContainerView.EntitiesContainerViewDelegate() {
            @Override
            public EntityView onSelectedEntityRequest() {
                return PaintView.this.currentEntityView;
            }

            @Override
            public void onEntityDeselect() {
                PaintView.this.selectEntity(null);
                PaintView paintView = PaintView.this;
                if (paintView.enteredThroughText) {
                    paintView.dismiss();
                    PaintView.this.enteredThroughText = false;
                }
                PaintView.this.showReactionsLayout(false);
            }
        }) {
            private int lastStickyX;
            private int lastStickyY;
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
                float f;
                float f2;
                int measuredWidth;
                float measuredWidth2;
                int measuredHeight;
                float measuredHeight2;
                super.onDraw(canvas);
                long jMin = Math.min(16L, System.currentTimeMillis() - this.lastUpdate);
                this.lastUpdate = System.currentTimeMillis();
                if (PaintView.this.currentEntityView != null && PaintView.this.currentEntityView.hasTouchDown() && PaintView.this.currentEntityView.hasPanned()) {
                    stickyX = PaintView.this.currentEntityView.getStickyX();
                    stickyY = PaintView.this.currentEntityView.getStickyY();
                } else {
                    stickyX = 0;
                    stickyY = 0;
                }
                if (stickyX != 0) {
                    this.lastStickyX = stickyX;
                }
                if (stickyY != 0) {
                    this.lastStickyY = stickyY;
                }
                if (stickyX != 0) {
                    float f3 = this.stickyXAlpha;
                    if (f3 != 1.0f) {
                        this.stickyXAlpha = Math.min(1.0f, f3 + (jMin / 150.0f));
                        invalidate();
                    } else if (stickyX == 0) {
                        f = this.stickyXAlpha;
                        if (f != 0.0f) {
                            this.stickyXAlpha = Math.max(0.0f, f - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyX == 0) {
                    f = this.stickyXAlpha;
                    if (f != 0.0f) {
                        this.stickyXAlpha = Math.max(0.0f, f - (jMin / 150.0f));
                        invalidate();
                    }
                }
                if (stickyY != 0) {
                    float f4 = this.stickyYAlpha;
                    if (f4 != 1.0f) {
                        this.stickyYAlpha = Math.min(1.0f, f4 + (jMin / 150.0f));
                        invalidate();
                    } else if (stickyY == 0) {
                        f2 = this.stickyYAlpha;
                        if (f2 != 0.0f) {
                            this.stickyYAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                            invalidate();
                        }
                    }
                } else if (stickyY == 0) {
                    f2 = this.stickyYAlpha;
                    if (f2 != 0.0f) {
                        this.stickyYAlpha = Math.max(0.0f, f2 - (jMin / 150.0f));
                        invalidate();
                    }
                }
                float f5 = this.stickyYAlpha;
                if (f5 != 0.0f) {
                    this.linePaint.setAlpha((int) (f5 * 255.0f));
                    int i6 = this.lastStickyY;
                    if (i6 == 1) {
                        measuredHeight = AndroidUtilities.dp(64.0f);
                    } else {
                        if (i6 == 2) {
                            measuredHeight2 = getMeasuredHeight() / 2.0f;
                        } else {
                            measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(64.0f);
                        }
                        float f6 = measuredHeight2;
                        canvas.drawLine(0.0f, f6, getMeasuredWidth(), f6, this.linePaint);
                    }
                    measuredHeight2 = measuredHeight;
                    float f7 = measuredHeight2;
                    canvas.drawLine(0.0f, f7, getMeasuredWidth(), f7, this.linePaint);
                }
                float f8 = this.stickyXAlpha;
                if (f8 != 0.0f) {
                    this.linePaint.setAlpha((int) (f8 * 255.0f));
                    int i7 = this.lastStickyX;
                    if (i7 == 1) {
                        measuredWidth = AndroidUtilities.dp(8.0f);
                    } else {
                        if (i7 == 2) {
                            measuredWidth2 = getMeasuredWidth() / 2.0f;
                        } else {
                            measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                        }
                        float f9 = measuredWidth2;
                        canvas.drawLine(f9, 0.0f, f9, getMeasuredHeight(), this.linePaint);
                    }
                    measuredWidth2 = measuredWidth;
                    float f10 = measuredWidth2;
                    canvas.drawLine(f10, 0.0f, f10, getMeasuredHeight(), this.linePaint);
                }
            }

            @Override
            protected void onMeasure(int i6, int i7) {
                super.onMeasure(i6, i7);
                if (PaintView.this.w <= 0) {
                    PaintView paintView = PaintView.this;
                    paintView.w = paintView.entitiesView.getMeasuredWidth();
                }
                if (PaintView.this.h <= 0) {
                    PaintView paintView2 = PaintView.this;
                    paintView2.h = paintView2.entitiesView.getMeasuredHeight();
                }
                PaintView.this.setupEntities();
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (PaintView.this.isCoverPreview) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.initialEntry = storyEntry;
        this.initialEntities = arrayList;
        if (this.w > 0 && this.h > 0) {
            setupEntities();
        }
        this.entitiesView.setVisibility(4);
        this.selectionContainerView = new FrameLayout(context) {
            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (PaintView.this.isCoverPreview) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f));
        FrameLayout frameLayout2 = this.topLayout;
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        frameLayout2.setBackground(new GradientDrawable(orientation, new int[]{1073741824, 0}));
        addView(this.topLayout, LayoutHelper.createFrame(-1, -2, 48));
        ImageView imageView = new ImageView(context);
        this.undoButton = imageView;
        imageView.setImageResource(R.drawable.photo_undo2);
        this.undoButton.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
        this.undoButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.undoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                PaintView.m4520$r8$lambda$dGFoaS0jxh1gKM8vN1N0xK2n9w(this.f$0, view3);
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
            public final void onClick(View view3) {
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
            public final void onClick(View view3) {
                this.f$0.clearAll();
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
            public final void onClick(View view3) {
                PaintView.m4541$r8$lambda$u9DlI6yf9KgnfSAfq24i4_Qzc(this.f$0, view3);
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
            public final void onClick(View view3) {
                this.f$0.selectEntity(null);
            }
        });
        this.doneTextButton.setAlpha(0.0f);
        this.doneTextButton.setVisibility(8);
        this.topLayout.addView(this.doneTextButton, LayoutHelper.createFrame(-2, 32.0f, 5, 0.0f, 0.0f, 4.0f, 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context) {
            private float lastRainbowX;
            private float lastRainbowY;
            private Path path = new Path();

            {
                setWillNotDraw(false);
                PaintView.this.colorPickerRainbowPaint.setStyle(Paint.Style.STROKE);
                PaintView.this.colorPickerRainbowPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            }

            private void checkRainbow(float f, float f2) {
                if (f == this.lastRainbowX && f2 == this.lastRainbowY) {
                    return;
                }
                this.lastRainbowX = f;
                this.lastRainbowY = f2;
                PaintView.this.colorPickerRainbowPaint.setShader(new SweepGradient(f, f2, new int[]{-1356981, -1146130, -10452764, -16711681, -7352832, -256, -23296, -1356981}, (float[]) null));
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (PaintView.this.overlayLayout != null) {
                    PaintView.this.overlayLayout.invalidate();
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                super.onDraw(canvas);
                ViewGroup barView = PaintView.this.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft(), PaintView.this.colorsListView.getLeft(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop(), PaintView.this.colorsListView.getTop(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight(), PaintView.this.colorsListView.getRight(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom(), PaintView.this.colorsListView.getBottom(), PaintView.this.toolsTransformProgress));
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(24.0f), PaintView.this.toolsTransformProgress);
                canvas.drawRoundRect(rectF, fLerp, fLerp, PaintView.this.toolsPaint);
                if (barView.getChildCount() < 1 || PaintView.this.toolsTransformProgress == 1.0f) {
                    return;
                }
                canvas.save();
                canvas.translate(barView.getLeft(), barView.getTop());
                View childAt = barView.getChildAt(0);
                if (barView instanceof PaintTextOptionsView) {
                    childAt = ((PaintTextOptionsView) barView).getColorClickableView();
                }
                View view3 = childAt;
                if (view3.getAlpha() != 0.0f) {
                    canvas.scale(view3.getScaleX(), view3.getScaleY(), view3.getPivotX(), view3.getPivotY());
                    PaintView.this.colorPickerRainbowPaint.setAlpha((int) ((1.0f - PaintView.this.toolsTransformProgress) * view3.getAlpha() * 255.0f));
                    int width = (view3.getWidth() - view3.getPaddingLeft()) - view3.getPaddingRight();
                    int height = (view3.getHeight() - view3.getPaddingTop()) - view3.getPaddingBottom();
                    float x = view3.getX() + view3.getPaddingLeft() + (width / 2.0f);
                    float y = view3.getY() + view3.getPaddingTop() + (height / 2.0f);
                    int iBlendARGB = PaintView.this.colorSwatch.color;
                    if (PaintView.this.tabsNewSelectedIndex != -1) {
                        PaintView paintView = PaintView.this;
                        ViewGroup viewGroup = (ViewGroup) paintView.getBarView(paintView.tabsNewSelectedIndex);
                        View childAt2 = (viewGroup == null ? barView : viewGroup).getChildAt(0);
                        f = 1.0f;
                        if (viewGroup instanceof PaintTextOptionsView) {
                            childAt2 = ((PaintTextOptionsView) viewGroup).getColorClickableView();
                        }
                        x = AndroidUtilities.lerp(x, childAt2.getX() + childAt2.getPaddingLeft() + (((childAt2.getWidth() - childAt2.getPaddingLeft()) - childAt2.getPaddingRight()) / 2.0f), PaintView.this.tabsSelectionProgress);
                        y = AndroidUtilities.lerp(y, childAt2.getY() + childAt2.getPaddingTop() + (((childAt2.getHeight() - childAt2.getPaddingTop()) - childAt2.getPaddingBottom()) / 2.0f), PaintView.this.tabsSelectionProgress);
                    } else {
                        f = 1.0f;
                    }
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getChildCount() > 0) {
                        View childAt3 = PaintView.this.colorsListView.getChildAt(0);
                        x = AndroidUtilities.lerp(x, (PaintView.this.colorsListView.getX() - barView.getLeft()) + childAt3.getX() + (childAt3.getWidth() / 2.0f), PaintView.this.toolsTransformProgress);
                        y = AndroidUtilities.lerp(y, (PaintView.this.colorsListView.getY() - barView.getTop()) + childAt3.getY() + (childAt3.getHeight() / 2.0f), PaintView.this.toolsTransformProgress);
                        iBlendARGB = ColorUtils.blendARGB(PaintView.this.colorSwatch.color, persistColorPalette.getColor(0), PaintView.this.toolsTransformProgress);
                    }
                    checkRainbow(x, y);
                    float fMin = (Math.min(width, height) / 2.0f) - AndroidUtilities.dp(0.5f);
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getChildCount() > 0) {
                        View childAt4 = PaintView.this.colorsListView.getChildAt(0);
                        fMin = AndroidUtilities.lerp(fMin, (Math.min((childAt4.getWidth() - childAt4.getPaddingLeft()) - childAt4.getPaddingRight(), (childAt4.getHeight() - childAt4.getPaddingTop()) - childAt4.getPaddingBottom()) / 2.0f) - AndroidUtilities.dp(2.0f), PaintView.this.toolsTransformProgress);
                    }
                    float f2 = fMin;
                    rectF.set(x - f2, y - f2, x + f2, y + f2);
                    canvas.drawArc(rectF, 0.0f, 360.0f, false, PaintView.this.colorPickerRainbowPaint);
                    PaintView.this.colorSwatchPaint.setColor(iBlendARGB);
                    PaintView.this.colorSwatchPaint.setAlpha((int) (PaintView.this.colorSwatchPaint.getAlpha() * view3.getAlpha()));
                    PaintView.this.colorSwatchOutlinePaint.setColor(iBlendARGB);
                    PaintView.this.colorSwatchOutlinePaint.setAlpha((int) (view3.getAlpha() * 255.0f));
                    float fDp = f2 - AndroidUtilities.dp(3.0f);
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getSelectedColorIndex() != 0) {
                        fDp = AndroidUtilities.lerp(f2 - AndroidUtilities.dp(3.0f), AndroidUtilities.dp(2.0f) + f2, PaintView.this.toolsTransformProgress);
                    }
                    PaintColorsListView.drawColorCircle(canvas, x, y, fDp, PaintView.this.colorSwatchPaint.getColor());
                    if (PaintView.this.colorsListView != null && PaintView.this.colorsListView.getSelectedColorIndex() == 0) {
                        PaintView.this.colorSwatchOutlinePaint.setAlpha((int) (PaintView.this.colorSwatchOutlinePaint.getAlpha() * PaintView.this.toolsTransformProgress * view3.getAlpha()));
                        canvas.drawCircle(x, y, f2 - ((AndroidUtilities.dp(3.0f) + PaintView.this.colorSwatchOutlinePaint.getStrokeWidth()) * (f - PaintView.this.toolsTransformProgress)), PaintView.this.colorSwatchOutlinePaint);
                    }
                }
                canvas.restore();
            }
        };
        this.bottomLayout = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), 0);
        this.bottomLayout.setBackground(new GradientDrawable(orientation, new int[]{0, Integer.MIN_VALUE}));
        addView(this.bottomLayout, LayoutHelper.createFrame(-1, 104, 80));
        PaintToolsView paintToolsView = new PaintToolsView(context, (storyEntry == null || storyEntry.isCollage() || storyEntry.isRepostMessage || blurManager == null) ? false : true);
        this.paintToolsView = paintToolsView;
        paintToolsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.paintToolsView.setDelegate(this);
        this.paintToolsView.setSelectedIndex(1);
        this.bottomLayout.addView(this.paintToolsView, LayoutHelper.createFrame(-1, 48.0f));
        PaintTextOptionsView paintTextOptionsView = new PaintTextOptionsView(context);
        this.textOptionsView = paintTextOptionsView;
        paintTextOptionsView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.textOptionsView.setVisibility(8);
        this.textOptionsView.setDelegate(this);
        post(new Runnable() {
            @Override
            public final void run() {
                this.f$0.textOptionsView.setTypeface(PersistColorPalette.getInstance(i).getCurrentTypeface());
            }
        });
        this.textOptionsView.setAlignment(PersistColorPalette.getInstance(i).getCurrentAlignment());
        this.bottomLayout.addView(this.textOptionsView, LayoutHelper.createFrame(-1, 48.0f));
        FrameLayout frameLayout4 = new FrameLayout(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && PaintView.this.isTypefaceMenuShown) {
                    PaintView.this.showTypefaceMenu(false);
                    return true;
                }
                return super.onTouchEvent(motionEvent);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                PaintView.this.typefaceMenuOutlinePaint.setAlpha((int) (PaintView.this.textOptionsView.getAlpha() * 20.0f * (1.0f - PaintView.this.typefaceMenuTransformProgress)));
                PaintTextOptionsView paintTextOptionsView2 = PaintView.this.textOptionsView;
                RectF rectF = AndroidUtilities.rectTmp;
                paintTextOptionsView2.getTypefaceCellBounds(rectF);
                float top = PaintView.this.bottomLayout.getTop() + PaintView.this.textOptionsView.getTop() + PaintView.this.bottomLayout.getTranslationY() + PaintView.this.textOptionsView.getTranslationY();
                rectF.set(AndroidUtilities.lerp(rectF.left, PaintView.this.typefaceListView.getLeft(), PaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.top + top, PaintView.this.typefaceListView.getTop() - PaintView.this.typefaceListView.getTranslationY(), PaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(rectF.right, PaintView.this.typefaceListView.getRight(), PaintView.this.typefaceMenuTransformProgress), AndroidUtilities.lerp(top + rectF.bottom, PaintView.this.typefaceListView.getBottom() - PaintView.this.typefaceListView.getTranslationY(), PaintView.this.typefaceMenuTransformProgress));
                float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(32, 16, PaintView.this.typefaceMenuTransformProgress));
                int alpha = PaintView.this.typefaceMenuBackgroundPaint.getAlpha();
                PaintView.this.typefaceMenuBackgroundPaint.setAlpha((int) (alpha * PaintView.this.typefaceMenuTransformProgress));
                canvas.drawRoundRect(rectF, fDp, fDp, PaintView.this.typefaceMenuBackgroundPaint);
                PaintView.this.typefaceMenuBackgroundPaint.setAlpha(alpha);
                canvas.drawRoundRect(rectF, fDp, fDp, PaintView.this.typefaceMenuOutlinePaint);
            }
        };
        this.overlayLayout = frameLayout4;
        addView(frameLayout4, LayoutHelper.createFrame(-1, -1.0f));
        PaintTypefaceListView paintTypefaceListView = new PaintTypefaceListView(context);
        this.typefaceListView = paintTypefaceListView;
        paintTypefaceListView.setVisibility(8);
        this.typefaceListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view3, int i6) {
                PaintView.m4529$r8$lambda$R8Ui38q3MsqtWt7rypX78eyODE(this.f$0, view3, i6);
            }
        });
        this.textOptionsView.setTypefaceListView(this.typefaceListView);
        this.overlayLayout.addView(this.typefaceListView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 8.0f, 8.0f));
        this.typefaceMenuOutlinePaint.setStyle(Paint.Style.FILL);
        this.typefaceMenuOutlinePaint.setColor(352321535);
        this.typefaceMenuBackgroundPaint.setColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        PaintColorsListView paintColorsListView = new PaintColorsListView(context) {
            private Path path = new Path();

            @Override
            public void draw(Canvas canvas) {
                ViewGroup barView = PaintView.this.getBarView();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.lerp(barView.getLeft() - getLeft(), 0, PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getTop() - getTop(), 0, PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getRight() - getLeft(), getWidth(), PaintView.this.toolsTransformProgress), AndroidUtilities.lerp(barView.getBottom() - getTop(), getHeight(), PaintView.this.toolsTransformProgress));
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
                PaintView.m4533$r8$lambda$eIPhcx0VA7U6ZTz5ULIuViGQxI(this.f$0, (Integer) obj);
            }
        });
        this.bottomLayout.addView(this.colorsListView, LayoutHelper.createFrame(-1, 84.0f, 48, 56.0f, 0.0f, 56.0f, 6.0f));
        setupTabsLayout(context);
        PaintCancelView paintCancelView = new PaintCancelView(context);
        this.cancelButton = paintCancelView;
        paintCancelView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.cancelButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.bottomLayout.addView(this.cancelButton, LayoutHelper.createFrame(32, 32.0f, 83, 12.0f, 0.0f, 0.0f, 4.0f));
        this.cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                PaintView.m4526$r8$lambda$KV4omYmCLKaQdbM8mfGFs26XIc(this.f$0, view3);
            }
        });
        PaintDoneView paintDoneView = new PaintDoneView(context);
        this.doneButton = paintDoneView;
        paintDoneView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        this.doneButton.setBackground(Theme.createSelectorDrawable(1090519039));
        this.doneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                PaintView.$r8$lambda$uFZyhW1wszQP1UCEnMOMI73TFJE(this.f$0, context, bitmap3, persistColorPalette, view3);
            }
        });
        this.bottomLayout.addView(this.doneButton, LayoutHelper.createFrame(32, 32.0f, 85, 0.0f, 0.0f, 12.0f, 4.0f));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setColorSwatch(this.colorSwatch);
        this.weightChooserView.setRenderView(this.renderView);
        this.weightChooserView.setValueOverride(valueOverride);
        this.colorSwatch.brushWeight = valueOverride.get();
        this.weightChooserView.setOnUpdate(new Runnable() {
            @Override
            public final void run() {
                PaintView.m4521$r8$lambda$8bnbpgQIcpNrDuY6Klv0Ys4ipo(this.f$0, i);
            }
        });
        addView(this.weightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.pipetteContainerLayout = frameLayout5;
        addView(frameLayout5, LayoutHelper.createFrame(-1, -1.0f));
        this.colorSwatchOutlinePaint.setStyle(Paint.Style.STROKE);
        this.colorSwatchOutlinePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        setCurrentSwatch(this.colorSwatch, true);
        onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
        updateColors();
        if (Build.VERSION.SDK_INT >= 29) {
            i5 = 1;
            setSystemGestureExclusionRects(Arrays.asList(new Rect(0, (int) (AndroidUtilities.displaySize.y * 0.35f), AndroidUtilities.dp(100.0f), (int) (((double) AndroidUtilities.displaySize.y) * 0.65d))));
        } else {
            i5 = 1;
        }
        this.keyboardNotifier = new KeyboardNotifier(windowView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PaintView.m4524$r8$lambda$ES9xyWYC0uOX1LRDjIWpITGOo8(this.f$0, windowView, (Integer) obj);
            }
        }) {
            @Override
            public void ignore(boolean z4) {
                super.ignore(z4);
                if (z4) {
                    PaintView.this.showTypefaceMenu(false);
                }
            }
        };
        EmojiBottomSheet.savedPosition = i5;
    }

    public static void m4537$r8$lambda$oBldUZaDbn8VHalkh5eS6GMZ6o(PaintView paintView) {
        boolean zCanUndo = paintView.undoStore.canUndo();
        paintView.undoButton.animate().cancel();
        paintView.undoButton.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        paintView.undoButton.setClickable(zCanUndo);
        paintView.undoAllButton.animate().cancel();
        paintView.undoAllButton.animate().alpha(zCanUndo ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        paintView.undoAllButton.setClickable(zCanUndo);
    }

    public static void m4520$r8$lambda$dGFoaS0jxh1gKM8vN1N0xK2n9w(PaintView paintView, View view) {
        RenderView renderView = paintView.renderView;
        if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
            paintView.renderView.clearShape();
            paintView.paintToolsView.setSelectedIndex(1);
            paintView.onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            return;
        }
        paintView.undoStore.undo();
    }

    public static void m4541$r8$lambda$u9DlI6yf9KgnfSAfq24i4_Qzc(PaintView paintView, View view) {
        EntityView entityView = paintView.currentEntityView;
        if (entityView instanceof TextPaintView) {
            AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getFocusedView());
        }
        if (paintView.emojiViewVisible) {
            paintView.hideEmojiPopup(false);
        }
        paintView.removeEntity(paintView.currentEntityView);
        paintView.selectEntity(null);
    }

    public static void m4529$r8$lambda$R8Ui38q3MsqtWt7rypX78eyODE(PaintView paintView, View view, int i) {
        paintView.getClass();
        PaintTypeface paintTypeface = (PaintTypeface) PaintTypeface.get().get(i);
        paintView.textOptionsView.setTypeface(paintTypeface.getKey());
        paintView.onTypefaceSelected(paintTypeface);
        paintView.showTypefaceMenu(false);
    }

    public static void m4533$r8$lambda$eIPhcx0VA7U6ZTz5ULIuViGQxI(PaintView paintView, Integer num) {
        paintView.getClass();
        paintView.setNewColor(num.intValue());
        paintView.showColorList(false);
    }

    public static void m4526$r8$lambda$KV4omYmCLKaQdbM8mfGFs26XIc(PaintView paintView, View view) {
        if (paintView.isColorListShown) {
            paintView.showColorList(false);
            return;
        }
        if (paintView.emojiViewVisible) {
            paintView.hideEmojiPopup(true);
            return;
        }
        if (paintView.editingText) {
            paintView.selectEntity(null);
            return;
        }
        Runnable runnable = paintView.onCancelButtonClickedListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void $r8$lambda$uFZyhW1wszQP1UCEnMOMI73TFJE(final PaintView paintView, Context context, final Bitmap bitmap, final PersistColorPalette persistColorPalette, View view) {
        if (paintView.isColorListShown) {
            ColorPickerBottomSheet colorPickerBottomSheet = new ColorPickerBottomSheet(context, paintView.resourcesProvider);
            paintView.colorPickerBottomSheet = colorPickerBottomSheet;
            colorPickerBottomSheet.setColor(paintView.colorSwatch.color).setPipetteDelegate(new ColorPickerBottomSheet.PipetteDelegate() {
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
                    return PaintView.this.pipetteContainerLayout;
                }

                @Override
                public View getSnapshotDrawingView() {
                    return PaintView.this;
                }

                @Override
                public void onDrawImageOverCanvas(Bitmap bitmap2, Canvas canvas) {
                    Matrix matrix = PaintView.this.renderView.getMatrix();
                    canvas.save();
                    canvas.translate(PaintView.this.renderView.getX(), PaintView.this.renderView.getY());
                    canvas.concat(matrix);
                    canvas.scale(PaintView.this.renderView.getWidth() / bitmap.getWidth(), PaintView.this.renderView.getHeight() / bitmap.getHeight(), 0.0f, 0.0f);
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
                    PaintView.this.showColorList(false);
                    persistColorPalette.selectColor(i);
                    persistColorPalette.saveColors();
                    PaintView.this.setNewColor(i);
                    PaintView.this.colorsListView.setSelectedColorIndex(persistColorPalette.getCurrentColorPosition());
                    PaintView.this.colorsListView.getAdapter().notifyDataSetChanged();
                }
            }).setColorListener(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    PaintView.$r8$lambda$EQ7QjT8U9YRwr9AD3pOyF1Ltpjg(this.f$0, persistColorPalette, (Integer) obj);
                }
            }).show();
        } else {
            Runnable runnable = paintView.onDoneButtonClickedListener;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public static void $r8$lambda$EQ7QjT8U9YRwr9AD3pOyF1Ltpjg(PaintView paintView, PersistColorPalette persistColorPalette, Integer num) {
        paintView.getClass();
        persistColorPalette.selectColor(num.intValue());
        persistColorPalette.saveColors();
        paintView.setNewColor(num.intValue());
        paintView.colorsListView.setSelectedColorIndex(persistColorPalette.getCurrentColorPosition());
        paintView.colorPickerBottomSheet = null;
    }

    public static void m4521$r8$lambda$8bnbpgQIcpNrDuY6Klv0Ys4ipo(PaintView paintView, int i) {
        paintView.setCurrentSwatch(paintView.colorSwatch, true);
        PersistColorPalette.getInstance(i).setCurrentWeight(paintView.colorSwatch.brushWeight);
    }

    public static void m4524$r8$lambda$ES9xyWYC0uOX1LRDjIWpITGOo8(PaintView paintView, StoryRecorder.WindowView windowView, Integer num) {
        boolean z;
        paintView.getClass();
        int iMax = Math.max(0, Math.max(num.intValue() - windowView.getBottomPadding2(), paintView.emojiPadding - windowView.getPaddingUnderContainer()));
        paintView.notifyHeightChanged();
        if (iMax > 0) {
            EntityView entityView = paintView.currentEntityView;
            if ((entityView instanceof TextPaintView) && ((TextPaintView) entityView).getEditText().isFocused()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        AnimatorSet animatorSet = paintView.keyboardAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        paintView.keyboardAnimator = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        PaintWeightChooserView paintWeightChooserView = paintView.weightChooserView;
        float[] fArr = {iMax > 0 ? Math.min(0.0f, ((-iMax) / 2.0f) - AndroidUtilities.dp(8.0f)) : 0.0f};
        Property property = View.TRANSLATION_Y;
        arrayList.add(ObjectAnimator.ofFloat(paintWeightChooserView, (Property<PaintWeightChooserView, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(paintView.bottomLayout, (Property<FrameLayout, Float>) property, iMax > 0 ? Math.min(0, (-iMax) + AndroidUtilities.dp(40.0f)) : 0));
        LinearLayout linearLayout = paintView.tabsLayout;
        float[] fArr2 = {z ? 0.0f : 1.0f};
        Property property2 = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) property2, fArr2));
        arrayList.add(ObjectAnimator.ofFloat(paintView.doneButton, (Property<PaintDoneView, Float>) property2, (!z || paintView.isColorListShown) ? 1.0f : 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(paintView.cancelButton, (Property<PaintCancelView, Float>) property2, (!z || paintView.isColorListShown) ? 1.0f : 0.0f));
        paintView.updatePreviewViewTranslationY();
        paintView.keyboardAnimator.playTogether(arrayList);
        if (z) {
            paintView.keyboardAnimator.setDuration(250L);
            paintView.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
        } else {
            paintView.keyboardAnimator.setDuration(350L);
            paintView.keyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        }
        paintView.keyboardAnimator.start();
        for (int i = 0; i < arrayList.size(); i++) {
            ((Animator) arrayList.get(i)).setDuration(z ? 350L : 250L);
            ((Animator) arrayList.get(i)).setInterpolator(z ? CubicBezierInterpolator.EASE_OUT_QUINT : AdjustPanLayoutHelper.keyboardInterpolator);
            ((Animator) arrayList.get(i)).start();
        }
        if (!z) {
            paintView.showTypefaceMenu(false);
        }
        if (paintView.wasKeyboardVisible != z) {
            paintView.checkEntitiesIsVideo();
        }
        paintView.wasKeyboardVisible = z;
    }

    private void updatePreviewViewTranslationY() {
        EntityView entityView;
        ObjectAnimator objectAnimator = this.previewViewTranslationAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        View view = (View) this.renderView.getParent();
        if (view == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, (((!this.keyboardNotifier.keyboardVisible() || this.keyboardNotifier.ignoring) && this.emojiPadding <= 0) || (entityView = this.currentEntityView) == null) ? 0.0f : (-(entityView.getPosition().y - (view.getMeasuredHeight() * 0.3f))) * view.getScaleY());
        this.previewViewTranslationAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(350L);
        this.previewViewTranslationAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.previewViewTranslationAnimator.start();
    }

    public void onAnimationStateChanged(boolean z) {
        this.weightChooserView.setLayerType(z ? 2 : 0, null);
    }

    public View getWeightChooserView() {
        return this.weightChooserView;
    }

    public View getTopLayout() {
        return this.topLayout;
    }

    public View getBottomLayout() {
        return this.bottomLayout;
    }

    public void setNewColor(final int i) {
        Swatch swatch = this.colorSwatch;
        final int i2 = swatch.color;
        swatch.color = i;
        setCurrentSwatch(swatch, true, null, true);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PaintView.$r8$lambda$VTwXdQ1aFFz1FfgczXN5Bap14IQ(this.f$0, i2, i, valueAnimator);
            }
        });
        duration.start();
    }

    public static void $r8$lambda$VTwXdQ1aFFz1FfgczXN5Bap14IQ(PaintView paintView, int i, int i2, ValueAnimator valueAnimator) {
        paintView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        paintView.colorSwatch.color = ColorUtils.blendARGB(i, i2, fFloatValue);
        paintView.bottomLayout.invalidate();
    }

    private LocationView createLocationSticker(TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea, boolean z) {
        int i;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        LocationView locationView = new LocationView(getContext(), pointFStartPositionRelativeToEntity, this.currentAccount, messageMedia, mediaArea, measuredWidth / 240.0f, iDp);
        if (pointFStartPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            locationView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            locationView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            locationView.setColor(i);
        }
        locationView.setDelegate(this);
        locationView.setMaxWidth(iDp);
        this.entitiesView.addView(locationView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            locationView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            locationView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(locationView);
            selectEntity(locationView, false);
        }
        return locationView;
    }

    private WeatherView createWeatherView(Weather.State state, boolean z) {
        int i;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        WeatherView weatherView = new WeatherView(getContext(), pointFStartPositionRelativeToEntity, this.currentAccount, state, measuredWidth / 240.0f, iDp);
        if (pointFStartPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            weatherView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            weatherView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            weatherView.setColor(i);
        }
        weatherView.setDelegate(this);
        weatherView.setMaxWidth(iDp);
        this.entitiesView.addView(weatherView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            weatherView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            weatherView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(weatherView);
            selectEntity(weatherView, false);
        }
        return weatherView;
    }

    private LinkView createLinkSticker(LinkPreview.WebPagePreview webPagePreview, TL_stories.MediaArea mediaArea, boolean z) {
        int i;
        onTextAdd();
        this.forceChanges = true;
        getPaintingSize();
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(null);
        float measuredWidth = this.entitiesView.getMeasuredWidth() <= 0 ? this.w : this.entitiesView.getMeasuredWidth();
        int iDp = ((int) measuredWidth) - AndroidUtilities.dp(58.0f);
        LinkView linkView = new LinkView(getContext(), pointFStartPositionRelativeToEntity, this.currentAccount, webPagePreview, mediaArea, measuredWidth / 360.0f, iDp, 3);
        if (pointFStartPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            linkView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            linkView.setStickyY(2);
        }
        Swatch swatch = this.colorSwatch;
        if (swatch != null && (i = swatch.color) != -47814) {
            linkView.setColor(i);
        }
        linkView.setDelegate(this);
        linkView.setMaxWidth(iDp);
        this.entitiesView.addView(linkView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            linkView.scale(1.0f / cropState.cropScale);
            MediaController.CropState cropState2 = this.currentCropState;
            linkView.rotate(-(cropState2.transformRotation + cropState2.cropRotate));
        }
        if (z) {
            registerRemovalUndo(linkView);
            selectEntity(linkView, false);
        }
        return linkView;
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
                PaintView.m4530$r8$lambda$VI7E7eB4xCOow7C5y4pHyXJp3A(this.f$0);
            }
        });
        if (pointFStartPositionRelativeToEntity.x == this.entitiesView.getMeasuredWidth() / 2.0f) {
            textPaintView.setStickyX(2);
        }
        if (pointFStartPositionRelativeToEntity.y == this.entitiesView.getMeasuredHeight() / 2.0f) {
            textPaintView.setStickyY(2);
        }
        textPaintView.setDelegate(this);
        textPaintView.setMaxWidth(this.w - AndroidUtilities.dp(32.0f));
        textPaintView.setTypeface(PersistColorPalette.getInstance(this.currentAccount).getCurrentTypeface());
        textPaintView.setType(PersistColorPalette.getInstance(this.currentAccount).getCurrentTextType());
        this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
        checkEntitiesIsVideo();
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

    public static void m4530$r8$lambda$VI7E7eB4xCOow7C5y4pHyXJp3A(PaintView paintView) {
        PaintWeightChooserView paintWeightChooserView = paintView.weightChooserView;
        if (paintWeightChooserView != null) {
            paintWeightChooserView.invalidate();
        }
    }

    public void clearAll() {
        if (this.undoStore.canUndo()) {
            RenderView renderView = this.renderView;
            if (renderView != null && (renderView.getCurrentBrush() instanceof Brush.Shape)) {
                this.renderView.clearShape();
                this.paintToolsView.setSelectedIndex(1);
                onBrushSelected((Brush) Brush.BRUSHES_LIST.get(0));
            }
            RenderView renderView2 = this.renderView;
            if (renderView2 != null) {
                renderView2.clearAll();
            }
            this.undoStore.reset();
            this.entitiesView.removeAllViews();
        }
    }

    public void setOnDoneButtonClickedListener(Runnable runnable) {
        this.onDoneButtonClickedListener = runnable;
    }

    public void setOnCancelButtonClickedListener(Runnable runnable) {
        this.onCancelButtonClickedListener = runnable;
    }

    protected void editSelectedTextEntity() {
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
        boolean z4 = true;
        if (z3 && z) {
            TextPaintView textPaintView = (TextPaintView) entityView;
            int gravity = textPaintView.getEditText().getGravity();
            if (gravity == 17) {
                i2 = 1;
            } else if (gravity != 21) {
                i2 = 0;
            }
            this.textOptionsView.setAlignment(i2);
            PaintTypeface typeface = textPaintView.getTypeface();
            if (typeface != null) {
                this.textOptionsView.setTypeface(typeface.getKey());
            }
            this.textOptionsView.setOutlineType(textPaintView.getType(), true);
            this.overlayLayout.invalidate();
        }
        EntityView entityView2 = this.currentEntityView;
        if (entityView2 == null) {
            z2 = false;
        } else {
            if (entityView2 == entityView) {
                if (!entityView.hadMultitouch()) {
                    if (entityView instanceof LocationView) {
                        LocationView locationView = (LocationView) entityView;
                        locationView.setType((locationView.getType() + 1) % locationView.getTypesCount());
                    } else if (entityView instanceof WeatherView) {
                        WeatherView weatherView = (WeatherView) entityView;
                        weatherView.setType((weatherView.getType() + 1) % weatherView.getTypesCount());
                    } else if (entityView instanceof LinkView) {
                        LinkView linkView = (LinkView) entityView;
                        if (linkView.marker.withPreview()) {
                            LinkPreview linkPreview = linkView.marker;
                            linkPreview.setPreviewType(linkPreview.getPreviewType() == 0 ? 1 : 0);
                        } else {
                            linkView.setType(linkView.getNextType());
                        }
                    } else if (!this.editingText) {
                        if (entityView instanceof TextPaintView) {
                            this.enteredThroughText = true;
                            editSelectedTextEntity();
                        } else if (entityView instanceof ReactionWidgetEntityView) {
                            ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView;
                            if (this.reactionLayoutShowing && this.reactionForEntity == entityView) {
                                reactionWidgetEntityView.changeStyle(true);
                            } else {
                                showReactionsLayoutForView(reactionWidgetEntityView);
                            }
                        } else {
                            showMenuForEntity(this.currentEntityView);
                        }
                    } else {
                        EntityView entityView3 = this.currentEntityView;
                        if (entityView3 instanceof TextPaintView) {
                            AndroidUtilities.showKeyboard(((TextPaintView) entityView3).getFocusedView());
                            hideEmojiPopup(false);
                        }
                    }
                }
                return true;
            }
            entityView2.deselect();
            EntityView entityView4 = this.currentEntityView;
            if (entityView4 instanceof TextPaintView) {
                ((TextPaintView) entityView4).endEditing();
                if (!z3) {
                    this.editingText = false;
                    AndroidUtilities.hideKeyboard(((TextPaintView) this.currentEntityView).getFocusedView());
                    hideEmojiPopup(false);
                }
            } else if (entityView4 instanceof RoundView) {
                onDeselectRound((RoundView) entityView4);
            }
            z2 = true;
        }
        EntityView entityView5 = this.currentEntityView;
        this.currentEntityView = entityView;
        if ((entityView5 instanceof TextPaintView) && TextUtils.isEmpty(((TextPaintView) entityView5).getText())) {
            removeEntity(entityView5);
        }
        EntityView entityView6 = this.currentEntityView;
        if (entityView5 != entityView6 && (entityView6 instanceof RoundView)) {
            onSelectRound((RoundView) entityView6);
        }
        EntityView entityView7 = this.currentEntityView;
        if (entityView7 != null) {
            entityView7.select(this.selectionContainerView);
            EntityView entityView8 = this.currentEntityView;
            if (entityView8 instanceof TextPaintView) {
                final TextPaintView textPaintView2 = (TextPaintView) entityView8;
                textPaintView2.getSwatch().brushWeight = this.colorSwatch.brushWeight;
                textPaintView2.disableAutoresize(false);
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
        } else {
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
            z4 = z2;
        }
        updateTextDim();
        return z4;
    }

    private void showReactionsLayoutForView(ReactionWidgetEntityView reactionWidgetEntityView) {
        final ReactionsContainerLayout reactionsContainerLayout;
        ReactionWidgetEntityView reactionWidgetEntityView2 = this.reactionForEntity;
        if (reactionWidgetEntityView2 != null && reactionWidgetEntityView2 != reactionWidgetEntityView && (reactionsContainerLayout = this.reactionLayout) != null) {
            reactionsContainerLayout.animate().alpha(0.0f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AndroidUtilities.removeFromParent(reactionsContainerLayout);
                }
            });
            this.reactionLayout = null;
            this.reactionLayoutShowing = false;
            this.reactionShowProgress = 0.0f;
        }
        if (this.reactionLayout == null) {
            ReactionsContainerLayout reactionsContainerLayout2 = new ReactionsContainerLayout(2, LaunchActivity.getLastFragment(), getContext(), this.currentAccount, new WrappedResourceProvider(new DarkThemeResourceProvider()) {
                @Override
                public void appendColors() {
                    this.sparseIntArray.put(Theme.key_chat_emojiPanelBackground, ColorUtils.setAlphaComponent(-1, 30));
                }
            });
            this.reactionLayout = reactionsContainerLayout2;
            final BlurringShader.StoryBlurDrawer storyBlurDrawer = new BlurringShader.StoryBlurDrawer(this.blurManager, reactionsContainerLayout2, 0);
            this.reactionLayout.setPadding(0, AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f));
            this.parent.addView(this.reactionLayout, LayoutHelper.createFrame(-2, 96.0f, 53, 0.0f, 0.0f, 12.0f, 64.0f));
            final Paint paint = new Paint(1);
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, 120));
            this.reactionLayout.setDelegate(new ReactionsContainerLayout.ReactionsContainerDelegate() {
                private final Path clipPath = new Path();
                BlurringShader.StoryBlurDrawer windowBackgroundBlur;

                @Override
                public boolean allowLongPress() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$allowLongPress(this);
                }

                @Override
                public boolean drawBackground() {
                    return true;
                }

                @Override
                public boolean needEnterText() {
                    return ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$needEnterText(this);
                }

                @Override
                public void onEmojiWindowDismissed() {
                    ReactionsContainerLayout.ReactionsContainerDelegate.CC.$default$onEmojiWindowDismissed(this);
                }

                @Override
                public void drawRoundRect(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
                    Paint paint2;
                    if (!z && PaintView.this.blurManager != null && PaintView.this.blurManager.hasRenderNode()) {
                        BlurringShader.StoryBlurDrawer storyBlurDrawer2 = z ? this.windowBackgroundBlur : storyBlurDrawer;
                        this.clipPath.rewind();
                        this.clipPath.addRoundRect(rectF, f, f, Path.Direction.CW);
                        canvas.save();
                        canvas.clipPath(this.clipPath);
                        storyBlurDrawer2.drawRect(canvas);
                        paint.setAlpha((int) (i * 0.4f));
                        canvas.drawPaint(paint);
                        canvas.restore();
                        return;
                    }
                    if (z) {
                        if (this.windowBackgroundBlur == null) {
                            this.windowBackgroundBlur = new BlurringShader.StoryBlurDrawer(PaintView.this.blurManager, PaintView.this.reactionLayout.getReactionsWindow().windowView, 0);
                        }
                        float f4 = -f2;
                        float f5 = -f3;
                        this.windowBackgroundBlur.setBounds(f4, f5, PaintView.this.getMeasuredWidth() + f4, PaintView.this.getMeasuredHeight() + f5);
                        paint2 = this.windowBackgroundBlur.paint;
                    } else {
                        float f6 = -f2;
                        float f7 = -f3;
                        storyBlurDrawer.setBounds(f6, f7, PaintView.this.getMeasuredWidth() + f6, PaintView.this.getMeasuredHeight() + f7);
                        paint2 = storyBlurDrawer.paint;
                    }
                    paint2.setAlpha(i);
                    paint.setAlpha((int) (i * 0.4f));
                    canvas.drawRoundRect(rectF, f, f, paint2);
                    canvas.drawRoundRect(rectF, f, f, paint);
                }

                @Override
                public void onReactionClicked(View view, ReactionsLayoutInBubble.VisibleReaction visibleReaction, boolean z, boolean z2) {
                    ReactionWidgetEntityView reactionWidgetEntityView3 = PaintView.this.reactionForEntity;
                    if (reactionWidgetEntityView3 == null) {
                        return;
                    }
                    reactionWidgetEntityView3.setCurrentReaction(visibleReaction, true);
                    PaintView.this.showReactionsLayout(false);
                }
            });
            this.reactionLayout.setMessage(null, null, true);
        }
        this.reactionLayout.setFragment(LaunchActivity.getLastFragment());
        this.reactionForEntity = reactionWidgetEntityView;
        showReactionsLayout(true);
    }

    public void showReactionsLayout(final boolean z) {
        if (this.reactionLayoutShowing != z) {
            if (z || this.reactionLayout != null) {
                this.reactionLayoutShowing = z;
                if (z) {
                    this.reactionLayout.reset();
                    this.reactionLayout.setVisibility(0);
                    this.reactionLayout.setSelectedReaction(this.reactionForEntity.getCurrentReaction());
                    this.reactionLayout.getParent().bringChildToFront(this.reactionLayout);
                } else {
                    this.reactionForEntity = null;
                }
                if (z) {
                    this.invalidateReactionPosition = true;
                    this.parent.invalidate();
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.reactionShowProgress, z ? 1.0f : 0.0f);
                    this.reactionLayout.setTransitionProgress(this.reactionShowProgress);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaintView.$r8$lambda$o3KnaDXK8Fio01NMT7zr9GjJoTU(this.f$0, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (z) {
                                return;
                            }
                            PaintView.this.reactionLayout.setVisibility(8);
                            PaintView.this.reactionLayout.reset();
                        }
                    });
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    valueAnimatorOfFloat.start();
                    return;
                }
                if (this.reactionLayout.getReactionsWindow() != null) {
                    this.reactionLayout.getReactionsWindow().dismissWithAlpha();
                }
                this.reactionLayout.animate().alpha(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PaintView.this.reactionShowProgress = 0.0f;
                        PaintView.this.reactionLayout.setAlpha(1.0f);
                        PaintView.this.reactionLayout.setVisibility(8);
                        PaintView.this.reactionLayout.reset();
                    }
                }).start();
            }
        }
    }

    public static void $r8$lambda$o3KnaDXK8Fio01NMT7zr9GjJoTU(PaintView paintView, ValueAnimator valueAnimator) {
        paintView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        paintView.reactionShowProgress = fFloatValue;
        paintView.reactionLayout.setTransitionProgress(fFloatValue);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        if ((view == this.renderView || view == this.renderInputView || view == this.entitiesView || view == this.selectionContainerView) && this.currentCropState != null) {
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
            float measuredHeight2 = (((((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) + getAdditionalBottom()) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
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
                TextView textView = (TextView) getChildAt(PaintView.this.tabsSelectedIndex);
                TextView textView2 = PaintView.this.tabsNewSelectedIndex != -1 ? (TextView) getChildAt(PaintView.this.tabsNewSelectedIndex) : null;
                this.linePaint.setColor(textView.getCurrentTextColor());
                float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                Layout layout = textView.getLayout();
                if (layout == null) {
                    return;
                }
                Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                float interpolation = layout2 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(PaintView.this.tabsSelectionProgress);
                float fLerp = AndroidUtilities.lerp(textView.getX() + layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? textView2.getX() + layout2.getPrimaryHorizontal(layout.getLineStart(0)) : 0.0f, interpolation);
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
                PaintView.m4538$r8$lambda$pDzi3K0cRdyqqZAFZpx5xn1zcc(this.f$0, view);
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
                PaintView.$r8$lambda$Nb8K5FvxGN14iMGbkihq8hLTF7k(this.f$0, view);
            }
        });
        this.tabsLayout.addView(this.textTab, LayoutHelper.createLinear(0, -2, 1.0f));
    }

    public static void m4538$r8$lambda$pDzi3K0cRdyqqZAFZpx5xn1zcc(PaintView paintView, View view) {
        if (paintView.editingText) {
            paintView.selectEntity(null);
        } else {
            paintView.switchTab(0);
        }
    }

    public static void $r8$lambda$Nb8K5FvxGN14iMGbkihq8hLTF7k(PaintView paintView, View view) {
        paintView.switchTab(2);
        if (paintView.currentEntityView instanceof TextPaintView) {
            return;
        }
        paintView.forceChanges = true;
        paintView.createText(true);
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

    public void switchTab(final int i) {
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
                PaintView.$r8$lambda$GJy4C3Y2zNRt35JBQCZlRxNo0CY(this.f$0, barView, barView2, valueAnimator2);
            }
        });
        this.tabsSelectionAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                View view;
                if (barView != null && (view = barView2) != null) {
                    view.setVisibility(0);
                }
                if (i == 2) {
                    PaintView.this.weightChooserView.setMinMax(0.5f, 2.0f);
                    return;
                }
                Brush currentBrush = PaintView.this.renderView.getCurrentBrush();
                if ((currentBrush instanceof Brush.Blurer) || (currentBrush instanceof Brush.Eraser)) {
                    PaintView.this.weightChooserView.setMinMax(0.4f, 1.75f);
                } else {
                    PaintView.this.weightChooserView.setMinMax(0.05f, 1.0f);
                }
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                PaintView paintView = PaintView.this;
                paintView.tabsSelectedIndex = paintView.tabsNewSelectedIndex;
                PaintView.this.tabsNewSelectedIndex = -1;
                PaintView.this.tabsLayout.invalidate();
                View view = barView;
                if (view != null && barView2 != null) {
                    view.setVisibility(8);
                }
                if (animator == PaintView.this.tabsSelectionAnimator) {
                    PaintView.this.tabsSelectionAnimator = null;
                }
            }
        });
        this.tabsSelectionAnimator.start();
    }

    public static void $r8$lambda$GJy4C3Y2zNRt35JBQCZlRxNo0CY(PaintView paintView, View view, View view2, ValueAnimator valueAnimator) {
        float f;
        paintView.getClass();
        paintView.tabsSelectionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        paintView.tabsLayout.invalidate();
        paintView.bottomLayout.invalidate();
        paintView.overlayLayout.invalidate();
        int i = 0;
        while (i < paintView.tabsLayout.getChildCount()) {
            View childAt = paintView.tabsLayout.getChildAt(i);
            if (i == paintView.tabsNewSelectedIndex) {
                f = paintView.tabsSelectionProgress;
            } else {
                f = i == paintView.tabsSelectedIndex ? 1.0f - paintView.tabsSelectionProgress : 0.0f;
            }
            childAt.setAlpha((f * 0.4f) + 0.6f);
            i++;
        }
        float interpolation = CubicBezierInterpolator.DEFAULT.getInterpolation(paintView.tabsSelectionProgress);
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
                PaintView.m4523$r8$lambda$CisvG___c2pZ0BvnUk9R52o8Zg(this.f$0);
            }
        }, 350L);
        final EmojiBottomSheet emojiBottomSheet = new EmojiBottomSheet(getContext(), false, this.resourcesProvider, false) {
            @Override
            public void onDismissAnimationStart() {
                super.onDismissAnimationStart();
                PaintView.this.switchTab(i);
            }

            @Override
            public boolean canShowWidget(Integer num) {
                boolean z = false;
                if (PaintView.this.isBot) {
                    return num.intValue() == 2;
                }
                if (num.intValue() != 5) {
                    return true;
                }
                for (int i2 = 0; i2 < PaintView.this.entitiesView.getChildCount(); i2++) {
                    if (PaintView.this.entitiesView.getChildAt(i2) instanceof WeatherView) {
                        z = true;
                        break;
                    }
                }
                return !z;
            }

            @Override
            public boolean canClickWidget(Integer num) {
                if (num.intValue() == 3) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < PaintView.this.entitiesView.getChildCount(); i3++) {
                        if (PaintView.this.entitiesView.getChildAt(i3) instanceof ReactionWidgetEntityView) {
                            i2++;
                        }
                    }
                    if (i2 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                        showPremiumBulletin(LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]));
                        return false;
                    }
                    if (i2 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                        try {
                            this.container.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        BulletinFactory.of(this.container, this.resourcesProvider).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0])).show(true);
                        return false;
                    }
                }
                return true;
            }

            @Override
            protected boolean checkAudioPermission(Runnable runnable) {
                return PaintView.this.checkAudioPermission(runnable);
            }
        };
        this.emojiPopup = emojiBottomSheet;
        final StoryRecorder.WindowView windowView = this.parent;
        Objects.requireNonNull(windowView);
        emojiBottomSheet.setBlurDelegate(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                windowView.drawBlurBitmap((Bitmap) obj, ((Float) obj2).floatValue());
            }
        });
        final boolean[] zArr = {true};
        emojiBottomSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                PaintView.$r8$lambda$CzX1vGhsurBYGJVpnpNoGDpyTck(this.f$0, zArr, i, dialogInterface);
            }
        });
        emojiBottomSheet.whenDocumentSelected(new Utilities.Callback3Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3) {
                return PaintView.$r8$lambda$QBQ0un2FrHxdCRyZH3sau1YHD8Q(this.f$0, obj, (TLRPC.Document) obj2, (Boolean) obj3);
            }
        });
        emojiBottomSheet.whenWidgetSelected(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return PaintView.$r8$lambda$egnvP7JOgwFVch9FnCxpeAGJjGw(this.f$0, zArr, emojiBottomSheet, (Integer) obj);
            }
        });
        emojiBottomSheet.show();
        onOpenCloseStickersAlert(true);
    }

    public static void m4523$r8$lambda$CisvG___c2pZ0BvnUk9R52o8Zg(PaintView paintView) {
        if (paintView.facesBitmap != null) {
            paintView.detectFaces();
        }
    }

    public static void $r8$lambda$CzX1vGhsurBYGJVpnpNoGDpyTck(PaintView paintView, boolean[] zArr, int i, DialogInterface dialogInterface) {
        paintView.emojiPopup = null;
        if (zArr[0]) {
            paintView.onOpenCloseStickersAlert(false);
        }
        paintView.switchTab(i);
    }

    public static Boolean $r8$lambda$QBQ0un2FrHxdCRyZH3sau1YHD8Q(PaintView paintView, Object obj, TLRPC.Document document, Boolean bool) {
        paintView.forceChanges = true;
        StickerView stickerViewCreateSticker = paintView.createSticker(obj, document, false);
        if (bool.booleanValue()) {
            stickerViewCreateSticker.setScale(1.5f);
        }
        paintView.appearAnimation(stickerViewCreateSticker);
        return Boolean.TRUE;
    }

    public static Boolean $r8$lambda$egnvP7JOgwFVch9FnCxpeAGJjGw(final PaintView paintView, boolean[] zArr, final EmojiBottomSheet emojiBottomSheet, Integer num) {
        paintView.getClass();
        if (num.intValue() == 0) {
            zArr[0] = false;
            paintView.showLocationAlert(null, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    PaintView paintView2 = this.f$0;
                    paintView2.appearAnimation(paintView2.createLocationSticker((TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2, false));
                }
            });
            return Boolean.TRUE;
        }
        if (num.intValue() == 5) {
            zArr[0] = false;
            Weather.fetch(true, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PaintView.$r8$lambda$RwC7AQmGB9KJ066GIXXfB3x3nA8(this.f$0, emojiBottomSheet, (Weather.State) obj);
                }
            });
            return Boolean.FALSE;
        }
        if (num.intValue() == 2) {
            emojiBottomSheet.dismiss();
            paintView.onGalleryClick();
            return Boolean.TRUE;
        }
        if (num.intValue() == 1) {
            zArr[0] = false;
            paintView.showAudioAlert(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.onAudioSelect((MessageObject) obj);
                }
            });
            return Boolean.TRUE;
        }
        if (num.intValue() == 3) {
            paintView.forceChanges = true;
            paintView.appearAnimation(paintView.createReactionWidget(true));
            return Boolean.TRUE;
        }
        if (num.intValue() == 4) {
            if (!UserConfig.getInstance(paintView.currentAccount).isPremium()) {
                try {
                    emojiBottomSheet.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                BulletinFactory.of(emojiBottomSheet.container, paintView.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.StoryLinkPremium), new Runnable() {
                    @Override
                    public final void run() {
                        PaintView.m4542$r8$lambda$uYgGVVdkNZqPluSn4FKVqKnY5M(this.f$0);
                    }
                })).show(true);
                return Boolean.FALSE;
            }
            int i = 0;
            for (int i2 = 0; i2 < paintView.entitiesView.getChildCount(); i2++) {
                if (paintView.entitiesView.getChildAt(i2) instanceof LinkView) {
                    i++;
                }
            }
            if (i >= 3) {
                BulletinFactory.of(emojiBottomSheet.container, paintView.resourcesProvider).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.StoryLinkLimitTitle), LocaleController.formatPluralString("StoryLinkLimitMessage", 3, new Object[0])).show(true);
                return Boolean.FALSE;
            }
            zArr[0] = false;
            paintView.showLinkAlert(null);
            emojiBottomSheet.dismiss();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public static void $r8$lambda$RwC7AQmGB9KJ066GIXXfB3x3nA8(PaintView paintView, EmojiBottomSheet emojiBottomSheet, Weather.State state) {
        paintView.getClass();
        if (state != null) {
            emojiBottomSheet.dismiss();
            paintView.onOpenCloseStickersAlert(false);
            paintView.appearAnimation(paintView.createWeatherView(state, false));
        }
    }

    public static void m4542$r8$lambda$uYgGVVdkNZqPluSn4FKVqKnY5M(PaintView paintView) {
        paintView.getClass();
        new PremiumFeatureBottomSheet(new BaseFragment() {
            @Override
            public int getCurrentAccount() {
                return this.currentAccount;
            }

            @Override
            public Context getContext() {
                return PaintView.this.getContext();
            }

            @Override
            public Activity getParentActivity() {
                return AndroidUtilities.findActivity(PaintView.this.getContext());
            }

            @Override
            public Theme.ResourcesProvider getResourceProvider() {
                return PaintView.this.resourcesProvider;
            }

            @Override
            public boolean presentFragment(BaseFragment baseFragment) {
                BaseFragment lastFragment = LaunchActivity.getLastFragment();
                if (lastFragment == null) {
                    return false;
                }
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                bottomSheetParams.allowNestedScroll = false;
                lastFragment.showAsSheet(baseFragment, bottomSheetParams);
                return true;
            }
        }, 14, true).show();
    }

    private void showLinkAlert(final LinkView linkView) {
        StoryLinkSheet storyLinkSheet = new StoryLinkSheet(getContext(), this.resourcesProvider, this.previewView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                PaintView.$r8$lambda$PHQeDsJRGkGhnqYEGCV3S60RNU4(this.f$0, linkView, (LinkPreview.WebPagePreview) obj);
            }
        });
        if (linkView != null) {
            storyLinkSheet.set(linkView.link);
        }
        storyLinkSheet.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.onOpenCloseStickersAlert(false);
            }
        });
        storyLinkSheet.show();
        onOpenCloseStickersAlert(true);
    }

    public static void $r8$lambda$PHQeDsJRGkGhnqYEGCV3S60RNU4(PaintView paintView, LinkView linkView, LinkPreview.WebPagePreview webPagePreview) {
        if (linkView != null) {
            linkView.setLink(paintView.currentAccount, webPagePreview, null);
            paintView.appearAnimation(linkView);
        } else {
            paintView.appearAnimation(paintView.createLinkSticker(webPagePreview, null, false));
        }
    }

    class AnonymousClass24 extends ChatActivity {
        final Utilities.Callback2 val$onLocationSelected;

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

        AnonymousClass24(Bundle bundle, Utilities.Callback2 callback2) {
            super(bundle);
            this.val$onLocationSelected = callback2;
        }

        @Override
        public Theme.ResourcesProvider getResourceProvider() {
            return PaintView.this.resourcesProvider;
        }

        @Override
        public Activity getParentActivity() {
            return AndroidUtilities.findActivity(PaintView.this.getContext());
        }

        @Override
        public TLRPC.User getCurrentUser() {
            return UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }

        @Override
        public void didSelectLocation(final TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
            Object obj;
            Object obj2;
            if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint.geo = messageMedia.geo;
                obj2 = tL_mediaAreaGeoPoint;
            } else {
                if (!(messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                    return;
                }
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
                long j2 = tL_messageMediaVenue.query_id;
                if (j2 == -1 || j2 == -2) {
                    final TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
                    tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
                    TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                    tL_mediaAreaGeoPoint2.address = tL_geoPointAddress;
                    if (tL_geoPointAddress != null) {
                        tL_mediaAreaGeoPoint2.flags |= 1;
                    }
                    Utilities.globalQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            PaintView.AnonymousClass24.m4546$r8$lambda$TJAqtHJ3gUHTAs7IV4QJfxXHk(messageMedia, tL_mediaAreaGeoPoint2);
                        }
                    });
                    obj = tL_mediaAreaGeoPoint2;
                } else {
                    TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                    tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                    tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                    obj = tL_inputMediaAreaVenue;
                }
                obj2 = obj;
            }
            this.val$onLocationSelected.run(messageMedia, obj2);
        }

        public static void m4546$r8$lambda$TJAqtHJ3gUHTAs7IV4QJfxXHk(TLRPC.MessageMedia messageMedia, TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint) {
            try {
                List<Address> fromLocationName = new Geocoder(ApplicationLoader.applicationContext, LocaleController.getInstance().getCurrentLocale()).getFromLocationName(messageMedia.title, 1);
                if (fromLocationName.size() <= 0) {
                    return;
                }
                tL_mediaAreaGeoPoint.geo.lat = fromLocationName.get(0).getLatitude();
                tL_mediaAreaGeoPoint.geo._long = fromLocationName.get(0).getLongitude();
            } catch (Exception unused) {
            }
        }
    }

    private void showLocationAlert(LocationView locationView, Utilities.Callback2 callback2) {
        TLRPC.MessageMedia messageMedia;
        TLRPC.GeoPoint geoPoint;
        ChatAttachAlert chatAttachAlert = new ChatAttachAlert(getContext(), new AnonymousClass24(null, callback2), false, true, false, this.resourcesProvider);
        chatAttachAlert.setDelegate(new ChatAttachAlert.ChatAttachViewDelegate() {
            @Override
            public void didPressedButton(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
            }

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
            public boolean selectItemOnClicking() {
                return ChatAttachAlert.ChatAttachViewDelegate.CC.$default$selectItemOnClicking(this);
            }

            @Override
            public void sendAudio(ArrayList arrayList, CharSequence charSequence, boolean z, int i, int i2, long j, boolean z2, long j2) {
                ChatAttachAlert.ChatAttachViewDelegate.CC.$default$sendAudio(this, arrayList, charSequence, z, i, i2, j, z2, j2);
            }
        });
        if (locationView != null && (messageMedia = locationView.location) != null && (geoPoint = messageMedia.geo) != null) {
            chatAttachAlert.setStoryLocationPicker(geoPoint.lat, geoPoint._long);
        } else if (this.fileFromGallery) {
            chatAttachAlert.setStoryLocationPicker(this.isVideo, this.file);
        } else {
            chatAttachAlert.setStoryLocationPicker();
        }
        chatAttachAlert.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.onOpenCloseStickersAlert(false);
            }
        });
        chatAttachAlert.init();
        chatAttachAlert.show();
    }

    private void showAudioAlert(Utilities.Callback callback) {
        SelectAudioAlert selectAudioAlert = new SelectAudioAlert(getContext(), callback, new DarkThemeResourceProvider());
        selectAudioAlert.setOnDismissListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.onOpenCloseStickersAlert(false);
            }
        });
        selectAudioAlert.show();
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
        float f = currentActionBarHeight2;
        if (((float) Math.floor((fFloor * currentActionBarHeight) / width)) > f) {
            fFloor = (float) Math.floor((f * width) / currentActionBarHeight);
        }
        this.baseScale = fFloor / this.paintingSize.width;
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            entityView.updateSelectionView();
        }
        measureChild(this.bottomLayout, i, i2);
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.pipetteContainerLayout, i, i2);
        measureChild(this.overlayLayout, i, View.MeasureSpec.makeMeasureSpec(size2 - Math.max(this.emojiPadding - this.parent.getPaddingUnderContainer(), measureKeyboardHeight()), 1073741824));
        FrameLayout frameLayout = this.topLayout;
        frameLayout.setPadding(frameLayout.getPaddingLeft(), AndroidUtilities.dp(12.0f), this.topLayout.getPaddingRight(), this.topLayout.getPaddingBottom());
        measureChild(this.topLayout, i, i2);
        this.ignoreLayout = false;
        if (!this.waitingForKeyboardOpen && AndroidUtilities.dp(20.0f) >= 0 && !this.emojiViewVisible && !this.isAnimatePopupClosing) {
            this.ignoreLayout = true;
            hideEmojiView();
            this.ignoreLayout = false;
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            return;
        }
        hideEmojiView();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    private Size getPaintingSize() {
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        Size size2 = new Size(1080.0f, 1920.0f);
        this.paintingSize = size2;
        return size2;
    }

    public void init() {
        this.entitiesView.setVisibility(0);
        this.renderView.setVisibility(0);
        this.renderInputView.setVisibility(0);
    }

    public void setupEntities() {
        int i;
        RoundView roundViewCreateRound;
        MessageEntityView messageEntityViewCreateMessage;
        Emoji.EmojiSpan[] emojiSpanArr;
        StickerView stickerView;
        ArrayList arrayList = this.initialEntities;
        if (arrayList != null) {
            StoryEntry storyEntry = this.initialEntry;
            this.initialEntry = null;
            this.initialEntities = null;
            int size = arrayList.size();
            boolean z = false;
            int i2 = 0;
            while (i2 < size) {
                VideoEditedInfo.MediaEntity mediaEntity = (VideoEditedInfo.MediaEntity) arrayList.get(i2);
                byte b = mediaEntity.type;
                if (b == 0) {
                    StickerView stickerViewCreateSticker = createSticker(mediaEntity.parentObject, mediaEntity.document, z);
                    if ((2 & mediaEntity.subType) != 0) {
                        stickerViewCreateSticker.mirror();
                    }
                    ViewGroup.LayoutParams layoutParams = stickerViewCreateSticker.getLayoutParams();
                    layoutParams.width = mediaEntity.viewWidth;
                    layoutParams.height = mediaEntity.viewHeight;
                    i = i2;
                    stickerView = stickerViewCreateSticker;
                } else if (b == 1) {
                    TextPaintView textPaintViewCreateText = createText(z);
                    textPaintViewCreateText.setType(mediaEntity.subType);
                    textPaintViewCreateText.setTypeface(mediaEntity.textTypeface);
                    textPaintViewCreateText.setBaseFontSize(mediaEntity.fontSize);
                    SpannableString spannableString = new SpannableString(mediaEntity.text);
                    ArrayList<VideoEditedInfo.EmojiEntity> arrayList2 = mediaEntity.entities;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        VideoEditedInfo.EmojiEntity emojiEntity = arrayList2.get(i3);
                        i3++;
                        VideoEditedInfo.EmojiEntity emojiEntity2 = emojiEntity;
                        AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(emojiEntity2.document_id, 1.0f, textPaintViewCreateText.getFontMetricsInt());
                        int i4 = emojiEntity2.offset;
                        spannableString.setSpan(animatedEmojiSpan, i4, emojiEntity2.length + i4, 33);
                        i2 = i2;
                    }
                    i = i2;
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
                    i = i2;
                    if (b == 2) {
                        PhotoView photoViewCreatePhoto = createPhoto(mediaEntity.text, false);
                        photoViewCreatePhoto.crop = mediaEntity.crop;
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
                    } else if (b == 6) {
                        messageEntityViewCreateMessage = createMessage(storyEntry.messageObjects, false, storyEntry.isVideo);
                        if (mediaEntity.viewWidth > 0 && mediaEntity.viewHeight > 0) {
                            stickerView = messageEntityViewCreateMessage;
                            stickerView = messageEntityViewCreateMessage;
                            ViewGroup.LayoutParams layoutParams3 = messageEntityViewCreateMessage.getLayoutParams();
                            layoutParams3.width = mediaEntity.viewWidth;
                            layoutParams3.height = mediaEntity.viewHeight;
                            stickerView = messageEntityViewCreateMessage;
                        }
                    } else if (b == 3) {
                        LocationView locationViewCreateLocationSticker = createLocationSticker(mediaEntity.media, mediaEntity.mediaArea, false);
                        int i5 = mediaEntity.color;
                        if (i5 != 0) {
                            locationViewCreateLocationSticker.setColor(i5);
                        }
                        locationViewCreateLocationSticker.setType(mediaEntity.subType);
                        stickerView = locationViewCreateLocationSticker;
                    } else {
                        if (b == 8) {
                            Weather.State state = mediaEntity.weather;
                            if (state != null) {
                                WeatherView weatherViewCreateWeatherView = createWeatherView(state, false);
                                int i6 = mediaEntity.color;
                                if (i6 != 0) {
                                    weatherViewCreateWeatherView.setColor(i6);
                                }
                                weatherViewCreateWeatherView.setType(mediaEntity.subType);
                                stickerView = weatherViewCreateWeatherView;
                            }
                        } else if (b == 7) {
                            LinkView linkViewCreateLinkSticker = createLinkSticker(mediaEntity.linkSettings, mediaEntity.mediaArea, false);
                            int i7 = mediaEntity.color;
                            if (i7 != 0) {
                                linkViewCreateLinkSticker.setColor(i7);
                            }
                            if (linkViewCreateLinkSticker.marker.withPreview()) {
                                linkViewCreateLinkSticker.marker.setPreviewType(mediaEntity.subType);
                            }
                            byte b2 = mediaEntity.subType;
                            if (b2 == -1) {
                                linkViewCreateLinkSticker.setType(3);
                                linkViewCreateLinkSticker.marker.setupLayout();
                                LinkPreview linkPreview = linkViewCreateLinkSticker.marker;
                                int iCeil = linkPreview.padx + ((int) Math.ceil(linkPreview.w));
                                LinkPreview linkPreview2 = linkViewCreateLinkSticker.marker;
                                mediaEntity.viewWidth = iCeil + linkPreview2.padx;
                                mediaEntity.viewHeight = linkPreview2.pady + ((int) Math.ceil(linkPreview2.h)) + linkViewCreateLinkSticker.marker.pady;
                                PointF position = linkViewCreateLinkSticker.getPosition();
                                position.y += this.h * 0.3f;
                                linkViewCreateLinkSticker.setPosition(position);
                            } else {
                                linkViewCreateLinkSticker.setType(b2);
                                stickerView = linkViewCreateLinkSticker;
                            }
                        } else if (b == 4) {
                            ReactionWidgetEntityView reactionWidgetEntityViewCreateReactionWidget = createReactionWidget(false);
                            reactionWidgetEntityViewCreateReactionWidget.setCurrentReaction(ReactionsLayoutInBubble.VisibleReaction.fromTL(mediaEntity.mediaArea.reaction), false);
                            if (mediaEntity.mediaArea.flipped) {
                                reactionWidgetEntityViewCreateReactionWidget.mirror(false);
                            }
                            stickerView = reactionWidgetEntityViewCreateReactionWidget;
                            if (mediaEntity.mediaArea.dark) {
                                reactionWidgetEntityViewCreateReactionWidget.changeStyle(false);
                                stickerView = reactionWidgetEntityViewCreateReactionWidget;
                            }
                        } else if (b == 5 && storyEntry.round != null) {
                            roundViewCreateRound = createRound(storyEntry.roundThumb, false);
                            onCreateRound(roundViewCreateRound);
                            if ((mediaEntity.subType & 2) != 0) {
                                stickerView = roundViewCreateRound;
                                roundViewCreateRound.mirror(false);
                                stickerView = roundViewCreateRound;
                            }
                        }
                        i2 = i + 1;
                        z = false;
                    }
                }
                stickerView = roundViewCreateRound;
                stickerView = messageEntityViewCreateMessage;
                stickerView = messageEntityViewCreateMessage;
                stickerView = messageEntityViewCreateMessage;
                stickerView.setX((mediaEntity.x * this.w) - ((mediaEntity.viewWidth * (1.0f - mediaEntity.scale)) / 2.0f));
                stickerView.setY((mediaEntity.y * this.h) - ((mediaEntity.viewHeight * (1.0f - mediaEntity.scale)) / 2.0f));
                stickerView.setPosition(new PointF(stickerView.getX() + (mediaEntity.viewWidth / 2.0f), stickerView.getY() + (mediaEntity.viewHeight / 2.0f)));
                stickerView.setScale(mediaEntity.scale);
                stickerView.setRotation((float) ((((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d));
                i2 = i + 1;
                z = false;
            }
            this.entitiesView.setVisibility(0);
        }
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
                PaintView.$r8$lambda$fQIA9MpVlDKhN_X9dOhQVNVwav0(this.f$0);
            }
        }, 200L);
    }

    public static void $r8$lambda$fQIA9MpVlDKhN_X9dOhQVNVwav0(PaintView paintView) {
        paintView.getClass();
        FaceDetector faceDetectorBuild = null;
        try {
            try {
                faceDetectorBuild = new FaceDetector.Builder(paintView.getContext()).setMode(1).setLandmarkType(1).setTrackingEnabled(false).build();
                if (!faceDetectorBuild.isOperational()) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("face detection is not operational");
                    }
                    faceDetectorBuild.release();
                    return;
                }
                try {
                    SparseArray sparseArrayDetect = faceDetectorBuild.detect(new Frame.Builder().setBitmap(paintView.facesBitmap).setRotation(paintView.getFrameRotation()).build());
                    ArrayList arrayList = new ArrayList();
                    Size paintingSize = paintView.getPaintingSize();
                    for (int i = 0; i < sparseArrayDetect.size(); i++) {
                        PhotoFace photoFace = new PhotoFace((Face) sparseArrayDetect.get(sparseArrayDetect.keyAt(i)), paintView.facesBitmap, paintingSize, paintView.isSidewardOrientation());
                        if (photoFace.isSufficient()) {
                            arrayList.add(photoFace);
                        }
                    }
                    paintView.faces = arrayList;
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
                PaintView.$r8$lambda$99gGnOV4l55xPUUWQjnKOVlFTaQ();
            }
        });
        EmojiBottomSheet emojiBottomSheet = this.emojiPopup;
        if (emojiBottomSheet != null) {
            emojiBottomSheet.dismiss();
        }
        ColorPickerBottomSheet colorPickerBottomSheet = this.colorPickerBottomSheet;
        if (colorPickerBottomSheet != null) {
            colorPickerBottomSheet.dismiss();
        }
    }

    public static void $r8$lambda$99gGnOV4l55xPUUWQjnKOVlFTaQ() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            looperMyLooper.quit();
        }
    }

    @Override
    public void onResume() {
        this.renderView.redraw();
    }

    public float getOffsetTranslationY() {
        return this.offsetTranslationY;
    }

    @Override
    public void updateColors() {
        this.toolsPaint.setColor(-15132391);
    }

    public boolean hasChanges() {
        return this.undoStore.canUndo() || this.forceChanges;
    }

    public static boolean isVideoStickerDocument(TLRPC.Document document) {
        if (document != null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) || (documentAttribute instanceof TLRPC.TL_documentAttributeCustomEmoji) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    return "video/webm".equals(document.mime_type) || "video/mp4".equals(document.mime_type);
                }
            }
        }
        return false;
    }

    public Bitmap getBitmap(ArrayList arrayList, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, StoryEntry storyEntry) {
        Bitmap bitmap;
        Bitmap resultBitmap;
        Bitmap bitmapCreateBitmap;
        int childCount;
        int i3;
        View childAt;
        EntityView entityView;
        VideoEditedInfo.MediaEntity mediaEntity;
        int i4;
        int i5;
        float f;
        boolean z5;
        boolean z6;
        ImageReceiver imageReceiver;
        View view;
        long duration;
        MessageEntityView messageEntityView;
        MessageObject messageObject;
        MessageEntityView messageEntityView2;
        View childAt2;
        ImageReceiver photoImage;
        TLRPC.Message message;
        ChatActionCell chatActionCell;
        StarGiftUniqueActionLayout starGiftUniqueActionLayout;
        RoundView roundView;
        LinkView linkView;
        int color;
        LinkPreview linkPreview;
        TL_stories.TL_mediaAreaUrl tL_mediaAreaUrl;
        LinkPreview.WebPagePreview webPagePreview;
        TLRPC.WebPage webPage;
        String str;
        WeatherView weatherView;
        int color2;
        TLRPC.Document codeEmojiDocument;
        VideoEditedInfo.EmojiEntity emojiEntity;
        boolean zIsAnimatedStickerDocument;
        byte b;
        LocationView locationView;
        int color3;
        TLRPC.Document codeEmojiDocument2;
        VideoEditedInfo.EmojiEntity emojiEntity2;
        boolean zIsAnimatedStickerDocument2;
        byte b2;
        PhotoView photoView;
        File fileSaveSegmentedImage;
        StickerView stickerView;
        TLRPC.Document sticker;
        boolean zIsAnimatedStickerDocument3;
        byte b3;
        float scaleX;
        float scaleY;
        float x;
        float y;
        TL_stories.MediaArea mediaArea;
        boolean z7;
        float radius;
        double bubbleBounds;
        float imageAspectRatio;
        float f2;
        float f3;
        float measuredWidth;
        TL_stories.MediaArea mediaArea2;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates;
        CharSequence text;
        CharSequence charSequence;
        Spanned spanned;
        AnimatedEmojiSpan[] animatedEmojiSpanArr;
        int i6;
        AnimatedEmojiSpan animatedEmojiSpan;
        TLRPC.Document documentFindDocument;
        VideoEditedInfo.EmojiEntity emojiEntity3;
        Spanned spanned2;
        boolean z8;
        boolean zIsAnimatedStickerDocument4;
        byte b4;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        int i7 = 0;
        byte b5 = 1;
        if (z) {
            bitmapCreateBitmap = this.renderView.getResultBitmap(false, z4);
        } else if (z3) {
            bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, this.entitiesView.getMeasuredWidth()), Math.max(1, this.entitiesView.getMeasuredHeight()), Bitmap.Config.ARGB_8888);
        } else {
            if (!z2 || (resultBitmap = this.renderView.getResultBitmap(false, false)) == null) {
                bitmap = null;
            } else {
                bitmapCreateBitmap = Bitmap.createBitmap(resultBitmap.getWidth(), resultBitmap.getHeight(), Bitmap.Config.ARGB_8888);
            }
            this.lcm = BigInteger.ONE;
            if (this.entitiesView.entitiesCount() > 0) {
                childCount = this.entitiesView.getChildCount();
                i3 = 0;
                while (i3 < childCount) {
                    childAt = this.entitiesView.getChildAt(i3);
                    if (childAt instanceof EntityView) {
                        entityView = (EntityView) childAt;
                        entityView.getPosition();
                        mediaEntity = new VideoEditedInfo.MediaEntity();
                        if (arrayList != 0) {
                            f = 1.0f;
                            duration = 5000;
                            if (entityView instanceof TextPaintView) {
                                mediaEntity.type = b5;
                                TextPaintView textPaintView = (TextPaintView) entityView;
                                text = textPaintView.getText();
                                if (text instanceof Spanned) {
                                    spanned = (Spanned) text;
                                    animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i7, text.length(), AnimatedEmojiSpan.class);
                                    if (animatedEmojiSpanArr != null) {
                                        i6 = 0;
                                        while (i6 < animatedEmojiSpanArr.length) {
                                            animatedEmojiSpan = animatedEmojiSpanArr[i6];
                                            documentFindDocument = animatedEmojiSpan.document;
                                            if (documentFindDocument == null) {
                                                documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                                            }
                                            if (documentFindDocument != null) {
                                                AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocument(documentFindDocument);
                                            }
                                            emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                            CharSequence charSequence2 = text;
                                            AnimatedEmojiSpan[] animatedEmojiSpanArr2 = animatedEmojiSpanArr;
                                            emojiEntity3.document_id = animatedEmojiSpan.getDocumentId();
                                            emojiEntity3.document = documentFindDocument;
                                            emojiEntity3.offset = spanned.getSpanStart(animatedEmojiSpan);
                                            emojiEntity3.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity3.offset;
                                            emojiEntity3.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                                            int i8 = 0;
                                            while (true) {
                                                if (documentFindDocument == null) {
                                                    arrayList2 = documentFindDocument.thumbs;
                                                    if (arrayList2 == null && !arrayList2.isEmpty() && !new File(emojiEntity3.documentAbsolutePath).exists()) {
                                                        spanned2 = spanned;
                                                        z8 = true;
                                                        emojiEntity3.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(documentFindDocument.thumbs.get(i8), true).getAbsolutePath();
                                                        i8++;
                                                        if (i8 >= documentFindDocument.thumbs.size()) {
                                                            break;
                                                        }
                                                        spanned = spanned2;
                                                    }
                                                }
                                                spanned2 = spanned;
                                                z8 = true;
                                                break;
                                            }
                                            zIsAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, z8);
                                            if (!zIsAnimatedStickerDocument4 || isVideoStickerDocument(emojiEntity3.document)) {
                                                byte b6 = emojiEntity3.subType;
                                                if (zIsAnimatedStickerDocument4) {
                                                    b4 = 1;
                                                } else {
                                                    b4 = 4;
                                                }
                                                emojiEntity3.subType = (byte) (b6 | b4);
                                            }
                                            if (MessageObject.isTextColorEmoji(emojiEntity3.document)) {
                                                emojiEntity3.subType = (byte) (emojiEntity3.subType | 8);
                                            }
                                            mediaEntity.entities.add(emojiEntity3);
                                            if (documentFindDocument != null) {
                                                BigInteger bigIntegerValueOf = BigInteger.valueOf(5000L);
                                                this.lcm = this.lcm.multiply(bigIntegerValueOf).divide(this.lcm.gcd(bigIntegerValueOf));
                                            }
                                            i6++;
                                            text = charSequence2;
                                            childCount = childCount;
                                            i3 = i3;
                                            animatedEmojiSpanArr = animatedEmojiSpanArr2;
                                            spanned = spanned2;
                                        }
                                    }
                                    i4 = childCount;
                                    i5 = i3;
                                    charSequence = text;
                                } else {
                                    i4 = childCount;
                                    i5 = i3;
                                    charSequence = text;
                                }
                                mediaEntity.text = charSequence.toString();
                                mediaEntity.subType = (byte) textPaintView.getType();
                                mediaEntity.color = textPaintView.getSwatch().color;
                                mediaEntity.fontSize = textPaintView.getTextSize();
                                mediaEntity.textTypeface = textPaintView.getTypeface();
                                mediaEntity.textAlign = textPaintView.getAlign();
                            } else {
                                i4 = childCount;
                                i5 = i3;
                                if (entityView instanceof StickerView) {
                                    mediaEntity.type = (byte) 0;
                                    stickerView = (StickerView) entityView;
                                    Size baseSize = stickerView.getBaseSize();
                                    mediaEntity.width = baseSize.width;
                                    mediaEntity.height = baseSize.height;
                                    mediaEntity.document = stickerView.getSticker();
                                    mediaEntity.parentObject = stickerView.getParentObject();
                                    sticker = stickerView.getSticker();
                                    mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                    if (!MessageObject.isAnimatedStickerDocument(sticker, true) || isVideoStickerDocument(sticker)) {
                                        zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                        byte b7 = mediaEntity.subType;
                                        if (zIsAnimatedStickerDocument3) {
                                            b3 = 1;
                                        } else {
                                            b3 = 4;
                                        }
                                        mediaEntity.subType = (byte) (b7 | b3);
                                        duration = (!zIsAnimatedStickerDocument3 || isVideoStickerDocument(sticker)) ? stickerView.getDuration() : 5000L;
                                        if (duration != 0) {
                                            BigInteger bigIntegerValueOf2 = BigInteger.valueOf(duration);
                                            this.lcm = this.lcm.multiply(bigIntegerValueOf2).divide(this.lcm.gcd(bigIntegerValueOf2));
                                        }
                                    }
                                    if (MessageObject.isTextColorEmoji(sticker)) {
                                        mediaEntity.color = -1;
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                    }
                                    if (stickerView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                } else if (entityView instanceof PhotoView) {
                                    photoView = (PhotoView) entityView;
                                    mediaEntity.type = (byte) 2;
                                    Size baseSize2 = photoView.getBaseSize();
                                    mediaEntity.width = baseSize2.width;
                                    mediaEntity.height = baseSize2.height;
                                    mediaEntity.text = photoView.getPath(this.currentAccount);
                                    mediaEntity.crop = photoView.crop;
                                    if (photoView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                    if (photoView.hasSegmentedImage() && photoView.isSegmented() && (fileSaveSegmentedImage = photoView.saveSegmentedImage(this.currentAccount)) != null) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 16);
                                        mediaEntity.segmentedPath = fileSaveSegmentedImage.getPath();
                                    }
                                } else if (entityView instanceof LocationView) {
                                    locationView = (LocationView) entityView;
                                    mediaEntity.type = (byte) 3;
                                    mediaEntity.subType = (byte) locationView.getType();
                                    mediaEntity.width = locationView.marker.getWidth();
                                    mediaEntity.height = locationView.marker.getHeight();
                                    mediaEntity.text = locationView.marker.getText();
                                    if (locationView.hasColor()) {
                                        color3 = locationView.getColor();
                                    } else {
                                        color3 = 0;
                                    }
                                    mediaEntity.color = color3;
                                    mediaEntity.density = locationView.marker.density;
                                    mediaEntity.media = locationView.location;
                                    TL_stories.MediaArea mediaArea3 = locationView.mediaArea;
                                    mediaEntity.mediaArea = mediaArea3;
                                    mediaArea3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    codeEmojiDocument2 = locationView.marker.getCodeEmojiDocument();
                                    if (codeEmojiDocument2 != null) {
                                        emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                        emojiEntity2.document_id = codeEmojiDocument2.id;
                                        emojiEntity2.document = codeEmojiDocument2;
                                        emojiEntity2.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                        zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                        if (!zIsAnimatedStickerDocument2 || isVideoStickerDocument(emojiEntity2.document)) {
                                            byte b8 = emojiEntity2.subType;
                                            if (zIsAnimatedStickerDocument2) {
                                                b2 = 1;
                                            } else {
                                                b2 = 4;
                                            }
                                            emojiEntity2.subType = (byte) (b8 | b2);
                                        }
                                        mediaEntity.entities.add(emojiEntity2);
                                    }
                                } else if (entityView instanceof WeatherView) {
                                    weatherView = (WeatherView) entityView;
                                    mediaEntity.type = (byte) 8;
                                    mediaEntity.subType = (byte) weatherView.getType();
                                    mediaEntity.width = weatherView.marker.getWidth();
                                    mediaEntity.height = weatherView.marker.getHeight();
                                    mediaEntity.text = weatherView.marker.getText();
                                    if (weatherView.hasColor()) {
                                        color2 = weatherView.getColor();
                                    } else {
                                        color2 = 0;
                                    }
                                    mediaEntity.color = color2;
                                    mediaEntity.density = weatherView.marker.density;
                                    mediaEntity.weather = weatherView.weather;
                                    TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = new TL_stories.TL_mediaAreaWeather();
                                    Weather.State state = weatherView.weather;
                                    tL_mediaAreaWeather.emoji = state.emoji;
                                    tL_mediaAreaWeather.temperature_c = Math.round(state.temperature);
                                    tL_mediaAreaWeather.color = weatherView.marker.outlinePaint.getColor();
                                    mediaEntity.mediaArea = tL_mediaAreaWeather;
                                    tL_mediaAreaWeather.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    codeEmojiDocument = weatherView.marker.getCodeEmojiDocument();
                                    if (codeEmojiDocument != null) {
                                        emojiEntity = new VideoEditedInfo.EmojiEntity();
                                        emojiEntity.document_id = codeEmojiDocument.id;
                                        emojiEntity.document = codeEmojiDocument;
                                        emojiEntity.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                        zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                        if (!zIsAnimatedStickerDocument || isVideoStickerDocument(emojiEntity.document)) {
                                            byte b9 = emojiEntity.subType;
                                            if (zIsAnimatedStickerDocument) {
                                                b = 1;
                                            } else {
                                                b = 4;
                                            }
                                            emojiEntity.subType = (byte) (b9 | b);
                                        }
                                        mediaEntity.entities.add(emojiEntity);
                                    }
                                    childAt = childAt;
                                    z5 = false;
                                    z6 = false;
                                    imageReceiver = null;
                                    arrayList.add(mediaEntity);
                                    scaleX = childAt.getScaleX();
                                    scaleY = childAt.getScaleY();
                                    x = childAt.getX();
                                    y = childAt.getY();
                                    mediaEntity.viewWidth = childAt.getWidth();
                                    mediaEntity.viewHeight = childAt.getHeight();
                                    mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                    mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.scale = scaleX;
                                    if (entityView instanceof MessageEntityView) {
                                        MessageEntityView messageEntityView3 = (MessageEntityView) entityView;
                                        RectF rectF = AndroidUtilities.rectTmp;
                                        bubbleBounds = messageEntityView3.getBubbleBounds(rectF);
                                        rectF.offset(messageEntityView3.container.getX(), messageEntityView3.container.getY());
                                        rectF.offset(messageEntityView3.listView.getX(), messageEntityView3.listView.getY());
                                        mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.w = ((rectF.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.h = ((rectF.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                    } else {
                                        if (entityView instanceof StickerView) {
                                            imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                            f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                            f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                            measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                            if (imageAspectRatio > 1.0f) {
                                                float f4 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                mediaEntity.height = f4;
                                                mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                mediaEntity.y = f3 - (f4 / 2.0f);
                                            } else if (imageAspectRatio < 1.0f) {
                                                float f5 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                mediaEntity.width = f5;
                                                mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                mediaEntity.x = f2 - (f5 / 2.0f);
                                            }
                                        } else {
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea == null && (((z7 = entityView instanceof LocationView)) || (entityView instanceof WeatherView) || (entityView instanceof LinkView) || (entityView instanceof ReactionWidgetEntityView))) {
                                                TL_stories.MediaAreaCoordinates mediaAreaCoordinates2 = mediaArea.coordinates;
                                                float f6 = mediaEntity.x;
                                                float f7 = mediaEntity.width;
                                                mediaAreaCoordinates2.x = (f6 + (f7 / 2.0f)) * 100.0f;
                                                mediaAreaCoordinates2.y = (mediaEntity.y + (mediaEntity.height / 2.0f)) * 100.0f;
                                                if (z7) {
                                                    LocationView locationView2 = (LocationView) entityView;
                                                    mediaAreaCoordinates2.w = (f7 - (((locationView2.marker.padx * 2) * scaleX) / this.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((locationView2.marker.pady * 2) * scaleY) / this.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView instanceof WeatherView) {
                                                    WeatherView weatherView2 = (WeatherView) entityView;
                                                    mediaAreaCoordinates2.w = (f7 - (((weatherView2.marker.padx * 2) * scaleX) / this.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((weatherView2.marker.pady * 2) * scaleY) / this.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView instanceof LinkView) {
                                                    LinkView linkView2 = (LinkView) entityView;
                                                    mediaAreaCoordinates2.w = (f7 - (((linkView2.marker.padx * 2) * scaleX) / this.entitiesView.getMeasuredWidth())) * 100.0f;
                                                    mediaEntity.mediaArea.coordinates.h = (mediaEntity.height - (((linkView2.marker.pady * 2) * scaleY) / this.entitiesView.getMeasuredHeight())) * 100.0f;
                                                } else if (entityView instanceof ReactionWidgetEntityView) {
                                                    ReactionWidgetEntityView reactionWidgetEntityView = (ReactionWidgetEntityView) entityView;
                                                    float padding = ((reactionWidgetEntityView.getPadding() * 2) * scaleX) / this.entitiesView.getMeasuredWidth();
                                                    float padding2 = ((reactionWidgetEntityView.getPadding() * 2) * scaleX) / this.entitiesView.getMeasuredHeight();
                                                    TL_stories.MediaAreaCoordinates mediaAreaCoordinates3 = mediaEntity.mediaArea.coordinates;
                                                    mediaAreaCoordinates3.w = (mediaEntity.width - padding) * 100.0f;
                                                    mediaAreaCoordinates3.h = (mediaEntity.height - padding2) * 100.0f;
                                                }
                                                mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                                if (z7) {
                                                    radius = ((LocationView) entityView).marker.getRadius();
                                                } else if (entityView instanceof WeatherView) {
                                                    radius = ((WeatherView) entityView).marker.getRadius();
                                                } else if (entityView instanceof LinkView) {
                                                    radius = ((LinkView) entityView).marker.getRadius();
                                                }
                                                bubbleBounds = radius;
                                            }
                                        }
                                        bubbleBounds = -1.0d;
                                    }
                                    mediaArea2 = mediaEntity.mediaArea;
                                    if (mediaArea2 != null && (mediaAreaCoordinates = mediaArea2.coordinates) != null && bubbleBounds > 0.0d) {
                                        mediaAreaCoordinates.flags |= 1;
                                        mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                    }
                                } else if (entityView instanceof LinkView) {
                                    linkView = (LinkView) entityView;
                                    mediaEntity.type = (byte) 7;
                                    if (linkView.marker.withPreview()) {
                                        mediaEntity.subType = (byte) linkView.marker.getPreviewType();
                                    } else {
                                        mediaEntity.subType = (byte) linkView.getType();
                                    }
                                    mediaEntity.width = linkView.marker.getWidth();
                                    mediaEntity.height = linkView.marker.getHeight();
                                    if (linkView.hasColor()) {
                                        color = linkView.getColor();
                                    } else {
                                        color = 0;
                                    }
                                    mediaEntity.color = color;
                                    linkPreview = linkView.marker;
                                    mediaEntity.density = linkPreview.density;
                                    mediaEntity.linkSettings = linkView.link;
                                    if (linkPreview.hasPhoto) {
                                        linkPreview.pushPhotoToCache();
                                        LinkPreview.WebPagePreview webPagePreview2 = mediaEntity.linkSettings;
                                        webPagePreview2.flags |= 4;
                                        webPagePreview2.photoSize = linkView.marker.getPhotoSide();
                                    }
                                    tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                    mediaEntity.mediaArea = tL_mediaAreaUrl;
                                    webPagePreview = linkView.link;
                                    if (webPagePreview != null) {
                                        webPage = webPagePreview.webpage;
                                        if (webPage != null || TextUtils.isEmpty(webPage.url)) {
                                            str = linkView.link.url;
                                        } else {
                                            str = linkView.link.webpage.url;
                                        }
                                        tL_mediaAreaUrl.url = str;
                                        mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    }
                                    i3 = i5 + 1;
                                    childCount = i4;
                                    i7 = 0;
                                    b5 = 1;
                                } else {
                                    if (entityView instanceof ReactionWidgetEntityView) {
                                        ReactionWidgetEntityView reactionWidgetEntityView2 = (ReactionWidgetEntityView) entityView;
                                        mediaEntity.type = (byte) 4;
                                        TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = new TL_stories.TL_mediaAreaSuggestedReaction();
                                        mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction;
                                        tL_mediaAreaSuggestedReaction.reaction = ReactionsUtils.toTLReaction(reactionWidgetEntityView2.getCurrentReaction());
                                        mediaEntity.mediaArea.dark = reactionWidgetEntityView2.isDark();
                                        mediaEntity.mediaArea.flipped = reactionWidgetEntityView2.isMirrored();
                                        mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                    } else if (entityView instanceof RoundView) {
                                        roundView = (RoundView) entityView;
                                        Size baseSize3 = roundView.getBaseSize();
                                        mediaEntity.width = baseSize3.width;
                                        mediaEntity.height = baseSize3.height;
                                        mediaEntity.type = (byte) 5;
                                        if (storyEntry != 0) {
                                            mediaEntity.text = storyEntry.round.getAbsolutePath();
                                            mediaEntity.roundOffset = storyEntry.roundOffset;
                                            long j = storyEntry.roundDuration;
                                            mediaEntity.roundDuration = j;
                                            float f8 = j;
                                            mediaEntity.roundLeft = (long) (storyEntry.roundLeft * f8);
                                            mediaEntity.roundRight = (long) (storyEntry.roundRight * f8);
                                        }
                                        mediaEntity.subType = (byte) 4;
                                        if (roundView.isMirrored()) {
                                            mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                        }
                                    } else {
                                        if (entityView instanceof MessageEntityView) {
                                            messageEntityView = (MessageEntityView) entityView;
                                            mediaEntity.type = (byte) 6;
                                            int width = messageEntityView.getWidth();
                                            mediaEntity.viewWidth = width;
                                            mediaEntity.width = width;
                                            int height = messageEntityView.getHeight();
                                            mediaEntity.viewHeight = height;
                                            mediaEntity.height = height;
                                            if (messageEntityView.messageObjects.size() > 0) {
                                                messageObject = (MessageObject) messageEntityView.messageObjects.get(0);
                                            } else {
                                                messageObject = null;
                                            }
                                            if (messageObject != null || (message = messageObject.messageOwner) == null) {
                                                messageEntityView2 = messageEntityView;
                                                childAt = childAt;
                                                if (messageObject != null) {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost;
                                                    tL_inputMediaAreaChannelPost.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-StoryEntry.getRepostDialogId(messageObject));
                                                    ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).msg_id = StoryEntry.getRepostMessageId(messageObject);
                                                } else {
                                                    TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost2 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                    mediaEntity.mediaArea = tL_inputMediaAreaChannelPost2;
                                                    tL_inputMediaAreaChannelPost2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                }
                                                imageReceiver = null;
                                            } else {
                                                TLRPC.MessageAction messageAction = message.action;
                                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                    TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
                                                    TL_stories.TL_mediaAreaStarGift tL_mediaAreaStarGift = new TL_stories.TL_mediaAreaStarGift();
                                                    mediaEntity.mediaArea = tL_mediaAreaStarGift;
                                                    tL_mediaAreaStarGift.slug = starGift.slug;
                                                    tL_mediaAreaStarGift.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    int i9 = 0;
                                                    while (true) {
                                                        if (i9 >= messageEntityView.listView.getChildCount()) {
                                                            chatActionCell = null;
                                                            break;
                                                        }
                                                        View childAt3 = messageEntityView.listView.getChildAt(i9);
                                                        if (childAt3 instanceof ChatActionCell) {
                                                            chatActionCell = (ChatActionCell) childAt3;
                                                            break;
                                                        }
                                                        i9++;
                                                    }
                                                    if (chatActionCell == null || (starGiftUniqueActionLayout = chatActionCell.starGiftLayout) == null || (imageReceiver = starGiftUniqueActionLayout.imageReceiver) == null) {
                                                        messageEntityView2 = messageEntityView;
                                                        childAt = childAt;
                                                    } else {
                                                        imageReceiver.setVisible(false, false);
                                                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) StarsController.findAttribute(starGift.attributes, TL_stars.starGiftAttributeModel.class);
                                                        if (stargiftattributemodel != null) {
                                                            float fDp = AndroidUtilities.dp(110.0f);
                                                            float x2 = messageEntityView.listView.getX() + chatActionCell.getX() + chatActionCell.starGiftLayoutX + imageReceiver.getCenterX();
                                                            float y2 = messageEntityView.listView.getY() + chatActionCell.getY() + chatActionCell.starGiftLayoutY + imageReceiver.getCenterY();
                                                            VideoEditedInfo.MediaEntity mediaEntity2 = new VideoEditedInfo.MediaEntity();
                                                            mediaEntity2.type = (byte) 0;
                                                            mediaEntity2.width = fDp;
                                                            mediaEntity2.height = fDp;
                                                            TLRPC.Document document = stargiftattributemodel.document;
                                                            mediaEntity2.document = document;
                                                            mediaEntity2.parentObject = starGift;
                                                            mediaEntity2.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(document, true).getAbsolutePath();
                                                            if (MessageObject.isAnimatedStickerDocument(document, true) || isVideoStickerDocument(document)) {
                                                                boolean zIsAnimatedStickerDocument5 = MessageObject.isAnimatedStickerDocument(document, true);
                                                                mediaEntity2.subType = (byte) (mediaEntity2.subType | (zIsAnimatedStickerDocument5 ? (byte) 1 : (byte) 4));
                                                                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                                                                if (lottieAnimation != null && (zIsAnimatedStickerDocument5 || isVideoStickerDocument(document))) {
                                                                    duration = lottieAnimation.getDuration();
                                                                }
                                                                if (duration != 0) {
                                                                    BigInteger bigIntegerValueOf3 = BigInteger.valueOf(duration);
                                                                    this.lcm = this.lcm.multiply(bigIntegerValueOf3).divide(this.lcm.gcd(bigIntegerValueOf3));
                                                                }
                                                            }
                                                            float scaleX2 = childAt.getScaleX();
                                                            float scaleY2 = childAt.getScaleY();
                                                            float x3 = childAt.getX();
                                                            float y3 = childAt.getY();
                                                            int i10 = (int) fDp;
                                                            mediaEntity2.viewWidth = i10;
                                                            mediaEntity2.viewHeight = i10;
                                                            mediaEntity2.width = (fDp * scaleX2) / this.entitiesView.getMeasuredWidth();
                                                            mediaEntity2.height = (fDp * scaleY2) / this.entitiesView.getMeasuredHeight();
                                                            mediaEntity2.x = x3 + (childAt.getWidth() / 2.0f);
                                                            mediaEntity2.y = y3 + (childAt.getHeight() / 2.0f);
                                                            float width2 = (x2 * scaleX2) - ((childAt.getWidth() / 2.0f) * scaleX2);
                                                            float height2 = (y2 * scaleY2) - ((childAt.getHeight() / 2.0f) * scaleY2);
                                                            childAt = childAt;
                                                            messageEntityView2 = messageEntityView;
                                                            double d = width2;
                                                            double rotation = (float) (((double) (childAt.getRotation() / 180.0f)) * 3.141592653589793d);
                                                            double d2 = height2;
                                                            mediaEntity2.x = (float) (((double) mediaEntity2.x) + ((Math.cos(rotation) * d) - (Math.sin(rotation) * d2)));
                                                            float fSin = (float) (((double) mediaEntity2.y) + (Math.sin(rotation) * d) + (d2 * Math.cos(rotation)));
                                                            float f9 = (-fDp) / 2.0f;
                                                            float f10 = mediaEntity2.x + (f9 * scaleX2);
                                                            mediaEntity2.x = f10;
                                                            mediaEntity2.y = fSin + (f9 * scaleY2);
                                                            mediaEntity2.x = f10 / this.entitiesView.getMeasuredWidth();
                                                            mediaEntity2.y /= this.entitiesView.getMeasuredHeight();
                                                            mediaEntity2.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                                            mediaEntity2.scale = scaleX2;
                                                            arrayList.add(mediaEntity2);
                                                        } else {
                                                            messageEntityView2 = messageEntityView;
                                                            childAt = childAt;
                                                        }
                                                    }
                                                } else {
                                                    messageEntityView2 = messageEntityView;
                                                    childAt = childAt;
                                                    if (messageObject != null) {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost3 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        mediaEntity.mediaArea = tL_inputMediaAreaChannelPost3;
                                                        tL_inputMediaAreaChannelPost3.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                        ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-StoryEntry.getRepostDialogId(messageObject));
                                                        ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).msg_id = StoryEntry.getRepostMessageId(messageObject);
                                                    } else {
                                                        TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost4 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                        mediaEntity.mediaArea = tL_inputMediaAreaChannelPost4;
                                                        tL_inputMediaAreaChannelPost4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                    }
                                                }
                                                imageReceiver = null;
                                            }
                                            if (z3) {
                                                if (storyEntry != null && storyEntry.isVideo) {
                                                    storyEntry.matrix.reset();
                                                    if (messageEntityView2.listView.getChildCount() == 1) {
                                                        childAt2 = messageEntityView2.listView.getChildAt(0);
                                                        photoImage = childAt2 instanceof ChatMessageCell ? ((ChatMessageCell) childAt2).getPhotoImage() : null;
                                                        if (photoImage != null) {
                                                            float fMax = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                            storyEntry.matrix.postScale(fMax, fMax);
                                                            storyEntry.matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax) / 2.0f));
                                                            storyEntry.matrix.postTranslate(messageEntityView2.container.getX(), messageEntityView2.container.getY());
                                                            storyEntry.matrix.postTranslate(messageEntityView2.listView.getX(), messageEntityView2.listView.getY());
                                                            storyEntry.matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                            storyEntry.matrix.postScale(messageEntityView2.getScaleX(), messageEntityView2.getScaleY(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                            storyEntry.matrix.postRotate(messageEntityView2.getRotation(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                            storyEntry.matrix.postTranslate(messageEntityView2.getX(), messageEntityView2.getY());
                                                            storyEntry.matrix.postScale(1.0f / this.entitiesView.getWidth(), 1.0f / this.entitiesView.getHeight());
                                                            storyEntry.matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                        }
                                                    } else {
                                                        childAt2 = null;
                                                    }
                                                    if (photoImage != null) {
                                                        float fMax2 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                        storyEntry.matrix.postScale(fMax2, fMax2);
                                                        storyEntry.matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax2) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax2) / 2.0f));
                                                        storyEntry.matrix.postTranslate(messageEntityView2.container.getX(), messageEntityView2.container.getY());
                                                        storyEntry.matrix.postTranslate(messageEntityView2.listView.getX(), messageEntityView2.listView.getY());
                                                        storyEntry.matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                        storyEntry.matrix.postScale(messageEntityView2.getScaleX(), messageEntityView2.getScaleY(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                        storyEntry.matrix.postRotate(messageEntityView2.getRotation(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                        storyEntry.matrix.postTranslate(messageEntityView2.getX(), messageEntityView2.getY());
                                                        storyEntry.matrix.postScale(1.0f / this.entitiesView.getWidth(), 1.0f / this.entitiesView.getHeight());
                                                        storyEntry.matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                    }
                                                }
                                                z5 = false;
                                            } else {
                                                z5 = true;
                                            }
                                            z6 = true;
                                            arrayList.add(mediaEntity);
                                            scaleX = childAt.getScaleX();
                                            scaleY = childAt.getScaleY();
                                            x = childAt.getX();
                                            y = childAt.getY();
                                            mediaEntity.viewWidth = childAt.getWidth();
                                            mediaEntity.viewHeight = childAt.getHeight();
                                            mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                                            mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                                            mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                            mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                            mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                            mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                            mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                            mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                                            mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                                            mediaEntity.scale = scaleX;
                                            if (entityView instanceof MessageEntityView) {
                                                MessageEntityView messageEntityView4 = (MessageEntityView) entityView;
                                                RectF rectF2 = AndroidUtilities.rectTmp;
                                                bubbleBounds = messageEntityView4.getBubbleBounds(rectF2);
                                                rectF2.offset(messageEntityView4.container.getX(), messageEntityView4.container.getY());
                                                rectF2.offset(messageEntityView4.listView.getX(), messageEntityView4.listView.getY());
                                                mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF2.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF2.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.w = ((rectF2.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.h = ((rectF2.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                                mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                            } else {
                                                if (entityView instanceof StickerView) {
                                                    imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                                    f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                                    f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                                    measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                                    if (imageAspectRatio > 1.0f) {
                                                        float f11 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                        mediaEntity.height = f11;
                                                        mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                        mediaEntity.y = f3 - (f11 / 2.0f);
                                                    } else if (imageAspectRatio < 1.0f) {
                                                        float f12 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                        mediaEntity.width = f12;
                                                        mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                        mediaEntity.x = f2 - (f12 / 2.0f);
                                                    }
                                                } else {
                                                    mediaArea = mediaEntity.mediaArea;
                                                    if (mediaArea == null) {
                                                    }
                                                }
                                                bubbleBounds = -1.0d;
                                            }
                                            mediaArea2 = mediaEntity.mediaArea;
                                            if (mediaArea2 != null) {
                                                mediaAreaCoordinates.flags |= 1;
                                                mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                            }
                                        }
                                        i3 = i5 + 1;
                                        childCount = i4;
                                        i7 = 0;
                                        b5 = 1;
                                    }
                                    z5 = true;
                                    z6 = true;
                                    imageReceiver = null;
                                    arrayList.add(mediaEntity);
                                    scaleX = childAt.getScaleX();
                                    scaleY = childAt.getScaleY();
                                    x = childAt.getX();
                                    y = childAt.getY();
                                    mediaEntity.viewWidth = childAt.getWidth();
                                    mediaEntity.viewHeight = childAt.getHeight();
                                    mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                    mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                                    mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                                    mediaEntity.scale = scaleX;
                                    if (entityView instanceof MessageEntityView) {
                                        MessageEntityView messageEntityView5 = (MessageEntityView) entityView;
                                        RectF rectF3 = AndroidUtilities.rectTmp;
                                        bubbleBounds = messageEntityView5.getBubbleBounds(rectF3);
                                        rectF3.offset(messageEntityView5.container.getX(), messageEntityView5.container.getY());
                                        rectF3.offset(messageEntityView5.listView.getX(), messageEntityView5.listView.getY());
                                        mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF3.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF3.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.w = ((rectF3.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.h = ((rectF3.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                        mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                    } else {
                                        if (entityView instanceof StickerView) {
                                            imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                            f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                            f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                            measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                            if (imageAspectRatio > 1.0f) {
                                                float f13 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                mediaEntity.height = f13;
                                                mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                mediaEntity.y = f3 - (f13 / 2.0f);
                                            } else if (imageAspectRatio < 1.0f) {
                                                float f14 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                mediaEntity.width = f14;
                                                mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                mediaEntity.x = f2 - (f14 / 2.0f);
                                            }
                                        } else {
                                            mediaArea = mediaEntity.mediaArea;
                                            if (mediaArea == null) {
                                            }
                                        }
                                        bubbleBounds = -1.0d;
                                    }
                                    mediaArea2 = mediaEntity.mediaArea;
                                    if (mediaArea2 != null) {
                                        mediaAreaCoordinates.flags |= 1;
                                        mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                    }
                                }
                            }
                            z5 = false;
                            z6 = true;
                            imageReceiver = null;
                            arrayList.add(mediaEntity);
                            scaleX = childAt.getScaleX();
                            scaleY = childAt.getScaleY();
                            x = childAt.getX();
                            y = childAt.getY();
                            mediaEntity.viewWidth = childAt.getWidth();
                            mediaEntity.viewHeight = childAt.getHeight();
                            mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                            mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                            mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                            mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                            mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                            mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                            mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                            mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                            mediaEntity.scale = scaleX;
                            if (entityView instanceof MessageEntityView) {
                                MessageEntityView messageEntityView6 = (MessageEntityView) entityView;
                                RectF rectF4 = AndroidUtilities.rectTmp;
                                bubbleBounds = messageEntityView6.getBubbleBounds(rectF4);
                                rectF4.offset(messageEntityView6.container.getX(), messageEntityView6.container.getY());
                                rectF4.offset(messageEntityView6.listView.getX(), messageEntityView6.listView.getY());
                                mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF4.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF4.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                mediaEntity.mediaArea.coordinates.w = ((rectF4.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                mediaEntity.mediaArea.coordinates.h = ((rectF4.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                            } else {
                                if (entityView instanceof StickerView) {
                                    imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                    f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                    f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                    measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                    if (imageAspectRatio > 1.0f) {
                                        float f15 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                        mediaEntity.height = f15;
                                        mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                        mediaEntity.y = f3 - (f15 / 2.0f);
                                    } else if (imageAspectRatio < 1.0f) {
                                        float f16 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                        mediaEntity.width = f16;
                                        mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                        mediaEntity.x = f2 - (f16 / 2.0f);
                                    }
                                } else {
                                    mediaArea = mediaEntity.mediaArea;
                                    if (mediaArea == null) {
                                    }
                                }
                                bubbleBounds = -1.0d;
                            }
                            mediaArea2 = mediaEntity.mediaArea;
                            if (mediaArea2 != null) {
                                mediaAreaCoordinates.flags |= 1;
                                mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                            }
                        } else {
                            i4 = childCount;
                            i5 = i3;
                            childAt = childAt;
                            f = 1.0f;
                            z5 = false;
                            z6 = true;
                            imageReceiver = null;
                        }
                        if (!z6 && ((z2 || (z3 && mediaEntity.type == 6)) && bitmap != null)) {
                            Canvas canvas = new Canvas(bitmap);
                            float width3 = bitmap.getWidth() / this.entitiesView.getMeasuredWidth();
                            int i11 = 0;
                            while (i11 < 2) {
                                Canvas canvas2 = i11 == 0 ? canvas : null;
                                if (canvas2 == null || (i11 == 0 && z5)) {
                                    view = childAt;
                                } else {
                                    canvas2.save();
                                    canvas2.scale(width3, width3);
                                    canvas2.translate(mediaEntity.x * this.entitiesView.getMeasuredWidth(), mediaEntity.y * this.entitiesView.getMeasuredHeight());
                                    canvas2.scale(childAt.getScaleX(), childAt.getScaleY());
                                    canvas2.rotate(childAt.getRotation(), ((mediaEntity.width / 2.0f) / childAt.getScaleX()) * this.entitiesView.getMeasuredWidth(), ((mediaEntity.height / 2.0f) / childAt.getScaleY()) * this.entitiesView.getMeasuredHeight());
                                    view = childAt;
                                    if ((view instanceof TextPaintView) && view.getHeight() > 0 && view.getWidth() > 0) {
                                        int width4 = (int) (view.getWidth() * view.getScaleX());
                                        int height3 = (int) (view.getHeight() * view.getScaleY());
                                        Bitmap bitmapCreateBitmap2 = Bitmaps.createBitmap(width4, height3, Bitmap.Config.ARGB_8888);
                                        Canvas canvas3 = new Canvas(bitmapCreateBitmap2);
                                        canvas3.scale(view.getScaleX(), view.getScaleY());
                                        view.draw(canvas3);
                                        canvas2.scale(f / view.getScaleX(), f / view.getScaleY());
                                        canvas2.drawBitmap(bitmapCreateBitmap2, (Rect) null, new Rect(0, 0, width4, height3), new Paint(3));
                                        try {
                                            canvas3.setBitmap(null);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        bitmapCreateBitmap2.recycle();
                                    } else if (view instanceof MessageEntityView) {
                                        MessageEntityView messageEntityView7 = (MessageEntityView) view;
                                        messageEntityView7.prepareToDraw(true);
                                        view.draw(canvas2);
                                        messageEntityView7.prepareToDraw(false);
                                    } else {
                                        view.draw(canvas2);
                                    }
                                    canvas2.restore();
                                }
                                i11++;
                                childAt = view;
                            }
                            if (imageReceiver != null) {
                                imageReceiver.setVisible(true, false);
                            }
                        }
                        i3 = i5 + 1;
                        childCount = i4;
                        i7 = 0;
                        b5 = 1;
                    } else {
                        i4 = childCount;
                        i5 = i3;
                    }
                    i3 = i5 + 1;
                    childCount = i4;
                    i7 = 0;
                    b5 = 1;
                }
            }
            return bitmap;
        }
        bitmap = bitmapCreateBitmap;
        this.lcm = BigInteger.ONE;
        if (this.entitiesView.entitiesCount() > 0) {
            childCount = this.entitiesView.getChildCount();
            i3 = 0;
            while (i3 < childCount) {
                childAt = this.entitiesView.getChildAt(i3);
                if (childAt instanceof EntityView) {
                    i4 = childCount;
                    i5 = i3;
                } else {
                    entityView = (EntityView) childAt;
                    entityView.getPosition();
                    mediaEntity = new VideoEditedInfo.MediaEntity();
                    if (arrayList != 0) {
                        f = 1.0f;
                        duration = 5000;
                        if (entityView instanceof TextPaintView) {
                            mediaEntity.type = b5;
                            TextPaintView textPaintView2 = (TextPaintView) entityView;
                            text = textPaintView2.getText();
                            if (text instanceof Spanned) {
                                spanned = (Spanned) text;
                                animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(i7, text.length(), AnimatedEmojiSpan.class);
                                if (animatedEmojiSpanArr != null) {
                                    i6 = 0;
                                    while (i6 < animatedEmojiSpanArr.length) {
                                        animatedEmojiSpan = animatedEmojiSpanArr[i6];
                                        documentFindDocument = animatedEmojiSpan.document;
                                        if (documentFindDocument == null) {
                                            documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                                        }
                                        if (documentFindDocument != null) {
                                            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocument(documentFindDocument);
                                        }
                                        emojiEntity3 = new VideoEditedInfo.EmojiEntity();
                                        CharSequence charSequence3 = text;
                                        AnimatedEmojiSpan[] animatedEmojiSpanArr3 = animatedEmojiSpanArr;
                                        emojiEntity3.document_id = animatedEmojiSpan.getDocumentId();
                                        emojiEntity3.document = documentFindDocument;
                                        emojiEntity3.offset = spanned.getSpanStart(animatedEmojiSpan);
                                        emojiEntity3.length = spanned.getSpanEnd(animatedEmojiSpan) - emojiEntity3.offset;
                                        emojiEntity3.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath();
                                        int i12 = 0;
                                        while (true) {
                                            if (documentFindDocument == null) {
                                                arrayList2 = documentFindDocument.thumbs;
                                                if (arrayList2 == null) {
                                                }
                                            }
                                            spanned2 = spanned;
                                            z8 = true;
                                            spanned = spanned2;
                                        }
                                        zIsAnimatedStickerDocument4 = MessageObject.isAnimatedStickerDocument(emojiEntity3.document, z8);
                                        if (!zIsAnimatedStickerDocument4) {
                                            byte b10 = emojiEntity3.subType;
                                            if (zIsAnimatedStickerDocument4) {
                                                b4 = 1;
                                            } else {
                                                b4 = 4;
                                            }
                                            emojiEntity3.subType = (byte) (b10 | b4);
                                        } else {
                                            byte b11 = emojiEntity3.subType;
                                            if (zIsAnimatedStickerDocument4) {
                                                b4 = 1;
                                            } else {
                                                b4 = 4;
                                            }
                                            emojiEntity3.subType = (byte) (b11 | b4);
                                        }
                                        if (MessageObject.isTextColorEmoji(emojiEntity3.document)) {
                                            emojiEntity3.subType = (byte) (emojiEntity3.subType | 8);
                                        }
                                        mediaEntity.entities.add(emojiEntity3);
                                        if (documentFindDocument != null) {
                                            BigInteger bigIntegerValueOf4 = BigInteger.valueOf(5000L);
                                            this.lcm = this.lcm.multiply(bigIntegerValueOf4).divide(this.lcm.gcd(bigIntegerValueOf4));
                                        }
                                        i6++;
                                        text = charSequence3;
                                        childCount = childCount;
                                        i3 = i3;
                                        animatedEmojiSpanArr = animatedEmojiSpanArr3;
                                        spanned = spanned2;
                                    }
                                }
                                i4 = childCount;
                                i5 = i3;
                                charSequence = text;
                            } else {
                                i4 = childCount;
                                i5 = i3;
                                charSequence = text;
                            }
                            mediaEntity.text = charSequence.toString();
                            mediaEntity.subType = (byte) textPaintView2.getType();
                            mediaEntity.color = textPaintView2.getSwatch().color;
                            mediaEntity.fontSize = textPaintView2.getTextSize();
                            mediaEntity.textTypeface = textPaintView2.getTypeface();
                            mediaEntity.textAlign = textPaintView2.getAlign();
                        } else {
                            i4 = childCount;
                            i5 = i3;
                            if (entityView instanceof StickerView) {
                                mediaEntity.type = (byte) 0;
                                stickerView = (StickerView) entityView;
                                Size baseSize4 = stickerView.getBaseSize();
                                mediaEntity.width = baseSize4.width;
                                mediaEntity.height = baseSize4.height;
                                mediaEntity.document = stickerView.getSticker();
                                mediaEntity.parentObject = stickerView.getParentObject();
                                sticker = stickerView.getSticker();
                                mediaEntity.text = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(sticker, true).getAbsolutePath();
                                if (!MessageObject.isAnimatedStickerDocument(sticker, true)) {
                                    zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    byte b12 = mediaEntity.subType;
                                    if (zIsAnimatedStickerDocument3) {
                                        b3 = 1;
                                    } else {
                                        b3 = 4;
                                    }
                                    mediaEntity.subType = (byte) (b12 | b3);
                                    if (zIsAnimatedStickerDocument3) {
                                    }
                                    if (duration != 0) {
                                        BigInteger bigIntegerValueOf5 = BigInteger.valueOf(duration);
                                        this.lcm = this.lcm.multiply(bigIntegerValueOf5).divide(this.lcm.gcd(bigIntegerValueOf5));
                                    }
                                } else {
                                    zIsAnimatedStickerDocument3 = MessageObject.isAnimatedStickerDocument(sticker, true);
                                    byte b13 = mediaEntity.subType;
                                    if (zIsAnimatedStickerDocument3) {
                                        b3 = 1;
                                    } else {
                                        b3 = 4;
                                    }
                                    mediaEntity.subType = (byte) (b13 | b3);
                                    if (zIsAnimatedStickerDocument3) {
                                    }
                                    if (duration != 0) {
                                        BigInteger bigIntegerValueOf6 = BigInteger.valueOf(duration);
                                        this.lcm = this.lcm.multiply(bigIntegerValueOf6).divide(this.lcm.gcd(bigIntegerValueOf6));
                                    }
                                }
                                if (MessageObject.isTextColorEmoji(sticker)) {
                                    mediaEntity.color = -1;
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 8);
                                }
                                if (stickerView.isMirrored()) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                            } else if (entityView instanceof PhotoView) {
                                photoView = (PhotoView) entityView;
                                mediaEntity.type = (byte) 2;
                                Size baseSize5 = photoView.getBaseSize();
                                mediaEntity.width = baseSize5.width;
                                mediaEntity.height = baseSize5.height;
                                mediaEntity.text = photoView.getPath(this.currentAccount);
                                mediaEntity.crop = photoView.crop;
                                if (photoView.isMirrored()) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                }
                                if (photoView.hasSegmentedImage()) {
                                    mediaEntity.subType = (byte) (mediaEntity.subType | 16);
                                    mediaEntity.segmentedPath = fileSaveSegmentedImage.getPath();
                                }
                            } else if (entityView instanceof LocationView) {
                                locationView = (LocationView) entityView;
                                mediaEntity.type = (byte) 3;
                                mediaEntity.subType = (byte) locationView.getType();
                                mediaEntity.width = locationView.marker.getWidth();
                                mediaEntity.height = locationView.marker.getHeight();
                                mediaEntity.text = locationView.marker.getText();
                                if (locationView.hasColor()) {
                                    color3 = locationView.getColor();
                                } else {
                                    color3 = 0;
                                }
                                mediaEntity.color = color3;
                                mediaEntity.density = locationView.marker.density;
                                mediaEntity.media = locationView.location;
                                TL_stories.MediaArea mediaArea4 = locationView.mediaArea;
                                mediaEntity.mediaArea = mediaArea4;
                                mediaArea4.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                codeEmojiDocument2 = locationView.marker.getCodeEmojiDocument();
                                if (codeEmojiDocument2 != null) {
                                    emojiEntity2 = new VideoEditedInfo.EmojiEntity();
                                    emojiEntity2.document_id = codeEmojiDocument2.id;
                                    emojiEntity2.document = codeEmojiDocument2;
                                    emojiEntity2.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(codeEmojiDocument2, true).getAbsolutePath();
                                    zIsAnimatedStickerDocument2 = MessageObject.isAnimatedStickerDocument(emojiEntity2.document, true);
                                    if (!zIsAnimatedStickerDocument2) {
                                        byte b14 = emojiEntity2.subType;
                                        if (zIsAnimatedStickerDocument2) {
                                            b2 = 1;
                                        } else {
                                            b2 = 4;
                                        }
                                        emojiEntity2.subType = (byte) (b14 | b2);
                                    } else {
                                        byte b15 = emojiEntity2.subType;
                                        if (zIsAnimatedStickerDocument2) {
                                            b2 = 1;
                                        } else {
                                            b2 = 4;
                                        }
                                        emojiEntity2.subType = (byte) (b15 | b2);
                                    }
                                    mediaEntity.entities.add(emojiEntity2);
                                }
                            } else if (entityView instanceof WeatherView) {
                                weatherView = (WeatherView) entityView;
                                mediaEntity.type = (byte) 8;
                                mediaEntity.subType = (byte) weatherView.getType();
                                mediaEntity.width = weatherView.marker.getWidth();
                                mediaEntity.height = weatherView.marker.getHeight();
                                mediaEntity.text = weatherView.marker.getText();
                                if (weatherView.hasColor()) {
                                    color2 = weatherView.getColor();
                                } else {
                                    color2 = 0;
                                }
                                mediaEntity.color = color2;
                                mediaEntity.density = weatherView.marker.density;
                                mediaEntity.weather = weatherView.weather;
                                TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather2 = new TL_stories.TL_mediaAreaWeather();
                                Weather.State state2 = weatherView.weather;
                                tL_mediaAreaWeather2.emoji = state2.emoji;
                                tL_mediaAreaWeather2.temperature_c = Math.round(state2.temperature);
                                tL_mediaAreaWeather2.color = weatherView.marker.outlinePaint.getColor();
                                mediaEntity.mediaArea = tL_mediaAreaWeather2;
                                tL_mediaAreaWeather2.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                codeEmojiDocument = weatherView.marker.getCodeEmojiDocument();
                                if (codeEmojiDocument != null) {
                                    emojiEntity = new VideoEditedInfo.EmojiEntity();
                                    emojiEntity.document_id = codeEmojiDocument.id;
                                    emojiEntity.document = codeEmojiDocument;
                                    emojiEntity.documentAbsolutePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(codeEmojiDocument, true).getAbsolutePath();
                                    zIsAnimatedStickerDocument = MessageObject.isAnimatedStickerDocument(emojiEntity.document, true);
                                    if (!zIsAnimatedStickerDocument) {
                                        byte b16 = emojiEntity.subType;
                                        if (zIsAnimatedStickerDocument) {
                                            b = 1;
                                        } else {
                                            b = 4;
                                        }
                                        emojiEntity.subType = (byte) (b16 | b);
                                    } else {
                                        byte b17 = emojiEntity.subType;
                                        if (zIsAnimatedStickerDocument) {
                                            b = 1;
                                        } else {
                                            b = 4;
                                        }
                                        emojiEntity.subType = (byte) (b17 | b);
                                    }
                                    mediaEntity.entities.add(emojiEntity);
                                }
                                childAt = childAt;
                                z5 = false;
                                z6 = false;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = childAt.getScaleX();
                                scaleY = childAt.getScaleY();
                                x = childAt.getX();
                                y = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                                mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (entityView instanceof MessageEntityView) {
                                    MessageEntityView messageEntityView8 = (MessageEntityView) entityView;
                                    RectF rectF5 = AndroidUtilities.rectTmp;
                                    bubbleBounds = messageEntityView8.getBubbleBounds(rectF5);
                                    rectF5.offset(messageEntityView8.container.getX(), messageEntityView8.container.getY());
                                    rectF5.offset(messageEntityView8.listView.getX(), messageEntityView8.listView.getY());
                                    mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF5.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF5.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.w = ((rectF5.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.h = ((rectF5.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                } else {
                                    if (entityView instanceof StickerView) {
                                        imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                        f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                        f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                        measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                        if (imageAspectRatio > 1.0f) {
                                            float f17 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                            mediaEntity.height = f17;
                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                            mediaEntity.y = f3 - (f17 / 2.0f);
                                        } else if (imageAspectRatio < 1.0f) {
                                            float f18 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                            mediaEntity.width = f18;
                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                            mediaEntity.x = f2 - (f18 / 2.0f);
                                        }
                                    } else {
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea == null) {
                                        }
                                    }
                                    bubbleBounds = -1.0d;
                                }
                                mediaArea2 = mediaEntity.mediaArea;
                                if (mediaArea2 != null) {
                                    mediaAreaCoordinates.flags |= 1;
                                    mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                }
                            } else if (entityView instanceof LinkView) {
                                linkView = (LinkView) entityView;
                                mediaEntity.type = (byte) 7;
                                if (linkView.marker.withPreview()) {
                                    mediaEntity.subType = (byte) linkView.marker.getPreviewType();
                                } else {
                                    mediaEntity.subType = (byte) linkView.getType();
                                }
                                mediaEntity.width = linkView.marker.getWidth();
                                mediaEntity.height = linkView.marker.getHeight();
                                if (linkView.hasColor()) {
                                    color = linkView.getColor();
                                } else {
                                    color = 0;
                                }
                                mediaEntity.color = color;
                                linkPreview = linkView.marker;
                                mediaEntity.density = linkPreview.density;
                                mediaEntity.linkSettings = linkView.link;
                                if (linkPreview.hasPhoto) {
                                    linkPreview.pushPhotoToCache();
                                    LinkPreview.WebPagePreview webPagePreview3 = mediaEntity.linkSettings;
                                    webPagePreview3.flags |= 4;
                                    webPagePreview3.photoSize = linkView.marker.getPhotoSide();
                                }
                                tL_mediaAreaUrl = new TL_stories.TL_mediaAreaUrl();
                                mediaEntity.mediaArea = tL_mediaAreaUrl;
                                webPagePreview = linkView.link;
                                if (webPagePreview != null) {
                                    webPage = webPagePreview.webpage;
                                    if (webPage != null) {
                                        str = linkView.link.url;
                                    } else {
                                        str = linkView.link.url;
                                    }
                                    tL_mediaAreaUrl.url = str;
                                    mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                }
                                i3 = i5 + 1;
                                childCount = i4;
                                i7 = 0;
                                b5 = 1;
                            } else {
                                if (entityView instanceof ReactionWidgetEntityView) {
                                    ReactionWidgetEntityView reactionWidgetEntityView3 = (ReactionWidgetEntityView) entityView;
                                    mediaEntity.type = (byte) 4;
                                    TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction2 = new TL_stories.TL_mediaAreaSuggestedReaction();
                                    mediaEntity.mediaArea = tL_mediaAreaSuggestedReaction2;
                                    tL_mediaAreaSuggestedReaction2.reaction = ReactionsUtils.toTLReaction(reactionWidgetEntityView3.getCurrentReaction());
                                    mediaEntity.mediaArea.dark = reactionWidgetEntityView3.isDark();
                                    mediaEntity.mediaArea.flipped = reactionWidgetEntityView3.isMirrored();
                                    mediaEntity.mediaArea.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                } else if (entityView instanceof RoundView) {
                                    roundView = (RoundView) entityView;
                                    Size baseSize6 = roundView.getBaseSize();
                                    mediaEntity.width = baseSize6.width;
                                    mediaEntity.height = baseSize6.height;
                                    mediaEntity.type = (byte) 5;
                                    if (storyEntry != 0) {
                                        mediaEntity.text = storyEntry.round.getAbsolutePath();
                                        mediaEntity.roundOffset = storyEntry.roundOffset;
                                        long j2 = storyEntry.roundDuration;
                                        mediaEntity.roundDuration = j2;
                                        float f19 = j2;
                                        mediaEntity.roundLeft = (long) (storyEntry.roundLeft * f19);
                                        mediaEntity.roundRight = (long) (storyEntry.roundRight * f19);
                                    }
                                    mediaEntity.subType = (byte) 4;
                                    if (roundView.isMirrored()) {
                                        mediaEntity.subType = (byte) (mediaEntity.subType | 2);
                                    }
                                } else {
                                    if (entityView instanceof MessageEntityView) {
                                        messageEntityView = (MessageEntityView) entityView;
                                        mediaEntity.type = (byte) 6;
                                        int width5 = messageEntityView.getWidth();
                                        mediaEntity.viewWidth = width5;
                                        mediaEntity.width = width5;
                                        int height4 = messageEntityView.getHeight();
                                        mediaEntity.viewHeight = height4;
                                        mediaEntity.height = height4;
                                        if (messageEntityView.messageObjects.size() > 0) {
                                            messageObject = (MessageObject) messageEntityView.messageObjects.get(0);
                                        } else {
                                            messageObject = null;
                                        }
                                        if (messageObject != null) {
                                            messageEntityView2 = messageEntityView;
                                            childAt = childAt;
                                            if (messageObject != null) {
                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost5 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost5;
                                                tL_inputMediaAreaChannelPost5.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-StoryEntry.getRepostDialogId(messageObject));
                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).msg_id = StoryEntry.getRepostMessageId(messageObject);
                                            } else {
                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost6 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost6;
                                                tL_inputMediaAreaChannelPost6.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                            imageReceiver = null;
                                        } else {
                                            messageEntityView2 = messageEntityView;
                                            childAt = childAt;
                                            if (messageObject != null) {
                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost7 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost7;
                                                tL_inputMediaAreaChannelPost7.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-StoryEntry.getRepostDialogId(messageObject));
                                                ((TL_stories.TL_inputMediaAreaChannelPost) mediaEntity.mediaArea).msg_id = StoryEntry.getRepostMessageId(messageObject);
                                            } else {
                                                TL_stories.TL_inputMediaAreaChannelPost tL_inputMediaAreaChannelPost8 = new TL_stories.TL_inputMediaAreaChannelPost();
                                                mediaEntity.mediaArea = tL_inputMediaAreaChannelPost8;
                                                tL_inputMediaAreaChannelPost8.coordinates = new TL_stories.TL_mediaAreaCoordinates();
                                            }
                                            imageReceiver = null;
                                        }
                                        if (z3) {
                                            z5 = true;
                                        } else {
                                            if (storyEntry != null) {
                                                storyEntry.matrix.reset();
                                                if (messageEntityView2.listView.getChildCount() == 1) {
                                                    childAt2 = messageEntityView2.listView.getChildAt(0);
                                                    if (childAt2 instanceof ChatMessageCell) {
                                                    }
                                                    if (photoImage != null) {
                                                        float fMax3 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                        storyEntry.matrix.postScale(fMax3, fMax3);
                                                        storyEntry.matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax3) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax3) / 2.0f));
                                                        storyEntry.matrix.postTranslate(messageEntityView2.container.getX(), messageEntityView2.container.getY());
                                                        storyEntry.matrix.postTranslate(messageEntityView2.listView.getX(), messageEntityView2.listView.getY());
                                                        storyEntry.matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                        storyEntry.matrix.postScale(messageEntityView2.getScaleX(), messageEntityView2.getScaleY(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                        storyEntry.matrix.postRotate(messageEntityView2.getRotation(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                        storyEntry.matrix.postTranslate(messageEntityView2.getX(), messageEntityView2.getY());
                                                        storyEntry.matrix.postScale(1.0f / this.entitiesView.getWidth(), 1.0f / this.entitiesView.getHeight());
                                                        storyEntry.matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                    }
                                                } else {
                                                    childAt2 = null;
                                                }
                                                if (photoImage != null) {
                                                    float fMax4 = Math.max(photoImage.getImageWidth() / Math.max(1, storyEntry.width), photoImage.getImageHeight() / Math.max(1, storyEntry.height));
                                                    storyEntry.matrix.postScale(fMax4, fMax4);
                                                    storyEntry.matrix.postTranslate(photoImage.getCenterX() - ((storyEntry.width * fMax4) / 2.0f), photoImage.getCenterY() - ((storyEntry.height * fMax4) / 2.0f));
                                                    storyEntry.matrix.postTranslate(messageEntityView2.container.getX(), messageEntityView2.container.getY());
                                                    storyEntry.matrix.postTranslate(messageEntityView2.listView.getX(), messageEntityView2.listView.getY());
                                                    storyEntry.matrix.postTranslate(childAt2.getX(), childAt2.getY());
                                                    storyEntry.matrix.postScale(messageEntityView2.getScaleX(), messageEntityView2.getScaleY(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                    storyEntry.matrix.postRotate(messageEntityView2.getRotation(), messageEntityView2.getPivotX(), messageEntityView2.getPivotY());
                                                    storyEntry.matrix.postTranslate(messageEntityView2.getX(), messageEntityView2.getY());
                                                    storyEntry.matrix.postScale(1.0f / this.entitiesView.getWidth(), 1.0f / this.entitiesView.getHeight());
                                                    storyEntry.matrix.postScale(storyEntry.resultWidth, storyEntry.resultHeight);
                                                }
                                            }
                                            z5 = false;
                                        }
                                        z6 = true;
                                        arrayList.add(mediaEntity);
                                        scaleX = childAt.getScaleX();
                                        scaleY = childAt.getScaleY();
                                        x = childAt.getX();
                                        y = childAt.getY();
                                        mediaEntity.viewWidth = childAt.getWidth();
                                        mediaEntity.viewHeight = childAt.getHeight();
                                        mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                                        mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                                        mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                        mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                        mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                                        mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                                        mediaEntity.scale = scaleX;
                                        if (entityView instanceof MessageEntityView) {
                                            MessageEntityView messageEntityView9 = (MessageEntityView) entityView;
                                            RectF rectF6 = AndroidUtilities.rectTmp;
                                            bubbleBounds = messageEntityView9.getBubbleBounds(rectF6);
                                            rectF6.offset(messageEntityView9.container.getX(), messageEntityView9.container.getY());
                                            rectF6.offset(messageEntityView9.listView.getX(), messageEntityView9.listView.getY());
                                            mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF6.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF6.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.w = ((rectF6.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.h = ((rectF6.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                        } else {
                                            if (entityView instanceof StickerView) {
                                                imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                                f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                                f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                                measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                                if (imageAspectRatio > 1.0f) {
                                                    float f110 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                                    mediaEntity.height = f110;
                                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                                    mediaEntity.y = f3 - (f110 / 2.0f);
                                                } else if (imageAspectRatio < 1.0f) {
                                                    float f111 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                                    mediaEntity.width = f111;
                                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                                    mediaEntity.x = f2 - (f111 / 2.0f);
                                                }
                                            } else {
                                                mediaArea = mediaEntity.mediaArea;
                                                if (mediaArea == null) {
                                                }
                                            }
                                            bubbleBounds = -1.0d;
                                        }
                                        mediaArea2 = mediaEntity.mediaArea;
                                        if (mediaArea2 != null) {
                                            mediaAreaCoordinates.flags |= 1;
                                            mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                        }
                                    }
                                    i3 = i5 + 1;
                                    childCount = i4;
                                    i7 = 0;
                                    b5 = 1;
                                }
                                z5 = true;
                                z6 = true;
                                imageReceiver = null;
                                arrayList.add(mediaEntity);
                                scaleX = childAt.getScaleX();
                                scaleY = childAt.getScaleY();
                                x = childAt.getX();
                                y = childAt.getY();
                                mediaEntity.viewWidth = childAt.getWidth();
                                mediaEntity.viewHeight = childAt.getHeight();
                                mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                                mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                                mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                                mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                                mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                                mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                                mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                                mediaEntity.scale = scaleX;
                                if (entityView instanceof MessageEntityView) {
                                    MessageEntityView messageEntityView10 = (MessageEntityView) entityView;
                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                    bubbleBounds = messageEntityView10.getBubbleBounds(rectF7);
                                    rectF7.offset(messageEntityView10.container.getX(), messageEntityView10.container.getY());
                                    rectF7.offset(messageEntityView10.listView.getX(), messageEntityView10.listView.getY());
                                    mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF7.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF7.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.w = ((rectF7.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.h = ((rectF7.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                                    mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                                } else {
                                    if (entityView instanceof StickerView) {
                                        imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                        f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                        f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                        measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                        if (imageAspectRatio > 1.0f) {
                                            float f112 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                            mediaEntity.height = f112;
                                            mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                            mediaEntity.y = f3 - (f112 / 2.0f);
                                        } else if (imageAspectRatio < 1.0f) {
                                            float f113 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                            mediaEntity.width = f113;
                                            mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                            mediaEntity.x = f2 - (f113 / 2.0f);
                                        }
                                    } else {
                                        mediaArea = mediaEntity.mediaArea;
                                        if (mediaArea == null) {
                                        }
                                    }
                                    bubbleBounds = -1.0d;
                                }
                                mediaArea2 = mediaEntity.mediaArea;
                                if (mediaArea2 != null) {
                                    mediaAreaCoordinates.flags |= 1;
                                    mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                                }
                            }
                        }
                        z5 = false;
                        z6 = true;
                        imageReceiver = null;
                        arrayList.add(mediaEntity);
                        scaleX = childAt.getScaleX();
                        scaleY = childAt.getScaleY();
                        x = childAt.getX();
                        y = childAt.getY();
                        mediaEntity.viewWidth = childAt.getWidth();
                        mediaEntity.viewHeight = childAt.getHeight();
                        mediaEntity.width = (childAt.getWidth() * scaleX) / this.entitiesView.getMeasuredWidth();
                        mediaEntity.height = (childAt.getHeight() * scaleY) / this.entitiesView.getMeasuredHeight();
                        mediaEntity.x = (((childAt.getWidth() * (1.0f - scaleX)) / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                        mediaEntity.y = (((childAt.getHeight() * (1.0f - scaleY)) / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                        mediaEntity.rotation = (float) (((double) (-childAt.getRotation())) * 0.017453292519943295d);
                        mediaEntity.textViewX = ((childAt.getWidth() / 2.0f) + x) / this.entitiesView.getMeasuredWidth();
                        mediaEntity.textViewY = ((childAt.getHeight() / 2.0f) + y) / this.entitiesView.getMeasuredHeight();
                        mediaEntity.textViewWidth = mediaEntity.viewWidth / this.entitiesView.getMeasuredWidth();
                        mediaEntity.textViewHeight = mediaEntity.viewHeight / this.entitiesView.getMeasuredHeight();
                        mediaEntity.scale = scaleX;
                        if (entityView instanceof MessageEntityView) {
                            MessageEntityView messageEntityView11 = (MessageEntityView) entityView;
                            RectF rectF8 = AndroidUtilities.rectTmp;
                            bubbleBounds = messageEntityView11.getBubbleBounds(rectF8);
                            rectF8.offset(messageEntityView11.container.getX(), messageEntityView11.container.getY());
                            rectF8.offset(messageEntityView11.listView.getX(), messageEntityView11.listView.getY());
                            mediaEntity.mediaArea.coordinates.x = ((((x + (childAt.getWidth() / 2.0f)) - ((childAt.getWidth() / 2.0f) * scaleX)) + (rectF8.centerX() * scaleX)) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.y = ((((y + (childAt.getHeight() / 2.0f)) - ((childAt.getHeight() / 2.0f) * scaleY)) + (rectF8.centerY() * scaleY)) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.w = ((rectF8.width() * scaleX) / this.entitiesView.getMeasuredWidth()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.h = ((rectF8.height() * scaleY) / this.entitiesView.getMeasuredHeight()) * 100.0f;
                            mediaEntity.mediaArea.coordinates.rotation = (((double) (-mediaEntity.rotation)) / 3.141592653589793d) * 180.0d;
                        } else {
                            if (entityView instanceof StickerView) {
                                imageAspectRatio = ((StickerView) entityView).centerImage.getImageAspectRatio();
                                f2 = mediaEntity.x + (mediaEntity.width / 2.0f);
                                f3 = mediaEntity.y + (mediaEntity.height / 2.0f);
                                measuredWidth = this.entitiesView.getMeasuredWidth() / this.entitiesView.getMeasuredHeight();
                                if (imageAspectRatio > 1.0f) {
                                    float f114 = (mediaEntity.width * measuredWidth) / imageAspectRatio;
                                    mediaEntity.height = f114;
                                    mediaEntity.viewHeight = (int) (mediaEntity.viewWidth / imageAspectRatio);
                                    mediaEntity.y = f3 - (f114 / 2.0f);
                                } else if (imageAspectRatio < 1.0f) {
                                    float f115 = (mediaEntity.height / measuredWidth) * imageAspectRatio;
                                    mediaEntity.width = f115;
                                    mediaEntity.viewWidth = (int) (mediaEntity.viewHeight * imageAspectRatio);
                                    mediaEntity.x = f2 - (f115 / 2.0f);
                                }
                            } else {
                                mediaArea = mediaEntity.mediaArea;
                                if (mediaArea == null) {
                                }
                            }
                            bubbleBounds = -1.0d;
                        }
                        mediaArea2 = mediaEntity.mediaArea;
                        if (mediaArea2 != null) {
                            mediaAreaCoordinates.flags |= 1;
                            mediaAreaCoordinates.radius = ((((double) scaleX) * bubbleBounds) / ((double) childAt.getWidth())) * 100.0d;
                        }
                    } else {
                        i4 = childCount;
                        i5 = i3;
                        childAt = childAt;
                        f = 1.0f;
                        z5 = false;
                        z6 = true;
                        imageReceiver = null;
                    }
                    if (!z6) {
                    }
                    i3 = i5 + 1;
                    childCount = i4;
                    i7 = 0;
                    b5 = 1;
                }
                i3 = i5 + 1;
                childCount = i4;
                i7 = 0;
                b5 = 1;
            }
        }
        return bitmap;
    }

    public boolean hasBlur() {
        return this.renderView.getPainting().hasBlur;
    }

    public Bitmap getBlurBitmap() {
        return this.renderView.getResultBitmap(true, false);
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

    public void setCoverPreview(boolean z) {
        if (this.isCoverPreview != z) {
            this.isCoverPreview = z;
            if (z) {
                selectEntity(null);
            }
            setCoverPause(z);
        }
    }

    private void setCoverPause(boolean z) {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                ImageReceiver imageReceiver = ((StickerView) childAt).centerImage;
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                AnimatedFileDrawable animation = imageReceiver.getAnimation();
                boolean z2 = !z;
                imageReceiver.setAllowStartLottieAnimation(z2);
                imageReceiver.setAllowStartAnimation(z2);
                if (lottieAnimation != null) {
                    if (z) {
                        lottieAnimation.stop();
                    } else {
                        lottieAnimation.start();
                    }
                } else if (animation != null) {
                    animation.setAllowDecodeSingleFrame(z);
                    if (z) {
                        animation.stop();
                    } else {
                        animation.start();
                    }
                }
            }
        }
    }

    public void setCoverTime(long j) {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof StickerView) {
                ImageReceiver imageReceiver = ((StickerView) childAt).centerImage;
                RLottieDrawable lottieAnimation = imageReceiver.getLottieAnimation();
                imageReceiver.getAnimation();
                if (lottieAnimation != null) {
                    lottieAnimation.setCurrentFrame(Math.round(((j % lottieAnimation.getDuration()) / lottieAnimation.getDuration()) * lottieAnimation.getFramesCount()), true, false);
                }
            }
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isCoverPreview) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public boolean onTouch(MotionEvent motionEvent) {
        if (this.isCoverPreview) {
            return false;
        }
        if (this.currentEntityView != null) {
            selectEntity(null);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(x, y);
        this.renderView.onTouch(motionEventObtain);
        motionEventObtain.recycle();
        return true;
    }

    public List<View> getPreviewViews() {
        return Arrays.asList(this.renderView, this.renderInputView, this.entitiesView, this.selectionContainerView);
    }

    public void clearSelection() {
        selectEntity(null);
    }

    public void openPaint() {
        switchTab(0);
        clearSelection();
    }

    public void openText() {
        switchTab(2);
        this.forceChanges = true;
        createText(true);
    }

    public void openStickers() {
        switchTab(1);
        openStickersView();
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

    public View getTextDimView() {
        return this.textDim;
    }

    public View getRenderInputView() {
        return this.renderInputView;
    }

    public View getEntitiesView() {
        return this.entitiesView;
    }

    public View getSelectionEntitiesView() {
        return this.selectionContainerView;
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
        setCurrentSwatch(this.colorSwatch, true, Integer.valueOf(i), false);
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
                    PaintView.$r8$lambda$nLIIC0nzaFi0lCaZQazfwnIkYJE(this.f$0, dynamicAnimation, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    PaintView.$r8$lambda$zhJMP3J6A4Emw2hhzJ4b0FLCLTU(this.f$0, z, dynamicAnimation, z2, f, f2);
                }
            });
            this.typefaceMenuTransformAnimation.start();
        }
    }

    public static void $r8$lambda$nLIIC0nzaFi0lCaZQazfwnIkYJE(PaintView paintView, DynamicAnimation dynamicAnimation, float f, float f2) {
        float f3 = f / 1000.0f;
        paintView.typefaceMenuTransformProgress = f3;
        paintView.typefaceListView.setAlpha(f3);
        paintView.typefaceListView.invalidate();
        paintView.overlayLayout.invalidate();
        paintView.textOptionsView.getTypefaceCell().setAlpha(1.0f - paintView.typefaceMenuTransformProgress);
    }

    public static void $r8$lambda$zhJMP3J6A4Emw2hhzJ4b0FLCLTU(PaintView paintView, boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == paintView.typefaceMenuTransformAnimation) {
            paintView.typefaceMenuTransformAnimation = null;
            if (!z) {
                paintView.typefaceListView.setVisibility(8);
            }
            paintView.typefaceListView.setMaskProvider(null);
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
            final boolean[] zArr = {this.keyboardNotifier.keyboardVisible() || this.emojiPadding > 0};
            final float translationY = this.bottomLayout.getTranslationY();
            final float alpha = this.doneButton.getAlpha();
            final ViewGroup barView = getBarView();
            this.toolsTransformAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                    PaintView.$r8$lambda$QOsAD96SidNWZ6sIg1gkfXoGhdQ(this.f$0, barView, z, zArr, alpha, translationY, dynamicAnimation, f, f2);
                }
            });
            this.toolsTransformAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                    PaintView.m4518$r8$lambda$DIbbpaapYWjmsZJzBVLg_fcuw0(this.f$0, z, dynamicAnimation, z2, f, f2);
                }
            });
            this.toolsTransformAnimation.start();
            if (z) {
                this.colorsListView.setVisibility(0);
                this.colorsListView.setSelectedColorIndex(PersistColorPalette.getInstance(this.currentAccount).getCurrentColorPosition());
            }
        }
    }

    public static void $r8$lambda$QOsAD96SidNWZ6sIg1gkfXoGhdQ(PaintView paintView, View view, boolean z, boolean[] zArr, float f, float f2, DynamicAnimation dynamicAnimation, float f3, float f4) {
        float f5 = f3 / 1000.0f;
        paintView.toolsTransformProgress = f5;
        float f6 = ((1.0f - f5) * 0.4f) + 0.6f;
        view.setScaleX(f6);
        view.setScaleY(f6);
        view.setTranslationY((AndroidUtilities.dp(16.0f) * Math.min(paintView.toolsTransformProgress, 0.25f)) / 0.25f);
        view.setAlpha(1.0f - (Math.min(paintView.toolsTransformProgress, 0.25f) / 0.25f));
        paintView.colorsListView.setProgress(paintView.toolsTransformProgress, z);
        paintView.doneButton.setProgress(paintView.toolsTransformProgress);
        paintView.cancelButton.setProgress(paintView.toolsTransformProgress);
        paintView.tabsLayout.setTranslationY(AndroidUtilities.dp(32.0f) * paintView.toolsTransformProgress);
        AnimatorSet animatorSet = paintView.keyboardAnimator;
        if (animatorSet != null && animatorSet.isRunning()) {
            zArr[0] = false;
        }
        if (zArr[0]) {
            float f7 = z ? paintView.toolsTransformProgress : 1.0f - paintView.toolsTransformProgress;
            paintView.doneButton.setAlpha(AndroidUtilities.lerp(f, z ? 1.0f : 0.0f, f7));
            paintView.cancelButton.setAlpha(AndroidUtilities.lerp(f, z ? 1.0f : 0.0f, f7));
            paintView.bottomLayout.setTranslationY(f2 - ((AndroidUtilities.dp(39.0f) * f7) * (z ? 1 : -1)));
        }
        paintView.bottomLayout.invalidate();
        if (view == paintView.textOptionsView) {
            paintView.overlayLayout.invalidate();
        }
    }

    public static void m4518$r8$lambda$DIbbpaapYWjmsZJzBVLg_fcuw0(PaintView paintView, boolean z, DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
        if (dynamicAnimation == paintView.toolsTransformAnimation) {
            paintView.toolsTransformAnimation = null;
            if (z) {
                return;
            }
            paintView.colorsListView.setVisibility(8);
            PersistColorPalette.getInstance(paintView.currentAccount).saveColors();
            paintView.colorsListView.getAdapter().notifyDataSetChanged();
        }
    }

    public void setCurrentSwatch(Swatch swatch, boolean z) {
        setCurrentSwatch(swatch, z, null, false);
    }

    private void setCurrentSwatch(Swatch swatch, boolean z, final Integer num, boolean z2) {
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
                        PaintView.m4536$r8$lambda$mteQzzDC7tzgEXQpoSvrxQWvJ8(this.f$0, num, i, valueAnimator);
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
            return;
        }
        if (z2 && (entityView instanceof LocationView)) {
            ((LocationView) entityView).setColor(swatch.color);
            ((LocationView) this.currentEntityView).setType(3);
        } else if (z2 && (entityView instanceof WeatherView)) {
            ((WeatherView) entityView).setColor(swatch.color);
            ((WeatherView) this.currentEntityView).setType(3);
        } else if (z2 && (entityView instanceof LinkView)) {
            ((LinkView) entityView).setColor(swatch.color);
            ((LinkView) this.currentEntityView).setType(0);
        }
    }

    public static void m4536$r8$lambda$mteQzzDC7tzgEXQpoSvrxQWvJ8(PaintView paintView, Integer num, int i, ValueAnimator valueAnimator) {
        paintView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        paintView.colorSwatch.color = ColorUtils.blendARGB(num.intValue(), i, fFloatValue);
        FrameLayout frameLayout = paintView.bottomLayout;
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    public boolean onBackPressed() {
        if (this.reactionLayoutShowing) {
            if (this.reactionLayout.getReactionsWindow() != null && this.reactionLayout.getReactionsWindow().isShowing()) {
                this.reactionLayout.dismissWindow();
            } else {
                showReactionsLayout(false);
            }
            return true;
        }
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
        if (this.enteredThroughText) {
            this.enteredThroughText = false;
            this.keyboardNotifier.ignore(true);
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

    public void onParentPreDraw() {
        ReactionWidgetEntityView reactionWidgetEntityView;
        if (this.invalidateReactionPosition) {
            this.invalidateReactionPosition = false;
            if (this.reactionLayout == null || (reactionWidgetEntityView = this.reactionForEntity) == null) {
                return;
            }
            this.points[0] = reactionWidgetEntityView.getMeasuredWidth() / 2.0f;
            this.points[1] = this.reactionForEntity.getMeasuredHeight() / 2.0f;
            this.reactionForEntity.getMatrix().mapPoints(this.points);
            float measuredHeight = this.points[1] - ((this.reactionForEntity.getMeasuredHeight() / 2.0f) * this.reactionForEntity.getScaleX());
            float measuredHeight2 = this.points[1] + ((this.reactionForEntity.getMeasuredHeight() / 2.0f) * this.reactionForEntity.getScaleX());
            if (measuredHeight < AndroidUtilities.dp(120.0f) && measuredHeight2 > this.parent.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                this.reactionLayout.setTop(false);
                this.reactionLayout.setTranslationY((AndroidUtilities.dp(120.0f) - this.reactionLayout.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
            } else if (measuredHeight < AndroidUtilities.dp(120.0f)) {
                this.reactionLayout.setTop(true);
                this.reactionLayout.setTranslationY(this.points[1] + ((this.reactionForEntity.getMeasuredHeight() / 2.0f) * this.reactionForEntity.getScaleX()));
            } else {
                this.reactionLayout.setTop(false);
                ReactionsContainerLayout reactionsContainerLayout = this.reactionLayout;
                reactionsContainerLayout.setTranslationY((measuredHeight - reactionsContainerLayout.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
            }
            if (this.points[0] < getMeasuredWidth() / 2.0f) {
                this.reactionLayout.setMirrorX(true);
                float x = (this.reactionLayout.getX() + (this.reactionLayout.getMeasuredWidth() / 2.0f)) - (this.points[0] - (this.reactionForEntity.getMeasuredHeight() / 2.0f));
                if (x > 0.0f) {
                    ReactionsContainerLayout reactionsContainerLayout2 = this.reactionLayout;
                    reactionsContainerLayout2.setBubbleOffset(((reactionsContainerLayout2.getMeasuredWidth() / 2.0f) - x) / 2.0f);
                }
            } else {
                float x2 = (this.reactionLayout.getX() + (this.reactionLayout.getMeasuredWidth() / 2.0f)) - (this.points[0] + (this.reactionForEntity.getMeasuredHeight() / 2.0f));
                if (x2 < 0.0f) {
                    ReactionsContainerLayout reactionsContainerLayout3 = this.reactionLayout;
                    reactionsContainerLayout3.setBubbleOffset((-((reactionsContainerLayout3.getMeasuredWidth() / 2.0f) + x2)) / 2.0f);
                }
                this.reactionLayout.setMirrorX(false);
            }
            this.reactionLayout.setTranslationX((this.parent.getMeasuredWidth() - this.reactionLayout.getMeasuredWidth()) / 2.0f);
        }
    }

    public void setBlurManager(BlurringShader.BlurManager blurManager) {
        this.blurManager = blurManager;
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
            setBackground(Theme.getSelectorDrawable(Theme.getColor(Theme.key_listSelector, PaintView.this.resourcesProvider), false));
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
            imageView2.setColorFilter(PaintView.this.getThemedColor(i));
            this.imagesView.addView(this.imageView, LayoutHelper.createFrame(-2, -2, 17));
            ImageView imageView3 = new ImageView(context);
            this.image2View = imageView3;
            imageView3.setScaleType(scaleType);
            this.image2View.setColorFilter(PaintView.this.getThemedColor(i));
            this.image2View.setVisibility(8);
            this.imagesView.addView(this.image2View, LayoutHelper.createFrame(-2, -2, 17));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(PaintView.this.getThemedColor(i));
            this.textView.setTextSize(1, 16.0f);
            addView(this.textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 16, 0));
            ImageView imageView4 = new ImageView(context);
            this.checkView = imageView4;
            imageView4.setImageResource(R.drawable.msg_text_check);
            this.checkView.setScaleType(scaleType);
            this.checkView.setColorFilter(new PorterDuffColorFilter(PaintView.this.getThemedColor(Theme.key_radioBackgroundChecked), PorterDuff.Mode.MULTIPLY));
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
                        PaintView.PopupButton.$r8$lambda$_3k7bWtJZMI4NePt0c0T1U49bUE(this.f$0, z, valueAnimator2);
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

        public static void $r8$lambda$_3k7bWtJZMI4NePt0c0T1U49bUE(PopupButton popupButton, boolean z, ValueAnimator valueAnimator) {
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
            if (PaintView.this.popupWindow != null && PaintView.this.popupWindow.isShowing()) {
                PaintView.this.popupWindow.dismiss(true);
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
        this.textOptionsView.setOutlineType(i, true);
    }

    @Override
    public void onNewTextSelected() {
        if (this.keyboardVisible || this.emojiViewVisible) {
            onEmojiButtonClick();
        } else {
            this.forceChanges = true;
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
                PaintView.$r8$lambda$kbmXxxtGwTA2lwZf5xLmZH1lH38(this.f$0);
            }
        }, this, 53, 0, getHeight(), false);
    }

    public static void $r8$lambda$kbmXxxtGwTA2lwZf5xLmZH1lH38(final PaintView paintView) {
        boolean fillShapes = PersistColorPalette.getInstance(paintView.currentAccount).getFillShapes();
        for (int i = 0; i < Brush.Shape.SHAPES_LIST.size(); i++) {
            final Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
            final int filledIconRes = fillShapes ? shape.getFilledIconRes() : shape.getIconRes();
            PopupButton popupButtonButtonForPopup = paintView.buttonForPopup(shape.getShapeName(), filledIconRes, false, new Runnable() {
                @Override
                public final void run() {
                    PaintView.$r8$lambda$Ee9zu3leu62rojM294x1KR7z_RM(this.f$0, shape, filledIconRes);
                }
            });
            popupButtonButtonForPopup.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public final boolean onLongClick(View view) {
                    return PaintView.$r8$lambda$hcCN6UhYhUqXJO1EcIeYShkU8hs(this.f$0, view);
                }
            });
            paintView.popupLayout.addView((View) popupButtonButtonForPopup, LayoutHelper.createLinear(-1, 48));
        }
    }

    public static void $r8$lambda$Ee9zu3leu62rojM294x1KR7z_RM(PaintView paintView, Brush.Shape shape, int i) {
        if (paintView.renderView.getCurrentBrush() instanceof Brush.Shape) {
            paintView.ignoreToolChangeAnimationOnce = true;
        }
        paintView.onBrushSelected(shape);
        paintView.paintToolsView.animatePlusToIcon(i);
    }

    public static boolean $r8$lambda$hcCN6UhYhUqXJO1EcIeYShkU8hs(PaintView paintView, View view) {
        if (paintView.popupLayout != null) {
            PersistColorPalette.getInstance(paintView.currentAccount).toggleFillShapes();
            boolean fillShapes = PersistColorPalette.getInstance(paintView.currentAccount).getFillShapes();
            for (int i = 0; i < paintView.popupLayout.getItemsCount(); i++) {
                View itemAt = paintView.popupLayout.getItemAt(i);
                if (itemAt instanceof PopupButton) {
                    Brush.Shape shape = (Brush.Shape) Brush.Shape.SHAPES_LIST.get(i);
                    ((PopupButton) itemAt).setIcon(fillShapes ? shape.getFilledIconRes() : shape.getIconRes(), fillShapes, true);
                }
            }
        }
        return true;
    }

    private void showMenuForEntity(final EntityView entityView) {
        if (entityView instanceof MessageEntityView) {
            ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
            if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
                return;
            }
            this.popupWindow.dismiss();
            return;
        }
        int[] centerLocationInWindow = getCenterLocationInWindow(entityView);
        showPopup(new Runnable() {
            @Override
            public final void run() {
                PaintView.$r8$lambda$2WhBya3IqqgZfrFiSxXaFahDvKE(this.f$0, entityView);
            }
        }, this, 51, centerLocationInWindow[0], centerLocationInWindow[1] - AndroidUtilities.dp(32.0f), true);
    }

    public static void $r8$lambda$2WhBya3IqqgZfrFiSxXaFahDvKE(final PaintView paintView, final EntityView entityView) {
        paintView.getClass();
        LinearLayout linearLayout = new LinearLayout(paintView.getContext());
        linearLayout.setOrientation(0);
        boolean z = entityView instanceof MessageEntityView;
        if (!z) {
            TextView textView = new TextView(paintView.getContext());
            textView.setTextColor(paintView.getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView.setGravity(16);
            textView.setLines(1);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView.setTextSize(1, 14.0f);
            textView.setTag(0);
            textView.setText(LocaleController.getString("PaintDelete", R.string.PaintDelete));
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaintView.m4525$r8$lambda$GNhtBFoirVO3CDXOZEO4Gvpbno(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, 44));
        }
        if (entityView instanceof TextPaintView) {
            TextView textView2 = new TextView(paintView.getContext());
            textView2.setTextColor(paintView.getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView2.setGravity(16);
            textView2.setLines(1);
            textView2.setSingleLine();
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView2.setTextSize(1, 14.0f);
            if ((paintView.keyboardNotifier.keyboardVisible() && !paintView.keyboardNotifier.ignoring) || paintView.emojiPadding > 0) {
                textView2.setTag(3);
                textView2.setText(LocaleController.getString(R.string.Paste));
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PaintView.m4528$r8$lambda$Mxl6eGfXO5oQa53MEAk7jFfRik(this.f$0, entityView, view);
                    }
                });
            } else {
                textView2.setTag(1);
                textView2.setText(LocaleController.getString(R.string.PaintEdit));
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PaintView.$r8$lambda$Je2bvHkmiTqADTx1xXaVRuu34e4(this.f$0, entityView, view);
                    }
                });
            }
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 44));
        } else if (entityView instanceof LocationView) {
            TextView textViewCreateActionLayoutButton = paintView.createActionLayoutButton(1, LocaleController.getString(R.string.PaintEdit));
            textViewCreateActionLayoutButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaintView.m4522$r8$lambda$CbOM6_4zBiAYvWEzAVUCZ8fdlA(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textViewCreateActionLayoutButton, LayoutHelper.createLinear(-2, 44));
        } else if (entityView instanceof LinkView) {
            TextView textViewCreateActionLayoutButton2 = paintView.createActionLayoutButton(1, LocaleController.getString(R.string.PaintEdit));
            textViewCreateActionLayoutButton2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaintView.$r8$lambda$O5KOm1g2orutSTPC9rdhAkj8AX4(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textViewCreateActionLayoutButton2, LayoutHelper.createLinear(-2, 44));
        }
        if ((entityView instanceof StickerView) || (entityView instanceof RoundView) || (entityView instanceof PhotoView) || (entityView instanceof ReactionWidgetEntityView)) {
            TextView textViewCreateActionLayoutButton3 = paintView.createActionLayoutButton(4, LocaleController.getString(R.string.Flip));
            textViewCreateActionLayoutButton3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaintView.m4534$r8$lambda$fgGfZ_AtsetQxwR400Zd5yg9LU(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textViewCreateActionLayoutButton3, LayoutHelper.createLinear(-2, 44));
        }
        boolean z2 = entityView instanceof PhotoView;
        if (z2) {
            final PhotoView photoView = (PhotoView) entityView;
            if (photoView.hasSegmentedImage()) {
                TextView textViewCreateActionLayoutButton4 = paintView.createActionLayoutButton(5, LocaleController.getString(photoView.isSegmented() ? R.string.SegmentationUndoCutOut : R.string.SegmentationCutOut));
                textViewCreateActionLayoutButton4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PaintView.$r8$lambda$6xvtPdIboyxjCp8RiAjN9ST1K_0(this.f$0, photoView, view);
                    }
                });
                linearLayout.addView(textViewCreateActionLayoutButton4, LayoutHelper.createLinear(-2, 44));
                photoView.highlightSegmented();
            }
        }
        if (paintView.entitiesView.indexOfChild(entityView) != paintView.entitiesView.getChildCount() - 1 && !(entityView instanceof ReactionWidgetEntityView)) {
            TextView textView3 = new TextView(paintView.getContext());
            textView3.setTextColor(paintView.getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView3.setLines(1);
            textView3.setSingleLine();
            textView3.setEllipsize(TextUtils.TruncateAt.END);
            textView3.setGravity(16);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView3.setTextSize(1, 14.0f);
            textView3.setTag(2);
            textView3.setText(LocaleController.getString(R.string.PaintBringToFront));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaintView.$r8$lambda$tw9sE1ma8VPrUMs22SoAWIUvlT0(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, 44));
        } else if (!z2 && !z && !(entityView instanceof RoundView) && !(entityView instanceof LocationView) && !(entityView instanceof WeatherView) && !(entityView instanceof LinkView) && !(entityView instanceof ReactionWidgetEntityView)) {
            TextView textView4 = new TextView(paintView.getContext());
            textView4.setTextColor(paintView.getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
            textView4.setLines(1);
            textView4.setSingleLine();
            textView4.setEllipsize(TextUtils.TruncateAt.END);
            textView4.setGravity(16);
            textView4.setTypeface(AndroidUtilities.bold());
            textView4.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            textView4.setTextSize(1, 14.0f);
            textView4.setTag(2);
            textView4.setText(LocaleController.getString("PaintDuplicate", R.string.PaintDuplicate));
            textView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaintView.m4532$r8$lambda$dtbLMoNsyc5VolIiUkbd4V6moE(this.f$0, entityView, view);
                }
            });
            linearLayout.addView(textView4, LayoutHelper.createLinear(-2, 44));
        }
        int i = 0;
        while (i < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i);
            int themedColor = paintView.getThemedColor(Theme.key_listSelector);
            int i2 = 8;
            int i3 = i == 0 ? 8 : 0;
            int i4 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
            int i5 = i == linearLayout.getChildCount() - 1 ? 8 : 0;
            if (i != 0) {
                i2 = 0;
            }
            childAt.setBackground(Theme.createRadSelectorDrawable(themedColor, i3, i4, i5, i2));
            i++;
        }
        paintView.popupLayout.addView(linearLayout);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        linearLayout.setLayoutParams(layoutParams);
    }

    public static void m4525$r8$lambda$GNhtBFoirVO3CDXOZEO4Gvpbno(PaintView paintView, EntityView entityView, View view) {
        paintView.getClass();
        if (entityView instanceof RoundView) {
            paintView.onTryDeleteRound();
        } else {
            paintView.removeEntity(entityView);
        }
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void m4528$r8$lambda$Mxl6eGfXO5oQa53MEAk7jFfRik(PaintView paintView, EntityView entityView, View view) {
        paintView.getClass();
        try {
            ((TextPaintView) entityView).getEditText().onTextContextMenuItem(16908337);
        } catch (Exception e) {
            FileLog.e(e);
        }
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void $r8$lambda$Je2bvHkmiTqADTx1xXaVRuu34e4(PaintView paintView, EntityView entityView, View view) {
        paintView.selectEntity(entityView);
        paintView.editSelectedTextEntity();
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void m4522$r8$lambda$CbOM6_4zBiAYvWEzAVUCZ8fdlA(final PaintView paintView, final EntityView entityView, View view) {
        paintView.selectEntity(null);
        paintView.showLocationAlert((LocationView) entityView, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                PaintView.$r8$lambda$2Kk_XJMTtQ5xssosTBcpFn_Th6A(this.f$0, entityView, (TLRPC.MessageMedia) obj, (TL_stories.MediaArea) obj2);
            }
        });
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void $r8$lambda$2Kk_XJMTtQ5xssosTBcpFn_Th6A(PaintView paintView, EntityView entityView, TLRPC.MessageMedia messageMedia, TL_stories.MediaArea mediaArea) {
        paintView.getClass();
        ((LocationView) entityView).setLocation(paintView.currentAccount, messageMedia, mediaArea);
        paintView.appearAnimation(entityView);
    }

    public static void $r8$lambda$O5KOm1g2orutSTPC9rdhAkj8AX4(PaintView paintView, EntityView entityView, View view) {
        paintView.selectEntity(null);
        paintView.showLinkAlert((LinkView) entityView);
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void m4534$r8$lambda$fgGfZ_AtsetQxwR400Zd5yg9LU(PaintView paintView, EntityView entityView, View view) {
        paintView.getClass();
        if (entityView instanceof StickerView) {
            ((StickerView) entityView).mirror(true);
        } else if (entityView instanceof ReactionWidgetEntityView) {
            ((ReactionWidgetEntityView) entityView).mirror(true);
        } else if (entityView instanceof RoundView) {
            ((RoundView) entityView).mirror(true);
        } else {
            ((PhotoView) entityView).mirror(true);
        }
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void $r8$lambda$6xvtPdIboyxjCp8RiAjN9ST1K_0(PaintView paintView, PhotoView photoView, View view) {
        paintView.getClass();
        photoView.toggleSegmented(true);
        if (photoView.isSegmented()) {
            paintView.onSwitchSegmentedAnimation(photoView);
        }
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void $r8$lambda$tw9sE1ma8VPrUMs22SoAWIUvlT0(PaintView paintView, EntityView entityView, View view) {
        paintView.getClass();
        entityView.bringToFront();
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    public static void m4532$r8$lambda$dtbLMoNsyc5VolIiUkbd4V6moE(PaintView paintView, EntityView entityView, View view) {
        paintView.duplicateEntity(entityView);
        ActionBarPopupWindow actionBarPopupWindow = paintView.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        paintView.popupWindow.dismiss(true);
    }

    private TextView createActionLayoutButton(int i, String str) {
        TextView textView = new TextView(getContext());
        textView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem));
        textView.setGravity(16);
        textView.setLines(1);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
        textView.setTextSize(1, 14.0f);
        textView.setTag(Integer.valueOf(i));
        textView.setText(str);
        return textView;
    }

    private void duplicateEntity(EntityView entityView) {
        EntityView entityView2;
        if (entityView == null) {
            return;
        }
        PointF pointFStartPositionRelativeToEntity = startPositionRelativeToEntity(entityView);
        if (entityView instanceof StickerView) {
            EntityView stickerView = new StickerView(getContext(), (StickerView) entityView, pointFStartPositionRelativeToEntity);
            stickerView.setDelegate(this);
            this.entitiesView.addView(stickerView);
            checkEntitiesIsVideo();
            entityView2 = stickerView;
        } else {
            if (!(entityView instanceof TextPaintView)) {
                return;
            }
            TextPaintView textPaintView = new TextPaintView(getContext(), (TextPaintView) entityView, pointFStartPositionRelativeToEntity);
            textPaintView.setDelegate(this);
            textPaintView.setMaxWidth(this.w - AndroidUtilities.dp(32.0f));
            this.entitiesView.addView(textPaintView, LayoutHelper.createFrame(-2, -2.0f));
            checkEntitiesIsVideo();
            entityView2 = textPaintView;
        }
        registerRemovalUndo(entityView2);
        selectEntity(null);
        appearAnimation(entityView2);
    }

    private PointF startPositionRelativeToEntity(EntityView entityView) {
        float f;
        MediaController.CropState cropState = this.currentCropState;
        float fMin = cropState != null ? 200.0f / cropState.cropScale : 200.0f;
        if (entityView != null) {
            PointF position = entityView.getPosition();
            float fMin2 = Math.min(entityView.getHeight(), entityView.getWidth()) * 0.2f;
            return new PointF(position.x + fMin2, position.y + fMin2);
        }
        float f2 = cropState != null ? 100.0f / cropState.cropScale : 100.0f;
        PointF pointFCenterPositionForEntity = centerPositionForEntity();
        int i = 0;
        while (i < 10) {
            int i2 = 0;
            boolean z = false;
            while (i2 < this.entitiesView.getChildCount()) {
                View childAt = this.entitiesView.getChildAt(i2);
                if (!(childAt instanceof EntityView) || (childAt instanceof MessageEntityView)) {
                    f = f2;
                } else {
                    PointF position2 = ((EntityView) childAt).getPosition();
                    f = f2;
                    if (((float) Math.sqrt(Math.pow(position2.x - pointFCenterPositionForEntity.x, 2.0d) + Math.pow(position2.y - pointFCenterPositionForEntity.y, 2.0d))) < f) {
                        fMin = Math.min(childAt.getHeight(), childAt.getWidth()) * 0.2f;
                        z = true;
                    }
                }
                i2++;
                f2 = f;
            }
            float f3 = f2;
            if (!z) {
                break;
            }
            i++;
            pointFCenterPositionForEntity = new PointF(pointFCenterPositionForEntity.x + fMin, pointFCenterPositionForEntity.y + fMin);
            f2 = f3;
        }
        return pointFCenterPositionForEntity;
    }

    class PopupWindowLayout extends ActionBarPopupWindow.ActionBarPopupWindowLayout {
        private final ButtonBounce bounce;
        private float cx;
        private float cy;
        public boolean enableBounce;

        public PopupWindowLayout(Context context) {
            super(context, PaintView.this.resourcesProvider);
            this.bounce = new ButtonBounce(this, 1.5f, 1.0f, 2.0f);
            this.enableBounce = true;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.cx = motionEvent.getX();
                this.cy = motionEvent.getY();
                this.bounce.setPressed(this.enableBounce);
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.bounce.setPressed(false);
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float scale = this.bounce.getScale(0.05f);
            if (scale < 1.0f) {
                canvas.save();
                canvas.scale(scale, scale, this.cx, this.cy);
            }
            super.dispatchDraw(canvas);
            if (scale < 1.0f) {
                canvas.restore();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
        }
    }

    private void showPopup(Runnable runnable, View view, int i, int i2, int i3, boolean z) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
            return;
        }
        if (this.popupLayout == null) {
            this.popupRect = new Rect();
            PopupWindowLayout popupWindowLayout = new PopupWindowLayout(getContext());
            this.popupLayout = popupWindowLayout;
            popupWindowLayout.setAnimationEnabled(true);
            this.popupLayout.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return PaintView.$r8$lambda$edbfV4RScwlski40Y9nE1rgOjAM(this.f$0, view2, motionEvent);
                }
            });
            this.popupLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    PaintView.$r8$lambda$2Ph2UMq6j919THI4Sly21NAe0tA(this.f$0, keyEvent);
                }
            });
            this.popupLayout.setShownFromBottom(true);
        }
        PopupWindowLayout popupWindowLayout2 = this.popupLayout;
        popupWindowLayout2.enableBounce = z;
        popupWindowLayout2.removeInnerViews();
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
        this.popupLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(10000.0f), Integer.MIN_VALUE));
        this.popupWindow.setFocusable(true);
        if ((i & 48) != 0) {
            i2 -= this.popupLayout.getMeasuredWidth() / 2;
            i3 -= this.popupLayout.getMeasuredHeight();
        }
        this.popupWindow.showAtLocation(view, i, i2, i3);
        ActionBarPopupWindow.startAnimation(this.popupLayout);
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.popup_fixed_alert3).mutate();
        if (z) {
            PopupWindowLayout popupWindowLayout3 = this.popupLayout;
            popupWindowLayout3.setBackgroundDrawable(new BlurringShader.StoryBlurDrawer(this.blurManager, popupWindowLayout3, 5).makeDrawable(i2, i3, drawableMutate, AndroidUtilities.dpf2(8.3f)));
        } else {
            this.popupLayout.setBackgroundDrawable(drawableMutate);
            this.popupLayout.setBackgroundColor(-14145495);
        }
    }

    public static boolean $r8$lambda$edbfV4RScwlski40Y9nE1rgOjAM(PaintView paintView, View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        paintView.getClass();
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = paintView.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(paintView.popupRect);
        if (paintView.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        paintView.popupWindow.dismiss();
        return false;
    }

    public static void $r8$lambda$2Ph2UMq6j919THI4Sly21NAe0tA(PaintView paintView, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        paintView.getClass();
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = paintView.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            paintView.popupWindow.dismiss();
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
            float fFloor = (float) Math.floor(((double) Math.max(this.w, this.entitiesView.getMeasuredWidth())) * 0.5d);
            return new Size(fFloor, fFloor / f);
        }
        float fFloor2 = (float) Math.floor(((double) Math.max(this.h, this.entitiesView.getMeasuredHeight())) * 0.5d);
        return new Size(f * fFloor2, fFloor2);
    }

    private Size basePhotoSize(TLObject tLObject) {
        float f;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, 1000);
            f = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w / closestPhotoSizeWithSize.h : 1.0f;
            if (f > 1.0f) {
                float fFloor = (float) Math.floor(((double) Math.max(this.w, this.entitiesView.getMeasuredWidth())) * 0.5d);
                return new Size(fFloor, fFloor / f);
            }
            float fFloor2 = (float) Math.floor(((double) Math.max(this.h, this.entitiesView.getMeasuredHeight())) * 0.5d);
            return new Size(f * fFloor2, fFloor2);
        }
        if (!(tLObject instanceof TLRPC.Document)) {
            boolean z = tLObject instanceof TLRPC.WebDocument;
        }
        if (f > 1.0f) {
            float fFloor3 = (float) Math.floor(((double) Math.max(this.w, this.entitiesView.getMeasuredWidth())) * 0.5d);
            return new Size(fFloor3, fFloor3 / f);
        }
        float fFloor4 = (float) Math.floor(((double) Math.max(this.h, this.entitiesView.getMeasuredHeight())) * 0.5d);
        return new Size(f * fFloor4, fFloor4);
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
                PaintView.$r8$lambda$Rr6uusUl6fJZi8I28vGIZmni2q4(this.f$0, view);
            }
        }).start();
    }

    public static void $r8$lambda$Rr6uusUl6fJZi8I28vGIZmni2q4(PaintView paintView, View view) {
        paintView.getClass();
        if (view instanceof EntityView) {
            EntityView entityView = (EntityView) view;
            entityView.updateSelectionView();
            paintView.selectEntity(entityView);
        }
    }

    private PointF centerPositionForEntity() {
        int measuredWidth = this.entitiesView.getMeasuredWidth();
        int measuredHeight = this.entitiesView.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        if (measuredHeight <= 0) {
            measuredHeight = this.h;
        }
        return new PointF(measuredWidth / 2.0f, measuredHeight / 2.0f);
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
        return new StickerPosition(new PointF(pointForAnchor.x, pointForAnchor.y), (float) (((double) (randomFaceWithVacantAnchor.getWidthForAnchor(i) / baseStickerSize().width)) * tL_maskCoords.zoom), randomFaceWithVacantAnchor.getAngle());
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

    public PhotoView createPhoto(String str, boolean z) {
        this.forceChanges = true;
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
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(photoView);
            selectEntity(photoView);
        }
        return photoView;
    }

    public void deleteRound() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            final View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof RoundView) {
                if (this.currentEntityView == childAt) {
                    selectEntity(null);
                }
                childAt.animate().scaleX(0.0f).scaleY(0.0f).setDuration(280L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        PaintView.$r8$lambda$u5hLlW2EB6ZxKoNsxXuhK6eurbs(this.f$0, childAt);
                    }
                }).start();
            }
        }
    }

    public static void $r8$lambda$u5hLlW2EB6ZxKoNsxXuhK6eurbs(PaintView paintView, View view) {
        paintView.getClass();
        paintView.removeEntity((RoundView) view);
    }

    public RoundView createRound(String str, boolean z) {
        this.forceChanges = true;
        this.creatingNewRound = true;
        deleteRound();
        int measuredWidth = this.entitiesView.getMeasuredWidth();
        this.entitiesView.getMeasuredHeight();
        if (measuredWidth <= 0) {
            measuredWidth = this.w;
        }
        float f = measuredWidth;
        float fFloor = (float) Math.floor(0.43f * f);
        Size size = new Size(fFloor, fFloor);
        final RoundView roundView = new RoundView(getContext(), new PointF((f - (size.width / 2.0f)) - AndroidUtilities.dp(16.0f), AndroidUtilities.dp(72.0f) + (size.height / 2.0f)), 0.0f, 1.0f, size, str);
        roundView.setDelegate(this);
        this.entitiesView.addView(roundView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(roundView);
            post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.selectEntity(roundView);
                }
            });
        }
        this.creatingNewRound = false;
        return roundView;
    }

    public MessageEntityView createMessage(ArrayList arrayList, boolean z, boolean z2) {
        this.forceChanges = true;
        MessageEntityView messageEntityView = new MessageEntityView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, arrayList, this.blurManager, z2, this.videoTextureHolder) {
            @Override
            public boolean drawForBitmap() {
                return PaintView.this.drawForThemeToggle;
            }
        };
        messageEntityView.setDelegate(this);
        this.entitiesView.addView(messageEntityView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(messageEntityView);
            selectEntity(messageEntityView);
        }
        return messageEntityView;
    }

    public MessageEntityView findMessageView() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof MessageEntityView) {
                return (MessageEntityView) childAt;
            }
        }
        return null;
    }

    public PhotoView createPhoto(TLObject tLObject, boolean z) {
        this.forceChanges = true;
        PhotoView photoView = new PhotoView(getContext(), centerPositionForEntity(), 0.0f, 1.0f, basePhotoSize(tLObject), tLObject);
        photoView.setDelegate(this);
        this.entitiesView.addView(photoView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(photoView);
            selectEntity(photoView);
        }
        return photoView;
    }

    private StickerView createSticker(Object obj, TLRPC.Document document, boolean z) {
        StickerPosition stickerPositionCalculateStickerPosition = calculateStickerPosition(document);
        StickerView stickerView = new StickerView(getContext(), stickerPositionCalculateStickerPosition.position, stickerPositionCalculateStickerPosition.angle, stickerPositionCalculateStickerPosition.scale, baseStickerSize(), document, obj) {
            @Override
            protected void didSetAnimatedSticker(RLottieDrawable rLottieDrawable) {
                PaintView.this.didSetAnimatedSticker(rLottieDrawable);
            }
        };
        if (MessageObject.isTextColorEmoji(document)) {
            stickerView.centerImage.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        stickerView.centerImage.setLayerNum(12);
        stickerView.setDelegate(this);
        this.entitiesView.addView(stickerView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(stickerView);
            selectEntity(stickerView);
        }
        return stickerView;
    }

    private ReactionWidgetEntityView createReactionWidget(boolean z) {
        Size size = new Size(AndroidUtilities.dp(106.0f), AndroidUtilities.dp(106.0f));
        PointF pointFCenterPositionForEntity = centerPositionForEntity();
        if (this.entitiesView.getMeasuredHeight() > 0) {
            loop0: while (true) {
                int i = 0;
                while (true) {
                    if (i >= this.entitiesView.getChildCount()) {
                        break loop0;
                    }
                    View childAt = this.entitiesView.getChildAt(i);
                    if (MathUtils.distance(pointFCenterPositionForEntity.x, pointFCenterPositionForEntity.y, childAt.getX() + (childAt.getMeasuredWidth() / 2.0f), childAt.getY() + (childAt.getMeasuredHeight() / 2.0f)) < AndroidUtilities.dp(6.0f)) {
                        break;
                    }
                    i++;
                }
                pointFCenterPositionForEntity.x += this.entitiesView.getMeasuredWidth() * 0.05f;
                pointFCenterPositionForEntity.y += this.entitiesView.getMeasuredHeight() * 0.05f;
                pointFCenterPositionForEntity.x = Utilities.clamp(pointFCenterPositionForEntity.x, this.entitiesView.getMeasuredWidth(), 0.0f);
                pointFCenterPositionForEntity.y = Utilities.clamp(pointFCenterPositionForEntity.y, this.entitiesView.getMeasuredHeight(), 0.0f);
            }
        }
        ReactionWidgetEntityView reactionWidgetEntityView = new ReactionWidgetEntityView(getContext(), pointFCenterPositionForEntity, size);
        reactionWidgetEntityView.setDelegate(this);
        this.entitiesView.addView(reactionWidgetEntityView);
        checkEntitiesIsVideo();
        if (z) {
            registerRemovalUndo(reactionWidgetEntityView);
            selectEntity(reactionWidgetEntityView);
        }
        return reactionWidgetEntityView;
    }

    public void removeCurrentEntity() {
        EntityView entityView = this.currentEntityView;
        if (entityView != null) {
            removeEntity(entityView);
        }
    }

    public void removeEntity(EntityView entityView) {
        EntityView entityView2 = this.currentEntityView;
        if (entityView == entityView2 && entityView2 != null) {
            entityView2.deselect();
            selectEntity(null);
            if (entityView instanceof TextPaintView) {
                ValueAnimator valueAnimator = this.tabsSelectionAnimator;
                if (valueAnimator != null && this.tabsNewSelectedIndex != 0) {
                    valueAnimator.cancel();
                }
                switchTab(0);
            }
        }
        this.entitiesView.removeView(entityView);
        checkEntitiesIsVideo();
        if (entityView != null) {
            this.undoStore.unregisterUndo(entityView.getUUID());
        }
        if (entityView instanceof PhotoView) {
            ((PhotoView) entityView).deleteSegmentedFile();
        }
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.weightChooserView.setShowPreview(true);
        this.colorSwatch.brushWeight = this.weightDefaultValueOverride.get();
        setCurrentSwatch(this.colorSwatch, true);
        if (this.creatingNewRound || !(entityView instanceof RoundView)) {
            return;
        }
        onDeleteRound();
    }

    private void checkEntitiesIsVideo() {
        boolean zWouldBeVideo = wouldBeVideo();
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof EntityView) {
                ((EntityView) childAt).setIsVideo(zWouldBeVideo);
            }
        }
    }

    public boolean wouldBeVideo() {
        if (this.isVideo || this.hasAudio) {
            return true;
        }
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof TextPaintView) {
                CharSequence text = ((TextPaintView) childAt).getText();
                if (text instanceof Spanned) {
                    for (AnimatedEmojiSpan animatedEmojiSpan : (AnimatedEmojiSpan[]) ((Spanned) text).getSpans(0, text.length(), AnimatedEmojiSpan.class)) {
                        TLRPC.Document documentFindDocument = animatedEmojiSpan.document;
                        if (documentFindDocument == null) {
                            documentFindDocument = AnimatedEmojiDrawable.findDocument(this.currentAccount, animatedEmojiSpan.getDocumentId());
                        }
                        if (documentFindDocument != null) {
                            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).putDocument(documentFindDocument);
                        }
                        if (StoryEntry.isAnimated(documentFindDocument, FileLoader.getInstance(this.currentAccount).getPathToAttach(documentFindDocument, true).getAbsolutePath())) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            } else if (childAt instanceof StickerView) {
                TLRPC.Document sticker = ((StickerView) childAt).getSticker();
                if (StoryEntry.isAnimated(sticker, FileLoader.getInstance(this.currentAccount).getPathToAttach(sticker, true).getAbsolutePath())) {
                    return true;
                }
            } else if (childAt instanceof RoundView) {
                return true;
            }
        }
        return false;
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
    public boolean isEntityDeletable() {
        return isEntityDeletable(this.currentEntityView);
    }

    public boolean isEntityDeletable(EntityView entityView) {
        return !(entityView instanceof MessageEntityView);
    }

    @Override
    public void onEntityDragEnd(boolean z) {
        updatePreviewViewTranslationY();
        this.forceChanges = true;
    }

    @Override
    public boolean onEntityLongClicked(EntityView entityView) {
        showReactionsLayout(false);
        showMenuForEntity(entityView);
        return true;
    }

    @Override
    public void getTransformedTouch(float f, float f2, float[] fArr) {
        View view;
        View view2 = (View) this.renderView.getParent();
        if (view2 == null || (view = (View) view2.getParent()) == null) {
            return;
        }
        float x = (f - view2.getX()) - view.getLeft();
        float y = (f2 - view2.getY()) - view.getTop();
        float pivotX = view2.getPivotX() + ((x - view2.getPivotX()) / view2.getScaleX());
        float pivotY = view2.getPivotY() + ((y - view2.getPivotY()) / view2.getScaleY());
        fArr[0] = pivotX;
        fArr[1] = pivotY;
    }

    @Override
    public int[] getCenterLocation(EntityView entityView) {
        this.pos[0] = (int) entityView.getPosition().x;
        this.pos[1] = (int) entityView.getPosition().y;
        return this.pos;
    }

    private int[] getCenterLocationInWindow(View view) {
        view.getLocationInWindow(this.pos);
        float width = view.getWidth() * view.getScaleX() * this.entitiesView.getScaleX();
        float height = view.getHeight() * view.getScaleY() * this.entitiesView.getScaleY();
        int[] iArr = this.pos;
        iArr[0] = (int) (iArr[0] + (width / 2.0f));
        iArr[1] = (int) (iArr[1] + (height / 2.0f));
        return iArr;
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
        if (this.emojiViewVisible && (this.currentEntityView instanceof TextPaintView)) {
            this.keyboardNotifier.awaitKeyboard();
            AndroidUtilities.showKeyboard(((TextPaintView) this.currentEntityView).getEditText());
        }
        showEmojiPopup(!this.emojiViewVisible ? 1 : 0);
    }

    private void showEmojiPopup(int i) {
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
            int paddingUnderContainer = (point.x > point.y ? this.keyboardHeightLand : this.keyboardHeight) + this.parent.getPaddingUnderContainer();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emojiView2.getLayoutParams();
            layoutParams.height = paddingUnderContainer;
            emojiView2.setLayoutParams(layoutParams);
            if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                EntityView entityView = this.currentEntityView;
                if (entityView instanceof TextPaintView) {
                    AndroidUtilities.hideKeyboard(((TextPaintView) entityView).getEditText());
                }
            }
            this.emojiWasPadding = paddingUnderContainer;
            this.emojiPadding = paddingUnderContainer;
            this.keyboardNotifier.fire();
            requestLayout();
            ChatActivityEnterViewAnimatedIconView emojiButton = this.textOptionsView.getEmojiButton();
            if (emojiButton != null) {
                emojiButton.setState(ChatActivityEnterViewAnimatedIconView.State.KEYBOARD, true);
            }
            if (!z) {
                if (this.keyboardVisible) {
                    this.translateBottomPanelAfterResize = true;
                } else {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.emojiPadding, 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            PaintView.m4544$r8$lambda$yo_j9Gre4WHKMtEu5_BKfHXYlc(this.f$0, valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            PaintView.this.emojiView.setTranslationY(0.0f);
                        }
                    });
                    valueAnimatorOfFloat.setDuration(250L);
                    valueAnimatorOfFloat.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                    valueAnimatorOfFloat.start();
                }
            }
        } else {
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
                this.keyboardNotifier.fire();
            }
            requestLayout();
        }
        updatePlusEmojiKeyboardButton();
    }

    public static void m4544$r8$lambda$yo_j9Gre4WHKMtEu5_BKfHXYlc(PaintView paintView, ValueAnimator valueAnimator) {
        paintView.getClass();
        paintView.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void hideEmojiPopup(boolean z) {
        if (this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (z) {
            EmojiView emojiView = this.emojiView;
            if (emojiView != null && emojiView.getVisibility() == 0 && !this.waitingForKeyboardOpen) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.emojiView.getMeasuredHeight());
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PaintView.$r8$lambda$IgBc_s7bL4Gu0mPjy0ysF4t5UVg(this.f$0, valueAnimator);
                    }
                });
                this.isAnimatePopupClosing = true;
                valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        PaintView.this.isAnimatePopupClosing = false;
                        PaintView.this.emojiView.setTranslationY(0.0f);
                        PaintView.this.hideEmojiView();
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

    public static void $r8$lambda$IgBc_s7bL4Gu0mPjy0ysF4t5UVg(PaintView paintView, ValueAnimator valueAnimator) {
        paintView.getClass();
        paintView.emojiView.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void hideEmojiView() {
        EmojiView emojiView;
        if (!this.emojiViewVisible && (emojiView = this.emojiView) != null && emojiView.getVisibility() != 8) {
            this.emojiView.setVisibility(8);
        }
        int i = this.emojiPadding;
        this.emojiPadding = 0;
        if (i != 0) {
            this.keyboardNotifier.fire();
        }
    }

    @Override
    public int measureKeyboardHeight() {
        return this.keyboardNotifier.getKeyboardHeight() - this.parent.getBottomPadding2();
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
            int paddingUnderContainer = (z ? this.keyboardHeightLand : this.keyboardHeight) + this.parent.getPaddingUnderContainer();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.emojiView.getLayoutParams();
            int i2 = layoutParams.width;
            int i3 = AndroidUtilities.displaySize.x;
            if (i2 != i3 || layoutParams.height != paddingUnderContainer) {
                layoutParams.width = i3;
                layoutParams.height = paddingUnderContainer;
                this.emojiView.setLayoutParams(layoutParams);
                int i4 = layoutParams.height;
                this.emojiWasPadding = i4;
                this.emojiPadding = i4;
                this.keyboardNotifier.fire();
                requestLayout();
            }
        }
        if (this.lastSizeChangeValue1 == i && this.lastSizeChangeValue2 == z) {
            return;
        }
        this.lastSizeChangeValue1 = i;
        this.lastSizeChangeValue2 = z;
        boolean z3 = this.keyboardVisible;
        EntityView entityView = this.currentEntityView;
        if (entityView instanceof TextPaintView) {
            this.keyboardVisible = ((TextPaintView) entityView).getEditText().isFocused() && this.keyboardNotifier.keyboardVisible();
        } else {
            this.keyboardVisible = false;
        }
        if (this.keyboardVisible && this.emojiViewVisible) {
            showEmojiPopup(0);
        }
        if (this.emojiPadding != 0 && !(z2 = this.keyboardVisible) && z2 != z3 && !this.emojiViewVisible) {
            this.emojiPadding = 0;
            this.keyboardNotifier.fire();
            requestLayout();
        }
        updateTextDim();
        if (z3 && !this.keyboardVisible && this.emojiPadding > 0 && this.translateBottomPanelAfterResize) {
            this.translateBottomPanelAfterResize = false;
        }
        if (this.keyboardVisible && this.waitingForKeyboardOpen) {
            this.waitingForKeyboardOpen = false;
            AndroidUtilities.cancelRunOnUIThread(this.openKeyboardRunnable);
        }
        updatePlusEmojiKeyboardButton();
    }

    private void updateTextDim() {
        final boolean z = (this.currentEntityView instanceof TextPaintView) && (this.keyboardNotifier.keyboardVisible() || this.emojiPadding > 0) && !this.keyboardNotifier.ignoring;
        this.textDim.animate().cancel();
        this.textDim.setVisibility(0);
        this.textDim.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() {
            @Override
            public final void run() {
                PaintView.$r8$lambda$DL2d1qwmCf8WCB0UF329YkrNfu0(this.f$0, z);
            }
        }).start();
    }

    public static void $r8$lambda$DL2d1qwmCf8WCB0UF329YkrNfu0(PaintView paintView, boolean z) {
        if (z) {
            paintView.getClass();
        } else {
            paintView.textDim.setVisibility(8);
        }
    }

    private void updatePlusEmojiKeyboardButton() {
        if (this.textOptionsView != null) {
            if (this.keyboardNotifier.keyboardVisible()) {
                this.textOptionsView.animatePlusToIcon(R.drawable.input_smile);
            } else if (this.emojiViewVisible) {
                this.textOptionsView.animatePlusToIcon(R.drawable.input_keyboard);
            } else {
                this.textOptionsView.animatePlusToIcon(R.drawable.msg_add);
            }
        }
        boolean z = this.keyboardNotifier.keyboardVisible() || this.emojiViewVisible;
        boolean z2 = !z;
        AndroidUtilities.updateViewShow(this.undoAllButton, z2, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.undoButton, z2, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.doneTextButton, z, false, 1.0f, true, null);
        AndroidUtilities.updateViewShow(this.cancelTextButton, z, false, 1.0f, true, null);
    }

    protected void createEmojiView() {
        EmojiView emojiView = this.emojiView;
        if (emojiView != null && emojiView.currentAccount != UserConfig.selectedAccount) {
            this.parent.removeView(emojiView);
            this.emojiView = null;
        }
        if (this.emojiView != null) {
            return;
        }
        EmojiView emojiView2 = new EmojiView(null, true, false, false, getContext(), false, null, null, true, this.resourcesProvider, false);
        this.emojiView = emojiView2;
        emojiView2.fixBottomTabContainerTranslation = false;
        emojiView2.allowEmojisForNonPremium(true);
        this.emojiView.setVisibility(8);
        if (AndroidUtilities.isTablet()) {
            this.emojiView.setForseMultiwindowLayout(true);
        }
        this.emojiView.setDelegate(new AnonymousClass31());
        this.parent.addView(this.emojiView);
    }

    class AnonymousClass31 implements EmojiView.EmojiViewDelegate {
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

        AnonymousClass31() {
        }

        @Override
        public boolean onBackspace() {
            EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
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
            if ((PaintView.this.currentEntityView instanceof TextPaintView) && (editText = (textPaintView = (TextPaintView) PaintView.this.currentEntityView).getEditText()) != null) {
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
            EditTextOutline editText = ((TextPaintView) PaintView.this.currentEntityView).getEditText();
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
                    animatedEmojiSpan = new AnimatedEmojiSpan(document, 1.0f, editText.getPaint().getFontMetricsInt());
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(j, 1.0f, editText.getPaint().getFontMetricsInt());
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
            AlertDialog.Builder builder = new AlertDialog.Builder(PaintView.this.getContext(), PaintView.this.resourcesProvider);
            builder.setTitle(LocaleController.getString(R.string.ClearRecentEmojiTitle));
            builder.setMessage(LocaleController.getString(R.string.ClearRecentEmojiText));
            builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    PaintView.this.emojiView.clearRecentEmoji();
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.show();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        this.destroyed = false;
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        this.destroyed = true;
        ReactionsContainerLayout reactionsContainerLayout = this.reactionLayout;
        if (reactionsContainerLayout != null) {
            AndroidUtilities.removeFromParent(reactionsContainerLayout);
            this.reactionLayout = null;
        }
        super.onDetachedFromWindow();
    }

    public EntityView getSelectedEntity() {
        return this.currentEntityView;
    }

    public RoundView findRoundView() {
        for (int i = 0; i < this.entitiesView.getChildCount(); i++) {
            View childAt = this.entitiesView.getChildAt(i);
            if (childAt instanceof RoundView) {
                return (RoundView) childAt;
            }
        }
        return null;
    }
}

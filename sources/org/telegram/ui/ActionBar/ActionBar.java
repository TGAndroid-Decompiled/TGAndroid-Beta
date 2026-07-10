package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.android.animator.ReplaceAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EllipsizeSpanAnimator;
import org.telegram.ui.Components.FireworksEffect;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SectionsScrollView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SnowflakesEffect;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProvider;

public class ActionBar extends FrameLayout implements FactorAnimator.Target, Theme.Colorable {
    private int actionBarColor;
    public ActionBarMenuOnItemClick actionBarMenuOnItemClick;
    private ActionBarMenu actionMode;
    private AnimatorSet actionModeAnimation;
    private int actionModeColor;
    private View actionModeExtraView;
    private View[] actionModeHidingViews;
    private View actionModeShowingView;
    private String actionModeTag;
    private View actionModeTop;
    private View actionModeTranslationView;
    protected boolean actionModeVisible;
    private boolean adaptiveBackground;
    private boolean adaptiveBackgroundHideTitle;
    private ValueAnimator adaptive_animator;
    private int adaptive_lowerColorKey;
    private int adaptive_topColorKey;
    private boolean addToContainer;
    private ActionBarAnimatedSubtitleOverlayContainer additionalSubTitleOverlayContainer;
    private SimpleTextView additionalSubtitleTextView;
    private int additionalTextLeft;
    private boolean allowOverlayTitle;
    private final BoolAnimator animatorAvatarContainerHasAvatar;
    private final FactorAnimator animatorAvatarContainerWidth;
    private final BoolAnimator animatorHasMenuItems;
    private final FactorAnimator animatorMenuItemsWidth;
    private boolean attachState;
    private boolean attached;
    private BackupImageView avatarSearchImageView;
    private Drawable backButtonDrawable;
    public ImageView backButtonImageView;
    private INavigationLayout.BackButtonState backButtonState;
    Runnable backgroundUpdateListener;
    public Paint blurScrimPaint;
    boolean blurredBackground;
    private boolean castShadows;
    private boolean centerScale;
    private ChatAvatarContainer chatAvatarContainer;
    private boolean clipContent;
    SizeNotifierFrameLayout contentView;
    private boolean doNotDrawChild;
    private Runnable doOnActionModeFactorChanged;
    private boolean drawBackButton;
    EllipsizeSpanAnimator ellipsizeSpanAnimator;
    private int extraHeight;
    private FireworksEffect fireworksEffect;
    private Paint.FontMetricsInt fontMetricsInt;
    private boolean forceSkipTouches;
    private int forcedMenuWidth;
    private boolean fromBottom;
    private BlurredBackgroundDrawable glassDrawable;
    private Drawable glassDrawableBack;
    private Drawable glassDrawableMenu;
    private boolean glassMode;
    private boolean glassModeIsForum;
    private boolean glassOnlyBack;
    private boolean hasForcedMenuWidth;
    private boolean ignoreLayoutRequest;
    private View.OnTouchListener interceptTouchEventListener;
    private boolean interceptTouches;
    private boolean isAnimationsAllowed;
    private boolean isCenterTitle;
    private boolean isMenuOffsetSuppressed;
    protected boolean isSearchFieldVisible;
    protected int itemsActionModeBackgroundColor;
    protected int itemsActionModeColor;
    public int itemsBackgroundColor;
    protected int itemsColor;
    private CharSequence lastOverlayTitle;
    private Drawable lastRightDrawable;
    private Runnable lastRunnable;
    private CharSequence lastTitle;
    private boolean manualStart;
    public ActionBarMenu menu;
    public boolean menuOccupyBack;
    protected boolean occupyStatusBar;
    private boolean onTop;
    private float onTopAnimated;
    private boolean overlayTitleAnimation;
    boolean overlayTitleAnimationInProgress;
    private Object[] overlayTitleToSet;
    protected BaseFragment parentFragment;
    int prevWidth;
    private Rect rect;
    Rect rectTmp;
    private final Theme.ResourcesProvider resourcesProvider;
    private boolean resumed;
    private View.OnClickListener rightDrawableOnClickListener;
    private float searchFactor;
    public float searchFieldVisibleAlpha;
    AnimatorSet searchVisibleAnimator;
    private int shadowAlpha;
    private SnowflakesEffect snowflakesEffect;
    private CharSequence subtitle;
    private SimpleTextView subtitleTextView;
    private boolean supportsHolidayImage;
    private Runnable titleActionRunnable;
    private boolean titleAnimationRunning;
    private int titleColorToSet;
    private boolean titleOverlayShown;
    private int titleRightMargin;
    private final SimpleTextView[] titleTextView;
    private FrameLayout titlesContainer;
    private boolean useContainerForTitles;

    public static class ActionBarMenuOnItemClick {
        public boolean canOpenMenu() {
            return true;
        }

        public void onItemClick(int i) {
        }
    }

    public int[] getColorKeys() {
        return Theme.Colorable.CC.$default$getColorKeys(this);
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    protected boolean onSearchChangedIgnoreTitles() {
        return false;
    }

    public ActionBar(Context context) {
        this(context, null);
    }

    public ActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backButtonState = INavigationLayout.BackButtonState.BACK;
        this.titleTextView = new SimpleTextView[2];
        this.occupyStatusBar = true;
        this.addToContainer = true;
        this.interceptTouches = true;
        this.overlayTitleToSet = new Object[3];
        this.castShadows = true;
        this.shadowAlpha = 255;
        this.titleColorToSet = 0;
        this.blurScrimPaint = new Paint();
        this.rectTmp = new Rect();
        this.ellipsizeSpanAnimator = new EllipsizeSpanAnimator(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorAvatarContainerWidth = new FactorAnimator(0, this, cubicBezierInterpolator, 380L);
        this.animatorAvatarContainerHasAvatar = new BoolAnimator(0, this, cubicBezierInterpolator, 380L);
        this.animatorMenuItemsWidth = new FactorAnimator(0, this, cubicBezierInterpolator, 320L);
        this.animatorHasMenuItems = new BoolAnimator(0, this, cubicBezierInterpolator, 320L);
        this.onTop = true;
        this.onTopAnimated = 1.0f;
        this.resourcesProvider = resourcesProvider;
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
    }

    public void lambda$new$0(View view) {
        Runnable runnable;
        if (isSearchFieldVisible() || (runnable = this.titleActionRunnable) == null) {
            return;
        }
        runnable.run();
    }

    public void setGlassOnlyBack() {
        this.glassOnlyBack = true;
    }

    public void setChatAvatarContainer(ChatAvatarContainer chatAvatarContainer) {
        this.chatAvatarContainer = chatAvatarContainer;
    }

    public void setupGlass(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider) {
        setupGlass(blurredBackgroundDrawableViewFactory, blurredBackgroundColorProvider, false);
    }

    public void setupGlass(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundColorProvider blurredBackgroundColorProvider, boolean z) {
        setBackground(null);
        setClipChildren(false);
        this.glassMode = true;
        this.glassModeIsForum = z;
        BlurredBackgroundDrawable padding = blurredBackgroundDrawableViewFactory.create(this).setColorProvider(blurredBackgroundColorProvider).setPadding(AndroidUtilities.dp(6.0f));
        this.glassDrawable = padding;
        if (z) {
            padding.setRadius(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(23.0f), AndroidUtilities.dp(18.33f));
        } else {
            padding.setRadius(AndroidUtilities.dp(23.0f));
        }
        this.glassDrawableBack = blurredBackgroundDrawableViewFactory.create(this).setColorProvider(blurredBackgroundColorProvider).setRadius(AndroidUtilities.dp(23.0f)).setPadding(AndroidUtilities.dp(6.0f));
        this.glassDrawableMenu = blurredBackgroundDrawableViewFactory.create(this).setColorProvider(blurredBackgroundColorProvider).setRadius(AndroidUtilities.dp(23.0f)).setPadding(AndroidUtilities.dp(6.0f));
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.menu.setGlassMode(true);
        }
        ActionBarMenu actionBarMenu2 = this.actionMode;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setTranslationX(-AndroidUtilities.dp(10.0f));
            this.actionMode.setGlassMode(true);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setTranslationX(AndroidUtilities.dp(2.0f));
        }
    }

    public INavigationLayout.BackButtonState getBackButtonState() {
        return this.backButtonState;
    }

    private void createBackButtonImage() {
        if (this.backButtonImageView != null) {
            return;
        }
        ImageView imageView = new ImageView(getContext());
        this.backButtonImageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsBackgroundColor));
        this.backButtonImageView.setPadding(AndroidUtilities.dp(1.0f), 0, 0, 0);
        addView(this.backButtonImageView, LayoutHelper.createFrame(54, 54, 51));
        this.backButtonImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createBackButtonImage$1(view);
            }
        });
        this.backButtonImageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
    }

    public void lambda$createBackButtonImage$1(View view) {
        if (!this.actionModeVisible && this.isSearchFieldVisible) {
            closeSearchField();
            return;
        }
        ActionBarMenuOnItemClick actionBarMenuOnItemClick = this.actionBarMenuOnItemClick;
        if (actionBarMenuOnItemClick != null) {
            actionBarMenuOnItemClick.onItemClick(-1);
        }
    }

    public Drawable getBackButtonDrawable() {
        return this.backButtonDrawable;
    }

    public void setBackButtonDrawable(Drawable drawable) {
        if (this.backButtonImageView == null) {
            createBackButtonImage();
        }
        this.backButtonImageView.setVisibility(drawable == null ? 8 : 0);
        ImageView imageView = this.backButtonImageView;
        this.backButtonDrawable = drawable;
        imageView.setImageDrawable(drawable);
        if (drawable instanceof BackDrawable) {
            BackDrawable backDrawable = (BackDrawable) drawable;
            backDrawable.setRotation(isActionModeShowed() ? 1.0f : 0.0f, false);
            backDrawable.setRotatedColor(this.itemsActionModeColor);
            backDrawable.setColor(this.itemsColor);
        } else if (drawable instanceof MenuDrawable) {
            MenuDrawable menuDrawable = (MenuDrawable) drawable;
            menuDrawable.setBackColor(this.actionBarColor);
            menuDrawable.setIconColor(this.itemsColor);
        } else if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
            this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
        }
        checkBackButtonLayerType();
    }

    private void checkBackButtonLayerType() {
        ImageView imageView = this.backButtonImageView;
        if (imageView == null) {
            return;
        }
        Drawable drawable = imageView.getDrawable();
        int i = ((drawable instanceof BackDrawable) || (drawable instanceof MenuDrawable)) ? 2 : 0;
        if (this.backButtonImageView.getLayerType() != i) {
            this.backButtonImageView.setLayerType(i, null);
            this.backButtonImageView.invalidate();
        }
    }

    public void setBackButtonContentDescription(CharSequence charSequence) {
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setSupportsHolidayImage(boolean z) {
        this.supportsHolidayImage = z;
        if (z) {
            this.fontMetricsInt = new Paint.FontMetricsInt();
            this.rect = new Rect();
        }
        invalidate();
    }

    public BackupImageView getSearchAvatarImageView() {
        return this.avatarSearchImageView;
    }

    public void setSearchAvatarImageView(BackupImageView backupImageView) {
        BackupImageView backupImageView2 = this.avatarSearchImageView;
        if (backupImageView2 == backupImageView) {
            return;
        }
        if (backupImageView2 != null) {
            removeView(backupImageView2);
        }
        this.avatarSearchImageView = backupImageView;
        if (backupImageView != null) {
            addView(backupImageView);
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Drawable currentHolidayDrawable;
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL && motionEvent.getAction() == 0 && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null && currentHolidayDrawable.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.manualStart = true;
            if (this.snowflakesEffect == null) {
                this.fireworksEffect = null;
                this.snowflakesEffect = new SnowflakesEffect(0);
                this.titleTextView[0].invalidate();
                invalidate();
            } else {
                this.snowflakesEffect = null;
                this.fireworksEffect = new FireworksEffect();
                this.titleTextView[0].invalidate();
                invalidate();
            }
        }
        View.OnTouchListener onTouchListener = this.interceptTouchEventListener;
        return (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) || super.onInterceptTouchEvent(motionEvent);
    }

    protected boolean shouldClipChild(View view) {
        if (!this.clipContent) {
            return false;
        }
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        return view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || view == this.subtitleTextView || view == this.menu || view == this.backButtonImageView || view == this.additionalSubtitleTextView || view == this.titlesContainer;
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        Drawable currentHolidayDrawable;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment != null && baseFragment.getParentLayout() != null && this.parentFragment.getParentLayout().isActionBarInCrossfade()) {
            return false;
        }
        if (this.drawBackButton && view == this.backButtonImageView) {
            return true;
        }
        boolean zShouldClipChild = shouldClipChild(view);
        if (zShouldClipChild) {
            canvas.save();
            canvas.clipRect(0.0f, (-getTranslationY()) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if ((view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || (view == this.titlesContainer && this.useContainerForTitles)) && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null) {
                SimpleTextView simpleTextView = view == this.titlesContainer ? this.titleTextView[0] : (SimpleTextView) view;
                if (simpleTextView != null && simpleTextView.getVisibility() == 0 && (simpleTextView.getText() instanceof String)) {
                    TextPaint textPaint = simpleTextView.getTextPaint();
                    textPaint.getFontMetricsInt(this.fontMetricsInt);
                    textPaint.getTextBounds((String) simpleTextView.getText(), 0, 1, this.rect);
                    int textStartX = simpleTextView.getTextStartX() + Theme.getCurrentHolidayDrawableXOffset() + ((this.rect.width() - (currentHolidayDrawable.getIntrinsicWidth() + Theme.getCurrentHolidayDrawableXOffset())) / 2);
                    int textStartY = simpleTextView.getTextStartY() + Theme.getCurrentHolidayDrawableYOffset() + ((int) Math.ceil((simpleTextView.getTextHeight() - this.rect.height()) / 2.0f)) + ((int) (AndroidUtilities.dp(8.0f) * (1.0f - this.titlesContainer.getScaleY())));
                    currentHolidayDrawable.setBounds(textStartX, textStartY - currentHolidayDrawable.getIntrinsicHeight(), currentHolidayDrawable.getIntrinsicWidth() + textStartX, textStartY);
                    currentHolidayDrawable.setAlpha((int) (this.titlesContainer.getAlpha() * 255.0f * simpleTextView.getAlpha()));
                    currentHolidayDrawable.draw(canvas);
                    if (this.overlayTitleAnimationInProgress) {
                        view.invalidate();
                        invalidate();
                    }
                }
                if (Theme.canStartHolidayAnimation()) {
                    if (this.snowflakesEffect == null) {
                        this.snowflakesEffect = new SnowflakesEffect(0);
                    }
                } else if (!this.manualStart && this.snowflakesEffect != null) {
                    this.snowflakesEffect = null;
                }
                SnowflakesEffect snowflakesEffect = this.snowflakesEffect;
                if (snowflakesEffect != null) {
                    snowflakesEffect.onDraw(this, canvas);
                } else {
                    FireworksEffect fireworksEffect = this.fireworksEffect;
                    if (fireworksEffect != null) {
                        fireworksEffect.onDraw(this, canvas);
                    }
                }
            }
        }
        if (zShouldClipChild) {
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        if (this.clipContent) {
            invalidate();
        }
    }

    public void setBackButtonImage(int i) {
        if (this.backButtonImageView == null) {
            createBackButtonImage();
        }
        this.backButtonImageView.setVisibility(i == 0 ? 8 : 0);
        this.backButtonImageView.setImageResource(i);
        this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, PorterDuff.Mode.SRC_IN));
        checkBackButtonLayerType();
    }

    private void createSubtitleTextView() {
        if (this.subtitleTextView != null) {
            return;
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.subtitleTextView = simpleTextView;
        simpleTextView.setGravity(3);
        this.subtitleTextView.setVisibility(8);
        this.subtitleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubtitle));
        addView(this.subtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
    }

    public void createAdditionalSubtitleTextView() {
        if (this.additionalSubtitleTextView != null) {
            return;
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.additionalSubtitleTextView = simpleTextView;
        simpleTextView.setGravity(3);
        this.additionalSubtitleTextView.setVisibility(8);
        this.additionalSubtitleTextView.setTextColor(getThemedColor(Theme.key_actionBarDefaultSubtitle));
        addView(this.additionalSubtitleTextView, 0, LayoutHelper.createFrame(-2, -2, 51));
    }

    public SimpleTextView getAdditionalSubtitleTextView() {
        return this.additionalSubtitleTextView;
    }

    public void setAddToContainer(boolean z) {
        this.addToContainer = z;
    }

    public boolean shouldAddToContainer() {
        return this.addToContainer;
    }

    public void setClipContent(boolean z) {
        this.clipContent = z;
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence != null && this.subtitleTextView == null) {
            createSubtitleTextView();
        }
        if (this.subtitleTextView != null) {
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            this.subtitleTextView.setVisibility((zIsEmpty || this.isSearchFieldVisible) ? 8 : 0);
            this.subtitleTextView.setAlpha(1.0f);
            if (!zIsEmpty) {
                this.subtitleTextView.setText(charSequence);
            }
            this.subtitle = charSequence;
        }
    }

    private void createTitleTextView(int i) {
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[i] != null) {
            return;
        }
        simpleTextViewArr[i] = new SimpleTextView(getContext());
        this.titleTextView[i].setGravity(this.isCenterTitle ? 17 : 19);
        int i2 = this.titleColorToSet;
        if (i2 != 0) {
            this.titleTextView[i].setTextColor(i2);
        } else {
            this.titleTextView[i].setTextColor(getThemedColor(Theme.key_actionBarDefaultTitle));
        }
        SimpleTextView simpleTextView = this.titleTextView[i];
        simpleTextView.setEmojiColor(simpleTextView.getTextColor());
        this.titleTextView[i].setTypeface(AndroidUtilities.bold());
        this.titleTextView[i].setDrawablePadding(AndroidUtilities.dp(4.0f));
        this.titleTextView[i].setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        this.titleTextView[i].setRightDrawableTopPadding(-AndroidUtilities.dp(1.0f));
        if (this.useContainerForTitles) {
            this.titlesContainer.addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        } else {
            addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
        }
    }

    public void setTitleRightMargin(int i) {
        this.titleRightMargin = i;
    }

    public void setTitle(CharSequence charSequence) {
        setTitle(charSequence, null);
    }

    public void setTitle(CharSequence charSequence, Drawable drawable) {
        if (charSequence != null && this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setVisibility((charSequence == null || this.isSearchFieldVisible) ? 4 : 0);
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            this.lastTitle = charSequence;
            simpleTextView2.setText(charSequence);
            if (this.attached) {
                Drawable drawable2 = this.lastRightDrawable;
                if (drawable2 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable2).setParentView(null);
                }
            }
            SimpleTextView simpleTextView3 = this.titleTextView[0];
            this.lastRightDrawable = drawable;
            simpleTextView3.setRightDrawable(drawable);
            if (this.attached) {
                Drawable drawable3 = this.lastRightDrawable;
                if (drawable3 instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable3).setParentView(this.titleTextView[0]);
                }
            }
            this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
        this.fromBottom = false;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView != null) {
            simpleTextView.setRightDrawableOnClick(onClickListener);
        }
        SimpleTextView simpleTextView2 = this.titleTextView[1];
        if (simpleTextView2 != null) {
            simpleTextView2.setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
    }

    public void setTitleColor(int i) {
        if (this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        this.titleColorToSet = i;
        this.titleTextView[0].setTextColor(i);
        this.titleTextView[0].setEmojiColor(i);
        SimpleTextView simpleTextView = this.titleTextView[1];
        if (simpleTextView != null) {
            simpleTextView.setTextColor(i);
            this.titleTextView[1].setEmojiColor(i);
        }
    }

    public void setSubtitleColor(int i) {
        if (this.subtitleTextView == null) {
            createSubtitleTextView();
        }
        this.subtitleTextView.setTextColor(i);
    }

    public void setTitleScrollNonFitText(boolean z) {
        this.titleTextView[0].setScrollNonFitText(z);
    }

    public void setPopupItemsColor(int i, boolean z, boolean z2) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z2 && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.setPopupItemsColor(i, z);
        } else {
            if (z2 || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.setPopupItemsColor(i, z);
        }
    }

    public void setPopupItemsSelectorColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.setPopupItemsSelectorColor(i);
        } else {
            if (z || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.setPopupItemsSelectorColor(i);
        }
    }

    public void setPopupBackgroundColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.redrawPopup(i);
        } else {
            if (z || (actionBarMenu = this.menu) == null) {
                return;
            }
            actionBarMenu.redrawPopup(i);
        }
    }

    public SimpleTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public SimpleTextView getTitleTextView() {
        return this.titleTextView[0];
    }

    public Paint.FontMetricsInt getTitleFontMetricsInt() {
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView == null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20.0f : 18.0f));
            return textPaint.getFontMetricsInt();
        }
        return simpleTextView.getPaint().getFontMetricsInt();
    }

    public SimpleTextView getTitleTextView2() {
        return this.titleTextView[1];
    }

    public String getTitle() {
        SimpleTextView simpleTextView = this.titleTextView[0];
        if (simpleTextView == null) {
            return null;
        }
        return simpleTextView.getText().toString();
    }

    public String getSubtitle() {
        CharSequence charSequence;
        if (this.subtitleTextView == null || (charSequence = this.subtitle) == null) {
            return null;
        }
        return charSequence.toString();
    }

    public ActionBarMenu createMenu() {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            return actionBarMenu;
        }
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this);
        this.menu = actionBarMenu2;
        addView(actionBarMenu2, 0, LayoutHelper.createFrame(-2, -1, 5));
        return this.menu;
    }

    public void setActionBarMenuOnItemClick(ActionBarMenuOnItemClick actionBarMenuOnItemClick) {
        this.actionBarMenuOnItemClick = actionBarMenuOnItemClick;
    }

    public ActionBarMenuOnItemClick getActionBarMenuOnItemClick() {
        return this.actionBarMenuOnItemClick;
    }

    public ImageView getBackButton() {
        return this.backButtonImageView;
    }

    public ActionBarMenu createActionMode() {
        return createActionMode(true, null);
    }

    public boolean actionModeIsExist(String str) {
        if (this.actionMode == null) {
            return false;
        }
        String str2 = this.actionModeTag;
        if (str2 == null && str == null) {
            return true;
        }
        return str2 != null && str2.equals(str);
    }

    public void setOnActionModeFactorChangeListener(Runnable runnable) {
        this.doOnActionModeFactorChanged = runnable;
    }

    public float getActionModeFactor() {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            return actionBarMenu.getAlpha();
        }
        return 0.0f;
    }

    public ActionBarMenu createActionMode(boolean z, String str) {
        if (actionModeIsExist(str)) {
            return this.actionMode;
        }
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            removeView(actionBarMenu);
            this.actionMode = null;
        }
        this.actionModeTag = str;
        ActionBarMenu actionBarMenu2 = new ActionBarMenu(getContext(), this) {
            @Override
            public void setBackgroundColor(int i) {
                ActionBar.this.actionModeColor = i;
                ActionBar actionBar = ActionBar.this;
                if (actionBar.blurredBackground) {
                    return;
                }
                super.setBackgroundColor(actionBar.actionModeColor);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                ActionBar actionBar = ActionBar.this;
                if (actionBar.blurredBackground && this.drawBlur && actionBar.actionModeColor != 0) {
                    ActionBar.this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    ActionBar actionBar2 = ActionBar.this;
                    actionBar2.blurScrimPaint.setColor(actionBar2.actionModeColor);
                    ActionBar actionBar3 = ActionBar.this;
                    actionBar3.contentView.drawBlurRect(canvas, 0.0f, actionBar3.rectTmp, actionBar3.blurScrimPaint, true);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                ActionBar.this.invalidate();
                if (ActionBar.this.doOnActionModeFactorChanged != null) {
                    ActionBar.this.doOnActionModeFactorChanged.run();
                }
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.add(this);
                }
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.remove(this);
                }
            }
        };
        this.actionMode = actionBarMenu2;
        actionBarMenu2.setTranslationX(this.glassMode ? -AndroidUtilities.dp(10.0f) : 0.0f);
        this.actionMode.setGlassMode(this.glassMode);
        ActionBarMenu actionBarMenu3 = this.actionMode;
        actionBarMenu3.isActionMode = true;
        actionBarMenu3.setClickable(true);
        if (!this.glassMode) {
            this.actionMode.setBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefault));
        }
        addView(this.actionMode, indexOfChild(this.backButtonImageView));
        this.actionMode.setPadding(0, this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.actionMode.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.bottomMargin = this.extraHeight;
        layoutParams.gravity = 5;
        this.actionMode.setLayoutParams(layoutParams);
        this.actionMode.setVisibility(4);
        return this.actionMode;
    }

    public void showActionMode() {
        showActionMode(true, null, null, null, null, null, 0);
    }

    public void showActionMode(boolean z) {
        showActionMode(z, null, null, null, null, null, 0);
    }

    public void showActionMode(boolean z, View view, View view2, View[] viewArr, final boolean[] zArr, View view3, int i) {
        if (this.actionMode == null || this.actionModeVisible) {
            return;
        }
        this.actionModeVisible = true;
        checkMenuItemsWidth();
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<ActionBarMenu, Float>) View.ALPHA, 0.0f, 1.0f));
            if (viewArr != null) {
                for (View view4 : viewArr) {
                    if (view4 != null) {
                        arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f));
                    }
                }
            }
            if (view2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
            }
            if (view3 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.TRANSLATION_Y, i));
                this.actionModeTranslationView = view3;
            }
            this.actionModeExtraView = view;
            this.actionModeShowingView = view2;
            this.actionModeHidingViews = viewArr;
            if (view != null) {
                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.actionModeColor == 0) {
                if (!this.isSearchFieldVisible) {
                    SimpleTextView simpleTextView = this.titleTextView[0];
                    if (simpleTextView != null) {
                        arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) View.ALPHA, 0.0f));
                    }
                    if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                        arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, (Property<SimpleTextView, Float>) View.ALPHA, 0.0f));
                    }
                }
                ActionBarMenu actionBarMenu = this.menu;
                if (actionBarMenu != null) {
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenu, (Property<ActionBarMenu, Float>) View.ALPHA, 0.0f));
                }
            }
            int i2 = this.actionModeColor;
            if (i2 == 0) {
                i2 = this.actionBarColor;
            }
            if (i2 == 0 || this.glassMode) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i2) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
            AnimatorSet animatorSet = this.actionModeAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionModeAnimation = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.backgroundUpdateListener != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f$0.lambda$showActionMode$2(valueAnimator);
                    }
                });
                this.actionModeAnimation.playTogether(valueAnimatorOfFloat);
            }
            this.actionModeAnimation.setDuration(200L);
            this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    ActionBar.this.actionMode.setVisibility(0);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    boolean[] zArr2;
                    if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                        return;
                    }
                    ActionBar.this.actionModeAnimation = null;
                    if (ActionBar.this.titleTextView[0] != null) {
                        ActionBar.this.titleTextView[0].setVisibility(4);
                    }
                    if (ActionBar.this.subtitleTextView != null && !TextUtils.isEmpty(ActionBar.this.subtitle)) {
                        ActionBar.this.subtitleTextView.setVisibility(4);
                    }
                    ActionBarMenu actionBarMenu2 = ActionBar.this.menu;
                    if (actionBarMenu2 != null) {
                        actionBarMenu2.setVisibility(4);
                    }
                    if (ActionBar.this.actionModeHidingViews != null) {
                        for (int i3 = 0; i3 < ActionBar.this.actionModeHidingViews.length; i3++) {
                            if (ActionBar.this.actionModeHidingViews[i3] != null && ((zArr2 = zArr) == null || i3 >= zArr2.length || zArr2[i3])) {
                                ActionBar.this.actionModeHidingViews[i3].setVisibility(4);
                            }
                        }
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                        return;
                    }
                    ActionBar.this.actionModeAnimation = null;
                }
            });
            this.actionModeAnimation.start();
            ImageView imageView = this.backButtonImageView;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BackDrawable) {
                    ((BackDrawable) drawable).setRotation(1.0f, true);
                }
                this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsActionModeBackgroundColor));
                return;
            }
            return;
        }
        this.actionMode.setAlpha(1.0f);
        if (viewArr != null) {
            for (View view5 : viewArr) {
                if (view5 != null) {
                    view5.setAlpha(0.0f);
                }
            }
        }
        if (view2 != null) {
            view2.setAlpha(1.0f);
        }
        if (view3 != null) {
            view3.setTranslationY(i);
            this.actionModeTranslationView = view3;
        }
        this.actionModeExtraView = view;
        if (view != null) {
            view.setTranslationY(0.0f);
        }
        this.actionModeShowingView = view2;
        this.actionModeHidingViews = viewArr;
        int i3 = this.actionModeColor;
        if (i3 == 0) {
            i3 = this.actionBarColor;
        }
        if (i3 == 0 || this.glassMode) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (ColorUtils.calculateLuminance(i3) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        this.actionMode.setVisibility(0);
        SimpleTextView simpleTextView2 = this.titleTextView[0];
        if (simpleTextView2 != null) {
            simpleTextView2.setVisibility(4);
        }
        if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
            this.subtitleTextView.setVisibility(4);
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(4);
        }
        if (this.actionModeHidingViews != null) {
            int i4 = 0;
            while (true) {
                View[] viewArr2 = this.actionModeHidingViews;
                if (i4 >= viewArr2.length) {
                    break;
                }
                View view6 = viewArr2[i4];
                if (view6 != null && (zArr == null || i4 >= zArr.length || zArr[i4])) {
                    view6.setVisibility(4);
                }
                i4++;
            }
        }
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof BackDrawable) {
                ((BackDrawable) drawable2).setRotation(1.0f, false);
            }
            this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsActionModeBackgroundColor));
        }
    }

    public void lambda$showActionMode$2(ValueAnimator valueAnimator) {
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void hideActionMode() {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu == null || !this.actionModeVisible) {
            return;
        }
        actionBarMenu.hideAllPopupMenus();
        this.actionModeVisible = false;
        checkMenuItemsWidth();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.actionMode, (Property<ActionBarMenu, Float>) View.ALPHA, 0.0f));
        if (this.actionModeHidingViews != null) {
            int i = 0;
            while (true) {
                View[] viewArr = this.actionModeHidingViews;
                if (i >= viewArr.length) {
                    break;
                }
                View view = viewArr[i];
                if (view != null) {
                    view.setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.actionModeHidingViews[i], (Property<View, Float>) View.ALPHA, 1.0f));
                }
                i++;
            }
        }
        View view2 = this.actionModeTranslationView;
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f));
            this.actionModeTranslationView = null;
        }
        View view3 = this.actionModeShowingView;
        if (view3 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view3, (Property<View, Float>) View.ALPHA, 0.0f));
        }
        View view4 = this.actionModeExtraView;
        if (view4 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view4, (Property<View, Float>) View.TRANSLATION_Y, view4.getMeasuredHeight()));
        }
        if (!this.isSearchFieldVisible) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                arrayList.add(ObjectAnimator.ofFloat(simpleTextView, (Property<SimpleTextView, Float>) View.ALPHA, 1.0f));
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(ObjectAnimator.ofFloat(this.subtitleTextView, (Property<SimpleTextView, Float>) View.ALPHA, 1.0f));
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenu2, (Property<ActionBarMenu, Float>) View.ALPHA, 1.0f));
        }
        int i2 = this.actionBarColor;
        if (i2 == 0 || this.glassMode) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        } else if (ColorUtils.calculateLuminance(i2) < 0.699999988079071d) {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
        } else {
            AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
        }
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.backgroundUpdateListener != null) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$hideActionMode$3(valueAnimator);
                }
            });
            this.actionModeAnimation.playTogether(valueAnimatorOfFloat);
        }
        this.actionModeAnimation.setDuration(200L);
        this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                    return;
                }
                ActionBar.this.actionModeAnimation = null;
                ActionBar.this.actionMode.setVisibility(4);
                if (ActionBar.this.actionModeExtraView != null) {
                    ActionBar.this.actionModeExtraView.setVisibility(4);
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ActionBar.this.actionModeAnimation == null || !ActionBar.this.actionModeAnimation.equals(animator)) {
                    return;
                }
                ActionBar.this.actionModeAnimation = null;
            }
        });
        this.actionModeAnimation.start();
        if (!this.isSearchFieldVisible) {
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            if (simpleTextView2 != null) {
                simpleTextView2.setVisibility(0);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                this.subtitleTextView.setVisibility(0);
            }
        }
        ActionBarMenu actionBarMenu3 = this.menu;
        if (actionBarMenu3 != null) {
            actionBarMenu3.setVisibility(0);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BackDrawable) {
                ((BackDrawable) drawable).setRotation(0.0f, true);
            }
            this.backButtonImageView.setBackgroundDrawable(Theme.createSelectorDrawable(this.itemsBackgroundColor));
        }
    }

    public void lambda$hideActionMode$3(ValueAnimator valueAnimator) {
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void showActionModeTop() {
        if (this.occupyStatusBar && this.actionModeTop == null) {
            View view = new View(getContext());
            this.actionModeTop = view;
            view.setBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultTop));
            addView(this.actionModeTop);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.actionModeTop.getLayoutParams();
            layoutParams.height = AndroidUtilities.statusBarHeight;
            layoutParams.width = -1;
            layoutParams.gravity = 51;
            this.actionModeTop.setLayoutParams(layoutParams);
        }
    }

    public void setActionModeTopColor(int i) {
        View view = this.actionModeTop;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setSearchTextColor(int i, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setSearchTextColor(i, z);
        }
    }

    public void setSearchCursorColor(int i) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setSearchCursorColor(i);
        }
    }

    public void setActionModeColor(int i) {
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setBackgroundColor(i);
        }
    }

    public void setActionModeOverrideColor(int i) {
        this.actionModeColor = i;
    }

    @Override
    public void setBackgroundColor(int i) {
        this.actionBarColor = i;
        if (!this.blurredBackground) {
            super.setBackgroundColor(i);
        }
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                ((MenuDrawable) drawable).setBackColor(i);
            }
        }
    }

    public int getBackgroundColor() {
        return this.actionBarColor;
    }

    public boolean isActionModeShowed() {
        return this.actionMode != null && this.actionModeVisible;
    }

    public boolean isActionModeShowed(String str) {
        String str2;
        return this.actionMode != null && this.actionModeVisible && (((str2 = this.actionModeTag) == null && str == null) || (str2 != null && str2.equals(str)));
    }

    public void listenToBackgroundUpdate(Runnable runnable) {
        this.backgroundUpdateListener = runnable;
    }

    public void onSearchFieldVisibilityChanged(final boolean z) {
        this.isSearchFieldVisible = z;
        checkMenuItemsWidth();
        AnimatorSet animatorSet = this.searchVisibleAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.searchVisibleAnimator = new AnimatorSet();
        final ArrayList arrayList = new ArrayList();
        final boolean zOnSearchChangedIgnoreTitles = onSearchChangedIgnoreTitles();
        if (!zOnSearchChangedIgnoreTitles) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            if (simpleTextView != null) {
                arrayList.add(simpleTextView);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(this.subtitleTextView);
                this.subtitleTextView.setVisibility(z ? 4 : 0);
            }
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchFieldVisibleAlpha, z ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$onSearchFieldVisibilityChanged$4(valueAnimator);
            }
        });
        this.searchVisibleAnimator.playTogether(valueAnimatorOfFloat);
        for (int i = 0; i < arrayList.size(); i++) {
            View view = (View) arrayList.get(i);
            float f = 0.95f;
            if (!z) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, z ? 0.0f : 1.0f));
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            AnimatorSet animatorSet2 = this.searchVisibleAnimator;
            Property property = View.SCALE_X;
            if (!z) {
                f = 1.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f));
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.setVisibility(0);
            this.searchVisibleAnimator.playTogether(ObjectAnimator.ofFloat(this.avatarSearchImageView, (Property<BackupImageView, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        }
        this.centerScale = true;
        requestLayout();
        this.searchVisibleAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    View view2 = (View) arrayList.get(i2);
                    if (z) {
                        view2.setVisibility(4);
                        view2.setAlpha(0.0f);
                    } else {
                        view2.setAlpha(1.0f);
                    }
                }
                if (z && !zOnSearchChangedIgnoreTitles) {
                    if (ActionBar.this.titleTextView[0] != null) {
                        ActionBar.this.titleTextView[0].setVisibility(8);
                    }
                    if (ActionBar.this.titleTextView[1] != null) {
                        ActionBar.this.titleTextView[1].setVisibility(8);
                    }
                }
                if (ActionBar.this.avatarSearchImageView == null || z) {
                    return;
                }
                ActionBar.this.avatarSearchImageView.setVisibility(8);
            }
        });
        this.searchVisibleAnimator.setDuration(150L).start();
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                MenuDrawable menuDrawable = (MenuDrawable) drawable;
                menuDrawable.setRotateToBack(true);
                menuDrawable.setRotation(z ? 1.0f : 0.0f, true);
            }
        }
    }

    public void lambda$onSearchFieldVisibilityChanged$4(ValueAnimator valueAnimator) {
        ActionBarMenu actionBarMenu;
        this.searchFieldVisibleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (this.glassDrawable != null && this.glassModeIsForum) {
            float fDp = AndroidUtilities.dp(23.0f);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(18.33f), AndroidUtilities.dp(23.0f), this.searchFieldVisibleAlpha);
            this.glassDrawable.setRadius(fLerp, fDp, fDp, fLerp);
            invalidate();
        }
        if (this.glassMode && (actionBarMenu = this.menu) != null) {
            actionBarMenu.setTranslationX(-AndroidUtilities.lerp(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), this.searchFieldVisibleAlpha));
        }
        Runnable runnable = this.backgroundUpdateListener;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setInterceptTouches(boolean z) {
        this.interceptTouches = z;
    }

    public void setInterceptTouchEventListener(View.OnTouchListener onTouchListener) {
        this.interceptTouchEventListener = onTouchListener;
    }

    public void setExtraHeight(int i) {
        this.extraHeight = i;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) actionBarMenu.getLayoutParams();
            layoutParams.bottomMargin = this.extraHeight;
            this.actionMode.setLayoutParams(layoutParams);
        }
    }

    public void closeSearchField() {
        closeSearchField(true);
    }

    public void closeSearchField(boolean z) {
        ActionBarMenu actionBarMenu;
        if (!this.isSearchFieldVisible || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.closeSearchField(z);
    }

    public void openSearchField(String str, boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null || str == null) {
            return;
        }
        boolean z2 = !this.isSearchFieldVisible;
        actionBarMenu.openSearchField(z2, z2, str, z);
    }

    public void setSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setFilter(mediaFilterData);
        }
    }

    public void setSearchFieldText(String str) {
        this.menu.setSearchFieldText(str);
    }

    public void onSearchPressed() {
        this.menu.onSearchPressed();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.setEnabled(z);
        }
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.setEnabled(z);
        }
        ActionBarMenu actionBarMenu2 = this.actionMode;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setEnabled(z);
        }
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayoutRequest) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public void onViewAdded(View view) {
        super.onViewAdded(view);
    }

    public void setAdditionalTextLeft(int i) {
        this.additionalTextLeft = i;
    }

    @Override
    protected void onMeasure(int r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBar.onMeasure(int, int):void");
    }

    public void setMenuOffsetSuppressed(boolean z) {
        this.isMenuOffsetSuppressed = z;
    }

    @Override
    protected void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ActionBar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMenuButtonPressed() {
        ActionBarMenu actionBarMenu;
        if (isActionModeShowed() || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.onMenuButtonPressed();
    }

    public void onResume() {
        this.resumed = true;
        updateAttachState();
    }

    protected void onPause() {
        this.resumed = false;
        updateAttachState();
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu != null) {
            actionBarMenu.hideAllPopupMenus();
        }
    }

    public void setAllowOverlayTitle(boolean z) {
        this.allowOverlayTitle = z;
    }

    public void setTitleActionRunnable(Runnable runnable) {
        this.titleActionRunnable = runnable;
        this.lastRunnable = runnable;
    }

    public void setTitleOverlayText(String str, int i, Runnable runnable) {
        boolean z;
        CharSequence charSequence;
        SimpleTextView simpleTextView;
        int iIndexOf;
        if (!this.allowOverlayTitle || this.parentFragment.parentLayout == null) {
            return;
        }
        Object[] objArr = this.overlayTitleToSet;
        objArr[0] = str;
        objArr[1] = Integer.valueOf(i);
        this.overlayTitleToSet[2] = runnable;
        if (this.overlayTitleAnimationInProgress) {
            return;
        }
        CharSequence charSequence2 = this.lastOverlayTitle;
        if (charSequence2 == null && str == null) {
            return;
        }
        if (charSequence2 == null || !charSequence2.equals(str)) {
            this.lastOverlayTitle = str;
            if (this.additionalSubTitleOverlayContainer != null) {
                this.additionalSubTitleOverlayContainer.setText(i == R.string.ConnectingToProxyWithDots ? AndroidUtilities.replaceArrows(LocaleController.getString(R.string.TitleSetupProxy), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(2.0f)) : null, true);
            }
            CharSequence string = str != null ? LocaleController.getString(str, i) : this.lastTitle;
            Drawable drawable = str == null ? this.lastRightDrawable : null;
            if (str == null || (iIndexOf = TextUtils.indexOf(string, "...")) < 0) {
                z = false;
                charSequence = string;
            } else {
                SpannableString spannableStringValueOf = SpannableString.valueOf(string);
                this.ellipsizeSpanAnimator.wrap(spannableStringValueOf, iIndexOf);
                z = true;
                charSequence = spannableStringValueOf;
            }
            this.titleOverlayShown = str != null;
            if ((charSequence != null && this.titleTextView[0] == null) || getMeasuredWidth() == 0 || ((simpleTextView = this.titleTextView[0]) != null && simpleTextView.getVisibility() != 0)) {
                createTitleTextView(0);
                if (this.supportsHolidayImage) {
                    this.titleTextView[0].invalidate();
                    invalidate();
                }
                this.titleTextView[0].setText(charSequence);
                this.titleTextView[0].setDrawablePadding(AndroidUtilities.dp(4.0f));
                this.titleTextView[0].setRightDrawable(drawable);
                this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                    ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
                }
                if (z) {
                    this.ellipsizeSpanAnimator.addView(this.titleTextView[0]);
                } else {
                    this.ellipsizeSpanAnimator.removeView(this.titleTextView[0]);
                }
            } else {
                SimpleTextView simpleTextView2 = this.titleTextView[0];
                if (simpleTextView2 != null) {
                    simpleTextView2.animate().cancel();
                    SimpleTextView simpleTextView3 = this.titleTextView[1];
                    if (simpleTextView3 != null) {
                        simpleTextView3.animate().cancel();
                    }
                    if (this.titleTextView[1] == null) {
                        createTitleTextView(1);
                    }
                    this.titleTextView[1].setText(charSequence);
                    this.titleTextView[1].setDrawablePadding(AndroidUtilities.dp(4.0f));
                    this.titleTextView[1].setRightDrawable(drawable);
                    this.titleTextView[1].setRightDrawableOnClick(this.rightDrawableOnClickListener);
                    if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                        ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[1]);
                    }
                    if (z) {
                        this.ellipsizeSpanAnimator.addView(this.titleTextView[1]);
                    }
                    this.overlayTitleAnimationInProgress = true;
                    SimpleTextView[] simpleTextViewArr = this.titleTextView;
                    SimpleTextView simpleTextView4 = simpleTextViewArr[1];
                    simpleTextViewArr[1] = simpleTextViewArr[0];
                    simpleTextViewArr[0] = simpleTextView4;
                    simpleTextView4.setAlpha(0.0f);
                    this.titleTextView[0].setTranslationY(-AndroidUtilities.dp(20.0f));
                    this.titleTextView[0].animate().alpha(this.adaptiveBackgroundHideTitle ? 1.0f - this.onTopAnimated : 1.0f).translationY(0.0f).setDuration(220L).start();
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = this.titleTextView[1].animate().alpha(0.0f);
                    if (this.subtitleTextView == null) {
                        viewPropertyAnimatorAlpha.translationY(AndroidUtilities.dp(20.0f));
                    } else {
                        viewPropertyAnimatorAlpha.scaleY(0.7f).scaleX(0.7f);
                    }
                    requestLayout();
                    this.centerScale = true;
                    viewPropertyAnimatorAlpha.setDuration(220L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (ActionBar.this.titleTextView[1] != null && ActionBar.this.titleTextView[1].getParent() != null) {
                                ((ViewGroup) ActionBar.this.titleTextView[1].getParent()).removeView(ActionBar.this.titleTextView[1]);
                            }
                            ActionBar actionBar = ActionBar.this;
                            actionBar.ellipsizeSpanAnimator.removeView(actionBar.titleTextView[1]);
                            ActionBar.this.titleTextView[1] = null;
                            ActionBar actionBar2 = ActionBar.this;
                            actionBar2.overlayTitleAnimationInProgress = false;
                            actionBar2.setTitleOverlayText((String) actionBar2.overlayTitleToSet[0], ((Integer) ActionBar.this.overlayTitleToSet[1]).intValue(), (Runnable) ActionBar.this.overlayTitleToSet[2]);
                        }
                    }).start();
                }
            }
            if (runnable == null) {
                runnable = this.lastRunnable;
            }
            this.titleActionRunnable = runnable;
        }
    }

    public boolean isSearchFieldVisible() {
        return this.isSearchFieldVisible;
    }

    public void setOccupyStatusBar(boolean z) {
        this.occupyStatusBar = z;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setPadding(0, z ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
    }

    public boolean getOccupyStatusBar() {
        return this.occupyStatusBar;
    }

    public void setItemsBackgroundColor(int i, boolean z) {
        ImageView imageView;
        if (z) {
            this.itemsActionModeBackgroundColor = i;
            if (this.actionModeVisible && (imageView = this.backButtonImageView) != null) {
                imageView.setBackgroundDrawable(Theme.createSelectorDrawable(i));
            }
            ActionBarMenu actionBarMenu = this.actionMode;
            if (actionBarMenu != null) {
                actionBarMenu.updateItemsBackgroundColor();
                return;
            }
            return;
        }
        this.itemsBackgroundColor = i;
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null) {
            imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(i));
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.updateItemsBackgroundColor();
        }
    }

    public void setItemsColor(int i, boolean z) {
        if (z) {
            this.itemsActionModeColor = i;
            ActionBarMenu actionBarMenu = this.actionMode;
            if (actionBarMenu != null) {
                actionBarMenu.updateItemsColor();
            }
            ImageView imageView = this.backButtonImageView;
            if (imageView != null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable instanceof BackDrawable) {
                    ((BackDrawable) drawable).setRotatedColor(i);
                    return;
                } else {
                    if ((drawable instanceof BitmapDrawable) || (drawable instanceof VectorDrawable)) {
                        this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.itemsColor = i;
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null && i != 0) {
            Drawable drawable2 = imageView2.getDrawable();
            if (drawable2 instanceof BackDrawable) {
                ((BackDrawable) drawable2).setColor(i);
            } else if (drawable2 instanceof MenuDrawable) {
                ((MenuDrawable) drawable2).setIconColor(i);
            } else if ((drawable2 instanceof BitmapDrawable) || (drawable2 instanceof VectorDrawable)) {
                this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.updateItemsColor();
        }
    }

    public void setCastShadows(boolean z) {
        if (this.castShadows != z && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.castShadows = z;
    }

    public void setShadowAlpha(int i) {
        if (this.shadowAlpha == i) {
            return;
        }
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
            invalidate();
        }
        this.shadowAlpha = i;
    }

    public int getShadowAlpha() {
        return this.shadowAlpha;
    }

    public boolean getCastShadows() {
        return this.castShadows;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.forceSkipTouches) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || this.interceptTouches;
    }

    public static int getCurrentActionBarHeight() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(56.0f);
    }

    public void setTitleAnimated(CharSequence charSequence, boolean z, long j) {
        setTitleAnimated(charSequence, z, j, null);
    }

    public void setTitleAnimated(CharSequence charSequence, final boolean z, long j, Interpolator interpolator) {
        if (this.titleTextView[0] == null || charSequence == null) {
            setTitle(charSequence);
            return;
        }
        final boolean z2 = this.overlayTitleAnimation && !TextUtils.isEmpty(this.subtitle);
        if (z2) {
            if (this.subtitleTextView.getVisibility() != 0) {
                this.subtitleTextView.setVisibility(0);
                this.subtitleTextView.setAlpha(0.0f);
            }
            this.subtitleTextView.animate().alpha(z ? 0.0f : 1.0f).setDuration(220L).start();
        }
        SimpleTextView simpleTextView = this.titleTextView[1];
        if (simpleTextView != null) {
            if (simpleTextView.getParent() != null) {
                ((ViewGroup) this.titleTextView[1].getParent()).removeView(this.titleTextView[1]);
            }
            this.titleTextView[1] = null;
        }
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        simpleTextViewArr[1] = simpleTextViewArr[0];
        simpleTextViewArr[0] = null;
        setTitle(charSequence);
        this.fromBottom = z;
        this.titleTextView[0].setAlpha(0.0f);
        if (!z2) {
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            int iDp = AndroidUtilities.dp(20.0f);
            if (!z) {
                iDp = -iDp;
            }
            simpleTextView2.setTranslationY(iDp);
        }
        ViewPropertyAnimator duration = this.titleTextView[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.titleAnimationRunning = true;
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.titleTextView[1].animate().alpha(0.0f);
        if (!z2) {
            viewPropertyAnimatorAlpha.translationY(z ? -AndroidUtilities.dp(20.0f) : AndroidUtilities.dp(20.0f));
        }
        if (interpolator != null) {
            viewPropertyAnimatorAlpha.setInterpolator(interpolator);
        }
        viewPropertyAnimatorAlpha.setDuration(j).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ActionBar.this.titleTextView[1] != null && ActionBar.this.titleTextView[1].getParent() != null) {
                    ((ViewGroup) ActionBar.this.titleTextView[1].getParent()).removeView(ActionBar.this.titleTextView[1]);
                }
                ActionBar.this.titleTextView[1] = null;
                ActionBar.this.titleAnimationRunning = false;
                if (z2 && z) {
                    ActionBar.this.subtitleTextView.setVisibility(8);
                }
                ActionBar.this.requestLayout();
            }
        }).start();
        requestLayout();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        updateAttachState();
        if (this.actionModeVisible) {
            int i = this.actionModeColor;
            if (i == 0) {
                i = this.actionBarColor;
            }
            if (i == 0 || this.glassMode) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.lastRightDrawable;
        if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        updateAttachState();
        if (this.actionModeVisible) {
            int i = this.actionBarColor;
            if (i == 0 || this.actionModeColor == 0 || this.glassMode) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), false);
            } else {
                AndroidUtilities.setLightStatusBar((Activity) getContext(), true);
            }
        }
        Drawable drawable = this.lastRightDrawable;
        if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
            ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(null);
        }
    }

    private void updateAttachState() {
        boolean z = this.attached && this.resumed;
        if (this.attachState != z) {
            this.attachState = z;
            if (z) {
                this.ellipsizeSpanAnimator.onAttachedToWindow();
            } else {
                this.ellipsizeSpanAnimator.onDetachedFromWindow();
            }
        }
    }

    public ActionBarMenu getActionMode() {
        return this.actionMode;
    }

    public void setOverlayTitleAnimation(boolean z) {
        this.overlayTitleAnimation = z;
    }

    public void beginDelayedTransition() {
        if (LocaleController.isRTL) {
            return;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        transitionSet.addTransition(new Fade());
        transitionSet.addTransition(new ChangeBounds() {
            @Override
            public void captureStartValues(TransitionValues transitionValues) {
                super.captureStartValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof SimpleTextView) {
                    transitionValues.values.put("text_size", Float.valueOf(((SimpleTextView) view).getTextPaint().getTextSize()));
                }
            }

            @Override
            public void captureEndValues(TransitionValues transitionValues) {
                super.captureEndValues(transitionValues);
                View view = transitionValues.view;
                if (view instanceof SimpleTextView) {
                    transitionValues.values.put("text_size", Float.valueOf(((SimpleTextView) view).getTextPaint().getTextSize()));
                }
            }

            @Override
            public Animator createAnimator(ViewGroup viewGroup, final TransitionValues transitionValues, TransitionValues transitionValues2) {
                if (transitionValues != null && (transitionValues.view instanceof SimpleTextView)) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (transitionValues2 != null) {
                        Animator animatorCreateAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                        float fFloatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                        transitionValues.view.setScaleX(fFloatValue);
                        transitionValues.view.setScaleY(fFloatValue);
                        if (animatorCreateAnimator != null) {
                            animatorSet.playTogether(animatorCreateAnimator);
                        }
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_X, 1.0f));
                    animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, (Property<View, Float>) View.SCALE_Y, 1.0f));
                    animatorSet.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationStart(Animator animator) {
                            super.onAnimationStart(animator);
                            transitionValues.view.setLayerType(2, null);
                        }

                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            transitionValues.view.setLayerType(0, null);
                        }
                    });
                    return animatorSet;
                }
                return super.createAnimator(viewGroup, transitionValues, transitionValues2);
            }
        });
        this.centerScale = false;
        transitionSet.setDuration(220L);
        transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.DEFAULT);
        TransitionManager.beginDelayedTransition(this, transitionSet);
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void setDrawBlurBackground(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.blurredBackground = true;
        this.contentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.blurBehindViews.add(this);
        setBackground(null);
    }

    public void setSkipDrawChild(boolean z) {
        if (this.doNotDrawChild != z) {
            this.doNotDrawChild = z;
            invalidate();
        }
    }

    public void setSearchFactor(float f) {
        if (this.searchFactor != f) {
            this.searchFactor = f;
            invalidate();
        }
    }

    public void checkAvatarContainerWidth(boolean z) {
        ChatAvatarContainer chatAvatarContainer = this.chatAvatarContainer;
        if (chatAvatarContainer == null) {
            return;
        }
        boolean zHasVisibleAvatar = chatAvatarContainer.hasVisibleAvatar();
        int visualWidth = this.chatAvatarContainer.getVisualWidth();
        if (zHasVisibleAvatar) {
            visualWidth = Math.max(visualWidth, AndroidUtilities.dp(192.0f));
        }
        int iMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(116.0f), visualWidth);
        if (z) {
            float f = iMin;
            if (this.animatorAvatarContainerWidth.getToFactor() != f) {
                this.animatorAvatarContainerWidth.animateTo(f);
            }
        } else {
            this.animatorAvatarContainerWidth.forceFactor(iMin);
        }
        this.animatorAvatarContainerHasAvatar.setValue(zHasVisibleAvatar, z);
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        invalidate();
    }

    public void setForcedMenuWidth(int i) {
        this.hasForcedMenuWidth = true;
        if (this.forcedMenuWidth != i) {
            this.forcedMenuWidth = i;
            invalidate();
        }
    }

    public void checkMenuItemsWidth() {
        ActionBarMenu actionBarMenu = this.menu;
        int iMax = Math.max(0, actionBarMenu != null ? (actionBarMenu.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        ActionBarMenu actionBarMenu2 = this.actionMode;
        int iMax2 = Math.max(0, actionBarMenu2 != null ? (actionBarMenu2.getItemsWidth() - AndroidUtilities.dp(1.0f)) - AndroidUtilities.dp(1.0f) : 0);
        AndroidUtilities.dp(46.0f);
        if (this.actionModeVisible) {
            iMax = iMax2;
        }
        this.animatorHasMenuItems.setValue(iMax > 0, this.isAnimationsAllowed);
        float f = iMax;
        if (this.animatorMenuItemsWidth.getToFactor() != f) {
            if (this.isAnimationsAllowed) {
                this.animatorMenuItemsWidth.animateTo(f);
            } else {
                this.animatorMenuItemsWidth.forceFactor(f);
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        int iDp = AndroidUtilities.dp(6.0f);
        int iDp2 = AndroidUtilities.dp(46.0f);
        float actionModeFactor = getActionModeFactor();
        int factor = this.hasForcedMenuWidth ? this.forcedMenuWidth : (int) this.animatorMenuItemsWidth.getFactor();
        ImageView imageView = this.backButtonImageView;
        boolean z = imageView != null && imageView.getVisibility() == 0;
        int height = (getHeight() - ((getCurrentActionBarHeight() + iDp2) / 2)) - iDp;
        int i = iDp * 2;
        int i2 = height + iDp2 + i;
        if (this.glassDrawable != null && !this.glassOnlyBack) {
            int floatValue = (this.hasForcedMenuWidth ? factor > 0 ? iDp : 0 : (int) (iDp * this.animatorHasMenuItems.getFloatValue())) + factor;
            int i3 = iDp + iDp2;
            int iLerp = AndroidUtilities.lerp(floatValue, Math.max(floatValue, i3), this.chatAvatarContainer == null ? 0.0f : 1.0f - this.animatorAvatarContainerHasAvatar.getFloatValue());
            int iLerp2 = AndroidUtilities.lerp(z ? i3 : 0, i3, this.chatAvatarContainer == null ? 0.0f : 1.0f - this.animatorAvatarContainerHasAvatar.getFloatValue());
            int width = getWidth() - iLerp;
            int i4 = width - iLerp2;
            if (this.chatAvatarContainer != null) {
                int iLerp3 = AndroidUtilities.lerp(Math.min(i4, ((int) this.animatorAvatarContainerWidth.getFactor()) + i), i4, Math.max(this.searchFactor, actionModeFactor));
                iLerp2 = ((width + iLerp2) - iLerp3) / 2;
                width = iLerp2 + iLerp3;
                this.chatAvatarContainer.setTranslationX(((iLerp2 - ((ViewGroup.MarginLayoutParams) r3.getLayoutParams()).leftMargin) - this.chatAvatarContainer.getLeftPadding()) + iDp + AndroidUtilities.dp(3.0f));
            }
            this.glassDrawable.setBounds(iLerp2, height, width, i2);
            this.glassDrawable.draw(canvas);
        }
        Drawable drawable = this.glassDrawableBack;
        if (drawable != null && z) {
            drawable.setBounds(0, height, iDp2 + i, i2);
            this.glassDrawableBack.draw(canvas);
        }
        Drawable drawable2 = this.glassDrawableMenu;
        if (drawable2 != null && factor > 0 && !this.glassOnlyBack) {
            drawable2.setBounds((getWidth() - Math.max(iDp2, factor)) - i, height, getWidth(), i2);
            this.glassDrawableMenu.setAlpha(this.hasForcedMenuWidth ? 255 : (int) (this.animatorHasMenuItems.getFloatValue() * 255.0f));
            this.glassDrawableMenu.draw(canvas);
        }
        if (this.blurredBackground && this.actionBarColor != 0) {
            this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurScrimPaint.setColor(this.actionBarColor);
            if (this.adaptiveBackground) {
                this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true, 1.0f - this.onTopAnimated);
            } else {
                this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true);
            }
        }
        this.isAnimationsAllowed = true;
        if (this.doNotDrawChild) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public void setForceSkipTouches(boolean z) {
        this.forceSkipTouches = z;
    }

    public void setDrawBackButton(boolean z) {
        this.drawBackButton = z;
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            imageView.invalidate();
        }
    }

    public void setUseContainerForTitles() {
        this.useContainerForTitles = true;
        if (this.titlesContainer == null) {
            FrameLayout frameLayout = new FrameLayout(getContext()) {
                @Override
                protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                }
            };
            this.titlesContainer = frameLayout;
            addView(frameLayout);
        }
    }

    public FrameLayout getTitlesContainer() {
        return this.titlesContainer;
    }

    @Override
    public void updateColors() {
        adaptive_updateColor();
        ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = this.additionalSubTitleOverlayContainer;
        if (actionBarAnimatedSubtitleOverlayContainer != null) {
            actionBarAnimatedSubtitleOverlayContainer.updateColors();
        }
    }

    public FrameLayout createAdditionalSubTitleOverlayContainer() {
        if (this.additionalSubTitleOverlayContainer == null) {
            ActionBarAnimatedSubtitleOverlayContainer actionBarAnimatedSubtitleOverlayContainer = new ActionBarAnimatedSubtitleOverlayContainer(getContext(), this.resourcesProvider, this.ellipsizeSpanAnimator) {
                @Override
                public void onItemChanged(ReplaceAnimator replaceAnimator) {
                    super.onItemChanged(replaceAnimator);
                    float totalVisibility = getTotalVisibility();
                    if (ActionBar.this.titlesContainer != null) {
                        ActionBar.this.titlesContainer.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    }
                }
            };
            this.additionalSubTitleOverlayContainer = actionBarAnimatedSubtitleOverlayContainer;
            actionBarAnimatedSubtitleOverlayContainer.setClipChildren(false);
            addView(this.additionalSubTitleOverlayContainer);
        }
        return this.additionalSubTitleOverlayContainer;
    }

    public FrameLayout getAdditionalSubTitleOverlayContainer() {
        return this.additionalSubTitleOverlayContainer;
    }

    public void setAdaptiveBackground(RecyclerView recyclerView) {
        setAdaptiveBackground(recyclerView, false, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
    }

    public void setAdaptiveBackground(RecyclerView recyclerView, boolean z) {
        setAdaptiveBackground(recyclerView, z, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
    }

    public void setAdaptiveBackground(final RecyclerView recyclerView, boolean z, int i, int i2) {
        this.adaptive_topColorKey = i;
        this.adaptive_lowerColorKey = i2;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setAdaptiveBackground$6(recyclerView);
            }
        };
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView2, int i3, int i4) {
                runnable.run();
            }
        });
        this.adaptiveBackgroundHideTitle = z;
        if (this.adaptiveBackground) {
            runnable.run();
            return;
        }
        this.adaptiveBackground = true;
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        this.onTop = !zCanScrollVertically;
        this.onTopAnimated = !zCanScrollVertically ? 1.0f : 0.0f;
        adaptive_updateColor();
    }

    public void lambda$setAdaptiveBackground$6(RecyclerView recyclerView) {
        boolean zCanScrollVertically = recyclerView.canScrollVertically(-1);
        final boolean z = !zCanScrollVertically;
        if (this.onTop == z) {
            return;
        }
        ValueAnimator valueAnimator = this.adaptive_animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.onTopAnimated;
        this.onTop = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, !zCanScrollVertically ? 1.0f : 0.0f);
        this.adaptive_animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$setAdaptiveBackground$5(valueAnimator2);
            }
        });
        this.adaptive_animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ActionBar.this.onTopAnimated = z ? 1.0f : 0.0f;
                ActionBar.this.adaptive_updateColor();
            }
        });
        this.adaptive_animator.setDuration(320L);
        this.adaptive_animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.adaptive_animator.start();
    }

    public void lambda$setAdaptiveBackground$5(ValueAnimator valueAnimator) {
        this.onTopAnimated = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        adaptive_updateColor();
    }

    public void setAdaptiveBackground(SectionsScrollView sectionsScrollView) {
        setAdaptiveBackground(sectionsScrollView, Theme.key_windowBackgroundGray, Theme.key_actionBarDefault);
    }

    public void setAdaptiveBackground(final SectionsScrollView sectionsScrollView, int i, int i2) {
        this.adaptive_topColorKey = i;
        this.adaptive_lowerColorKey = i2;
        adaptive_updateColor();
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setAdaptiveBackground$8(sectionsScrollView);
            }
        };
        sectionsScrollView.onScroll(runnable);
        if (this.adaptiveBackground) {
            runnable.run();
            return;
        }
        this.adaptiveBackground = true;
        boolean zCanScrollVertically = sectionsScrollView.canScrollVertically(-1);
        this.onTop = !zCanScrollVertically;
        this.onTopAnimated = !zCanScrollVertically ? 1.0f : 0.0f;
        adaptive_updateColor();
    }

    public void lambda$setAdaptiveBackground$8(SectionsScrollView sectionsScrollView) {
        boolean zCanScrollVertically = sectionsScrollView.canScrollVertically(-1);
        final boolean z = !zCanScrollVertically;
        if (this.onTop == z) {
            return;
        }
        ValueAnimator valueAnimator = this.adaptive_animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f = this.onTopAnimated;
        this.onTop = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, !zCanScrollVertically ? 1.0f : 0.0f);
        this.adaptive_animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$setAdaptiveBackground$7(valueAnimator2);
            }
        });
        this.adaptive_animator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                ActionBar.this.onTopAnimated = z ? 1.0f : 0.0f;
                ActionBar.this.adaptive_updateColor();
            }
        });
        this.adaptive_animator.setDuration(320L);
        this.adaptive_animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.adaptive_animator.start();
    }

    public void lambda$setAdaptiveBackground$7(ValueAnimator valueAnimator) {
        this.onTopAnimated = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        adaptive_updateColor();
    }

    public void adaptive_updateColor() {
        if (this.adaptiveBackground) {
            if (this.adaptiveBackgroundHideTitle) {
                FrameLayout frameLayout = this.titlesContainer;
                if (frameLayout != null) {
                    frameLayout.setAlpha(1.0f - this.onTopAnimated);
                } else {
                    SimpleTextView simpleTextView = this.titleTextView[0];
                    if (simpleTextView != null) {
                        simpleTextView.setAlpha(1.0f - this.onTopAnimated);
                    }
                }
            }
            float f = this.onTopAnimated;
            int i = this.adaptive_lowerColorKey;
            int color = i == -1 ? 0 : Theme.getColor(i, this.resourcesProvider);
            int i2 = this.adaptive_topColorKey;
            int color2 = i2 == -1 ? 0 : Theme.getColor(i2, this.resourcesProvider);
            if (color2 == 0) {
                color2 = ColorUtils.setAlphaComponent(color, 0);
            }
            if (color == 0) {
                color = ColorUtils.setAlphaComponent(color2, 0);
            }
            setBackgroundColor(ColorUtils.blendARGB(color, color2, f));
            setShadowAlpha((int) ((1.0f - this.onTopAnimated) * 255.0f));
            if (this.blurredBackground) {
                invalidate();
            }
        }
    }
}

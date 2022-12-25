package org.telegram.p009ui.ActionBar;

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
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.INavigationLayout;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Adapters.FiltersView;
import org.telegram.p009ui.Components.AnimatedEmojiDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EllipsizeSpanAnimator;
import org.telegram.p009ui.Components.FireworksEffect;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.SizeNotifierFrameLayout;
import org.telegram.p009ui.Components.SnowflakesEffect;

public class C1133ActionBar extends FrameLayout {
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
    private boolean actionModeVisible;
    private boolean addToContainer;
    private SimpleTextView additionalSubtitleTextView;
    private boolean allowOverlayTitle;
    private BackupImageView avatarSearchImageView;
    private Drawable backButtonDrawable;
    private ImageView backButtonImageView;
    private INavigationLayout.BackButtonState backButtonState;
    Runnable backgroundUpdateListener;
    public Paint blurScrimPaint;
    boolean blurredBackground;
    private boolean castShadows;
    private boolean centerScale;
    private boolean clipContent;
    private PorterDuff.Mode colorFilterMode;
    SizeNotifierFrameLayout contentView;
    private boolean drawBackButton;
    EllipsizeSpanAnimator ellipsizeSpanAnimator;
    private int extraHeight;
    private FireworksEffect fireworksEffect;
    private Paint.FontMetricsInt fontMetricsInt;
    private boolean forceSkipTouches;
    private boolean fromBottom;
    private boolean ignoreLayoutRequest;
    private View.OnTouchListener interceptTouchEventListener;
    private boolean interceptTouches;
    private boolean isMenuOffsetSuppressed;
    protected boolean isSearchFieldVisible;
    protected int itemsActionModeBackgroundColor;
    protected int itemsActionModeColor;
    protected int itemsBackgroundColor;
    protected int itemsColor;
    private CharSequence lastOverlayTitle;
    private Drawable lastRightDrawable;
    private Runnable lastRunnable;
    private CharSequence lastTitle;
    private boolean manualStart;
    public ActionBarMenu menu;
    private boolean occupyStatusBar;
    private boolean overlayTitleAnimation;
    boolean overlayTitleAnimationInProgress;
    private Object[] overlayTitleToSet;
    protected BaseFragment parentFragment;
    private Rect rect;
    Rect rectTmp;
    private final Theme.ResourcesProvider resourcesProvider;
    private View.OnClickListener rightDrawableOnClickListener;
    public float searchFieldVisibleAlpha;
    AnimatorSet searchVisibleAnimator;
    private SnowflakesEffect snowflakesEffect;
    private CharSequence subtitle;
    private SimpleTextView subtitleTextView;
    private boolean supportsHolidayImage;
    private Runnable titleActionRunnable;
    private boolean titleAnimationRunning;
    private int titleColorToSet;
    private boolean titleOverlayShown;
    private int titleRightMargin;
    private SimpleTextView[] titleTextView;

    public static class ActionBarMenuOnItemClick {
        public boolean canOpenMenu() {
            return true;
        }

        public void onItemClick(int i) {
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        return false;
    }

    protected boolean onSearchChangedIgnoreTitles() {
        return false;
    }

    public C1133ActionBar(Context context) {
        this(context, null);
    }

    public C1133ActionBar(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.backButtonState = INavigationLayout.BackButtonState.BACK;
        this.titleTextView = new SimpleTextView[2];
        this.occupyStatusBar = Build.VERSION.SDK_INT >= 21;
        this.addToContainer = true;
        this.interceptTouches = true;
        this.overlayTitleToSet = new Object[3];
        this.castShadows = true;
        this.titleColorToSet = 0;
        this.colorFilterMode = PorterDuff.Mode.MULTIPLY;
        this.blurScrimPaint = new Paint();
        this.rectTmp = new Rect();
        this.ellipsizeSpanAnimator = new EllipsizeSpanAnimator(this);
        this.resourcesProvider = resourcesProvider;
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C1133ActionBar.this.lambda$new$0(view);
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

    public void setColorFilterMode(PorterDuff.Mode mode) {
        this.colorFilterMode = mode;
    }

    public INavigationLayout.BackButtonState getBackButtonState() {
        Drawable drawable = this.backButtonDrawable;
        if (drawable instanceof INavigationLayout.IBackButtonDrawable) {
            return ((INavigationLayout.IBackButtonDrawable) drawable).getBackButtonState();
        }
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
        if (this.itemsColor != 0) {
            this.backButtonImageView.setColorFilter(new PorterDuffColorFilter(this.itemsColor, this.colorFilterMode));
        }
        this.backButtonImageView.setPadding(AndroidUtilities.m35dp(1.0f), 0, 0, 0);
        addView(this.backButtonImageView, LayoutHelper.createFrame(54, 54, 51));
        this.backButtonImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                C1133ActionBar.this.lambda$createBackButtonImage$1(view);
            }
        });
        this.backButtonImageView.setContentDescription(LocaleController.getString("AccDescrGoBack", C1072R.string.AccDescrGoBack));
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

    public boolean shouldClipChild(View view) {
        if (this.clipContent) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if (view == simpleTextViewArr[0] || view == simpleTextViewArr[1] || view == this.subtitleTextView || view == this.menu || view == this.backButtonImageView || view == this.additionalSubtitleTextView) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        Drawable currentHolidayDrawable;
        BaseFragment baseFragment = this.parentFragment;
        if (baseFragment == null || baseFragment.getParentLayout() == null || !this.parentFragment.getParentLayout().isActionBarInCrossfade()) {
            if (this.drawBackButton && view == this.backButtonImageView) {
                return true;
            }
            boolean shouldClipChild = shouldClipChild(view);
            if (shouldClipChild) {
                canvas.save();
                canvas.clipRect(0.0f, (-getTranslationY()) + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0), getMeasuredWidth(), getMeasuredHeight());
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            if (this.supportsHolidayImage && !this.titleOverlayShown && !LocaleController.isRTL) {
                SimpleTextView[] simpleTextViewArr = this.titleTextView;
                if ((view == simpleTextViewArr[0] || view == simpleTextViewArr[1]) && (currentHolidayDrawable = Theme.getCurrentHolidayDrawable()) != null) {
                    SimpleTextView simpleTextView = (SimpleTextView) view;
                    if (simpleTextView.getVisibility() == 0 && (simpleTextView.getText() instanceof String)) {
                        TextPaint textPaint = simpleTextView.getTextPaint();
                        textPaint.getFontMetricsInt(this.fontMetricsInt);
                        textPaint.getTextBounds((String) simpleTextView.getText(), 0, 1, this.rect);
                        int textStartX = simpleTextView.getTextStartX() + Theme.getCurrentHolidayDrawableXOffset() + ((this.rect.width() - (currentHolidayDrawable.getIntrinsicWidth() + Theme.getCurrentHolidayDrawableXOffset())) / 2);
                        int textStartY = simpleTextView.getTextStartY() + Theme.getCurrentHolidayDrawableYOffset() + ((int) Math.ceil((simpleTextView.getTextHeight() - this.rect.height()) / 2.0f));
                        currentHolidayDrawable.setBounds(textStartX, textStartY - currentHolidayDrawable.getIntrinsicHeight(), currentHolidayDrawable.getIntrinsicWidth() + textStartX, textStartY);
                        currentHolidayDrawable.setAlpha((int) (simpleTextView.getAlpha() * 255.0f));
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
            if (shouldClipChild) {
                canvas.restore();
            }
            return drawChild;
        }
        return false;
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
    }

    private void createSubtitleTextView() {
        if (this.subtitleTextView != null) {
            return;
        }
        SimpleTextView simpleTextView = new SimpleTextView(getContext());
        this.subtitleTextView = simpleTextView;
        simpleTextView.setGravity(3);
        this.subtitleTextView.setVisibility(8);
        this.subtitleTextView.setTextColor(getThemedColor("actionBarDefaultSubtitle"));
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
        this.additionalSubtitleTextView.setTextColor(getThemedColor("actionBarDefaultSubtitle"));
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
            boolean isEmpty = TextUtils.isEmpty(charSequence);
            this.subtitleTextView.setVisibility((isEmpty || this.isSearchFieldVisible) ? 8 : 0);
            this.subtitleTextView.setAlpha(1.0f);
            if (!isEmpty) {
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
        simpleTextViewArr[i] = new SimpleTextView(this, getContext()) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
            }
        };
        this.titleTextView[i].setGravity(19);
        int i2 = this.titleColorToSet;
        if (i2 != 0) {
            this.titleTextView[i].setTextColor(i2);
        } else {
            this.titleTextView[i].setTextColor(getThemedColor("actionBarDefaultTitle"));
        }
        this.titleTextView[i].setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.titleTextView[i].setDrawablePadding(AndroidUtilities.m35dp(4.0f));
        this.titleTextView[i].setPadding(0, AndroidUtilities.m35dp(8.0f), 0, AndroidUtilities.m35dp(8.0f));
        this.titleTextView[i].setRightDrawableTopPadding(-AndroidUtilities.m35dp(1.0f));
        addView(this.titleTextView[i], 0, LayoutHelper.createFrame(-2, -2, 51));
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
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[0] != null) {
            simpleTextViewArr[0].setVisibility((charSequence == null || this.isSearchFieldVisible) ? 4 : 0);
            SimpleTextView simpleTextView = this.titleTextView[0];
            this.lastTitle = charSequence;
            simpleTextView.setText(charSequence);
            SimpleTextView simpleTextView2 = this.titleTextView[0];
            this.lastRightDrawable = drawable;
            simpleTextView2.setRightDrawable(drawable);
            this.titleTextView[0].setRightDrawableOnClick(this.rightDrawableOnClickListener);
            if (drawable instanceof AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) {
                ((AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable) drawable).setParentView(this.titleTextView[0]);
            }
        }
        this.fromBottom = false;
    }

    public void setRightDrawableOnClick(View.OnClickListener onClickListener) {
        this.rightDrawableOnClickListener = onClickListener;
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[0] != null) {
            simpleTextViewArr[0].setRightDrawableOnClick(onClickListener);
        }
        SimpleTextView[] simpleTextViewArr2 = this.titleTextView;
        if (simpleTextViewArr2[1] != null) {
            simpleTextViewArr2[1].setRightDrawableOnClick(this.rightDrawableOnClickListener);
        }
    }

    public void setTitleColor(int i) {
        if (this.titleTextView[0] == null) {
            createTitleTextView(0);
        }
        this.titleColorToSet = i;
        this.titleTextView[0].setTextColor(i);
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[1] != null) {
            simpleTextViewArr[1].setTextColor(i);
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
        } else if (z2 || (actionBarMenu = this.menu) == null) {
        } else {
            actionBarMenu.setPopupItemsColor(i, z);
        }
    }

    public void setPopupItemsSelectorColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.setPopupItemsSelectorColor(i);
        } else if (z || (actionBarMenu = this.menu) == null) {
        } else {
            actionBarMenu.setPopupItemsSelectorColor(i);
        }
    }

    public void setPopupBackgroundColor(int i, boolean z) {
        ActionBarMenu actionBarMenu;
        ActionBarMenu actionBarMenu2;
        if (z && (actionBarMenu2 = this.actionMode) != null) {
            actionBarMenu2.redrawPopup(i);
        } else if (z || (actionBarMenu = this.menu) == null) {
        } else {
            actionBarMenu.redrawPopup(i);
        }
    }

    public SimpleTextView getSubtitleTextView() {
        return this.subtitleTextView;
    }

    public SimpleTextView getTitleTextView() {
        return this.titleTextView[0];
    }

    public SimpleTextView getTitleTextView2() {
        return this.titleTextView[1];
    }

    public String getTitle() {
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[0] == null) {
            return null;
        }
        return simpleTextViewArr[0].getText().toString();
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
        if (this.actionMode != null) {
            String str2 = this.actionModeTag;
            if (str2 == null && str == null) {
                return true;
            }
            return str2 != null && str2.equals(str);
        }
        return false;
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
                C1133ActionBar.this.actionModeColor = i;
                C1133ActionBar c1133ActionBar = C1133ActionBar.this;
                if (c1133ActionBar.blurredBackground) {
                    return;
                }
                super.setBackgroundColor(c1133ActionBar.actionModeColor);
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                C1133ActionBar c1133ActionBar = C1133ActionBar.this;
                if (c1133ActionBar.blurredBackground && this.drawBlur) {
                    c1133ActionBar.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    C1133ActionBar c1133ActionBar2 = C1133ActionBar.this;
                    c1133ActionBar2.blurScrimPaint.setColor(c1133ActionBar2.actionModeColor);
                    C1133ActionBar c1133ActionBar3 = C1133ActionBar.this;
                    c1133ActionBar3.contentView.drawBlurRect(canvas, 0.0f, c1133ActionBar3.rectTmp, c1133ActionBar3.blurScrimPaint, true);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = C1133ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.add(this);
                }
            }

            @Override
            protected void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                SizeNotifierFrameLayout sizeNotifierFrameLayout = C1133ActionBar.this.contentView;
                if (sizeNotifierFrameLayout != null) {
                    sizeNotifierFrameLayout.blurBehindViews.remove(this);
                }
            }
        };
        this.actionMode = actionBarMenu2;
        actionBarMenu2.isActionMode = true;
        actionBarMenu2.setClickable(true);
        this.actionMode.setBackgroundColor(getThemedColor("actionBarActionModeDefault"));
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

    public void onDrawCrossfadeBackground(Canvas canvas) {
        if (this.blurredBackground && this.actionBarColor != 0) {
            this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurScrimPaint.setColor(this.actionBarColor);
            this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true);
            return;
        }
        Drawable background = getBackground();
        if (background != null) {
            background.setBounds(0, 0, getWidth(), getHeight());
            background.draw(canvas);
        }
    }

    public void onDrawCrossfadeContent(Canvas canvas, boolean z, boolean z2, float f) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((!z2 || childAt != this.backButtonImageView) && childAt.getVisibility() == 0 && (childAt instanceof ActionBarMenu)) {
                canvas.save();
                canvas.translate(childAt.getX(), childAt.getY());
                childAt.draw(canvas);
                canvas.restore();
            }
        }
        canvas.save();
        canvas.translate(z ? getWidth() * f * 0.5f : (-getWidth()) * 0.4f * (1.0f - f), 0.0f);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            if ((!z2 || childAt2 != this.backButtonImageView) && childAt2.getVisibility() == 0 && !(childAt2 instanceof ActionBarMenu)) {
                canvas.save();
                canvas.translate(childAt2.getX(), childAt2.getY());
                childAt2.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public void showActionMode() {
        showActionMode(true, null, null, null, null, null, 0);
    }

    public void showActionMode(boolean z) {
        showActionMode(z, null, null, null, null, null, 0);
    }

    public void showActionMode(boolean z, View view, View view2, View[] viewArr, final boolean[] zArr, View view3, int i) {
        View view4;
        View view5;
        View view6;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu == null || this.actionModeVisible) {
            return;
        }
        this.actionModeVisible = true;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.actionMode, View.ALPHA, 0.0f, 1.0f));
            if (viewArr != null) {
                for (int i2 = 0; i2 < viewArr.length; i2++) {
                    if (viewArr[i2] != null) {
                        arrayList.add(ObjectAnimator.ofFloat(viewArr[i2], View.ALPHA, 1.0f, 0.0f));
                    }
                }
            }
            if (view2 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view2, View.ALPHA, 0.0f, 1.0f));
            }
            if (view3 != null) {
                arrayList.add(ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, i));
                this.actionModeTranslationView = view3;
            }
            this.actionModeExtraView = view;
            this.actionModeShowingView = view2;
            this.actionModeHidingViews = viewArr;
            if (this.occupyStatusBar && (view6 = this.actionModeTop) != null && !SharedConfig.noStatusBar) {
                arrayList.add(ObjectAnimator.ofFloat(view6, View.ALPHA, 0.0f, 1.0f));
            }
            if (SharedConfig.noStatusBar) {
                if (ColorUtils.calculateLuminance(this.actionModeColor) < 0.699999988079071d) {
                    AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
                } else {
                    AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
                }
            }
            AnimatorSet animatorSet = this.actionModeAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionModeAnimation = animatorSet2;
            animatorSet2.playTogether(arrayList);
            if (this.backgroundUpdateListener != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        C1133ActionBar.this.lambda$showActionMode$2(valueAnimator);
                    }
                });
                this.actionModeAnimation.playTogether(ofFloat);
            }
            this.actionModeAnimation.setDuration(200L);
            this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    C1133ActionBar.this.actionMode.setVisibility(0);
                    if (!C1133ActionBar.this.occupyStatusBar || C1133ActionBar.this.actionModeTop == null || SharedConfig.noStatusBar) {
                        return;
                    }
                    C1133ActionBar.this.actionModeTop.setVisibility(0);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    boolean[] zArr2;
                    if (C1133ActionBar.this.actionModeAnimation == null || !C1133ActionBar.this.actionModeAnimation.equals(animator)) {
                        return;
                    }
                    C1133ActionBar.this.actionModeAnimation = null;
                    if (C1133ActionBar.this.titleTextView[0] != null) {
                        C1133ActionBar.this.titleTextView[0].setVisibility(4);
                    }
                    if (C1133ActionBar.this.subtitleTextView != null && !TextUtils.isEmpty(C1133ActionBar.this.subtitle)) {
                        C1133ActionBar.this.subtitleTextView.setVisibility(4);
                    }
                    ActionBarMenu actionBarMenu2 = C1133ActionBar.this.menu;
                    if (actionBarMenu2 != null) {
                        actionBarMenu2.setVisibility(4);
                    }
                    if (C1133ActionBar.this.actionModeHidingViews != null) {
                        for (int i3 = 0; i3 < C1133ActionBar.this.actionModeHidingViews.length; i3++) {
                            if (C1133ActionBar.this.actionModeHidingViews[i3] != null && ((zArr2 = zArr) == null || i3 >= zArr2.length || zArr2[i3])) {
                                C1133ActionBar.this.actionModeHidingViews[i3].setVisibility(4);
                            }
                        }
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (C1133ActionBar.this.actionModeAnimation == null || !C1133ActionBar.this.actionModeAnimation.equals(animator)) {
                        return;
                    }
                    C1133ActionBar.this.actionModeAnimation = null;
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
        actionBarMenu.setAlpha(1.0f);
        if (viewArr != null) {
            for (int i3 = 0; i3 < viewArr.length; i3++) {
                if (viewArr[i3] != null) {
                    viewArr[i3].setAlpha(0.0f);
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
        this.actionModeShowingView = view2;
        this.actionModeHidingViews = viewArr;
        if (this.occupyStatusBar && (view5 = this.actionModeTop) != null && !SharedConfig.noStatusBar) {
            view5.setAlpha(1.0f);
        }
        if (SharedConfig.noStatusBar) {
            if (ColorUtils.calculateLuminance(this.actionModeColor) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
            } else {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
            }
        }
        this.actionMode.setVisibility(0);
        if (this.occupyStatusBar && (view4 = this.actionModeTop) != null && !SharedConfig.noStatusBar) {
            view4.setVisibility(0);
        }
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[0] != null) {
            simpleTextViewArr[0].setVisibility(4);
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
                if (viewArr2[i4] != null && (zArr == null || i4 >= zArr.length || zArr[i4])) {
                    viewArr2[i4].setVisibility(4);
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
        View view;
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu == null || !this.actionModeVisible) {
            return;
        }
        actionBarMenu.hideAllPopupMenus();
        this.actionModeVisible = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.actionMode, View.ALPHA, 0.0f));
        if (this.actionModeHidingViews != null) {
            int i = 0;
            while (true) {
                View[] viewArr = this.actionModeHidingViews;
                if (i >= viewArr.length) {
                    break;
                }
                if (viewArr[i] != null) {
                    viewArr[i].setVisibility(0);
                    arrayList.add(ObjectAnimator.ofFloat(this.actionModeHidingViews[i], View.ALPHA, 1.0f));
                }
                i++;
            }
        }
        View view2 = this.actionModeTranslationView;
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f));
            this.actionModeTranslationView = null;
        }
        View view3 = this.actionModeShowingView;
        if (view3 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view3, View.ALPHA, 0.0f));
        }
        if (this.occupyStatusBar && (view = this.actionModeTop) != null && !SharedConfig.noStatusBar) {
            arrayList.add(ObjectAnimator.ofFloat(view, View.ALPHA, 0.0f));
        }
        if (SharedConfig.noStatusBar) {
            int i2 = this.actionBarColor;
            if (i2 == 0) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i2) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
            } else {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
            }
        }
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(arrayList);
        if (this.backgroundUpdateListener != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C1133ActionBar.this.lambda$hideActionMode$3(valueAnimator);
                }
            });
            this.actionModeAnimation.playTogether(ofFloat);
        }
        this.actionModeAnimation.setDuration(200L);
        this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (C1133ActionBar.this.actionModeAnimation == null || !C1133ActionBar.this.actionModeAnimation.equals(animator)) {
                    return;
                }
                C1133ActionBar.this.actionModeAnimation = null;
                C1133ActionBar.this.actionMode.setVisibility(4);
                if (C1133ActionBar.this.occupyStatusBar && C1133ActionBar.this.actionModeTop != null && !SharedConfig.noStatusBar) {
                    C1133ActionBar.this.actionModeTop.setVisibility(4);
                }
                if (C1133ActionBar.this.actionModeExtraView != null) {
                    C1133ActionBar.this.actionModeExtraView.setVisibility(4);
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (C1133ActionBar.this.actionModeAnimation == null || !C1133ActionBar.this.actionModeAnimation.equals(animator)) {
                    return;
                }
                C1133ActionBar.this.actionModeAnimation = null;
            }
        });
        this.actionModeAnimation.start();
        if (!this.isSearchFieldVisible) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if (simpleTextViewArr[0] != null) {
                simpleTextViewArr[0].setVisibility(0);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                this.subtitleTextView.setVisibility(0);
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.setVisibility(0);
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
            view.setBackgroundColor(getThemedColor("actionBarActionModeDefaultTop"));
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
        super.setBackgroundColor(i);
        ImageView imageView = this.backButtonImageView;
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof MenuDrawable) {
                ((MenuDrawable) drawable).setBackColor(i);
            }
        }
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
        AnimatorSet animatorSet = this.searchVisibleAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.searchVisibleAnimator = new AnimatorSet();
        final ArrayList arrayList = new ArrayList();
        final boolean onSearchChangedIgnoreTitles = onSearchChangedIgnoreTitles();
        if (!onSearchChangedIgnoreTitles) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if (simpleTextViewArr[0] != null) {
                arrayList.add(simpleTextViewArr[0]);
            }
            if (this.subtitleTextView != null && !TextUtils.isEmpty(this.subtitle)) {
                arrayList.add(this.subtitleTextView);
                this.subtitleTextView.setVisibility(z ? 4 : 0);
            }
        }
        float[] fArr = new float[2];
        fArr[0] = this.searchFieldVisibleAlpha;
        fArr[1] = z ? 1.0f : 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1133ActionBar.this.lambda$onSearchFieldVisibilityChanged$4(valueAnimator);
            }
        });
        this.searchVisibleAnimator.playTogether(ofFloat);
        for (int i = 0; i < arrayList.size(); i++) {
            View view = (View) arrayList.get(i);
            float f = 0.95f;
            if (!z) {
                view.setVisibility(0);
                view.setAlpha(0.0f);
                view.setScaleX(0.95f);
                view.setScaleY(0.95f);
            }
            AnimatorSet animatorSet2 = this.searchVisibleAnimator;
            Animator[] animatorArr = new Animator[1];
            Property property = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.0f : 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr2);
            animatorSet2.playTogether(animatorArr);
            AnimatorSet animatorSet3 = this.searchVisibleAnimator;
            Animator[] animatorArr2 = new Animator[1];
            Property property2 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 0.95f : 1.0f;
            animatorArr2[0] = ObjectAnimator.ofFloat(view, property2, fArr3);
            animatorSet3.playTogether(animatorArr2);
            AnimatorSet animatorSet4 = this.searchVisibleAnimator;
            Animator[] animatorArr3 = new Animator[1];
            Property property3 = View.SCALE_X;
            float[] fArr4 = new float[1];
            if (!z) {
                f = 1.0f;
            }
            fArr4[0] = f;
            animatorArr3[0] = ObjectAnimator.ofFloat(view, property3, fArr4);
            animatorSet4.playTogether(animatorArr3);
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.setVisibility(0);
            AnimatorSet animatorSet5 = this.searchVisibleAnimator;
            Animator[] animatorArr4 = new Animator[1];
            BackupImageView backupImageView2 = this.avatarSearchImageView;
            Property property4 = View.ALPHA;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.0f;
            animatorArr4[0] = ObjectAnimator.ofFloat(backupImageView2, property4, fArr5);
            animatorSet5.playTogether(animatorArr4);
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
                if (z && !onSearchChangedIgnoreTitles) {
                    if (C1133ActionBar.this.titleTextView[0] != null) {
                        C1133ActionBar.this.titleTextView[0].setVisibility(8);
                    }
                    if (C1133ActionBar.this.titleTextView[1] != null) {
                        C1133ActionBar.this.titleTextView[1].setVisibility(8);
                    }
                }
                if (C1133ActionBar.this.avatarSearchImageView == null || z) {
                    return;
                }
                C1133ActionBar.this.avatarSearchImageView.setVisibility(8);
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
        this.searchFieldVisibleAlpha = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
        boolean z2 = this.isSearchFieldVisible;
        actionBarMenu.openSearchField(!z2, !z2, str, z);
    }

    public void openSearchField(boolean z) {
        ActionBarMenu actionBarMenu = this.menu;
        if (actionBarMenu == null) {
            return;
        }
        actionBarMenu.openSearchField(!this.isSearchFieldVisible, false, "", z);
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
    public void onMeasure(int i, int i2) {
        int m35dp;
        SimpleTextView simpleTextView;
        SimpleTextView simpleTextView2;
        int makeMeasureSpec;
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int currentActionBarHeight = getCurrentActionBarHeight();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(currentActionBarHeight, 1073741824);
        this.ignoreLayoutRequest = true;
        View view = this.actionModeTop;
        if (view != null) {
            ((FrameLayout.LayoutParams) view.getLayoutParams()).height = AndroidUtilities.statusBarHeight;
        }
        ActionBarMenu actionBarMenu = this.actionMode;
        if (actionBarMenu != null) {
            actionBarMenu.setPadding(0, this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0, 0, 0);
        }
        this.ignoreLayoutRequest = false;
        setMeasuredDimension(size, currentActionBarHeight + (this.occupyStatusBar ? AndroidUtilities.statusBarHeight : 0) + this.extraHeight);
        ImageView imageView = this.backButtonImageView;
        if (imageView != null && imageView.getVisibility() != 8) {
            this.backButtonImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(54.0f), 1073741824), makeMeasureSpec2);
            m35dp = AndroidUtilities.m35dp(AndroidUtilities.isTablet() ? 80.0f : 72.0f);
        } else {
            m35dp = AndroidUtilities.m35dp(AndroidUtilities.isTablet() ? 26.0f : 18.0f);
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null && actionBarMenu2.getVisibility() != 8) {
            if (this.menu.searchFieldVisible() && !this.isSearchFieldVisible) {
                this.menu.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec2);
                int itemsMeasuredWidth = this.menu.getItemsMeasuredWidth();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.m35dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f)) + this.menu.getItemsMeasuredWidth(), 1073741824);
                if (!this.isMenuOffsetSuppressed) {
                    this.menu.translateXItems(-itemsMeasuredWidth);
                }
            } else if (this.isSearchFieldVisible) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m35dp(AndroidUtilities.isTablet() ? 74.0f : 66.0f), 1073741824);
                if (!this.isMenuOffsetSuppressed) {
                    this.menu.translateXItems(0.0f);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                if (!this.isMenuOffsetSuppressed) {
                    this.menu.translateXItems(0.0f);
                }
            }
            this.menu.measure(makeMeasureSpec, makeMeasureSpec2);
        }
        for (int i3 = 0; i3 < 2; i3++) {
            SimpleTextView[] simpleTextViewArr = this.titleTextView;
            if ((simpleTextViewArr[0] != null && simpleTextViewArr[0].getVisibility() != 8) || ((simpleTextView = this.subtitleTextView) != null && simpleTextView.getVisibility() != 8)) {
                ActionBarMenu actionBarMenu3 = this.menu;
                int measuredWidth = (((size - (actionBarMenu3 != null ? actionBarMenu3.getMeasuredWidth() : 0)) - AndroidUtilities.m35dp(16.0f)) - m35dp) - this.titleRightMargin;
                boolean z = this.fromBottom;
                if (((z && i3 == 0) || (!z && i3 == 1)) && this.overlayTitleAnimation && this.titleAnimationRunning) {
                    this.titleTextView[i3].setTextSize((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20 : 20);
                } else {
                    SimpleTextView[] simpleTextViewArr2 = this.titleTextView;
                    if (simpleTextViewArr2[0] != null && simpleTextViewArr2[0].getVisibility() != 8 && (simpleTextView2 = this.subtitleTextView) != null && simpleTextView2.getVisibility() != 8) {
                        SimpleTextView[] simpleTextViewArr3 = this.titleTextView;
                        if (simpleTextViewArr3[i3] != null) {
                            simpleTextViewArr3[i3].setTextSize(AndroidUtilities.isTablet() ? 20 : 18);
                        }
                        this.subtitleTextView.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        SimpleTextView simpleTextView3 = this.additionalSubtitleTextView;
                        if (simpleTextView3 != null) {
                            simpleTextView3.setTextSize(AndroidUtilities.isTablet() ? 16 : 14);
                        }
                    } else {
                        SimpleTextView[] simpleTextViewArr4 = this.titleTextView;
                        if (simpleTextViewArr4[i3] != null && simpleTextViewArr4[i3].getVisibility() != 8) {
                            this.titleTextView[i3].setTextSize((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 20 : 20);
                        }
                        SimpleTextView simpleTextView4 = this.subtitleTextView;
                        if (simpleTextView4 != null && simpleTextView4.getVisibility() != 8) {
                            this.subtitleTextView.setTextSize((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                        SimpleTextView simpleTextView5 = this.additionalSubtitleTextView;
                        if (simpleTextView5 != null) {
                            simpleTextView5.setTextSize((AndroidUtilities.isTablet() || getResources().getConfiguration().orientation != 2) ? 16 : 14);
                        }
                    }
                }
                SimpleTextView[] simpleTextViewArr5 = this.titleTextView;
                if (simpleTextViewArr5[i3] != null && simpleTextViewArr5[i3].getVisibility() != 8) {
                    this.titleTextView[i3].measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(24.0f) + this.titleTextView[i3].getPaddingTop() + this.titleTextView[i3].getPaddingBottom(), Integer.MIN_VALUE));
                    if (this.centerScale) {
                        CharSequence text = this.titleTextView[i3].getText();
                        SimpleTextView[] simpleTextViewArr6 = this.titleTextView;
                        simpleTextViewArr6[i3].setPivotX(simpleTextViewArr6[i3].getTextPaint().measureText(text, 0, text.length()) / 2.0f);
                        this.titleTextView[i3].setPivotY(AndroidUtilities.m35dp(24.0f) >> 1);
                    } else {
                        this.titleTextView[i3].setPivotX(0.0f);
                        this.titleTextView[i3].setPivotY(0.0f);
                    }
                }
                SimpleTextView simpleTextView6 = this.subtitleTextView;
                if (simpleTextView6 != null && simpleTextView6.getVisibility() != 8) {
                    this.subtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), Integer.MIN_VALUE));
                }
                SimpleTextView simpleTextView7 = this.additionalSubtitleTextView;
                if (simpleTextView7 != null && simpleTextView7.getVisibility() != 8) {
                    this.additionalSubtitleTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(20.0f), Integer.MIN_VALUE));
                }
            }
        }
        BackupImageView backupImageView = this.avatarSearchImageView;
        if (backupImageView != null) {
            backupImageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(42.0f), 1073741824));
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                SimpleTextView[] simpleTextViewArr7 = this.titleTextView;
                if (childAt != simpleTextViewArr7[0] && childAt != simpleTextViewArr7[1] && childAt != this.subtitleTextView && childAt != this.menu && childAt != this.backButtonImageView && childAt != this.additionalSubtitleTextView && childAt != this.avatarSearchImageView) {
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824), 0);
                }
            }
        }
    }

    public void setMenuOffsetSuppressed(boolean z) {
        this.isMenuOffsetSuppressed = z;
    }

    @Override
    protected void onLayout(boolean r15, int r16, int r17, int r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ActionBar.C1133ActionBar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMenuButtonPressed() {
        ActionBarMenu actionBarMenu;
        if (isActionModeShowed() || (actionBarMenu = this.menu) == null) {
            return;
        }
        actionBarMenu.onMenuButtonPressed();
    }

    public void onPause() {
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

    public void setTitleOverlayText(java.lang.String r7, int r8, java.lang.Runnable r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.ActionBar.C1133ActionBar.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
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
                }
                return;
            }
            return;
        }
        this.itemsColor = i;
        ImageView imageView2 = this.backButtonImageView;
        if (imageView2 != null && i != 0) {
            imageView2.setColorFilter(new PorterDuffColorFilter(this.itemsColor, this.colorFilterMode));
            Drawable drawable2 = this.backButtonImageView.getDrawable();
            if (drawable2 instanceof BackDrawable) {
                ((BackDrawable) drawable2).setColor(i);
            } else if (drawable2 instanceof MenuDrawable) {
                ((MenuDrawable) drawable2).setIconColor(i);
            }
        }
        ActionBarMenu actionBarMenu2 = this.menu;
        if (actionBarMenu2 != null) {
            actionBarMenu2.updateItemsColor();
        }
    }

    public void setCastShadows(boolean z) {
        this.castShadows = z;
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
        if (AndroidUtilities.isTablet()) {
            return AndroidUtilities.m35dp(64.0f);
        }
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            return AndroidUtilities.m35dp(48.0f);
        }
        return AndroidUtilities.m35dp(56.0f);
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
        SimpleTextView[] simpleTextViewArr = this.titleTextView;
        if (simpleTextViewArr[1] != null) {
            if (simpleTextViewArr[1].getParent() != null) {
                ((ViewGroup) this.titleTextView[1].getParent()).removeView(this.titleTextView[1]);
            }
            this.titleTextView[1] = null;
        }
        SimpleTextView[] simpleTextViewArr2 = this.titleTextView;
        simpleTextViewArr2[1] = simpleTextViewArr2[0];
        simpleTextViewArr2[0] = null;
        setTitle(charSequence);
        this.fromBottom = z;
        this.titleTextView[0].setAlpha(0.0f);
        if (!z2) {
            SimpleTextView simpleTextView = this.titleTextView[0];
            int m35dp = AndroidUtilities.m35dp(20.0f);
            if (!z) {
                m35dp = -m35dp;
            }
            simpleTextView.setTranslationY(m35dp);
        }
        ViewPropertyAnimator duration = this.titleTextView[0].animate().alpha(1.0f).translationY(0.0f).setDuration(j);
        if (interpolator != null) {
            duration.setInterpolator(interpolator);
        }
        duration.start();
        this.titleAnimationRunning = true;
        ViewPropertyAnimator alpha = this.titleTextView[1].animate().alpha(0.0f);
        if (!z2) {
            int m35dp2 = AndroidUtilities.m35dp(20.0f);
            if (z) {
                m35dp2 = -m35dp2;
            }
            alpha.translationY(m35dp2);
        }
        if (interpolator != null) {
            alpha.setInterpolator(interpolator);
        }
        alpha.setDuration(j).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (C1133ActionBar.this.titleTextView[1] != null && C1133ActionBar.this.titleTextView[1].getParent() != null) {
                    ((ViewGroup) C1133ActionBar.this.titleTextView[1].getParent()).removeView(C1133ActionBar.this.titleTextView[1]);
                }
                C1133ActionBar.this.titleTextView[1] = null;
                C1133ActionBar.this.titleAnimationRunning = false;
                if (z2 && z) {
                    C1133ActionBar.this.subtitleTextView.setVisibility(8);
                }
                C1133ActionBar.this.requestLayout();
            }
        }).start();
        requestLayout();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.ellipsizeSpanAnimator.onAttachedToWindow();
        if (SharedConfig.noStatusBar && this.actionModeVisible) {
            if (ColorUtils.calculateLuminance(this.actionModeColor) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
            } else {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ellipsizeSpanAnimator.onDetachedFromWindow();
        if (SharedConfig.noStatusBar && this.actionModeVisible) {
            int i = this.actionBarColor;
            if (i == 0) {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            } else if (ColorUtils.calculateLuminance(i) < 0.699999988079071d) {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), false);
            } else {
                AndroidUtilities.setLightStatusBar(((Activity) getContext()).getWindow(), true);
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
        if (Build.VERSION.SDK_INT >= 19) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new Fade());
            transitionSet.addTransition(new ChangeBounds(this) {
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
                            Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
                            float floatValue = ((Float) transitionValues.values.get("text_size")).floatValue() / ((Float) transitionValues2.values.get("text_size")).floatValue();
                            transitionValues.view.setScaleX(floatValue);
                            transitionValues.view.setScaleY(floatValue);
                            if (createAnimator != null) {
                                animatorSet.playTogether(createAnimator);
                            }
                        }
                        animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, View.SCALE_X, 1.0f));
                        animatorSet.playTogether(ObjectAnimator.ofFloat(transitionValues.view, View.SCALE_Y, 1.0f));
                        animatorSet.addListener(new AnimatorListenerAdapter(this) {
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
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        if (color == null) {
            BaseFragment baseFragment = this.parentFragment;
            color = baseFragment != null ? Integer.valueOf(baseFragment.getThemedColor(str)) : null;
        }
        return color != null ? color.intValue() : Theme.getColor(str);
    }

    public void setDrawBlurBackground(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
        this.blurredBackground = true;
        this.contentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.blurBehindViews.add(this);
        setBackground(null);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.blurredBackground && this.actionBarColor != 0) {
            this.rectTmp.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.blurScrimPaint.setColor(this.actionBarColor);
            this.contentView.drawBlurRect(canvas, getY(), this.rectTmp, this.blurScrimPaint, true);
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
}

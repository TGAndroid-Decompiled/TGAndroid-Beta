package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;

public final class FloatingToolbar {
    private static final MenuItem.OnMenuItemClickListener NO_OP_MENUITEM_CLICK_LISTENER = new MenuItem.OnMenuItemClickListener() {
        @Override
        public final boolean onMenuItemClick(MenuItem menuItem) {
            return FloatingToolbar.$r8$lambda$UV4UHvSG7impHUqxEN2IE95BRm0(menuItem);
        }
    };
    public static final List STYLE_BUTTONS;
    public static final List premiumOptions;
    BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    private int currentStyle;
    private final Rect mContentRect;
    private Menu mMenu;
    private MenuItem.OnMenuItemClickListener mMenuItemClickListener;
    private final Comparator mMenuItemComparator;
    private final View.OnLayoutChangeListener mOrientationChangeHandler;
    private final FloatingToolbarPopup mPopup;
    private final Rect mPreviousContentRect;
    private List mShowingMenuItems;
    private int mSuggestedWidth;
    private boolean mWidthChanged;
    private final View mWindowView;
    private Runnable premiumLockClickListener;
    private Utilities.Callback0Return quoteShowCallback;
    private final Theme.ResourcesProvider resourcesProvider;

    public interface StyleDelegate {
        void addStyle(int i, int i2, int i3);

        int getCurrentStyle(int i, int i2);

        void removeStyle(int i, int i2, int i3);
    }

    public static boolean $r8$lambda$UV4UHvSG7impHUqxEN2IE95BRm0(MenuItem menuItem) {
        return false;
    }

    static {
        Integer numValueOf = Integer.valueOf(R.id.menu_regular);
        int i = R.id.menu_bold;
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = R.id.menu_italic;
        Integer numValueOf3 = Integer.valueOf(i2);
        int i3 = R.id.menu_strike;
        Integer numValueOf4 = Integer.valueOf(i3);
        int i4 = R.id.menu_mono;
        Integer numValueOf5 = Integer.valueOf(i4);
        int i5 = R.id.menu_underline;
        Integer numValueOf6 = Integer.valueOf(i5);
        int i6 = R.id.menu_spoiler;
        Integer numValueOf7 = Integer.valueOf(i6);
        int i7 = R.id.menu_link;
        Integer numValueOf8 = Integer.valueOf(i7);
        int i8 = R.id.menu_quote;
        STYLE_BUTTONS = Arrays.asList(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, Integer.valueOf(i8), Integer.valueOf(R.id.menu_date));
        premiumOptions = Arrays.asList(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i7), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i8));
    }

    public void setOnPremiumLockClick(Runnable runnable) {
        this.premiumLockClickListener = runnable;
    }

    public void setQuoteShowVisible(Utilities.Callback0Return callback0Return) {
        this.quoteShowCallback = callback0Return;
    }

    public static int m1266$r8$lambda$oeoem8jsMsNfzaGiZfcKWwEphE(MenuItem menuItem, MenuItem menuItem2) {
        return menuItem.getOrder() - menuItem2.getOrder();
    }

    public FloatingToolbar(Context context, View view, int i, Theme.ResourcesProvider resourcesProvider) {
        this(context, view, i, resourcesProvider, null);
    }

    public FloatingToolbar(Context context, View view, int i, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.mContentRect = new Rect();
        this.mPreviousContentRect = new Rect();
        this.mShowingMenuItems = new ArrayList();
        this.mMenuItemClickListener = NO_OP_MENUITEM_CLICK_LISTENER;
        this.mWidthChanged = true;
        this.mOrientationChangeHandler = new View.OnLayoutChangeListener() {
            private final Rect mNewRect = new Rect();
            private final Rect mOldRect = new Rect();

            @Override
            public void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.mNewRect.set(i2, i3, i4, i5);
                this.mOldRect.set(i6, i7, i8, i9);
                if (!FloatingToolbar.this.mPopup.isShowing() || this.mNewRect.equals(this.mOldRect)) {
                    return;
                }
                FloatingToolbar.this.mWidthChanged = true;
                FloatingToolbar.this.updateLayout();
            }
        };
        this.mMenuItemComparator = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return FloatingToolbar.m1266$r8$lambda$oeoem8jsMsNfzaGiZfcKWwEphE((MenuItem) obj, (MenuItem) obj2);
            }
        };
        this.mWindowView = view;
        this.currentStyle = i;
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.resourcesProvider = resourcesProvider;
        this.mPopup = new FloatingToolbarPopup(context, view);
    }

    public FloatingToolbar setMenu(Menu menu) {
        this.mMenu = menu;
        return this;
    }

    public FloatingToolbar setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (onMenuItemClickListener != null) {
            this.mMenuItemClickListener = onMenuItemClickListener;
            return this;
        }
        this.mMenuItemClickListener = NO_OP_MENUITEM_CLICK_LISTENER;
        return this;
    }

    public FloatingToolbar setContentRect(Rect rect) {
        this.mContentRect.set(rect);
        return this;
    }

    public FloatingToolbar show() {
        registerOrientationHandler();
        doShow();
        return this;
    }

    public FloatingToolbar updateLayout() {
        if (this.mPopup.isShowing()) {
            doShow();
        }
        return this;
    }

    public void dismiss() {
        unregisterOrientationHandler();
        this.mPopup.dismiss();
    }

    public void hide() {
        this.mPopup.hide();
    }

    private void doShow() {
        List visibleAndEnabledMenuItems = getVisibleAndEnabledMenuItems(this.mMenu);
        Collections.sort(visibleAndEnabledMenuItems, this.mMenuItemComparator);
        if (!isCurrentlyShowing(visibleAndEnabledMenuItems) || this.mWidthChanged) {
            this.mPopup.dismiss();
            this.mPopup.layoutMenuItems(visibleAndEnabledMenuItems, this.mMenuItemClickListener, this.mSuggestedWidth);
            this.mShowingMenuItems = visibleAndEnabledMenuItems;
        }
        if (!this.mPopup.isShowing()) {
            this.mPopup.show(this.mContentRect);
        } else if (!this.mPreviousContentRect.equals(this.mContentRect)) {
            this.mPopup.updateCoordinates(this.mContentRect);
        }
        this.mWidthChanged = false;
        this.mPreviousContentRect.set(this.mContentRect);
    }

    private boolean isCurrentlyShowing(List list) {
        if (this.mShowingMenuItems == null || list.size() != this.mShowingMenuItems.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            MenuItem menuItem = (MenuItem) list.get(i);
            MenuItem menuItem2 = (MenuItem) this.mShowingMenuItems.get(i);
            if (menuItem.getItemId() != menuItem2.getItemId() || !TextUtils.equals(menuItem.getTitle(), menuItem2.getTitle()) || !Objects.equals(menuItem.getIcon(), menuItem2.getIcon()) || menuItem.getGroupId() != menuItem2.getGroupId()) {
                return false;
            }
        }
        return true;
    }

    private List getVisibleAndEnabledMenuItems(Menu menu) {
        Utilities.Callback0Return callback0Return;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(getVisibleAndEnabledMenuItems(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (callback0Return = this.quoteShowCallback) == null || ((Boolean) callback0Return.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.premiumLockClickListener == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    private void registerOrientationHandler() {
        unregisterOrientationHandler();
        this.mWindowView.addOnLayoutChangeListener(this.mOrientationChangeHandler);
    }

    private void unregisterOrientationHandler() {
        this.mWindowView.removeOnLayoutChangeListener(this.mOrientationChangeHandler);
    }

    final class FloatingToolbarPopup {
        private final Drawable mArrow;
        private final AnimationSet mCloseOverflowAnimation;
        private final ViewGroup mContentContainer;
        private final Context mContext;
        private final AnimatorSet mDismissAnimation;
        private final Interpolator mFastOutLinearInInterpolator;
        private final Interpolator mFastOutSlowInInterpolator;
        private boolean mHidden;
        private final AnimatorSet mHideAnimation;
        private final int mIconTextSpacing;
        private boolean mIsOverflowOpen;
        private int mLineHeight;
        private final Interpolator mLinearOutSlowInInterpolator;
        private final Interpolator mLogAccelerateInterpolator;
        private final LinearLayout mMainPanel;
        private LinearLayout mMainPanelButtons;
        private Size mMainPanelSize;
        private final int mMarginHorizontal;
        private final int mMarginVertical;
        private MenuItem.OnMenuItemClickListener mOnMenuItemClickListener;
        private final AnimationSet mOpenOverflowAnimation;
        private boolean mOpenOverflowUpwards;
        private final Drawable mOverflow;
        private final FrameLayout mOverflowButton;
        private final ImageView mOverflowButtonIcon;
        private final View mOverflowButtonShadow;
        private final Size mOverflowButtonSize;
        private final TextView mOverflowButtonText;
        private final OverflowPanel mOverflowPanel;
        private Size mOverflowPanelSize;
        private final OverflowPanelViewHelper mOverflowPanelViewHelper;
        private final View mParent;
        private final PopupWindow mPopupWindow;
        private final AnimatorSet mShowAnimation;
        private final AnimatedVectorDrawable mToArrow;
        private final AnimatedVectorDrawable mToOverflow;
        private int mTransitionDurationScale;
        private final Rect mViewPortOnScreen = new Rect();
        private final Point mCoordsOnWindow = new Point();
        private final int[] mTmpCoords = new int[2];
        private final Region mTouchableRegion = new Region();
        private final Runnable mPreparePopupContentRTLHelper = new Runnable() {
            @Override
            public void run() {
                FloatingToolbarPopup.this.setPanelsStatesAtRestingPosition();
                FloatingToolbarPopup.this.setContentAreaAsTouchableSurface();
                FloatingToolbarPopup.this.mContentContainer.setAlpha(1.0f);
            }
        };
        private boolean mDismissed = true;
        private final View.OnClickListener mMenuItemButtonOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(view.getTag() instanceof MenuItem) || FloatingToolbarPopup.this.mOnMenuItemClickListener == null) {
                    return;
                }
                FloatingToolbarPopup.this.mOnMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
            }
        };
        private int shiftDp = -4;

        public boolean isInRTLMode() {
            return false;
        }

        private void setTouchableSurfaceInsetsComputer() {
        }

        public FloatingToolbarPopup(Context context, View view) {
            ViewGroup viewGroup;
            int themedColor;
            this.mParent = view;
            this.mContext = context;
            ViewGroup viewGroupCreateContentContainer = FloatingToolbar.this.createContentContainer(context);
            this.mContentContainer = viewGroupCreateContentContainer;
            this.mPopupWindow = FloatingToolbar.createPopupWindow(viewGroupCreateContentContainer);
            this.mMarginHorizontal = AndroidUtilities.dp(16.0f);
            this.mMarginVertical = AndroidUtilities.dp(8.0f);
            this.mLineHeight = AndroidUtilities.dp(48.0f);
            int iDp = AndroidUtilities.dp(8.0f);
            this.mIconTextSpacing = iDp;
            this.mLogAccelerateInterpolator = new LogAccelerateInterpolator();
            this.mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
            this.mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, 17563662);
            this.mFastOutLinearInInterpolator = AnimationUtils.loadInterpolator(context, 17563663);
            Drawable drawableMutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
            this.mArrow = drawableMutate;
            drawableMutate.setAutoMirrored(true);
            Drawable drawableMutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
            this.mOverflow = drawableMutate2;
            drawableMutate2.setAutoMirrored(true);
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
            this.mToArrow = animatedVectorDrawable;
            animatedVectorDrawable.setAutoMirrored(true);
            AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
            this.mToOverflow = animatedVectorDrawable2;
            animatedVectorDrawable2.setAutoMirrored(true);
            FrameLayout frameLayout = new FrameLayout(context);
            this.mOverflowButton = frameLayout;
            ImageButton imageButton = new ImageButton(context) {
                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (FloatingToolbarPopup.this.mIsOverflowOpen) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.mOverflowButtonIcon = imageButton;
            imageButton.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
            imageButton.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageButton.setImageDrawable(drawableMutate2);
            TextView textView = new TextView(context);
            this.mOverflowButtonText = textView;
            textView.setText(LocaleController.getString(R.string.Back));
            textView.setTextSize(1, 16.0f);
            textView.setAlpha(0.0f);
            View view2 = new View(context);
            this.mOverflowButtonShadow = view2;
            if (FloatingToolbar.this.currentStyle != 0) {
                viewGroup = viewGroupCreateContentContainer;
                if (FloatingToolbar.this.currentStyle != 2) {
                    themedColor = FloatingToolbar.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
                    int i = Theme.key_listSelector;
                    imageButton.setBackground(Theme.createSelectorDrawable(FloatingToolbar.this.getThemedColor(i), 1));
                    frameLayout.setBackground(Theme.createSelectorDrawable(FloatingToolbar.this.getThemedColor(i), 2));
                    view2.setBackgroundColor(FloatingToolbar.this.getThemedColor(Theme.key_divider));
                } else {
                    imageButton.setBackground(Theme.createSelectorDrawable(553648127, 1));
                    frameLayout.setBackground(Theme.createSelectorDrawable(553648127, 2));
                    view2.setBackgroundColor(553648127);
                    themedColor = -328966;
                }
            } else {
                int i2 = Theme.key_dialogTextBlack;
                int themedColor2 = FloatingToolbar.this.getThemedColor(i2);
                int i3 = Theme.key_listSelector;
                viewGroup = viewGroupCreateContentContainer;
                imageButton.setBackground(Theme.createSelectorDrawable(FloatingToolbar.this.getThemedColor(i3), 1));
                frameLayout.setBackground(Theme.createSelectorDrawable(FloatingToolbar.this.getThemedColor(i3), 2));
                view2.setBackgroundColor(Theme.multAlpha(FloatingToolbar.this.getThemedColor(i2), 0.4f));
                themedColor = themedColor2;
            }
            drawableMutate2.setTint(themedColor);
            drawableMutate.setTint(themedColor);
            animatedVectorDrawable.setTint(themedColor);
            animatedVectorDrawable2.setTint(themedColor);
            textView.setTextColor(themedColor);
            imageButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.onBackPressed();
                }
            });
            frameLayout.addView(imageButton, LayoutHelper.createFrame(-2, -2, 19));
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.addView(view2, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
            this.mOverflowButtonSize = measure(imageButton);
            this.mMainPanel = createMainPanel();
            this.mOverflowPanelViewHelper = new OverflowPanelViewHelper(context, iDp);
            this.mOverflowPanel = createOverflowPanel();
            Animation.AnimationListener animationListenerCreateOverflowAnimationListener = createOverflowAnimationListener();
            AnimationSet animationSet = new AnimationSet(true);
            this.mOpenOverflowAnimation = animationSet;
            animationSet.setAnimationListener(animationListenerCreateOverflowAnimationListener);
            AnimationSet animationSet2 = new AnimationSet(true);
            this.mCloseOverflowAnimation = animationSet2;
            animationSet2.setAnimationListener(animationListenerCreateOverflowAnimationListener);
            this.mShowAnimation = FloatingToolbar.createEnterAnimation(viewGroup);
            ViewGroup viewGroup2 = viewGroup;
            this.mDismissAnimation = FloatingToolbar.createExitAnimation(viewGroup2, 150, new AnonymousClass4(FloatingToolbar.this));
            this.mHideAnimation = FloatingToolbar.createExitAnimation(viewGroup2, 0, new AnonymousClass5(FloatingToolbar.this));
        }

        class AnonymousClass4 extends AnimatorListenerAdapter {
            final FloatingToolbar val$this$0;

            AnonymousClass4(FloatingToolbar floatingToolbar) {
                this.val$this$0 = floatingToolbar;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        FloatingToolbar.FloatingToolbarPopup.AnonymousClass4.$r8$lambda$cco5EnXFNcOVHG9m7zX5jqw3AJ8(this.f$0);
                    }
                });
            }

            public static void $r8$lambda$cco5EnXFNcOVHG9m7zX5jqw3AJ8(AnonymousClass4 anonymousClass4) {
                FloatingToolbarPopup.this.mPopupWindow.dismiss();
                FloatingToolbarPopup.this.mContentContainer.removeAllViews();
            }
        }

        class AnonymousClass5 extends AnimatorListenerAdapter {
            final FloatingToolbar val$this$0;

            AnonymousClass5(FloatingToolbar floatingToolbar) {
                this.val$this$0 = floatingToolbar;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new Runnable() {
                    @Override
                    public final void run() {
                        FloatingToolbar.FloatingToolbarPopup.this.mPopupWindow.dismiss();
                    }
                });
            }
        }

        public void onBackPressed() {
            if (this.mIsOverflowOpen) {
                this.mOverflowButtonIcon.setImageDrawable(this.mToOverflow);
                this.mToOverflow.start();
                closeOverflow();
            } else {
                this.mOverflowButtonIcon.setImageDrawable(this.mToArrow);
                this.mToArrow.start();
                openOverflow();
            }
        }

        private void updateOverflowButtonClickListener() {
            if (this.mIsOverflowOpen) {
                this.mOverflowButton.setClickable(true);
                this.mOverflowButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.onBackPressed();
                    }
                });
                this.mOverflowButtonIcon.setClickable(false);
                this.mOverflowButtonIcon.setOnClickListener(null);
                return;
            }
            this.mOverflowButton.setClickable(false);
            this.mOverflowButton.setOnClickListener(null);
            this.mOverflowButtonIcon.setClickable(true);
            this.mOverflowButtonIcon.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onBackPressed();
                }
            });
        }

        public void layoutMenuItems(List list, MenuItem.OnMenuItemClickListener onMenuItemClickListener, int i) {
            this.mOnMenuItemClickListener = onMenuItemClickListener;
            cancelOverflowAnimations();
            clearPanels();
            List listLayoutMainPanelItems = layoutMainPanelItems(list, getAdjustedToolbarWidth(i));
            if (!listLayoutMainPanelItems.isEmpty()) {
                layoutOverflowPanelItems(listLayoutMainPanelItems);
            }
            updatePopupSize();
        }

        public void show(Rect rect) {
            if (isShowing()) {
                return;
            }
            this.mHidden = false;
            this.mDismissed = false;
            cancelDismissAndHideAnimations();
            cancelOverflowAnimations();
            refreshCoordinatesAndOverflowDirection(rect);
            preparePopupContent();
            PopupWindow popupWindow = this.mPopupWindow;
            View view = this.mParent;
            Point point = this.mCoordsOnWindow;
            popupWindow.showAtLocation(view, 0, point.x, point.y);
            setTouchableSurfaceInsetsComputer();
            runShowAnimation();
        }

        public void dismiss() {
            if (this.mDismissed) {
                return;
            }
            this.mHidden = false;
            this.mDismissed = true;
            this.mHideAnimation.cancel();
            runDismissAnimation();
            setZeroTouchableSurface();
        }

        public void hide() {
            if (isShowing()) {
                this.mHidden = true;
                runHideAnimation();
                setZeroTouchableSurface();
            }
        }

        public boolean isShowing() {
            return (this.mDismissed || this.mHidden) ? false : true;
        }

        public void updateCoordinates(Rect rect) {
            if (isShowing() && this.mPopupWindow.isShowing()) {
                cancelOverflowAnimations();
                refreshCoordinatesAndOverflowDirection(rect);
                preparePopupContent();
                PopupWindow popupWindow = this.mPopupWindow;
                Point point = this.mCoordsOnWindow;
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), this.mPopupWindow.getHeight());
            }
        }

        private void refreshCoordinatesAndOverflowDirection(Rect rect) {
            int height;
            refreshViewPort();
            int iMin = Math.min(rect.centerX() - (this.mPopupWindow.getWidth() / 2), this.mViewPortOnScreen.right - this.mPopupWindow.getWidth());
            int i = rect.top;
            Rect rect2 = this.mViewPortOnScreen;
            int i2 = i - rect2.top;
            int i3 = rect2.bottom - rect.bottom;
            int i4 = this.mMarginVertical * 2;
            int i5 = this.mLineHeight + i4;
            if (hasOverflow()) {
                int iCalculateOverflowHeight = calculateOverflowHeight(2) + i4;
                Rect rect3 = this.mViewPortOnScreen;
                int i6 = (rect3.bottom - rect.top) + i5;
                int i7 = (rect.bottom - rect3.top) + i5;
                if (i2 >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i2 - i4);
                    height = rect.top - this.mPopupWindow.getHeight();
                    this.mOpenOverflowUpwards = true;
                } else if (i2 >= i5 && i6 >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i6 - i4);
                    height = rect.top - i5;
                    this.mOpenOverflowUpwards = false;
                } else if (i3 >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i3 - i4);
                    height = rect.bottom;
                    this.mOpenOverflowUpwards = false;
                } else if (i3 >= i5 && rect3.height() >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i7 - i4);
                    height = (rect.bottom + i5) - this.mPopupWindow.getHeight();
                    this.mOpenOverflowUpwards = true;
                } else {
                    updateOverflowHeight(this.mViewPortOnScreen.height() - i4);
                    height = this.mViewPortOnScreen.top;
                    this.mOpenOverflowUpwards = false;
                }
            } else if (i2 >= i5) {
                height = rect.top - i5;
            } else if (i3 >= i5) {
                height = rect.bottom;
            } else if (i3 >= this.mLineHeight) {
                height = rect.bottom - this.mMarginVertical;
            } else {
                height = Math.max(this.mViewPortOnScreen.top, rect.top - i5);
            }
            this.mParent.getRootView().getLocationOnScreen(this.mTmpCoords);
            int[] iArr = this.mTmpCoords;
            int i8 = iArr[0];
            int i9 = iArr[1];
            this.mParent.getRootView().getLocationInWindow(this.mTmpCoords);
            int[] iArr2 = this.mTmpCoords;
            this.mCoordsOnWindow.set(Math.max(0, iMin - (i8 - iArr2[0])), Math.max(0, height - (i9 - iArr2[1])));
        }

        private void runShowAnimation() {
            this.mShowAnimation.start();
        }

        private void runDismissAnimation() {
            this.mDismissAnimation.start();
        }

        private void runHideAnimation() {
            this.mHideAnimation.start();
        }

        private void cancelDismissAndHideAnimations() {
            this.mDismissAnimation.cancel();
            this.mHideAnimation.cancel();
        }

        private void cancelOverflowAnimations() {
            this.mContentContainer.clearAnimation();
            this.mMainPanel.animate().cancel();
            this.mOverflowPanel.animate().cancel();
            this.mToArrow.stop();
            this.mToOverflow.stop();
        }

        private void openOverflow() {
            final int width = this.mOverflowPanelSize.getWidth();
            final int height = this.mOverflowPanelSize.getHeight();
            final int width2 = this.mContentContainer.getWidth();
            final int height2 = this.mContentContainer.getHeight();
            final float y = this.mContentContainer.getY();
            final float x = this.mContentContainer.getX();
            final float width3 = x + this.mContentContainer.getWidth();
            Animation animation = new Animation() {
                @Override
                protected void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (f * (width - width2));
                    FloatingToolbarPopup floatingToolbarPopup = FloatingToolbarPopup.this;
                    floatingToolbarPopup.setWidth(floatingToolbarPopup.mContentContainer, width2 + i);
                    if (FloatingToolbarPopup.this.isInRTLMode()) {
                        FloatingToolbarPopup.this.mContentContainer.setX(x);
                        FloatingToolbarPopup.this.mMainPanel.setX(0.0f);
                        FloatingToolbarPopup.this.mOverflowPanel.setX(0.0f);
                    } else {
                        FloatingToolbarPopup.this.mContentContainer.setX(width3 - FloatingToolbarPopup.this.mContentContainer.getWidth());
                        FloatingToolbarPopup.this.mMainPanel.setX(FloatingToolbarPopup.this.mContentContainer.getWidth() - width2);
                        FloatingToolbarPopup.this.mOverflowPanel.setX(FloatingToolbarPopup.this.mContentContainer.getWidth() - width);
                    }
                }
            };
            Animation animation2 = new Animation() {
                @Override
                protected void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (f * (height - height2));
                    FloatingToolbarPopup floatingToolbarPopup = FloatingToolbarPopup.this;
                    floatingToolbarPopup.setHeight(floatingToolbarPopup.mContentContainer, height2 + i);
                    if (FloatingToolbarPopup.this.mOpenOverflowUpwards) {
                        FloatingToolbarPopup.this.mContentContainer.setY(y - (FloatingToolbarPopup.this.mContentContainer.getHeight() - height2));
                        FloatingToolbarPopup.this.positionContentYCoordinatesIfOpeningOverflowUpwards();
                    }
                }
            };
            final float x2 = this.mOverflowButton.getX();
            float f = width;
            final float width4 = isInRTLMode() ? (f + x2) - this.mOverflowButtonIcon.getWidth() : (x2 - f) + this.mOverflowButtonIcon.getWidth();
            Animation animation3 = new Animation() {
                @Override
                protected void applyTransformation(float f2, Transformation transformation) {
                    float f3 = x2;
                    FloatingToolbarPopup.this.mOverflowButton.setX(f3 + ((width4 - f3) * f2) + (FloatingToolbarPopup.this.isInRTLMode() ? 0.0f : FloatingToolbarPopup.this.mContentContainer.getWidth() - width2));
                    FloatingToolbarPopup.this.mOverflowButtonText.setAlpha(f2);
                    FloatingToolbarPopup.this.mOverflowButtonShadow.setAlpha(f2);
                }
            };
            animation.setInterpolator(this.mLogAccelerateInterpolator);
            animation.setDuration(getAdjustedDuration(250));
            animation2.setInterpolator(this.mFastOutSlowInInterpolator);
            animation2.setDuration(getAdjustedDuration(250));
            animation3.setInterpolator(this.mFastOutSlowInInterpolator);
            animation3.setDuration(getAdjustedDuration(250));
            this.mOpenOverflowAnimation.getAnimations().clear();
            this.mOpenOverflowAnimation.addAnimation(animation);
            this.mOpenOverflowAnimation.addAnimation(animation2);
            this.mOpenOverflowAnimation.addAnimation(animation3);
            this.mContentContainer.startAnimation(this.mOpenOverflowAnimation);
            this.mIsOverflowOpen = true;
            updateOverflowButtonClickListener();
            this.mMainPanel.animate().alpha(0.0f).withLayer().setInterpolator(this.mLinearOutSlowInInterpolator).setDuration(250L).start();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.mOverflowButton.getLayoutParams();
            layoutParams.width = this.mOverflowPanel.getWidth();
            this.mOverflowButton.setLayoutParams(layoutParams);
            this.mOverflowPanel.setAlpha(1.0f);
        }

        private void closeOverflow() {
            final int width = this.mMainPanelSize.getWidth();
            final int width2 = this.mContentContainer.getWidth();
            final float x = this.mContentContainer.getX();
            final float width3 = x + this.mContentContainer.getWidth();
            Animation animation = new Animation() {
                @Override
                protected void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (f * (width - width2));
                    FloatingToolbarPopup floatingToolbarPopup = FloatingToolbarPopup.this;
                    floatingToolbarPopup.setWidth(floatingToolbarPopup.mContentContainer, width2 + i);
                    if (FloatingToolbarPopup.this.isInRTLMode()) {
                        FloatingToolbarPopup.this.mContentContainer.setX(x);
                        FloatingToolbarPopup.this.mMainPanel.setX(0.0f);
                        FloatingToolbarPopup.this.mOverflowPanel.setX(0.0f);
                    } else {
                        FloatingToolbarPopup.this.mContentContainer.setX(width3 - FloatingToolbarPopup.this.mContentContainer.getWidth());
                        FloatingToolbarPopup.this.mMainPanel.setX(FloatingToolbarPopup.this.mContentContainer.getWidth() - width);
                        FloatingToolbarPopup.this.mOverflowPanel.setX(FloatingToolbarPopup.this.mContentContainer.getWidth() - width2);
                    }
                }
            };
            final int height = this.mMainPanelSize.getHeight();
            final int height2 = this.mContentContainer.getHeight();
            final float y = this.mContentContainer.getY() + this.mContentContainer.getHeight();
            Animation animation2 = new Animation() {
                @Override
                protected void applyTransformation(float f, Transformation transformation) {
                    int i = (int) (f * (height - height2));
                    FloatingToolbarPopup floatingToolbarPopup = FloatingToolbarPopup.this;
                    floatingToolbarPopup.setHeight(floatingToolbarPopup.mContentContainer, height2 + i);
                    if (FloatingToolbarPopup.this.mOpenOverflowUpwards) {
                        FloatingToolbarPopup.this.mContentContainer.setY(y - FloatingToolbarPopup.this.mContentContainer.getHeight());
                        FloatingToolbarPopup.this.positionContentYCoordinatesIfOpeningOverflowUpwards();
                    }
                }
            };
            final float x2 = this.mOverflowButton.getX();
            final float width4 = isInRTLMode() ? (x2 - width2) + this.mOverflowButtonIcon.getWidth() : (width2 + x2) - this.mOverflowButtonIcon.getWidth();
            Animation animation3 = new Animation() {
                @Override
                protected void applyTransformation(float f, Transformation transformation) {
                    float f2 = x2;
                    FloatingToolbarPopup.this.mOverflowButton.setX(f2 + ((width4 - f2) * f) + (FloatingToolbarPopup.this.isInRTLMode() ? 0.0f : FloatingToolbarPopup.this.mContentContainer.getWidth() - width2));
                    float f3 = 1.0f - f;
                    FloatingToolbarPopup.this.mOverflowButtonText.setAlpha(f3);
                    FloatingToolbarPopup.this.mOverflowButtonShadow.setAlpha(f3);
                }
            };
            animation.setInterpolator(this.mFastOutSlowInInterpolator);
            animation.setDuration(getAdjustedDuration(250));
            animation2.setInterpolator(this.mLogAccelerateInterpolator);
            animation2.setDuration(getAdjustedDuration(250));
            animation3.setInterpolator(this.mFastOutSlowInInterpolator);
            animation3.setDuration(getAdjustedDuration(250));
            this.mCloseOverflowAnimation.getAnimations().clear();
            this.mCloseOverflowAnimation.addAnimation(animation);
            this.mCloseOverflowAnimation.addAnimation(animation2);
            this.mCloseOverflowAnimation.addAnimation(animation3);
            this.mContentContainer.startAnimation(this.mCloseOverflowAnimation);
            this.mIsOverflowOpen = false;
            updateOverflowButtonClickListener();
            this.mMainPanel.animate().alpha(1.0f).withLayer().setInterpolator(this.mFastOutLinearInInterpolator).setDuration(100L).start();
            this.mOverflowPanel.animate().alpha(0.0f).withLayer().setInterpolator(this.mLinearOutSlowInInterpolator).setDuration(150L).start();
        }

        public void setPanelsStatesAtRestingPosition() {
            this.mOverflowButton.setEnabled(true);
            this.mOverflowPanel.awakenScrollBars();
            if (this.mIsOverflowOpen) {
                Size size = this.mOverflowPanelSize;
                setSize(this.mContentContainer, size);
                this.mMainPanel.setAlpha(0.0f);
                this.mMainPanel.setVisibility(4);
                this.mOverflowPanel.setAlpha(1.0f);
                this.mOverflowPanel.setVisibility(0);
                this.mOverflowButtonIcon.setImageDrawable(this.mArrow);
                this.mOverflowButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                if (isInRTLMode()) {
                    this.mContentContainer.setX(this.mMarginHorizontal);
                    this.mMainPanel.setX(0.0f);
                    this.mOverflowButton.setX(size.getWidth() - this.mOverflowButtonSize.getWidth());
                    this.mOverflowPanel.setX(0.0f);
                } else {
                    this.mContentContainer.setX((this.mPopupWindow.getWidth() - size.getWidth()) - this.mMarginHorizontal);
                    this.mMainPanel.setX(-this.mContentContainer.getX());
                    this.mOverflowButton.setX(0.0f);
                    this.mOverflowPanel.setX(0.0f);
                }
                if (this.mOpenOverflowUpwards) {
                    this.mContentContainer.setY(this.mMarginVertical);
                    this.mMainPanel.setY(size.getHeight() - this.mContentContainer.getHeight());
                    this.mOverflowButton.setY(size.getHeight() - this.mOverflowButtonSize.getHeight());
                    this.mOverflowPanel.setY(0.0f);
                    return;
                }
                this.mContentContainer.setY(this.mMarginVertical);
                this.mMainPanel.setY(0.0f);
                this.mOverflowButton.setY(0.0f);
                this.mOverflowPanel.setY(this.mOverflowButtonSize.getHeight());
                return;
            }
            Size size2 = this.mMainPanelSize;
            setSize(this.mContentContainer, size2);
            this.mMainPanel.setAlpha(1.0f);
            this.mMainPanel.setVisibility(0);
            this.mOverflowPanel.setAlpha(0.0f);
            this.mOverflowPanel.setVisibility(4);
            this.mOverflowButtonIcon.setImageDrawable(this.mOverflow);
            this.mOverflowButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            if (hasOverflow()) {
                if (isInRTLMode()) {
                    this.mContentContainer.setX(this.mMarginHorizontal);
                    this.mMainPanel.setX(0.0f);
                    this.mOverflowButton.setX(0.0f);
                    this.mOverflowPanel.setX(0.0f);
                } else {
                    this.mContentContainer.setX((this.mPopupWindow.getWidth() - size2.getWidth()) - this.mMarginHorizontal);
                    this.mMainPanel.setX(0.0f);
                    this.mOverflowButton.setX(size2.getWidth() - this.mOverflowButtonSize.getWidth());
                    this.mOverflowPanel.setX(size2.getWidth() - this.mOverflowPanelSize.getWidth());
                }
                if (this.mOpenOverflowUpwards) {
                    this.mContentContainer.setY((this.mMarginVertical + this.mOverflowPanelSize.getHeight()) - size2.getHeight());
                    this.mMainPanel.setY(0.0f);
                    this.mOverflowButton.setY(0.0f);
                    this.mOverflowPanel.setY(size2.getHeight() - this.mOverflowPanelSize.getHeight());
                    return;
                }
                this.mContentContainer.setY(this.mMarginVertical);
                this.mMainPanel.setY(0.0f);
                this.mOverflowButton.setY(0.0f);
                this.mOverflowPanel.setY(this.mOverflowButtonSize.getHeight());
                return;
            }
            this.mContentContainer.setX(this.mMarginHorizontal);
            this.mContentContainer.setY(this.mMarginVertical);
            this.mMainPanel.setX(0.0f);
            this.mMainPanel.setY(0.0f);
        }

        private void updateOverflowHeight(int i) {
            if (hasOverflow()) {
                int iCalculateOverflowHeight = calculateOverflowHeight((i - this.mOverflowButtonSize.getHeight()) / this.mLineHeight);
                if (this.mOverflowPanelSize.getHeight() != iCalculateOverflowHeight) {
                    this.mOverflowPanelSize = new Size(this.mOverflowPanelSize.getWidth(), iCalculateOverflowHeight);
                }
                setSize(this.mOverflowPanel, this.mOverflowPanelSize);
                if (this.mIsOverflowOpen) {
                    setSize(this.mContentContainer, this.mOverflowPanelSize);
                    if (this.mOpenOverflowUpwards) {
                        int height = this.mOverflowPanelSize.getHeight() - iCalculateOverflowHeight;
                        ViewGroup viewGroup = this.mContentContainer;
                        float f = height;
                        viewGroup.setY(viewGroup.getY() + f);
                        FrameLayout frameLayout = this.mOverflowButton;
                        frameLayout.setY(frameLayout.getY() - f);
                    }
                } else {
                    setSize(this.mContentContainer, this.mMainPanelSize);
                }
                updatePopupSize();
            }
        }

        private void updatePopupSize() {
            int iMax;
            Size size = this.mMainPanelSize;
            int iMax2 = 0;
            if (size != null) {
                iMax = Math.max(0, size.getWidth());
                iMax2 = Math.max(0, this.mMainPanelSize.getHeight());
            } else {
                iMax = 0;
            }
            Size size2 = this.mOverflowPanelSize;
            if (size2 != null) {
                iMax = Math.max(iMax, size2.getWidth());
                iMax2 = Math.max(iMax2, this.mOverflowPanelSize.getHeight());
            }
            this.mPopupWindow.setWidth(iMax + (this.mMarginHorizontal * 2));
            this.mPopupWindow.setHeight(iMax2 + (this.mMarginVertical * 2));
            maybeComputeTransitionDurationScale();
        }

        private void refreshViewPort() {
            this.mParent.getWindowVisibleDisplayFrame(this.mViewPortOnScreen);
        }

        private int getAdjustedToolbarWidth(int i) {
            refreshViewPort();
            int iWidth = this.mViewPortOnScreen.width() - (AndroidUtilities.dp(16.0f) * 2);
            if (i <= 0) {
                i = AndroidUtilities.dp(400.0f);
            }
            return Math.min(i, iWidth);
        }

        private void setZeroTouchableSurface() {
            this.mTouchableRegion.setEmpty();
        }

        public void setContentAreaAsTouchableSurface() {
            int width;
            int height;
            if (this.mIsOverflowOpen) {
                width = this.mOverflowPanelSize.getWidth();
                height = this.mOverflowPanelSize.getHeight();
            } else {
                width = this.mMainPanelSize.getWidth();
                height = this.mMainPanelSize.getHeight();
            }
            this.mTouchableRegion.set((int) this.mContentContainer.getX(), (int) this.mContentContainer.getY(), ((int) this.mContentContainer.getX()) + width, ((int) this.mContentContainer.getY()) + height);
        }

        private boolean hasOverflow() {
            return this.mOverflowPanelSize != null;
        }

        public List layoutMainPanelItems(List list, int i) {
            LinearLayout linearLayout = this.mMainPanelButtons;
            if (linearLayout == null) {
                linearLayout = this.mMainPanel;
            }
            LinkedList linkedList = new LinkedList(list);
            Iterator it = linkedList.iterator();
            int i2 = i;
            boolean z = true;
            while (it.hasNext()) {
                MenuItem menuItem = (MenuItem) it.next();
                boolean zHasNext = it.hasNext();
                boolean z2 = !zHasNext;
                if (menuItem == null || FloatingToolbar.this.premiumLockClickListener == null || !FloatingToolbar.premiumOptions.contains(Integer.valueOf(menuItem.getItemId()))) {
                    View viewCreateMenuItemButton = FloatingToolbar.this.createMenuItemButton(this.mContext, menuItem, this.mIconTextSpacing, false, z, z2);
                    if (viewCreateMenuItemButton instanceof LinearLayout) {
                        ((LinearLayout) viewCreateMenuItemButton).setGravity(17);
                    }
                    viewCreateMenuItemButton.setPaddingRelative((int) ((z ? 1.5d : 1.0d) * ((double) viewCreateMenuItemButton.getPaddingStart())), viewCreateMenuItemButton.getPaddingTop(), (int) (((double) viewCreateMenuItemButton.getPaddingEnd()) * (zHasNext ? 1.0d : 1.5d)), viewCreateMenuItemButton.getPaddingBottom());
                    viewCreateMenuItemButton.measure(0, 0);
                    int iMin = Math.min(viewCreateMenuItemButton.getMeasuredWidth(), i);
                    boolean z3 = iMin <= i2 - this.mOverflowButtonSize.getWidth();
                    boolean z4 = !zHasNext && iMin <= i2;
                    if (!z3 && !z4) {
                        break;
                    }
                    setButtonTagAndClickListener(viewCreateMenuItemButton, menuItem);
                    linearLayout.addView(viewCreateMenuItemButton);
                    ViewGroup.LayoutParams layoutParams = viewCreateMenuItemButton.getLayoutParams();
                    layoutParams.width = iMin;
                    viewCreateMenuItemButton.setLayoutParams(layoutParams);
                    i2 -= iMin;
                    it.remove();
                    z = false;
                }
            }
            if (!linkedList.isEmpty()) {
                linearLayout.setPaddingRelative(0, 0, this.mOverflowButtonSize.getWidth(), 0);
            }
            this.mMainPanelSize = measure(this.mMainPanel);
            return linkedList;
        }

        private void layoutOverflowPanelItems(List list) {
            ArrayAdapter arrayAdapter = (ArrayAdapter) this.mOverflowPanel.getAdapter();
            arrayAdapter.clear();
            if (FloatingToolbar.this.premiumLockClickListener != null) {
                Collections.sort(list, new Comparator() {
                    @Override
                    public final int compare(Object obj, Object obj2) {
                        return FloatingToolbar.FloatingToolbarPopup.$r8$lambda$XSUKhezwtykLqi5URcVn9bL2ahs((MenuItem) obj, (MenuItem) obj2);
                    }
                });
            }
            int size = list.size();
            boolean zPremiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
            for (int i = 0; i < size; i++) {
                MenuItem menuItem = (MenuItem) list.get(i);
                boolean z = true;
                if (FloatingToolbar.this.premiumLockClickListener != null && FloatingToolbar.premiumOptions.contains(Integer.valueOf(menuItem.getItemId()))) {
                    z = true ^ zPremiumFeaturesBlocked;
                }
                if (z) {
                    arrayAdapter.add(menuItem);
                }
            }
            this.mOverflowPanel.setAdapter((ListAdapter) arrayAdapter);
            if (this.mOpenOverflowUpwards) {
                this.mOverflowPanel.setY(0.0f);
            } else {
                this.mOverflowPanel.setY(this.mOverflowButtonSize.getHeight());
            }
            Size size2 = new Size(Math.max(getOverflowWidth(), this.mOverflowButtonSize.getWidth()), calculateOverflowHeight(4));
            this.mOverflowPanelSize = size2;
            setSize(this.mOverflowPanel, size2);
        }

        public static int $r8$lambda$XSUKhezwtykLqi5URcVn9bL2ahs(MenuItem menuItem, MenuItem menuItem2) {
            List list = FloatingToolbar.premiumOptions;
            return (list.contains(Integer.valueOf(menuItem.getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(menuItem2.getItemId())) ? 1 : 0);
        }

        private void preparePopupContent() {
            this.mContentContainer.removeAllViews();
            if (hasOverflow()) {
                this.mContentContainer.addView(this.mOverflowPanel);
            }
            this.mContentContainer.addView(this.mMainPanel);
            if (hasOverflow()) {
                this.mContentContainer.addView(this.mOverflowButton);
            }
            setPanelsStatesAtRestingPosition();
            setContentAreaAsTouchableSurface();
            if (isInRTLMode()) {
                this.mContentContainer.setAlpha(0.0f);
                this.mContentContainer.post(this.mPreparePopupContentRTLHelper);
            }
        }

        private void clearPanels() {
            this.mOverflowPanelSize = null;
            this.mMainPanelSize = null;
            this.mIsOverflowOpen = false;
            updateOverflowButtonClickListener();
            this.mMainPanel.removeAllViews();
            this.mMainPanel.setPaddingRelative(0, 0, 0, 0);
            ArrayAdapter arrayAdapter = (ArrayAdapter) this.mOverflowPanel.getAdapter();
            arrayAdapter.clear();
            this.mOverflowPanel.setAdapter((ListAdapter) arrayAdapter);
            this.mContentContainer.removeAllViews();
        }

        public void positionContentYCoordinatesIfOpeningOverflowUpwards() {
            if (this.mOpenOverflowUpwards) {
                this.mMainPanel.setY(this.mContentContainer.getHeight() - this.mMainPanelSize.getHeight());
                this.mOverflowButton.setY(this.mContentContainer.getHeight() - this.mOverflowButton.getHeight());
                this.mOverflowPanel.setY(this.mContentContainer.getHeight() - this.mOverflowPanelSize.getHeight());
            }
        }

        private int getOverflowWidth() {
            int count = this.mOverflowPanel.getAdapter().getCount();
            int iMax = 0;
            for (int i = 0; i < count; i++) {
                iMax = Math.max(this.mOverflowPanelViewHelper.calculateWidth((MenuItem) this.mOverflowPanel.getAdapter().getItem(i)), iMax);
            }
            return iMax;
        }

        private int calculateOverflowHeight(int i) {
            int iMin = Math.min(4, Math.min(Math.max(2, i), this.mOverflowPanel.getCount()));
            return (iMin * this.mLineHeight) + this.mOverflowButtonSize.getHeight() + (iMin < this.mOverflowPanel.getCount() ? (int) (this.mLineHeight * 0.5f) : 0);
        }

        private void setButtonTagAndClickListener(View view, MenuItem menuItem) {
            view.setTag(menuItem);
            view.setOnClickListener(this.mMenuItemButtonOnClickListener);
        }

        private int getAdjustedDuration(int i) {
            int i2 = this.mTransitionDurationScale;
            if (i2 < 150) {
                return Math.max(i - 50, 0);
            }
            return i2 > 300 ? i + 50 : i;
        }

        private void maybeComputeTransitionDurationScale() {
            Size size = this.mMainPanelSize;
            if (size == null || this.mOverflowPanelSize == null) {
                return;
            }
            int width = size.getWidth() - this.mOverflowPanelSize.getWidth();
            int height = this.mOverflowPanelSize.getHeight() - this.mMainPanelSize.getHeight();
            this.mTransitionDurationScale = (int) (Math.sqrt((width * width) + (height * height)) / ((double) this.mContentContainer.getContext().getResources().getDisplayMetrics().density));
        }

        private LinearLayout createMainPanel() {
            return new LinearLayout(this.mContext) {
                @Override
                protected void onMeasure(int i, int i2) {
                    if (FloatingToolbarPopup.this.isOverflowAnimating() && FloatingToolbarPopup.this.mMainPanelSize != null) {
                        i = View.MeasureSpec.makeMeasureSpec(FloatingToolbarPopup.this.mMainPanelSize.getWidth(), 1073741824);
                    }
                    super.onMeasure(i, i2);
                }

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    return FloatingToolbarPopup.this.isOverflowAnimating();
                }
            };
        }

        private OverflowPanel createOverflowPanel() {
            final OverflowPanel overflowPanel = new OverflowPanel(this);
            overflowPanel.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            overflowPanel.setDivider(null);
            overflowPanel.setDividerHeight(0);
            ArrayAdapter arrayAdapter = new ArrayAdapter(this.mContext, 0) {
                @Override
                public View getView(int i, View view, ViewGroup viewGroup) {
                    return FloatingToolbarPopup.this.mOverflowPanelViewHelper.getView((MenuItem) getItem(i), FloatingToolbarPopup.this.mOverflowPanelSize.getWidth(), view);
                }
            };
            overflowPanel.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
            overflowPanel.setClipToPadding(false);
            overflowPanel.setAdapter((ListAdapter) arrayAdapter);
            overflowPanel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                    FloatingToolbar.FloatingToolbarPopup.$r8$lambda$8oCyUbqeLXvygnXItlA5PaejVkw(this.f$0, overflowPanel, adapterView, view, i, j);
                }
            });
            return overflowPanel;
        }

        public static void $r8$lambda$8oCyUbqeLXvygnXItlA5PaejVkw(FloatingToolbarPopup floatingToolbarPopup, OverflowPanel overflowPanel, AdapterView adapterView, View view, int i, long j) {
            floatingToolbarPopup.getClass();
            MenuItem menuItem = (MenuItem) overflowPanel.getAdapter().getItem(i);
            if (FloatingToolbar.this.premiumLockClickListener != null && FloatingToolbar.premiumOptions.contains(Integer.valueOf(menuItem.getItemId()))) {
                int i2 = -floatingToolbarPopup.shiftDp;
                floatingToolbarPopup.shiftDp = i2;
                AndroidUtilities.shakeViewSpring(view, i2);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                FloatingToolbar.this.premiumLockClickListener.run();
                return;
            }
            MenuItem.OnMenuItemClickListener onMenuItemClickListener = floatingToolbarPopup.mOnMenuItemClickListener;
            if (onMenuItemClickListener != null) {
                onMenuItemClickListener.onMenuItemClick(menuItem);
            }
        }

        public boolean isOverflowAnimating() {
            return (this.mOpenOverflowAnimation.hasStarted() && !this.mOpenOverflowAnimation.hasEnded()) || (this.mCloseOverflowAnimation.hasStarted() && !this.mCloseOverflowAnimation.hasEnded());
        }

        class AnonymousClass14 implements Animation.AnimationListener {
            @Override
            public void onAnimationRepeat(Animation animation) {
            }

            AnonymousClass14() {
            }

            @Override
            public void onAnimationStart(Animation animation) {
                FloatingToolbarPopup.this.mOverflowButton.setEnabled(false);
                FloatingToolbarPopup.this.mMainPanel.setVisibility(0);
                FloatingToolbarPopup.this.mOverflowPanel.setVisibility(0);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                FloatingToolbarPopup.this.mContentContainer.post(new Runnable() {
                    @Override
                    public final void run() {
                        FloatingToolbar.FloatingToolbarPopup.AnonymousClass14.m1267$r8$lambda$5Su373lkHwAC9hTmvadhNQz8Ig(this.f$0);
                    }
                });
            }

            public static void m1267$r8$lambda$5Su373lkHwAC9hTmvadhNQz8Ig(AnonymousClass14 anonymousClass14) {
                FloatingToolbarPopup.this.setPanelsStatesAtRestingPosition();
                FloatingToolbarPopup.this.setContentAreaAsTouchableSurface();
            }
        }

        private Animation.AnimationListener createOverflowAnimationListener() {
            return new AnonymousClass14();
        }

        private Size measure(View view) {
            view.measure(0, 0);
            return new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private void setSize(View view, int i, int i2) {
            view.setMinimumWidth(i);
            view.setMinimumHeight(i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(0, 0);
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }

        private void setSize(View view, Size size) {
            setSize(view, size.getWidth(), size.getHeight());
        }

        public void setWidth(View view, int i) {
            setSize(view, i, view.getLayoutParams().height);
        }

        public void setHeight(View view, int i) {
            setSize(view, view.getLayoutParams().width, i);
        }

        final class OverflowPanel extends ListView {
            private final int fadeH;
            private final FloatingToolbarPopup mPopup;
            private final Matrix matrix;
            private final Paint paintBottom;
            private final Paint paintTop;
            private final Shader shaderBottom;
            private final Shader shaderTop;

            OverflowPanel(FloatingToolbarPopup floatingToolbarPopup) {
                super(floatingToolbarPopup.mContext);
                this.fadeH = 16;
                float fDp = AndroidUtilities.dp(16.0f);
                int[] iArrGenerateColors = generateColors(-16777216);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, fDp, 0.0f, 0.0f, iArrGenerateColors, (float[]) null, tileMode);
                this.shaderTop = linearGradient;
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), generateColors(-16777216), (float[]) null, tileMode);
                this.shaderBottom = linearGradient2;
                Paint paint = new Paint(1);
                this.paintTop = paint;
                Paint paint2 = new Paint(1);
                this.paintBottom = paint2;
                this.matrix = new Matrix();
                paint.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                paint2.setShader(linearGradient2);
                paint2.setXfermode(new PorterDuffXfermode(mode));
                this.mPopup = floatingToolbarPopup;
                setVerticalScrollBarEnabled(false);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.mPopup.mOverflowPanelSize.getHeight() - this.mPopup.mOverflowButtonSize.getHeight(), 1073741824));
            }

            private int[] generateColors(int i) {
                int[] iArr = new int[8];
                GradientProtectionDrawable.fillColors(GradientProtectionDrawable.DEFAULT_INTERPOLATOR, i, iArr);
                return iArr;
            }

            @Override
            protected void onSizeChanged(int i, int i2, int i3, int i4) {
                this.matrix.reset();
                this.matrix.postTranslate(0.0f, i2 - AndroidUtilities.dp(16.0f));
                this.shaderBottom.setLocalMatrix(this.matrix);
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                float y = view.getY();
                float height = y + view.getHeight();
                boolean z = y < ((float) AndroidUtilities.dp(16.0f));
                boolean z2 = height > ((float) (getHeight() - AndroidUtilities.dp(16.0f)));
                if (z || z2) {
                    canvas.saveLayer(0.0f, y, getWidth(), height, null);
                    boolean zDrawChild = super.drawChild(canvas, view, j);
                    if (z) {
                        canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.paintTop);
                    }
                    if (z2) {
                        canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.paintBottom);
                    }
                    canvas.restore();
                    return zDrawChild;
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (this.mPopup.isOverflowAnimating()) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            protected boolean awakenScrollBars() {
                return super.awakenScrollBars();
            }
        }

        private final class LogAccelerateInterpolator implements Interpolator {
            private final int BASE;
            private final float LOGS_SCALE;

            private LogAccelerateInterpolator() {
                this.BASE = 100;
                this.LOGS_SCALE = 1.0f / computeLog(1.0f, 100);
            }

            private float computeLog(float f, int i) {
                return (float) (1.0d - Math.pow(i, -f));
            }

            @Override
            public float getInterpolation(float f) {
                return 1.0f - (computeLog(1.0f - f, 100) * this.LOGS_SCALE);
            }
        }

        private final class OverflowPanelViewHelper {
            private final Context mContext;
            private final int mIconTextSpacing;
            private final int mSidePadding = AndroidUtilities.dp(18.0f);
            private final View mCalculator = createMenuButton(null);

            public OverflowPanelViewHelper(Context context, int i) {
                this.mContext = context;
                this.mIconTextSpacing = i;
            }

            public View getView(MenuItem menuItem, int i, View view) {
                if (view != null) {
                    FloatingToolbar.updateMenuItemButton(view, menuItem, this.mIconTextSpacing, FloatingToolbar.this.premiumLockClickListener != null);
                } else {
                    view = createMenuButton(menuItem);
                }
                view.setMinimumWidth(i);
                return view;
            }

            public int calculateWidth(MenuItem menuItem) {
                FloatingToolbar.updateMenuItemButton(this.mCalculator, menuItem, this.mIconTextSpacing, FloatingToolbar.this.premiumLockClickListener != null);
                this.mCalculator.measure(0, 0);
                return this.mCalculator.getMeasuredWidth();
            }

            private View createMenuButton(MenuItem menuItem) {
                View viewCreateMenuItemButton = FloatingToolbar.this.createMenuItemButton(this.mContext, menuItem, this.mIconTextSpacing, true, false, false);
                int i = this.mSidePadding;
                viewCreateMenuItemButton.setPadding(i, 0, i, 0);
                return viewCreateMenuItemButton;
            }
        }
    }

    public View createMenuItemButton(Context context, MenuItem menuItem, int i, boolean z, boolean z2, boolean z3) {
        int themedColor;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int themedColor2 = getThemedColor(Theme.key_listSelector);
        int i2 = this.currentStyle;
        if (i2 == 0) {
            themedColor = getThemedColor(Theme.key_dialogTextBlack);
            textView.setTextColor(themedColor);
        } else if (i2 == 2) {
            themedColor = -328966;
            textView.setTextColor(-328966);
            themedColor2 = 553648127;
        } else if (i2 == 1) {
            themedColor = getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
            textView.setTextColor(themedColor);
        } else {
            themedColor = getThemedColor(Theme.key_windowBackgroundWhiteBlackText);
        }
        if (z2 || z3) {
            linearLayout.setBackground(Theme.createRadSelectorDrawable(themedColor2, z2 ? 12 : 0, z3 ? 12 : 0, z3 ? 12 : 0, z2 ? 12 : 0));
        } else {
            linearLayout.setBackground(Theme.getSelectorDrawable(themedColor2, false));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(themedColor, 0.4f), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            updateMenuItemButton(linearLayout, menuItem, i, this.premiumLockClickListener != null);
        }
        return linearLayout;
    }

    public static void updateMenuItemButton(View view, MenuItem menuItem, int i, boolean z) {
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        }
        textView.setPaddingRelative(0, 0, 0, 0);
        viewGroup.getChildAt(2).setVisibility(z && premiumOptions.contains(Integer.valueOf(menuItem.getItemId())) ? 0 : 8);
    }

    public ViewGroup createContentContainer(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iDp = AndroidUtilities.dp(20.0f);
        marginLayoutParams.rightMargin = iDp;
        marginLayoutParams.topMargin = iDp;
        marginLayoutParams.leftMargin = iDp;
        marginLayoutParams.bottomMargin = iDp;
        relativeLayout.setLayoutParams(marginLayoutParams);
        relativeLayout.setElevation(AndroidUtilities.dp(1.0f));
        relativeLayout.setFocusable(true);
        relativeLayout.setFocusableInTouchMode(true);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.blurredBackgroundDrawableViewFactory;
        if (blurredBackgroundDrawableViewFactory != null) {
            relativeLayout.setBackground(blurredBackgroundDrawableViewFactory.create((View) relativeLayout, true).setColorProvider(BlurredBackgroundProviderImpl.photoViewerMenu(this.resourcesProvider)).setRadius(AndroidUtilities.dp(12.0f)));
        } else {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float fDp = AndroidUtilities.dp(12.0f);
            gradientDrawable.setCornerRadii(new float[]{fDp, fDp, fDp, fDp, fDp, fDp, fDp, fDp});
            int i = this.currentStyle;
            if (i == 0) {
                gradientDrawable.setColor(getThemedColor(Theme.key_dialogBackground));
            } else if (i == 2) {
                gradientDrawable.setColor(-115203550);
            } else if (i == 1) {
                gradientDrawable.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
            }
            relativeLayout.setBackground(gradientDrawable);
        }
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        relativeLayout.setClipToOutline(true);
        return relativeLayout;
    }

    public int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public static PopupWindow createPopupWindow(ViewGroup viewGroup) {
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext()) {
            private final int[] p = new int[2];
            private View downRootView = null;

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return super.onInterceptTouchEvent(motionEvent);
            }

            private boolean isParent(View view, View view2) {
                if (view == view2) {
                    return true;
                }
                if (view.getParent() == null) {
                    return false;
                }
                if (view.getParent() instanceof View) {
                    return isParent((View) view.getParent(), view2);
                }
                return view.getParent() == view2 || view.getRootView() == view2;
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                if (!zDispatchTouchEvent) {
                    getLocationOnScreen(this.p);
                    int[] iArr = this.p;
                    motionEvent.offsetLocation(iArr[0], iArr[1]);
                    if (motionEvent.getAction() == 0) {
                        List<View> listAllGlobalViews = AndroidUtilities.allGlobalViews();
                        if (listAllGlobalViews != null && listAllGlobalViews.size() > 1) {
                            for (int size = listAllGlobalViews.size() - 2; size >= 0; size--) {
                                View view = listAllGlobalViews.get(size);
                                if (!isParent(this, view)) {
                                    view.getLocationOnScreen(this.p);
                                    int[] iArr2 = this.p;
                                    motionEvent.offsetLocation(-iArr2[0], -iArr2[1]);
                                    zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                    if (zDispatchTouchEvent) {
                                        this.downRootView = view;
                                        return true;
                                    }
                                    int[] iArr3 = this.p;
                                    motionEvent.offsetLocation(iArr3[0], iArr3[1]);
                                }
                            }
                        }
                    } else {
                        View view2 = this.downRootView;
                        if (view2 != null) {
                            view2.getLocationOnScreen(this.p);
                            int[] iArr4 = this.p;
                            motionEvent.offsetLocation(-iArr4[0], -iArr4[1]);
                            zDispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                        }
                    }
                }
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    return zDispatchTouchEvent;
                }
                this.downRootView = null;
                return zDispatchTouchEvent;
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }
        };
        PopupWindow popupWindow = new PopupWindow(linearLayout);
        popupWindow.setClippingEnabled(false);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setSplitTouchEnabled(true);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(viewGroup);
        return popupWindow;
    }

    public static AnimatorSet createEnterAnimation(View view) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        return animatorSet;
    }

    public static AnimatorSet createExitAnimation(View view, int i, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }
}

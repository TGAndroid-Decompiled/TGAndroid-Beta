package org.telegram.p009ui.ActionBar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.SharedConfig;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BackButtonMenu;
import org.telegram.p009ui.LNavigation.C3414LNavigation;

public interface INavigationLayout {

    public enum BackButtonState {
        BACK,
        MENU
    }

    public interface IBackButtonDrawable {
        BackButtonState getBackButtonState();
    }

    boolean addFragmentToStack(BaseFragment baseFragment);

    boolean addFragmentToStack(BaseFragment baseFragment, int i);

    void animateThemedValues(ThemeAnimationSettings themeAnimationSettings, Runnable runnable);

    void animateThemedValues(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2);

    void animateThemedValues(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2, Runnable runnable);

    boolean checkTransitionAnimation();

    void closeLastFragment();

    void closeLastFragment(boolean z);

    void closeLastFragment(boolean z, boolean z2);

    void dismissDialogs();

    void drawCurrentPreviewFragment(Canvas canvas, Drawable drawable);

    void drawHeaderShadow(Canvas canvas, int i);

    void drawHeaderShadow(Canvas canvas, int i, int i2);

    void expandPreviewFragment();

    boolean extendActionMode(Menu menu);

    void finishPreviewFragment();

    float getCurrentPreviewFragmentAlpha();

    DrawerLayoutContainer getDrawerLayoutContainer();

    List<BaseFragment> getFragmentStack();

    BaseFragment getLastFragment();

    Theme.MessageDrawable getMessageDrawableOutMediaStart();

    Theme.MessageDrawable getMessageDrawableOutStart();

    ViewGroup getOverlayContainerView();

    Activity getParentActivity();

    List<BackButtonMenu.PulledDialog> getPulledDialogs();

    float getThemeAnimationValue();

    ViewGroup getView();

    boolean hasIntegratedBlurInPreview();

    boolean isActionBarInCrossfade();

    boolean isInBubbleMode();

    boolean isInPreviewMode();

    boolean isPreviewOpenAnimationInProgress();

    boolean isSwipeInProgress();

    boolean isTransitionAnimationInProgress();

    void movePreviewFragment(float f);

    void onActionModeFinished(Object obj);

    void onActionModeStarted(Object obj);

    void onBackPressed();

    void onLowMemory();

    void onPause();

    void onResume();

    void onUserLeaveHint();

    boolean presentFragment(BaseFragment baseFragment);

    boolean presentFragment(BaseFragment baseFragment, boolean z);

    @Deprecated
    boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, boolean z4);

    @Deprecated
    boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2, boolean z3, boolean z4, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout);

    boolean presentFragment(NavigationParams navigationParams);

    boolean presentFragmentAsPreview(BaseFragment baseFragment);

    boolean presentFragmentAsPreviewWithMenu(BaseFragment baseFragment, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout);

    @Deprecated
    void rebuildAllFragmentViews(boolean z, boolean z2);

    void rebuildFragments(int i);

    @Deprecated
    void rebuildLogout();

    void removeAllFragments();

    void removeFragmentFromStack(int i);

    void removeFragmentFromStack(BaseFragment baseFragment);

    void resumeDelayedFragmentAnimation();

    void setBackgroundView(View view);

    void setDelegate(INavigationLayoutDelegate iNavigationLayoutDelegate);

    void setDrawerLayoutContainer(DrawerLayoutContainer drawerLayoutContainer);

    void setFragmentPanTranslationOffset(int i);

    void setFragmentStack(List<BaseFragment> list);

    void setFragmentStackChangedListener(Runnable runnable);

    void setHighlightActionButtons(boolean z);

    void setInBubbleMode(boolean z);

    void setPulledDialogs(List<BackButtonMenu.PulledDialog> list);

    void setRemoveActionBarExtraHeight(boolean z);

    void setTitleOverlayText(String str, int i, Runnable runnable);

    void setUseAlphaAnimations(boolean z);

    @Deprecated
    void showLastFragment();

    void startActivityForResult(Intent intent, int i);

    public final class CC {
        public static boolean $default$hasIntegratedBlurInPreview(INavigationLayout iNavigationLayout) {
            return false;
        }

        public static boolean $default$isActionBarInCrossfade(INavigationLayout iNavigationLayout) {
            return false;
        }

        @Deprecated
        public static void $default$rebuildAllFragmentViews(INavigationLayout iNavigationLayout, boolean z, boolean z2) {
        }

        @Deprecated
        public static void $default$rebuildLogout(INavigationLayout iNavigationLayout) {
        }

        public static INavigationLayout newLayout(Context context) {
            return SharedConfig.useLNavigation ? new C3414LNavigation(context) : new ActionBarLayout(context);
        }

        public static void $default$rebuildFragments(INavigationLayout _this, int i) {
            if ((i & 2) != 0) {
                _this.showLastFragment();
                return;
            }
            boolean z = (i & 1) != 0;
            _this.rebuildAllFragmentViews(z, z);
        }

        public static BaseFragment $default$getBackgroundFragment(INavigationLayout _this) {
            if (_this.getFragmentStack().size() <= 1) {
                return null;
            }
            return _this.getFragmentStack().get(_this.getFragmentStack().size() - 2);
        }

        public static BaseFragment $default$getLastFragment(INavigationLayout _this) {
            if (_this.getFragmentStack().isEmpty()) {
                return null;
            }
            return _this.getFragmentStack().get(_this.getFragmentStack().size() - 1);
        }

        public static void $default$removeAllFragments(INavigationLayout _this) {
            Iterator it = new ArrayList(_this.getFragmentStack()).iterator();
            while (it.hasNext()) {
                _this.removeFragmentFromStack((BaseFragment) it.next());
            }
        }

        public static Activity $default$getParentActivity(INavigationLayout _this) {
            Context context = _this.getView().getContext();
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new IllegalArgumentException("NavigationLayout added in non-activity context!");
        }

        public static ViewGroup $default$getView(INavigationLayout _this) {
            if (_this instanceof ViewGroup) {
                return (ViewGroup) _this;
            }
            throw new IllegalArgumentException("You should override getView() if you're not inheriting from it.");
        }

        public static void $default$removeFragmentFromStack(INavigationLayout _this, int i) {
            if (i < 0 || i >= _this.getFragmentStack().size()) {
                return;
            }
            _this.removeFragmentFromStack(_this.getFragmentStack().get(i));
        }

        public static void $default$dismissDialogs(INavigationLayout _this) {
            List<BaseFragment> fragmentStack = _this.getFragmentStack();
            if (fragmentStack.isEmpty()) {
                return;
            }
            fragmentStack.get(fragmentStack.size() - 1).dismissCurrentDialog();
        }
    }

    public interface INavigationLayoutDelegate {
        boolean needAddFragmentToStack(BaseFragment baseFragment, INavigationLayout iNavigationLayout);

        boolean needCloseLastFragment(INavigationLayout iNavigationLayout);

        boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout);

        boolean needPresentFragment(INavigationLayout iNavigationLayout, NavigationParams navigationParams);

        void onMeasureOverride(int[] iArr);

        boolean onPreIme();

        void onRebuildAllFragments(INavigationLayout iNavigationLayout, boolean z);

        void onThemeProgress(float f);

        public final class CC {
            public static boolean $default$needAddFragmentToStack(INavigationLayoutDelegate iNavigationLayoutDelegate, BaseFragment baseFragment, INavigationLayout iNavigationLayout) {
                return true;
            }

            public static boolean $default$needPresentFragment(INavigationLayoutDelegate iNavigationLayoutDelegate, BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout) {
                return true;
            }

            public static void $default$onMeasureOverride(INavigationLayoutDelegate iNavigationLayoutDelegate, int[] iArr) {
            }

            public static boolean $default$onPreIme(INavigationLayoutDelegate iNavigationLayoutDelegate) {
                return false;
            }

            public static void $default$onRebuildAllFragments(INavigationLayoutDelegate iNavigationLayoutDelegate, INavigationLayout iNavigationLayout, boolean z) {
            }

            public static void $default$onThemeProgress(INavigationLayoutDelegate iNavigationLayoutDelegate, float f) {
            }
        }
    }

    public static class NavigationParams {
        public boolean checkPresentFromDelegate = true;
        public boolean delayDone;
        public BaseFragment fragment;
        public boolean isFromDelay;
        public ActionBarPopupWindow.ActionBarPopupWindowLayout menuView;
        public boolean needDelayWithoutAnimation;
        public boolean noAnimation;
        public boolean preview;
        public boolean removeLast;

        public NavigationParams(BaseFragment baseFragment) {
            this.fragment = baseFragment;
        }

        public NavigationParams setRemoveLast(boolean z) {
            this.removeLast = z;
            return this;
        }

        public NavigationParams setNoAnimation(boolean z) {
            this.noAnimation = z;
            return this;
        }

        public NavigationParams setCheckPresentFromDelegate(boolean z) {
            this.checkPresentFromDelegate = z;
            return this;
        }

        public NavigationParams setPreview(boolean z) {
            this.preview = z;
            return this;
        }

        public NavigationParams setMenuView(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            this.menuView = actionBarPopupWindowLayout;
            return this;
        }
    }

    public static class ThemeAnimationSettings {
        public final int accentId;
        public Runnable afterAnimationRunnable;
        public Runnable afterStartDescriptionsAddedRunnable;
        public onAnimationProgress animationProgress;
        public Runnable beforeAnimationRunnable;
        public final boolean instant;
        public final boolean nightTheme;
        public boolean onlyTopFragment;
        public Theme.ResourcesProvider resourcesProvider;
        public final Theme.ThemeInfo theme;
        public boolean applyTheme = true;
        public long duration = 200;

        public interface onAnimationProgress {
            void setProgress(float f);
        }

        public ThemeAnimationSettings(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2) {
            this.theme = themeInfo;
            this.accentId = i;
            this.nightTheme = z;
            this.instant = z2;
        }
    }

    public static class StartColorsProvider implements Theme.ResourcesProvider {
        HashMap<String, Integer> colors = new HashMap<>();
        String[] keysToSave = {"chat_outBubble", "chat_outBubbleGradient", "chat_outBubbleGradient2", "chat_outBubbleGradient3", "chat_outBubbleGradientAnimated", "chat_outBubbleShadow"};

        @Override
        public void applyServiceShaderMatrix(int i, int i2, float f, float f2) {
            Theme.applyServiceShaderMatrix(i, i2, f, f2);
        }

        @Override
        public int getColorOrDefault(String str) {
            return getColor(str);
        }

        @Override
        public Drawable getDrawable(String str) {
            return Theme.ResourcesProvider.CC.$default$getDrawable(this, str);
        }

        @Override
        public Paint getPaint(String str) {
            return Theme.ResourcesProvider.CC.$default$getPaint(this, str);
        }

        @Override
        public boolean hasGradientService() {
            return Theme.ResourcesProvider.CC.$default$hasGradientService(this);
        }

        @Override
        public void setAnimatedColor(String str, int i) {
            Theme.ResourcesProvider.CC.$default$setAnimatedColor(this, str, i);
        }

        @Override
        public Integer getColor(String str) {
            return this.colors.get(str);
        }

        @Override
        public Integer getCurrentColor(String str) {
            return this.colors.get(str);
        }

        public void saveColors(Theme.ResourcesProvider resourcesProvider) {
            String[] strArr;
            this.colors.clear();
            for (String str : this.keysToSave) {
                this.colors.put(str, resourcesProvider.getCurrentColor(str));
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import java.util.List;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2;

public interface INavigationLayout {

    public final class BackButtonState {
        public static final BackButtonState[] $VALUES;
        public static final BackButtonState BACK;
        public static final BackButtonState MENU;

        static {
            BackButtonState backButtonState = new BackButtonState("BACK", 0);
            BACK = backButtonState;
            BackButtonState backButtonState2 = new BackButtonState("MENU", 1);
            MENU = backButtonState2;
            $VALUES = new BackButtonState[]{backButtonState, backButtonState2};
        }

        public static BackButtonState valueOf(String str) {
            return (BackButtonState) Enum.valueOf(BackButtonState.class, str);
        }

        public static BackButtonState[] values() {
            return (BackButtonState[]) $VALUES.clone();
        }
    }

    public interface INavigationLayoutDelegate {
        boolean needAddFragmentToStack(ActionBarLayout actionBarLayout, BaseFragment baseFragment);

        boolean needCloseLastFragment(ActionBarLayout actionBarLayout);

        boolean needPresentFragment(ActionBarLayout actionBarLayout, NavigationParams navigationParams);

        void onMeasureOverride(int[] iArr);

        boolean onPreIme();

        void onRebuildAllFragments(ActionBarLayout actionBarLayout, boolean z);

        void onThemeProgress(float f);
    }

    public final class NavigationParams {
        public boolean checkPresentFromDelegate = true;
        public boolean forceRightLayout;
        public final BaseFragment fragment;
        public ActionBarPopupWindow.ActionBarPopupWindowLayout menuView;
        public boolean noAnimation;
        public boolean preview;
        public boolean removeLast;

        public NavigationParams(BaseFragment baseFragment) {
            this.fragment = baseFragment;
        }

        public final void setNoAnimation() {
            this.noAnimation = true;
        }

        public final void setRemoveLast(boolean z) {
            this.removeLast = z;
        }
    }

    public final class ThemeAnimationSettings {
        public final int accentId;
        public ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 afterAnimationRunnable;
        public Runnable afterStartDescriptionsAddedRunnable;
        public ChatActivity.ThemeDelegate.AnonymousClass1 animationProgress;
        public ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 beforeAnimationRunnable;
        public final boolean instant;
        public final boolean nightTheme;
        public boolean onlyTopFragment;
        public Theme.ResourcesProvider resourcesProvider;
        public final Theme.ThemeInfo theme;
        public boolean applyTheme = true;
        public boolean applyTrulyTheme = true;
        public long duration = 200;

        public ThemeAnimationSettings(Theme.ThemeInfo themeInfo, int i, boolean z, boolean z2) {
            this.theme = themeInfo;
            this.accentId = i;
            this.nightTheme = z;
            this.instant = z2;
        }
    }

    BottomSheet getBottomSheet();

    void setDelegate(INavigationLayoutDelegate iNavigationLayoutDelegate);

    void setFragmentStack(List list);

    void setInBubbleMode(boolean z);

    void setRemoveActionBarExtraHeight(boolean z);
}

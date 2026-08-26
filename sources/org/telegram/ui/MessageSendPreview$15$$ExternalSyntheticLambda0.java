package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;

public final class MessageSendPreview$15$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public MessageSendPreview$15$$ExternalSyntheticLambda0(int i, BaseFragment baseFragment) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
                bottomSheetParams.transitionFromLeft = true;
                this.f$0.showAsSheet(new PremiumPreviewFragment(0, "effect"), bottomSheetParams);
                break;
            case 1:
                BaseFragment baseFragment = this.f$0;
                if (baseFragment != null) {
                    new PremiumFeatureBottomSheet(baseFragment, baseFragment.getContext(), baseFragment.getCurrentAccount(), false, 11, false, null).show();
                } else if (baseFragment.getContext() instanceof LaunchActivity) {
                    ((LaunchActivity) baseFragment.getContext()).presentFragment(new PremiumPreviewFragment(0, null));
                }
                break;
            case 2:
                this.f$0.presentFragment(new StickersActivity(0, null));
                break;
            case 3:
                ThemeActivity themeActivity = new ThemeActivity(0);
                themeActivity.highlightSensitiveRow = true;
                this.f$0.presentFragment(themeActivity);
                break;
            case 4:
                BaseFragment baseFragment2 = this.f$0;
                if (baseFragment2 instanceof PremiumPreviewFragment) {
                    PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) baseFragment2;
                    premiumPreviewFragment.forcePremium = true;
                    premiumPreviewFragment.getMediaDataController().loadPremiumPromo(false);
                    premiumPreviewFragment.listView.smoothScrollToPosition(0);
                } else {
                    PremiumPreviewFragment premiumPreviewFragment2 = new PremiumPreviewFragment(0, null);
                    premiumPreviewFragment2.forcePremium = true;
                    if (baseFragment2 != null) {
                        baseFragment2.presentFragment(premiumPreviewFragment2);
                    } else {
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null) {
                            safeLastFragment.presentFragment(premiumPreviewFragment2);
                        }
                    }
                }
                if (baseFragment2 != null && (baseFragment2.getParentActivity() instanceof LaunchActivity)) {
                    try {
                        baseFragment2.getFragmentView().performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    ((LaunchActivity) baseFragment2.getParentActivity()).fireworksOverlay.start(false);
                    break;
                }
                break;
            case 5:
                this.f$0.presentFragment(new DataSettingsActivity());
                break;
            case 6:
                this.f$0.presentFragment(new DataSettingsActivity());
                break;
            case 7:
                this.f$0.presentFragment(new DataSettingsActivity());
                break;
            case 8:
                OKLCH.m(0, this.f$0);
                break;
            case 9:
                OKLCH.m(0, this.f$0);
                break;
            case 10:
                this.f$0.presentFragment(new WallpapersListActivity(0));
                break;
            case 11:
                this.f$0.presentFragment(new NotificationsCustomSettingsActivity(2, new ArrayList(), null, true));
                break;
            case 12:
                this.f$0.presentFragment(new WallpapersListActivity(1));
                break;
            case 13:
                this.f$0.presentFragment(new WallpapersListActivity(0));
                break;
            case 14:
                OKLCH.m(0, this.f$0);
                break;
            case 15:
                BaseFragment baseFragment3 = this.f$0;
                PremiumFeatureBottomSheet premiumFeatureBottomSheet = new PremiumFeatureBottomSheet(baseFragment3, 4, false);
                premiumFeatureBottomSheet.setForceAbout();
                baseFragment3.showDialog(premiumFeatureBottomSheet);
                break;
            case 16:
                OKLCH.m(3, this.f$0);
                break;
            case 17:
                OKLCH.m(3, this.f$0);
                break;
            case 18:
                OKLCH.m(0, this.f$0);
                break;
            case 19:
                OKLCH.m(0, this.f$0);
                break;
            case 20:
                OKLCH.m(0, this.f$0);
                break;
            case 21:
                OKLCH.m(0, this.f$0);
                break;
            case 22:
                OKLCH.m(1, this.f$0);
                break;
            case 23:
                this.f$0.presentFragment(new NotificationsSettingsActivity());
                break;
            case 24:
                OKLCH.m(0, this.f$0);
                break;
            case 25:
                OKLCH.m(0, this.f$0);
                break;
            case 26:
                this.f$0.presentFragment(new NotificationsSettingsActivity());
                break;
            case 27:
                OKLCH.m(0, this.f$0);
                break;
            case 28:
                OKLCH.m(0, this.f$0);
                break;
            default:
                OKLCH.m(0, this.f$0);
                break;
        }
    }
}

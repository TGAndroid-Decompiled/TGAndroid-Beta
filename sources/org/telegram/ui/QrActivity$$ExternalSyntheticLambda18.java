package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.ThemeDescription;

public final class QrActivity$$ExternalSyntheticLambda18 implements ThemeDescription.ThemeDescriptionDelegate {
    public final int $r8$classId;
    public final BaseFragment f$0;

    public QrActivity$$ExternalSyntheticLambda18(BaseFragment baseFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
    }

    private final void onAnimationProgress$org$telegram$ui$ProfileActivity$$ExternalSyntheticLambda122(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ProfileNotificationsActivity$$ExternalSyntheticLambda7(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ProxySettingsActivity$$ExternalSyntheticLambda7(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$QrActivity$$ExternalSyntheticLambda18(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ReactionsDoubleTapManageActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$StatisticActivity$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ThemeActivity$$ExternalSyntheticLambda21(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$ThemePreviewActivity$$ExternalSyntheticLambda3(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$TooManyCommunitiesActivity$$ExternalSyntheticLambda1(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$TopicsFragment$$ExternalSyntheticLambda2(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$UsersSelectActivity$$ExternalSyntheticLambda3(float f) {
    }

    @Override
    public final void didSetColor() {
        switch (this.$r8$classId) {
            case 0:
                ((QrActivity) this.f$0).lambda$getThemeDescriptions$17();
                break;
            case 1:
                ((ProfileActivity) this.f$0).lambda$getThemeDescriptions$117();
                break;
            case 2:
                ((ProfileNotificationsActivity) this.f$0).lambda$getThemeDescriptions$7();
                break;
            case 3:
                ((ProxySettingsActivity) this.f$0).lambda$getThemeDescriptions$6();
                break;
            case 4:
                ((ReactionsDoubleTapManageActivity) this.f$0).updateColors();
                break;
            case 5:
                ((StatisticActivity) this.f$0).lambda$getThemeDescriptions$12();
                break;
            case 6:
                ((ThemeActivity) this.f$0).lambda$getThemeDescriptions$24();
                break;
            case 7:
                ((ThemePreviewActivity) this.f$0).lambda$getThemeDescriptionsInternal$33();
                break;
            case 8:
                ((TooManyCommunitiesActivity) this.f$0).lambda$getThemeDescriptions$6();
                break;
            case 9:
                ((TopicsFragment) this.f$0).lambda$getThemeDescriptions$24();
                break;
            default:
                ((UsersSelectActivity) this.f$0).lambda$getThemeDescriptions$3();
                break;
        }
    }

    @Override
    public final void onAnimationProgress(float f) {
        int i = this.$r8$classId;
    }
}

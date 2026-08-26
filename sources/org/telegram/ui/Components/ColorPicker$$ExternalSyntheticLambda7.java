package org.telegram.ui.Components;

import org.telegram.ui.ActionBar.ThemeDescription;

public final class ColorPicker$$ExternalSyntheticLambda7 implements ThemeDescription.ThemeDescriptionDelegate {
    public final int $r8$classId;
    public final Object f$0;

    public ColorPicker$$ExternalSyntheticLambda7(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    private final void onAnimationProgress$org$telegram$ui$Components$AudioPlayerAlert$$ExternalSyntheticLambda7(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$ChatAttachAlertContactsLayout$$ExternalSyntheticLambda4(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$ChatAttachAlertLocationLayout$$ExternalSyntheticLambda11(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$ColorPicker$$ExternalSyntheticLambda7(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$MediaActivity$$ExternalSyntheticLambda4(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$PermanentLinkBottomSheet$$ExternalSyntheticLambda6(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$PollVotesAlert$$ExternalSyntheticLambda3(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$SearchViewPager$$ExternalSyntheticLambda5(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$SimpleThemeDescription$$ExternalSyntheticLambda0(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$StickersAlert$$ExternalSyntheticLambda8(float f) {
    }

    private final void onAnimationProgress$org$telegram$ui$Components$TrendingStickersAlert$$ExternalSyntheticLambda0(float f) {
    }

    @Override
    public final void didSetColor() {
        switch (this.$r8$classId) {
            case 0:
                ((ColorPicker) this.f$0).lambda$provideThemeDescriptions$7();
                break;
            case 1:
                ((AudioPlayerAlert) this.f$0).lambda$getThemeDescriptions$21();
                break;
            case 2:
                ((ChatAttachAlertContactsLayout) this.f$0).lambda$getThemeDescriptions$4();
                break;
            case 3:
                ((ChatAttachAlertLocationLayout) this.f$0).lambda$getThemeDescriptions$34();
                break;
            case 4:
                ((MediaActivity) this.f$0).updateColors();
                break;
            case 5:
                ((PermanentLinkBottomSheet) this.f$0).updateColors();
                break;
            case 6:
                ((PollVotesAlert) this.f$0).updatePlaceholder();
                break;
            case 7:
                ((SearchViewPager) this.f$0).lambda$getThemeDescriptions$5();
                break;
            case 8:
                ((Runnable) this.f$0).run();
                break;
            case 9:
                ((StickersAlert) this.f$0).updateColors();
                break;
            default:
                ((TrendingStickersLayout) this.f$0).updateColors();
                break;
        }
    }

    @Override
    public final void onAnimationProgress(float f) {
        int i = this.$r8$classId;
    }
}

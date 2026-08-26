package org.telegram.ui.Components;

public final class ProfileGalleryBlurView$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ProfileGalleryBlurView f$0;

    public ProfileGalleryBlurView$$ExternalSyntheticLambda8(ProfileGalleryBlurView profileGalleryBlurView, int i) {
        this.$r8$classId = i;
        this.f$0 = profileGalleryBlurView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$doBlur$0();
                break;
            case 1:
                this.f$0.updateContent();
                break;
            default:
                this.f$0.doBlur();
                break;
        }
    }
}

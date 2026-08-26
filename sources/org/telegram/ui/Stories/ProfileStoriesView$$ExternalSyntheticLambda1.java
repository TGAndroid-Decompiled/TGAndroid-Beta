package org.telegram.ui.Stories;

public final class ProfileStoriesView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final ProfileStoriesView f$0;

    public ProfileStoriesView$$ExternalSyntheticLambda1(ProfileStoriesView profileStoriesView, int i) {
        this.$r8$classId = i;
        this.f$0 = profileStoriesView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$4$3();
                break;
            case 1:
                this.f$0.invalidate();
                break;
            default:
                this.f$0.lambda$vibrateNewStory$0();
                break;
        }
    }
}

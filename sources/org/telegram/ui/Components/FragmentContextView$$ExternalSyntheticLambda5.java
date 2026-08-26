package org.telegram.ui.Components;

public final class FragmentContextView$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final FragmentContextView f$0;

    public FragmentContextView$$ExternalSyntheticLambda5(FragmentContextView fragmentContextView, int i) {
        this.$r8$classId = i;
        this.f$0 = fragmentContextView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                FragmentContextView fragmentContextView = this.f$0;
                fragmentContextView.joinButtonFlicker.progress = 0.0f;
                fragmentContextView.joinButton.invalidate();
                break;
            default:
                this.f$0.updateAvatars(true);
                break;
        }
    }
}

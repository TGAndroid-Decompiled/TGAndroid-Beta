package org.telegram.ui.Components;

public final class FragmentContextView$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final FragmentContextView f$0;

    public FragmentContextView$$ExternalSyntheticLambda6(FragmentContextView fragmentContextView, int i) {
        this.$r8$classId = i;
        this.f$0 = fragmentContextView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startJoinFlickerAnimation$15();
                break;
            default:
                this.f$0.lambda$checkCreateView$3();
                break;
        }
    }
}

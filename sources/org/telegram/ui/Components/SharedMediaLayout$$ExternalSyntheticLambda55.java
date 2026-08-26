package org.telegram.ui.Components;

public final class SharedMediaLayout$$ExternalSyntheticLambda55 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;

    public SharedMediaLayout$$ExternalSyntheticLambda55(SharedMediaLayout sharedMediaLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = sharedMediaLayout;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$1();
                break;
            case 1:
                this.f$0.lambda$new$31();
                break;
            default:
                this.f$0.lambda$onActionBarItemClick$46();
                break;
        }
    }
}

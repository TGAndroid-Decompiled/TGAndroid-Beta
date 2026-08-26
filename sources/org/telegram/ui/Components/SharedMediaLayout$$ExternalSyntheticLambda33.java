package org.telegram.ui.Components;

public final class SharedMediaLayout$$ExternalSyntheticLambda33 implements Runnable {
    public final int $r8$classId;
    public final SharedMediaLayout f$0;
    public final boolean f$1;

    public SharedMediaLayout$$ExternalSyntheticLambda33(SharedMediaLayout sharedMediaLayout, int i, boolean z) {
        this.$r8$classId = i;
        this.f$0 = sharedMediaLayout;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$showPremiumFloodWaitBulletin$69(this.f$1);
                break;
            default:
                this.f$0.lambda$updateSearchItemIconAnimated$0(this.f$1);
                break;
        }
    }
}

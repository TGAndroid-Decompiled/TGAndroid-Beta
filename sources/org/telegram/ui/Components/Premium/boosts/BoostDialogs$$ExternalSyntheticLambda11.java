package org.telegram.ui.Components.Premium.boosts;

import java.util.concurrent.atomic.AtomicBoolean;

public final class BoostDialogs$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final AtomicBoolean f$0;

    public BoostDialogs$$ExternalSyntheticLambda11(AtomicBoolean atomicBoolean, int i) {
        this.$r8$classId = i;
        this.f$0 = atomicBoolean;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.set(true);
                break;
            default:
                this.f$0.set(true);
                break;
        }
    }
}

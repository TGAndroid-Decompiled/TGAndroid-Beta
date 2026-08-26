package org.telegram.ui;

import org.telegram.messenger.Utilities;

public final class CacheControlActivity$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final Utilities.Callback f$0;
    public final long f$1;

    public CacheControlActivity$$ExternalSyntheticLambda9(long j, int i, Utilities.Callback callback) {
        this.$r8$classId = i;
        this.f$0 = callback;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(Long.valueOf(this.f$1));
                break;
            default:
                this.f$0.run(Long.valueOf(this.f$1));
                break;
        }
    }
}

package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class j6 implements Runnable {
    public final int f38466a;
    public final Utilities.Callback f38467b;
    public final long f38468c;

    public j6(long j10, int i10, Utilities.Callback callback) {
        this.f38466a = i10;
        this.f38467b = callback;
        this.f38468c = j10;
    }

    @Override
    public final void run() {
        switch (this.f38466a) {
            case 0:
                this.f38467b.run(Long.valueOf(this.f38468c));
                return;
            default:
                this.f38467b.run(Long.valueOf(this.f38468c));
                return;
        }
    }
}

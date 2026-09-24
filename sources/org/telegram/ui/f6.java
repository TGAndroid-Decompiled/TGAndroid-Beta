package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class f6 implements Runnable {
    public final int f33540a;
    public final Utilities.Callback f33541b;
    public final long f33542c;

    public f6(long j3, int i10, Utilities.Callback callback) {
        this.f33540a = i10;
        this.f33541b = callback;
        this.f33542c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33540a) {
            case 0:
                this.f33541b.run(Long.valueOf(this.f33542c));
                return;
            default:
                this.f33541b.run(Long.valueOf(this.f33542c));
                return;
        }
    }
}

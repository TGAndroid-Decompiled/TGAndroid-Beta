package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f33022a;
    public final Utilities.Callback f33023b;
    public final long f33024c;

    public d6(long j3, int i10, Utilities.Callback callback) {
        this.f33022a = i10;
        this.f33023b = callback;
        this.f33024c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33022a) {
            case 0:
                this.f33023b.run(Long.valueOf(this.f33024c));
                return;
            default:
                this.f33023b.run(Long.valueOf(this.f33024c));
                return;
        }
    }
}

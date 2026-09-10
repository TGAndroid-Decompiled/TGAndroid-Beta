package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class g6 implements Runnable {
    public final int f33012a;
    public final Utilities.Callback f33013b;
    public final long f33014c;

    public g6(long j3, int i10, Utilities.Callback callback) {
        this.f33012a = i10;
        this.f33013b = callback;
        this.f33014c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33012a) {
            case 0:
                this.f33013b.run(Long.valueOf(this.f33014c));
                return;
            default:
                this.f33013b.run(Long.valueOf(this.f33014c));
                return;
        }
    }
}

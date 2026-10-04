package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class e6 implements Runnable {
    public final int f35934a;
    public final Utilities.Callback f35935b;
    public final long f35936c;

    public e6(long j3, int i10, Utilities.Callback callback) {
        this.f35934a = i10;
        this.f35935b = callback;
        this.f35936c = j3;
    }

    @Override
    public final void run() {
        switch (this.f35934a) {
            case 0:
                this.f35935b.run(Long.valueOf(this.f35936c));
                return;
            default:
                this.f35935b.run(Long.valueOf(this.f35936c));
                return;
        }
    }
}

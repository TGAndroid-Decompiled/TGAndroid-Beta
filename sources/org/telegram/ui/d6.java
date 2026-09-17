package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class d6 implements Runnable {
    public final int f33018a;
    public final Utilities.Callback f33019b;
    public final long f33020c;

    public d6(long j3, int i10, Utilities.Callback callback) {
        this.f33018a = i10;
        this.f33019b = callback;
        this.f33020c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33018a) {
            case 0:
                this.f33019b.run(Long.valueOf(this.f33020c));
                return;
            default:
                this.f33019b.run(Long.valueOf(this.f33020c));
                return;
        }
    }
}

package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class t2 {
    public final y2 f43163a;
    public final r2 f43164b;
    public final long f43165c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43166e;
    public boolean f43167f;
    public Runnable f43168g;
    public g2 h;

    public t2(y2 y2Var, r2 r2Var) {
        this.f43163a = y2Var;
        this.f43164b = r2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43165c < 700) {
            return true;
        }
        return false;
    }
}

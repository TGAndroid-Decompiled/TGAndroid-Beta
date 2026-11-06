package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class u2 {
    public final z2 f43170a;
    public final s2 f43171b;
    public final long f43172c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43173e;
    public boolean f43174f;
    public Runnable f43175g;
    public h2 h;

    public u2(z2 z2Var, s2 s2Var) {
        this.f43170a = z2Var;
        this.f43171b = s2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43172c < 700) {
            return true;
        }
        return false;
    }
}

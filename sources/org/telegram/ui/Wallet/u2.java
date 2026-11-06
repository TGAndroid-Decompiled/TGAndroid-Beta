package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class u2 {
    public final z2 f43194a;
    public final s2 f43195b;
    public final long f43196c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43197e;
    public boolean f43198f;
    public Runnable f43199g;
    public h2 h;

    public u2(z2 z2Var, s2 s2Var) {
        this.f43194a = z2Var;
        this.f43195b = s2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43196c < 700) {
            return true;
        }
        return false;
    }
}

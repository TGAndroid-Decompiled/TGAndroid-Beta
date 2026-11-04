package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class s2 {
    public final x2 f43144a;
    public final q2 f43145b;
    public final long f43146c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43147e;
    public boolean f43148f;
    public Runnable f43149g;
    public f2 h;

    public s2(x2 x2Var, q2 q2Var) {
        this.f43144a = x2Var;
        this.f43145b = q2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43146c < 700) {
            return true;
        }
        return false;
    }
}

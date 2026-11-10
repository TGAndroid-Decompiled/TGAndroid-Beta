package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class s2 {
    public final x2 f43145a;
    public final q2 f43146b;
    public final long f43147c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43148e;
    public boolean f43149f;
    public Runnable f43150g;
    public f2 h;

    public s2(x2 x2Var, q2 q2Var) {
        this.f43145a = x2Var;
        this.f43146b = q2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43147c < 700) {
            return true;
        }
        return false;
    }
}

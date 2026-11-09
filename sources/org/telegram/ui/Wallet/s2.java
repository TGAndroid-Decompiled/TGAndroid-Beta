package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class s2 {
    public final x2 f43081a;
    public final q2 f43082b;
    public final long f43083c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43084e;
    public boolean f43085f;
    public Runnable f43086g;
    public f2 h;

    public s2(x2 x2Var, q2 q2Var) {
        this.f43081a = x2Var;
        this.f43082b = q2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43083c < 700) {
            return true;
        }
        return false;
    }
}

package org.telegram.ui.Wallet;

import android.os.SystemClock;
public final class u2 {
    public final z2 f43195a;
    public final s2 f43196b;
    public final long f43197c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f43198e;
    public boolean f43199f;
    public Runnable f43200g;
    public h2 h;

    public u2(z2 z2Var, s2 s2Var) {
        this.f43195a = z2Var;
        this.f43196b = s2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f43197c < 700) {
            return true;
        }
        return false;
    }
}

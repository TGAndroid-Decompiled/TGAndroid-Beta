package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.jw0;
public final class y2 {
    public final d3 f45339a;
    public final w2 f45340b;
    public final long f45341c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f45342e;
    public boolean f45343f;
    public Runnable f45344g;
    public jw0 h;

    public y2(d3 d3Var, w2 w2Var) {
        this.f45339a = d3Var;
        this.f45340b = w2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f45341c < 700) {
            return true;
        }
        return false;
    }
}

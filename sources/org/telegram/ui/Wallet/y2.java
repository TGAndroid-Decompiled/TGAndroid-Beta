package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.jw0;
public final class y2 {
    public final d3 f45343a;
    public final w2 f45344b;
    public final long f45345c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f45346e;
    public boolean f45347f;
    public Runnable f45348g;
    public jw0 h;

    public y2(d3 d3Var, w2 w2Var) {
        this.f45343a = d3Var;
        this.f45344b = w2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f45345c < 700) {
            return true;
        }
        return false;
    }
}

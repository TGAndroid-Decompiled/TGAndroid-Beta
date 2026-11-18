package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.jw0;
public final class y2 {
    public final d3 f45299a;
    public final w2 f45300b;
    public final long f45301c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f45302e;
    public boolean f45303f;
    public Runnable f45304g;
    public jw0 h;

    public y2(d3 d3Var, w2 w2Var) {
        this.f45299a = d3Var;
        this.f45300b = w2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f45301c < 700) {
            return true;
        }
        return false;
    }
}

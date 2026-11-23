package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.zn0;
public final class y2 {
    public final d3 f45309a;
    public final w2 f45310b;
    public final long f45311c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f45312e;
    public boolean f45313f;
    public Runnable f45314g;
    public zn0 h;

    public y2(d3 d3Var, w2 w2Var) {
        this.f45309a = d3Var;
        this.f45310b = w2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f45311c < 700) {
            return true;
        }
        return false;
    }
}

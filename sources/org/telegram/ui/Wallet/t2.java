package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.Components.qq;
public final class t2 {
    public final y2 f35226a;
    public final r2 f35227b;
    public final long f35228c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f35229f;
    public Runnable f35230g;
    public qq h;

    public t2(y2 y2Var, r2 r2Var) {
        this.f35226a = y2Var;
        this.f35227b = r2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f35228c < 700) {
            return true;
        }
        return false;
    }
}

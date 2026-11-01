package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.Components.qq;
public final class u2 {
    public final z2 f35270a;
    public final s2 f35271b;
    public final long f35272c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean e;
    public boolean f35273f;
    public Runnable f35274g;
    public qq h;

    public u2(z2 z2Var, s2 s2Var) {
        this.f35270a = z2Var;
        this.f35271b = s2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f35272c < 700) {
            return true;
        }
        return false;
    }
}

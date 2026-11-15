package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.nb1;
public final class r2 {
    public final w2 f44429a;
    public final p2 f44430b;
    public final long f44431c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f44432e;
    public boolean f44433f;
    public Runnable f44434g;
    public nb1 h;

    public r2(w2 w2Var, p2 p2Var) {
        this.f44429a = w2Var;
        this.f44430b = p2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f44431c < 700) {
            return true;
        }
        return false;
    }
}

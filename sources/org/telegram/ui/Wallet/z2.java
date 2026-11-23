package org.telegram.ui.Wallet;

import android.os.SystemClock;
import org.telegram.ui.ao0;
public final class z2 {
    public final e3 f45471a;
    public final x2 f45472b;
    public final long f45473c = SystemClock.uptimeMillis();
    public boolean d;
    public boolean f45474e;
    public boolean f45475f;
    public Runnable f45476g;
    public ao0 h;

    public z2(e3 e3Var, x2 x2Var) {
        this.f45471a = e3Var;
        this.f45472b = x2Var;
    }

    public final boolean a() {
        if (SystemClock.uptimeMillis() - this.f45473c < 700) {
            return true;
        }
        return false;
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class m6 {
    public int f28301a;
    public int f28302b = -1;
    public int f28303c;
    public float d;
    public WeakReference f28304e;
    public g6 f28305f;
    public int f28306g;
    public PorterDuff.Mode h;
    public Object f28307i;
    public WeakReference f28308j;
    public boolean f28309k;
    public int f28310l;
    public boolean f28311m;
    public p6 f28312n;
    public q6 f28313o;

    public final boolean a() {
        WeakReference weakReference = this.f28304e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f28301a;
        int i10 = this.f28302b;
        int i11 = this.f28303c;
        float f10 = this.d;
        g6 g6Var = this.f28305f;
        if (g6Var == null) {
            WeakReference weakReference = this.f28304e;
            if (weakReference != null) {
                g6Var = (g6) weakReference.get();
            } else {
                g6Var = null;
            }
        }
        return s6.P(i7, i10, i11, f10, g6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, g6 g6Var) {
        this.f28301a = i7;
        this.f28302b = i10;
        this.f28303c = i11;
        this.d = f10;
        if (g6Var == null) {
            this.f28304e = null;
            this.f28305f = null;
            return;
        }
        Class<?> cls = g6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f28304e = new WeakReference(g6Var);
            this.f28305f = null;
            return;
        }
        this.f28304e = null;
        this.f28305f = g6Var;
    }
}

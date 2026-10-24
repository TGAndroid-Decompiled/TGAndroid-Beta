package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class l6 {
    public int f21610a;
    public int f21611b = -1;
    public int f21612c;
    public float d;
    public WeakReference e;
    public g6 f21613f;
    public int f21614g;
    public PorterDuff.Mode h;
    public Object f21615i;
    public WeakReference f21616j;
    public boolean f21617k;
    public int f21618l;
    public boolean f21619m;
    public o6 f21620n;
    public p6 f21621o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f21610a;
        int i11 = this.f21611b;
        int i12 = this.f21612c;
        float f7 = this.d;
        g6 g6Var = this.f21613f;
        if (g6Var == null) {
            WeakReference weakReference = this.e;
            if (weakReference != null) {
                g6Var = (g6) weakReference.get();
            } else {
                g6Var = null;
            }
        }
        return r6.R(i10, i11, i12, f7, g6Var);
    }

    public final void c(int i10, int i11, int i12, float f7, g6 g6Var) {
        this.f21610a = i10;
        this.f21611b = i11;
        this.f21612c = i12;
        this.d = f7;
        if (g6Var == null) {
            this.e = null;
            this.f21613f = null;
            return;
        }
        Class<?> cls = g6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(g6Var);
            this.f21613f = null;
            return;
        }
        this.e = null;
        this.f21613f = g6Var;
    }
}

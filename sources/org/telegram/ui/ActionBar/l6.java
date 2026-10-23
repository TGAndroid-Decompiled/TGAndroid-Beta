package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class l6 {
    public int f21609a;
    public int f21610b = -1;
    public int f21611c;
    public float d;
    public WeakReference e;
    public g6 f21612f;
    public int f21613g;
    public PorterDuff.Mode h;
    public Object f21614i;
    public WeakReference f21615j;
    public boolean f21616k;
    public int f21617l;
    public boolean f21618m;
    public o6 f21619n;
    public p6 f21620o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f21609a;
        int i11 = this.f21610b;
        int i12 = this.f21611c;
        float f7 = this.d;
        g6 g6Var = this.f21612f;
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
        this.f21609a = i10;
        this.f21610b = i11;
        this.f21611c = i12;
        this.d = f7;
        if (g6Var == null) {
            this.e = null;
            this.f21612f = null;
            return;
        }
        Class<?> cls = g6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(g6Var);
            this.f21612f = null;
            return;
        }
        this.e = null;
        this.f21612f = g6Var;
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class l6 {
    public int f28284a;
    public int f28285b = -1;
    public int f28286c;
    public float d;
    public WeakReference f28287e;
    public f6 f28288f;
    public int f28289g;
    public PorterDuff.Mode h;
    public Object f28290i;
    public WeakReference f28291j;
    public boolean f28292k;
    public int f28293l;
    public boolean f28294m;
    public o6 f28295n;
    public p6 f28296o;

    public final boolean a() {
        WeakReference weakReference = this.f28287e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f28284a;
        int i10 = this.f28285b;
        int i11 = this.f28286c;
        float f10 = this.d;
        f6 f6Var = this.f28288f;
        if (f6Var == null) {
            WeakReference weakReference = this.f28287e;
            if (weakReference != null) {
                f6Var = (f6) weakReference.get();
            } else {
                f6Var = null;
            }
        }
        return r6.Q(i7, i10, i11, f10, f6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, f6 f6Var) {
        this.f28284a = i7;
        this.f28285b = i10;
        this.f28286c = i11;
        this.d = f10;
        if (f6Var == null) {
            this.f28287e = null;
            this.f28288f = null;
            return;
        }
        Class<?> cls = f6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f28287e = new WeakReference(f6Var);
            this.f28288f = null;
            return;
        }
        this.f28287e = null;
        this.f28288f = f6Var;
    }
}

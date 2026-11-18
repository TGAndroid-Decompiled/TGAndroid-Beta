package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class o6 {
    public int f29830a;
    public int f29831b = -1;
    public int f29832c;
    public float d;
    public WeakReference f29833e;
    public i6 f29834f;
    public int f29835g;
    public PorterDuff.Mode h;
    public Object f29836i;
    public WeakReference f29837j;
    public boolean f29838k;
    public int f29839l;
    public boolean f29840m;
    public r6 f29841n;
    public s6 f29842o;

    public final boolean a() {
        WeakReference weakReference = this.f29833e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29830a;
        int i10 = this.f29831b;
        int i11 = this.f29832c;
        float f10 = this.d;
        i6 i6Var = this.f29834f;
        if (i6Var == null) {
            WeakReference weakReference = this.f29833e;
            if (weakReference != null) {
                i6Var = (i6) weakReference.get();
            } else {
                i6Var = null;
            }
        }
        return u6.P(i7, i10, i11, f10, i6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, i6 i6Var) {
        this.f29830a = i7;
        this.f29831b = i10;
        this.f29832c = i11;
        this.d = f10;
        if (i6Var == null) {
            this.f29833e = null;
            this.f29834f = null;
            return;
        }
        Class<?> cls = i6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29833e = new WeakReference(i6Var);
            this.f29834f = null;
            return;
        }
        this.f29833e = null;
        this.f29834f = i6Var;
    }
}

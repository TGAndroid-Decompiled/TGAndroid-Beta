package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class o6 {
    public int f29832a;
    public int f29833b = -1;
    public int f29834c;
    public float d;
    public WeakReference f29835e;
    public i6 f29836f;
    public int f29837g;
    public PorterDuff.Mode h;
    public Object f29838i;
    public WeakReference f29839j;
    public boolean f29840k;
    public int f29841l;
    public boolean f29842m;
    public r6 f29843n;
    public s6 f29844o;

    public final boolean a() {
        WeakReference weakReference = this.f29835e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29832a;
        int i10 = this.f29833b;
        int i11 = this.f29834c;
        float f10 = this.d;
        i6 i6Var = this.f29836f;
        if (i6Var == null) {
            WeakReference weakReference = this.f29835e;
            if (weakReference != null) {
                i6Var = (i6) weakReference.get();
            } else {
                i6Var = null;
            }
        }
        return u6.P(i7, i10, i11, f10, i6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, i6 i6Var) {
        this.f29832a = i7;
        this.f29833b = i10;
        this.f29834c = i11;
        this.d = f10;
        if (i6Var == null) {
            this.f29835e = null;
            this.f29836f = null;
            return;
        }
        Class<?> cls = i6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29835e = new WeakReference(i6Var);
            this.f29836f = null;
            return;
        }
        this.f29835e = null;
        this.f29836f = i6Var;
    }
}

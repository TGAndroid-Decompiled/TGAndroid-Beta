package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class k6 {
    public int f29343a;
    public int f29344b = -1;
    public int f29345c;
    public float d;
    public WeakReference f29346e;
    public e6 f29347f;
    public int f29348g;
    public PorterDuff.Mode h;
    public Object f29349i;
    public WeakReference f29350j;
    public boolean f29351k;
    public int f29352l;
    public boolean f29353m;
    public n6 f29354n;
    public o6 f29355o;

    public final boolean a() {
        WeakReference weakReference = this.f29346e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29343a;
        int i10 = this.f29344b;
        int i11 = this.f29345c;
        float f10 = this.d;
        e6 e6Var = this.f29347f;
        if (e6Var == null) {
            WeakReference weakReference = this.f29346e;
            if (weakReference != null) {
                e6Var = (e6) weakReference.get();
            } else {
                e6Var = null;
            }
        }
        return q6.P(i7, i10, i11, f10, e6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, e6 e6Var) {
        this.f29343a = i7;
        this.f29344b = i10;
        this.f29345c = i11;
        this.d = f10;
        if (e6Var == null) {
            this.f29346e = null;
            this.f29347f = null;
            return;
        }
        Class<?> cls = e6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29346e = new WeakReference(e6Var);
            this.f29347f = null;
            return;
        }
        this.f29346e = null;
        this.f29347f = e6Var;
    }
}

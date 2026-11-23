package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class o6 {
    public int f29901a;
    public int f29902b = -1;
    public int f29903c;
    public float d;
    public WeakReference f29904e;
    public i6 f29905f;
    public int f29906g;
    public PorterDuff.Mode h;
    public Object f29907i;
    public WeakReference f29908j;
    public boolean f29909k;
    public int f29910l;
    public boolean f29911m;
    public r6 f29912n;
    public s6 f29913o;

    public final boolean a() {
        WeakReference weakReference = this.f29904e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29901a;
        int i10 = this.f29902b;
        int i11 = this.f29903c;
        float f10 = this.d;
        i6 i6Var = this.f29905f;
        if (i6Var == null) {
            WeakReference weakReference = this.f29904e;
            if (weakReference != null) {
                i6Var = (i6) weakReference.get();
            } else {
                i6Var = null;
            }
        }
        return u6.P(i7, i10, i11, f10, i6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, i6 i6Var) {
        this.f29901a = i7;
        this.f29902b = i10;
        this.f29903c = i11;
        this.d = f10;
        if (i6Var == null) {
            this.f29904e = null;
            this.f29905f = null;
            return;
        }
        Class<?> cls = i6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29904e = new WeakReference(i6Var);
            this.f29905f = null;
            return;
        }
        this.f29904e = null;
        this.f29905f = i6Var;
    }
}

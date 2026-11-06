package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class l6 {
    public int f28280a;
    public int f28281b = -1;
    public int f28282c;
    public float d;
    public WeakReference f28283e;
    public f6 f28284f;
    public int f28285g;
    public PorterDuff.Mode h;
    public Object f28286i;
    public WeakReference f28287j;
    public boolean f28288k;
    public int f28289l;
    public boolean f28290m;
    public o6 f28291n;
    public p6 f28292o;

    public final boolean a() {
        WeakReference weakReference = this.f28283e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f28280a;
        int i10 = this.f28281b;
        int i11 = this.f28282c;
        float f10 = this.d;
        f6 f6Var = this.f28284f;
        if (f6Var == null) {
            WeakReference weakReference = this.f28283e;
            if (weakReference != null) {
                f6Var = (f6) weakReference.get();
            } else {
                f6Var = null;
            }
        }
        return r6.Q(i7, i10, i11, f10, f6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, f6 f6Var) {
        this.f28280a = i7;
        this.f28281b = i10;
        this.f28282c = i11;
        this.d = f10;
        if (f6Var == null) {
            this.f28283e = null;
            this.f28284f = null;
            return;
        }
        Class<?> cls = f6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f28283e = new WeakReference(f6Var);
            this.f28284f = null;
            return;
        }
        this.f28283e = null;
        this.f28284f = f6Var;
    }
}

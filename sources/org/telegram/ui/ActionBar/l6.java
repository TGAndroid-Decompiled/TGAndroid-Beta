package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class l6 {
    public int f28281a;
    public int f28282b = -1;
    public int f28283c;
    public float d;
    public WeakReference f28284e;
    public f6 f28285f;
    public int f28286g;
    public PorterDuff.Mode h;
    public Object f28287i;
    public WeakReference f28288j;
    public boolean f28289k;
    public int f28290l;
    public boolean f28291m;
    public o6 f28292n;
    public p6 f28293o;

    public final boolean a() {
        WeakReference weakReference = this.f28284e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f28281a;
        int i10 = this.f28282b;
        int i11 = this.f28283c;
        float f10 = this.d;
        f6 f6Var = this.f28285f;
        if (f6Var == null) {
            WeakReference weakReference = this.f28284e;
            if (weakReference != null) {
                f6Var = (f6) weakReference.get();
            } else {
                f6Var = null;
            }
        }
        return r6.Q(i7, i10, i11, f10, f6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, f6 f6Var) {
        this.f28281a = i7;
        this.f28282b = i10;
        this.f28283c = i11;
        this.d = f10;
        if (f6Var == null) {
            this.f28284e = null;
            this.f28285f = null;
            return;
        }
        Class<?> cls = f6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f28284e = new WeakReference(f6Var);
            this.f28285f = null;
            return;
        }
        this.f28284e = null;
        this.f28285f = f6Var;
    }
}

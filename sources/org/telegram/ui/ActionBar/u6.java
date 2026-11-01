package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class u6 {
    public int f21387a;
    public int f21388b = -1;
    public int f21389c;
    public float d;
    public WeakReference e;
    public p6 f21390f;
    public int f21391g;
    public PorterDuff.Mode h;
    public Object f21392i;
    public WeakReference f21393j;
    public boolean f21394k;
    public int f21395l;
    public boolean f21396m;
    public x6 f21397n;
    public y6 f21398o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f21387a;
        int i11 = this.f21388b;
        int i12 = this.f21389c;
        float f7 = this.d;
        p6 p6Var = this.f21390f;
        if (p6Var == null) {
            WeakReference weakReference = this.e;
            if (weakReference != null) {
                p6Var = (p6) weakReference.get();
            } else {
                p6Var = null;
            }
        }
        return a7.Q(i10, i11, i12, f7, p6Var);
    }

    public final void c(int i10, int i11, int i12, float f7, p6 p6Var) {
        this.f21387a = i10;
        this.f21388b = i11;
        this.f21389c = i12;
        this.d = f7;
        if (p6Var == null) {
            this.e = null;
            this.f21390f = null;
            return;
        }
        Class<?> cls = p6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(p6Var);
            this.f21390f = null;
            return;
        }
        this.e = null;
        this.f21390f = p6Var;
    }
}

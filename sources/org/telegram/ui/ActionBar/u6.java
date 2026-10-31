package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class u6 {
    public int f21386a;
    public int f21387b = -1;
    public int f21388c;
    public float d;
    public WeakReference e;
    public p6 f21389f;
    public int f21390g;
    public PorterDuff.Mode h;
    public Object f21391i;
    public WeakReference f21392j;
    public boolean f21393k;
    public int f21394l;
    public boolean f21395m;
    public x6 f21396n;
    public y6 f21397o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f21386a;
        int i11 = this.f21387b;
        int i12 = this.f21388c;
        float f7 = this.d;
        p6 p6Var = this.f21389f;
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
        this.f21386a = i10;
        this.f21387b = i11;
        this.f21388c = i12;
        this.d = f7;
        if (p6Var == null) {
            this.e = null;
            this.f21389f = null;
            return;
        }
        Class<?> cls = p6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(p6Var);
            this.f21389f = null;
            return;
        }
        this.e = null;
        this.f21389f = p6Var;
    }
}

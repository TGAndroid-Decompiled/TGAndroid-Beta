package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class z6 {
    public int f23797a;
    public int f23798b = -1;
    public int f23799c;
    public float d;
    public WeakReference e;
    public u6 f23800f;
    public int f23801g;
    public PorterDuff.Mode h;
    public Object f23802i;
    public WeakReference f23803j;
    public boolean f23804k;
    public int f23805l;
    public boolean f23806m;
    public c7 f23807n;
    public d7 f23808o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f23797a;
        int i11 = this.f23798b;
        int i12 = this.f23799c;
        float f7 = this.d;
        u6 u6Var = this.f23800f;
        if (u6Var == null) {
            WeakReference weakReference = this.e;
            if (weakReference != null) {
                u6Var = (u6) weakReference.get();
            } else {
                u6Var = null;
            }
        }
        return f7.Q(i10, i11, i12, f7, u6Var);
    }

    public final void c(int i10, int i11, int i12, float f7, u6 u6Var) {
        this.f23797a = i10;
        this.f23798b = i11;
        this.f23799c = i12;
        this.d = f7;
        if (u6Var == null) {
            this.e = null;
            this.f23800f = null;
            return;
        }
        Class<?> cls = u6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(u6Var);
            this.f23800f = null;
            return;
        }
        this.e = null;
        this.f23800f = u6Var;
    }
}

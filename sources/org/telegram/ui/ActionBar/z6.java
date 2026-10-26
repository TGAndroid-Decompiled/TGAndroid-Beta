package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class z6 {
    public int f23799a;
    public int f23800b = -1;
    public int f23801c;
    public float d;
    public WeakReference e;
    public u6 f23802f;
    public int f23803g;
    public PorterDuff.Mode h;
    public Object f23804i;
    public WeakReference f23805j;
    public boolean f23806k;
    public int f23807l;
    public boolean f23808m;
    public c7 f23809n;
    public d7 f23810o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f23799a;
        int i11 = this.f23800b;
        int i12 = this.f23801c;
        float f7 = this.d;
        u6 u6Var = this.f23802f;
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
        this.f23799a = i10;
        this.f23800b = i11;
        this.f23801c = i12;
        this.d = f7;
        if (u6Var == null) {
            this.e = null;
            this.f23802f = null;
            return;
        }
        Class<?> cls = u6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(u6Var);
            this.f23802f = null;
            return;
        }
        this.e = null;
        this.f23802f = u6Var;
    }
}

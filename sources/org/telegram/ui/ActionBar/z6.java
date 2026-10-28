package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class z6 {
    public int f23800a;
    public int f23801b = -1;
    public int f23802c;
    public float d;
    public WeakReference e;
    public u6 f23803f;
    public int f23804g;
    public PorterDuff.Mode h;
    public Object f23805i;
    public WeakReference f23806j;
    public boolean f23807k;
    public int f23808l;
    public boolean f23809m;
    public c7 f23810n;
    public d7 f23811o;

    public final boolean a() {
        WeakReference weakReference = this.e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i10 = this.f23800a;
        int i11 = this.f23801b;
        int i12 = this.f23802c;
        float f7 = this.d;
        u6 u6Var = this.f23803f;
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
        this.f23800a = i10;
        this.f23801b = i11;
        this.f23802c = i12;
        this.d = f7;
        if (u6Var == null) {
            this.e = null;
            this.f23803f = null;
            return;
        }
        Class<?> cls = u6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.e = new WeakReference(u6Var);
            this.f23803f = null;
            return;
        }
        this.e = null;
        this.f23803f = u6Var;
    }
}

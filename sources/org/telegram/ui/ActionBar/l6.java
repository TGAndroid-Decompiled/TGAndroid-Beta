package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class l6 {
    public int f28314a;
    public int f28315b = -1;
    public int f28316c;
    public float d;
    public WeakReference f28317e;
    public e6 f28318f;
    public int f28319g;
    public PorterDuff.Mode h;
    public Object f28320i;
    public WeakReference f28321j;
    public boolean f28322k;
    public int f28323l;
    public boolean f28324m;
    public o6 f28325n;
    public p6 f28326o;

    public final boolean a() {
        WeakReference weakReference = this.f28317e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i3 = this.f28314a;
        int i10 = this.f28315b;
        int i11 = this.f28316c;
        float f10 = this.d;
        e6 e6Var = this.f28318f;
        if (e6Var == null) {
            WeakReference weakReference = this.f28317e;
            if (weakReference != null) {
                e6Var = (e6) weakReference.get();
            } else {
                e6Var = null;
            }
        }
        return r6.Q(i3, i10, i11, f10, e6Var);
    }

    public final void c(int i3, int i10, int i11, float f10, e6 e6Var) {
        this.f28314a = i3;
        this.f28315b = i10;
        this.f28316c = i11;
        this.d = f10;
        if (e6Var == null) {
            this.f28317e = null;
            this.f28318f = null;
            return;
        }
        Class<?> cls = e6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f28317e = new WeakReference(e6Var);
            this.f28318f = null;
            return;
        }
        this.f28317e = null;
        this.f28318f = e6Var;
    }
}

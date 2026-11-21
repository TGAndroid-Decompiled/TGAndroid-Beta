package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class n6 {
    public int f29813a;
    public int f29814b = -1;
    public int f29815c;
    public float d;
    public WeakReference f29816e;
    public h6 f29817f;
    public int f29818g;
    public PorterDuff.Mode h;
    public Object f29819i;
    public WeakReference f29820j;
    public boolean f29821k;
    public int f29822l;
    public boolean f29823m;
    public q6 f29824n;
    public r6 f29825o;

    public final boolean a() {
        WeakReference weakReference = this.f29816e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29813a;
        int i10 = this.f29814b;
        int i11 = this.f29815c;
        float f10 = this.d;
        h6 h6Var = this.f29817f;
        if (h6Var == null) {
            WeakReference weakReference = this.f29816e;
            if (weakReference != null) {
                h6Var = (h6) weakReference.get();
            } else {
                h6Var = null;
            }
        }
        return t6.P(i7, i10, i11, f10, h6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, h6 h6Var) {
        this.f29813a = i7;
        this.f29814b = i10;
        this.f29815c = i11;
        this.d = f10;
        if (h6Var == null) {
            this.f29816e = null;
            this.f29817f = null;
            return;
        }
        Class<?> cls = h6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29816e = new WeakReference(h6Var);
            this.f29817f = null;
            return;
        }
        this.f29816e = null;
        this.f29817f = h6Var;
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class n6 {
    public int f29782a;
    public int f29783b = -1;
    public int f29784c;
    public float d;
    public WeakReference f29785e;
    public h6 f29786f;
    public int f29787g;
    public PorterDuff.Mode h;
    public Object f29788i;
    public WeakReference f29789j;
    public boolean f29790k;
    public int f29791l;
    public boolean f29792m;
    public q6 f29793n;
    public r6 f29794o;

    public final boolean a() {
        WeakReference weakReference = this.f29785e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29782a;
        int i10 = this.f29783b;
        int i11 = this.f29784c;
        float f10 = this.d;
        h6 h6Var = this.f29786f;
        if (h6Var == null) {
            WeakReference weakReference = this.f29785e;
            if (weakReference != null) {
                h6Var = (h6) weakReference.get();
            } else {
                h6Var = null;
            }
        }
        return t6.P(i7, i10, i11, f10, h6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, h6 h6Var) {
        this.f29782a = i7;
        this.f29783b = i10;
        this.f29784c = i11;
        this.d = f10;
        if (h6Var == null) {
            this.f29785e = null;
            this.f29786f = null;
            return;
        }
        Class<?> cls = h6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29785e = new WeakReference(h6Var);
            this.f29786f = null;
            return;
        }
        this.f29785e = null;
        this.f29786f = h6Var;
    }
}

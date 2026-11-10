package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class n6 {
    public int f28324a;
    public int f28325b = -1;
    public int f28326c;
    public float d;
    public WeakReference f28327e;
    public h6 f28328f;
    public int f28329g;
    public PorterDuff.Mode h;
    public Object f28330i;
    public WeakReference f28331j;
    public boolean f28332k;
    public int f28333l;
    public boolean f28334m;
    public q6 f28335n;
    public r6 f28336o;

    public final boolean a() {
        WeakReference weakReference = this.f28327e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f28324a;
        int i10 = this.f28325b;
        int i11 = this.f28326c;
        float f10 = this.d;
        h6 h6Var = this.f28328f;
        if (h6Var == null) {
            WeakReference weakReference = this.f28327e;
            if (weakReference != null) {
                h6Var = (h6) weakReference.get();
            } else {
                h6Var = null;
            }
        }
        return t6.P(i7, i10, i11, f10, h6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, h6 h6Var) {
        this.f28324a = i7;
        this.f28325b = i10;
        this.f28326c = i11;
        this.d = f10;
        if (h6Var == null) {
            this.f28327e = null;
            this.f28328f = null;
            return;
        }
        Class<?> cls = h6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f28327e = new WeakReference(h6Var);
            this.f28328f = null;
            return;
        }
        this.f28327e = null;
        this.f28328f = h6Var;
    }
}

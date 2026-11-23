package org.telegram.ui.ActionBar;

import android.graphics.PorterDuff;
import java.lang.ref.WeakReference;
public final class n6 {
    public int f29816a;
    public int f29817b = -1;
    public int f29818c;
    public float d;
    public WeakReference f29819e;
    public h6 f29820f;
    public int f29821g;
    public PorterDuff.Mode h;
    public Object f29822i;
    public WeakReference f29823j;
    public boolean f29824k;
    public int f29825l;
    public boolean f29826m;
    public q6 f29827n;
    public r6 f29828o;

    public final boolean a() {
        WeakReference weakReference = this.f29819e;
        if (weakReference != null && weakReference.get() == null) {
            return true;
        }
        return false;
    }

    public final int b() {
        int i7 = this.f29816a;
        int i10 = this.f29817b;
        int i11 = this.f29818c;
        float f10 = this.d;
        h6 h6Var = this.f29820f;
        if (h6Var == null) {
            WeakReference weakReference = this.f29819e;
            if (weakReference != null) {
                h6Var = (h6) weakReference.get();
            } else {
                h6Var = null;
            }
        }
        return t6.P(i7, i10, i11, f10, h6Var);
    }

    public final void c(int i7, int i10, int i11, float f10, h6 h6Var) {
        this.f29816a = i7;
        this.f29817b = i10;
        this.f29818c = i11;
        this.d = f10;
        if (h6Var == null) {
            this.f29819e = null;
            this.f29820f = null;
            return;
        }
        Class<?> cls = h6Var.getClass();
        if (!cls.isSynthetic() && !cls.getName().contains("$$Lambda") && !cls.getName().contains("$$ExternalSynthetic")) {
            this.f29819e = new WeakReference(h6Var);
            this.f29820f = null;
            return;
        }
        this.f29819e = null;
        this.f29820f = h6Var;
    }
}

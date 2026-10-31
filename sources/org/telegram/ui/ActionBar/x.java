package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.q20;
import org.telegram.ui.ze;
public final class x {
    public y f21455a;
    public int f21456b;
    public int f21457c;
    public CharSequence d;
    public int e;
    public Drawable f21458f;
    public int f21459g;
    public p6 h;
    public float f21460i;
    public Boolean f21461j;
    public Boolean f21462k;
    public int f21463l;
    public t0 f21464m;
    public ArrayList f21465n;

    public final void a() {
        y yVar = this.f21455a;
        if (this.f21464m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21456b));
                int i11 = 0;
                while (true) {
                    if (i11 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            t0 f7 = yVar.f(childCount, this.f21456b, this.f21457c, null, this.e, this.f21458f, this.f21459g, null, this.h);
            this.f21464m = f7;
            f7.setVisibility(this.f21463l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21464m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21462k;
            if (bool != null) {
                this.f21464m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21461j;
            if (bool2 != null) {
                this.f21464m.S = bool2.booleanValue();
            }
            this.f21464m.setAlpha(this.f21460i);
            ArrayList arrayList2 = this.f21465n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((q20) obj).a(this.f21464m);
                }
                this.f21465n = null;
            }
        }
    }

    public final void b(ze zeVar) {
        t0 t0Var = this.f21464m;
        if (t0Var != null) {
            zeVar.a(t0Var);
            return;
        }
        if (this.f21465n == null) {
            this.f21465n = new ArrayList();
        }
        this.f21465n.add(zeVar);
    }

    public final void c() {
        this.f21462k = Boolean.FALSE;
        t0 t0Var = this.f21464m;
        if (t0Var != null) {
            t0Var.R = false;
        }
    }

    public final void d() {
        this.f21461j = Boolean.TRUE;
        t0 t0Var = this.f21464m;
        if (t0Var != null) {
            t0Var.S = true;
        }
    }

    public final void e(int i10) {
        if (this.f21463l != i10) {
            this.f21463l = i10;
            if (i10 == 0) {
                a();
            }
            t0 t0Var = this.f21464m;
            if (t0Var != null) {
                t0Var.setVisibility(i10);
            }
        }
    }
}

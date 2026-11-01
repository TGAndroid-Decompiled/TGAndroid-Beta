package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.r20;
import org.telegram.ui.ze;
public final class x {
    public y f21456a;
    public int f21457b;
    public int f21458c;
    public CharSequence d;
    public int e;
    public Drawable f21459f;
    public int f21460g;
    public p6 h;
    public float f21461i;
    public Boolean f21462j;
    public Boolean f21463k;
    public int f21464l;
    public t0 f21465m;
    public ArrayList f21466n;

    public final void a() {
        y yVar = this.f21456a;
        if (this.f21465m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21457b));
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
            t0 f7 = yVar.f(childCount, this.f21457b, this.f21458c, null, this.e, this.f21459f, this.f21460g, null, this.h);
            this.f21465m = f7;
            f7.setVisibility(this.f21464l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21465m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21463k;
            if (bool != null) {
                this.f21465m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21462j;
            if (bool2 != null) {
                this.f21465m.S = bool2.booleanValue();
            }
            this.f21465m.setAlpha(this.f21461i);
            ArrayList arrayList2 = this.f21466n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((r20) obj).a(this.f21465m);
                }
                this.f21466n = null;
            }
        }
    }

    public final void b(ze zeVar) {
        t0 t0Var = this.f21465m;
        if (t0Var != null) {
            zeVar.a(t0Var);
            return;
        }
        if (this.f21466n == null) {
            this.f21466n = new ArrayList();
        }
        this.f21466n.add(zeVar);
    }

    public final void c() {
        this.f21463k = Boolean.FALSE;
        t0 t0Var = this.f21465m;
        if (t0Var != null) {
            t0Var.R = false;
        }
    }

    public final void d() {
        this.f21462j = Boolean.TRUE;
        t0 t0Var = this.f21465m;
        if (t0Var != null) {
            t0Var.S = true;
        }
    }

    public final void e(int i10) {
        if (this.f21464l != i10) {
            this.f21464l = i10;
            if (i10 == 0) {
                a();
            }
            t0 t0Var = this.f21465m;
            if (t0Var != null) {
                t0Var.setVisibility(i10);
            }
        }
    }
}

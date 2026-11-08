package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ne;
public final class x {
    public y f28723a;
    public int f28724b;
    public int f28725c;
    public CharSequence d;
    public int f28726e;
    public Drawable f28727f;
    public int f28728g;
    public f6 h;
    public float f28729i;
    public Boolean f28730j;
    public Boolean f28731k;
    public int f28732l;
    public r0 f28733m;
    public ArrayList f28734n;

    public final void a() {
        y yVar = this.f28723a;
        if (this.f28733m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f28761e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f28724b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f28761e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            r0 f10 = yVar.f(childCount, this.f28724b, this.f28725c, null, this.f28726e, this.f28727f, this.f28728g, null, this.h);
            this.f28733m = f10;
            f10.setVisibility(this.f28732l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f28733m.setContentDescription(charSequence);
            }
            Boolean bool = this.f28731k;
            if (bool != null) {
                this.f28733m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f28730j;
            if (bool2 != null) {
                this.f28733m.S = bool2.booleanValue();
            }
            this.f28733m.setAlpha(this.f28729i);
            ArrayList arrayList2 = this.f28734n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((c20) obj).a(this.f28733m);
                }
                this.f28734n = null;
            }
        }
    }

    public final void b(ne neVar) {
        r0 r0Var = this.f28733m;
        if (r0Var != null) {
            neVar.a(r0Var);
            return;
        }
        if (this.f28734n == null) {
            this.f28734n = new ArrayList();
        }
        this.f28734n.add(neVar);
    }

    public final void c() {
        this.f28731k = Boolean.FALSE;
        r0 r0Var = this.f28733m;
        if (r0Var != null) {
            r0Var.R = false;
        }
    }

    public final void d() {
        this.f28730j = Boolean.TRUE;
        r0 r0Var = this.f28733m;
        if (r0Var != null) {
            r0Var.S = true;
        }
    }

    public final void e(int i7) {
        if (this.f28732l != i7) {
            this.f28732l = i7;
            if (i7 == 0) {
                a();
            }
            r0 r0Var = this.f28733m;
            if (r0Var != null) {
                r0Var.setVisibility(i7);
            }
        }
    }
}

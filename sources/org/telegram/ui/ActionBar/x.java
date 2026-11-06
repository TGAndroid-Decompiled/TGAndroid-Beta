package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ne;
public final class x {
    public y f28719a;
    public int f28720b;
    public int f28721c;
    public CharSequence d;
    public int f28722e;
    public Drawable f28723f;
    public int f28724g;
    public f6 h;
    public float f28725i;
    public Boolean f28726j;
    public Boolean f28727k;
    public int f28728l;
    public r0 f28729m;
    public ArrayList f28730n;

    public final void a() {
        y yVar = this.f28719a;
        if (this.f28729m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f28757e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f28720b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f28757e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            r0 f10 = yVar.f(childCount, this.f28720b, this.f28721c, null, this.f28722e, this.f28723f, this.f28724g, null, this.h);
            this.f28729m = f10;
            f10.setVisibility(this.f28728l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f28729m.setContentDescription(charSequence);
            }
            Boolean bool = this.f28727k;
            if (bool != null) {
                this.f28729m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f28726j;
            if (bool2 != null) {
                this.f28729m.S = bool2.booleanValue();
            }
            this.f28729m.setAlpha(this.f28725i);
            ArrayList arrayList2 = this.f28730n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((c20) obj).a(this.f28729m);
                }
                this.f28730n = null;
            }
        }
    }

    public final void b(ne neVar) {
        r0 r0Var = this.f28729m;
        if (r0Var != null) {
            neVar.a(r0Var);
            return;
        }
        if (this.f28730n == null) {
            this.f28730n = new ArrayList();
        }
        this.f28730n.add(neVar);
    }

    public final void c() {
        this.f28727k = Boolean.FALSE;
        r0 r0Var = this.f28729m;
        if (r0Var != null) {
            r0Var.R = false;
        }
    }

    public final void d() {
        this.f28726j = Boolean.TRUE;
        r0 r0Var = this.f28729m;
        if (r0Var != null) {
            r0Var.S = true;
        }
    }

    public final void e(int i7) {
        if (this.f28728l != i7) {
            this.f28728l = i7;
            if (i7 == 0) {
                a();
            }
            r0 r0Var = this.f28729m;
            if (r0Var != null) {
                r0Var.setVisibility(i7);
            }
        }
    }
}

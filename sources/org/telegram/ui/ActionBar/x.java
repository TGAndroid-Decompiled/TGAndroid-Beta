package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class x {
    public y f21940a;
    public int f21941b;
    public int f21942c;
    public CharSequence d;
    public int e;
    public Drawable f21943f;
    public int f21944g;
    public g6 h;
    public float f21945i;
    public Boolean f21946j;
    public Boolean f21947k;
    public int f21948l;
    public u0 f21949m;
    public ArrayList f21950n;
    public Integer f21951o;

    public final void a() {
        y yVar = this.f21940a;
        if (this.f21949m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21941b));
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
            u0 f7 = yVar.f(childCount, this.f21941b, this.f21942c, null, this.e, this.f21943f, this.f21944g, null, this.h);
            this.f21949m = f7;
            f7.setVisibility(this.f21948l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21949m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21947k;
            if (bool != null) {
                this.f21949m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21946j;
            if (bool2 != null) {
                this.f21949m.S = bool2.booleanValue();
            }
            this.f21949m.setAlpha(this.f21945i);
            ArrayList arrayList2 = this.f21950n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21949m);
                }
                this.f21950n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        u0 u0Var = this.f21949m;
        if (u0Var != null) {
            xeVar.run(u0Var);
            return;
        }
        if (this.f21950n == null) {
            this.f21950n = new ArrayList();
        }
        this.f21950n.add(xeVar);
    }

    public final void c() {
        this.f21947k = Boolean.FALSE;
        u0 u0Var = this.f21949m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21946j = Boolean.TRUE;
        u0 u0Var = this.f21949m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21951o = null;
    }

    public final void f(int i10) {
        if (this.f21948l != i10) {
            this.f21948l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21949m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

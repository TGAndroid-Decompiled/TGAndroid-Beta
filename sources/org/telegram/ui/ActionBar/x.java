package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class x {
    public y f21853a;
    public int f21854b;
    public int f21855c;
    public CharSequence d;
    public int e;
    public Drawable f21856f;
    public int f21857g;
    public d6 h;
    public float f21858i;
    public Boolean f21859j;
    public Boolean f21860k;
    public int f21861l;
    public u0 f21862m;
    public ArrayList f21863n;
    public Integer f21864o;

    public final void a() {
        y yVar = this.f21853a;
        if (this.f21862m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21854b));
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
            u0 f7 = yVar.f(childCount, this.f21854b, this.f21855c, null, this.e, this.f21856f, this.f21857g, null, this.h);
            this.f21862m = f7;
            f7.setVisibility(this.f21861l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21862m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21860k;
            if (bool != null) {
                this.f21862m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21859j;
            if (bool2 != null) {
                this.f21862m.S = bool2.booleanValue();
            }
            this.f21862m.setAlpha(this.f21858i);
            ArrayList arrayList2 = this.f21863n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21862m);
                }
                this.f21863n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        u0 u0Var = this.f21862m;
        if (u0Var != null) {
            xeVar.run(u0Var);
            return;
        }
        if (this.f21863n == null) {
            this.f21863n = new ArrayList();
        }
        this.f21863n.add(xeVar);
    }

    public final void c() {
        this.f21860k = Boolean.FALSE;
        u0 u0Var = this.f21862m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21859j = Boolean.TRUE;
        u0 u0Var = this.f21862m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21864o = null;
    }

    public final void f(int i10) {
        if (this.f21861l != i10) {
            this.f21861l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21862m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

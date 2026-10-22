package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class x {
    public y f21859a;
    public int f21860b;
    public int f21861c;
    public CharSequence d;
    public int e;
    public Drawable f21862f;
    public int f21863g;
    public d6 h;
    public float f21864i;
    public Boolean f21865j;
    public Boolean f21866k;
    public int f21867l;
    public u0 f21868m;
    public ArrayList f21869n;
    public Integer f21870o;

    public final void a() {
        y yVar = this.f21859a;
        if (this.f21868m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21860b));
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
            u0 f7 = yVar.f(childCount, this.f21860b, this.f21861c, null, this.e, this.f21862f, this.f21863g, null, this.h);
            this.f21868m = f7;
            f7.setVisibility(this.f21867l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21868m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21866k;
            if (bool != null) {
                this.f21868m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21865j;
            if (bool2 != null) {
                this.f21868m.S = bool2.booleanValue();
            }
            this.f21868m.setAlpha(this.f21864i);
            ArrayList arrayList2 = this.f21869n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21868m);
                }
                this.f21869n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        u0 u0Var = this.f21868m;
        if (u0Var != null) {
            xeVar.run(u0Var);
            return;
        }
        if (this.f21869n == null) {
            this.f21869n = new ArrayList();
        }
        this.f21869n.add(xeVar);
    }

    public final void c() {
        this.f21866k = Boolean.FALSE;
        u0 u0Var = this.f21868m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21865j = Boolean.TRUE;
        u0 u0Var = this.f21868m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21870o = null;
    }

    public final void f(int i10) {
        if (this.f21867l != i10) {
            this.f21867l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21868m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class x {
    public y f21856a;
    public int f21857b;
    public int f21858c;
    public CharSequence d;
    public int e;
    public Drawable f21859f;
    public int f21860g;
    public d6 h;
    public float f21861i;
    public Boolean f21862j;
    public Boolean f21863k;
    public int f21864l;
    public u0 f21865m;
    public ArrayList f21866n;
    public Integer f21867o;

    public final void a() {
        y yVar = this.f21856a;
        if (this.f21865m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21857b));
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
            u0 f7 = yVar.f(childCount, this.f21857b, this.f21858c, null, this.e, this.f21859f, this.f21860g, null, this.h);
            this.f21865m = f7;
            f7.setVisibility(this.f21864l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21865m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21863k;
            if (bool != null) {
                this.f21865m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21862j;
            if (bool2 != null) {
                this.f21865m.S = bool2.booleanValue();
            }
            this.f21865m.setAlpha(this.f21861i);
            ArrayList arrayList2 = this.f21866n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21865m);
                }
                this.f21866n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        u0 u0Var = this.f21865m;
        if (u0Var != null) {
            xeVar.run(u0Var);
            return;
        }
        if (this.f21866n == null) {
            this.f21866n = new ArrayList();
        }
        this.f21866n.add(xeVar);
    }

    public final void c() {
        this.f21863k = Boolean.FALSE;
        u0 u0Var = this.f21865m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21862j = Boolean.TRUE;
        u0 u0Var = this.f21865m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21867o = null;
    }

    public final void f(int i10) {
        if (this.f21864l != i10) {
            this.f21864l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21865m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

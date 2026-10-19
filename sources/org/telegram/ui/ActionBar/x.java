package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class x {
    public y f21855a;
    public int f21856b;
    public int f21857c;
    public CharSequence d;
    public int e;
    public Drawable f21858f;
    public int f21859g;
    public d6 h;
    public float f21860i;
    public Boolean f21861j;
    public Boolean f21862k;
    public int f21863l;
    public u0 f21864m;
    public ArrayList f21865n;
    public Integer f21866o;

    public final void a() {
        y yVar = this.f21855a;
        if (this.f21864m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21856b));
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
            u0 f7 = yVar.f(childCount, this.f21856b, this.f21857c, null, this.e, this.f21858f, this.f21859g, null, this.h);
            this.f21864m = f7;
            f7.setVisibility(this.f21863l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21864m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21862k;
            if (bool != null) {
                this.f21864m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21861j;
            if (bool2 != null) {
                this.f21864m.S = bool2.booleanValue();
            }
            this.f21864m.setAlpha(this.f21860i);
            ArrayList arrayList2 = this.f21865n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21864m);
                }
                this.f21865n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        u0 u0Var = this.f21864m;
        if (u0Var != null) {
            xeVar.run(u0Var);
            return;
        }
        if (this.f21865n == null) {
            this.f21865n = new ArrayList();
        }
        this.f21865n.add(xeVar);
    }

    public final void c() {
        this.f21862k = Boolean.FALSE;
        u0 u0Var = this.f21864m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21861j = Boolean.TRUE;
        u0 u0Var = this.f21864m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21866o = null;
    }

    public final void f(int i10) {
        if (this.f21863l != i10) {
            this.f21863l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21864m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

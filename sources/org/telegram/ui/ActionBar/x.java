package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class x {
    public y f21656a;
    public int f21657b;
    public int f21658c;
    public CharSequence d;
    public int f21659e;
    public Drawable f21660f;
    public int f21661g;
    public d6 h;
    public float f21662i;
    public Boolean f21663j;
    public Boolean f21664k;
    public int f21665l;
    public u0 f21666m;
    public ArrayList f21667n;
    public Integer f21668o;

    public final void a() {
        y yVar = this.f21656a;
        if (this.f21666m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f21688e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21657b));
                int i11 = 0;
                while (true) {
                    if (i11 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f21688e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            u0 f7 = yVar.f(childCount, this.f21657b, this.f21658c, null, this.f21659e, this.f21660f, this.f21661g, null, this.h);
            this.f21666m = f7;
            f7.setVisibility(this.f21665l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21666m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21664k;
            if (bool != null) {
                this.f21666m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21663j;
            if (bool2 != null) {
                this.f21666m.S = bool2.booleanValue();
            }
            this.f21666m.setAlpha(this.f21662i);
            ArrayList arrayList2 = this.f21667n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21666m);
                }
                this.f21667n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        u0 u0Var = this.f21666m;
        if (u0Var != null) {
            bfVar.run(u0Var);
            return;
        }
        if (this.f21667n == null) {
            this.f21667n = new ArrayList();
        }
        this.f21667n.add(bfVar);
    }

    public final void c() {
        this.f21664k = Boolean.FALSE;
        u0 u0Var = this.f21666m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21663j = Boolean.TRUE;
        u0 u0Var = this.f21666m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21668o = null;
    }

    public final void f(int i10) {
        if (this.f21665l != i10) {
            this.f21665l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21666m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

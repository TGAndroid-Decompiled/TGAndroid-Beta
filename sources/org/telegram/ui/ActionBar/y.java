package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class y {
    public z f19715a;
    public int f19716b;
    public int f19717c;
    public CharSequence d;
    public int e;
    public Drawable f19718f;
    public int f19719g;
    public e6 h;
    public float f19720i;
    public Boolean f19721j;
    public Boolean f19722k;
    public int f19723l;
    public v0 f19724m;
    public ArrayList f19725n;
    public Integer f19726o;

    public final void a() {
        z zVar = this.f19715a;
        if (this.f19724m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19716b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f19716b, this.f19717c, null, this.e, this.f19718f, this.f19719g, null, this.h);
            this.f19724m = f7;
            f7.setVisibility(this.f19723l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19724m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19722k;
            if (bool != null) {
                this.f19724m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19721j;
            if (bool2 != null) {
                this.f19724m.S = bool2.booleanValue();
            }
            this.f19724m.setAlpha(this.f19720i);
            ArrayList arrayList2 = this.f19725n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19724m);
                }
                this.f19725n = null;
            }
        }
    }

    public final void b(af afVar) {
        v0 v0Var = this.f19724m;
        if (v0Var != null) {
            afVar.run(v0Var);
            return;
        }
        if (this.f19725n == null) {
            this.f19725n = new ArrayList();
        }
        this.f19725n.add(afVar);
    }

    public final void c() {
        this.f19722k = Boolean.FALSE;
        v0 v0Var = this.f19724m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f19721j = Boolean.TRUE;
        v0 v0Var = this.f19724m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f19726o = null;
    }

    public final void f(int i10) {
        if (this.f19723l != i10) {
            this.f19723l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f19724m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

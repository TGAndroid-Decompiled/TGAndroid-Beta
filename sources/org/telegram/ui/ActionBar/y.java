package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cf;
public final class y {
    public z f21706a;
    public int f21707b;
    public int f21708c;
    public CharSequence d;
    public int f21709e;
    public Drawable f21710f;
    public int f21711g;
    public e6 h;
    public float f21712i;
    public Boolean f21713j;
    public Boolean f21714k;
    public int f21715l;
    public v0 f21716m;
    public ArrayList f21717n;
    public Integer f21718o;

    public final void a() {
        z zVar = this.f21706a;
        if (this.f21716m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21740e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21707b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21740e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21707b, this.f21708c, null, this.f21709e, this.f21710f, this.f21711g, null, this.h);
            this.f21716m = f7;
            f7.setVisibility(this.f21715l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21716m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21714k;
            if (bool != null) {
                this.f21716m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21713j;
            if (bool2 != null) {
                this.f21716m.S = bool2.booleanValue();
            }
            this.f21716m.setAlpha(this.f21712i);
            ArrayList arrayList2 = this.f21717n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21716m);
                }
                this.f21717n = null;
            }
        }
    }

    public final void b(cf cfVar) {
        v0 v0Var = this.f21716m;
        if (v0Var != null) {
            cfVar.run(v0Var);
            return;
        }
        if (this.f21717n == null) {
            this.f21717n = new ArrayList();
        }
        this.f21717n.add(cfVar);
    }

    public final void c() {
        this.f21714k = Boolean.FALSE;
        v0 v0Var = this.f21716m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21713j = Boolean.TRUE;
        v0 v0Var = this.f21716m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21718o = null;
    }

    public final void f(int i10) {
        if (this.f21715l != i10) {
            this.f21715l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21716m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

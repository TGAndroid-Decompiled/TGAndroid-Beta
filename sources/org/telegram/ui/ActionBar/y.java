package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class y {
    public z f19711a;
    public int f19712b;
    public int f19713c;
    public CharSequence d;
    public int e;
    public Drawable f19714f;
    public int f19715g;
    public e6 h;
    public float f19716i;
    public Boolean f19717j;
    public Boolean f19718k;
    public int f19719l;
    public v0 f19720m;
    public ArrayList f19721n;
    public Integer f19722o;

    public final void a() {
        z zVar = this.f19711a;
        if (this.f19720m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19712b));
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
            v0 f7 = zVar.f(childCount, this.f19712b, this.f19713c, null, this.e, this.f19714f, this.f19715g, null, this.h);
            this.f19720m = f7;
            f7.setVisibility(this.f19719l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19720m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19718k;
            if (bool != null) {
                this.f19720m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19717j;
            if (bool2 != null) {
                this.f19720m.S = bool2.booleanValue();
            }
            this.f19720m.setAlpha(this.f19716i);
            ArrayList arrayList2 = this.f19721n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19720m);
                }
                this.f19721n = null;
            }
        }
    }

    public final void b(af afVar) {
        v0 v0Var = this.f19720m;
        if (v0Var != null) {
            afVar.run(v0Var);
            return;
        }
        if (this.f19721n == null) {
            this.f19721n = new ArrayList();
        }
        this.f19721n.add(afVar);
    }

    public final void c() {
        this.f19718k = Boolean.FALSE;
        v0 v0Var = this.f19720m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f19717j = Boolean.TRUE;
        v0 v0Var = this.f19720m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f19722o = null;
    }

    public final void f(int i10) {
        if (this.f19719l != i10) {
            this.f19719l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f19720m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

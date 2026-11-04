package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.u10;
import org.telegram.ui.le;
public final class w {
    public x f28749a;
    public int f28750b;
    public int f28751c;
    public CharSequence d;
    public int f28752e;
    public Drawable f28753f;
    public int f28754g;
    public e6 h;
    public float f28755i;
    public Boolean f28756j;
    public Boolean f28757k;
    public int f28758l;
    public q0 f28759m;
    public ArrayList f28760n;

    public final void a() {
        x xVar = this.f28749a;
        if (this.f28759m == null) {
            int childCount = xVar.getChildCount();
            ArrayList arrayList = xVar.f28788e;
            int i3 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f28750b));
                int i10 = 0;
                while (true) {
                    if (i10 >= xVar.getChildCount()) {
                        break;
                    }
                    Object tag = xVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (xVar.f28788e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            q0 f10 = xVar.f(childCount, this.f28750b, this.f28751c, null, this.f28752e, this.f28753f, this.f28754g, null, this.h);
            this.f28759m = f10;
            f10.setVisibility(this.f28758l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f28759m.setContentDescription(charSequence);
            }
            Boolean bool = this.f28757k;
            if (bool != null) {
                this.f28759m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f28756j;
            if (bool2 != null) {
                this.f28759m.T = bool2.booleanValue();
            }
            this.f28759m.setAlpha(this.f28755i);
            ArrayList arrayList2 = this.f28760n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    ((u10) obj).a(this.f28759m);
                }
                this.f28760n = null;
            }
        }
    }

    public final void b(le leVar) {
        q0 q0Var = this.f28759m;
        if (q0Var != null) {
            leVar.a(q0Var);
            return;
        }
        if (this.f28760n == null) {
            this.f28760n = new ArrayList();
        }
        this.f28760n.add(leVar);
    }

    public final void c() {
        this.f28757k = Boolean.FALSE;
        q0 q0Var = this.f28759m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.f28756j = Boolean.TRUE;
        q0 q0Var = this.f28759m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i3) {
        if (this.f28758l != i3) {
            this.f28758l = i3;
            if (i3 == 0) {
                a();
            }
            q0 q0Var = this.f28759m;
            if (q0Var != null) {
                q0Var.setVisibility(i3);
            }
        }
    }
}

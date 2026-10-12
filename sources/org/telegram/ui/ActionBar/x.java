package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.jf;
public final class x {
    public y f20790a;
    public int f20791b;
    public int f20792c;
    public CharSequence d;
    public int e;
    public Drawable f20793f;
    public int f20794g;
    public c6 h;
    public float f20795i;
    public Boolean f20796j;
    public Boolean f20797k;
    public int f20798l;
    public u0 f20799m;
    public ArrayList f20800n;
    public Integer f20801o;

    public final void a() {
        y yVar = this.f20790a;
        if (this.f20799m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f20791b));
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
            u0 f7 = yVar.f(childCount, this.f20791b, this.f20792c, null, this.e, this.f20793f, this.f20794g, null, this.h);
            this.f20799m = f7;
            f7.setVisibility(this.f20798l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f20799m.setContentDescription(charSequence);
            }
            Boolean bool = this.f20797k;
            if (bool != null) {
                this.f20799m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f20796j;
            if (bool2 != null) {
                this.f20799m.S = bool2.booleanValue();
            }
            this.f20799m.setAlpha(this.f20795i);
            ArrayList arrayList2 = this.f20800n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f20799m);
                }
                this.f20800n = null;
            }
        }
    }

    public final void b(jf jfVar) {
        u0 u0Var = this.f20799m;
        if (u0Var != null) {
            jfVar.run(u0Var);
            return;
        }
        if (this.f20800n == null) {
            this.f20800n = new ArrayList();
        }
        this.f20800n.add(jfVar);
    }

    public final void c() {
        this.f20797k = Boolean.FALSE;
        u0 u0Var = this.f20799m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f20796j = Boolean.TRUE;
        u0 u0Var = this.f20799m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f20801o = null;
    }

    public final void f(int i10) {
        if (this.f20798l != i10) {
            this.f20798l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f20799m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

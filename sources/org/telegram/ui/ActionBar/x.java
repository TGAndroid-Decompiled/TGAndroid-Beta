package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ze;
public final class x {
    public y f21852a;
    public int f21853b;
    public int f21854c;
    public CharSequence d;
    public int e;
    public Drawable f21855f;
    public int f21856g;
    public d6 h;
    public float f21857i;
    public Boolean f21858j;
    public Boolean f21859k;
    public int f21860l;
    public u0 f21861m;
    public ArrayList f21862n;
    public Integer f21863o;

    public final void a() {
        y yVar = this.f21852a;
        if (this.f21861m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21853b));
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
            u0 f7 = yVar.f(childCount, this.f21853b, this.f21854c, null, this.e, this.f21855f, this.f21856g, null, this.h);
            this.f21861m = f7;
            f7.setVisibility(this.f21860l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21861m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21859k;
            if (bool != null) {
                this.f21861m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21858j;
            if (bool2 != null) {
                this.f21861m.S = bool2.booleanValue();
            }
            this.f21861m.setAlpha(this.f21857i);
            ArrayList arrayList2 = this.f21862n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21861m);
                }
                this.f21862n = null;
            }
        }
    }

    public final void b(ze zeVar) {
        u0 u0Var = this.f21861m;
        if (u0Var != null) {
            zeVar.run(u0Var);
            return;
        }
        if (this.f21862n == null) {
            this.f21862n = new ArrayList();
        }
        this.f21862n.add(zeVar);
    }

    public final void c() {
        this.f21859k = Boolean.FALSE;
        u0 u0Var = this.f21861m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21858j = Boolean.TRUE;
        u0 u0Var = this.f21861m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21863o = null;
    }

    public final void f(int i10) {
        if (this.f21860l != i10) {
            this.f21860l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21861m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

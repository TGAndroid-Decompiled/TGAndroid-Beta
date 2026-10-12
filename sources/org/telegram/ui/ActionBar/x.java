package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.gf;
public final class x {
    public y f21430a;
    public int f21431b;
    public int f21432c;
    public CharSequence d;
    public int f21433e;
    public Drawable f21434f;
    public int f21435g;
    public c6 h;
    public float f21436i;
    public Boolean f21437j;
    public Boolean f21438k;
    public int f21439l;
    public u0 f21440m;
    public ArrayList f21441n;
    public Integer f21442o;

    public final void a() {
        y yVar = this.f21430a;
        if (this.f21440m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f21462e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21431b));
                int i11 = 0;
                while (true) {
                    if (i11 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f21462e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            u0 f7 = yVar.f(childCount, this.f21431b, this.f21432c, null, this.f21433e, this.f21434f, this.f21435g, null, this.h);
            this.f21440m = f7;
            f7.setVisibility(this.f21439l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21440m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21438k;
            if (bool != null) {
                this.f21440m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21437j;
            if (bool2 != null) {
                this.f21440m.S = bool2.booleanValue();
            }
            this.f21440m.setAlpha(this.f21436i);
            ArrayList arrayList2 = this.f21441n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21440m);
                }
                this.f21441n = null;
            }
        }
    }

    public final void b(gf gfVar) {
        u0 u0Var = this.f21440m;
        if (u0Var != null) {
            gfVar.run(u0Var);
            return;
        }
        if (this.f21441n == null) {
            this.f21441n = new ArrayList();
        }
        this.f21441n.add(gfVar);
    }

    public final void c() {
        this.f21438k = Boolean.FALSE;
        u0 u0Var = this.f21440m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21437j = Boolean.TRUE;
        u0 u0Var = this.f21440m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21442o = null;
    }

    public final void f(int i10) {
        if (this.f21439l != i10) {
            this.f21439l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21440m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

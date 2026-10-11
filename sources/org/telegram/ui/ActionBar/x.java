package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class x {
    public y f21692a;
    public int f21693b;
    public int f21694c;
    public CharSequence d;
    public int f21695e;
    public Drawable f21696f;
    public int f21697g;
    public d6 h;
    public float f21698i;
    public Boolean f21699j;
    public Boolean f21700k;
    public int f21701l;
    public u0 f21702m;
    public ArrayList f21703n;
    public Integer f21704o;

    public final void a() {
        y yVar = this.f21692a;
        if (this.f21702m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f21724e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21693b));
                int i11 = 0;
                while (true) {
                    if (i11 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f21724e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            u0 f7 = yVar.f(childCount, this.f21693b, this.f21694c, null, this.f21695e, this.f21696f, this.f21697g, null, this.h);
            this.f21702m = f7;
            f7.setVisibility(this.f21701l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21702m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21700k;
            if (bool != null) {
                this.f21702m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21699j;
            if (bool2 != null) {
                this.f21702m.S = bool2.booleanValue();
            }
            this.f21702m.setAlpha(this.f21698i);
            ArrayList arrayList2 = this.f21703n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21702m);
                }
                this.f21703n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        u0 u0Var = this.f21702m;
        if (u0Var != null) {
            bfVar.run(u0Var);
            return;
        }
        if (this.f21703n == null) {
            this.f21703n = new ArrayList();
        }
        this.f21703n.add(bfVar);
    }

    public final void c() {
        this.f21700k = Boolean.FALSE;
        u0 u0Var = this.f21702m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21699j = Boolean.TRUE;
        u0 u0Var = this.f21702m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21704o = null;
    }

    public final void f(int i10) {
        if (this.f21701l != i10) {
            this.f21701l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21702m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

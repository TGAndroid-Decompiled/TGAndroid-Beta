package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class x {
    public y f19905a;
    public int f19906b;
    public int f19907c;
    public CharSequence d;
    public int e;
    public Drawable f19908f;
    public int f19909g;
    public d6 h;
    public float f19910i;
    public Boolean f19911j;
    public Boolean f19912k;
    public int f19913l;
    public u0 f19914m;
    public ArrayList f19915n;
    public Integer f19916o;

    public final void a() {
        y yVar = this.f19905a;
        if (this.f19914m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19906b));
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
            u0 f7 = yVar.f(childCount, this.f19906b, this.f19907c, null, this.e, this.f19908f, this.f19909g, null, this.h);
            this.f19914m = f7;
            f7.setVisibility(this.f19913l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19914m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19912k;
            if (bool != null) {
                this.f19914m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19911j;
            if (bool2 != null) {
                this.f19914m.S = bool2.booleanValue();
            }
            this.f19914m.setAlpha(this.f19910i);
            ArrayList arrayList2 = this.f19915n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19914m);
                }
                this.f19915n = null;
            }
        }
    }

    public final void b(af afVar) {
        u0 u0Var = this.f19914m;
        if (u0Var != null) {
            afVar.run(u0Var);
            return;
        }
        if (this.f19915n == null) {
            this.f19915n = new ArrayList();
        }
        this.f19915n.add(afVar);
    }

    public final void c() {
        this.f19912k = Boolean.FALSE;
        u0 u0Var = this.f19914m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f19911j = Boolean.TRUE;
        u0 u0Var = this.f19914m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f19916o = null;
    }

    public final void f(int i10) {
        if (this.f19913l != i10) {
            this.f19913l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f19914m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

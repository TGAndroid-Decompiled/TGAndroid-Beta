package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class x {
    public y f19904a;
    public int f19905b;
    public int f19906c;
    public CharSequence d;
    public int e;
    public Drawable f19907f;
    public int f19908g;
    public d6 h;
    public float f19909i;
    public Boolean f19910j;
    public Boolean f19911k;
    public int f19912l;
    public u0 f19913m;
    public ArrayList f19914n;
    public Integer f19915o;

    public final void a() {
        y yVar = this.f19904a;
        if (this.f19913m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19905b));
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
            u0 f7 = yVar.f(childCount, this.f19905b, this.f19906c, null, this.e, this.f19907f, this.f19908g, null, this.h);
            this.f19913m = f7;
            f7.setVisibility(this.f19912l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19913m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19911k;
            if (bool != null) {
                this.f19913m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19910j;
            if (bool2 != null) {
                this.f19913m.S = bool2.booleanValue();
            }
            this.f19913m.setAlpha(this.f19909i);
            ArrayList arrayList2 = this.f19914n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19913m);
                }
                this.f19914n = null;
            }
        }
    }

    public final void b(af afVar) {
        u0 u0Var = this.f19913m;
        if (u0Var != null) {
            afVar.run(u0Var);
            return;
        }
        if (this.f19914n == null) {
            this.f19914n = new ArrayList();
        }
        this.f19914n.add(afVar);
    }

    public final void c() {
        this.f19911k = Boolean.FALSE;
        u0 u0Var = this.f19913m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f19910j = Boolean.TRUE;
        u0 u0Var = this.f19913m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f19915o = null;
    }

    public final void f(int i10) {
        if (this.f19912l != i10) {
            this.f19912l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f19913m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class x {
    public y f19903a;
    public int f19904b;
    public int f19905c;
    public CharSequence d;
    public int e;
    public Drawable f19906f;
    public int f19907g;
    public d6 h;
    public float f19908i;
    public Boolean f19909j;
    public Boolean f19910k;
    public int f19911l;
    public u0 f19912m;
    public ArrayList f19913n;
    public Integer f19914o;

    public final void a() {
        y yVar = this.f19903a;
        if (this.f19912m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19904b));
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
            u0 f7 = yVar.f(childCount, this.f19904b, this.f19905c, null, this.e, this.f19906f, this.f19907g, null, this.h);
            this.f19912m = f7;
            f7.setVisibility(this.f19911l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19912m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19910k;
            if (bool != null) {
                this.f19912m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19909j;
            if (bool2 != null) {
                this.f19912m.S = bool2.booleanValue();
            }
            this.f19912m.setAlpha(this.f19908i);
            ArrayList arrayList2 = this.f19913n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19912m);
                }
                this.f19913n = null;
            }
        }
    }

    public final void b(af afVar) {
        u0 u0Var = this.f19912m;
        if (u0Var != null) {
            afVar.run(u0Var);
            return;
        }
        if (this.f19913n == null) {
            this.f19913n = new ArrayList();
        }
        this.f19913n.add(afVar);
    }

    public final void c() {
        this.f19910k = Boolean.FALSE;
        u0 u0Var = this.f19912m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f19909j = Boolean.TRUE;
        u0 u0Var = this.f19912m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f19914o = null;
    }

    public final void f(int i10) {
        if (this.f19911l != i10) {
            this.f19911l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f19912m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

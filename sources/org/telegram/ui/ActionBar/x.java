package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class x {
    public y f19920a;
    public int f19921b;
    public int f19922c;
    public CharSequence d;
    public int e;
    public Drawable f19923f;
    public int f19924g;
    public d6 h;
    public float f19925i;
    public Boolean f19926j;
    public Boolean f19927k;
    public int f19928l;
    public u0 f19929m;
    public ArrayList f19930n;
    public Integer f19931o;

    public final void a() {
        y yVar = this.f19920a;
        if (this.f19929m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19921b));
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
            u0 f7 = yVar.f(childCount, this.f19921b, this.f19922c, null, this.e, this.f19923f, this.f19924g, null, this.h);
            this.f19929m = f7;
            f7.setVisibility(this.f19928l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19929m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19927k;
            if (bool != null) {
                this.f19929m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19926j;
            if (bool2 != null) {
                this.f19929m.S = bool2.booleanValue();
            }
            this.f19929m.setAlpha(this.f19925i);
            ArrayList arrayList2 = this.f19930n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19929m);
                }
                this.f19930n = null;
            }
        }
    }

    public final void b(af afVar) {
        u0 u0Var = this.f19929m;
        if (u0Var != null) {
            afVar.run(u0Var);
            return;
        }
        if (this.f19930n == null) {
            this.f19930n = new ArrayList();
        }
        this.f19930n.add(afVar);
    }

    public final void c() {
        this.f19927k = Boolean.FALSE;
        u0 u0Var = this.f19929m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f19926j = Boolean.TRUE;
        u0 u0Var = this.f19929m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f19931o = null;
    }

    public final void f(int i10) {
        if (this.f19928l != i10) {
            this.f19928l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f19929m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.se;
public final class y {
    public z f23955a;
    public int f23956b;
    public int f23957c;
    public CharSequence d;
    public int f23958e;
    public Drawable f23959f;
    public int f23960g;
    public b6 h;
    public float f23961i;
    public Boolean f23962j;
    public Boolean f23963k;
    public int f23964l;
    public w0 f23965m;
    public ArrayList f23966n;
    public Integer f23967o;

    public final void a() {
        z zVar = this.f23955a;
        if (this.f23965m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f24001e;
            int i9 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f23956b));
                int i10 = 0;
                while (true) {
                    if (i10 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f24001e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            w0 f10 = zVar.f(childCount, this.f23956b, this.f23957c, null, this.f23958e, this.f23959f, this.f23960g, null, this.h);
            this.f23965m = f10;
            f10.setVisibility(this.f23964l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f23965m.setContentDescription(charSequence);
            }
            Boolean bool = this.f23963k;
            if (bool != null) {
                this.f23965m.N = bool.booleanValue();
            }
            Boolean bool2 = this.f23962j;
            if (bool2 != null) {
                this.f23965m.O = bool2.booleanValue();
            }
            this.f23965m.setAlpha(this.f23961i);
            ArrayList arrayList2 = this.f23966n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i9 < size) {
                    Object obj = arrayList2.get(i9);
                    i9++;
                    ((Utilities.Callback) obj).run(this.f23965m);
                }
                this.f23966n = null;
            }
        }
    }

    public final void b(se seVar) {
        w0 w0Var = this.f23965m;
        if (w0Var != null) {
            seVar.run(w0Var);
            return;
        }
        if (this.f23966n == null) {
            this.f23966n = new ArrayList();
        }
        this.f23966n.add(seVar);
    }

    public final void c() {
        this.f23963k = Boolean.FALSE;
        w0 w0Var = this.f23965m;
        if (w0Var != null) {
            w0Var.N = false;
        }
    }

    public final void d() {
        this.f23962j = Boolean.TRUE;
        w0 w0Var = this.f23965m;
        if (w0Var != null) {
            w0Var.O = true;
        }
    }

    public final void e() {
        this.f23967o = null;
    }

    public final void f(int i9) {
        if (this.f23964l != i9) {
            this.f23964l = i9;
            if (i9 == 0) {
                a();
            }
            w0 w0Var = this.f23965m;
            if (w0Var != null) {
                w0Var.setVisibility(i9);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cf;
public final class z {
    public a0 f19742a;
    public int f19743b;
    public int f19744c;
    public CharSequence d;
    public int e;
    public Drawable f19745f;
    public int f19746g;
    public f6 h;
    public float f19747i;
    public Boolean f19748j;
    public Boolean f19749k;
    public int f19750l;
    public w0 f19751m;
    public ArrayList f19752n;
    public Integer f19753o;

    public final void a() {
        a0 a0Var = this.f19742a;
        if (this.f19751m == null) {
            int childCount = a0Var.getChildCount();
            ArrayList arrayList = a0Var.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19743b));
                int i11 = 0;
                while (true) {
                    if (i11 >= a0Var.getChildCount()) {
                        break;
                    }
                    Object tag = a0Var.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (a0Var.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            w0 f7 = a0Var.f(childCount, this.f19743b, this.f19744c, null, this.e, this.f19745f, this.f19746g, null, this.h);
            this.f19751m = f7;
            f7.setVisibility(this.f19750l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19751m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19749k;
            if (bool != null) {
                this.f19751m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19748j;
            if (bool2 != null) {
                this.f19751m.S = bool2.booleanValue();
            }
            this.f19751m.setAlpha(this.f19747i);
            ArrayList arrayList2 = this.f19752n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19751m);
                }
                this.f19752n = null;
            }
        }
    }

    public final void b(cf cfVar) {
        w0 w0Var = this.f19751m;
        if (w0Var != null) {
            cfVar.run(w0Var);
            return;
        }
        if (this.f19752n == null) {
            this.f19752n = new ArrayList();
        }
        this.f19752n.add(cfVar);
    }

    public final void c() {
        this.f19749k = Boolean.FALSE;
        w0 w0Var = this.f19751m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f19748j = Boolean.TRUE;
        w0 w0Var = this.f19751m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f19753o = null;
    }

    public final void f(int i10) {
        if (this.f19750l != i10) {
            this.f19750l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f19751m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

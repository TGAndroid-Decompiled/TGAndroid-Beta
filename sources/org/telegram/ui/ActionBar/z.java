package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cf;
public final class z {
    public a0 f19743a;
    public int f19744b;
    public int f19745c;
    public CharSequence d;
    public int e;
    public Drawable f19746f;
    public int f19747g;
    public f6 h;
    public float f19748i;
    public Boolean f19749j;
    public Boolean f19750k;
    public int f19751l;
    public w0 f19752m;
    public ArrayList f19753n;
    public Integer f19754o;

    public final void a() {
        a0 a0Var = this.f19743a;
        if (this.f19752m == null) {
            int childCount = a0Var.getChildCount();
            ArrayList arrayList = a0Var.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19744b));
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
            w0 f7 = a0Var.f(childCount, this.f19744b, this.f19745c, null, this.e, this.f19746f, this.f19747g, null, this.h);
            this.f19752m = f7;
            f7.setVisibility(this.f19751l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19752m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19750k;
            if (bool != null) {
                this.f19752m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19749j;
            if (bool2 != null) {
                this.f19752m.S = bool2.booleanValue();
            }
            this.f19752m.setAlpha(this.f19748i);
            ArrayList arrayList2 = this.f19753n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19752m);
                }
                this.f19753n = null;
            }
        }
    }

    public final void b(cf cfVar) {
        w0 w0Var = this.f19752m;
        if (w0Var != null) {
            cfVar.run(w0Var);
            return;
        }
        if (this.f19753n == null) {
            this.f19753n = new ArrayList();
        }
        this.f19753n.add(cfVar);
    }

    public final void c() {
        this.f19750k = Boolean.FALSE;
        w0 w0Var = this.f19752m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f19749j = Boolean.TRUE;
        w0 w0Var = this.f19752m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f19754o = null;
    }

    public final void f(int i10) {
        if (this.f19751l != i10) {
            this.f19751l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f19752m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

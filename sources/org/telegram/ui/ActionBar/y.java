package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class y {
    public z f22452a;
    public int f22453b;
    public int f22454c;
    public CharSequence d;
    public int f22455e;
    public Drawable f22456f;
    public int f22457g;
    public g6 h;
    public float f22458i;
    public Boolean f22459j;
    public Boolean f22460k;
    public int f22461l;
    public w0 f22462m;
    public ArrayList f22463n;
    public Integer f22464o;

    public final void a() {
        z zVar = this.f22452a;
        if (this.f22462m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f22477e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f22453b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f22477e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            w0 f10 = zVar.f(childCount, this.f22453b, this.f22454c, null, this.f22455e, this.f22456f, this.f22457g, null, this.h);
            this.f22462m = f10;
            f10.setVisibility(this.f22461l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f22462m.setContentDescription(charSequence);
            }
            Boolean bool = this.f22460k;
            if (bool != null) {
                this.f22462m.O = bool.booleanValue();
            }
            Boolean bool2 = this.f22459j;
            if (bool2 != null) {
                this.f22462m.P = bool2.booleanValue();
            }
            this.f22462m.setAlpha(this.f22458i);
            ArrayList arrayList2 = this.f22463n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f22462m);
                }
                this.f22463n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        w0 w0Var = this.f22462m;
        if (w0Var != null) {
            xeVar.run(w0Var);
            return;
        }
        if (this.f22463n == null) {
            this.f22463n = new ArrayList();
        }
        this.f22463n.add(xeVar);
    }

    public final void c() {
        this.f22460k = Boolean.FALSE;
        w0 w0Var = this.f22462m;
        if (w0Var != null) {
            w0Var.O = false;
        }
    }

    public final void d() {
        this.f22459j = Boolean.TRUE;
        w0 w0Var = this.f22462m;
        if (w0Var != null) {
            w0Var.P = true;
        }
    }

    public final void e() {
        this.f22464o = null;
    }

    public final void f(int i10) {
        if (this.f22461l != i10) {
            this.f22461l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f22462m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

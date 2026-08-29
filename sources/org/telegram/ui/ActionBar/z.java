package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.qe;
public final class z {
    public a0 f23994a;
    public int f23995b;
    public int f23996c;
    public CharSequence d;
    public int f23997e;
    public Drawable f23998f;
    public int f23999g;
    public c6 h;
    public float f24000i;
    public Boolean f24001j;
    public Boolean f24002k;
    public int f24003l;
    public w0 f24004m;
    public ArrayList f24005n;
    public Integer f24006o;

    public final void a() {
        a0 a0Var = this.f23994a;
        if (this.f24004m == null) {
            int childCount = a0Var.getChildCount();
            ArrayList arrayList = a0Var.f22721e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f23995b));
                int i11 = 0;
                while (true) {
                    if (i11 >= a0Var.getChildCount()) {
                        break;
                    }
                    Object tag = a0Var.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (a0Var.f22721e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            w0 f9 = a0Var.f(childCount, this.f23995b, this.f23996c, null, this.f23997e, this.f23998f, this.f23999g, null, this.h);
            this.f24004m = f9;
            f9.setVisibility(this.f24003l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f24004m.setContentDescription(charSequence);
            }
            Boolean bool = this.f24002k;
            if (bool != null) {
                this.f24004m.N = bool.booleanValue();
            }
            Boolean bool2 = this.f24001j;
            if (bool2 != null) {
                this.f24004m.O = bool2.booleanValue();
            }
            this.f24004m.setAlpha(this.f24000i);
            ArrayList arrayList2 = this.f24005n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f24004m);
                }
                this.f24005n = null;
            }
        }
    }

    public final void b(qe qeVar) {
        w0 w0Var = this.f24004m;
        if (w0Var != null) {
            qeVar.run(w0Var);
            return;
        }
        if (this.f24005n == null) {
            this.f24005n = new ArrayList();
        }
        this.f24005n.add(qeVar);
    }

    public final void c() {
        this.f24002k = Boolean.FALSE;
        w0 w0Var = this.f24004m;
        if (w0Var != null) {
            w0Var.N = false;
        }
    }

    public final void d() {
        this.f24001j = Boolean.TRUE;
        w0 w0Var = this.f24004m;
        if (w0Var != null) {
            w0Var.O = true;
        }
    }

    public final void e() {
        this.f24006o = null;
    }

    public final void f(int i10) {
        if (this.f24003l != i10) {
            this.f24003l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f24004m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

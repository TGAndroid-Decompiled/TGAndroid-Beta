package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class y {
    public z f22450a;
    public int f22451b;
    public int f22452c;
    public CharSequence d;
    public int f22453e;
    public Drawable f22454f;
    public int f22455g;
    public g6 h;
    public float f22456i;
    public Boolean f22457j;
    public Boolean f22458k;
    public int f22459l;
    public w0 f22460m;
    public ArrayList f22461n;
    public Integer f22462o;

    public final void a() {
        z zVar = this.f22450a;
        if (this.f22460m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f22475e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f22451b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f22475e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            w0 f10 = zVar.f(childCount, this.f22451b, this.f22452c, null, this.f22453e, this.f22454f, this.f22455g, null, this.h);
            this.f22460m = f10;
            f10.setVisibility(this.f22459l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f22460m.setContentDescription(charSequence);
            }
            Boolean bool = this.f22458k;
            if (bool != null) {
                this.f22460m.O = bool.booleanValue();
            }
            Boolean bool2 = this.f22457j;
            if (bool2 != null) {
                this.f22460m.P = bool2.booleanValue();
            }
            this.f22460m.setAlpha(this.f22456i);
            ArrayList arrayList2 = this.f22461n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f22460m);
                }
                this.f22461n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        w0 w0Var = this.f22460m;
        if (w0Var != null) {
            xeVar.run(w0Var);
            return;
        }
        if (this.f22461n == null) {
            this.f22461n = new ArrayList();
        }
        this.f22461n.add(xeVar);
    }

    public final void c() {
        this.f22458k = Boolean.FALSE;
        w0 w0Var = this.f22460m;
        if (w0Var != null) {
            w0Var.O = false;
        }
    }

    public final void d() {
        this.f22457j = Boolean.TRUE;
        w0 w0Var = this.f22460m;
        if (w0Var != null) {
            w0Var.P = true;
        }
    }

    public final void e() {
        this.f22462o = null;
    }

    public final void f(int i10) {
        if (this.f22459l != i10) {
            this.f22459l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f22460m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

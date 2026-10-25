package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ye;
public final class y {
    public z f23269a;
    public int f23270b;
    public int f23271c;
    public CharSequence d;
    public int e;
    public Drawable f23272f;
    public int f23273g;
    public u6 h;
    public float f23274i;
    public Boolean f23275j;
    public Boolean f23276k;
    public int f23277l;
    public w0 f23278m;
    public ArrayList f23279n;
    public Integer f23280o;

    public final void a() {
        z zVar = this.f23269a;
        if (this.f23278m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f23270b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            w0 f7 = zVar.f(childCount, this.f23270b, this.f23271c, null, this.e, this.f23272f, this.f23273g, null, this.h);
            this.f23278m = f7;
            f7.setVisibility(this.f23277l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f23278m.setContentDescription(charSequence);
            }
            Boolean bool = this.f23276k;
            if (bool != null) {
                this.f23278m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f23275j;
            if (bool2 != null) {
                this.f23278m.S = bool2.booleanValue();
            }
            this.f23278m.setAlpha(this.f23274i);
            ArrayList arrayList2 = this.f23279n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f23278m);
                }
                this.f23279n = null;
            }
        }
    }

    public final void b(ye yeVar) {
        w0 w0Var = this.f23278m;
        if (w0Var != null) {
            yeVar.run(w0Var);
            return;
        }
        if (this.f23279n == null) {
            this.f23279n = new ArrayList();
        }
        this.f23279n.add(yeVar);
    }

    public final void c() {
        this.f23276k = Boolean.FALSE;
        w0 w0Var = this.f23278m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f23275j = Boolean.TRUE;
        w0 w0Var = this.f23278m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f23280o = null;
    }

    public final void f(int i10) {
        if (this.f23277l != i10) {
            this.f23277l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f23278m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

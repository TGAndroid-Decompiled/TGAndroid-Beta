package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ye;
public final class y {
    public z f23272a;
    public int f23273b;
    public int f23274c;
    public CharSequence d;
    public int e;
    public Drawable f23275f;
    public int f23276g;
    public u6 h;
    public float f23277i;
    public Boolean f23278j;
    public Boolean f23279k;
    public int f23280l;
    public w0 f23281m;
    public ArrayList f23282n;
    public Integer f23283o;

    public final void a() {
        z zVar = this.f23272a;
        if (this.f23281m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f23273b));
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
            w0 f7 = zVar.f(childCount, this.f23273b, this.f23274c, null, this.e, this.f23275f, this.f23276g, null, this.h);
            this.f23281m = f7;
            f7.setVisibility(this.f23280l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f23281m.setContentDescription(charSequence);
            }
            Boolean bool = this.f23279k;
            if (bool != null) {
                this.f23281m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f23278j;
            if (bool2 != null) {
                this.f23281m.S = bool2.booleanValue();
            }
            this.f23281m.setAlpha(this.f23277i);
            ArrayList arrayList2 = this.f23282n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f23281m);
                }
                this.f23282n = null;
            }
        }
    }

    public final void b(ye yeVar) {
        w0 w0Var = this.f23281m;
        if (w0Var != null) {
            yeVar.run(w0Var);
            return;
        }
        if (this.f23282n == null) {
            this.f23282n = new ArrayList();
        }
        this.f23282n.add(yeVar);
    }

    public final void c() {
        this.f23279k = Boolean.FALSE;
        w0 w0Var = this.f23281m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f23278j = Boolean.TRUE;
        w0 w0Var = this.f23281m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f23283o = null;
    }

    public final void f(int i10) {
        if (this.f23280l != i10) {
            this.f23280l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f23281m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

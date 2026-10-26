package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ye;
public final class y {
    public z f23271a;
    public int f23272b;
    public int f23273c;
    public CharSequence d;
    public int e;
    public Drawable f23274f;
    public int f23275g;
    public u6 h;
    public float f23276i;
    public Boolean f23277j;
    public Boolean f23278k;
    public int f23279l;
    public w0 f23280m;
    public ArrayList f23281n;
    public Integer f23282o;

    public final void a() {
        z zVar = this.f23271a;
        if (this.f23280m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f23272b));
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
            w0 f7 = zVar.f(childCount, this.f23272b, this.f23273c, null, this.e, this.f23274f, this.f23275g, null, this.h);
            this.f23280m = f7;
            f7.setVisibility(this.f23279l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f23280m.setContentDescription(charSequence);
            }
            Boolean bool = this.f23278k;
            if (bool != null) {
                this.f23280m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f23277j;
            if (bool2 != null) {
                this.f23280m.S = bool2.booleanValue();
            }
            this.f23280m.setAlpha(this.f23276i);
            ArrayList arrayList2 = this.f23281n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f23280m);
                }
                this.f23281n = null;
            }
        }
    }

    public final void b(ye yeVar) {
        w0 w0Var = this.f23280m;
        if (w0Var != null) {
            yeVar.run(w0Var);
            return;
        }
        if (this.f23281n == null) {
            this.f23281n = new ArrayList();
        }
        this.f23281n.add(yeVar);
    }

    public final void c() {
        this.f23278k = Boolean.FALSE;
        w0 w0Var = this.f23280m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f23277j = Boolean.TRUE;
        w0 w0Var = this.f23280m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f23282o = null;
    }

    public final void f(int i10) {
        if (this.f23279l != i10) {
            this.f23279l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f23280m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

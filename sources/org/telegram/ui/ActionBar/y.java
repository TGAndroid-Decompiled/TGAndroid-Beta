package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.df;
public final class y {
    public z f18758a;
    public int f18759b;
    public int f18760c;
    public CharSequence d;
    public int e;
    public Drawable f18761f;
    public int f18762g;
    public f6 h;
    public float f18763i;
    public Boolean f18764j;
    public Boolean f18765k;
    public int f18766l;
    public w0 f18767m;
    public ArrayList f18768n;
    public Integer f18769o;

    public final void a() {
        z zVar = this.f18758a;
        if (this.f18767m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f18759b));
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
            w0 f7 = zVar.f(childCount, this.f18759b, this.f18760c, null, this.e, this.f18761f, this.f18762g, null, this.h);
            this.f18767m = f7;
            f7.setVisibility(this.f18766l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f18767m.setContentDescription(charSequence);
            }
            Boolean bool = this.f18765k;
            if (bool != null) {
                this.f18767m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f18764j;
            if (bool2 != null) {
                this.f18767m.S = bool2.booleanValue();
            }
            this.f18767m.setAlpha(this.f18763i);
            ArrayList arrayList2 = this.f18768n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f18767m);
                }
                this.f18768n = null;
            }
        }
    }

    public final void b(df dfVar) {
        w0 w0Var = this.f18767m;
        if (w0Var != null) {
            dfVar.run(w0Var);
            return;
        }
        if (this.f18768n == null) {
            this.f18768n = new ArrayList();
        }
        this.f18768n.add(dfVar);
    }

    public final void c() {
        this.f18765k = Boolean.FALSE;
        w0 w0Var = this.f18767m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f18764j = Boolean.TRUE;
        w0 w0Var = this.f18767m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f18769o = null;
    }

    public final void f(int i10) {
        if (this.f18766l != i10) {
            this.f18766l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f18767m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.df;
public final class z {
    public a0 f19953a;
    public int f19954b;
    public int f19955c;
    public CharSequence d;
    public int e;
    public Drawable f19956f;
    public int f19957g;
    public e6 h;
    public float f19958i;
    public Boolean f19959j;
    public Boolean f19960k;
    public int f19961l;
    public w0 f19962m;
    public ArrayList f19963n;
    public Integer f19964o;

    public final void a() {
        a0 a0Var = this.f19953a;
        if (this.f19962m == null) {
            int childCount = a0Var.getChildCount();
            ArrayList arrayList = a0Var.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19954b));
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
            w0 f7 = a0Var.f(childCount, this.f19954b, this.f19955c, null, this.e, this.f19956f, this.f19957g, null, this.h);
            this.f19962m = f7;
            f7.setVisibility(this.f19961l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19962m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19960k;
            if (bool != null) {
                this.f19962m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19959j;
            if (bool2 != null) {
                this.f19962m.S = bool2.booleanValue();
            }
            this.f19962m.setAlpha(this.f19958i);
            ArrayList arrayList2 = this.f19963n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19962m);
                }
                this.f19963n = null;
            }
        }
    }

    public final void b(df dfVar) {
        w0 w0Var = this.f19962m;
        if (w0Var != null) {
            dfVar.run(w0Var);
            return;
        }
        if (this.f19963n == null) {
            this.f19963n = new ArrayList();
        }
        this.f19963n.add(dfVar);
    }

    public final void c() {
        this.f19960k = Boolean.FALSE;
        w0 w0Var = this.f19962m;
        if (w0Var != null) {
            w0Var.R = false;
        }
    }

    public final void d() {
        this.f19959j = Boolean.TRUE;
        w0 w0Var = this.f19962m;
        if (w0Var != null) {
            w0Var.S = true;
        }
    }

    public final void e() {
        this.f19964o = null;
    }

    public final void f(int i10) {
        if (this.f19961l != i10) {
            this.f19961l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f19962m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

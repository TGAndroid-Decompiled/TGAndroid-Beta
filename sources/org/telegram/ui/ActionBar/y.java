package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.cf;
public final class y {
    public z f21702a;
    public int f21703b;
    public int f21704c;
    public CharSequence d;
    public int f21705e;
    public Drawable f21706f;
    public int f21707g;
    public e6 h;
    public float f21708i;
    public Boolean f21709j;
    public Boolean f21710k;
    public int f21711l;
    public v0 f21712m;
    public ArrayList f21713n;
    public Integer f21714o;

    public final void a() {
        z zVar = this.f21702a;
        if (this.f21712m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21736e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21703b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21736e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21703b, this.f21704c, null, this.f21705e, this.f21706f, this.f21707g, null, this.h);
            this.f21712m = f7;
            f7.setVisibility(this.f21711l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21712m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21710k;
            if (bool != null) {
                this.f21712m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21709j;
            if (bool2 != null) {
                this.f21712m.S = bool2.booleanValue();
            }
            this.f21712m.setAlpha(this.f21708i);
            ArrayList arrayList2 = this.f21713n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21712m);
                }
                this.f21713n = null;
            }
        }
    }

    public final void b(cf cfVar) {
        v0 v0Var = this.f21712m;
        if (v0Var != null) {
            cfVar.run(v0Var);
            return;
        }
        if (this.f21713n == null) {
            this.f21713n = new ArrayList();
        }
        this.f21713n.add(cfVar);
    }

    public final void c() {
        this.f21710k = Boolean.FALSE;
        v0 v0Var = this.f21712m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21709j = Boolean.TRUE;
        v0 v0Var = this.f21712m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21714o = null;
    }

    public final void f(int i10) {
        if (this.f21711l != i10) {
            this.f21711l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21712m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

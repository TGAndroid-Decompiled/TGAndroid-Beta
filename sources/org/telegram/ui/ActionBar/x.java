package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.gf;
public final class x {
    public y f21431a;
    public int f21432b;
    public int f21433c;
    public CharSequence d;
    public int f21434e;
    public Drawable f21435f;
    public int f21436g;
    public c6 h;
    public float f21437i;
    public Boolean f21438j;
    public Boolean f21439k;
    public int f21440l;
    public u0 f21441m;
    public ArrayList f21442n;
    public Integer f21443o;

    public final void a() {
        y yVar = this.f21431a;
        if (this.f21441m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f21463e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21432b));
                int i11 = 0;
                while (true) {
                    if (i11 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f21463e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            u0 f7 = yVar.f(childCount, this.f21432b, this.f21433c, null, this.f21434e, this.f21435f, this.f21436g, null, this.h);
            this.f21441m = f7;
            f7.setVisibility(this.f21440l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21441m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21439k;
            if (bool != null) {
                this.f21441m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21438j;
            if (bool2 != null) {
                this.f21441m.S = bool2.booleanValue();
            }
            this.f21441m.setAlpha(this.f21437i);
            ArrayList arrayList2 = this.f21442n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21441m);
                }
                this.f21442n = null;
            }
        }
    }

    public final void b(gf gfVar) {
        u0 u0Var = this.f21441m;
        if (u0Var != null) {
            gfVar.run(u0Var);
            return;
        }
        if (this.f21442n == null) {
            this.f21442n = new ArrayList();
        }
        this.f21442n.add(gfVar);
    }

    public final void c() {
        this.f21439k = Boolean.FALSE;
        u0 u0Var = this.f21441m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f21438j = Boolean.TRUE;
        u0 u0Var = this.f21441m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f21443o = null;
    }

    public final void f(int i10) {
        if (this.f21440l != i10) {
            this.f21440l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f21441m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

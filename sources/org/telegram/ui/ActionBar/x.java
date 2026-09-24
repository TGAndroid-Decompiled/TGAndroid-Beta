package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class x {
    public y f19889a;
    public int f19890b;
    public int f19891c;
    public CharSequence d;
    public int e;
    public Drawable f19892f;
    public int f19893g;
    public d6 h;
    public float f19894i;
    public Boolean f19895j;
    public Boolean f19896k;
    public int f19897l;
    public u0 f19898m;
    public ArrayList f19899n;
    public Integer f19900o;

    public final void a() {
        y yVar = this.f19889a;
        if (this.f19898m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19890b));
                int i11 = 0;
                while (true) {
                    if (i11 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            u0 f7 = yVar.f(childCount, this.f19890b, this.f19891c, null, this.e, this.f19892f, this.f19893g, null, this.h);
            this.f19898m = f7;
            f7.setVisibility(this.f19897l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19898m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19896k;
            if (bool != null) {
                this.f19898m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19895j;
            if (bool2 != null) {
                this.f19898m.S = bool2.booleanValue();
            }
            this.f19898m.setAlpha(this.f19894i);
            ArrayList arrayList2 = this.f19899n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19898m);
                }
                this.f19899n = null;
            }
        }
    }

    public final void b(af afVar) {
        u0 u0Var = this.f19898m;
        if (u0Var != null) {
            afVar.run(u0Var);
            return;
        }
        if (this.f19899n == null) {
            this.f19899n = new ArrayList();
        }
        this.f19899n.add(afVar);
    }

    public final void c() {
        this.f19896k = Boolean.FALSE;
        u0 u0Var = this.f19898m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f19895j = Boolean.TRUE;
        u0 u0Var = this.f19898m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f19900o = null;
    }

    public final void f(int i10) {
        if (this.f19897l != i10) {
            this.f19897l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f19898m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

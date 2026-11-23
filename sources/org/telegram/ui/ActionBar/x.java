package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.w10;
import org.telegram.ui.me;
public final class x {
    public y f30290a;
    public int f30291b;
    public int f30292c;
    public CharSequence d;
    public int f30293e;
    public Drawable f30294f;
    public int f30295g;
    public i6 h;
    public float f30296i;
    public Boolean f30297j;
    public Boolean f30298k;
    public int f30299l;
    public q0 f30300m;
    public ArrayList f30301n;

    public final void a() {
        y yVar = this.f30290a;
        if (this.f30300m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f30342e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f30291b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f30342e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            q0 f10 = yVar.f(childCount, this.f30291b, this.f30292c, null, this.f30293e, this.f30294f, this.f30295g, null, this.h);
            this.f30300m = f10;
            f10.setVisibility(this.f30299l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f30300m.setContentDescription(charSequence);
            }
            Boolean bool = this.f30298k;
            if (bool != null) {
                this.f30300m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f30297j;
            if (bool2 != null) {
                this.f30300m.T = bool2.booleanValue();
            }
            this.f30300m.setAlpha(this.f30296i);
            ArrayList arrayList2 = this.f30301n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((w10) obj).a(this.f30300m);
                }
                this.f30301n = null;
            }
        }
    }

    public final void b(me meVar) {
        q0 q0Var = this.f30300m;
        if (q0Var != null) {
            meVar.a(q0Var);
            return;
        }
        if (this.f30301n == null) {
            this.f30301n = new ArrayList();
        }
        this.f30301n.add(meVar);
    }

    public final void c() {
        this.f30298k = Boolean.FALSE;
        q0 q0Var = this.f30300m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.f30297j = Boolean.TRUE;
        q0 q0Var = this.f30300m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f30299l != i7) {
            this.f30299l = i7;
            if (i7 == 0) {
                a();
            }
            q0 q0Var = this.f30300m;
            if (q0Var != null) {
                q0Var.setVisibility(i7);
            }
        }
    }
}

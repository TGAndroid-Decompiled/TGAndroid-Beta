package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.ui.me;
public final class x {
    public y f30231a;
    public int f30232b;
    public int f30233c;
    public CharSequence d;
    public int f30234e;
    public Drawable f30235f;
    public int f30236g;
    public h6 h;
    public float f30237i;
    public Boolean f30238j;
    public Boolean f30239k;
    public int f30240l;
    public q0 f30241m;
    public ArrayList f30242n;

    public final void a() {
        y yVar = this.f30231a;
        if (this.f30241m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f30285e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f30232b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f30285e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            q0 f10 = yVar.f(childCount, this.f30232b, this.f30233c, null, this.f30234e, this.f30235f, this.f30236g, null, this.h);
            this.f30241m = f10;
            f10.setVisibility(this.f30240l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f30241m.setContentDescription(charSequence);
            }
            Boolean bool = this.f30239k;
            if (bool != null) {
                this.f30241m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f30238j;
            if (bool2 != null) {
                this.f30241m.T = bool2.booleanValue();
            }
            this.f30241m.setAlpha(this.f30237i);
            ArrayList arrayList2 = this.f30242n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((y10) obj).a(this.f30241m);
                }
                this.f30242n = null;
            }
        }
    }

    public final void b(me meVar) {
        q0 q0Var = this.f30241m;
        if (q0Var != null) {
            meVar.a(q0Var);
            return;
        }
        if (this.f30242n == null) {
            this.f30242n = new ArrayList();
        }
        this.f30242n.add(meVar);
    }

    public final void c() {
        this.f30239k = Boolean.FALSE;
        q0 q0Var = this.f30241m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.f30238j = Boolean.TRUE;
        q0 q0Var = this.f30241m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f30240l != i7) {
            this.f30240l = i7;
            if (i7 == 0) {
                a();
            }
            q0 q0Var = this.f30241m;
            if (q0Var != null) {
                q0Var.setVisibility(i7);
            }
        }
    }
}

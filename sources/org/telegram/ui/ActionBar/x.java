package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.y10;
import org.telegram.ui.me;
public final class x {
    public y f30197a;
    public int f30198b;
    public int f30199c;
    public CharSequence d;
    public int f30200e;
    public Drawable f30201f;
    public int f30202g;
    public h6 h;
    public float f30203i;
    public Boolean f30204j;
    public Boolean f30205k;
    public int f30206l;
    public q0 f30207m;
    public ArrayList f30208n;

    public final void a() {
        y yVar = this.f30197a;
        if (this.f30207m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f30251e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f30198b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f30251e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            q0 f10 = yVar.f(childCount, this.f30198b, this.f30199c, null, this.f30200e, this.f30201f, this.f30202g, null, this.h);
            this.f30207m = f10;
            f10.setVisibility(this.f30206l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f30207m.setContentDescription(charSequence);
            }
            Boolean bool = this.f30205k;
            if (bool != null) {
                this.f30207m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f30204j;
            if (bool2 != null) {
                this.f30207m.T = bool2.booleanValue();
            }
            this.f30207m.setAlpha(this.f30203i);
            ArrayList arrayList2 = this.f30208n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((y10) obj).a(this.f30207m);
                }
                this.f30208n = null;
            }
        }
    }

    public final void b(me meVar) {
        q0 q0Var = this.f30207m;
        if (q0Var != null) {
            meVar.a(q0Var);
            return;
        }
        if (this.f30208n == null) {
            this.f30208n = new ArrayList();
        }
        this.f30208n.add(meVar);
    }

    public final void c() {
        this.f30205k = Boolean.FALSE;
        q0 q0Var = this.f30207m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.f30204j = Boolean.TRUE;
        q0 q0Var = this.f30207m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f30206l != i7) {
            this.f30206l = i7;
            if (i7 == 0) {
                a();
            }
            q0 q0Var = this.f30207m;
            if (q0Var != null) {
                q0Var.setVisibility(i7);
            }
        }
    }
}

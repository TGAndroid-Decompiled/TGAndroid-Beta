package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.ui.me;
public final class x {
    public y f30228a;
    public int f30229b;
    public int f30230c;
    public CharSequence d;
    public int f30231e;
    public Drawable f30232f;
    public int f30233g;
    public h6 h;
    public float f30234i;
    public Boolean f30235j;
    public Boolean f30236k;
    public int f30237l;
    public q0 f30238m;
    public ArrayList f30239n;

    public final void a() {
        y yVar = this.f30228a;
        if (this.f30238m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f30282e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f30229b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f30282e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            q0 f10 = yVar.f(childCount, this.f30229b, this.f30230c, null, this.f30231e, this.f30232f, this.f30233g, null, this.h);
            this.f30238m = f10;
            f10.setVisibility(this.f30237l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f30238m.setContentDescription(charSequence);
            }
            Boolean bool = this.f30236k;
            if (bool != null) {
                this.f30238m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f30235j;
            if (bool2 != null) {
                this.f30238m.T = bool2.booleanValue();
            }
            this.f30238m.setAlpha(this.f30234i);
            ArrayList arrayList2 = this.f30239n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((x10) obj).a(this.f30238m);
                }
                this.f30239n = null;
            }
        }
    }

    public final void b(me meVar) {
        q0 q0Var = this.f30238m;
        if (q0Var != null) {
            meVar.a(q0Var);
            return;
        }
        if (this.f30239n == null) {
            this.f30239n = new ArrayList();
        }
        this.f30239n.add(meVar);
    }

    public final void c() {
        this.f30236k = Boolean.FALSE;
        q0 q0Var = this.f30238m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.f30235j = Boolean.TRUE;
        q0 q0Var = this.f30238m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f30237l != i7) {
            this.f30237l = i7;
            if (i7 == 0) {
                a();
            }
            q0 q0Var = this.f30238m;
            if (q0Var != null) {
                q0Var.setVisibility(i7);
            }
        }
    }
}

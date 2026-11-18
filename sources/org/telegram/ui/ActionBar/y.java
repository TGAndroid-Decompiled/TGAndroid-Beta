package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.ui.me;
public final class y {
    public z f30247a;
    public int f30248b;
    public int f30249c;
    public CharSequence d;
    public int f30250e;
    public Drawable f30251f;
    public int f30252g;
    public i6 h;
    public float f30253i;
    public Boolean f30254j;
    public Boolean f30255k;
    public int f30256l;
    public r0 f30257m;
    public ArrayList f30258n;

    public final void a() {
        z zVar = this.f30247a;
        if (this.f30257m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f30301e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f30248b));
                int i10 = 0;
                while (true) {
                    if (i10 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f30301e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            r0 f10 = zVar.f(childCount, this.f30248b, this.f30249c, null, this.f30250e, this.f30251f, this.f30252g, null, this.h);
            this.f30257m = f10;
            f10.setVisibility(this.f30256l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f30257m.setContentDescription(charSequence);
            }
            Boolean bool = this.f30255k;
            if (bool != null) {
                this.f30257m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f30254j;
            if (bool2 != null) {
                this.f30257m.T = bool2.booleanValue();
            }
            this.f30257m.setAlpha(this.f30253i);
            ArrayList arrayList2 = this.f30258n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((x10) obj).a(this.f30257m);
                }
                this.f30258n = null;
            }
        }
    }

    public final void b(me meVar) {
        r0 r0Var = this.f30257m;
        if (r0Var != null) {
            meVar.a(r0Var);
            return;
        }
        if (this.f30258n == null) {
            this.f30258n = new ArrayList();
        }
        this.f30258n.add(meVar);
    }

    public final void c() {
        this.f30255k = Boolean.FALSE;
        r0 r0Var = this.f30257m;
        if (r0Var != null) {
            r0Var.S = false;
        }
    }

    public final void d() {
        this.f30254j = Boolean.TRUE;
        r0 r0Var = this.f30257m;
        if (r0Var != null) {
            r0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f30256l != i7) {
            this.f30256l = i7;
            if (i7 == 0) {
                a();
            }
            r0 r0Var = this.f30257m;
            if (r0Var != null) {
                r0Var.setVisibility(i7);
            }
        }
    }
}

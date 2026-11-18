package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.x10;
import org.telegram.ui.me;
public final class y {
    public z f30245a;
    public int f30246b;
    public int f30247c;
    public CharSequence d;
    public int f30248e;
    public Drawable f30249f;
    public int f30250g;
    public i6 h;
    public float f30251i;
    public Boolean f30252j;
    public Boolean f30253k;
    public int f30254l;
    public r0 f30255m;
    public ArrayList f30256n;

    public final void a() {
        z zVar = this.f30245a;
        if (this.f30255m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f30299e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f30246b));
                int i10 = 0;
                while (true) {
                    if (i10 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f30299e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            r0 f10 = zVar.f(childCount, this.f30246b, this.f30247c, null, this.f30248e, this.f30249f, this.f30250g, null, this.h);
            this.f30255m = f10;
            f10.setVisibility(this.f30254l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f30255m.setContentDescription(charSequence);
            }
            Boolean bool = this.f30253k;
            if (bool != null) {
                this.f30255m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f30252j;
            if (bool2 != null) {
                this.f30255m.T = bool2.booleanValue();
            }
            this.f30255m.setAlpha(this.f30251i);
            ArrayList arrayList2 = this.f30256n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((x10) obj).a(this.f30255m);
                }
                this.f30256n = null;
            }
        }
    }

    public final void b(me meVar) {
        r0 r0Var = this.f30255m;
        if (r0Var != null) {
            meVar.a(r0Var);
            return;
        }
        if (this.f30256n == null) {
            this.f30256n = new ArrayList();
        }
        this.f30256n.add(meVar);
    }

    public final void c() {
        this.f30253k = Boolean.FALSE;
        r0 r0Var = this.f30255m;
        if (r0Var != null) {
            r0Var.S = false;
        }
    }

    public final void d() {
        this.f30252j = Boolean.TRUE;
        r0 r0Var = this.f30255m;
        if (r0Var != null) {
            r0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f30254l != i7) {
            this.f30254l = i7;
            if (i7 == 0) {
                a();
            }
            r0 r0Var = this.f30255m;
            if (r0Var != null) {
                r0Var.setVisibility(i7);
            }
        }
    }
}

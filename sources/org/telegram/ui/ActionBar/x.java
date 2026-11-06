package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.ui.ne;
public final class x {
    public y f28720a;
    public int f28721b;
    public int f28722c;
    public CharSequence d;
    public int f28723e;
    public Drawable f28724f;
    public int f28725g;
    public f6 h;
    public float f28726i;
    public Boolean f28727j;
    public Boolean f28728k;
    public int f28729l;
    public r0 f28730m;
    public ArrayList f28731n;

    public final void a() {
        y yVar = this.f28720a;
        if (this.f28730m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f28758e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f28721b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f28758e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            r0 f10 = yVar.f(childCount, this.f28721b, this.f28722c, null, this.f28723e, this.f28724f, this.f28725g, null, this.h);
            this.f28730m = f10;
            f10.setVisibility(this.f28729l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f28730m.setContentDescription(charSequence);
            }
            Boolean bool = this.f28728k;
            if (bool != null) {
                this.f28730m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f28727j;
            if (bool2 != null) {
                this.f28730m.S = bool2.booleanValue();
            }
            this.f28730m.setAlpha(this.f28726i);
            ArrayList arrayList2 = this.f28731n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((c20) obj).a(this.f28730m);
                }
                this.f28731n = null;
            }
        }
    }

    public final void b(ne neVar) {
        r0 r0Var = this.f28730m;
        if (r0Var != null) {
            neVar.a(r0Var);
            return;
        }
        if (this.f28731n == null) {
            this.f28731n = new ArrayList();
        }
        this.f28731n.add(neVar);
    }

    public final void c() {
        this.f28728k = Boolean.FALSE;
        r0 r0Var = this.f28730m;
        if (r0Var != null) {
            r0Var.R = false;
        }
    }

    public final void d() {
        this.f28727j = Boolean.TRUE;
        r0 r0Var = this.f28730m;
        if (r0Var != null) {
            r0Var.S = true;
        }
    }

    public final void e(int i7) {
        if (this.f28729l != i7) {
            this.f28729l = i7;
            if (i7 == 0) {
                a();
            }
            r0 r0Var = this.f28730m;
            if (r0Var != null) {
                r0Var.setVisibility(i7);
            }
        }
    }
}

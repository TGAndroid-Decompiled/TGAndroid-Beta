package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.jf;
public final class x {
    public y f20490a;
    public int f20491b;
    public int f20492c;
    public CharSequence d;
    public int e;
    public Drawable f20493f;
    public int f20494g;
    public c6 h;
    public float f20495i;
    public Boolean f20496j;
    public Boolean f20497k;
    public int f20498l;
    public u0 f20499m;
    public ArrayList f20500n;
    public Integer f20501o;

    public final void a() {
        y yVar = this.f20490a;
        if (this.f20499m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f20491b));
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
            u0 f7 = yVar.f(childCount, this.f20491b, this.f20492c, null, this.e, this.f20493f, this.f20494g, null, this.h);
            this.f20499m = f7;
            f7.setVisibility(this.f20498l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f20499m.setContentDescription(charSequence);
            }
            Boolean bool = this.f20497k;
            if (bool != null) {
                this.f20499m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f20496j;
            if (bool2 != null) {
                this.f20499m.S = bool2.booleanValue();
            }
            this.f20499m.setAlpha(this.f20495i);
            ArrayList arrayList2 = this.f20500n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f20499m);
                }
                this.f20500n = null;
            }
        }
    }

    public final void b(jf jfVar) {
        u0 u0Var = this.f20499m;
        if (u0Var != null) {
            jfVar.run(u0Var);
            return;
        }
        if (this.f20500n == null) {
            this.f20500n = new ArrayList();
        }
        this.f20500n.add(jfVar);
    }

    public final void c() {
        this.f20497k = Boolean.FALSE;
        u0 u0Var = this.f20499m;
        if (u0Var != null) {
            u0Var.R = false;
        }
    }

    public final void d() {
        this.f20496j = Boolean.TRUE;
        u0 u0Var = this.f20499m;
        if (u0Var != null) {
            u0Var.S = true;
        }
    }

    public final void e() {
        this.f20501o = null;
    }

    public final void f(int i10) {
        if (this.f20498l != i10) {
            this.f20498l = i10;
            if (i10 == 0) {
                a();
            }
            u0 u0Var = this.f20499m;
            if (u0Var != null) {
                u0Var.setVisibility(i10);
            }
        }
    }
}

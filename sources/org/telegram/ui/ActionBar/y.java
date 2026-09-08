package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f21550a;
    public int f21551b;
    public int f21552c;
    public CharSequence d;
    public int f21553e;
    public Drawable f21554f;
    public int f21555g;
    public f6 h;
    public float f21556i;
    public Boolean f21557j;
    public Boolean f21558k;
    public int f21559l;
    public v0 f21560m;
    public ArrayList f21561n;
    public Integer f21562o;

    public final void a() {
        z zVar = this.f21550a;
        if (this.f21560m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21575e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21551b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21575e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21551b, this.f21552c, null, this.f21553e, this.f21554f, this.f21555g, null, this.h);
            this.f21560m = f7;
            f7.setVisibility(this.f21559l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21560m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21558k;
            if (bool != null) {
                this.f21560m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21557j;
            if (bool2 != null) {
                this.f21560m.S = bool2.booleanValue();
            }
            this.f21560m.setAlpha(this.f21556i);
            ArrayList arrayList2 = this.f21561n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21560m);
                }
                this.f21561n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f21560m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f21561n == null) {
            this.f21561n = new ArrayList();
        }
        this.f21561n.add(bfVar);
    }

    public final void c() {
        this.f21558k = Boolean.FALSE;
        v0 v0Var = this.f21560m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21557j = Boolean.TRUE;
        v0 v0Var = this.f21560m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21562o = null;
    }

    public final void f(int i10) {
        if (this.f21559l != i10) {
            this.f21559l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21560m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

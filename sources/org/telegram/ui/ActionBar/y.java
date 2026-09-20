package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f19934a;
    public int f19935b;
    public int f19936c;
    public CharSequence d;
    public int e;
    public Drawable f19937f;
    public int f19938g;
    public f6 h;
    public float f19939i;
    public Boolean f19940j;
    public Boolean f19941k;
    public int f19942l;
    public v0 f19943m;
    public ArrayList f19944n;
    public Integer f19945o;

    public final void a() {
        z zVar = this.f19934a;
        if (this.f19943m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19935b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f19935b, this.f19936c, null, this.e, this.f19937f, this.f19938g, null, this.h);
            this.f19943m = f7;
            f7.setVisibility(this.f19942l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19943m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19941k;
            if (bool != null) {
                this.f19943m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19940j;
            if (bool2 != null) {
                this.f19943m.S = bool2.booleanValue();
            }
            this.f19943m.setAlpha(this.f19939i);
            ArrayList arrayList2 = this.f19944n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19943m);
                }
                this.f19944n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f19943m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f19944n == null) {
            this.f19944n = new ArrayList();
        }
        this.f19944n.add(bfVar);
    }

    public final void c() {
        this.f19941k = Boolean.FALSE;
        v0 v0Var = this.f19943m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f19940j = Boolean.TRUE;
        v0 v0Var = this.f19943m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f19945o = null;
    }

    public final void f(int i10) {
        if (this.f19942l != i10) {
            this.f19942l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f19943m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

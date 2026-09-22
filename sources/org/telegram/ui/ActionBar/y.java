package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f19949a;
    public int f19950b;
    public int f19951c;
    public CharSequence d;
    public int e;
    public Drawable f19952f;
    public int f19953g;
    public f6 h;
    public float f19954i;
    public Boolean f19955j;
    public Boolean f19956k;
    public int f19957l;
    public v0 f19958m;
    public ArrayList f19959n;
    public Integer f19960o;

    public final void a() {
        z zVar = this.f19949a;
        if (this.f19958m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19950b));
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
            v0 f7 = zVar.f(childCount, this.f19950b, this.f19951c, null, this.e, this.f19952f, this.f19953g, null, this.h);
            this.f19958m = f7;
            f7.setVisibility(this.f19957l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19958m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19956k;
            if (bool != null) {
                this.f19958m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19955j;
            if (bool2 != null) {
                this.f19958m.S = bool2.booleanValue();
            }
            this.f19958m.setAlpha(this.f19954i);
            ArrayList arrayList2 = this.f19959n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19958m);
                }
                this.f19959n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f19958m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f19959n == null) {
            this.f19959n = new ArrayList();
        }
        this.f19959n.add(bfVar);
    }

    public final void c() {
        this.f19956k = Boolean.FALSE;
        v0 v0Var = this.f19958m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f19955j = Boolean.TRUE;
        v0 v0Var = this.f19958m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f19960o = null;
    }

    public final void f(int i10) {
        if (this.f19957l != i10) {
            this.f19957l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f19958m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

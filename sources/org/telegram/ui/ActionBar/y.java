package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f19902a;
    public int f19903b;
    public int f19904c;
    public CharSequence d;
    public int e;
    public Drawable f19905f;
    public int f19906g;
    public e6 h;
    public float f19907i;
    public Boolean f19908j;
    public Boolean f19909k;
    public int f19910l;
    public v0 f19911m;
    public ArrayList f19912n;
    public Integer f19913o;

    public final void a() {
        z zVar = this.f19902a;
        if (this.f19911m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19903b));
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
            v0 f7 = zVar.f(childCount, this.f19903b, this.f19904c, null, this.e, this.f19905f, this.f19906g, null, this.h);
            this.f19911m = f7;
            f7.setVisibility(this.f19910l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19911m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19909k;
            if (bool != null) {
                this.f19911m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19908j;
            if (bool2 != null) {
                this.f19911m.S = bool2.booleanValue();
            }
            this.f19911m.setAlpha(this.f19907i);
            ArrayList arrayList2 = this.f19912n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19911m);
                }
                this.f19912n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f19911m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f19912n == null) {
            this.f19912n = new ArrayList();
        }
        this.f19912n.add(bfVar);
    }

    public final void c() {
        this.f19909k = Boolean.FALSE;
        v0 v0Var = this.f19911m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f19908j = Boolean.TRUE;
        v0 v0Var = this.f19911m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f19913o = null;
    }

    public final void f(int i10) {
        if (this.f19910l != i10) {
            this.f19910l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f19911m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

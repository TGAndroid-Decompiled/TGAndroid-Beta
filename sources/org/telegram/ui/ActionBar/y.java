package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f21523a;
    public int f21524b;
    public int f21525c;
    public CharSequence d;
    public int f21526e;
    public Drawable f21527f;
    public int f21528g;
    public f6 h;
    public float f21529i;
    public Boolean f21530j;
    public Boolean f21531k;
    public int f21532l;
    public v0 f21533m;
    public ArrayList f21534n;
    public Integer f21535o;

    public final void a() {
        z zVar = this.f21523a;
        if (this.f21533m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21548e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21524b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21548e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21524b, this.f21525c, null, this.f21526e, this.f21527f, this.f21528g, null, this.h);
            this.f21533m = f7;
            f7.setVisibility(this.f21532l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21533m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21531k;
            if (bool != null) {
                this.f21533m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21530j;
            if (bool2 != null) {
                this.f21533m.S = bool2.booleanValue();
            }
            this.f21533m.setAlpha(this.f21529i);
            ArrayList arrayList2 = this.f21534n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21533m);
                }
                this.f21534n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f21533m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f21534n == null) {
            this.f21534n = new ArrayList();
        }
        this.f21534n.add(bfVar);
    }

    public final void c() {
        this.f21531k = Boolean.FALSE;
        v0 v0Var = this.f21533m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21530j = Boolean.TRUE;
        v0 v0Var = this.f21533m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21535o = null;
    }

    public final void f(int i10) {
        if (this.f21532l != i10) {
            this.f21532l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21533m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

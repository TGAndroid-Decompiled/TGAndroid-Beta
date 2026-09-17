package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f21524a;
    public int f21525b;
    public int f21526c;
    public CharSequence d;
    public int f21527e;
    public Drawable f21528f;
    public int f21529g;
    public f6 h;
    public float f21530i;
    public Boolean f21531j;
    public Boolean f21532k;
    public int f21533l;
    public v0 f21534m;
    public ArrayList f21535n;
    public Integer f21536o;

    public final void a() {
        z zVar = this.f21524a;
        if (this.f21534m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21549e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21525b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21549e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21525b, this.f21526c, null, this.f21527e, this.f21528f, this.f21529g, null, this.h);
            this.f21534m = f7;
            f7.setVisibility(this.f21533l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21534m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21532k;
            if (bool != null) {
                this.f21534m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21531j;
            if (bool2 != null) {
                this.f21534m.S = bool2.booleanValue();
            }
            this.f21534m.setAlpha(this.f21530i);
            ArrayList arrayList2 = this.f21535n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21534m);
                }
                this.f21535n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f21534m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f21535n == null) {
            this.f21535n = new ArrayList();
        }
        this.f21535n.add(bfVar);
    }

    public final void c() {
        this.f21532k = Boolean.FALSE;
        v0 v0Var = this.f21534m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21531j = Boolean.TRUE;
        v0 v0Var = this.f21534m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21536o = null;
    }

    public final void f(int i10) {
        if (this.f21533l != i10) {
            this.f21533l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21534m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

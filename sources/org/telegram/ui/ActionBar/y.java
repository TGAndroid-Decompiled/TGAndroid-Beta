package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class y {
    public z f21691a;
    public int f21692b;
    public int f21693c;
    public CharSequence d;
    public int f21694e;
    public Drawable f21695f;
    public int f21696g;
    public d6 h;
    public float f21697i;
    public Boolean f21698j;
    public Boolean f21699k;
    public int f21700l;
    public v0 f21701m;
    public ArrayList f21702n;
    public Integer f21703o;

    public final void a() {
        z zVar = this.f21691a;
        if (this.f21701m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21721e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21692b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21721e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21692b, this.f21693c, null, this.f21694e, this.f21695f, this.f21696g, null, this.h);
            this.f21701m = f7;
            f7.setVisibility(this.f21700l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21701m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21699k;
            if (bool != null) {
                this.f21701m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21698j;
            if (bool2 != null) {
                this.f21701m.S = bool2.booleanValue();
            }
            this.f21701m.setAlpha(this.f21697i);
            ArrayList arrayList2 = this.f21702n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21701m);
                }
                this.f21702n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        v0 v0Var = this.f21701m;
        if (v0Var != null) {
            xeVar.run(v0Var);
            return;
        }
        if (this.f21702n == null) {
            this.f21702n = new ArrayList();
        }
        this.f21702n.add(xeVar);
    }

    public final void c() {
        this.f21699k = Boolean.FALSE;
        v0 v0Var = this.f21701m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21698j = Boolean.TRUE;
        v0 v0Var = this.f21701m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21703o = null;
    }

    public final void f(int i10) {
        if (this.f21700l != i10) {
            this.f21700l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21701m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

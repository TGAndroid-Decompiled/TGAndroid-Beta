package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class y {
    public z f21696a;
    public int f21697b;
    public int f21698c;
    public CharSequence d;
    public int f21699e;
    public Drawable f21700f;
    public int f21701g;
    public d6 h;
    public float f21702i;
    public Boolean f21703j;
    public Boolean f21704k;
    public int f21705l;
    public v0 f21706m;
    public ArrayList f21707n;
    public Integer f21708o;

    public final void a() {
        z zVar = this.f21696a;
        if (this.f21706m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21726e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21697b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21726e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21697b, this.f21698c, null, this.f21699e, this.f21700f, this.f21701g, null, this.h);
            this.f21706m = f7;
            f7.setVisibility(this.f21705l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21706m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21704k;
            if (bool != null) {
                this.f21706m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21703j;
            if (bool2 != null) {
                this.f21706m.S = bool2.booleanValue();
            }
            this.f21706m.setAlpha(this.f21702i);
            ArrayList arrayList2 = this.f21707n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21706m);
                }
                this.f21707n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        v0 v0Var = this.f21706m;
        if (v0Var != null) {
            xeVar.run(v0Var);
            return;
        }
        if (this.f21707n == null) {
            this.f21707n = new ArrayList();
        }
        this.f21707n.add(xeVar);
    }

    public final void c() {
        this.f21704k = Boolean.FALSE;
        v0 v0Var = this.f21706m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21703j = Boolean.TRUE;
        v0 v0Var = this.f21706m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21708o = null;
    }

    public final void f(int i10) {
        if (this.f21705l != i10) {
            this.f21705l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21706m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class y {
    public z f21700a;
    public int f21701b;
    public int f21702c;
    public CharSequence d;
    public int f21703e;
    public Drawable f21704f;
    public int f21705g;
    public d6 h;
    public float f21706i;
    public Boolean f21707j;
    public Boolean f21708k;
    public int f21709l;
    public v0 f21710m;
    public ArrayList f21711n;
    public Integer f21712o;

    public final void a() {
        z zVar = this.f21700a;
        if (this.f21710m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21730e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21701b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21730e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21701b, this.f21702c, null, this.f21703e, this.f21704f, this.f21705g, null, this.h);
            this.f21710m = f7;
            f7.setVisibility(this.f21709l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21710m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21708k;
            if (bool != null) {
                this.f21710m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21707j;
            if (bool2 != null) {
                this.f21710m.S = bool2.booleanValue();
            }
            this.f21710m.setAlpha(this.f21706i);
            ArrayList arrayList2 = this.f21711n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21710m);
                }
                this.f21711n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        v0 v0Var = this.f21710m;
        if (v0Var != null) {
            xeVar.run(v0Var);
            return;
        }
        if (this.f21711n == null) {
            this.f21711n = new ArrayList();
        }
        this.f21711n.add(xeVar);
    }

    public final void c() {
        this.f21708k = Boolean.FALSE;
        v0 v0Var = this.f21710m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21707j = Boolean.TRUE;
        v0 v0Var = this.f21710m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21712o = null;
    }

    public final void f(int i10) {
        if (this.f21709l != i10) {
            this.f21709l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21710m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

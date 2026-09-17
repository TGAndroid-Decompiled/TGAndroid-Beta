package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bf;
public final class y {
    public z f21551a;
    public int f21552b;
    public int f21553c;
    public CharSequence d;
    public int f21554e;
    public Drawable f21555f;
    public int f21556g;
    public f6 h;
    public float f21557i;
    public Boolean f21558j;
    public Boolean f21559k;
    public int f21560l;
    public v0 f21561m;
    public ArrayList f21562n;
    public Integer f21563o;

    public final void a() {
        z zVar = this.f21551a;
        if (this.f21561m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.f21576e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f21552b));
                int i11 = 0;
                while (true) {
                    if (i11 >= zVar.getChildCount()) {
                        break;
                    }
                    Object tag = zVar.getChildAt(i11).getTag();
                    if (tag instanceof Integer) {
                        if (zVar.f21576e.indexOf((Integer) tag) > indexOf) {
                            childCount = i11;
                            break;
                        }
                    }
                    i11++;
                }
            }
            v0 f7 = zVar.f(childCount, this.f21552b, this.f21553c, null, this.f21554e, this.f21555f, this.f21556g, null, this.h);
            this.f21561m = f7;
            f7.setVisibility(this.f21560l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f21561m.setContentDescription(charSequence);
            }
            Boolean bool = this.f21559k;
            if (bool != null) {
                this.f21561m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f21558j;
            if (bool2 != null) {
                this.f21561m.S = bool2.booleanValue();
            }
            this.f21561m.setAlpha(this.f21557i);
            ArrayList arrayList2 = this.f21562n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f21561m);
                }
                this.f21562n = null;
            }
        }
    }

    public final void b(bf bfVar) {
        v0 v0Var = this.f21561m;
        if (v0Var != null) {
            bfVar.run(v0Var);
            return;
        }
        if (this.f21562n == null) {
            this.f21562n = new ArrayList();
        }
        this.f21562n.add(bfVar);
    }

    public final void c() {
        this.f21559k = Boolean.FALSE;
        v0 v0Var = this.f21561m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f21558j = Boolean.TRUE;
        v0 v0Var = this.f21561m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f21563o = null;
    }

    public final void f(int i10) {
        if (this.f21560l != i10) {
            this.f21560l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f21561m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ze;
public final class y {
    public z f20708a;
    public int f20709b;
    public int f20710c;
    public CharSequence d;
    public int e;
    public Drawable f20711f;
    public int f20712g;
    public f6 h;
    public float f20713i;
    public Boolean f20714j;
    public Boolean f20715k;
    public int f20716l;
    public w0 f20717m;
    public ArrayList f20718n;
    public Integer f20719o;

    public final void a() {
        z zVar = this.f20708a;
        if (this.f20717m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f20709b));
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
            w0 f10 = zVar.f(childCount, this.f20709b, this.f20710c, null, this.e, this.f20711f, this.f20712g, null, this.h);
            this.f20717m = f10;
            f10.setVisibility(this.f20716l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f20717m.setContentDescription(charSequence);
            }
            Boolean bool = this.f20715k;
            if (bool != null) {
                this.f20717m.O = bool.booleanValue();
            }
            Boolean bool2 = this.f20714j;
            if (bool2 != null) {
                this.f20717m.P = bool2.booleanValue();
            }
            this.f20717m.setAlpha(this.f20713i);
            ArrayList arrayList2 = this.f20718n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f20717m);
                }
                this.f20718n = null;
            }
        }
    }

    public final void b(ze zeVar) {
        w0 w0Var = this.f20717m;
        if (w0Var != null) {
            zeVar.run(w0Var);
            return;
        }
        if (this.f20718n == null) {
            this.f20718n = new ArrayList();
        }
        this.f20718n.add(zeVar);
    }

    public final void c() {
        this.f20715k = Boolean.FALSE;
        w0 w0Var = this.f20717m;
        if (w0Var != null) {
            w0Var.O = false;
        }
    }

    public final void d() {
        this.f20714j = Boolean.TRUE;
        w0 w0Var = this.f20717m;
        if (w0Var != null) {
            w0Var.P = true;
        }
    }

    public final void e() {
        this.f20719o = null;
    }

    public final void f(int i10) {
        if (this.f20716l != i10) {
            this.f20716l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f20717m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

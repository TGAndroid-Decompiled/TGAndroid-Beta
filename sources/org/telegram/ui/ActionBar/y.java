package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.xe;
public final class y {
    public z f20733a;
    public int f20734b;
    public int f20735c;
    public CharSequence d;
    public int e;
    public Drawable f20736f;
    public int f20737g;
    public f6 h;
    public float f20738i;
    public Boolean f20739j;
    public Boolean f20740k;
    public int f20741l;
    public w0 f20742m;
    public ArrayList f20743n;
    public Integer f20744o;

    public final void a() {
        z zVar = this.f20733a;
        if (this.f20742m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f20734b));
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
            w0 f10 = zVar.f(childCount, this.f20734b, this.f20735c, null, this.e, this.f20736f, this.f20737g, null, this.h);
            this.f20742m = f10;
            f10.setVisibility(this.f20741l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f20742m.setContentDescription(charSequence);
            }
            Boolean bool = this.f20740k;
            if (bool != null) {
                this.f20742m.O = bool.booleanValue();
            }
            Boolean bool2 = this.f20739j;
            if (bool2 != null) {
                this.f20742m.P = bool2.booleanValue();
            }
            this.f20742m.setAlpha(this.f20738i);
            ArrayList arrayList2 = this.f20743n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f20742m);
                }
                this.f20743n = null;
            }
        }
    }

    public final void b(xe xeVar) {
        w0 w0Var = this.f20742m;
        if (w0Var != null) {
            xeVar.run(w0Var);
            return;
        }
        if (this.f20743n == null) {
            this.f20743n = new ArrayList();
        }
        this.f20743n.add(xeVar);
    }

    public final void c() {
        this.f20740k = Boolean.FALSE;
        w0 w0Var = this.f20742m;
        if (w0Var != null) {
            w0Var.O = false;
        }
    }

    public final void d() {
        this.f20739j = Boolean.TRUE;
        w0 w0Var = this.f20742m;
        if (w0Var != null) {
            w0Var.P = true;
        }
    }

    public final void e() {
        this.f20744o = null;
    }

    public final void f(int i10) {
        if (this.f20741l != i10) {
            this.f20741l = i10;
            if (i10 == 0) {
                a();
            }
            w0 w0Var = this.f20742m;
            if (w0Var != null) {
                w0Var.setVisibility(i10);
            }
        }
    }
}

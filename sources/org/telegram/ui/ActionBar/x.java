package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.z10;
import org.telegram.ui.ke;
public final class x {
    public y f29841a;
    public int f29842b;
    public int f29843c;
    public CharSequence d;
    public int f29844e;
    public Drawable f29845f;
    public int f29846g;
    public e6 h;
    public float f29847i;
    public Boolean f29848j;
    public Boolean f29849k;
    public int f29850l;
    public q0 f29851m;
    public ArrayList f29852n;

    public final void a() {
        y yVar = this.f29841a;
        if (this.f29851m == null) {
            int childCount = yVar.getChildCount();
            ArrayList arrayList = yVar.f29878e;
            int i7 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f29842b));
                int i10 = 0;
                while (true) {
                    if (i10 >= yVar.getChildCount()) {
                        break;
                    }
                    Object tag = yVar.getChildAt(i10).getTag();
                    if (tag instanceof Integer) {
                        if (yVar.f29878e.indexOf((Integer) tag) > indexOf) {
                            childCount = i10;
                            break;
                        }
                    }
                    i10++;
                }
            }
            q0 f10 = yVar.f(childCount, this.f29842b, this.f29843c, null, this.f29844e, this.f29845f, this.f29846g, null, this.h);
            this.f29851m = f10;
            f10.setVisibility(this.f29850l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f29851m.setContentDescription(charSequence);
            }
            Boolean bool = this.f29849k;
            if (bool != null) {
                this.f29851m.S = bool.booleanValue();
            }
            Boolean bool2 = this.f29848j;
            if (bool2 != null) {
                this.f29851m.T = bool2.booleanValue();
            }
            this.f29851m.setAlpha(this.f29847i);
            ArrayList arrayList2 = this.f29852n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    ((z10) obj).a(this.f29851m);
                }
                this.f29852n = null;
            }
        }
    }

    public final void b(ke keVar) {
        q0 q0Var = this.f29851m;
        if (q0Var != null) {
            keVar.a(q0Var);
            return;
        }
        if (this.f29852n == null) {
            this.f29852n = new ArrayList();
        }
        this.f29852n.add(keVar);
    }

    public final void c() {
        this.f29849k = Boolean.FALSE;
        q0 q0Var = this.f29851m;
        if (q0Var != null) {
            q0Var.S = false;
        }
    }

    public final void d() {
        this.f29848j = Boolean.TRUE;
        q0 q0Var = this.f29851m;
        if (q0Var != null) {
            q0Var.T = true;
        }
    }

    public final void e(int i7) {
        if (this.f29850l != i7) {
            this.f29850l = i7;
            if (i7 == 0) {
                a();
            }
            q0 q0Var = this.f29851m;
            if (q0Var != null) {
                q0Var.setVisibility(i7);
            }
        }
    }
}

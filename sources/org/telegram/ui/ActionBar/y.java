package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.af;
public final class y {
    public z f19676a;
    public int f19677b;
    public int f19678c;
    public CharSequence d;
    public int e;
    public Drawable f19679f;
    public int f19680g;
    public d6 h;
    public float f19681i;
    public Boolean f19682j;
    public Boolean f19683k;
    public int f19684l;
    public v0 f19685m;
    public ArrayList f19686n;
    public Integer f19687o;

    public final void a() {
        z zVar = this.f19676a;
        if (this.f19685m == null) {
            int childCount = zVar.getChildCount();
            ArrayList arrayList = zVar.e;
            int i10 = 0;
            if (arrayList != null) {
                int indexOf = arrayList.indexOf(Integer.valueOf(this.f19677b));
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
            v0 f7 = zVar.f(childCount, this.f19677b, this.f19678c, null, this.e, this.f19679f, this.f19680g, null, this.h);
            this.f19685m = f7;
            f7.setVisibility(this.f19684l);
            CharSequence charSequence = this.d;
            if (charSequence != null) {
                this.f19685m.setContentDescription(charSequence);
            }
            Boolean bool = this.f19683k;
            if (bool != null) {
                this.f19685m.R = bool.booleanValue();
            }
            Boolean bool2 = this.f19682j;
            if (bool2 != null) {
                this.f19685m.S = bool2.booleanValue();
            }
            this.f19685m.setAlpha(this.f19681i);
            ArrayList arrayList2 = this.f19686n;
            if (arrayList2 != null) {
                int size = arrayList2.size();
                while (i10 < size) {
                    Object obj = arrayList2.get(i10);
                    i10++;
                    ((Utilities.Callback) obj).run(this.f19685m);
                }
                this.f19686n = null;
            }
        }
    }

    public final void b(af afVar) {
        v0 v0Var = this.f19685m;
        if (v0Var != null) {
            afVar.run(v0Var);
            return;
        }
        if (this.f19686n == null) {
            this.f19686n = new ArrayList();
        }
        this.f19686n.add(afVar);
    }

    public final void c() {
        this.f19683k = Boolean.FALSE;
        v0 v0Var = this.f19685m;
        if (v0Var != null) {
            v0Var.R = false;
        }
    }

    public final void d() {
        this.f19682j = Boolean.TRUE;
        v0 v0Var = this.f19685m;
        if (v0Var != null) {
            v0Var.S = true;
        }
    }

    public final void e() {
        this.f19687o = null;
    }

    public final void f(int i10) {
        if (this.f19684l != i10) {
            this.f19684l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f19685m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

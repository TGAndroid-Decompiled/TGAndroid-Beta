package org.telegram.ui.ActionBar;

import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.se;

public final class y {

    public z f23957a;

    public int f23958b;

    public int f23959c;
    public CharSequence d;

    public int f23960e;

    public Drawable f23961f;

    public int f23962g;
    public c6 h;

    public float f23963i;

    public Boolean f23964j;

    public Boolean f23965k;

    public int f23966l;

    public v0 f23967m;

    public ArrayList f23968n;

    public Integer f23969o;

    public final void a() {
        z zVar = this.f23957a;
        if (this.f23967m != null) {
            return;
        }
        int childCount = zVar.getChildCount();
        ArrayList arrayList = zVar.f23986e;
        int i10 = 0;
        if (arrayList != null) {
            int iIndexOf = arrayList.indexOf(Integer.valueOf(this.f23958b));
            for (int i11 = 0; i11 < zVar.getChildCount(); i11++) {
                Object tag = zVar.getChildAt(i11).getTag();
                if (tag instanceof Integer) {
                    if (zVar.f23986e.indexOf((Integer) tag) > iIndexOf) {
                        childCount = i11;
                        break;
                    }
                }
            }
        }
        v0 v0VarF = zVar.f(childCount, this.f23958b, this.f23959c, null, this.f23960e, this.f23961f, this.f23962g, null, this.h);
        this.f23967m = v0VarF;
        v0VarF.setVisibility(this.f23966l);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            this.f23967m.setContentDescription(charSequence);
        }
        Boolean bool = this.f23965k;
        if (bool != null) {
            this.f23967m.N = bool.booleanValue();
        }
        Boolean bool2 = this.f23964j;
        if (bool2 != null) {
            this.f23967m.O = bool2.booleanValue();
        }
        this.f23967m.setAlpha(this.f23963i);
        ArrayList arrayList2 = this.f23968n;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                ((Utilities.Callback) obj).run(this.f23967m);
            }
            this.f23968n = null;
        }
    }

    public final void b(se seVar) {
        v0 v0Var = this.f23967m;
        if (v0Var != null) {
            seVar.run(v0Var);
            return;
        }
        if (this.f23968n == null) {
            this.f23968n = new ArrayList();
        }
        this.f23968n.add(seVar);
    }

    public final void c() {
        this.f23965k = Boolean.FALSE;
        v0 v0Var = this.f23967m;
        if (v0Var != null) {
            v0Var.N = false;
        }
    }

    public final void d() {
        this.f23964j = Boolean.TRUE;
        v0 v0Var = this.f23967m;
        if (v0Var != null) {
            v0Var.O = true;
        }
    }

    public final void e() {
        this.f23969o = null;
    }

    public final void f(int i10) {
        if (this.f23966l != i10) {
            this.f23966l = i10;
            if (i10 == 0) {
                a();
            }
            v0 v0Var = this.f23967m;
            if (v0Var != null) {
                v0Var.setVisibility(i10);
            }
        }
    }
}

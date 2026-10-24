package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public class f5 implements g6 {
    public final int f20890a;
    public SparseIntArray f20891b;
    public Object f20892c;

    public f5() {
        this.f20890a = 0;
    }

    @Override
    public final boolean a() {
        switch (this.f20890a) {
            case 0:
            default:
                return k6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f20890a) {
            case 0:
                k6.q(f7, f10, i10, i11);
                return;
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    k6.q(f7, f10, i10, i11);
                    return;
                } else {
                    g6Var.b(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f20890a) {
            case 0:
                return k6.f21514v3;
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.f21514v3;
                }
                return g6Var.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f20890a) {
            case 0:
                return k6.U0(str);
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.U0(str);
                }
                return g6Var.d(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f20890a) {
            case 0:
                return g(i10);
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.x0(null, i10, false);
                }
                return g6Var.e(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f20890a) {
            case 0:
                return false;
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.c1();
                }
                return g6Var.f();
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f20890a) {
            case 0:
                SparseIntArray sparseIntArray = this.f20891b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return k6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = this.f20891b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.x0(null, i10, false);
                }
                return g6Var.g(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f20890a) {
            case 0:
                return null;
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.Q0(str);
                }
                return g6Var.getDrawable(str);
        }
    }

    @Override
    public final void h(int i10, int i11) {
        switch (this.f20890a) {
            case 0:
                return;
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var != null) {
                    g6Var.h(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public final int i(int i10) {
        switch (this.f20890a) {
            case 0:
                return this.f20891b.get(i10);
            default:
                g6 g6Var = (g6) this.f20892c;
                if (g6Var == null) {
                    return k6.x0(null, i10, false);
                }
                return g6Var.i(i10);
        }
    }

    public f5(g6 g6Var) {
        this.f20890a = 1;
        this.f20891b = new SparseIntArray();
        this.f20892c = g6Var;
        j();
    }

    public void j() {
    }

    private final void k(int i10, int i11) {
    }
}

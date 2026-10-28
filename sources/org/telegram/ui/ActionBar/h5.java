package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
public class h5 implements u6 {
    public final int f22688a;
    public SparseIntArray f22689b;
    public Object f22690c;

    public h5() {
        this.f22688a = 0;
    }

    @Override
    public final boolean a() {
        switch (this.f22688a) {
            case 0:
            default:
                return y6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f22688a) {
            case 0:
                y6.q(f7, f10, i10, i11);
                return;
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    y6.q(f7, f10, i10, i11);
                    return;
                } else {
                    u6Var.b(f7, f10, i10, i11);
                    return;
                }
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f22688a) {
            case 0:
                return y6.f23690v3;
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.f23690v3;
                }
                return u6Var.c();
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f22688a) {
            case 0:
                return y6.U0(str);
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.U0(str);
                }
                return u6Var.d(str);
        }
    }

    @Override
    public final int e(int i10) {
        switch (this.f22688a) {
            case 0:
                return g(i10);
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.x0(null, i10, false);
                }
                return u6Var.e(i10);
        }
    }

    @Override
    public final boolean f() {
        switch (this.f22688a) {
            case 0:
                return false;
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.c1();
                }
                return u6Var.f();
        }
    }

    @Override
    public final int g(int i10) {
        switch (this.f22688a) {
            case 0:
                SparseIntArray sparseIntArray = this.f22689b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return y6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = this.f22689b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.x0(null, i10, false);
                }
                return u6Var.g(i10);
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f22688a) {
            case 0:
                return null;
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.Q0(str);
                }
                return u6Var.getDrawable(str);
        }
    }

    @Override
    public final void h(int i10, int i11) {
        switch (this.f22688a) {
            case 0:
                return;
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var != null) {
                    u6Var.h(i10, i11);
                    return;
                }
                return;
        }
    }

    @Override
    public final int i(int i10) {
        switch (this.f22688a) {
            case 0:
                return this.f22689b.get(i10);
            default:
                u6 u6Var = (u6) this.f22690c;
                if (u6Var == null) {
                    return y6.x0(null, i10, false);
                }
                return u6Var.i(i10);
        }
    }

    public h5(u6 u6Var) {
        this.f22688a = 1;
        this.f22689b = new SparseIntArray();
        this.f22690c = u6Var;
        j();
    }

    public void j() {
    }

    private final void k(int i10, int i11) {
    }
}

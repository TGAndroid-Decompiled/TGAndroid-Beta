package org.telegram.ui.ActionBar;

import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import org.telegram.messenger.tz;
public class x4 implements p6 {
    public final int f21527a;
    public Object f21528b;
    public Object f21529c;

    public x4() {
        this.f21527a = 0;
    }

    @Override
    public final boolean a() {
        switch (this.f21527a) {
            case 0:
            case 1:
            default:
                return t6.I.q();
        }
    }

    @Override
    public final void b(float f7, float f10, int i10, int i11) {
        switch (this.f21527a) {
            case 0:
                t6.r(f7, f10, i10, i11);
                return;
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    t6.r(f7, f10, i10, i11);
                    return;
                } else {
                    p6Var.b(f7, f10, i10, i11);
                    return;
                }
            default:
                t6.r(f7, f10, i10, i11);
                return;
        }
    }

    @Override
    public final ColorFilter c() {
        switch (this.f21527a) {
            case 0:
                return t6.f21256v3;
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.f21256v3;
                }
                return p6Var.c();
            default:
                if (((PorterDuffColorFilter) this.f21528b) == null) {
                    this.f21528b = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
                }
                return (PorterDuffColorFilter) this.f21528b;
        }
    }

    @Override
    public final Paint d(String str) {
        switch (this.f21527a) {
            case 0:
                return t6.V0(str);
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.V0(str);
                }
                return p6Var.d(str);
            default:
                return ((p6) this.f21529c).d(str);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f21527a) {
            case 0:
                return tz.H0;
            case 1:
                return tz.H0;
            default:
                return tz.H0;
        }
    }

    @Override
    public final int f(int i10) {
        switch (this.f21527a) {
            case 0:
                return h(i10);
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.x0(null, i10, false);
                }
                return p6Var.f(i10);
            default:
                return h(i10);
        }
    }

    @Override
    public final boolean g() {
        switch (this.f21527a) {
            case 0:
                return false;
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.d1();
                }
                return p6Var.g();
            default:
                return false;
        }
    }

    @Override
    public final Drawable getDrawable(String str) {
        switch (this.f21527a) {
            case 0:
                return null;
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.R0(str);
                }
                return p6Var.getDrawable(str);
            default:
                return null;
        }
    }

    @Override
    public final int h(int i10) {
        switch (this.f21527a) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f21528b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey >= 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return t6.v0(i10);
            case 1:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.f21528b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.v0(i10);
                }
                return p6Var.h(i10);
            default:
                if (i10 == t6.G8) {
                    return -14145495;
                }
                if (i10 != t6.E8) {
                    if (i10 == t6.f21001h5) {
                        return -14737633;
                    }
                    if (i10 == t6.f21037j5) {
                        return -592138;
                    }
                    if (i10 == t6.f21185r5) {
                        return -8553091;
                    }
                    if (i10 == t6.f21285wf) {
                        return -16777216;
                    }
                    if (i10 == t6.f21337zf) {
                        return -1610612736;
                    }
                    if (i10 == t6.Cf || i10 == t6.Gf || i10 == t6.Bf) {
                        return -9539985;
                    }
                    if (i10 != t6.G6) {
                        int i11 = t6.Ai;
                        if (i10 == i11) {
                            return -11754001;
                        }
                        if (i10 == t6.f21020i6) {
                            return 536870911;
                        }
                        if (i10 != t6.ti && i10 != t6.si && i10 != t6.ui) {
                            if (i10 == t6.vi) {
                                return 352321535;
                            }
                            if (i10 != t6.f21320yf && i10 != i11) {
                                if (i10 == t6.xf) {
                                    return 780633991;
                                }
                                if (i10 == t6.f20872a7) {
                                    return -15921907;
                                }
                                p6 p6Var2 = (p6) this.f21529c;
                                if (p6Var2 != null) {
                                    return p6Var2.h(i10);
                                }
                                return t6.v0(i10);
                            }
                            return -7895161;
                        }
                    }
                }
                return -1;
        }
    }

    @Override
    public final void i(int i10, int i11) {
        switch (this.f21527a) {
            case 0:
                return;
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var != null) {
                    p6Var.i(i10, i11);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final int j(int i10) {
        switch (this.f21527a) {
            case 0:
                return ((SparseIntArray) this.f21528b).get(i10);
            case 1:
                p6 p6Var = (p6) this.f21529c;
                if (p6Var == null) {
                    return t6.x0(null, i10, false);
                }
                return p6Var.j(i10);
            default:
                return h(i10);
        }
    }

    public x4(int i10, p6 p6Var) {
        this.f21527a = i10;
        switch (i10) {
            case 2:
                this.f21529c = p6Var;
                return;
            default:
                this.f21528b = new SparseIntArray();
                this.f21529c = p6Var;
                k();
                return;
        }
    }

    public void k() {
    }

    private final void l(int i10, int i11) {
    }

    private final void m(int i10, int i11) {
    }
}

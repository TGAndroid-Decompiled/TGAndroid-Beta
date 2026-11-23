package org.telegram.ui.Components;

import android.util.SparseIntArray;
public class ty extends v4.t {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public ty(int i7, boolean z10) {
        super(i7);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static xt0 C1(xt0 xt0Var) {
        if (xt0Var == null) {
            return null;
        }
        if (xt0Var.f42189a == 0.0f) {
            xt0Var.f42189a = 100.0f;
        }
        if (xt0Var.f42190b == 0.0f) {
            xt0Var.f42190b = 100.0f;
        }
        float f10 = xt0Var.f42189a;
        float f11 = xt0Var.f42190b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return xt0Var;
        }
        float max = Math.max(f10, f11);
        xt0Var.f42189a = max;
        xt0Var.f42190b = max;
        return xt0Var;
    }

    public final void B1() {
        xt0 xt0Var;
        int i7;
        int min;
        boolean z10;
        boolean z11;
        float f10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != A() || this.W != this.f59341m || this.T != this.J) {
            int i10 = this.f59341m;
            this.W = i10;
            float f11 = i10;
            if (f11 == 0.0f) {
                f11 = 100.0f;
            }
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.S;
            sparseIntArray2.clear();
            boolean z12 = false;
            this.V = 0;
            this.U = 0;
            int A = A();
            this.T = A;
            if (A == 0) {
                return;
            }
            int L = org.telegram.messenger.g0.L(100.0f);
            int i11 = this.J;
            boolean z13 = this.Q;
            int i12 = A + (z13 ? 1 : 0);
            int i13 = 0;
            int i14 = 0;
            int i15 = i11;
            while (i13 < i12) {
                if (i13 < A) {
                    xt0Var = C1(D1(i13));
                } else {
                    xt0Var = null;
                }
                if (xt0Var == null) {
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z12;
                    }
                    i7 = L;
                    min = i11;
                } else {
                    i7 = L;
                    min = Math.min(i11, (int) Math.floor((((xt0Var.f42189a / xt0Var.f42190b) * L) / f11) * i11));
                    if (i15 >= min && (min <= 33 || i15 >= min - 15)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (xt0Var.f42191c) {
                        sparseIntArray.put(i13, i15);
                        this.V++;
                        f10 = f11;
                        i15 = i11;
                        i14 = 0;
                        i13++;
                        L = i7;
                        f11 = f10;
                        z12 = false;
                    } else {
                        z11 = z10;
                    }
                }
                if (z11) {
                    if (i15 != 0 && i14 != 0) {
                        int i16 = i15 / i14;
                        int i17 = i13 - i14;
                        f10 = f11;
                        int i18 = i17;
                        while (true) {
                            int i19 = i17 + i14;
                            if (i18 >= i19) {
                                break;
                            }
                            if (i18 == i19 - 1) {
                                sparseIntArray.put(i18, sparseIntArray.get(i18) + i15);
                            } else {
                                sparseIntArray.put(i18, sparseIntArray.get(i18) + i16);
                            }
                            i15 -= i16;
                            i18++;
                        }
                        sparseIntArray2.put(i13 - 1, this.V);
                    } else {
                        f10 = f11;
                    }
                    if (i13 == A) {
                        break;
                    }
                    this.V++;
                    i15 = i11;
                    i14 = 0;
                } else {
                    f10 = f11;
                    if (i15 < min) {
                        min = i15;
                    }
                }
                if (this.V == 0) {
                    this.U = Math.max(this.U, i13);
                }
                if (i13 == A - 1 && !z13) {
                    sparseIntArray2.put(i13, this.V);
                }
                i14++;
                i15 -= min;
                sparseIntArray.put(i13, min);
                i13++;
                L = i7;
                f11 = f10;
                z12 = false;
            }
            this.V++;
        }
    }

    public xt0 D1(int i7) {
        return new xt0(100.0f, 100.0f);
    }

    public final boolean E1(int i7) {
        B1();
        if (this.S.get(i7, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int I(v4.x0 x0Var, v4.c1 c1Var) {
        return c1Var.b();
    }

    @Override
    public final int u(v4.x0 x0Var, v4.c1 c1Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

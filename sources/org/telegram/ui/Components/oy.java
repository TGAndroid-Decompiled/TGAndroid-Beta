package org.telegram.ui.Components;

import android.util.SparseIntArray;
public class oy extends v4.s {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public oy(int i7, boolean z10) {
        super(i7);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static nt0 C1(nt0 nt0Var) {
        if (nt0Var == null) {
            return null;
        }
        if (nt0Var.f37702a == 0.0f) {
            nt0Var.f37702a = 100.0f;
        }
        if (nt0Var.f37703b == 0.0f) {
            nt0Var.f37703b = 100.0f;
        }
        float f10 = nt0Var.f37702a;
        float f11 = nt0Var.f37703b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return nt0Var;
        }
        float max = Math.max(f10, f11);
        nt0Var.f37702a = max;
        nt0Var.f37703b = max;
        return nt0Var;
    }

    public final void B1() {
        nt0 nt0Var;
        int i7;
        int min;
        boolean z10;
        boolean z11;
        float f10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != A() || this.W != this.f58631m || this.T != this.J) {
            int i10 = this.f58631m;
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
                    nt0Var = C1(D1(i13));
                } else {
                    nt0Var = null;
                }
                if (nt0Var == null) {
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z12;
                    }
                    i7 = L;
                    min = i11;
                } else {
                    i7 = L;
                    min = Math.min(i11, (int) Math.floor((((nt0Var.f37702a / nt0Var.f37703b) * L) / f11) * i11));
                    if (i15 >= min && (min <= 33 || i15 >= min - 15)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (nt0Var.f37704c) {
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

    public nt0 D1(int i7) {
        return new nt0(100.0f, 100.0f);
    }

    public final boolean E1(int i7) {
        B1();
        if (this.S.get(i7, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int I(v4.w0 w0Var, v4.b1 b1Var) {
        return b1Var.b();
    }

    @Override
    public final int u(v4.w0 w0Var, v4.b1 b1Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

package org.telegram.ui.Components;

import android.util.SparseIntArray;
public class yy extends s4.r {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public yy(int i10, boolean z10) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static qu0 C1(qu0 qu0Var) {
        if (qu0Var == null) {
            return null;
        }
        if (qu0Var.f29808a == 0.0f) {
            qu0Var.f29808a = 100.0f;
        }
        if (qu0Var.f29809b == 0.0f) {
            qu0Var.f29809b = 100.0f;
        }
        float f7 = qu0Var.f29808a;
        float f10 = qu0Var.f29809b;
        float f11 = f7 / f10;
        if (f11 <= 4.0f && f11 >= 0.2f) {
            return qu0Var;
        }
        float max = Math.max(f7, f10);
        qu0Var.f29808a = max;
        qu0Var.f29809b = max;
        return qu0Var;
    }

    public final void B1() {
        qu0 qu0Var;
        int i10;
        int min;
        boolean z10;
        boolean z11;
        float f7;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != A() || this.W != this.f47998m || this.T != this.J) {
            int i11 = this.f47998m;
            this.W = i11;
            float f10 = i11;
            if (f10 == 0.0f) {
                f10 = 100.0f;
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
            int L = org.telegram.messenger.i0.L(100.0f);
            int i12 = this.J;
            boolean z13 = this.Q;
            int i13 = A + (z13 ? 1 : 0);
            int i14 = 0;
            int i15 = 0;
            int i16 = i12;
            while (i14 < i13) {
                if (i14 < A) {
                    qu0Var = C1(D1(i14));
                } else {
                    qu0Var = null;
                }
                if (qu0Var == null) {
                    if (i15 != 0) {
                        z11 = true;
                    } else {
                        z11 = z12;
                    }
                    i10 = L;
                    min = i12;
                } else {
                    i10 = L;
                    min = Math.min(i12, (int) Math.floor((((qu0Var.f29808a / qu0Var.f29809b) * L) / f10) * i12));
                    if (i16 >= min && (min <= 33 || i16 >= min - 15)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (qu0Var.f29810c) {
                        sparseIntArray.put(i14, i16);
                        this.V++;
                        f7 = f10;
                        i16 = i12;
                        i15 = 0;
                        i14++;
                        L = i10;
                        f10 = f7;
                        z12 = false;
                    } else {
                        z11 = z10;
                    }
                }
                if (z11) {
                    if (i16 != 0 && i15 != 0) {
                        int i17 = i16 / i15;
                        int i18 = i14 - i15;
                        f7 = f10;
                        int i19 = i18;
                        while (true) {
                            int i20 = i18 + i15;
                            if (i19 >= i20) {
                                break;
                            }
                            if (i19 == i20 - 1) {
                                sparseIntArray.put(i19, sparseIntArray.get(i19) + i16);
                            } else {
                                sparseIntArray.put(i19, sparseIntArray.get(i19) + i17);
                            }
                            i16 -= i17;
                            i19++;
                        }
                        sparseIntArray2.put(i14 - 1, this.V);
                    } else {
                        f7 = f10;
                    }
                    if (i14 == A) {
                        break;
                    }
                    this.V++;
                    i16 = i12;
                    i15 = 0;
                } else {
                    f7 = f10;
                    if (i16 < min) {
                        min = i16;
                    }
                }
                if (this.V == 0) {
                    this.U = Math.max(this.U, i14);
                }
                if (i14 == A - 1 && !z13) {
                    sparseIntArray2.put(i14, this.V);
                }
                i15++;
                i16 -= min;
                sparseIntArray.put(i14, min);
                i14++;
                L = i10;
                f10 = f7;
                z12 = false;
            }
            this.V++;
        }
    }

    public qu0 D1(int i10) {
        return new qu0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        if (this.S.get(i10, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int I(hf.e eVar, s4.z0 z0Var) {
        return z0Var.b();
    }

    @Override
    public final int u(hf.e eVar, s4.z0 z0Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

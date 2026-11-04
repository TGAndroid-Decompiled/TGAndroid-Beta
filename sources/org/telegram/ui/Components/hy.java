package org.telegram.ui.Components;

import android.util.SparseIntArray;
public class hy extends u4.s {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public hy(int i3, boolean z10) {
        super(i3);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static lt0 C1(lt0 lt0Var) {
        if (lt0Var == null) {
            return null;
        }
        if (lt0Var.f35877a == 0.0f) {
            lt0Var.f35877a = 100.0f;
        }
        if (lt0Var.f35878b == 0.0f) {
            lt0Var.f35878b = 100.0f;
        }
        float f10 = lt0Var.f35877a;
        float f11 = lt0Var.f35878b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return lt0Var;
        }
        float max = Math.max(f10, f11);
        lt0Var.f35877a = max;
        lt0Var.f35878b = max;
        return lt0Var;
    }

    public final void B1() {
        lt0 lt0Var;
        int i3;
        int min;
        boolean z10;
        boolean z11;
        float f10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != A() || this.W != this.f55639m || this.T != this.J) {
            int i10 = this.f55639m;
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
                    lt0Var = C1(D1(i13));
                } else {
                    lt0Var = null;
                }
                if (lt0Var == null) {
                    if (i14 != 0) {
                        z11 = true;
                    } else {
                        z11 = z12;
                    }
                    i3 = L;
                    min = i11;
                } else {
                    i3 = L;
                    min = Math.min(i11, (int) Math.floor((((lt0Var.f35877a / lt0Var.f35878b) * L) / f11) * i11));
                    if (i15 >= min && (min <= 33 || i15 >= min - 15)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (lt0Var.f35879c) {
                        sparseIntArray.put(i13, i15);
                        this.V++;
                        f10 = f11;
                        i15 = i11;
                        i14 = 0;
                        i13++;
                        L = i3;
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
                L = i3;
                f11 = f10;
                z12 = false;
            }
            this.V++;
        }
    }

    public lt0 D1(int i3) {
        return new lt0(100.0f, 100.0f);
    }

    public final boolean E1(int i3) {
        B1();
        if (this.S.get(i3, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int I(tf.e eVar, u4.a1 a1Var) {
        return a1Var.b();
    }

    @Override
    public final int u(tf.e eVar, u4.a1 a1Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

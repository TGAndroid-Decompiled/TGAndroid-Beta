package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
public class uz extends s4.s {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public uz(int i10, boolean z10) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static tv0 C1(tv0 tv0Var) {
        if (tv0Var == null) {
            return null;
        }
        if (tv0Var.f27499a == 0.0f) {
            tv0Var.f27499a = 100.0f;
        }
        if (tv0Var.f27500b == 0.0f) {
            tv0Var.f27500b = 100.0f;
        }
        float f7 = tv0Var.f27499a;
        float f10 = tv0Var.f27500b;
        float f11 = f7 / f10;
        if (f11 <= 4.0f && f11 >= 0.2f) {
            return tv0Var;
        }
        float max = Math.max(f7, f10);
        tv0Var.f27499a = max;
        tv0Var.f27500b = max;
        return tv0Var;
    }

    public final void B1() {
        tv0 tv0Var;
        int i10;
        int min;
        boolean z10;
        boolean z11;
        float f7;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != A() || this.W != this.f41711m || this.T != this.J) {
            int i11 = this.f41711m;
            this.W = i11;
            float f10 = i11;
            if (f10 == 0.0f) {
                f10 = 100.0f;
            }
            sparseIntArray.clear();
            SparseIntArray sparseIntArray2 = this.S;
            sparseIntArray2.clear();
            this.V = 0;
            this.U = 0;
            int A = A();
            this.T = A;
            if (A == 0) {
                return;
            }
            int dp = AndroidUtilities.dp(100.0f);
            int i12 = this.J;
            boolean z12 = this.Q;
            int i13 = A + (z12 ? 1 : 0);
            int i14 = i12;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13) {
                if (i15 < A) {
                    tv0Var = C1(D1(i15));
                } else {
                    tv0Var = null;
                }
                if (tv0Var == null) {
                    if (i16 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    i10 = dp;
                    min = i12;
                } else {
                    i10 = dp;
                    min = Math.min(i12, (int) Math.floor((((tv0Var.f27499a / tv0Var.f27500b) * dp) / f10) * i12));
                    if (i14 >= min && (min <= 33 || i14 >= min - 15)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (tv0Var.f27501c) {
                        sparseIntArray.put(i15, i14);
                        this.V++;
                        f7 = f10;
                        i14 = i12;
                        i16 = 0;
                        i15++;
                        dp = i10;
                        f10 = f7;
                    } else {
                        z11 = z10;
                    }
                }
                if (z11) {
                    if (i14 != 0 && i16 != 0) {
                        int i17 = i14 / i16;
                        int i18 = i15 - i16;
                        f7 = f10;
                        int i19 = i18;
                        while (true) {
                            int i20 = i18 + i16;
                            if (i19 >= i20) {
                                break;
                            }
                            if (i19 == i20 - 1) {
                                sparseIntArray.put(i19, sparseIntArray.get(i19) + i14);
                            } else {
                                sparseIntArray.put(i19, sparseIntArray.get(i19) + i17);
                            }
                            i14 -= i17;
                            i19++;
                        }
                        sparseIntArray2.put(i15 - 1, this.V);
                    } else {
                        f7 = f10;
                    }
                    if (i15 == A) {
                        break;
                    }
                    this.V++;
                    i14 = i12;
                    i16 = 0;
                } else {
                    f7 = f10;
                    if (i14 < min) {
                        min = i14;
                    }
                }
                if (this.V == 0) {
                    this.U = Math.max(this.U, i15);
                }
                if (i15 == A - 1 && !z12) {
                    sparseIntArray2.put(i15, this.V);
                }
                i16++;
                i14 -= min;
                sparseIntArray.put(i15, min);
                i15++;
                dp = i10;
                f10 = f7;
            }
            this.V++;
        }
    }

    public tv0 D1(int i10) {
        return new tv0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        if (this.S.get(i10, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int I(of.e eVar, s4.z0 z0Var) {
        return z0Var.b();
    }

    @Override
    public final int u(of.e eVar, s4.z0 z0Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

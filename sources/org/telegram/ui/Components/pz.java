package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
public class pz extends f2.w {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public pz(int i10, boolean z4) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z4;
    }

    public static kv0 C1(kv0 kv0Var) {
        if (kv0Var == null) {
            return null;
        }
        if (kv0Var.f28463a == 0.0f) {
            kv0Var.f28463a = 100.0f;
        }
        if (kv0Var.f28464b == 0.0f) {
            kv0Var.f28464b = 100.0f;
        }
        float f10 = kv0Var.f28463a;
        float f11 = kv0Var.f28464b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return kv0Var;
        }
        float max = Math.max(f10, f11);
        kv0Var.f28463a = max;
        kv0Var.f28464b = max;
        return kv0Var;
    }

    public final void B1() {
        kv0 kv0Var;
        int i10;
        int min;
        boolean z4;
        boolean z10;
        float f10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() != A() || this.W != this.f5950m || this.T != this.J) {
            int i11 = this.f5950m;
            this.W = i11;
            float f11 = i11;
            if (f11 == 0.0f) {
                f11 = 100.0f;
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
            boolean z11 = this.Q;
            int i13 = A + (z11 ? 1 : 0);
            int i14 = i12;
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13) {
                if (i15 < A) {
                    kv0Var = C1(D1(i15));
                } else {
                    kv0Var = null;
                }
                if (kv0Var == null) {
                    if (i16 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    i10 = dp;
                    min = i12;
                } else {
                    i10 = dp;
                    min = Math.min(i12, (int) Math.floor((((kv0Var.f28463a / kv0Var.f28464b) * dp) / f11) * i12));
                    if (i14 >= min && (min <= 33 || i14 >= min - 15)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (kv0Var.f28465c) {
                        sparseIntArray.put(i15, i14);
                        this.V++;
                        f10 = f11;
                        i14 = i12;
                        i16 = 0;
                        i15++;
                        dp = i10;
                        f11 = f10;
                    } else {
                        z10 = z4;
                    }
                }
                if (z10) {
                    if (i14 != 0 && i16 != 0) {
                        int i17 = i14 / i16;
                        int i18 = i15 - i16;
                        f10 = f11;
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
                        f10 = f11;
                    }
                    if (i15 == A) {
                        break;
                    }
                    this.V++;
                    i14 = i12;
                    i16 = 0;
                } else {
                    f10 = f11;
                    if (i14 < min) {
                        min = i14;
                    }
                }
                if (this.V == 0) {
                    this.U = Math.max(this.U, i15);
                }
                if (i15 == A - 1 && !z11) {
                    sparseIntArray2.put(i15, this.V);
                }
                i16++;
                i14 -= min;
                sparseIntArray.put(i15, min);
                i15++;
                dp = i10;
                f11 = f10;
            }
            this.V++;
        }
    }

    public kv0 D1(int i10) {
        return new kv0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        if (this.S.get(i10, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return true;
        }
        return false;
    }

    @Override
    public final int I(bf.f fVar, f2.j1 j1Var) {
        return j1Var.b();
    }

    @Override
    public final int u(bf.f fVar, f2.j1 j1Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

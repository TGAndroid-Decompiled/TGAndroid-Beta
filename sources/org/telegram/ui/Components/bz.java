package org.telegram.ui.Components;

import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;

public class bz extends f2.x {
    public final boolean Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public int T;
    public int U;
    public int V;
    public int W;

    public bz(int i10, boolean z10) {
        super(i10);
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.Q = z10;
    }

    public static tu0 C1(tu0 tu0Var) {
        if (tu0Var == null) {
            return null;
        }
        if (tu0Var.f32893a == 0.0f) {
            tu0Var.f32893a = 100.0f;
        }
        if (tu0Var.f32894b == 0.0f) {
            tu0Var.f32894b = 100.0f;
        }
        float f10 = tu0Var.f32893a;
        float f11 = tu0Var.f32894b;
        float f12 = f10 / f11;
        if (f12 <= 4.0f && f12 >= 0.2f) {
            return tu0Var;
        }
        float fMax = Math.max(f10, f11);
        tu0Var.f32893a = fMax;
        tu0Var.f32894b = fMax;
        return tu0Var;
    }

    public final void B1() {
        int i10;
        int iMin;
        boolean z10;
        SparseIntArray sparseIntArray = this.R;
        if (sparseIntArray.size() == A() && this.W == this.f5862m && this.T == this.J) {
            return;
        }
        int i11 = this.f5862m;
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
        int iA = A();
        this.T = iA;
        if (iA == 0) {
            return;
        }
        int iDp = AndroidUtilities.dp(100.0f);
        int i12 = this.J;
        boolean z11 = this.Q;
        int i13 = iA + (z11 ? 1 : 0);
        int i14 = i12;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            tu0 tu0VarC1 = i15 < iA ? C1(D1(i15)) : null;
            if (tu0VarC1 == null) {
                z10 = i16 != 0;
                i10 = iDp;
                iMin = i12;
            } else {
                i10 = iDp;
                iMin = Math.min(i12, (int) Math.floor((((tu0VarC1.f32893a / tu0VarC1.f32894b) * iDp) / f10) * i12));
                boolean z12 = i14 < iMin || (iMin > 33 && i14 < iMin + (-15));
                if (tu0VarC1.f32895c) {
                    sparseIntArray.put(i15, i14);
                    this.V++;
                    f10 = f10;
                    i14 = i12;
                    i16 = 0;
                } else {
                    z10 = z12;
                }
                i15++;
                iDp = i10;
                f10 = f10;
            }
            if (z10) {
                if (i14 != 0 && i16 != 0) {
                    int i17 = i14 / i16;
                    int i18 = i15 - i16;
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
                }
                if (i15 == iA) {
                    break;
                }
                this.V++;
                i14 = i12;
                i16 = 0;
            } else {
                f10 = f10;
                if (i14 < iMin) {
                    iMin = i14;
                }
            }
            if (this.V == 0) {
                this.U = Math.max(this.U, i15);
            }
            if (i15 == iA - 1 && !z11) {
                sparseIntArray2.put(i15, this.V);
            }
            i16++;
            i14 -= iMin;
            sparseIntArray.put(i15, iMin);
            i15++;
            iDp = i10;
            f10 = f10;
        }
        this.V++;
    }

    public tu0 D1(int i10) {
        return new tu0(100.0f, 100.0f);
    }

    public final boolean E1(int i10) {
        B1();
        return this.S.get(i10, Integer.MAX_VALUE) != Integer.MAX_VALUE;
    }

    @Override
    public final int I(f2.e1 e1Var, f2.l1 l1Var) {
        return l1Var.b();
    }

    @Override
    public final int u(f2.e1 e1Var, f2.l1 l1Var) {
        return 1;
    }

    @Override
    public boolean y0() {
        return false;
    }
}

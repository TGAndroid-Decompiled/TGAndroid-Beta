package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class ol0 extends org.telegram.ui.Components.mm0 {
    public final Context f42107c;
    public final PasscodeActivity d;

    public ol0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.f42107c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = e1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 != i10) {
            i11 = passcodeActivity.autoLockRow;
            if (b10 != i11 && b10 != passcodeActivity.N) {
                i12 = passcodeActivity.changePasscodeRow;
                if (b10 != i12) {
                    i13 = passcodeActivity.disablePasscodeRow;
                    if (b10 != i13 && b10 != passcodeActivity.J && b10 != passcodeActivity.K) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.P;
    }

    @Override
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 != i11 && i10 != passcodeActivity.N && i10 != passcodeActivity.K && i10 != passcodeActivity.J) {
            i12 = passcodeActivity.changePasscodeRow;
            if (i10 != i12) {
                i13 = passcodeActivity.autoLockRow;
                if (i10 != i13) {
                    i14 = passcodeActivity.disablePasscodeRow;
                    if (i10 != i14) {
                        if (i10 != passcodeActivity.H && i10 != passcodeActivity.O && i10 != passcodeActivity.G && i10 != passcodeActivity.L) {
                            if (i10 != passcodeActivity.M && i10 != passcodeActivity.I) {
                                if (i10 == 0) {
                                    return 4;
                                }
                                return 0;
                            }
                            return 3;
                        }
                        return 2;
                    }
                    return 1;
                }
                return 1;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ol0.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View a9Var;
        Context context = this.f42107c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        a9Var = new org.telegram.ui.Cells.i9(context);
                    } else {
                        a9Var = new pl0(context);
                        a9Var.setTag(-33024);
                    }
                } else {
                    a9Var = new org.telegram.ui.Cells.q4(context);
                }
            } else {
                a9Var = new org.telegram.ui.Cells.ga(context);
            }
        } else {
            a9Var = new org.telegram.ui.Cells.a9(context);
        }
        return new s4.e1(a9Var);
    }
}

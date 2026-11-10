package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class g5 extends androidx.fragment.app.u {
    public int O = -1;

    public final boolean u(int i7, String[] strArr, int[] iArr) {
        boolean z9;
        String M0;
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i7 == 104) {
            if (z9) {
                f40 f40Var = f40.f45501x5;
                if (f40Var != null) {
                    f40Var.f45573r1.callOnClick();
                    return true;
                }
            } else {
                w(2131624116, org.telegram.messenger.id.M0(2131743285, null));
                return true;
            }
        } else if (i7 != 4 && i7 != 151) {
            if (i7 == 5) {
                if (!z9) {
                    w(2131624117, org.telegram.messenger.id.M0(2131747306, null));
                    return false;
                }
                org.telegram.messenger.g5.r(this.O).l();
                return true;
            } else if (i7 != 3 && i7 != 150) {
                if (i7 != 18 && i7 != 19 && i7 != 20 && i7 != 22) {
                    int i10 = org.telegram.messenger.qs.f25105w4;
                    int i11 = org.telegram.messenger.qs.f25098v4;
                    if (i7 == 2) {
                        org.telegram.messenger.qs e10 = org.telegram.messenger.qs.e();
                        if (z9) {
                            i10 = i11;
                        }
                        e10.k(i10, new Object[0]);
                        return true;
                    } else if (i7 == 211) {
                        org.telegram.messenger.qs e11 = org.telegram.messenger.qs.e();
                        if (z9) {
                            i10 = i11;
                        }
                        e11.k(i10, 1);
                        return true;
                    }
                } else if (!z9) {
                    w(2131624116, org.telegram.messenger.id.M0(2131747308, null));
                }
            } else {
                int min = Math.min(strArr.length, iArr.length);
                boolean z10 = true;
                boolean z11 = true;
                for (int i12 = 0; i12 < min; i12++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i12])) {
                        if (iArr[i12] == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else if ("android.permission.CAMERA".equals(strArr[i12])) {
                        if (iArr[i12] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    }
                }
                if (i7 == 150 && (!z10 || !z11)) {
                    w(2131624116, org.telegram.messenger.id.M0(2131747309, null));
                    return true;
                } else if (!z10) {
                    w(2131624120, org.telegram.messenger.id.M0(2131747311, null));
                    return true;
                } else if (!z11) {
                    w(2131624116, org.telegram.messenger.id.M0(2131747308, null));
                    return true;
                } else {
                    if (org.telegram.messenger.iz.f23456y0) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z9) {
            if (i7 == 151) {
                M0 = org.telegram.messenger.id.M0(2131747301, null);
            } else {
                M0 = org.telegram.messenger.id.M0(2131747299, null);
            }
            w(2131624118, M0);
            return true;
        } else {
            org.telegram.messenger.gc.D().i(null);
            return true;
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.u1 v(int i7, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i10 = org.telegram.ui.ActionBar.m6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
        u1Var.T = X2;
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747300, null), new w0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751772, null), null);
        return u1Var;
    }

    public final void w(int i7, String str) {
        v(i7, str).show();
    }
}

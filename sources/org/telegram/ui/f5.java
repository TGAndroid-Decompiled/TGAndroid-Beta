package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class f5 extends androidx.fragment.app.v {
    public int O = -1;

    public final boolean u(int i10, String[] strArr, int[] iArr) {
        boolean z10;
        String L0;
        if (iArr == null) {
            iArr = new int[0];
        }
        if (strArr == null) {
            strArr = new String[0];
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 == 104) {
            if (z10) {
                a50 a50Var = a50.f35573u5;
                if (a50Var != null) {
                    a50Var.f35638o1.callOnClick();
                    return true;
                }
            } else {
                w(2131624114, org.telegram.messenger.dd.L0(2131743311, null));
                return true;
            }
        } else if (i10 != 4 && i10 != 151) {
            if (i10 == 5) {
                if (!z10) {
                    w(2131624115, org.telegram.messenger.dd.L0(2131747322, null));
                    return false;
                }
                org.telegram.messenger.i5.r(this.O).l();
                return true;
            } else if (i10 != 3 && i10 != 150) {
                if (i10 != 18 && i10 != 19 && i10 != 20 && i10 != 22) {
                    int i11 = org.telegram.messenger.at.f14811w4;
                    int i12 = org.telegram.messenger.at.f14804v4;
                    if (i10 == 2) {
                        org.telegram.messenger.at e = org.telegram.messenger.at.e();
                        if (z10) {
                            i11 = i12;
                        }
                        e.k(i11, new Object[0]);
                        return true;
                    } else if (i10 == 211) {
                        org.telegram.messenger.at e7 = org.telegram.messenger.at.e();
                        if (z10) {
                            i11 = i12;
                        }
                        e7.k(i11, 1);
                        return true;
                    }
                } else if (!z10) {
                    w(2131624114, org.telegram.messenger.dd.L0(2131747324, null));
                }
            } else {
                int min = Math.min(strArr.length, iArr.length);
                boolean z11 = true;
                boolean z12 = true;
                for (int i13 = 0; i13 < min; i13++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i13])) {
                        if (iArr[i13] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else if ("android.permission.CAMERA".equals(strArr[i13])) {
                        if (iArr[i13] == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                }
                if (i10 == 150 && (!z11 || !z12)) {
                    w(2131624114, org.telegram.messenger.dd.L0(2131747325, null));
                    return true;
                } else if (!z11) {
                    w(2131624118, org.telegram.messenger.dd.L0(2131747327, null));
                    return true;
                } else if (!z12) {
                    w(2131624114, org.telegram.messenger.dd.L0(2131747324, null));
                    return true;
                } else {
                    if (org.telegram.messenger.uz.f18567y0) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z10) {
            if (i10 == 151) {
                L0 = org.telegram.messenger.dd.L0(2131747317, null);
            } else {
                L0 = org.telegram.messenger.dd.L0(2131747315, null);
            }
            w(2131624116, L0);
            return true;
        } else {
            org.telegram.messenger.ic.D().i(null);
            return true;
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.x1 v(int i10, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i11 = org.telegram.ui.ActionBar.t6.L5;
        alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.t6.x0(null, i11, false), null);
        alertDialog$Builder.n(i11, null);
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
        x1Var.T = W2;
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747316, null), new y0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751772, null), null);
        return x1Var;
    }

    public final void w(int i10, String str) {
        v(i10, str).show();
    }
}

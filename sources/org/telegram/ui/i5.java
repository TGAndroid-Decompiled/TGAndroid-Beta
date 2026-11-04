package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class i5 extends androidx.fragment.app.v {
    public int P = -1;

    public final boolean u(int i3, String[] strArr, int[] iArr) {
        boolean z10;
        String M0;
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
        if (i3 == 104) {
            if (z10) {
                x30 x30Var = x30.f51711v5;
                if (x30Var != null) {
                    x30Var.f51777p1.callOnClick();
                    return true;
                }
            } else {
                w(2131624116, org.telegram.messenger.bd.M0(2131743295, null));
                return true;
            }
        } else if (i3 != 4 && i3 != 151) {
            if (i3 == 5) {
                if (!z10) {
                    w(2131624117, org.telegram.messenger.bd.M0(2131747314, null));
                    return false;
                }
                org.telegram.messenger.g5.r(this.P).l();
                return true;
            } else if (i3 != 3 && i3 != 150) {
                if (i3 != 18 && i3 != 19 && i3 != 20 && i3 != 22) {
                    int i10 = org.telegram.messenger.hs.f23330w4;
                    int i11 = org.telegram.messenger.hs.f23323v4;
                    if (i3 == 2) {
                        org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                        if (z10) {
                            i10 = i11;
                        }
                        e10.k(i10, new Object[0]);
                        return true;
                    } else if (i3 == 211) {
                        org.telegram.messenger.hs e11 = org.telegram.messenger.hs.e();
                        if (z10) {
                            i10 = i11;
                        }
                        e11.k(i10, 1);
                        return true;
                    }
                } else if (!z10) {
                    w(2131624116, org.telegram.messenger.bd.M0(2131747316, null));
                }
            } else {
                int min = Math.min(strArr.length, iArr.length);
                boolean z11 = true;
                boolean z12 = true;
                for (int i12 = 0; i12 < min; i12++) {
                    if ("android.permission.RECORD_AUDIO".equals(strArr[i12])) {
                        if (iArr[i12] == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                    } else if ("android.permission.CAMERA".equals(strArr[i12])) {
                        if (iArr[i12] == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    }
                }
                if (i3 == 150 && (!z11 || !z12)) {
                    w(2131624116, org.telegram.messenger.bd.M0(2131747317, null));
                    return true;
                } else if (!z11) {
                    w(2131624120, org.telegram.messenger.bd.M0(2131747319, null));
                    return true;
                } else if (!z12) {
                    w(2131624116, org.telegram.messenger.bd.M0(2131747316, null));
                    return true;
                } else {
                    if (org.telegram.messenger.az.f21679y0) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z10) {
            if (i3 == 151) {
                M0 = org.telegram.messenger.bd.M0(2131747309, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131747307, null);
            }
            w(2131624118, M0);
            return true;
        } else {
            org.telegram.messenger.zb.D().i(null);
            return true;
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.s1 v(int i3, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i10 = org.telegram.ui.ActionBar.k6.L5;
        alertDialog$Builder.m(i3, 72, org.telegram.ui.ActionBar.k6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.U = X2;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747308, null), new x0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751772, null), null);
        return s1Var;
    }

    public final void w(int i3, String str) {
        v(i3, str).show();
    }
}

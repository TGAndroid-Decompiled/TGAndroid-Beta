package org.telegram.ui;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public abstract class g5 extends androidx.fragment.app.v {
    public int P = -1;

    public final boolean u(int i7, String[] strArr, int[] iArr) {
        boolean z10;
        String N0;
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
        if (i7 == 104) {
            if (z10) {
                f40 f40Var = f40.C5;
                if (f40Var != null) {
                    f40Var.f47545s1.callOnClick();
                    return true;
                }
            } else {
                w(2131624117, org.telegram.messenger.hd.N0(2131743040, null));
                return true;
            }
        } else if (i7 != 4 && i7 != 151) {
            if (i7 == 5) {
                if (!z10) {
                    w(2131624118, org.telegram.messenger.hd.N0(2131747112, null));
                    return false;
                }
                org.telegram.messenger.i5.r(this.P).l();
                return true;
            } else if (i7 != 3 && i7 != 150) {
                if (i7 != 18 && i7 != 19 && i7 != 20 && i7 != 22) {
                    int i10 = org.telegram.messenger.ls.f25430z4;
                    int i11 = org.telegram.messenger.ls.f25423y4;
                    if (i7 == 2) {
                        org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                        if (z10) {
                            i10 = i11;
                        }
                        e10.k(i10, new Object[0]);
                        return true;
                    } else if (i7 == 211) {
                        org.telegram.messenger.ls e11 = org.telegram.messenger.ls.e();
                        if (z10) {
                            i10 = i11;
                        }
                        e11.k(i10, 1);
                        return true;
                    }
                } else if (!z10) {
                    w(2131624117, org.telegram.messenger.hd.N0(2131747114, null));
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
                if (i7 == 150 && (!z11 || !z12)) {
                    w(2131624117, org.telegram.messenger.hd.N0(2131747115, null));
                    return true;
                } else if (!z11) {
                    w(2131624121, org.telegram.messenger.hd.N0(2131747117, null));
                    return true;
                } else if (!z12) {
                    w(2131624117, org.telegram.messenger.hd.N0(2131747114, null));
                    return true;
                } else {
                    if (org.telegram.messenger.cz.f23457y0) {
                        CameraController.getInstance().initCamera(null);
                    }
                    return false;
                }
            }
        } else if (!z10) {
            if (i7 == 151) {
                N0 = org.telegram.messenger.hd.N0(2131747107, null);
            } else {
                N0 = org.telegram.messenger.hd.N0(2131747105, null);
            }
            w(2131624119, N0);
            return true;
        } else {
            org.telegram.messenger.fc.D().i(null);
            return true;
        }
        return true;
    }

    public final org.telegram.ui.ActionBar.t1 v(int i7, String str) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
        int i10 = org.telegram.ui.ActionBar.m6.L5;
        alertDialog$Builder.m(i7, 72, org.telegram.ui.ActionBar.m6.x0(null, i10, false), null);
        alertDialog$Builder.n(i10, null);
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
        t1Var.U = W2;
        alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747106, null), new w0(this, 4));
        alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751760, null), null);
        return t1Var;
    }

    public final void w(int i7, String str) {
        v(i7, str).show();
    }
}

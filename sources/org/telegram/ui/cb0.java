package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cb0 implements Runnable {
    public final int f44283a = 0;
    public final lb0 f44284b;
    public final TLRPC.TL_error f44285c;
    public final TLObject d;
    public final String f44286e;

    public cb0(lb0 lb0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f44284b = lb0Var;
        this.f44285c = tL_error;
        this.f44286e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i3;
        int i10 = this.f44283a;
        String str = this.f44286e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f44285c;
        final lb0 lb0Var = this.f44284b;
        switch (i10) {
            case 0:
                ib0 ib0Var = lb0Var.f47283a;
                xd0 xd0Var = lb0Var.f47284a0;
                xd0Var.t1(false, true);
                if (tL_error == null) {
                    lb0Var.F = false;
                    xd0Var.E1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", lb0Var.J);
                    bundle.putString("ephone", lb0Var.K);
                    bundle.putString("phoneFormated", lb0Var.M);
                    bundle.putString("phoneHash", lb0Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            xd0Var.f51969r0 = tL_help_termsOfService;
                        }
                        lb0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        lb0Var.f47284a0.D1(5, true, bundle, false);
                                        return;
                                    default:
                                        lb0Var.f47284a0.D1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        lb0Var.n(new pp(lb0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                    ConnectionsManager.getInstance(i3).sendRequest(getpassword, new ab0(lb0Var, str, 1), 10);
                } else {
                    lb0Var.F = false;
                    xd0Var.E1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131749187, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751201, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131751198, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            xd0Var.D1(0, true, null, true);
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            xd0Var.u1(org.telegram.messenger.bd.M0(2131746081, null), org.telegram.messenger.bd.M0(2131750688, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.bd.M0(2131746081, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            xd0Var.u1(M0, sb2.toString());
                        }
                    } else {
                        db0 db0Var = lb0Var.T;
                        kb0 kb0Var = lb0Var.R;
                        try {
                            ib0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            zq[] zqVarArr = ib0Var.f52078f;
                            if (i11 < zqVarArr.length) {
                                zqVarArr[i11].setText("");
                                ib0Var.f52078f[i11].z(1.0f);
                                i11++;
                            } else {
                                if (kb0Var.getCurrentView() == lb0Var.f47287e) {
                                    kb0Var.showNext();
                                    org.telegram.messenger.g0.Z3(lb0Var.h, false, 1.0f, true, true);
                                }
                                ib0Var.f52078f[0].requestFocus();
                                org.telegram.messenger.g0.G3(10.0f, ib0Var, new db0(lb0Var, 3));
                                lb0Var.removeCallbacks(db0Var);
                                lb0Var.postDelayed(db0Var, 5000L);
                                lb0Var.S = true;
                            }
                        }
                    }
                    if (ib0Var.f52078f != null) {
                        int i12 = 0;
                        while (true) {
                            zq[] zqVarArr2 = ib0Var.f52078f;
                            if (i12 < zqVarArr2.length) {
                                zqVarArr2[i12].setText("");
                                i12++;
                            } else {
                                zqVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ib0Var.f52077e = false;
                }
                lb0Var.G = null;
                return;
            default:
                lb0Var.F = false;
                xd0 xd0Var2 = lb0Var.f47284a0;
                xd0Var2.E1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.t4.w0(xd0Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", lb0Var.M);
                    bundle2.putString("phoneHash", lb0Var.N);
                    bundle2.putString("code", str);
                    lb0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    lb0Var.f47284a0.D1(5, true, bundle2, false);
                                    return;
                                default:
                                    lb0Var.f47284a0.D1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                xd0Var2.u1(org.telegram.messenger.bd.M0(2131746081, null), tL_error.text);
                return;
        }
    }

    public cb0(lb0 lb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f44284b = lb0Var;
        this.f44285c = tL_error;
        this.d = tLObject;
        this.f44286e = str;
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class oc0 implements Runnable {
    public final int f40130a = 0;
    public final vc0 f40131b;
    public final TLRPC.TL_error f40132c;
    public final TLObject d;
    public final String e;

    public oc0(vc0 vc0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f40131b = vc0Var;
        this.f40132c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f40130a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f40132c;
        final vc0 vc0Var = this.f40131b;
        switch (i11) {
            case 0:
                tc0 tc0Var = vc0Var.f42478a;
                gf0 gf0Var = vc0Var.W;
                gf0Var.t1(false, true);
                if (tL_error == null) {
                    vc0Var.E = false;
                    gf0Var.E1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", vc0Var.I);
                    bundle.putString("ephone", vc0Var.J);
                    bundle.putString("phoneFormated", vc0Var.L);
                    bundle.putString("phoneHash", vc0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            gf0Var.f37491q0 = tL_help_termsOfService;
                        }
                        vc0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        vc0Var.W.D1(5, true, bundle, false);
                                        return;
                                    default:
                                        vc0Var.W.D1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        vc0Var.n(new qq(vc0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new mc0(vc0Var, str, 1), 10);
                } else {
                    vc0Var.E = false;
                    gf0Var.E1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751201, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131751198, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            gf0Var.D1(0, true, null, true);
                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                        } else {
                            String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            gf0Var.u1(L0, sb2.toString());
                        }
                    } else {
                        pc0 pc0Var = vc0Var.S;
                        uc0 uc0Var = vc0Var.Q;
                        try {
                            tc0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            bs[] bsVarArr = tc0Var.f44045f;
                            if (i12 < bsVarArr.length) {
                                bsVarArr[i12].setText("");
                                tc0Var.f44045f[i12].z(1.0f);
                                i12++;
                            } else {
                                if (uc0Var.getCurrentView() == vc0Var.e) {
                                    uc0Var.showNext();
                                    org.telegram.messenger.i0.Y3(vc0Var.h, false, 1.0f, true, true);
                                }
                                tc0Var.f44045f[0].requestFocus();
                                org.telegram.messenger.i0.F3(10.0f, tc0Var, new pc0(vc0Var, 3));
                                vc0Var.removeCallbacks(pc0Var);
                                vc0Var.postDelayed(pc0Var, 5000L);
                                vc0Var.R = true;
                            }
                        }
                    }
                    if (tc0Var.f44045f != null) {
                        int i13 = 0;
                        while (true) {
                            bs[] bsVarArr2 = tc0Var.f44045f;
                            if (i13 < bsVarArr2.length) {
                                bsVarArr2[i13].setText("");
                                i13++;
                            } else {
                                bsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    tc0Var.e = false;
                }
                vc0Var.F = null;
                return;
            default:
                vc0Var.E = false;
                gf0 gf0Var2 = vc0Var.W;
                gf0Var2.E1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", vc0Var.L);
                    bundle2.putString("phoneHash", vc0Var.M);
                    bundle2.putString("code", str);
                    vc0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    vc0Var.W.D1(5, true, bundle2, false);
                                    return;
                                default:
                                    vc0Var.W.D1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error.text);
                return;
        }
    }

    public oc0(vc0 vc0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f40131b = vc0Var;
        this.f40132c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}

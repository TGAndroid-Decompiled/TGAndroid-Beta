package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class pc0 implements Runnable {
    public final int f40625a = 0;
    public final wc0 f40626b;
    public final TLRPC.TL_error f40627c;
    public final TLObject d;
    public final String e;

    public pc0(wc0 wc0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f40626b = wc0Var;
        this.f40627c = tL_error;
        this.e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        int i11 = this.f40625a;
        String str = this.e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f40627c;
        final wc0 wc0Var = this.f40626b;
        switch (i11) {
            case 0:
                uc0 uc0Var = wc0Var.f42927a;
                hf0 hf0Var = wc0Var.W;
                hf0Var.s1(false, true);
                if (tL_error == null) {
                    wc0Var.E = false;
                    hf0Var.D1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", wc0Var.I);
                    bundle.putString("ephone", wc0Var.J);
                    bundle.putString("phoneFormated", wc0Var.L);
                    bundle.putString("phoneHash", wc0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            hf0Var.f37938q0 = tL_help_termsOfService;
                        }
                        wc0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        wc0Var.W.C1(5, true, bundle, false);
                                        return;
                                    default:
                                        wc0Var.W.C1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        wc0Var.n(new qq(wc0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i10 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new nc0(wc0Var, str, 1), 10);
                } else {
                    wc0Var.E = false;
                    hf0Var.D1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131749189, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751201, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131751198, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            hf0Var.C1(0, true, null, true);
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            hf0Var.t1(org.telegram.messenger.cd.L0(2131746088, null), org.telegram.messenger.cd.L0(2131750688, "FloodWait"));
                        } else {
                            String L0 = org.telegram.messenger.cd.L0(2131746088, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.z20.q("ErrorOccurred", 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            hf0Var.t1(L0, sb2.toString());
                        }
                    } else {
                        qc0 qc0Var = wc0Var.S;
                        vc0 vc0Var = wc0Var.Q;
                        try {
                            uc0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i12 = 0;
                        while (true) {
                            bs[] bsVarArr = uc0Var.f44219f;
                            if (i12 < bsVarArr.length) {
                                bsVarArr[i12].setText("");
                                uc0Var.f44219f[i12].z(1.0f);
                                i12++;
                            } else {
                                if (vc0Var.getCurrentView() == wc0Var.e) {
                                    vc0Var.showNext();
                                    org.telegram.messenger.i0.Y3(wc0Var.h, false, 1.0f, true, true);
                                }
                                uc0Var.f44219f[0].requestFocus();
                                org.telegram.messenger.i0.F3(10.0f, uc0Var, new qc0(wc0Var, 3));
                                wc0Var.removeCallbacks(qc0Var);
                                wc0Var.postDelayed(qc0Var, 5000L);
                                wc0Var.R = true;
                            }
                        }
                    }
                    if (uc0Var.f44219f != null) {
                        int i13 = 0;
                        while (true) {
                            bs[] bsVarArr2 = uc0Var.f44219f;
                            if (i13 < bsVarArr2.length) {
                                bsVarArr2[i13].setText("");
                                i13++;
                            } else {
                                bsVarArr2[0].requestFocus();
                            }
                        }
                    }
                    uc0Var.e = false;
                }
                wc0Var.F = null;
                return;
            default:
                wc0Var.E = false;
                hf0 hf0Var2 = wc0Var.W;
                hf0Var2.D1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.m0(password, true)) {
                        org.telegram.ui.Components.s4.w0(hf0Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131743846, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", wc0Var.L);
                    bundle2.putString("phoneHash", wc0Var.M);
                    bundle2.putString("code", str);
                    wc0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    wc0Var.W.C1(5, true, bundle2, false);
                                    return;
                                default:
                                    wc0Var.W.C1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                hf0Var2.t1(org.telegram.messenger.cd.L0(2131746088, null), tL_error.text);
                return;
        }
    }

    public pc0(wc0 wc0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f40626b = wc0Var;
        this.f40627c = tL_error;
        this.d = tLObject;
        this.e = str;
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jb0 implements Runnable {
    public final int f46894a = 0;
    public final rb0 f46895b;
    public final TLRPC.TL_error f46896c;
    public final TLObject d;
    public final String f46897e;

    public jb0(rb0 rb0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f46895b = rb0Var;
        this.f46896c = tL_error;
        this.f46897e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46894a;
        String str = this.f46897e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f46896c;
        final rb0 rb0Var = this.f46895b;
        switch (i10) {
            case 0:
                ob0 ob0Var = rb0Var.f49332a;
                fe0 fe0Var = rb0Var.W;
                fe0Var.C1(false, true);
                if (tL_error == null) {
                    rb0Var.E = false;
                    fe0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", rb0Var.I);
                    bundle.putString("ephone", rb0Var.J);
                    bundle.putString("phoneFormated", rb0Var.L);
                    bundle.putString("phoneHash", rb0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            fe0Var.f45713q0 = tL_help_termsOfService;
                        }
                        rb0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        rb0Var.W.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        rb0Var.W.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        rb0Var.n(new tp(rb0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new hb0(rb0Var, str, 1), 10);
                } else {
                    rb0Var.E = false;
                    fe0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751204, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751200, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751197, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            fe0Var.M1(0, true, null, true);
                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.id.M0(2131746071, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                            sb2.append(tL_error.text);
                            fe0Var.D1(M0, sb2.toString());
                        }
                    } else {
                        kb0 kb0Var = rb0Var.S;
                        qb0 qb0Var = rb0Var.Q;
                        try {
                            ob0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            er[] erVarArr = ob0Var.f44118f;
                            if (i11 < erVarArr.length) {
                                erVarArr[i11].setText("");
                                ob0Var.f44118f[i11].z(1.0f);
                                i11++;
                            } else {
                                if (qb0Var.getCurrentView() == rb0Var.f49335e) {
                                    qb0Var.showNext();
                                    org.telegram.messenger.g0.Z3(rb0Var.h, false, 1.0f, true, true);
                                }
                                ob0Var.f44118f[0].requestFocus();
                                org.telegram.messenger.g0.G3(10.0f, ob0Var, new kb0(rb0Var, 3));
                                rb0Var.removeCallbacks(kb0Var);
                                rb0Var.postDelayed(kb0Var, 5000L);
                                rb0Var.R = true;
                            }
                        }
                    }
                    if (ob0Var.f44118f != null) {
                        int i12 = 0;
                        while (true) {
                            er[] erVarArr2 = ob0Var.f44118f;
                            if (i12 < erVarArr2.length) {
                                erVarArr2[i12].setText("");
                                i12++;
                            } else {
                                erVarArr2[0].requestFocus();
                            }
                        }
                    }
                    ob0Var.f44117e = false;
                }
                rb0Var.F = null;
                return;
            default:
                rb0Var.E = false;
                fe0 fe0Var2 = rb0Var.W;
                fe0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", rb0Var.L);
                    bundle2.putString("phoneHash", rb0Var.M);
                    bundle2.putString("code", str);
                    rb0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    rb0Var.W.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    rb0Var.W.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error.text);
                return;
        }
    }

    public jb0(rb0 rb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f46895b = rb0Var;
        this.f46896c = tL_error;
        this.d = tLObject;
        this.f46897e = str;
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ib0 implements Runnable {
    public final int f46554a = 0;
    public final qb0 f46555b;
    public final TLRPC.TL_error f46556c;
    public final TLObject d;
    public final String f46557e;

    public ib0(qb0 qb0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f46555b = qb0Var;
        this.f46556c = tL_error;
        this.f46557e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f46554a;
        String str = this.f46557e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f46556c;
        final qb0 qb0Var = this.f46555b;
        switch (i10) {
            case 0:
                nb0 nb0Var = qb0Var.f49001a;
                ee0 ee0Var = qb0Var.W;
                ee0Var.C1(false, true);
                if (tL_error == null) {
                    qb0Var.E = false;
                    ee0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", qb0Var.I);
                    bundle.putString("ephone", qb0Var.J);
                    bundle.putString("phoneFormated", qb0Var.L);
                    bundle.putString("phoneHash", qb0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ee0Var.f45389q0 = tL_help_termsOfService;
                        }
                        qb0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        qb0Var.W.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        qb0Var.W.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        qb0Var.n(new tp(qb0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new gb0(qb0Var, str, 1), 10);
                } else {
                    qb0Var.E = false;
                    ee0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751204, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751200, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131751197, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ee0Var.M1(0, true, null, true);
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.id.M0(2131746071, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                            sb2.append(tL_error.text);
                            ee0Var.D1(M0, sb2.toString());
                        }
                    } else {
                        jb0 jb0Var = qb0Var.S;
                        pb0 pb0Var = qb0Var.Q;
                        try {
                            nb0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            dr[] drVarArr = nb0Var.f43768f;
                            if (i11 < drVarArr.length) {
                                drVarArr[i11].setText("");
                                nb0Var.f43768f[i11].z(1.0f);
                                i11++;
                            } else {
                                if (pb0Var.getCurrentView() == qb0Var.f49004e) {
                                    pb0Var.showNext();
                                    org.telegram.messenger.g0.Z3(qb0Var.h, false, 1.0f, true, true);
                                }
                                nb0Var.f43768f[0].requestFocus();
                                org.telegram.messenger.g0.G3(10.0f, nb0Var, new jb0(qb0Var, 3));
                                qb0Var.removeCallbacks(jb0Var);
                                qb0Var.postDelayed(jb0Var, 5000L);
                                qb0Var.R = true;
                            }
                        }
                    }
                    if (nb0Var.f43768f != null) {
                        int i12 = 0;
                        while (true) {
                            dr[] drVarArr2 = nb0Var.f43768f;
                            if (i12 < drVarArr2.length) {
                                drVarArr2[i12].setText("");
                                i12++;
                            } else {
                                drVarArr2[0].requestFocus();
                            }
                        }
                    }
                    nb0Var.f43767e = false;
                }
                qb0Var.F = null;
                return;
            default:
                qb0Var.E = false;
                ee0 ee0Var2 = qb0Var.W;
                ee0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", qb0Var.L);
                    bundle2.putString("phoneHash", qb0Var.M);
                    bundle2.putString("code", str);
                    qb0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    qb0Var.W.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    qb0Var.W.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error.text);
                return;
        }
    }

    public ib0(qb0 qb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f46555b = qb0Var;
        this.f46556c = tL_error;
        this.d = tLObject;
        this.f46557e = str;
    }
}

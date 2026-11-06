package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gb0 implements Runnable {
    public final int f45937a = 0;
    public final ob0 f45938b;
    public final TLRPC.TL_error f45939c;
    public final TLObject d;
    public final String f45940e;

    public gb0(ob0 ob0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f45938b = ob0Var;
        this.f45939c = tL_error;
        this.f45940e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f45937a;
        String str = this.f45940e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f45939c;
        final ob0 ob0Var = this.f45938b;
        switch (i10) {
            case 0:
                lb0 lb0Var = ob0Var.f48353a;
                ce0 ce0Var = ob0Var.W;
                ce0Var.C1(false, true);
                if (tL_error == null) {
                    ob0Var.E = false;
                    ce0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ob0Var.I);
                    bundle.putString("ephone", ob0Var.J);
                    bundle.putString("phoneFormated", ob0Var.L);
                    bundle.putString("phoneHash", ob0Var.M);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ce0Var.f44778q0 = tL_help_termsOfService;
                        }
                        ob0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ob0Var.W.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        ob0Var.W.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ob0Var.n(new rp(ob0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.f2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new eb0(ob0Var, str, 1), 10);
                } else {
                    ob0Var.E = false;
                    ce0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131751205, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131749178, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131751201, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131751198, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ce0Var.M1(0, true, null, true);
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746072, null), org.telegram.messenger.hd.M0(2131750688, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.hd.M0(2131746072, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751106, sb2, "\n");
                            sb2.append(tL_error.text);
                            ce0Var.D1(M0, sb2.toString());
                        }
                    } else {
                        hb0 hb0Var = ob0Var.S;
                        nb0 nb0Var = ob0Var.Q;
                        try {
                            lb0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            br[] brVarArr = lb0Var.f52311f;
                            if (i11 < brVarArr.length) {
                                brVarArr[i11].setText("");
                                lb0Var.f52311f[i11].z(1.0f);
                                i11++;
                            } else {
                                if (nb0Var.getCurrentView() == ob0Var.f48356e) {
                                    nb0Var.showNext();
                                    org.telegram.messenger.g0.Z3(ob0Var.h, false, 1.0f, true, true);
                                }
                                lb0Var.f52311f[0].requestFocus();
                                org.telegram.messenger.g0.G3(10.0f, lb0Var, new hb0(ob0Var, 3));
                                ob0Var.removeCallbacks(hb0Var);
                                ob0Var.postDelayed(hb0Var, 5000L);
                                ob0Var.R = true;
                            }
                        }
                    }
                    if (lb0Var.f52311f != null) {
                        int i12 = 0;
                        while (true) {
                            br[] brVarArr2 = lb0Var.f52311f;
                            if (i12 < brVarArr2.length) {
                                brVarArr2[i12].setText("");
                                i12++;
                            } else {
                                brVarArr2[0].requestFocus();
                            }
                        }
                    }
                    lb0Var.f52310e = false;
                }
                ob0Var.F = null;
                return;
            default:
                ob0Var.E = false;
                ce0 ce0Var2 = ob0Var.W;
                ce0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.v4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ob0Var.L);
                    bundle2.putString("phoneHash", ob0Var.M);
                    bundle2.putString("code", str);
                    ob0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ob0Var.W.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    ob0Var.W.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746072, null), tL_error.text);
                return;
        }
    }

    public gb0(ob0 ob0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f45938b = ob0Var;
        this.f45939c = tL_error;
        this.d = tLObject;
        this.f45940e = str;
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gb0 implements Runnable {
    public final int f48014a = 0;
    public final ob0 f48015b;
    public final TLRPC.TL_error f48016c;
    public final TLObject d;
    public final String f48017e;

    public gb0(ob0 ob0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f48015b = ob0Var;
        this.f48016c = tL_error;
        this.f48017e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48014a;
        String str = this.f48017e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f48016c;
        final ob0 ob0Var = this.f48015b;
        switch (i10) {
            case 0:
                lb0 lb0Var = ob0Var.f50547a;
                de0 de0Var = ob0Var.f50548a0;
                de0Var.C1(false, true);
                if (tL_error == null) {
                    ob0Var.F = false;
                    de0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ob0Var.J);
                    bundle.putString("ephone", ob0Var.K);
                    bundle.putString("phoneFormated", ob0Var.M);
                    bundle.putString("phoneHash", ob0Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            de0Var.f46958s0 = tL_help_termsOfService;
                        }
                        ob0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ob0Var.f50548a0.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        ob0Var.f50548a0.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ob0Var.n(new up(ob0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new eb0(ob0Var, str, 1), 10);
                } else {
                    ob0Var.F = false;
                    de0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131751193, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131751189, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131751186, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            de0Var.M1(0, true, null, true);
                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            de0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                            sb2.append(tL_error.text);
                            de0Var.D1(M0, sb2.toString());
                        }
                    } else {
                        hb0 hb0Var = ob0Var.T;
                        nb0 nb0Var = ob0Var.R;
                        try {
                            lb0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            er[] erVarArr = lb0Var.f46283f;
                            if (i11 < erVarArr.length) {
                                erVarArr[i11].setText("");
                                lb0Var.f46283f[i11].A(1.0f);
                                i11++;
                            } else {
                                if (nb0Var.getCurrentView() == ob0Var.f50551e) {
                                    nb0Var.showNext();
                                    org.telegram.messenger.g0.X3(ob0Var.h, false, 1.0f, true, true);
                                }
                                lb0Var.f46283f[0].requestFocus();
                                org.telegram.messenger.g0.E3(10.0f, lb0Var, new hb0(ob0Var, 3));
                                ob0Var.removeCallbacks(hb0Var);
                                ob0Var.postDelayed(hb0Var, 5000L);
                                ob0Var.S = true;
                            }
                        }
                    }
                    if (lb0Var.f46283f != null) {
                        int i12 = 0;
                        while (true) {
                            er[] erVarArr2 = lb0Var.f46283f;
                            if (i12 < erVarArr2.length) {
                                erVarArr2[i12].setText("");
                                i12++;
                            } else {
                                erVarArr2[0].requestFocus();
                            }
                        }
                    }
                    lb0Var.f46282e = false;
                }
                ob0Var.G = null;
                return;
            default:
                ob0Var.F = false;
                de0 de0Var2 = ob0Var.f50548a0;
                de0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.b5.u0(de0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", ob0Var.M);
                    bundle2.putString("phoneHash", ob0Var.N);
                    bundle2.putString("code", str);
                    ob0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    ob0Var.f50548a0.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    ob0Var.f50548a0.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                de0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error.text);
                return;
        }
    }

    public gb0(ob0 ob0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f48015b = ob0Var;
        this.f48016c = tL_error;
        this.d = tLObject;
        this.f48017e = str;
    }
}

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hb0 implements Runnable {
    public final int f48231a = 0;
    public final pb0 f48232b;
    public final TLRPC.TL_error f48233c;
    public final TLObject d;
    public final String f48234e;

    public hb0(pb0 pb0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f48232b = pb0Var;
        this.f48233c = tL_error;
        this.f48234e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48231a;
        String str = this.f48234e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f48233c;
        final pb0 pb0Var = this.f48232b;
        switch (i10) {
            case 0:
                mb0 mb0Var = pb0Var.f50788a;
                ee0 ee0Var = pb0Var.f50789a0;
                ee0Var.C1(false, true);
                if (tL_error == null) {
                    pb0Var.F = false;
                    ee0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", pb0Var.J);
                    bundle.putString("ephone", pb0Var.K);
                    bundle.putString("phoneFormated", pb0Var.M);
                    bundle.putString("phoneHash", pb0Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ee0Var.f47202s0 = tL_help_termsOfService;
                        }
                        pb0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        pb0Var.f50789a0.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        pb0Var.f50789a0.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        pb0Var.n(new up(pb0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.h2) ee0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new fb0(pb0Var, str, 1), 10);
                } else {
                    pb0Var.F = false;
                    ee0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131751193, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131748987, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131751189, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131751186, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ee0Var.M1(0, true, null, true);
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131752010, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ee0Var.D1(org.telegram.messenger.gd.M0(2131745876, null), org.telegram.messenger.gd.M0(2131750671, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.gd.M0(2131745876, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751094, sb2, "\n");
                            sb2.append(tL_error.text);
                            ee0Var.D1(M0, sb2.toString());
                        }
                    } else {
                        ib0 ib0Var = pb0Var.T;
                        ob0 ob0Var = pb0Var.R;
                        try {
                            mb0Var.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        int i11 = 0;
                        while (true) {
                            er[] erVarArr = mb0Var.f46274f;
                            if (i11 < erVarArr.length) {
                                erVarArr[i11].setText("");
                                mb0Var.f46274f[i11].A(1.0f);
                                i11++;
                            } else {
                                if (ob0Var.getCurrentView() == pb0Var.f50792e) {
                                    ob0Var.showNext();
                                    org.telegram.messenger.g0.X3(pb0Var.h, false, 1.0f, true, true);
                                }
                                mb0Var.f46274f[0].requestFocus();
                                org.telegram.messenger.g0.E3(10.0f, mb0Var, new ib0(pb0Var, 3));
                                pb0Var.removeCallbacks(ib0Var);
                                pb0Var.postDelayed(ib0Var, 5000L);
                                pb0Var.S = true;
                            }
                        }
                    }
                    if (mb0Var.f46274f != null) {
                        int i12 = 0;
                        while (true) {
                            er[] erVarArr2 = mb0Var.f46274f;
                            if (i12 < erVarArr2.length) {
                                erVarArr2[i12].setText("");
                                i12++;
                            } else {
                                erVarArr2[0].requestFocus();
                            }
                        }
                    }
                    mb0Var.f46273e = false;
                }
                pb0Var.G = null;
                return;
            default:
                pb0Var.F = false;
                ee0 ee0Var2 = pb0Var.f50789a0;
                ee0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.b5.u0(ee0Var2.getParentActivity(), org.telegram.messenger.gd.M0(2131743583, "UpdateAppAlert"), true);
                        return;
                    }
                    final Bundle bundle2 = new Bundle();
                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                    password.serializeToStream(serializedData);
                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                    bundle2.putString("phoneFormated", pb0Var.M);
                    bundle2.putString("phoneHash", pb0Var.N);
                    bundle2.putString("code", str);
                    pb0Var.n(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    pb0Var.f50789a0.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    pb0Var.f50789a0.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ee0Var2.D1(org.telegram.messenger.gd.M0(2131745876, null), tL_error.text);
                return;
        }
    }

    public hb0(pb0 pb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f48232b = pb0Var;
        this.f48233c = tL_error;
        this.d = tLObject;
        this.f48234e = str;
    }
}

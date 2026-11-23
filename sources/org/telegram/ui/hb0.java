package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hb0 implements Runnable {
    public final int f48309a = 0;
    public final pb0 f48310b;
    public final TLRPC.TL_error f48311c;
    public final TLObject d;
    public final String f48312e;

    public hb0(pb0 pb0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f48310b = pb0Var;
        this.f48311c = tL_error;
        this.f48312e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f48309a;
        String str = this.f48312e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f48311c;
        final pb0 pb0Var = this.f48310b;
        switch (i10) {
            case 0:
                mb0 mb0Var = pb0Var.f50833a;
                de0 de0Var = pb0Var.f50834a0;
                de0Var.C1(false, true);
                if (tL_error == null) {
                    pb0Var.F = false;
                    de0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", pb0Var.J);
                    bundle.putString("ephone", pb0Var.K);
                    bundle.putString("phoneFormated", pb0Var.M);
                    bundle.putString("phoneHash", pb0Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            de0Var.f46951s0 = tL_help_termsOfService;
                        }
                        pb0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        pb0Var.f50834a0.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        pb0Var.f50834a0.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        pb0Var.n(new up(pb0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new fb0(pb0Var, str, 1), 10);
                } else {
                    pb0Var.F = false;
                    de0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751192, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131748986, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751188, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131751185, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            de0Var.M1(0, true, null, true);
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131752009, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            de0Var.D1(org.telegram.messenger.hd.N0(2131745875, null), org.telegram.messenger.hd.N0(2131750670, "FloodWait"));
                        } else {
                            String N0 = org.telegram.messenger.hd.N0(2131745875, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.c0.u("ErrorOccurred", 2131751093, sb2, "\n");
                            sb2.append(tL_error.text);
                            de0Var.D1(N0, sb2.toString());
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
                            er[] erVarArr = mb0Var.f46301f;
                            if (i11 < erVarArr.length) {
                                erVarArr[i11].setText("");
                                mb0Var.f46301f[i11].A(1.0f);
                                i11++;
                            } else {
                                if (ob0Var.getCurrentView() == pb0Var.f50837e) {
                                    ob0Var.showNext();
                                    org.telegram.messenger.g0.X3(pb0Var.h, false, 1.0f, true, true);
                                }
                                mb0Var.f46301f[0].requestFocus();
                                org.telegram.messenger.g0.E3(10.0f, mb0Var, new ib0(pb0Var, 3));
                                pb0Var.removeCallbacks(ib0Var);
                                pb0Var.postDelayed(ib0Var, 5000L);
                                pb0Var.S = true;
                            }
                        }
                    }
                    if (mb0Var.f46301f != null) {
                        int i12 = 0;
                        while (true) {
                            er[] erVarArr2 = mb0Var.f46301f;
                            if (i12 < erVarArr2.length) {
                                erVarArr2[i12].setText("");
                                i12++;
                            } else {
                                erVarArr2[0].requestFocus();
                            }
                        }
                    }
                    mb0Var.f46300e = false;
                }
                pb0Var.G = null;
                return;
            default:
                pb0Var.F = false;
                de0 de0Var2 = pb0Var.f50834a0;
                de0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.c5.u0(de0Var2.getParentActivity(), org.telegram.messenger.hd.N0(2131743575, "UpdateAppAlert"), true);
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
                                    pb0Var.f50834a0.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    pb0Var.f50834a0.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                de0Var2.D1(org.telegram.messenger.hd.N0(2131745875, null), tL_error.text);
                return;
        }
    }

    public hb0(pb0 pb0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f48310b = pb0Var;
        this.f48311c = tL_error;
        this.d = tLObject;
        this.f48312e = str;
    }
}

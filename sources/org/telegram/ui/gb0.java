package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gb0 implements Runnable {
    public final int f47397a = 0;
    public final ob0 f47398b;
    public final TLRPC.TL_error f47399c;
    public final TLObject d;
    public final String f47400e;

    public gb0(ob0 ob0Var, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f47398b = ob0Var;
        this.f47399c = tL_error;
        this.f47400e = str;
        this.d = tLObject;
    }

    @Override
    public final void run() {
        int i7;
        int i10 = this.f47397a;
        String str = this.f47400e;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.f47399c;
        final ob0 ob0Var = this.f47398b;
        switch (i10) {
            case 0:
                lb0 lb0Var = ob0Var.f49890a;
                ce0 ce0Var = ob0Var.f49891a0;
                ce0Var.C1(false, true);
                if (tL_error == null) {
                    ob0Var.F = false;
                    ce0Var.N1(false, true);
                    final Bundle bundle = new Bundle();
                    bundle.putString("phone", ob0Var.J);
                    bundle.putString("ephone", ob0Var.K);
                    bundle.putString("phoneFormated", ob0Var.M);
                    bundle.putString("phoneHash", ob0Var.N);
                    bundle.putString("code", str);
                    if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            ce0Var.f46110s0 = tL_help_termsOfService;
                        }
                        ob0Var.n(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        ob0Var.f49891a0.M1(5, true, bundle, false);
                                        return;
                                    default:
                                        ob0Var.f49891a0.M1(6, true, bundle, false);
                                        return;
                                }
                            }
                        });
                    } else {
                        ob0Var.n(new tp(ob0Var, tLObject, bundle, 29));
                    }
                } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                    TL_account.getPassword getpassword = new TL_account.getPassword();
                    i7 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new eb0(ob0Var, str, 1), 10);
                } else {
                    ob0Var.F = false;
                    ce0Var.N1(false, true);
                    if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131751204, null));
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131749179, "InvalidPhoneNumber"));
                    } else if (!tL_error.text.contains("CODE_EMPTY") && !tL_error.text.contains("CODE_INVALID") && !tL_error.text.contains("EMAIL_CODE_INVALID") && !tL_error.text.contains("PHONE_CODE_INVALID")) {
                        if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131751200, null));
                        } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131751197, null));
                        } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                            ce0Var.M1(0, true, null, true);
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131752021, "CodeExpired"));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            ce0Var.D1(org.telegram.messenger.hd.M0(2131746071, null), org.telegram.messenger.hd.M0(2131750687, "FloodWait"));
                        } else {
                            String M0 = org.telegram.messenger.hd.M0(2131746071, null);
                            StringBuilder sb2 = new StringBuilder();
                            org.telegram.ui.Cells.y0.r("ErrorOccurred", 2131751105, sb2, "\n");
                            sb2.append(tL_error.text);
                            ce0Var.D1(M0, sb2.toString());
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
                            dr[] drVarArr = lb0Var.f45491f;
                            if (i11 < drVarArr.length) {
                                drVarArr[i11].setText("");
                                lb0Var.f45491f[i11].A(1.0f);
                                i11++;
                            } else {
                                if (nb0Var.getCurrentView() == ob0Var.f49894e) {
                                    nb0Var.showNext();
                                    org.telegram.messenger.g0.Y3(ob0Var.h, false, 1.0f, true, true);
                                }
                                lb0Var.f45491f[0].requestFocus();
                                org.telegram.messenger.g0.F3(10.0f, lb0Var, new hb0(ob0Var, 3));
                                ob0Var.removeCallbacks(hb0Var);
                                ob0Var.postDelayed(hb0Var, 5000L);
                                ob0Var.S = true;
                            }
                        }
                    }
                    if (lb0Var.f45491f != null) {
                        int i12 = 0;
                        while (true) {
                            dr[] drVarArr2 = lb0Var.f45491f;
                            if (i12 < drVarArr2.length) {
                                drVarArr2[i12].setText("");
                                i12++;
                            } else {
                                drVarArr2[0].requestFocus();
                            }
                        }
                    }
                    lb0Var.f45490e = false;
                }
                ob0Var.G = null;
                return;
            default:
                ob0Var.F = false;
                ce0 ce0Var2 = ob0Var.f49891a0;
                ce0Var2.N1(false, true);
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    if (!TwoStepVerificationActivity.n0(password, true)) {
                        org.telegram.ui.Components.t4.u0(ce0Var2.getParentActivity(), org.telegram.messenger.hd.M0(2131743820, "UpdateAppAlert"), true);
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
                                    ob0Var.f49891a0.M1(5, true, bundle2, false);
                                    return;
                                default:
                                    ob0Var.f49891a0.M1(6, true, bundle2, false);
                                    return;
                            }
                        }
                    });
                    return;
                }
                ce0Var2.D1(org.telegram.messenger.hd.M0(2131746071, null), tL_error.text);
                return;
        }
    }

    public gb0(ob0 ob0Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        this.f47398b = ob0Var;
        this.f47399c = tL_error;
        this.d = tLObject;
        this.f47400e = str;
    }
}

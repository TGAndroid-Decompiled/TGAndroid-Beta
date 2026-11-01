package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ae0 implements RequestDelegate {
    public final int f35766a;
    public final le0 f35767b;
    public final TLRPC.TL_auth_signIn f35768c;

    public ae0(le0 le0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f35766a = i10;
        this.f35767b = le0Var;
        this.f35768c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35766a) {
            case 0:
                final le0 le0Var = this.f35767b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f35768c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final le0 le0Var2 = le0Var;
                        switch (i14) {
                            case 0:
                                int i15 = le0Var2.f39244h0;
                                gf0 gf0Var = le0Var2.f39259u0;
                                le0Var2.x(false);
                                if (tL_error2 == null) {
                                    le0Var2.f39242f0 = false;
                                    gf0Var.E1(false, true);
                                    le0Var2.u();
                                    le0Var2.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gf0Var.f37491q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", le0Var2.d);
                                        bundle.putString("phoneHash", le0Var2.f39237c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        le0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        le0Var2.f39259u0.D1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        le0Var2.f39259u0.D1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        le0Var2.p(new y60(26, le0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    le0Var2.f39243g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ae0(le0Var2, tL_auth_signIn2, 1), 10);
                                        le0Var2.u();
                                        le0Var2.t();
                                    } else {
                                        le0Var2.f39242f0 = false;
                                        gf0Var.E1(false, true);
                                        if ((i15 == 3 && ((i12 = le0Var2.f39245i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i15 == 2 && ((i11 = le0Var2.f39245i0) == 4 || i11 == 3)) || (i15 == 4 && ((i10 = le0Var2.f39245i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            le0Var2.s();
                                        }
                                        if (i15 == 15) {
                                            org.telegram.messenger.at.e().b(le0Var2, 257);
                                        } else if (i15 == 2) {
                                            org.telegram.messenger.i0.D3(true);
                                            org.telegram.messenger.at.e().b(le0Var2, 257);
                                        } else if (i15 == 3) {
                                            org.telegram.messenger.i0.C3(true);
                                            org.telegram.messenger.at.e().b(le0Var2, 258);
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.n0(9));
                                        }
                                        le0Var2.f39240e0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    le0Var2.c(true);
                                                    gf0Var.D1(0, true, null, true);
                                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                                                } else {
                                                    String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    gf0Var.u1(L0, sb2.toString());
                                                }
                                            } else {
                                                le0Var2.w();
                                                return;
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                zr zrVar = le0Var2.f39241f;
                                                bs[] bsVarArr = zrVar.f44045f;
                                                if (i16 < bsVarArr.length) {
                                                    bsVarArr[i16].setText("");
                                                    i16++;
                                                } else {
                                                    zrVar.e = false;
                                                    bsVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i15 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                le0Var2.f39242f0 = false;
                                gf0 gf0Var2 = le0Var2.f39259u0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", le0Var2.d);
                                    bundle2.putString("phoneHash", le0Var2.f39237c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    le0Var2.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    le0Var2.f39259u0.D1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    le0Var2.f39259u0.D1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final le0 le0Var2 = this.f35767b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f35768c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        int i14 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        final le0 le0Var22 = le0Var2;
                        switch (i14) {
                            case 0:
                                int i15 = le0Var22.f39244h0;
                                gf0 gf0Var = le0Var22.f39259u0;
                                le0Var22.x(false);
                                if (tL_error2 == null) {
                                    le0Var22.f39242f0 = false;
                                    gf0Var.E1(false, true);
                                    le0Var22.u();
                                    le0Var22.t();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gf0Var.f37491q0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", le0Var22.d);
                                        bundle.putString("phoneHash", le0Var22.f39237c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        le0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        le0Var22.f39259u0.D1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        le0Var22.f39259u0.D1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        le0Var22.p(new y60(26, le0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    le0Var22.f39243g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ae0(le0Var22, tL_auth_signIn22, 1), 10);
                                        le0Var22.u();
                                        le0Var22.t();
                                    } else {
                                        le0Var22.f39242f0 = false;
                                        gf0Var.E1(false, true);
                                        if ((i15 == 3 && ((i12 = le0Var22.f39245i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i15 == 2 && ((i11 = le0Var22.f39245i0) == 4 || i11 == 3)) || (i15 == 4 && ((i10 = le0Var22.f39245i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            le0Var22.s();
                                        }
                                        if (i15 == 15) {
                                            org.telegram.messenger.at.e().b(le0Var22, 257);
                                        } else if (i15 == 2) {
                                            org.telegram.messenger.i0.D3(true);
                                            org.telegram.messenger.at.e().b(le0Var22, 257);
                                        } else if (i15 == 3) {
                                            org.telegram.messenger.i0.C3(true);
                                            org.telegram.messenger.at.e().b(le0Var22, 258);
                                            org.telegram.messenger.i0.g3(new org.telegram.ui.Components.voip.n0(9));
                                        }
                                        le0Var22.f39240e0 = true;
                                        if (i15 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    le0Var22.c(true);
                                                    gf0Var.D1(0, true, null, true);
                                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131752021, "CodeExpired"));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131750688, "FloodWait"));
                                                } else {
                                                    String L0 = org.telegram.messenger.dd.L0(2131746088, null);
                                                    StringBuilder sb2 = new StringBuilder();
                                                    org.telegram.messenger.a30.q("ErrorOccurred", 2131751106, sb2, "\n");
                                                    sb2.append(tL_error2.text);
                                                    gf0Var.u1(L0, sb2.toString());
                                                }
                                            } else {
                                                le0Var22.w();
                                                return;
                                            }
                                            int i16 = 0;
                                            while (true) {
                                                zr zrVar = le0Var22.f39241f;
                                                bs[] bsVarArr = zrVar.f44045f;
                                                if (i16 < bsVarArr.length) {
                                                    bsVarArr[i16].setText("");
                                                    i16++;
                                                } else {
                                                    zrVar.e = false;
                                                    bsVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i15 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                le0Var22.f39242f0 = false;
                                gf0 gf0Var2 = le0Var22.f39259u0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", le0Var22.d);
                                    bundle2.putString("phoneHash", le0Var22.f39237c);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    le0Var22.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    le0Var22.f39259u0.D1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    le0Var22.f39259u0.D1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

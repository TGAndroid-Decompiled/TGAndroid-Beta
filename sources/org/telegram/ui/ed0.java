package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ed0 implements RequestDelegate {
    public final int f36801a;
    public final kd0 f36802b;
    public final TLRPC.TL_auth_signIn f36803c;

    public ed0(kd0 kd0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f36801a = i10;
        this.f36802b = kd0Var;
        this.f36803c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36801a) {
            case 0:
                final kd0 kd0Var = this.f36802b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f36803c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kd0 kd0Var2 = kd0Var;
                        switch (i11) {
                            case 0:
                                int i12 = kd0Var2.f38840a;
                                org.telegram.ui.ActionBar.n0 n0Var = kd0Var2.f38843c;
                                gf0 gf0Var = kd0Var2.f38841a0;
                                gf0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    kd0Var2.R = false;
                                    gf0Var.E1(false, true);
                                    kd0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gf0Var.f37491q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", kd0Var2.G);
                                        bundle.putString("phoneHash", kd0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        gf0Var.D1(5, true, bundle, false);
                                    } else {
                                        gf0Var.x1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ed0(kd0Var2, tL_auth_signIn2, 1), 10);
                                    kd0Var2.q();
                                } else {
                                    kd0Var2.R = false;
                                    if (i12 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                kd0Var2.c(true);
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
                                            kd0Var2.r(false);
                                            n0Var.post(new id0(kd0Var2, 0));
                                            return;
                                        }
                                        n0Var.setText("");
                                        n0Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i12 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                kd0Var2.R = false;
                                gf0 gf0Var2 = kd0Var2.f38841a0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", kd0Var2.G);
                                    bundle2.putString("phoneHash", kd0Var2.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    gf0Var2.D1(6, true, bundle2, false);
                                    return;
                                }
                                gf0Var2.u1(org.telegram.messenger.dd.L0(2131746088, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final kd0 kd0Var2 = this.f36802b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f36803c;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        kd0 kd0Var22 = kd0Var2;
                        switch (i11) {
                            case 0:
                                int i12 = kd0Var22.f38840a;
                                org.telegram.ui.ActionBar.n0 n0Var = kd0Var22.f38843c;
                                gf0 gf0Var = kd0Var22.f38841a0;
                                gf0Var.t1(false, true);
                                if (tL_error2 == null) {
                                    kd0Var22.R = false;
                                    gf0Var.E1(false, true);
                                    kd0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            gf0Var.f37491q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", kd0Var22.G);
                                        bundle.putString("phoneHash", kd0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        gf0Var.D1(5, true, bundle, false);
                                    } else {
                                        gf0Var.x1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.k2) gf0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ed0(kd0Var22, tL_auth_signIn22, 1), 10);
                                    kd0Var22.q();
                                } else {
                                    kd0Var22.R = false;
                                    if (i12 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            gf0Var.u1(org.telegram.messenger.dd.L0(2131746088, null), org.telegram.messenger.dd.L0(2131749189, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                kd0Var22.c(true);
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
                                            kd0Var22.r(false);
                                            n0Var.post(new id0(kd0Var22, 0));
                                            return;
                                        }
                                        n0Var.setText("");
                                        n0Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i12 == 3) {
                                    org.telegram.messenger.i0.T();
                                    org.telegram.messenger.i0.C3(false);
                                    return;
                                }
                                return;
                            default:
                                kd0Var22.R = false;
                                gf0 gf0Var2 = kd0Var22.f38841a0;
                                gf0Var2.E1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.s4.w0(gf0Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131743846, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", kd0Var22.G);
                                    bundle2.putString("phoneHash", kd0Var22.H);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    gf0Var2.D1(6, true, bundle2, false);
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

package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ac0 implements RequestDelegate {
    public final int f43667a;
    public final gc0 f43668b;
    public final TLRPC.TL_auth_signIn f43669c;

    public ac0(gc0 gc0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f43667a = i7;
        this.f43668b = gc0Var;
        this.f43669c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f43667a) {
            case 0:
                final gc0 gc0Var = this.f43668b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f43669c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gc0 gc0Var2 = gc0Var;
                        switch (i10) {
                            case 0:
                                int i11 = gc0Var2.f45962a;
                                ah.i iVar = gc0Var2.f45965c;
                                ee0 ee0Var = gc0Var2.f45963a0;
                                ee0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    gc0Var2.R = false;
                                    ee0Var.N1(false, true);
                                    gc0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.f45389q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gc0Var2.G);
                                        bundle.putString("phoneHash", gc0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ee0Var.M1(5, true, bundle, false);
                                    } else {
                                        ee0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new ac0(gc0Var2, tL_auth_signIn2, 1), 10);
                                    gc0Var2.q();
                                } else {
                                    gc0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                gc0Var2.c(true);
                                                ee0Var.M1(0, true, null, true);
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ee0Var.D1(M0, sb2.toString());
                                            }
                                        } else {
                                            gc0Var2.r(false);
                                            iVar.post(new ec0(gc0Var2, 0));
                                            return;
                                        }
                                        iVar.setText("");
                                        iVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                gc0Var2.R = false;
                                ee0 ee0Var2 = gc0Var2.f45963a0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gc0Var2.G);
                                    bundle2.putString("phoneHash", gc0Var2.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    ee0Var2.M1(6, true, bundle2, false);
                                    return;
                                }
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final gc0 gc0Var2 = this.f43668b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f43669c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        gc0 gc0Var22 = gc0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = gc0Var22.f45962a;
                                ah.i iVar = gc0Var22.f45965c;
                                ee0 ee0Var = gc0Var22.f45963a0;
                                ee0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    gc0Var22.R = false;
                                    ee0Var.N1(false, true);
                                    gc0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ee0Var.f45389q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", gc0Var22.G);
                                        bundle.putString("phoneHash", gc0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ee0Var.M1(5, true, bundle, false);
                                    } else {
                                        ee0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) ee0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new ac0(gc0Var22, tL_auth_signIn22, 1), 10);
                                    gc0Var22.q();
                                } else {
                                    gc0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                gc0Var22.c(true);
                                                ee0Var.M1(0, true, null, true);
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ee0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                ee0Var.D1(M0, sb2.toString());
                                            }
                                        } else {
                                            gc0Var22.r(false);
                                            iVar.post(new ec0(gc0Var22, 0));
                                            return;
                                        }
                                        iVar.setText("");
                                        iVar.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    org.telegram.messenger.g0.T();
                                    org.telegram.messenger.g0.D3(false);
                                    return;
                                }
                                return;
                            default:
                                gc0Var22.R = false;
                                ee0 ee0Var2 = gc0Var22.f45963a0;
                                ee0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.v4.u0(ee0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", gc0Var22.G);
                                    bundle2.putString("phoneHash", gc0Var22.H);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    ee0Var2.M1(6, true, bundle2, false);
                                    return;
                                }
                                ee0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

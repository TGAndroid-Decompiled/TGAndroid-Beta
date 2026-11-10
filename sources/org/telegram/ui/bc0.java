package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bc0 implements RequestDelegate {
    public final int f44004a;
    public final hc0 f44005b;
    public final TLRPC.TL_auth_signIn f44006c;

    public bc0(hc0 hc0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i7) {
        this.f44004a = i7;
        this.f44005b = hc0Var;
        this.f44006c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f44004a) {
            case 0:
                final hc0 hc0Var = this.f44005b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f44006c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hc0 hc0Var2 = hc0Var;
                        switch (i10) {
                            case 0:
                                int i11 = hc0Var2.f46306a;
                                ah.i iVar = hc0Var2.f46309c;
                                fe0 fe0Var = hc0Var2.f46307a0;
                                fe0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    hc0Var2.R = false;
                                    fe0Var.N1(false, true);
                                    hc0Var2.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fe0Var.f45713q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hc0Var2.G);
                                        bundle.putString("phoneHash", hc0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        fe0Var.M1(5, true, bundle, false);
                                    } else {
                                        fe0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new bc0(hc0Var2, tL_auth_signIn2, 1), 10);
                                    hc0Var2.q();
                                } else {
                                    hc0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                hc0Var2.c(true);
                                                fe0Var.M1(0, true, null, true);
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                fe0Var.D1(M0, sb2.toString());
                                            }
                                        } else {
                                            hc0Var2.r(false);
                                            iVar.post(new fc0(hc0Var2, 0));
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
                                hc0Var2.R = false;
                                fe0 fe0Var2 = hc0Var2.f46307a0;
                                fe0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", hc0Var2.G);
                                    bundle2.putString("phoneHash", hc0Var2.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    fe0Var2.M1(6, true, bundle2, false);
                                    return;
                                }
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final hc0 hc0Var2 = this.f44005b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f44006c;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        int i10 = r5;
                        TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        hc0 hc0Var22 = hc0Var2;
                        switch (i10) {
                            case 0:
                                int i11 = hc0Var22.f46306a;
                                ah.i iVar = hc0Var22.f46309c;
                                fe0 fe0Var = hc0Var22.f46307a0;
                                fe0Var.C1(false, true);
                                if (tL_error2 == null) {
                                    hc0Var22.R = false;
                                    fe0Var.N1(false, true);
                                    hc0Var22.q();
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            fe0Var.f45713q0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", hc0Var22.G);
                                        bundle.putString("phoneHash", hc0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        fe0Var.M1(5, true, bundle, false);
                                    } else {
                                        fe0Var.G1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i7 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                                    ConnectionsManager.getInstance(i7).sendRequest(getpassword, new bc0(hc0Var22, tL_auth_signIn22, 1), 10);
                                    hc0Var22.q();
                                } else {
                                    hc0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131749179, "InvalidPhoneNumber"));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                hc0Var22.c(true);
                                                fe0Var.M1(0, true, null, true);
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131752021, "CodeExpired"));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                fe0Var.D1(org.telegram.messenger.id.M0(2131746071, null), org.telegram.messenger.id.M0(2131750687, "FloodWait"));
                                            } else {
                                                String M0 = org.telegram.messenger.id.M0(2131746071, null);
                                                StringBuilder sb2 = new StringBuilder();
                                                org.telegram.messenger.camera.q.q("ErrorOccurred", 2131751105, sb2, "\n");
                                                sb2.append(tL_error2.text);
                                                fe0Var.D1(M0, sb2.toString());
                                            }
                                        } else {
                                            hc0Var22.r(false);
                                            iVar.post(new fc0(hc0Var22, 0));
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
                                hc0Var22.R = false;
                                fe0 fe0Var2 = hc0Var22.f46307a0;
                                fe0Var2.N1(false, true);
                                if (tL_error2 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject2;
                                    if (!TwoStepVerificationActivity.n0(password, true)) {
                                        org.telegram.ui.Components.u4.u0(fe0Var2.getParentActivity(), org.telegram.messenger.id.M0(2131743820, "UpdateAppAlert"), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.f(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", hc0Var22.G);
                                    bundle2.putString("phoneHash", hc0Var22.H);
                                    bundle2.putString("code", tL_auth_signIn22.phone_code);
                                    fe0Var2.M1(6, true, bundle2, false);
                                    return;
                                }
                                fe0Var2.D1(org.telegram.messenger.id.M0(2131746071, null), tL_error2.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

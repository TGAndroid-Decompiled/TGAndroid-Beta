package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ne0 implements RequestDelegate {
    public final int f35973a;
    public final ue0 f35974b;
    public final TLRPC.TL_auth_signIn f35975c;

    public ne0(ue0 ue0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f35973a = i10;
        this.f35974b = ue0Var;
        this.f35975c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35973a) {
            case 0:
                final ue0 ue0Var = this.f35974b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f35975c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ue0 ue0Var2 = ue0Var;
                                int i11 = ue0Var2.f38228a;
                                ci.h2 h2Var = ue0Var2.f38231c;
                                tg0 tg0Var = ue0Var2.f38229a0;
                                tg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    ue0Var2.R = false;
                                    tg0Var.v1(false, true);
                                    ue0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            tg0Var.f37803p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ue0Var2.G);
                                        bundle.putString("phoneHash", ue0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        tg0Var.u1(5, true, bundle, false);
                                    } else {
                                        tg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ne0(ue0Var2, tL_auth_signIn2, 1), 10);
                                    ue0Var2.r();
                                } else {
                                    ue0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ue0Var2.c(true);
                                                tg0Var.u1(0, true, null, true);
                                                tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                tg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ue0Var2.s(false);
                                            h2Var.post(new re0(ue0Var2, 0));
                                            return;
                                        }
                                        h2Var.setText("");
                                        h2Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                ue0 ue0Var3 = ue0Var;
                                ue0Var3.R = false;
                                tg0 tg0Var2 = ue0Var3.f38229a0;
                                tg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(tg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ue0Var3.G);
                                    bundle2.putString("phoneHash", ue0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    tg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ue0 ue0Var2 = this.f35974b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f35975c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ue0 ue0Var22 = ue0Var2;
                                int i11 = ue0Var22.f38228a;
                                ci.h2 h2Var = ue0Var22.f38231c;
                                tg0 tg0Var = ue0Var22.f38229a0;
                                tg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    ue0Var22.R = false;
                                    tg0Var.v1(false, true);
                                    ue0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            tg0Var.f37803p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ue0Var22.G);
                                        bundle.putString("phoneHash", ue0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        tg0Var.u1(5, true, bundle, false);
                                    } else {
                                        tg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) tg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ne0(ue0Var22, tL_auth_signIn22, 1), 10);
                                    ue0Var22.r();
                                } else {
                                    ue0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ue0Var22.c(true);
                                                tg0Var.u1(0, true, null, true);
                                                tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                tg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                tg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ue0Var22.s(false);
                                            h2Var.post(new re0(ue0Var22, 0));
                                            return;
                                        }
                                        h2Var.setText("");
                                        h2Var.requestFocus();
                                        return;
                                    }
                                    return;
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                ue0 ue0Var3 = ue0Var2;
                                ue0Var3.R = false;
                                tg0 tg0Var2 = ue0Var3.f38229a0;
                                tg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(tg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ue0Var3.G);
                                    bundle2.putString("phoneHash", ue0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    tg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                tg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

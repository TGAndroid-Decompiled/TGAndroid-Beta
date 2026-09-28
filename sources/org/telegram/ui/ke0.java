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
public final class ke0 implements RequestDelegate {
    public final int f35042a;
    public final re0 f35043b;
    public final TLRPC.TL_auth_signIn f35044c;

    public ke0(re0 re0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f35042a = i10;
        this.f35043b = re0Var;
        this.f35044c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35042a) {
            case 0:
                final re0 re0Var = this.f35043b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f35044c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                re0 re0Var2 = re0Var;
                                int i11 = re0Var2.f37310a;
                                ci.h2 h2Var = re0Var2.f37313c;
                                qg0 qg0Var = re0Var2.f37311a0;
                                qg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    re0Var2.R = false;
                                    qg0Var.v1(false, true);
                                    re0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qg0Var.f36904p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", re0Var2.G);
                                        bundle.putString("phoneHash", re0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        qg0Var.u1(5, true, bundle, false);
                                    } else {
                                        qg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(re0Var2, tL_auth_signIn2, 1), 10);
                                    re0Var2.r();
                                } else {
                                    re0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                re0Var2.c(true);
                                                qg0Var.u1(0, true, null, true);
                                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                qg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            re0Var2.s(false);
                                            h2Var.post(new oe0(re0Var2, 0));
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
                                re0 re0Var3 = re0Var;
                                re0Var3.R = false;
                                qg0 qg0Var2 = re0Var3.f37311a0;
                                qg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(qg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", re0Var3.G);
                                    bundle2.putString("phoneHash", re0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    qg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final re0 re0Var2 = this.f35043b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f35044c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                re0 re0Var22 = re0Var2;
                                int i11 = re0Var22.f37310a;
                                ci.h2 h2Var = re0Var22.f37313c;
                                qg0 qg0Var = re0Var22.f37311a0;
                                qg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    re0Var22.R = false;
                                    qg0Var.v1(false, true);
                                    re0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            qg0Var.f36904p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", re0Var22.G);
                                        bundle.putString("phoneHash", re0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        qg0Var.u1(5, true, bundle, false);
                                    } else {
                                        qg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) qg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ke0(re0Var22, tL_auth_signIn22, 1), 10);
                                    re0Var22.r();
                                } else {
                                    re0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                re0Var22.c(true);
                                                qg0Var.u1(0, true, null, true);
                                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                qg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                qg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            re0Var22.s(false);
                                            h2Var.post(new oe0(re0Var22, 0));
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
                                re0 re0Var3 = re0Var2;
                                re0Var3.R = false;
                                qg0 qg0Var2 = re0Var3.f37311a0;
                                qg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.e5.x0(qg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", re0Var3.G);
                                    bundle2.putString("phoneHash", re0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    qg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                qg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

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
public final class qe0 implements RequestDelegate {
    public final int f36036a;
    public final xe0 f36037b;
    public final TLRPC.TL_auth_signIn f36038c;

    public qe0(xe0 xe0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f36036a = i10;
        this.f36037b = xe0Var;
        this.f36038c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36036a) {
            case 0:
                final xe0 xe0Var = this.f36037b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f36038c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                xe0 xe0Var2 = xe0Var;
                                int i11 = xe0Var2.f38683a;
                                bi.t2 t2Var = xe0Var2.f38686c;
                                xg0 xg0Var = xe0Var2.f38684a0;
                                xg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    xe0Var2.R = false;
                                    xg0Var.v1(false, true);
                                    xe0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xg0Var.f38736p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", xe0Var2.G);
                                        bundle.putString("phoneHash", xe0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        xg0Var.u1(5, true, bundle, false);
                                    } else {
                                        xg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qe0(xe0Var2, tL_auth_signIn2, 1), 10);
                                    xe0Var2.r();
                                } else {
                                    xe0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                xe0Var2.c(true);
                                                xg0Var.u1(0, true, null, true);
                                                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                xg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            xe0Var2.s(false);
                                            t2Var.post(new ue0(xe0Var2, 0));
                                            return;
                                        }
                                        t2Var.setText("");
                                        t2Var.requestFocus();
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
                                xe0 xe0Var3 = xe0Var;
                                xe0Var3.R = false;
                                xg0 xg0Var2 = xe0Var3.f38684a0;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", xe0Var3.G);
                                    bundle2.putString("phoneHash", xe0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    xg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final xe0 xe0Var2 = this.f36037b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f36038c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                xe0 xe0Var22 = xe0Var2;
                                int i11 = xe0Var22.f38683a;
                                bi.t2 t2Var = xe0Var22.f38686c;
                                xg0 xg0Var = xe0Var22.f38684a0;
                                xg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    xe0Var22.R = false;
                                    xg0Var.v1(false, true);
                                    xe0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            xg0Var.f38736p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", xe0Var22.G);
                                        bundle.putString("phoneHash", xe0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        xg0Var.u1(5, true, bundle, false);
                                    } else {
                                        xg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) xg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new qe0(xe0Var22, tL_auth_signIn22, 1), 10);
                                    xe0Var22.r();
                                } else {
                                    xe0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                xe0Var22.c(true);
                                                xg0Var.u1(0, true, null, true);
                                                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                xg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                xg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            xe0Var22.s(false);
                                            t2Var.post(new ue0(xe0Var22, 0));
                                            return;
                                        }
                                        t2Var.setText("");
                                        t2Var.requestFocus();
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
                                xe0 xe0Var3 = xe0Var2;
                                xe0Var3.R = false;
                                xg0 xg0Var2 = xe0Var3.f38684a0;
                                xg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.d5.x0(xg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", xe0Var3.G);
                                    bundle2.putString("phoneHash", xe0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    xg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                xg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

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
public final class oe0 implements RequestDelegate {
    public final int f40557a;
    public final ve0 f40558b;
    public final TLRPC.TL_auth_signIn f40559c;

    public oe0(ve0 ve0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f40557a = i10;
        this.f40558b = ve0Var;
        this.f40559c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40557a) {
            case 0:
                final ve0 ve0Var = this.f40558b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f40559c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ve0 ve0Var2 = ve0Var;
                                int i11 = ve0Var2.f43022a;
                                ci.g2 g2Var = ve0Var2.f43025c;
                                vg0 vg0Var = ve0Var2.f43023a0;
                                vg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    ve0Var2.R = false;
                                    vg0Var.v1(false, true);
                                    ve0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            vg0Var.f43065p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ve0Var2.G);
                                        bundle.putString("phoneHash", ve0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        vg0Var.u1(5, true, bundle, false);
                                    } else {
                                        vg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new oe0(ve0Var2, tL_auth_signIn2, 1), 10);
                                    ve0Var2.r();
                                } else {
                                    ve0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ve0Var2.c(true);
                                                vg0Var.u1(0, true, null, true);
                                                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                vg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ve0Var2.s(false);
                                            g2Var.post(new se0(ve0Var2, 0));
                                            return;
                                        }
                                        g2Var.setText("");
                                        g2Var.requestFocus();
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
                                ve0 ve0Var3 = ve0Var;
                                ve0Var3.R = false;
                                vg0 vg0Var2 = ve0Var3.f43023a0;
                                vg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ve0Var3.G);
                                    bundle2.putString("phoneHash", ve0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    vg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ve0 ve0Var2 = this.f40558b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f40559c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ve0 ve0Var22 = ve0Var2;
                                int i11 = ve0Var22.f43022a;
                                ci.g2 g2Var = ve0Var22.f43025c;
                                vg0 vg0Var = ve0Var22.f43023a0;
                                vg0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    ve0Var22.R = false;
                                    vg0Var.v1(false, true);
                                    ve0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            vg0Var.f43065p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ve0Var22.G);
                                        bundle.putString("phoneHash", ve0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        vg0Var.u1(5, true, bundle, false);
                                    } else {
                                        vg0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new oe0(ve0Var22, tL_auth_signIn22, 1), 10);
                                    ve0Var22.r();
                                } else {
                                    ve0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ve0Var22.c(true);
                                                vg0Var.u1(0, true, null, true);
                                                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                vg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ve0Var22.s(false);
                                            g2Var.post(new se0(ve0Var22, 0));
                                            return;
                                        }
                                        g2Var.setText("");
                                        g2Var.requestFocus();
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
                                ve0 ve0Var3 = ve0Var2;
                                ve0Var3.R = false;
                                vg0 vg0Var2 = ve0Var3.f43023a0;
                                vg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ve0Var3.G);
                                    bundle2.putString("phoneHash", ve0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    vg0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

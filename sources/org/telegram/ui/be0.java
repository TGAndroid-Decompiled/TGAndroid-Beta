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
public final class be0 implements RequestDelegate {
    public final int f36055a;
    public final ie0 f36056b;
    public final TLRPC.TL_auth_signIn f36057c;

    public be0(ie0 ie0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f36055a = i10;
        this.f36056b = ie0Var;
        this.f36057c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36055a) {
            case 0:
                final ie0 ie0Var = this.f36056b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f36057c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ie0 ie0Var2 = ie0Var;
                                int i11 = ie0Var2.f38265a;
                                ei.e2 e2Var = ie0Var2.f38268c;
                                hg0 hg0Var = ie0Var2.f38266a0;
                                hg0Var.o1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    ie0Var2.R = false;
                                    hg0Var.z1(false, true);
                                    ie0Var2.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            hg0Var.f37852p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ie0Var2.G);
                                        bundle.putString("phoneHash", ie0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        hg0Var.y1(5, true, bundle, false);
                                    } else {
                                        hg0Var.s1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new be0(ie0Var2, tL_auth_signIn2, 1), 10);
                                    ie0Var2.q();
                                } else {
                                    ie0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ie0Var2.c(true);
                                                hg0Var.y1(0, true, null, true);
                                                hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                hg0Var.p1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ie0Var2.r(false);
                                            e2Var.post(new fe0(ie0Var2, 0));
                                            return;
                                        }
                                        e2Var.setText("");
                                        e2Var.requestFocus();
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
                                ie0 ie0Var3 = ie0Var;
                                ie0Var3.R = false;
                                hg0 hg0Var2 = ie0Var3.f38266a0;
                                hg0Var2.z1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.d5.w0(hg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ie0Var3.G);
                                    bundle2.putString("phoneHash", ie0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    hg0Var2.y1(6, true, bundle2, false);
                                    return;
                                }
                                hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final ie0 ie0Var2 = this.f36056b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f36057c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                ie0 ie0Var22 = ie0Var2;
                                int i11 = ie0Var22.f38265a;
                                ei.e2 e2Var = ie0Var22.f38268c;
                                hg0 hg0Var = ie0Var22.f38266a0;
                                hg0Var.o1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    ie0Var22.R = false;
                                    hg0Var.z1(false, true);
                                    ie0Var22.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            hg0Var.f37852p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", ie0Var22.G);
                                        bundle.putString("phoneHash", ie0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        hg0Var.y1(5, true, bundle, false);
                                    } else {
                                        hg0Var.s1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) hg0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new be0(ie0Var22, tL_auth_signIn22, 1), 10);
                                    ie0Var22.q();
                                } else {
                                    ie0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                ie0Var22.c(true);
                                                hg0Var.y1(0, true, null, true);
                                                hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                hg0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                hg0Var.p1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            ie0Var22.r(false);
                                            e2Var.post(new fe0(ie0Var22, 0));
                                            return;
                                        }
                                        e2Var.setText("");
                                        e2Var.requestFocus();
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
                                ie0 ie0Var3 = ie0Var2;
                                ie0Var3.R = false;
                                hg0 hg0Var2 = ie0Var3.f38266a0;
                                hg0Var2.z1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.d5.w0(hg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", ie0Var3.G);
                                    bundle2.putString("phoneHash", ie0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    hg0Var2.y1(6, true, bundle2, false);
                                    return;
                                }
                                hg0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

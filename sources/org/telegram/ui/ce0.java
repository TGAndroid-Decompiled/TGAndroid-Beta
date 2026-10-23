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
public final class ce0 implements RequestDelegate {
    public final int f36343a;
    public final je0 f36344b;
    public final TLRPC.TL_auth_signIn f36345c;

    public ce0(je0 je0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f36343a = i10;
        this.f36344b = je0Var;
        this.f36345c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36343a) {
            case 0:
                final je0 je0Var = this.f36344b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f36345c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                je0 je0Var2 = je0Var;
                                int i11 = je0Var2.f38539a;
                                ei.e2 e2Var = je0Var2.f38542c;
                                ig0 ig0Var = je0Var2.f38540a0;
                                ig0Var.o1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    je0Var2.R = false;
                                    ig0Var.z1(false, true);
                                    je0Var2.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f38211p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", je0Var2.G);
                                        bundle.putString("phoneHash", je0Var2.H);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ig0Var.y1(5, true, bundle, false);
                                    } else {
                                        ig0Var.s1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ce0(je0Var2, tL_auth_signIn2, 1), 10);
                                    je0Var2.q();
                                } else {
                                    je0Var2.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                je0Var2.c(true);
                                                ig0Var.y1(0, true, null, true);
                                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                ig0Var.p1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            je0Var2.r(false);
                                            e2Var.post(new ge0(je0Var2, 0));
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
                                je0 je0Var3 = je0Var;
                                je0Var3.R = false;
                                ig0 ig0Var2 = je0Var3.f38540a0;
                                ig0Var2.z1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", je0Var3.G);
                                    bundle2.putString("phoneHash", je0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    ig0Var2.y1(6, true, bundle2, false);
                                    return;
                                }
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final je0 je0Var2 = this.f36344b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f36345c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                je0 je0Var22 = je0Var2;
                                int i11 = je0Var22.f38539a;
                                ei.e2 e2Var = je0Var22.f38542c;
                                ig0 ig0Var = je0Var22.f38540a0;
                                ig0Var.o1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    je0Var22.R = false;
                                    ig0Var.z1(false, true);
                                    je0Var22.q();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f38211p0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", je0Var22.G);
                                        bundle.putString("phoneHash", je0Var22.H);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ig0Var.y1(5, true, bundle, false);
                                    } else {
                                        ig0Var.s1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ce0(je0Var22, tL_auth_signIn22, 1), 10);
                                    je0Var22.q();
                                } else {
                                    je0Var22.R = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                je0Var22.c(true);
                                                ig0Var.y1(0, true, null, true);
                                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                ig0Var.p1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            je0Var22.r(false);
                                            e2Var.post(new ge0(je0Var22, 0));
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
                                je0 je0Var3 = je0Var2;
                                je0Var3.R = false;
                                ig0 ig0Var2 = je0Var3.f38540a0;
                                ig0Var2.z1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", je0Var3.G);
                                    bundle2.putString("phoneHash", je0Var3.H);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    ig0Var2.y1(6, true, bundle2, false);
                                    return;
                                }
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

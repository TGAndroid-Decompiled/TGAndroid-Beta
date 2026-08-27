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

    public final int f37062a;

    public final je0 f37063b;

    public final TLRPC.TL_auth_signIn f37064c;

    public ce0(je0 je0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f37062a = i10;
        this.f37063b = je0Var;
        this.f37064c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37062a) {
            case 0:
                final int i10 = 0;
                final je0 je0Var = this.f37063b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f37064c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                je0 je0Var2 = je0Var;
                                int i11 = je0Var2.f39350a;
                                gg.g gVar = je0Var2.f39352c;
                                ig0 ig0Var = je0Var2.T;
                                ig0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        je0Var2.N = false;
                                        if (i11 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                je0Var2.s(false);
                                                gVar.post(new ge0(je0Var2, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                je0Var2.c(true);
                                                ig0Var.u1(0, true, null, true);
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            gVar.setText("");
                                            gVar.requestFocus();
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new ce0(je0Var2, tL_auth_signIn2, 1), 10);
                                        je0Var2.r();
                                    }
                                    break;
                                } else {
                                    je0Var2.N = false;
                                    ig0Var.v1(false, true);
                                    je0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f39095l0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", je0Var2.C);
                                        bundle.putString("phoneHash", je0Var2.D);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ig0Var.u1(5, true, bundle, false);
                                    } else {
                                        ig0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i11 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                je0 je0Var3 = je0Var;
                                je0Var3.N = false;
                                ig0 ig0Var2 = je0Var3.T;
                                ig0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", je0Var3.C);
                                        bundle2.putString("phoneHash", je0Var3.D);
                                        bundle2.putString("code", tL_auth_signIn.phone_code);
                                        ig0Var2.u1(6, true, bundle2, false);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final je0 je0Var2 = this.f37063b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f37064c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                je0 je0Var3 = je0Var2;
                                int i12 = je0Var3.f39350a;
                                gg.g gVar = je0Var3.f39352c;
                                ig0 ig0Var = je0Var3.T;
                                ig0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn3 = tL_auth_signIn2;
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                        je0Var3.N = false;
                                        if (i12 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (tL_error2.text.contains("PHONE_CODE_EMPTY") || tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                je0Var3.s(false);
                                                gVar.post(new ge0(je0Var3, 0));
                                                break;
                                            } else if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                je0Var3.c(true);
                                                ig0Var.u1(0, true, null, true);
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                ig0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                            gVar.setText("");
                                            gVar.requestFocus();
                                        }
                                    } else {
                                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new ce0(je0Var3, tL_auth_signIn3, 1), 10);
                                        je0Var3.r();
                                    }
                                    break;
                                } else {
                                    je0Var3.N = false;
                                    ig0Var.v1(false, true);
                                    je0Var3.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f39095l0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", je0Var3.C);
                                        bundle.putString("phoneHash", je0Var3.D);
                                        bundle.putString("code", tL_auth_signIn3.phone_code);
                                        ig0Var.u1(5, true, bundle, false);
                                    } else {
                                        ig0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                }
                                if (i12 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                }
                                break;
                            default:
                                je0 je0Var4 = je0Var2;
                                je0Var4.N = false;
                                ig0 ig0Var2 = je0Var4.T;
                                ig0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 != null) {
                                    ig0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                } else {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.y4.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                    } else {
                                        Bundle bundle2 = new Bundle();
                                        SerializedData serializedData = new SerializedData(password.getObjectSize());
                                        password.serializeToStream(serializedData);
                                        bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                        bundle2.putString("phoneFormated", je0Var4.C);
                                        bundle2.putString("phoneHash", je0Var4.D);
                                        bundle2.putString("code", tL_auth_signIn2.phone_code);
                                        ig0Var2.u1(6, true, bundle2, false);
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}

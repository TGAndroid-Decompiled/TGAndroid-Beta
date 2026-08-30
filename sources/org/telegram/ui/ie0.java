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
public final class ie0 implements RequestDelegate {
    public final int f35103a;
    public final pe0 f35104b;
    public final TLRPC.TL_auth_signIn f35105c;

    public ie0(pe0 pe0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f35103a = i10;
        this.f35104b = pe0Var;
        this.f35105c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35103a) {
            case 0:
                final pe0 pe0Var = this.f35104b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f35105c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                pe0 pe0Var2 = pe0Var;
                                int i11 = pe0Var2.f37286a;
                                kg.f fVar = pe0Var2.f37288c;
                                ng0 ng0Var = pe0Var2.U;
                                ng0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    pe0Var2.O = false;
                                    ng0Var.v1(false, true);
                                    pe0Var2.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ng0Var.m0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", pe0Var2.D);
                                        bundle.putString("phoneHash", pe0Var2.E);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        ng0Var.u1(5, true, bundle, false);
                                    } else {
                                        ng0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ie0(pe0Var2, tL_auth_signIn2, 1), 10);
                                    pe0Var2.r();
                                } else {
                                    pe0Var2.O = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                pe0Var2.c(true);
                                                ng0Var.u1(0, true, null, true);
                                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                ng0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            pe0Var2.s(false);
                                            fVar.post(new me0(pe0Var2, 0));
                                            return;
                                        }
                                        fVar.setText("");
                                        fVar.requestFocus();
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
                                pe0 pe0Var3 = pe0Var;
                                pe0Var3.O = false;
                                ng0 ng0Var2 = pe0Var3.U;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", pe0Var3.D);
                                    bundle2.putString("phoneHash", pe0Var3.E);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    ng0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final pe0 pe0Var2 = this.f35104b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f35105c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        switch (r5) {
                            case 0:
                                pe0 pe0Var22 = pe0Var2;
                                int i11 = pe0Var22.f37286a;
                                kg.f fVar = pe0Var22.f37288c;
                                ng0 ng0Var = pe0Var22.U;
                                ng0Var.k1(false, true);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    pe0Var22.O = false;
                                    ng0Var.v1(false, true);
                                    pe0Var22.r();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ng0Var.m0 = tL_help_termsOfService;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", pe0Var22.D);
                                        bundle.putString("phoneHash", pe0Var22.E);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        ng0Var.u1(5, true, bundle, false);
                                    } else {
                                        ng0Var.o1((TLRPC.TL_auth_authorization) tLObject2, false);
                                    }
                                } else if (tL_error2.text.contains("SESSION_PASSWORD_NEEDED")) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new ie0(pe0Var22, tL_auth_signIn22, 1), 10);
                                    pe0Var22.r();
                                } else {
                                    pe0Var22.O = false;
                                    if (i11 != 3) {
                                        if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                            ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                        } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                            if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                pe0Var22.c(true);
                                                ng0Var.u1(0, true, null, true);
                                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                            } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                            } else {
                                                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                ng0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                            }
                                        } else {
                                            pe0Var22.s(false);
                                            fVar.post(new me0(pe0Var22, 0));
                                            return;
                                        }
                                        fVar.setText("");
                                        fVar.requestFocus();
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
                                pe0 pe0Var3 = pe0Var2;
                                pe0Var3.O = false;
                                ng0 ng0Var2 = pe0Var3.U;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", pe0Var3.D);
                                    bundle2.putString("phoneHash", pe0Var3.E);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    ng0Var2.u1(6, true, bundle2, false);
                                    return;
                                }
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

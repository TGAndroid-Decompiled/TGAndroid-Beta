package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gf0 implements RequestDelegate {
    public final int f37183a;
    public final sf0 f37184b;
    public final TLRPC.TL_auth_signIn f37185c;

    public gf0(sf0 sf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f37183a = i10;
        this.f37184b = sf0Var;
        this.f37185c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f37183a) {
            case 0:
                final sf0 sf0Var = this.f37184b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f37185c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final sf0 sf0Var2 = sf0Var;
                                int i14 = sf0Var2.f41256c0;
                                og0 og0Var = sf0Var2.f41271p0;
                                sf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    sf0Var2.f41252a0 = false;
                                    og0Var.v1(false, true);
                                    sf0Var2.w();
                                    sf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            og0Var.m0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", sf0Var2.d);
                                        bundle.putString("phoneHash", sf0Var2.f41255c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        sf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        sf0Var2.f41271p0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        sf0Var2.f41271p0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        sf0Var2.q(new he0(6, sf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    sf0Var2.f41254b0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new gf0(sf0Var2, tL_auth_signIn2, 1), 10);
                                        sf0Var2.w();
                                        sf0Var2.v();
                                    } else {
                                        sf0Var2.f41252a0 = false;
                                        og0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = sf0Var2.f41257d0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = sf0Var2.f41257d0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = sf0Var2.f41257d0) == 2 || i10 == 17 || i10 == 16)))) {
                                            sf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(sf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(sf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(sf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(27));
                                        }
                                        sf0Var2.W = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    sf0Var2.c(true);
                                                    og0Var.u1(0, true, null, true);
                                                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    og0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                sf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                zr zrVar = sf0Var2.f41260f;
                                                cs[] csVarArr = zrVar.f43982f;
                                                if (i15 < csVarArr.length) {
                                                    csVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    zrVar.f43981e = false;
                                                    csVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final sf0 sf0Var3 = sf0Var;
                                sf0Var3.f41252a0 = false;
                                og0 og0Var2 = sf0Var3.f41271p0;
                                og0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", sf0Var3.d);
                                    bundle2.putString("phoneHash", sf0Var3.f41255c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    sf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    sf0Var3.f41271p0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    sf0Var3.f41271p0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final sf0 sf0Var2 = this.f37184b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f37185c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final sf0 sf0Var22 = sf0Var2;
                                int i14 = sf0Var22.f41256c0;
                                og0 og0Var = sf0Var22.f41271p0;
                                sf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    sf0Var22.f41252a0 = false;
                                    og0Var.v1(false, true);
                                    sf0Var22.w();
                                    sf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            og0Var.m0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", sf0Var22.d);
                                        bundle.putString("phoneHash", sf0Var22.f41255c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        sf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        sf0Var22.f41271p0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        sf0Var22.f41271p0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        sf0Var22.q(new he0(6, sf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    sf0Var22.f41254b0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.p2) og0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new gf0(sf0Var22, tL_auth_signIn22, 1), 10);
                                        sf0Var22.w();
                                        sf0Var22.v();
                                    } else {
                                        sf0Var22.f41252a0 = false;
                                        og0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = sf0Var22.f41257d0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = sf0Var22.f41257d0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = sf0Var22.f41257d0) == 2 || i10 == 17 || i10 == 16)))) {
                                            sf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(sf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(sf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(sf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jc(27));
                                        }
                                        sf0Var22.W = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    sf0Var22.c(true);
                                                    og0Var.u1(0, true, null, true);
                                                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    og0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    og0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                sf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                zr zrVar = sf0Var22.f41260f;
                                                cs[] csVarArr = zrVar.f43982f;
                                                if (i15 < csVarArr.length) {
                                                    csVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    zrVar.f43981e = false;
                                                    csVarArr[0].requestFocus();
                                                    return;
                                                }
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (i14 == 3) {
                                    AndroidUtilities.endIncomingCall();
                                    AndroidUtilities.setWaitingForCall(false);
                                    return;
                                }
                                return;
                            default:
                                final sf0 sf0Var3 = sf0Var2;
                                sf0Var3.f41252a0 = false;
                                og0 og0Var2 = sf0Var3.f41271p0;
                                og0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(og0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", sf0Var3.d);
                                    bundle2.putString("phoneHash", sf0Var3.f41255c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    sf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    sf0Var3.f41271p0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    sf0Var3.f41271p0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                og0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

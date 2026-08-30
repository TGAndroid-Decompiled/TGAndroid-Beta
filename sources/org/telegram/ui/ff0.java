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
public final class ff0 implements RequestDelegate {
    public final int f34243a;
    public final rf0 f34244b;
    public final TLRPC.TL_auth_signIn f34245c;

    public ff0(rf0 rf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f34243a = i10;
        this.f34244b = rf0Var;
        this.f34245c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f34243a) {
            case 0:
                final rf0 rf0Var = this.f34244b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f34245c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final rf0 rf0Var2 = rf0Var;
                                int i14 = rf0Var2.f38020c0;
                                ng0 ng0Var = rf0Var2.f38034p0;
                                rf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    rf0Var2.f38016a0 = false;
                                    ng0Var.v1(false, true);
                                    rf0Var2.w();
                                    rf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ng0Var.m0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", rf0Var2.d);
                                        bundle.putString("phoneHash", rf0Var2.f38019c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        rf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        rf0Var2.f38034p0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        rf0Var2.f38034p0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        rf0Var2.q(new fe0(7, rf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    rf0Var2.f38018b0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ff0(rf0Var2, tL_auth_signIn2, 1), 10);
                                        rf0Var2.w();
                                        rf0Var2.v();
                                    } else {
                                        rf0Var2.f38016a0 = false;
                                        ng0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = rf0Var2.f38021d0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = rf0Var2.f38021d0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = rf0Var2.f38021d0) == 2 || i10 == 17 || i10 == 16)))) {
                                            rf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(rf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(rf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(rf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(25));
                                        }
                                        rf0Var2.W = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    rf0Var2.c(true);
                                                    ng0Var.u1(0, true, null, true);
                                                    ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    ng0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                rf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                yr yrVar = rf0Var2.f38023f;
                                                bs[] bsVarArr = yrVar.f40565f;
                                                if (i15 < bsVarArr.length) {
                                                    bsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    yrVar.e = false;
                                                    bsVarArr[0].requestFocus();
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
                                final rf0 rf0Var3 = rf0Var;
                                rf0Var3.f38016a0 = false;
                                ng0 ng0Var2 = rf0Var3.f38034p0;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", rf0Var3.d);
                                    bundle2.putString("phoneHash", rf0Var3.f38019c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    rf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    rf0Var3.f38034p0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    rf0Var3.f38034p0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ng0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final rf0 rf0Var2 = this.f34244b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f34245c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final rf0 rf0Var22 = rf0Var2;
                                int i14 = rf0Var22.f38020c0;
                                ng0 ng0Var = rf0Var22.f38034p0;
                                rf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    rf0Var22.f38016a0 = false;
                                    ng0Var.v1(false, true);
                                    rf0Var22.w();
                                    rf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ng0Var.m0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", rf0Var22.d);
                                        bundle.putString("phoneHash", rf0Var22.f38019c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        rf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        rf0Var22.f38034p0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        rf0Var22.f38034p0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        rf0Var22.q(new fe0(7, rf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    rf0Var22.f38018b0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.p2) ng0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new ff0(rf0Var22, tL_auth_signIn22, 1), 10);
                                        rf0Var22.w();
                                        rf0Var22.v();
                                    } else {
                                        rf0Var22.f38016a0 = false;
                                        ng0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = rf0Var22.f38021d0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = rf0Var22.f38021d0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = rf0Var22.f38021d0) == 2 || i10 == 17 || i10 == 16)))) {
                                            rf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(rf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(rf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(rf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mc(25));
                                        }
                                        rf0Var22.W = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    rf0Var22.c(true);
                                                    ng0Var.u1(0, true, null, true);
                                                    ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ng0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    ng0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                rf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                yr yrVar = rf0Var22.f38023f;
                                                bs[] bsVarArr = yrVar.f40565f;
                                                if (i15 < bsVarArr.length) {
                                                    bsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    yrVar.e = false;
                                                    bsVarArr[0].requestFocus();
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
                                final rf0 rf0Var3 = rf0Var2;
                                rf0Var3.f38016a0 = false;
                                ng0 ng0Var2 = rf0Var3.f38034p0;
                                ng0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.z4.x0(ng0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", rf0Var3.d);
                                    bundle2.putString("phoneHash", rf0Var3.f38019c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    rf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    rf0Var3.f38034p0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    rf0Var3.f38034p0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
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

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
public final class lf0 implements RequestDelegate {
    public final int f39651a;
    public final yf0 f39652b;
    public final TLRPC.TL_auth_signIn f39653c;

    public lf0(yf0 yf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f39651a = i10;
        this.f39652b = yf0Var;
        this.f39653c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f39651a) {
            case 0:
                final yf0 yf0Var = this.f39652b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f39653c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final yf0 yf0Var2 = yf0Var;
                                int i14 = yf0Var2.f44367f0;
                                vg0 vg0Var = yf0Var2.f44382s0;
                                yf0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    yf0Var2.f44363d0 = false;
                                    vg0Var.v1(false, true);
                                    yf0Var2.w();
                                    yf0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            vg0Var.f43031p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", yf0Var2.d);
                                        bundle.putString("phoneHash", yf0Var2.f44361c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        yf0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        yf0Var2.f44382s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        yf0Var2.f44382s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        yf0Var2.q(new n70(29, yf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    yf0Var2.f44365e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new lf0(yf0Var2, tL_auth_signIn2, 1), 10);
                                        yf0Var2.w();
                                        yf0Var2.v();
                                    } else {
                                        yf0Var2.f44363d0 = false;
                                        vg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = yf0Var2.f44368g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = yf0Var2.f44368g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = yf0Var2.f44368g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            yf0Var2.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(yf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(yf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(yf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(24));
                                        }
                                        yf0Var2.f44362c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    yf0Var2.c(true);
                                                    vg0Var.u1(0, true, null, true);
                                                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                yf0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                bs bsVar = yf0Var2.f44366f;
                                                ds[] dsVarArr = bsVar.f36450f;
                                                if (i15 < dsVarArr.length) {
                                                    dsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    bsVar.f36449e = false;
                                                    dsVarArr[0].requestFocus();
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
                                final yf0 yf0Var3 = yf0Var;
                                yf0Var3.f44363d0 = false;
                                vg0 vg0Var2 = yf0Var3.f44382s0;
                                vg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", yf0Var3.d);
                                    bundle2.putString("phoneHash", yf0Var3.f44361c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    yf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    yf0Var3.f44382s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    yf0Var3.f44382s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                vg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final yf0 yf0Var2 = this.f39652b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f39653c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final yf0 yf0Var22 = yf0Var2;
                                int i14 = yf0Var22.f44367f0;
                                vg0 vg0Var = yf0Var22.f44382s0;
                                yf0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    yf0Var22.f44363d0 = false;
                                    vg0Var.v1(false, true);
                                    yf0Var22.w();
                                    yf0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            vg0Var.f43031p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", yf0Var22.d);
                                        bundle.putString("phoneHash", yf0Var22.f44361c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        yf0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        yf0Var22.f44382s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        yf0Var22.f44382s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        yf0Var22.q(new n70(29, yf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    yf0Var22.f44365e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.m2) vg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new lf0(yf0Var22, tL_auth_signIn22, 1), 10);
                                        yf0Var22.w();
                                        yf0Var22.v();
                                    } else {
                                        yf0Var22.f44363d0 = false;
                                        vg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = yf0Var22.f44368g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = yf0Var22.f44368g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = yf0Var22.f44368g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            yf0Var22.t();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(yf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(yf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(yf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vh(24));
                                        }
                                        yf0Var22.f44362c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    yf0Var22.c(true);
                                                    vg0Var.u1(0, true, null, true);
                                                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    vg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                yf0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                bs bsVar = yf0Var22.f44366f;
                                                ds[] dsVarArr = bsVar.f36450f;
                                                if (i15 < dsVarArr.length) {
                                                    dsVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    bsVar.f36449e = false;
                                                    dsVarArr[0].requestFocus();
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
                                final yf0 yf0Var3 = yf0Var2;
                                yf0Var3.f44363d0 = false;
                                vg0 vg0Var2 = yf0Var3.f44382s0;
                                vg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.g5.w0(vg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", yf0Var3.d);
                                    bundle2.putString("phoneHash", yf0Var3.f44361c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    yf0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    yf0Var3.f44382s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    yf0Var3.f44382s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
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

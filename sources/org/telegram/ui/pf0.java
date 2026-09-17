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
public final class pf0 implements RequestDelegate {
    public final int f36616a;
    public final bg0 f36617b;
    public final TLRPC.TL_auth_signIn f36618c;

    public pf0(bg0 bg0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f36616a = i10;
        this.f36617b = bg0Var;
        this.f36618c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f36616a) {
            case 0:
                final bg0 bg0Var = this.f36617b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f36618c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final bg0 bg0Var2 = bg0Var;
                                int i14 = bg0Var2.f32138f0;
                                yg0 yg0Var = bg0Var2.f32153s0;
                                bg0Var2.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    bg0Var2.f32135d0 = false;
                                    yg0Var.v1(false, true);
                                    bg0Var2.w();
                                    bg0Var2.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            yg0Var.f39902p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", bg0Var2.d);
                                        bundle.putString("phoneHash", bg0Var2.f32133c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        bg0Var2.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        bg0Var2.f32153s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        bg0Var2.f32153s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        bg0Var2.q(new oa0(19, bg0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    bg0Var2.f32136e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new pf0(bg0Var2, tL_auth_signIn2, 1), 10);
                                        bg0Var2.w();
                                        bg0Var2.v();
                                    } else {
                                        bg0Var2.f32135d0 = false;
                                        yg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = bg0Var2.f32139g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = bg0Var2.f32139g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = bg0Var2.f32139g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            bg0Var2.u();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(bg0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(bg0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(bg0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(22));
                                        }
                                        bg0Var2.f32134c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    bg0Var2.c(true);
                                                    yg0Var.u1(0, true, null, true);
                                                    yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    yg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                bg0Var2.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                fs fsVar = bg0Var2.f32137f;
                                                is[] isVarArr = fsVar.f33749f;
                                                if (i15 < isVarArr.length) {
                                                    isVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    fsVar.e = false;
                                                    isVarArr[0].requestFocus();
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
                                final bg0 bg0Var3 = bg0Var;
                                bg0Var3.f32135d0 = false;
                                yg0 yg0Var2 = bg0Var3.f32153s0;
                                yg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.c5.x0(yg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", bg0Var3.d);
                                    bundle2.putString("phoneHash", bg0Var3.f32133c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    bg0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    bg0Var3.f32153s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    bg0Var3.f32153s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final bg0 bg0Var2 = this.f36617b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f36618c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final bg0 bg0Var22 = bg0Var2;
                                int i14 = bg0Var22.f32138f0;
                                yg0 yg0Var = bg0Var22.f32153s0;
                                bg0Var22.z(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    bg0Var22.f32135d0 = false;
                                    yg0Var.v1(false, true);
                                    bg0Var22.w();
                                    bg0Var22.v();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            yg0Var.f39902p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", bg0Var22.d);
                                        bundle.putString("phoneHash", bg0Var22.f32133c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        bg0Var22.q(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        bg0Var22.f32153s0.u1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        bg0Var22.f32153s0.u1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        bg0Var22.q(new oa0(19, bg0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    bg0Var22.f32136e0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) yg0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new pf0(bg0Var22, tL_auth_signIn22, 1), 10);
                                        bg0Var22.w();
                                        bg0Var22.v();
                                    } else {
                                        bg0Var22.f32135d0 = false;
                                        yg0Var.v1(false, true);
                                        if ((i14 == 3 && ((i12 = bg0Var22.f32139g0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = bg0Var22.f32139g0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = bg0Var22.f32139g0) == 2 || i10 == 17 || i10 == 16)))) {
                                            bg0Var22.u();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(bg0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(bg0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(bg0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sh(22));
                                        }
                                        bg0Var22.f32134c0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    bg0Var22.c(true);
                                                    yg0Var.u1(0, true, null, true);
                                                    yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    yg0Var.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                                                    yg0Var.l1(string, LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                bg0Var22.y();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                fs fsVar = bg0Var22.f32137f;
                                                is[] isVarArr = fsVar.f33749f;
                                                if (i15 < isVarArr.length) {
                                                    isVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    fsVar.e = false;
                                                    isVarArr[0].requestFocus();
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
                                final bg0 bg0Var3 = bg0Var2;
                                bg0Var3.f32135d0 = false;
                                yg0 yg0Var2 = bg0Var3.f32153s0;
                                yg0Var2.v1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.c5.x0(yg0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", bg0Var3.d);
                                    bundle2.putString("phoneHash", bg0Var3.f32133c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    bg0Var3.q(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    bg0Var3.f32153s0.u1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    bg0Var3.f32153s0.u1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                yg0Var2.l1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

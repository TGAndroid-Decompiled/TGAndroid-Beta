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
public final class af0 implements RequestDelegate {
    public final int f35667a;
    public final mf0 f35668b;
    public final TLRPC.TL_auth_signIn f35669c;

    public af0(mf0 mf0Var, TLRPC.TL_auth_signIn tL_auth_signIn, int i10) {
        this.f35667a = i10;
        this.f35668b = mf0Var;
        this.f35669c = tL_auth_signIn;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f35667a) {
            case 0:
                final mf0 mf0Var = this.f35668b;
                final TLRPC.TL_auth_signIn tL_auth_signIn = this.f35669c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final mf0 mf0Var2 = mf0Var;
                                int i14 = mf0Var2.f39547h0;
                                ig0 ig0Var = mf0Var2.f39562u0;
                                mf0Var2.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn2 = tL_auth_signIn;
                                if (tL_error2 == null) {
                                    mf0Var2.f39545f0 = false;
                                    ig0Var.z1(false, true);
                                    mf0Var2.u();
                                    mf0Var2.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f38211p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", mf0Var2.d);
                                        bundle.putString("phoneHash", mf0Var2.f39540c);
                                        bundle.putString("code", tL_auth_signIn2.phone_code);
                                        mf0Var2.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        mf0Var2.f39562u0.y1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        mf0Var2.f39562u0.y1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        mf0Var2.p(new f80(24, mf0Var2, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    mf0Var2.f39546g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new af0(mf0Var2, tL_auth_signIn2, 1), 10);
                                        mf0Var2.u();
                                        mf0Var2.t();
                                    } else {
                                        mf0Var2.f39545f0 = false;
                                        ig0Var.z1(false, true);
                                        if ((i14 == 3 && ((i12 = mf0Var2.f39548i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = mf0Var2.f39548i0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = mf0Var2.f39548i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            mf0Var2.s();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var2, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(29));
                                        }
                                        mf0Var2.f39543e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    mf0Var2.c(true);
                                                    ig0Var.y1(0, true, null, true);
                                                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                mf0Var2.x();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                sr srVar = mf0Var2.f39544f;
                                                vr[] vrVarArr = srVar.f41793f;
                                                if (i15 < vrVarArr.length) {
                                                    vrVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    srVar.e = false;
                                                    vrVarArr[0].requestFocus();
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
                                final mf0 mf0Var3 = mf0Var;
                                mf0Var3.f39545f0 = false;
                                ig0 ig0Var2 = mf0Var3.f39562u0;
                                ig0Var2.z1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", mf0Var3.d);
                                    bundle2.putString("phoneHash", mf0Var3.f39540c);
                                    bundle2.putString("code", tL_auth_signIn.phone_code);
                                    mf0Var3.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    mf0Var3.f39562u0.y1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    mf0Var3.f39562u0.y1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
                                    return;
                                }
                                ig0Var2.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error3.text);
                                return;
                        }
                    }
                });
                return;
            default:
                final mf0 mf0Var2 = this.f35668b;
                final TLRPC.TL_auth_signIn tL_auth_signIn2 = this.f35669c;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        int i12;
                        int i13;
                        switch (r5) {
                            case 0:
                                final mf0 mf0Var22 = mf0Var2;
                                int i14 = mf0Var22.f39547h0;
                                ig0 ig0Var = mf0Var22.f39562u0;
                                mf0Var22.y(false);
                                TLRPC.TL_error tL_error2 = tL_error;
                                TLRPC.TL_auth_signIn tL_auth_signIn22 = tL_auth_signIn2;
                                if (tL_error2 == null) {
                                    mf0Var22.f39545f0 = false;
                                    ig0Var.z1(false, true);
                                    mf0Var22.u();
                                    mf0Var22.t();
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject2).terms_of_service;
                                        if (tL_help_termsOfService != null) {
                                            ig0Var.f38211p0 = tL_help_termsOfService;
                                        }
                                        final Bundle bundle = new Bundle();
                                        bundle.putString("phoneFormated", mf0Var22.d);
                                        bundle.putString("phoneHash", mf0Var22.f39540c);
                                        bundle.putString("code", tL_auth_signIn22.phone_code);
                                        mf0Var22.p(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (r3) {
                                                    case 0:
                                                        mf0Var22.f39562u0.y1(5, true, bundle, false);
                                                        return;
                                                    default:
                                                        mf0Var22.f39562u0.y1(6, true, bundle, false);
                                                        return;
                                                }
                                            }
                                        });
                                    } else {
                                        mf0Var22.p(new f80(24, mf0Var22, tLObject2));
                                    }
                                } else {
                                    String str = tL_error2.text;
                                    mf0Var22.f39546g0 = str;
                                    if (str.contains("SESSION_PASSWORD_NEEDED")) {
                                        TL_account.getPassword getpassword = new TL_account.getPassword();
                                        i13 = ((org.telegram.ui.ActionBar.o2) ig0Var).currentAccount;
                                        ConnectionsManager.getInstance(i13).sendRequest(getpassword, new af0(mf0Var22, tL_auth_signIn22, 1), 10);
                                        mf0Var22.u();
                                        mf0Var22.t();
                                    } else {
                                        mf0Var22.f39545f0 = false;
                                        ig0Var.z1(false, true);
                                        if ((i14 == 3 && ((i12 = mf0Var22.f39548i0) == 4 || i12 == 2 || i12 == 17 || i12 == 16)) || ((i14 == 2 && ((i11 = mf0Var22.f39548i0) == 4 || i11 == 3)) || (i14 == 4 && ((i10 = mf0Var22.f39548i0) == 2 || i10 == 17 || i10 == 16)))) {
                                            mf0Var22.s();
                                        }
                                        if (i14 == 15) {
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 2) {
                                            AndroidUtilities.setWaitingForSms(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var22, NotificationCenter.didReceiveSmsCode);
                                        } else if (i14 == 3) {
                                            AndroidUtilities.setWaitingForCall(true);
                                            NotificationCenter.getGlobalInstance().addObserver(mf0Var22, NotificationCenter.didReceiveCall);
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rc(29));
                                        }
                                        mf0Var22.f39543e0 = true;
                                        if (i14 != 3) {
                                            if (tL_error2.text.contains("PHONE_NUMBER_INVALID")) {
                                                ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                                            } else if (!tL_error2.text.contains("PHONE_CODE_EMPTY") && !tL_error2.text.contains("PHONE_CODE_INVALID")) {
                                                if (tL_error2.text.contains("PHONE_CODE_EXPIRED")) {
                                                    mf0Var22.c(true);
                                                    ig0Var.y1(0, true, null, true);
                                                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                                                } else if (tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                                                } else {
                                                    ig0Var.p1(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error2.text);
                                                }
                                            } else {
                                                mf0Var22.x();
                                                return;
                                            }
                                            int i15 = 0;
                                            while (true) {
                                                sr srVar = mf0Var22.f39544f;
                                                vr[] vrVarArr = srVar.f41793f;
                                                if (i15 < vrVarArr.length) {
                                                    vrVarArr[i15].setText("");
                                                    i15++;
                                                } else {
                                                    srVar.e = false;
                                                    vrVarArr[0].requestFocus();
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
                                final mf0 mf0Var3 = mf0Var2;
                                mf0Var3.f39545f0 = false;
                                ig0 ig0Var2 = mf0Var3.f39562u0;
                                ig0Var2.z1(false, true);
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (tL_error3 == null) {
                                    TL_account.Password password = (TL_account.Password) tLObject;
                                    if (!TwoStepVerificationActivity.i0(password, true)) {
                                        org.telegram.ui.Components.f5.x0(ig0Var2.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                                        return;
                                    }
                                    final Bundle bundle2 = new Bundle();
                                    SerializedData serializedData = new SerializedData(password.getObjectSize());
                                    password.serializeToStream(serializedData);
                                    bundle2.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
                                    bundle2.putString("phoneFormated", mf0Var3.d);
                                    bundle2.putString("phoneHash", mf0Var3.f39540c);
                                    bundle2.putString("code", tL_auth_signIn2.phone_code);
                                    mf0Var3.p(new Runnable() {
                                        @Override
                                        public final void run() {
                                            switch (r3) {
                                                case 0:
                                                    mf0Var3.f39562u0.y1(5, true, bundle2, false);
                                                    return;
                                                default:
                                                    mf0Var3.f39562u0.y1(6, true, bundle2, false);
                                                    return;
                                            }
                                        }
                                    });
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

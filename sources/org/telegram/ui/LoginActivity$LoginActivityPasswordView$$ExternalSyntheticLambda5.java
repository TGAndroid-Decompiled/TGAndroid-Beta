package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.TextStyleSpan;

public final class LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5 implements RequestDelegate {
    public final int $r8$classId;
    public final LoginActivity.LoginActivityPasswordView f$0;

    public LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5(LoginActivity.LoginActivityPasswordView loginActivityPasswordView, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivityPasswordView;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final LoginActivity.LoginActivityPasswordView loginActivityPasswordView = this.f$0;
                loginActivityPasswordView.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        LoginActivity.LoginActivityPasswordView loginActivityPasswordView2 = loginActivityPasswordView;
                        int i2 = 1;
                        switch (i) {
                            case 0:
                                LoginActivity loginActivity = LoginActivity.this;
                                loginActivity.needHideProgress(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    } else {
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        loginActivity.needShowAlert(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                    }
                                    break;
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (loginActivity.getParentActivity() != null) {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                                        int iIndexOf = str.indexOf(42);
                                        int iLastIndexOf = str.lastIndexOf(42);
                                        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                            textStyleRun.flags |= 256;
                                            textStyleRun.start = iIndexOf;
                                            int i3 = iLastIndexOf + 1;
                                            textStyleRun.end = i3;
                                            spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i3, 0);
                                        }
                                        SpannableStringBuilder spannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf);
                                        AlertDialog alertDialog = builder.alertDialog;
                                        alertDialog.message = spannable;
                                        alertDialog.title = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogsActivity$$ExternalSyntheticLambda89(25, loginActivityPasswordView2, tL_auth_passwordRecovery));
                                        Dialog dialogShowDialog = loginActivity.showDialog(alertDialog);
                                        if (dialogShowDialog != null) {
                                            dialogShowDialog.setCanceledOnTouchOutside(false);
                                            dialogShowDialog.setCancelable(false);
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                loginActivityPasswordView2.getClass();
                                if (tL_error2 == null) {
                                    loginActivityPasswordView2.currentPassword = (TL_account.Password) tLObject2;
                                    loginActivityPasswordView2.onNextPressed(null);
                                }
                                break;
                            default:
                                loginActivityPasswordView2.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                if (tL_error2 == null || !"SRP_ID_INVALID".equals(tL_error2.text)) {
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                        loginActivity2.showDoneButton(false, true);
                                        loginActivityPasswordView2.postDelayed(new LinkManager$$ExternalSyntheticLambda2(7, loginActivityPasswordView2, tLObject2), 150L);
                                        break;
                                    } else {
                                        loginActivity2.needHideProgress(false, true);
                                        if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                            if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            } else {
                                                int iIntValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                                            }
                                            break;
                                        } else if (loginActivity2.getParentActivity() != null) {
                                            loginActivityPasswordView2.codeField.setText("");
                                            LoginActivity.onFieldError(loginActivityPasswordView2.outlineCodeField, true);
                                            break;
                                        }
                                    }
                                } else {
                                    ConnectionsManager.getInstance(((BaseFragment) loginActivity2).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5(loginActivityPasswordView2, i2), 8);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final LoginActivity.LoginActivityPasswordView loginActivityPasswordView2 = this.f$0;
                loginActivityPasswordView2.getClass();
                final int i2 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        LoginActivity.LoginActivityPasswordView loginActivityPasswordView3 = loginActivityPasswordView2;
                        int i3 = 1;
                        switch (i2) {
                            case 0:
                                LoginActivity loginActivity = LoginActivity.this;
                                loginActivity.needHideProgress(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    } else {
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        loginActivity.needShowAlert(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                    }
                                    break;
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (loginActivity.getParentActivity() != null) {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                                        int iIndexOf = str.indexOf(42);
                                        int iLastIndexOf = str.lastIndexOf(42);
                                        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                            textStyleRun.flags |= 256;
                                            textStyleRun.start = iIndexOf;
                                            int i4 = iLastIndexOf + 1;
                                            textStyleRun.end = i4;
                                            spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i4, 0);
                                        }
                                        SpannableStringBuilder spannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf);
                                        AlertDialog alertDialog = builder.alertDialog;
                                        alertDialog.message = spannable;
                                        alertDialog.title = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogsActivity$$ExternalSyntheticLambda89(25, loginActivityPasswordView3, tL_auth_passwordRecovery));
                                        Dialog dialogShowDialog = loginActivity.showDialog(alertDialog);
                                        if (dialogShowDialog != null) {
                                            dialogShowDialog.setCanceledOnTouchOutside(false);
                                            dialogShowDialog.setCancelable(false);
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                loginActivityPasswordView3.getClass();
                                if (tL_error2 == null) {
                                    loginActivityPasswordView3.currentPassword = (TL_account.Password) tLObject2;
                                    loginActivityPasswordView3.onNextPressed(null);
                                }
                                break;
                            default:
                                loginActivityPasswordView3.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                if (tL_error2 == null || !"SRP_ID_INVALID".equals(tL_error2.text)) {
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                        loginActivity2.showDoneButton(false, true);
                                        loginActivityPasswordView3.postDelayed(new LinkManager$$ExternalSyntheticLambda2(7, loginActivityPasswordView3, tLObject2), 150L);
                                        break;
                                    } else {
                                        loginActivity2.needHideProgress(false, true);
                                        if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                            if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            } else {
                                                int iIntValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                                            }
                                            break;
                                        } else if (loginActivity2.getParentActivity() != null) {
                                            loginActivityPasswordView3.codeField.setText("");
                                            LoginActivity.onFieldError(loginActivityPasswordView3.outlineCodeField, true);
                                            break;
                                        }
                                    }
                                } else {
                                    ConnectionsManager.getInstance(((BaseFragment) loginActivity2).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5(loginActivityPasswordView3, i3), 8);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final LoginActivity.LoginActivityPasswordView loginActivityPasswordView3 = this.f$0;
                loginActivityPasswordView3.getClass();
                final int i3 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        LoginActivity.LoginActivityPasswordView loginActivityPasswordView4 = loginActivityPasswordView3;
                        int i4 = 1;
                        switch (i3) {
                            case 0:
                                LoginActivity loginActivity = LoginActivity.this;
                                loginActivity.needHideProgress(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                    } else {
                                        int iIntValue = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                        loginActivity.needShowAlert(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                                    }
                                    break;
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (loginActivity.getParentActivity() != null) {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null);
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
                                        int iIndexOf = str.indexOf(42);
                                        int iLastIndexOf = str.lastIndexOf(42);
                                        if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                                            TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                                            textStyleRun.flags |= 256;
                                            textStyleRun.start = iIndexOf;
                                            int i5 = iLastIndexOf + 1;
                                            textStyleRun.end = i5;
                                            spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun, 0), iIndexOf, i5, 0);
                                        }
                                        SpannableStringBuilder spannable = AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf);
                                        AlertDialog alertDialog = builder.alertDialog;
                                        alertDialog.message = spannable;
                                        alertDialog.title = LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle);
                                        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogsActivity$$ExternalSyntheticLambda89(25, loginActivityPasswordView4, tL_auth_passwordRecovery));
                                        Dialog dialogShowDialog = loginActivity.showDialog(alertDialog);
                                        if (dialogShowDialog != null) {
                                            dialogShowDialog.setCanceledOnTouchOutside(false);
                                            dialogShowDialog.setCancelable(false);
                                        }
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                loginActivityPasswordView4.getClass();
                                if (tL_error2 == null) {
                                    loginActivityPasswordView4.currentPassword = (TL_account.Password) tLObject2;
                                    loginActivityPasswordView4.onNextPressed(null);
                                }
                                break;
                            default:
                                loginActivityPasswordView4.nextPressed = false;
                                LoginActivity loginActivity2 = LoginActivity.this;
                                if (tL_error2 == null || !"SRP_ID_INVALID".equals(tL_error2.text)) {
                                    if (tLObject2 instanceof TLRPC.TL_auth_authorization) {
                                        loginActivity2.showDoneButton(false, true);
                                        loginActivityPasswordView4.postDelayed(new LinkManager$$ExternalSyntheticLambda2(7, loginActivityPasswordView4, tLObject2), 150L);
                                        break;
                                    } else {
                                        loginActivity2.needHideProgress(false, true);
                                        if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                            if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error2.text);
                                            } else {
                                                int iIntValue2 = Utilities.parseInt((CharSequence) tL_error2.text).intValue();
                                                loginActivity2.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                                            }
                                            break;
                                        } else if (loginActivity2.getParentActivity() != null) {
                                            loginActivityPasswordView4.codeField.setText("");
                                            LoginActivity.onFieldError(loginActivityPasswordView4.outlineCodeField, true);
                                            break;
                                        }
                                    }
                                } else {
                                    ConnectionsManager.getInstance(((BaseFragment) loginActivity2).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda5(loginActivityPasswordView4, i4), 8);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}

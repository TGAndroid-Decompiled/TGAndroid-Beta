package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;

public final class TwoStepVerificationActivity$$ExternalSyntheticLambda1 implements RequestDelegate {
    public final int $r8$classId;
    public final TwoStepVerificationActivity f$0;

    public TwoStepVerificationActivity$$ExternalSyntheticLambda1(TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                final TwoStepVerificationActivity twoStepVerificationActivity = this.f$0;
                twoStepVerificationActivity.getClass();
                final int i = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                twoStepVerificationActivity.lambda$onPasswordForgot$14(tLObject, tL_error);
                                break;
                            case 1:
                                twoStepVerificationActivity.lambda$clearPassword$21(tLObject, tL_error);
                                break;
                            case 2:
                                twoStepVerificationActivity.lambda$clearPassword$25(tLObject, tL_error);
                                break;
                            case 3:
                                twoStepVerificationActivity.lambda$processDone$31(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationActivity.lambda$clearPassword$23(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            case 1:
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.f$0;
                twoStepVerificationActivity2.getClass();
                final int i2 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String pluralString;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity3 = twoStepVerificationActivity2;
                        switch (i2) {
                            case 0:
                                twoStepVerificationActivity3.needHideProgress();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationActivity3.getParentActivity(), 0, null);
                                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity3.showDialog(alertDialog, new ShareActivity$$ExternalSyntheticLambda0(twoStepVerificationActivity3, 6));
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity3.currentPassword.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity3.updateBottomButton();
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity3.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        pluralString = LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 3600) {
                                        pluralString = LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]);
                                    } else {
                                        pluralString = currentTime > 60 ? LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0]);
                                    }
                                    twoStepVerificationActivity3.showAlertWithText$2(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, pluralString));
                                }
                                break;
                            default:
                                twoStepVerificationActivity3.getClass();
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity3.currentPassword.pending_reset_date = 0;
                                    twoStepVerificationActivity3.updateBottomButton();
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.f$0;
                twoStepVerificationActivity3.getClass();
                final int i3 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String pluralString;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity4 = twoStepVerificationActivity3;
                        switch (i3) {
                            case 0:
                                twoStepVerificationActivity4.needHideProgress();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationActivity4.getParentActivity(), 0, null);
                                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity4.showDialog(alertDialog, new ShareActivity$$ExternalSyntheticLambda0(twoStepVerificationActivity4, 6));
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity4.currentPassword.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity4.updateBottomButton();
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity4.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        pluralString = LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 3600) {
                                        pluralString = LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]);
                                    } else {
                                        pluralString = currentTime > 60 ? LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]) : LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0]);
                                    }
                                    twoStepVerificationActivity4.showAlertWithText$2(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, pluralString));
                                }
                                break;
                            default:
                                twoStepVerificationActivity4.getClass();
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity4.currentPassword.pending_reset_date = 0;
                                    twoStepVerificationActivity4.updateBottomButton();
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.f$0;
                twoStepVerificationActivity4.getClass();
                final int i4 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                twoStepVerificationActivity4.lambda$onPasswordForgot$14(tLObject, tL_error);
                                break;
                            case 1:
                                twoStepVerificationActivity4.lambda$clearPassword$21(tLObject, tL_error);
                                break;
                            case 2:
                                twoStepVerificationActivity4.lambda$clearPassword$25(tLObject, tL_error);
                                break;
                            case 3:
                                twoStepVerificationActivity4.lambda$processDone$31(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationActivity4.lambda$clearPassword$23(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            case 4:
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.f$0;
                twoStepVerificationActivity5.getClass();
                final int i5 = 2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                twoStepVerificationActivity5.lambda$onPasswordForgot$14(tLObject, tL_error);
                                break;
                            case 1:
                                twoStepVerificationActivity5.lambda$clearPassword$21(tLObject, tL_error);
                                break;
                            case 2:
                                twoStepVerificationActivity5.lambda$clearPassword$25(tLObject, tL_error);
                                break;
                            case 3:
                                twoStepVerificationActivity5.lambda$processDone$31(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationActivity5.lambda$clearPassword$23(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            case 5:
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.f$0;
                twoStepVerificationActivity6.getClass();
                final int i6 = 3;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                twoStepVerificationActivity6.lambda$onPasswordForgot$14(tLObject, tL_error);
                                break;
                            case 1:
                                twoStepVerificationActivity6.lambda$clearPassword$21(tLObject, tL_error);
                                break;
                            case 2:
                                twoStepVerificationActivity6.lambda$clearPassword$25(tLObject, tL_error);
                                break;
                            case 3:
                                twoStepVerificationActivity6.lambda$processDone$31(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationActivity6.lambda$clearPassword$23(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
            default:
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.f$0;
                twoStepVerificationActivity7.getClass();
                final int i7 = 4;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i7) {
                            case 0:
                                twoStepVerificationActivity7.lambda$onPasswordForgot$14(tLObject, tL_error);
                                break;
                            case 1:
                                twoStepVerificationActivity7.lambda$clearPassword$21(tLObject, tL_error);
                                break;
                            case 2:
                                twoStepVerificationActivity7.lambda$clearPassword$25(tLObject, tL_error);
                                break;
                            case 3:
                                twoStepVerificationActivity7.lambda$processDone$31(tLObject, tL_error);
                                break;
                            default:
                                twoStepVerificationActivity7.lambda$clearPassword$23(tLObject, tL_error);
                                break;
                        }
                    }
                });
                break;
        }
    }
}

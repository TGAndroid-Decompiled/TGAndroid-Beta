package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class if1 implements RequestDelegate {
    public final int f40237a;
    public final TwoStepVerificationActivity f40238b;

    public if1(TwoStepVerificationActivity twoStepVerificationActivity, int i10) {
        this.f40237a = i10;
        this.f40238b = twoStepVerificationActivity;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.f40237a) {
            case 0:
                final TwoStepVerificationActivity twoStepVerificationActivity = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity2 = twoStepVerificationActivity;
                        switch (i10) {
                            case 0:
                                twoStepVerificationActivity2.p0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity2.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                    e2Var.R = string;
                                    e2Var.T = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity2.showDialog(e2Var, new u5(twoStepVerificationActivity2, 17));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity2.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity2.z0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity2.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        formatPluralString = LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 3600) {
                                        formatPluralString = LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 60) {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0]);
                                    }
                                    twoStepVerificationActivity2.x0(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, formatPluralString));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity2.I.pending_reset_date = 0;
                                    twoStepVerificationActivity2.z0();
                                    return;
                                }
                                twoStepVerificationActivity2.getClass();
                                return;
                        }
                    }
                });
                return;
            case 1:
                final TwoStepVerificationActivity twoStepVerificationActivity2 = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.W(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.c0(twoStepVerificationActivity2, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 2:
                final TwoStepVerificationActivity twoStepVerificationActivity3 = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        String formatPluralString;
                        int i10 = r3;
                        TLObject tLObject2 = tLObject;
                        TwoStepVerificationActivity twoStepVerificationActivity22 = twoStepVerificationActivity3;
                        switch (i10) {
                            case 0:
                                twoStepVerificationActivity22.p0();
                                if (tLObject2 instanceof TL_account.resetPasswordOk) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(twoStepVerificationActivity22.getParentActivity());
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    String string = LocaleController.getString(R.string.ResetPassword);
                                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
                                    e2Var.R = string;
                                    e2Var.T = LocaleController.getString(R.string.RestorePasswordResetPasswordOk);
                                    twoStepVerificationActivity22.showDialog(e2Var, new u5(twoStepVerificationActivity22, 17));
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordRequestedWait) {
                                    twoStepVerificationActivity22.I.pending_reset_date = ((TL_account.resetPasswordRequestedWait) tLObject2).until_date;
                                    twoStepVerificationActivity22.z0();
                                    return;
                                } else if (tLObject2 instanceof TL_account.resetPasswordFailedWait) {
                                    int currentTime = ((TL_account.resetPasswordFailedWait) tLObject2).retry_date - twoStepVerificationActivity22.getConnectionsManager().getCurrentTime();
                                    if (currentTime > 86400) {
                                        formatPluralString = LocaleController.formatPluralString("Days", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 3600) {
                                        formatPluralString = LocaleController.formatPluralString("Hours", currentTime / 86400, new Object[0]);
                                    } else if (currentTime > 60) {
                                        formatPluralString = LocaleController.formatPluralString("Minutes", currentTime / 60, new Object[0]);
                                    } else {
                                        formatPluralString = LocaleController.formatPluralString("Seconds", Math.max(1, currentTime), new Object[0]);
                                    }
                                    twoStepVerificationActivity22.x0(LocaleController.getString(R.string.ResetPassword), LocaleController.formatString("ResetPasswordWait", R.string.ResetPasswordWait, formatPluralString));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                if (tLObject2 instanceof TLRPC.TL_boolTrue) {
                                    twoStepVerificationActivity22.I.pending_reset_date = 0;
                                    twoStepVerificationActivity22.z0();
                                    return;
                                }
                                twoStepVerificationActivity22.getClass();
                                return;
                        }
                    }
                });
                return;
            case 3:
                final TwoStepVerificationActivity twoStepVerificationActivity4 = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.W(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.c0(twoStepVerificationActivity4, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 4:
                final TwoStepVerificationActivity twoStepVerificationActivity5 = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.W(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.c0(twoStepVerificationActivity5, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            case 5:
                final TwoStepVerificationActivity twoStepVerificationActivity6 = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.W(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.c0(twoStepVerificationActivity6, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
            default:
                final TwoStepVerificationActivity twoStepVerificationActivity7 = this.f40238b;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r4) {
                            case 0:
                                TwoStepVerificationActivity.g0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 1:
                                TwoStepVerificationActivity.V(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 2:
                                TwoStepVerificationActivity.a0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            case 3:
                                TwoStepVerificationActivity.W(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                            default:
                                TwoStepVerificationActivity.c0(twoStepVerificationActivity7, tL_error, tLObject);
                                return;
                        }
                    }
                });
                return;
        }
    }
}

package org.telegram.ui;

import android.app.Dialog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;
    public final TLRPC.TL_error f$1;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda28(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
        this.f$1 = tL_error;
    }

    @Override
    public final void run() {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
        TLRPC.TL_error tL_error = this.f$1;
        switch (this.$r8$classId) {
            case 0:
                twoStepVerificationSetupActivity.needHideProgress();
                if (tL_error == null) {
                    twoStepVerificationSetupActivity.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                    AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity(), 0, null);
                    builder.setPositiveButton(LocaleController.getString(R.string.OK), new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda14(twoStepVerificationSetupActivity, 3));
                    String string = LocaleController.getString(R.string.PasswordReset);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.message = string;
                    alertDialog.title = LocaleController.getString(R.string.TwoStepVerificationTitle);
                    Dialog dialogShowDialog = twoStepVerificationSetupActivity.showDialog(alertDialog);
                    if (dialogShowDialog != null) {
                        dialogShowDialog.setCanceledOnTouchOutside(false);
                        dialogShowDialog.setCancelable(false);
                    }
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    twoStepVerificationSetupActivity.showAlertWithText$3(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    twoStepVerificationSetupActivity.showAlertWithText$3(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                }
                break;
            case 1:
                twoStepVerificationSetupActivity.needHideProgress();
                if (tL_error != null) {
                    if (tL_error.text.startsWith("CODE_INVALID")) {
                        twoStepVerificationSetupActivity.onCodeFieldError();
                    } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        twoStepVerificationSetupActivity.showAlertWithText$3(LocaleController.getString(R.string.AppName), tL_error.text);
                    } else {
                        int iIntValue2 = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        twoStepVerificationSetupActivity.showAlertWithText$3(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue2 < 60 ? LocaleController.formatPluralString("Seconds", iIntValue2, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue2 / 60, new Object[0])));
                    }
                    break;
                } else if (twoStepVerificationSetupActivity.getParentActivity() != null) {
                    twoStepVerificationSetupActivity.animateSuccess$2(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(twoStepVerificationSetupActivity, 4));
                    break;
                }
                break;
            case 2:
                twoStepVerificationSetupActivity.lambda$setNewPassword$43(tL_error);
                break;
            default:
                twoStepVerificationSetupActivity.lambda$processNext$26(tL_error);
                break;
        }
    }
}

package org.telegram.ui;

import java.io.FileNotFoundException;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.PasscodeView;

public final class LaunchActivity$$ExternalSyntheticLambda28 implements PasscodeView.PasscodeViewDelegate, AlertDialog.OnButtonClickListener {
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda28(LaunchActivity launchActivity) {
        this.f$0 = launchActivity;
    }

    @Override
    public void didAcceptedPassword(PasscodeView passcodeView) throws FileNotFoundException {
        this.f$0.lambda$showPasscodeActivity$7(passcodeView);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$didReceivedNotification$149(alertDialog, i);
    }
}

package org.telegram.ui;

import org.telegram.messenger.CallReceiver;
public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35 implements Runnable {
    public static final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35 INSTANCE = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35();

    private LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda35() {
    }

    @Override
    public final void run() {
        CallReceiver.checkLastReceivedCall();
    }
}

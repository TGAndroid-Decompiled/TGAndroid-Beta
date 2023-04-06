package org.telegram.ui;

import org.telegram.messenger.CallReceiver;
public final class LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda36 implements Runnable {
    public static final LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda36 INSTANCE = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda36();

    private LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda36() {
    }

    @Override
    public final void run() {
        CallReceiver.checkLastReceivedCall();
    }
}

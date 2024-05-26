package org.telegram.ui;

import org.telegram.messenger.Utilities;
public final class LaunchActivity$$ExternalSyntheticLambda111 implements Utilities.Callback {
    public final LaunchActivity f$0;

    public LaunchActivity$$ExternalSyntheticLambda111(LaunchActivity launchActivity) {
        this.f$0 = launchActivity;
    }

    @Override
    public final void run(Object obj) {
        this.f$0.onPowerSaver(((Boolean) obj).booleanValue());
    }
}

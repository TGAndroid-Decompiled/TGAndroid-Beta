package org.telegram.ui;

public final class CameraScanActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda10(CameraScanActivity cameraScanActivity) {
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void run() {
        this.f$0.updateRecognized();
    }
}

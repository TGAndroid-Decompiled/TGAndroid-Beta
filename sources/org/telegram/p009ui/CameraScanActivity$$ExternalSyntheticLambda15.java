package org.telegram.p009ui;

public final class CameraScanActivity$$ExternalSyntheticLambda15 implements Runnable {
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda15(CameraScanActivity cameraScanActivity) {
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void run() {
        this.f$0.updateRecognized();
    }
}

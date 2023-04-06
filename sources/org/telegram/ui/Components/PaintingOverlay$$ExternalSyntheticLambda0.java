package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class PaintingOverlay$$ExternalSyntheticLambda0 implements ImageReceiver.ImageReceiverDelegate {
    public static final PaintingOverlay$$ExternalSyntheticLambda0 INSTANCE = new PaintingOverlay$$ExternalSyntheticLambda0();

    private PaintingOverlay$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        PaintingOverlay.lambda$setEntities$0(imageReceiver, z, z2, z3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }
}

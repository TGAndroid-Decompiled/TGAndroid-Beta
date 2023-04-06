package org.telegram.ui.Components;

import org.telegram.messenger.ImageReceiver;
public final class TextPaintImageReceiverSpan$$ExternalSyntheticLambda0 implements ImageReceiver.ImageReceiverDelegate {
    public static final TextPaintImageReceiverSpan$$ExternalSyntheticLambda0 INSTANCE = new TextPaintImageReceiverSpan$$ExternalSyntheticLambda0();

    private TextPaintImageReceiverSpan$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        TextPaintImageReceiverSpan.lambda$new$0(imageReceiver, z, z2, z3);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }
}

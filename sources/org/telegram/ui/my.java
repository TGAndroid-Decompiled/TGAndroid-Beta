package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class my implements ImageReceiver.ImageReceiverDelegate {
    public final ny f41721a;
    public final boolean f41722b;
    public final MessageObject f41723c;
    public final oy d;

    public my(oy oyVar, ny nyVar, boolean z10, MessageObject messageObject) {
        this.d = oyVar;
        this.f41721a = nyVar;
        this.f41722b = z10;
        this.f41723c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ny nyVar = this.f41721a;
        if (nyVar.f42033r.getLottieAnimation() != null) {
            nyVar.f42033r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f41722b && (messageObject = this.f41723c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f34765x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

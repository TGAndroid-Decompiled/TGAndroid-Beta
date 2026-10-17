package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class oy implements ImageReceiver.ImageReceiverDelegate {
    public final py f39900a;
    public final boolean f39901b;
    public final MessageObject f39902c;
    public final qy d;

    public oy(qy qyVar, py pyVar, boolean z10, MessageObject messageObject) {
        this.d = qyVar;
        this.f39900a = pyVar;
        this.f39901b = z10;
        this.f39902c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        py pyVar = this.f39900a;
        if (pyVar.f40270r.getLottieAnimation() != null) {
            pyVar.f40270r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f39901b && (messageObject = this.f39902c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f31030x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

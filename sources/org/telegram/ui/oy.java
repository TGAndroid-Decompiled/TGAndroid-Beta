package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class oy implements ImageReceiver.ImageReceiverDelegate {
    public final py f39880a;
    public final boolean f39881b;
    public final MessageObject f39882c;
    public final qy d;

    public oy(qy qyVar, py pyVar, boolean z10, MessageObject messageObject) {
        this.d = qyVar;
        this.f39880a = pyVar;
        this.f39881b = z10;
        this.f39882c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        py pyVar = this.f39880a;
        if (pyVar.f40234r.getLottieAnimation() != null) {
            pyVar.f40234r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f39881b && (messageObject = this.f39882c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f31030x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

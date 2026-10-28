package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class oy implements ImageReceiver.ImageReceiverDelegate {
    public final py f42248a;
    public final boolean f42249b;
    public final MessageObject f42250c;
    public final qy d;

    public oy(qy qyVar, py pyVar, boolean z10, MessageObject messageObject) {
        this.d = qyVar;
        this.f42248a = pyVar;
        this.f42249b = z10;
        this.f42250c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        py pyVar = this.f42248a;
        if (pyVar.f42541r.getLottieAnimation() != null) {
            pyVar.f42541r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f42249b && (messageObject = this.f42250c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f35096x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

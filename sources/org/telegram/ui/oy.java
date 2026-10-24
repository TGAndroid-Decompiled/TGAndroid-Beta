package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class oy implements ImageReceiver.ImageReceiverDelegate {
    public final py f40275a;
    public final boolean f40276b;
    public final MessageObject f40277c;
    public final qy d;

    public oy(qy qyVar, py pyVar, boolean z10, MessageObject messageObject) {
        this.d = qyVar;
        this.f40275a = pyVar;
        this.f40276b = z10;
        this.f40277c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        py pyVar = this.f40275a;
        if (pyVar.f40661r.getLottieAnimation() != null) {
            pyVar.f40661r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f40276b && (messageObject = this.f40277c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f32623x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

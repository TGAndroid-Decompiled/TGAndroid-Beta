package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class ez implements ImageReceiver.ImageReceiverDelegate {
    public final fz f36141a;
    public final boolean f36142b;
    public final MessageObject f36143c;
    public final gz d;

    public ez(gz gzVar, fz fzVar, boolean z10, MessageObject messageObject) {
        this.d = gzVar;
        this.f36141a = fzVar;
        this.f36142b = z10;
        this.f36143c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fz fzVar = this.f36141a;
        if (fzVar.f36459r.getLottieAnimation() != null) {
            fzVar.f36459r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f36142b && (messageObject = this.f36143c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f28240x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

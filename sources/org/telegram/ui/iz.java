package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class iz implements ImageReceiver.ImageReceiverDelegate {
    public final jz f36890a;
    public final boolean f36891b;
    public final MessageObject f36892c;
    public final kz d;

    public iz(kz kzVar, jz jzVar, boolean z10, MessageObject messageObject) {
        this.d = kzVar;
        this.f36890a = jzVar;
        this.f36891b = z10;
        this.f36892c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        jz jzVar = this.f36890a;
        if (jzVar.f37187r.getLottieAnimation() != null) {
            jzVar.f37187r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f36891b && (messageObject = this.f36892c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f31314x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class dz implements ImageReceiver.ImageReceiverDelegate {
    public final ez f37111a;
    public final boolean f37112b;
    public final MessageObject f37113c;
    public final fz d;

    public dz(fz fzVar, ez ezVar, boolean z10, MessageObject messageObject) {
        this.d = fzVar;
        this.f37111a = ezVar;
        this.f37112b = z10;
        this.f37113c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ez ezVar = this.f37111a;
        if (ezVar.f37402r.getLottieAnimation() != null) {
            ezVar.f37402r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f37112b && (messageObject = this.f37113c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25425x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

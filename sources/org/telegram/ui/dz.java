package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class dz implements ImageReceiver.ImageReceiverDelegate {
    public final ez f37109a;
    public final boolean f37110b;
    public final MessageObject f37111c;
    public final fz d;

    public dz(fz fzVar, ez ezVar, boolean z10, MessageObject messageObject) {
        this.d = fzVar;
        this.f37109a = ezVar;
        this.f37110b = z10;
        this.f37111c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ez ezVar = this.f37109a;
        if (ezVar.f37400r.getLottieAnimation() != null) {
            ezVar.f37400r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f37110b && (messageObject = this.f37111c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25425x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

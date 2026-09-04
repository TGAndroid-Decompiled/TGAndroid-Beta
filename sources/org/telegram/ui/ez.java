package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class ez implements ImageReceiver.ImageReceiverDelegate {
    public final fz f36207a;
    public final boolean f36208b;
    public final MessageObject f36209c;
    public final gz d;

    public ez(gz gzVar, fz fzVar, boolean z10, MessageObject messageObject) {
        this.d = gzVar;
        this.f36207a = fzVar;
        this.f36208b = z10;
        this.f36209c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fz fzVar = this.f36207a;
        if (fzVar.f36511r.getLottieAnimation() != null) {
            fzVar.f36511r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f36208b && (messageObject = this.f36209c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f32581x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

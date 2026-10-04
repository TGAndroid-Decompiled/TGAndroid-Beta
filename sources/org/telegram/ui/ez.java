package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class ez implements ImageReceiver.ImageReceiverDelegate {
    public final fz f36120a;
    public final boolean f36121b;
    public final MessageObject f36122c;
    public final gz d;

    public ez(gz gzVar, fz fzVar, boolean z10, MessageObject messageObject) {
        this.d = gzVar;
        this.f36120a = fzVar;
        this.f36121b = z10;
        this.f36122c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        fz fzVar = this.f36120a;
        if (fzVar.f36451r.getLottieAnimation() != null) {
            fzVar.f36451r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f36121b && (messageObject = this.f36122c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f28154x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

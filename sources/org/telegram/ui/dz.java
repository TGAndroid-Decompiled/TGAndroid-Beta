package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class dz implements ImageReceiver.ImageReceiverDelegate {
    public final ez f33066a;
    public final boolean f33067b;
    public final MessageObject f33068c;
    public final fz d;

    public dz(fz fzVar, ez ezVar, boolean z10, MessageObject messageObject) {
        this.d = fzVar;
        this.f33066a = ezVar;
        this.f33067b = z10;
        this.f33068c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ez ezVar = this.f33066a;
        if (ezVar.f33366r.getLottieAnimation() != null) {
            ezVar.f33366r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f33067b && (messageObject = this.f33068c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25775x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

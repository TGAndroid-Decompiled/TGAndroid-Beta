package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class gz implements ImageReceiver.ImageReceiverDelegate {
    public final hz f33214a;
    public final boolean f33215b;
    public final MessageObject f33216c;
    public final iz d;

    public gz(iz izVar, hz hzVar, boolean z10, MessageObject messageObject) {
        this.d = izVar;
        this.f33214a = hzVar;
        this.f33215b = z10;
        this.f33216c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hz hzVar = this.f33214a;
        if (hzVar.f33501r.getLottieAnimation() != null) {
            hzVar.f33501r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f33215b && (messageObject = this.f33216c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f23675x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

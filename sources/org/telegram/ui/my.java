package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class my implements ImageReceiver.ImageReceiverDelegate {
    public final ny f39363a;
    public final boolean f39364b;
    public final MessageObject f39365c;
    public final oy d;

    public my(oy oyVar, ny nyVar, boolean z10, MessageObject messageObject) {
        this.d = oyVar;
        this.f39363a = nyVar;
        this.f39364b = z10;
        this.f39365c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ny nyVar = this.f39363a;
        if (nyVar.f39713r.getLottieAnimation() != null) {
            nyVar.f39713r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f39364b && (messageObject = this.f39365c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f31005x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

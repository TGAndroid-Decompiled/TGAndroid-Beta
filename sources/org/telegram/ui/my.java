package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class my implements ImageReceiver.ImageReceiverDelegate {
    public final ny f39365a;
    public final boolean f39366b;
    public final MessageObject f39367c;
    public final oy d;

    public my(oy oyVar, ny nyVar, boolean z10, MessageObject messageObject) {
        this.d = oyVar;
        this.f39365a = nyVar;
        this.f39366b = z10;
        this.f39367c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ny nyVar = this.f39365a;
        if (nyVar.f39718r.getLottieAnimation() != null) {
            nyVar.f39718r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f39366b && (messageObject = this.f39367c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f31294x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

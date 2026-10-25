package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class my implements ImageReceiver.ImageReceiverDelegate {
    public final ny f41718a;
    public final boolean f41719b;
    public final MessageObject f41720c;
    public final oy d;

    public my(oy oyVar, ny nyVar, boolean z10, MessageObject messageObject) {
        this.d = oyVar;
        this.f41718a = nyVar;
        this.f41719b = z10;
        this.f41720c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ny nyVar = this.f41718a;
        if (nyVar.f42030r.getLottieAnimation() != null) {
            nyVar.f42030r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f41719b && (messageObject = this.f41720c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f34762x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

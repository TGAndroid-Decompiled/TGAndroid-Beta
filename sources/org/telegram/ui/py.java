package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class py implements ImageReceiver.ImageReceiverDelegate {
    public final qy f41488a;
    public final boolean f41489b;
    public final MessageObject f41490c;
    public final ry d;

    public py(ry ryVar, qy qyVar, boolean z10, MessageObject messageObject) {
        this.d = ryVar;
        this.f41488a = qyVar;
        this.f41489b = z10;
        this.f41490c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        qy qyVar = this.f41488a;
        if (qyVar.f41812r.getLottieAnimation() != null) {
            qyVar.f41812r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f41489b && (messageObject = this.f41490c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f34761x == null) {
            try {
                this.d.C.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

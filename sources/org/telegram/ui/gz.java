package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class gz implements ImageReceiver.ImageReceiverDelegate {
    public final hz f34066a;
    public final boolean f34067b;
    public final MessageObject f34068c;
    public final iz d;

    public gz(iz izVar, hz hzVar, boolean z10, MessageObject messageObject) {
        this.d = izVar;
        this.f34066a = hzVar;
        this.f34067b = z10;
        this.f34068c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        hz hzVar = this.f34066a;
        if (hzVar.f34396r.getLottieAnimation() != null) {
            hzVar.f34396r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f34067b && (messageObject = this.f34068c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f30248x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

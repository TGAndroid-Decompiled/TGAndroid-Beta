package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class fz implements ImageReceiver.ImageReceiverDelegate {
    public final gz f37872a;
    public final boolean f37873b;
    public final MessageObject f37874c;
    public final hz d;

    public fz(hz hzVar, gz gzVar, boolean z10, MessageObject messageObject) {
        this.d = hzVar;
        this.f37872a = gzVar;
        this.f37873b = z10;
        this.f37874c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        gz gzVar = this.f37872a;
        if (gzVar.f38193r.getLottieAnimation() != null) {
            gzVar.f38193r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f37873b && (messageObject = this.f37874c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f26133x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

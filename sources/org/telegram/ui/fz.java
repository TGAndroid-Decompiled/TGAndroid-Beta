package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class fz implements ImageReceiver.ImageReceiverDelegate {
    public final gz f37874a;
    public final boolean f37875b;
    public final MessageObject f37876c;
    public final hz d;

    public fz(hz hzVar, gz gzVar, boolean z10, MessageObject messageObject) {
        this.d = hzVar;
        this.f37874a = gzVar;
        this.f37875b = z10;
        this.f37876c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        gz gzVar = this.f37874a;
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
        if (this.f37875b && (messageObject = this.f37876c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f26131x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class ny implements ImageReceiver.ImageReceiverDelegate {
    public final oy f40848a;
    public final boolean f40849b;
    public final MessageObject f40850c;
    public final py d;

    public ny(py pyVar, oy oyVar, boolean z10, MessageObject messageObject) {
        this.d = pyVar;
        this.f40848a = oyVar;
        this.f40849b = z10;
        this.f40850c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        oy oyVar = this.f40848a;
        if (oyVar.f41277r.getLottieAnimation() != null) {
            oyVar.f41277r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i9, String str, Drawable drawable) {
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f40849b && (messageObject = this.f40850c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f30871x == null) {
            try {
                this.d.C.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

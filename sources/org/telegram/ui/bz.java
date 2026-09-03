package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class bz implements ImageReceiver.ImageReceiverDelegate {
    public final cz f32960a;
    public final boolean f32961b;
    public final MessageObject f32962c;
    public final dz d;

    public bz(dz dzVar, cz czVar, boolean z4, MessageObject messageObject) {
        this.d = dzVar;
        this.f32960a = czVar;
        this.f32961b = z4;
        this.f32962c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        cz czVar = this.f32960a;
        if (czVar.f33273r.getLottieAnimation() != null) {
            czVar.f33273r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f32961b && (messageObject = this.f32962c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25182x == null) {
            try {
                this.d.D.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

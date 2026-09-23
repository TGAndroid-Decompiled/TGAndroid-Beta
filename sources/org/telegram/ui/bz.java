package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class bz implements ImageReceiver.ImageReceiverDelegate {
    public final cz f32198a;
    public final boolean f32199b;
    public final MessageObject f32200c;
    public final dz d;

    public bz(dz dzVar, cz czVar, boolean z10, MessageObject messageObject) {
        this.d = dzVar;
        this.f32198a = czVar;
        this.f32199b = z10;
        this.f32200c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        cz czVar = this.f32198a;
        if (czVar.f32454r.getLottieAnimation() != null) {
            czVar.f32454r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f32199b && (messageObject = this.f32200c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f30287x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class az implements ImageReceiver.ImageReceiverDelegate {
    public final bz f32245a;
    public final boolean f32246b;
    public final MessageObject f32247c;
    public final cz d;

    public az(cz czVar, bz bzVar, boolean z10, MessageObject messageObject) {
        this.d = czVar;
        this.f32245a = bzVar;
        this.f32246b = z10;
        this.f32247c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bz bzVar = this.f32245a;
        if (bzVar.f32512r.getLottieAnimation() != null) {
            bzVar.f32512r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f32246b && (messageObject = this.f32247c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25071x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

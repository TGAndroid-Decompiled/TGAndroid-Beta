package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class az implements ImageReceiver.ImageReceiverDelegate {
    public final bz f32259a;
    public final boolean f32260b;
    public final MessageObject f32261c;
    public final cz d;

    public az(cz czVar, bz bzVar, boolean z10, MessageObject messageObject) {
        this.d = czVar;
        this.f32259a = bzVar;
        this.f32260b = z10;
        this.f32261c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        bz bzVar = this.f32259a;
        if (bzVar.f32527r.getLottieAnimation() != null) {
            bzVar.f32527r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f32260b && (messageObject = this.f32261c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f25098x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

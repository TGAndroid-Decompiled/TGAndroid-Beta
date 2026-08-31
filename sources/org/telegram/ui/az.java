package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class az implements ImageReceiver.ImageReceiverDelegate {
    public final bz f35267a;
    public final boolean f35268b;
    public final MessageObject f35269c;
    public final cz d;

    public az(cz czVar, bz bzVar, boolean z4, MessageObject messageObject) {
        this.d = czVar;
        this.f35267a = bzVar;
        this.f35268b = z4;
        this.f35269c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        bz bzVar = this.f35267a;
        if (bzVar.f35628r.getLottieAnimation() != null) {
            bzVar.f35628r.getLottieAnimation().L(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f35268b && (messageObject = this.f35269c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f27841x == null) {
            try {
                this.d.D.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

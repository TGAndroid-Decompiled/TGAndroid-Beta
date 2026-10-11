package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
public final class cz implements ImageReceiver.ImageReceiverDelegate {
    public final dz f36854a;
    public final boolean f36855b;
    public final MessageObject f36856c;
    public final ez d;

    public cz(ez ezVar, dz dzVar, boolean z10, MessageObject messageObject) {
        this.d = ezVar;
        this.f36854a = dzVar;
        this.f36855b = z10;
        this.f36856c = messageObject;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        dz dzVar = this.f36854a;
        if (dzVar.f37159r.getLottieAnimation() != null) {
            dzVar.f37159r.getLottieAnimation().N(0, false, true);
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        MessageObject messageObject;
        if (this.f36855b && (messageObject = this.f36856c) != null && messageObject.isAnimatedAnimatedEmoji() && imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().f26067x == null) {
            try {
                this.d.G.performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
        }
    }
}

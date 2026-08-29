package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
public final class l01 implements ImageReceiver.ImageReceiverDelegate {
    public final Runnable[] f40048a;

    public l01(Runnable[] runnableArr) {
        this.f40048a = runnableArr;
    }

    @Override
    public final void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        if (imageReceiver.hasBitmapImage()) {
            Runnable[] runnableArr = this.f40048a;
            if (runnableArr[0] != null) {
                org.telegram.ui.Components.xi0 lottieAnimation = imageReceiver.getLottieAnimation();
                if (lottieAnimation == null) {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                } else if (lottieAnimation.w()) {
                    lottieAnimation.f34764y0 = new ky0(runnableArr, 6);
                } else {
                    runnableArr[0].run();
                    runnableArr[0] = null;
                }
            }
        }
    }

    @Override
    public final void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override
    public final void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.i5.b(this, imageReceiver);
    }
}

package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class ProfileGalleryBlurView$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final ProfileGalleryBlurView f$0;

    public ProfileGalleryBlurView$$ExternalSyntheticLambda8(ProfileGalleryBlurView profileGalleryBlurView, int i) {
        this.$r8$classId = i;
        this.f$0 = profileGalleryBlurView;
    }

    @Override
    public final void run() {
        ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr;
        int i = 1;
        switch (this.$r8$classId) {
            case 0:
                ProfileGalleryBlurView profileGalleryBlurView = this.f$0;
                synchronized (profileGalleryBlurView.lock) {
                    ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr2 = profileGalleryBlurView.nextFrame;
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder = blurBitmapHolderArr2[0];
                    ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr3 = profileGalleryBlurView.currentFrame;
                    blurBitmapHolderArr = new ProfileMetaballView.BlurBitmapHolder[]{blurBitmapHolder, blurBitmapHolderArr3[0], blurBitmapHolderArr2[1], blurBitmapHolderArr3[1], blurBitmapHolderArr2[2], blurBitmapHolderArr3[2]};
                    break;
                }
                boolean z = false;
                for (int i2 = 0; i2 < 6; i2 += 2) {
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder2 = blurBitmapHolderArr[i2];
                    ProfileMetaballView.BlurBitmapHolder blurBitmapHolder3 = blurBitmapHolderArr[i2 + 1];
                    if (blurBitmapHolder2 != null && !blurBitmapHolder2.destroying && blurBitmapHolder2.hasContent) {
                        blurBitmapHolder2.isBusy = true;
                        if (blurBitmapHolder3 == null || blurBitmapHolder3.destroyed || blurBitmapHolder3.bitmap.getWidth() != blurBitmapHolder2.bitmap.getWidth() || blurBitmapHolder3.bitmap.getHeight() != blurBitmapHolder2.bitmap.getHeight()) {
                            if (blurBitmapHolder3 != null) {
                                blurBitmapHolder3.destroying = true;
                                if (!blurBitmapHolder3.isBusy) {
                                    blurBitmapHolder3.destroyed = true;
                                    blurBitmapHolder3.bitmap.recycle();
                                }
                            }
                            blurBitmapHolder3 = new ProfileMetaballView.BlurBitmapHolder(blurBitmapHolder2);
                            synchronized (profileGalleryBlurView.lock) {
                                try {
                                    ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr4 = profileGalleryBlurView.currentFrame;
                                    int i3 = 0;
                                    while (true) {
                                        ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr5 = profileGalleryBlurView.nextFrame;
                                        if (i3 >= blurBitmapHolderArr5.length) {
                                            i3 = 0;
                                        } else if (blurBitmapHolderArr5[i3] != blurBitmapHolder2) {
                                            i3++;
                                        }
                                    }
                                    blurBitmapHolderArr4[i3] = blurBitmapHolder3;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        Bitmap bitmap = blurBitmapHolder2.bitmap;
                        Utilities.stackBlurBitmap(bitmap, Math.max(10, bitmap.getWidth() / 180));
                        synchronized (profileGalleryBlurView.lock) {
                            try {
                                if (!blurBitmapHolder3.destroyed) {
                                    blurBitmapHolder3.hasContent = false;
                                    blurBitmapHolder3.bitmap.eraseColor(0);
                                }
                                blurBitmapHolder3.canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                                blurBitmapHolder3.hasContent = true;
                                Bitmap bitmap2 = blurBitmapHolder3.bitmap;
                                int i4 = 0;
                                while (true) {
                                    ProfileMetaballView.BlurBitmapHolder[] blurBitmapHolderArr6 = profileGalleryBlurView.nextFrame;
                                    if (i4 >= blurBitmapHolderArr6.length) {
                                        i4 = 0;
                                    } else if (blurBitmapHolderArr6[i4] != blurBitmapHolder2) {
                                        i4++;
                                    }
                                }
                                profileGalleryBlurView.applyShader(bitmap2, i4);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (!blurBitmapHolder2.destroyed) {
                            blurBitmapHolder2.hasContent = false;
                            blurBitmapHolder2.bitmap.eraseColor(0);
                        }
                        blurBitmapHolder2.isBusy = false;
                        if (!blurBitmapHolder2.destroyed && blurBitmapHolder2.destroying) {
                            blurBitmapHolder2.destroyed = true;
                            blurBitmapHolder2.bitmap.recycle();
                        }
                        z = true;
                    }
                }
                if (z && profileGalleryBlurView.isBluring && profileGalleryBlurView.view != null) {
                    profileGalleryBlurView.postInvalidateOnAnimation();
                }
                if (profileGalleryBlurView.isBluring && (profileGalleryBlurView.loopInvalidate || profileGalleryBlurView.needNewFrame)) {
                    AndroidUtilities.runOnUIThread(new ProfileGalleryBlurView$$ExternalSyntheticLambda8(profileGalleryBlurView, i));
                    return;
                } else {
                    profileGalleryBlurView.isBluring = false;
                    return;
                }
            case 1:
                ProfileGalleryBlurView profileGalleryBlurView2 = this.f$0;
                profileGalleryBlurView2.captureNextFrame();
                ProfileMetaballView.profileBlurQueue.postRunnable(profileGalleryBlurView2.blurTask);
                return;
            default:
                ProfileGalleryBlurView profileGalleryBlurView3 = this.f$0;
                profileGalleryBlurView3.needNewFrame = true;
                profileGalleryBlurView3.postInvalidateOnAnimation();
                return;
        }
    }
}

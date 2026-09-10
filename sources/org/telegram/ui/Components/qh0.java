package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class qh0 implements z4.e {
    public final yh0 f26420a;

    public qh0(yh0 yh0Var) {
        this.f26420a = yh0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        yh0 yh0Var = this.f26420a;
        int i11 = yh0Var.f29342o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            yh0Var.getClass();
            yh0Var.f29342o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = yh0Var.S0;
        if (dialogPhotos != null) {
            xh0 xh0Var = yh0Var.D0;
            if (xh0Var != null) {
                i12 = xh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        yh0 yh0Var = this.f26420a;
        yh0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = yh0Var.D0.k(i10);
            if (yh0Var.f29337i1) {
                k10--;
            }
            yh0Var.getCurrentItemView();
            int childCount = yh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = yh0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    xh0 xh0Var = yh0Var.D0;
                    int k11 = xh0Var.k(xh0Var.d.indexOf(childAt));
                    if (yh0Var.f29337i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < yh0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) yh0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(yh0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) yh0Var.W0.get(k11)) != null) {
                                animation.y(imageLocation.videoSeekTo, false, true);
                            }
                            imageReceiver.setAllowStartAnimation(false);
                            imageReceiver.stopAnimation();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void c(int i10) {
    }
}

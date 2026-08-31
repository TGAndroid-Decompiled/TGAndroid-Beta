package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class ph0 implements m2.f {
    public final xh0 f30086a;

    public ph0(xh0 xh0Var) {
        this.f30086a = xh0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        xh0 xh0Var = this.f30086a;
        int i11 = xh0Var.l1;
        int i12 = 0;
        if (i10 >= i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != i11) {
            xh0Var.getClass();
            xh0Var.l1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = xh0Var.P0;
        if (dialogPhotos != null) {
            wh0 wh0Var = xh0Var.A0;
            if (wh0Var != null) {
                i12 = wh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z4);
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        xh0 xh0Var = this.f30086a;
        xh0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = xh0Var.A0.k(i10);
            if (xh0Var.f33088f1) {
                k10--;
            }
            xh0Var.getCurrentItemView();
            int childCount = xh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = xh0Var.getChildAt(i12);
                if (childAt instanceof p9) {
                    wh0 wh0Var = xh0Var.A0;
                    int k11 = wh0Var.k(wh0Var.d.indexOf(childAt));
                    if (xh0Var.f33088f1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < xh0Var.T0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) xh0Var.T0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(xh0Var.I0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            y5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) xh0Var.T0.get(k11)) != null) {
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

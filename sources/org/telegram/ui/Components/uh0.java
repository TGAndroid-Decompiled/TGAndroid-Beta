package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class uh0 implements z4.e {
    public final ci0 f28859a;

    public uh0(ci0 ci0Var) {
        this.f28859a = ci0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        ci0 ci0Var = this.f28859a;
        int i11 = ci0Var.f23335o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            ci0Var.getClass();
            ci0Var.f23335o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ci0Var.S0;
        if (dialogPhotos != null) {
            bi0 bi0Var = ci0Var.D0;
            if (bi0Var != null) {
                i12 = bi0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ci0 ci0Var = this.f28859a;
        ci0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ci0Var.D0.k(i10);
            if (ci0Var.f23330i1) {
                k10--;
            }
            ci0Var.getCurrentItemView();
            int childCount = ci0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ci0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    bi0 bi0Var = ci0Var.D0;
                    int k11 = bi0Var.k(bi0Var.d.indexOf(childAt));
                    if (ci0Var.f23330i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ci0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ci0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ci0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            d6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ci0Var.W0.get(k11)) != null) {
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

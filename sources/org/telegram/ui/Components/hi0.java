package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class hi0 implements z4.e {
    public final pi0 f25671a;

    public hi0(pi0 pi0Var) {
        this.f25671a = pi0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        pi0 pi0Var = this.f25671a;
        pi0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = pi0Var.D0.k(i10);
            if (pi0Var.f28327i1) {
                k10--;
            }
            pi0Var.getCurrentItemView();
            int childCount = pi0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pi0Var.getChildAt(i12);
                if (childAt instanceof z9) {
                    oi0 oi0Var = pi0Var.D0;
                    int k11 = oi0Var.k(oi0Var.d.indexOf(childAt));
                    if (pi0Var.f28327i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((z9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < pi0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) pi0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(pi0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) pi0Var.W0.get(k11)) != null) {
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
    public final void b(int i10) {
        boolean z10;
        pi0 pi0Var = this.f25671a;
        int i11 = pi0Var.f28332o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            pi0Var.getClass();
            pi0Var.f28332o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = pi0Var.S0;
        if (dialogPhotos != null) {
            oi0 oi0Var = pi0Var.D0;
            if (oi0Var != null) {
                i12 = oi0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void c(int i10) {
    }
}

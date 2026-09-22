package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class th0 implements z4.e {
    public final bi0 f28473a;

    public th0(bi0 bi0Var) {
        this.f28473a = bi0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        bi0 bi0Var = this.f28473a;
        int i11 = bi0Var.f23013o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            bi0Var.getClass();
            bi0Var.f23013o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = bi0Var.S0;
        if (dialogPhotos != null) {
            ai0 ai0Var = bi0Var.D0;
            if (ai0Var != null) {
                i12 = ai0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        bi0 bi0Var = this.f28473a;
        bi0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = bi0Var.D0.k(i10);
            if (bi0Var.f23008i1) {
                k10--;
            }
            bi0Var.getCurrentItemView();
            int childCount = bi0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = bi0Var.getChildAt(i12);
                if (childAt instanceof v9) {
                    ai0 ai0Var = bi0Var.D0;
                    int k11 = ai0Var.k(ai0Var.d.indexOf(childAt));
                    if (bi0Var.f23008i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((v9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < bi0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) bi0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(bi0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) bi0Var.W0.get(k11)) != null) {
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

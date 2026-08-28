package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class sg0 implements m2.e {
    public final ah0 f32461a;

    public sg0(ah0 ah0Var) {
        this.f32461a = ah0Var;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        ah0 ah0Var = this.f32461a;
        int i10 = ah0Var.f26805k1;
        int i11 = 0;
        if (i9 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 != i10) {
            ah0Var.getClass();
            ah0Var.f26805k1 = i9;
        }
        MessagesController.DialogPhotos dialogPhotos = ah0Var.O0;
        if (dialogPhotos != null) {
            zg0 zg0Var = ah0Var.f26814z0;
            if (zg0Var != null) {
                i11 = zg0Var.j();
            }
            dialogPhotos.loadAfter(i9 - i11, z10);
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        ImageLocation imageLocation;
        ah0 ah0Var = this.f32461a;
        ah0Var.B(f10, i9);
        if (i10 == 0) {
            int k10 = ah0Var.f26814z0.k(i9);
            if (ah0Var.f26799e1) {
                k10--;
            }
            ah0Var.getCurrentItemView();
            int childCount = ah0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = ah0Var.getChildAt(i11);
                if (childAt instanceof o9) {
                    zg0 zg0Var = ah0Var.f26814z0;
                    int k11 = zg0Var.k(zg0Var.d.indexOf(childAt));
                    if (ah0Var.f26799e1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((o9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ah0Var.S0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ah0Var.S0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ah0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            x5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ah0Var.S0.get(k11)) != null) {
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
    public final void d(int i9) {
    }
}

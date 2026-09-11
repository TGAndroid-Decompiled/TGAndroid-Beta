package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class gh0 implements z4.e {
    public final oh0 f26387a;

    public gh0(oh0 oh0Var) {
        this.f26387a = oh0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        oh0 oh0Var = this.f26387a;
        oh0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = oh0Var.D0.k(i10);
            if (oh0Var.f29062i1) {
                k10--;
            }
            oh0Var.getCurrentItemView();
            int childCount = oh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = oh0Var.getChildAt(i12);
                if (childAt instanceof x9) {
                    nh0 nh0Var = oh0Var.D0;
                    int k11 = nh0Var.k(nh0Var.d.indexOf(childAt));
                    if (oh0Var.f29062i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((x9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < oh0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) oh0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(oh0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            d6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) oh0Var.W0.get(k11)) != null) {
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
        oh0 oh0Var = this.f26387a;
        int i11 = oh0Var.f29067o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            oh0Var.getClass();
            oh0Var.f29067o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = oh0Var.S0;
        if (dialogPhotos != null) {
            nh0 nh0Var = oh0Var.D0;
            if (nh0Var != null) {
                i12 = nh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void c(int i10) {
    }
}

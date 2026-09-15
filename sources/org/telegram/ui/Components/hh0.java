package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class hh0 implements z4.e {
    public final org.telegram.ui.pz0 f24701a;

    public hh0(org.telegram.ui.pz0 pz0Var) {
        this.f24701a = pz0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        org.telegram.ui.pz0 pz0Var = this.f24701a;
        int i11 = pz0Var.f26800o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            pz0Var.f26800o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = pz0Var.S0;
        if (dialogPhotos != null) {
            nh0 nh0Var = pz0Var.D0;
            if (nh0Var != null) {
                i12 = nh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.pz0 pz0Var = this.f24701a;
        nh0 nh0Var = pz0Var.D0;
        ArrayList arrayList = pz0Var.W0;
        pz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = nh0Var.k(i10);
            pz0Var.getCurrentItemView();
            int childCount = pz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = pz0Var.getChildAt(i12);
                if (childAt instanceof u9) {
                    int k11 = nh0Var.k(nh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((u9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(pz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            b6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) arrayList.get(k11)) != null) {
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

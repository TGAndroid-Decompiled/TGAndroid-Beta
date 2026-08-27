package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

public final class vg0 implements m2.e {

    public final org.telegram.ui.my0 f33418a;

    public vg0(org.telegram.ui.my0 my0Var) {
        this.f33418a = my0Var;
    }

    @Override
    public final void b(int i10) {
        org.telegram.ui.my0 my0Var = this.f33418a;
        int i11 = my0Var.f27442k1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            my0Var.f27442k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = my0Var.O0;
        if (dialogPhotos != null) {
            bh0 bh0Var = my0Var.f27451z0;
            dialogPhotos.loadAfter(i10 - (bh0Var != null ? bh0Var.j() : 0), z10);
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.my0 my0Var = this.f33418a;
        bh0 bh0Var = my0Var.f27451z0;
        ArrayList arrayList = my0Var.S0;
        my0Var.B(f10, i10);
        if (i11 == 0) {
            int iK = bh0Var.k(i10);
            my0Var.getCurrentItemView();
            int childCount = my0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = my0Var.getChildAt(i12);
                if (childAt instanceof n9) {
                    int iK2 = bh0Var.k(bh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((n9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (iK2 >= 0 && iK2 < arrayList.size()) {
                        if (iK2 == iK) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(iK2);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(my0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            x5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) arrayList.get(iK2)) != null) {
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
    public final void d(int i10) {
    }
}

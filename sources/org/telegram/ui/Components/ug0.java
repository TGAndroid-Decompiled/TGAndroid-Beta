package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;

public final class ug0 implements m2.e {

    public final ch0 f33081a;

    public ug0(ch0 ch0Var) {
        this.f33081a = ch0Var;
    }

    @Override
    public final void b(int i10) {
        ch0 ch0Var = this.f33081a;
        int i11 = ch0Var.f27442k1;
        boolean z10 = i10 >= i11;
        if (i10 != i11) {
            ch0Var.getClass();
            ch0Var.f27442k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ch0Var.O0;
        if (dialogPhotos != null) {
            bh0 bh0Var = ch0Var.f27451z0;
            dialogPhotos.loadAfter(i10 - (bh0Var != null ? bh0Var.j() : 0), z10);
        }
    }

    @Override
    public final void c(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        ch0 ch0Var = this.f33081a;
        ch0Var.B(f10, i10);
        if (i11 == 0) {
            int iK = ch0Var.f27451z0.k(i10);
            if (ch0Var.f27436e1) {
                iK--;
            }
            ch0Var.getCurrentItemView();
            int childCount = ch0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ch0Var.getChildAt(i12);
                if (childAt instanceof n9) {
                    bh0 bh0Var = ch0Var.f27451z0;
                    int iK2 = bh0Var.k(bh0Var.d.indexOf(childAt));
                    if (ch0Var.f27436e1) {
                        iK2--;
                    }
                    ImageReceiver imageReceiver = ((n9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (iK2 >= 0 && iK2 < ch0Var.S0.size()) {
                        if (iK2 == iK) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ch0Var.S0.get(iK2);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ch0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            x5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ch0Var.S0.get(iK2)) != null) {
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

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class nh0 implements m2.f {
    public final vh0 f27288a;

    public nh0(vh0 vh0Var) {
        this.f27288a = vh0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        vh0 vh0Var = this.f27288a;
        int i11 = vh0Var.l1;
        int i12 = 0;
        if (i10 >= i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != i11) {
            vh0Var.getClass();
            vh0Var.l1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = vh0Var.P0;
        if (dialogPhotos != null) {
            uh0 uh0Var = vh0Var.A0;
            if (uh0Var != null) {
                i12 = uh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z4);
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        vh0 vh0Var = this.f27288a;
        vh0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = vh0Var.A0.k(i10);
            if (vh0Var.f29476f1) {
                k10--;
            }
            vh0Var.getCurrentItemView();
            int childCount = vh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = vh0Var.getChildAt(i12);
                if (childAt instanceof p9) {
                    uh0 uh0Var = vh0Var.A0;
                    int k11 = uh0Var.k(uh0Var.d.indexOf(childAt));
                    if (vh0Var.f29476f1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < vh0Var.T0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) vh0Var.T0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(vh0Var.I0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            y5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) vh0Var.T0.get(k11)) != null) {
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

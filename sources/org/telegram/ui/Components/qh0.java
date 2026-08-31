package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class qh0 implements m2.f {
    public final org.telegram.ui.zy0 f30395a;

    public qh0(org.telegram.ui.zy0 zy0Var) {
        this.f30395a = zy0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        org.telegram.ui.zy0 zy0Var = this.f30395a;
        int i11 = zy0Var.l1;
        int i12 = 0;
        if (i10 >= i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != i11) {
            zy0Var.l1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = zy0Var.P0;
        if (dialogPhotos != null) {
            wh0 wh0Var = zy0Var.A0;
            if (wh0Var != null) {
                i12 = wh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z4);
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.zy0 zy0Var = this.f30395a;
        wh0 wh0Var = zy0Var.A0;
        ArrayList arrayList = zy0Var.T0;
        zy0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = wh0Var.k(i10);
            zy0Var.getCurrentItemView();
            int childCount = zy0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = zy0Var.getChildAt(i12);
                if (childAt instanceof p9) {
                    int k11 = wh0Var.k(wh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(zy0Var.I0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            y5 animation = imageReceiver.getAnimation();
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

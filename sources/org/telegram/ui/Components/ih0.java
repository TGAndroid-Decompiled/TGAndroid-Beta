package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class ih0 implements z4.e {
    public final org.telegram.ui.rz0 f24939a;

    public ih0(org.telegram.ui.rz0 rz0Var) {
        this.f24939a = rz0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        org.telegram.ui.rz0 rz0Var = this.f24939a;
        int i11 = rz0Var.f27042o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            rz0Var.f27042o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = rz0Var.S0;
        if (dialogPhotos != null) {
            oh0 oh0Var = rz0Var.D0;
            if (oh0Var != null) {
                i12 = oh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.rz0 rz0Var = this.f24939a;
        oh0 oh0Var = rz0Var.D0;
        ArrayList arrayList = rz0Var.W0;
        rz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = oh0Var.k(i10);
            rz0Var.getCurrentItemView();
            int childCount = rz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = rz0Var.getChildAt(i12);
                if (childAt instanceof u9) {
                    int k11 = oh0Var.k(oh0Var.d.indexOf(childAt));
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
                                FileLoader.getInstance(rz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
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

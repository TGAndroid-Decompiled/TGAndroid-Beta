package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class di0 implements z4.e {
    public final org.telegram.ui.sy0 f25570a;

    public di0(org.telegram.ui.sy0 sy0Var) {
        this.f25570a = sy0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.sy0 sy0Var = this.f25570a;
        ji0 ji0Var = sy0Var.D0;
        ArrayList arrayList = sy0Var.W0;
        sy0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ji0Var.k(i10);
            sy0Var.getCurrentItemView();
            int childCount = sy0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = sy0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    int k11 = ji0Var.k(ji0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(sy0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            e6 animation = imageReceiver.getAnimation();
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
    public final void b(int i10) {
        boolean z10;
        org.telegram.ui.sy0 sy0Var = this.f25570a;
        int i11 = sy0Var.f27878o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            sy0Var.f27878o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = sy0Var.S0;
        if (dialogPhotos != null) {
            ji0 ji0Var = sy0Var.D0;
            if (ji0Var != null) {
                i12 = ji0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void c(int i10) {
    }
}

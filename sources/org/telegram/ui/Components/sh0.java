package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class sh0 implements z4.e {
    public final ai0 f28284a;

    public sh0(ai0 ai0Var) {
        this.f28284a = ai0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        ai0 ai0Var = this.f28284a;
        int i11 = ai0Var.f22664o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            ai0Var.getClass();
            ai0Var.f22664o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ai0Var.S0;
        if (dialogPhotos != null) {
            zh0 zh0Var = ai0Var.D0;
            if (zh0Var != null) {
                i12 = zh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ai0 ai0Var = this.f28284a;
        ai0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ai0Var.D0.k(i10);
            if (ai0Var.f22659i1) {
                k10--;
            }
            ai0Var.getCurrentItemView();
            int childCount = ai0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ai0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    zh0 zh0Var = ai0Var.D0;
                    int k11 = zh0Var.k(zh0Var.d.indexOf(childAt));
                    if (ai0Var.f22659i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ai0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ai0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ai0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            d6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ai0Var.W0.get(k11)) != null) {
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

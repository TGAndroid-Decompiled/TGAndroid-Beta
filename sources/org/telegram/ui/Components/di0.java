package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class di0 implements z4.e {
    public final li0 f25505a;

    public di0(li0 li0Var) {
        this.f25505a = li0Var;
    }

    @Override
    public final void a(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        li0 li0Var = this.f25505a;
        li0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = li0Var.D0.k(i10);
            if (li0Var.f28184i1) {
                k10--;
            }
            li0Var.getCurrentItemView();
            int childCount = li0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = li0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    ki0 ki0Var = li0Var.D0;
                    int k11 = ki0Var.k(ki0Var.d.indexOf(childAt));
                    if (li0Var.f28184i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((w9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < li0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) li0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(li0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            e6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) li0Var.W0.get(k11)) != null) {
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
        li0 li0Var = this.f25505a;
        int i11 = li0Var.f28189o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            li0Var.getClass();
            li0Var.f28189o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = li0Var.S0;
        if (dialogPhotos != null) {
            ki0 ki0Var = li0Var.D0;
            if (ki0Var != null) {
                i12 = ki0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void c(int i10) {
    }
}

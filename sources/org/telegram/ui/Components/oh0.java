package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class oh0 implements m2.f {
    public final wh0 f27570a;

    public oh0(wh0 wh0Var) {
        this.f27570a = wh0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        wh0 wh0Var = this.f27570a;
        int i11 = wh0Var.l1;
        int i12 = 0;
        if (i10 >= i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != i11) {
            wh0Var.getClass();
            wh0Var.l1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = wh0Var.P0;
        if (dialogPhotos != null) {
            vh0 vh0Var = wh0Var.A0;
            if (vh0Var != null) {
                i12 = vh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z4);
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        wh0 wh0Var = this.f27570a;
        wh0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = wh0Var.A0.k(i10);
            if (wh0Var.f30264f1) {
                k10--;
            }
            wh0Var.getCurrentItemView();
            int childCount = wh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = wh0Var.getChildAt(i12);
                if (childAt instanceof p9) {
                    vh0 vh0Var = wh0Var.A0;
                    int k11 = vh0Var.k(vh0Var.d.indexOf(childAt));
                    if (wh0Var.f30264f1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < wh0Var.T0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) wh0Var.T0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(wh0Var.I0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            y5 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) wh0Var.T0.get(k11)) != null) {
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

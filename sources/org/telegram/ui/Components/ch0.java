package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class ch0 implements m2.e {
    public final kh0 f27486a;

    public ch0(kh0 kh0Var) {
        this.f27486a = kh0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        kh0 kh0Var = this.f27486a;
        int i11 = kh0Var.f30056k1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            kh0Var.getClass();
            kh0Var.f30056k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = kh0Var.O0;
        if (dialogPhotos != null) {
            jh0 jh0Var = kh0Var.f30065z0;
            if (jh0Var != null) {
                i12 = jh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        ImageLocation imageLocation;
        kh0 kh0Var = this.f27486a;
        kh0Var.B(f9, i10);
        if (i11 == 0) {
            int k9 = kh0Var.f30065z0.k(i10);
            if (kh0Var.f30050e1) {
                k9--;
            }
            kh0Var.getCurrentItemView();
            int childCount = kh0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = kh0Var.getChildAt(i12);
                if (childAt instanceof t9) {
                    jh0 jh0Var = kh0Var.f30065z0;
                    int k10 = jh0Var.k(jh0Var.d.indexOf(childAt));
                    if (kh0Var.f30050e1) {
                        k10--;
                    }
                    ImageReceiver imageReceiver = ((t9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k10 >= 0 && k10 < kh0Var.S0.size()) {
                        if (k10 == k9) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) kh0Var.S0.get(k10);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(kh0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) kh0Var.S0.get(k10)) != null) {
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

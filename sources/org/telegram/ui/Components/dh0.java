package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class dh0 implements m2.e {
    public final org.telegram.ui.my0 f27767a;

    public dh0(org.telegram.ui.my0 my0Var) {
        this.f27767a = my0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        org.telegram.ui.my0 my0Var = this.f27767a;
        int i11 = my0Var.f30056k1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            my0Var.f30056k1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = my0Var.O0;
        if (dialogPhotos != null) {
            jh0 jh0Var = my0Var.f30065z0;
            if (jh0Var != null) {
                i12 = jh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f9, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.my0 my0Var = this.f27767a;
        jh0 jh0Var = my0Var.f30065z0;
        ArrayList arrayList = my0Var.S0;
        my0Var.B(f9, i10);
        if (i11 == 0) {
            int k9 = jh0Var.k(i10);
            my0Var.getCurrentItemView();
            int childCount = my0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = my0Var.getChildAt(i12);
                if (childAt instanceof t9) {
                    int k10 = jh0Var.k(jh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((t9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k10 >= 0 && k10 < arrayList.size()) {
                        if (k10 == k9) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k10);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(my0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) arrayList.get(k10)) != null) {
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

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class mi0 implements z4.e {
    public final ui0 f28860a;

    public mi0(ui0 ui0Var) {
        this.f28860a = ui0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        ui0 ui0Var = this.f28860a;
        int i11 = ui0Var.f31610o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            ui0Var.getClass();
            ui0Var.f31610o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ui0Var.S0;
        if (dialogPhotos != null) {
            ti0 ti0Var = ui0Var.D0;
            if (ti0Var != null) {
                i12 = ti0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ui0 ui0Var = this.f28860a;
        ui0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ui0Var.D0.k(i10);
            if (ui0Var.f31605i1) {
                k10--;
            }
            ui0Var.getCurrentItemView();
            int childCount = ui0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ui0Var.getChildAt(i12);
                if (childAt instanceof y9) {
                    ti0 ti0Var = ui0Var.D0;
                    int k11 = ti0Var.k(ti0Var.d.indexOf(childAt));
                    if (ui0Var.f31605i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((y9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ui0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ui0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ui0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ui0Var.W0.get(k11)) != null) {
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

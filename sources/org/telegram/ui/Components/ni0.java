package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class ni0 implements z4.e {
    public final vi0 f29059a;

    public ni0(vi0 vi0Var) {
        this.f29059a = vi0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        vi0 vi0Var = this.f29059a;
        int i11 = vi0Var.f31816o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            vi0Var.getClass();
            vi0Var.f31816o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = vi0Var.S0;
        if (dialogPhotos != null) {
            ui0 ui0Var = vi0Var.D0;
            if (ui0Var != null) {
                i12 = ui0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        vi0 vi0Var = this.f29059a;
        vi0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = vi0Var.D0.k(i10);
            if (vi0Var.f31811i1) {
                k10--;
            }
            vi0Var.getCurrentItemView();
            int childCount = vi0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = vi0Var.getChildAt(i12);
                if (childAt instanceof y9) {
                    ui0 ui0Var = vi0Var.D0;
                    int k11 = ui0Var.k(ui0Var.d.indexOf(childAt));
                    if (vi0Var.f31811i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((y9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < vi0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) vi0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(vi0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) vi0Var.W0.get(k11)) != null) {
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

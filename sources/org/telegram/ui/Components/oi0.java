package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class oi0 implements z4.e {
    public final wi0 f29222a;

    public oi0(wi0 wi0Var) {
        this.f29222a = wi0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        wi0 wi0Var = this.f29222a;
        int i11 = wi0Var.f32416o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            wi0Var.getClass();
            wi0Var.f32416o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = wi0Var.S0;
        if (dialogPhotos != null) {
            vi0 vi0Var = wi0Var.D0;
            if (vi0Var != null) {
                i12 = vi0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        wi0 wi0Var = this.f29222a;
        wi0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = wi0Var.D0.k(i10);
            if (wi0Var.f32411i1) {
                k10--;
            }
            wi0Var.getCurrentItemView();
            int childCount = wi0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = wi0Var.getChildAt(i12);
                if (childAt instanceof y9) {
                    vi0 vi0Var = wi0Var.D0;
                    int k11 = vi0Var.k(vi0Var.d.indexOf(childAt));
                    if (wi0Var.f32411i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((y9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < wi0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) wi0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(wi0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            f6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) wi0Var.W0.get(k11)) != null) {
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

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class fi0 implements z4.f {
    public final ni0 f26327a;

    public fi0(ni0 ni0Var) {
        this.f26327a = ni0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        ni0 ni0Var = this.f26327a;
        int i11 = ni0Var.f28932o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            ni0Var.getClass();
            ni0Var.f28932o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = ni0Var.S0;
        if (dialogPhotos != null) {
            mi0 mi0Var = ni0Var.D0;
            if (mi0Var != null) {
                i12 = mi0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        ni0 ni0Var = this.f26327a;
        ni0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = ni0Var.D0.k(i10);
            if (ni0Var.f28927i1) {
                k10--;
            }
            ni0Var.getCurrentItemView();
            int childCount = ni0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = ni0Var.getChildAt(i12);
                if (childAt instanceof u9) {
                    mi0 mi0Var = ni0Var.D0;
                    int k11 = mi0Var.k(mi0Var.d.indexOf(childAt));
                    if (ni0Var.f28927i1) {
                        k11--;
                    }
                    ImageReceiver imageReceiver = ((u9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < ni0Var.W0.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) ni0Var.W0.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(ni0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
                            if (animation != null && (imageLocation = (ImageLocation) ni0Var.W0.get(k11)) != null) {
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

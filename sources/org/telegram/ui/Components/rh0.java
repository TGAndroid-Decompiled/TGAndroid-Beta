package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class rh0 implements z4.e {
    public final org.telegram.ui.tz0 f26670a;

    public rh0(org.telegram.ui.tz0 tz0Var) {
        this.f26670a = tz0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        org.telegram.ui.tz0 tz0Var = this.f26670a;
        int i11 = tz0Var.f29342o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            tz0Var.f29342o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = tz0Var.S0;
        if (dialogPhotos != null) {
            xh0 xh0Var = tz0Var.D0;
            if (xh0Var != null) {
                i12 = xh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.tz0 tz0Var = this.f26670a;
        xh0 xh0Var = tz0Var.D0;
        ArrayList arrayList = tz0Var.W0;
        tz0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = xh0Var.k(i10);
            tz0Var.getCurrentItemView();
            int childCount = tz0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = tz0Var.getChildAt(i12);
                if (childAt instanceof w9) {
                    int k11 = xh0Var.k(xh0Var.d.indexOf(childAt));
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
                                FileLoader.getInstance(tz0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            c6 animation = imageReceiver.getAnimation();
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
    public final void c(int i10) {
    }
}

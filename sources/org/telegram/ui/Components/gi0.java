package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class gi0 implements z4.f {
    public final org.telegram.ui.vy0 f26697a;

    public gi0(org.telegram.ui.vy0 vy0Var) {
        this.f26697a = vy0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z10;
        org.telegram.ui.vy0 vy0Var = this.f26697a;
        int i11 = vy0Var.f28932o1;
        int i12 = 0;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != i11) {
            vy0Var.f28932o1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = vy0Var.S0;
        if (dialogPhotos != null) {
            mi0 mi0Var = vy0Var.D0;
            if (mi0Var != null) {
                i12 = mi0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z10);
        }
    }

    @Override
    public final void b(float f7, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.vy0 vy0Var = this.f26697a;
        mi0 mi0Var = vy0Var.D0;
        ArrayList arrayList = vy0Var.W0;
        vy0Var.B(f7, i10);
        if (i11 == 0) {
            int k10 = mi0Var.k(i10);
            vy0Var.getCurrentItemView();
            int childCount = vy0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = vy0Var.getChildAt(i12);
                if (childAt instanceof u9) {
                    int k11 = mi0Var.k(mi0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((u9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(vy0Var.L0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
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

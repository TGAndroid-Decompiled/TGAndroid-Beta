package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class oh0 implements m2.f {
    public final org.telegram.ui.xy0 f27568a;

    public oh0(org.telegram.ui.xy0 xy0Var) {
        this.f27568a = xy0Var;
    }

    @Override
    public final void a(int i10) {
        boolean z4;
        org.telegram.ui.xy0 xy0Var = this.f27568a;
        int i11 = xy0Var.l1;
        int i12 = 0;
        if (i10 >= i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != i11) {
            xy0Var.l1 = i10;
        }
        MessagesController.DialogPhotos dialogPhotos = xy0Var.P0;
        if (dialogPhotos != null) {
            uh0 uh0Var = xy0Var.A0;
            if (uh0Var != null) {
                i12 = uh0Var.j();
            }
            dialogPhotos.loadAfter(i10 - i12, z4);
        }
    }

    @Override
    public final void b(float f10, int i10, int i11) {
        ImageLocation imageLocation;
        org.telegram.ui.xy0 xy0Var = this.f27568a;
        uh0 uh0Var = xy0Var.A0;
        ArrayList arrayList = xy0Var.T0;
        xy0Var.B(f10, i10);
        if (i11 == 0) {
            int k10 = uh0Var.k(i10);
            xy0Var.getCurrentItemView();
            int childCount = xy0Var.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = xy0Var.getChildAt(i12);
                if (childAt instanceof p9) {
                    int k11 = uh0Var.k(uh0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((p9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(xy0Var.I0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            y5 animation = imageReceiver.getAnimation();
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

package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
public final class tg0 implements m2.e {
    public final org.telegram.ui.my0 f32697a;

    public tg0(org.telegram.ui.my0 my0Var) {
        this.f32697a = my0Var;
    }

    @Override
    public final void b(int i9) {
        boolean z10;
        org.telegram.ui.my0 my0Var = this.f32697a;
        int i10 = my0Var.f26805k1;
        int i11 = 0;
        if (i9 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 != i10) {
            my0Var.f26805k1 = i9;
        }
        MessagesController.DialogPhotos dialogPhotos = my0Var.O0;
        if (dialogPhotos != null) {
            zg0 zg0Var = my0Var.f26814z0;
            if (zg0Var != null) {
                i11 = zg0Var.j();
            }
            dialogPhotos.loadAfter(i9 - i11, z10);
        }
    }

    @Override
    public final void c(float f10, int i9, int i10) {
        ImageLocation imageLocation;
        org.telegram.ui.my0 my0Var = this.f32697a;
        zg0 zg0Var = my0Var.f26814z0;
        ArrayList arrayList = my0Var.S0;
        my0Var.B(f10, i9);
        if (i10 == 0) {
            int k10 = zg0Var.k(i9);
            my0Var.getCurrentItemView();
            int childCount = my0Var.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = my0Var.getChildAt(i11);
                if (childAt instanceof o9) {
                    int k11 = zg0Var.k(zg0Var.d.indexOf(childAt));
                    ImageReceiver imageReceiver = ((o9) childAt).getImageReceiver();
                    boolean allowStartAnimation = imageReceiver.getAllowStartAnimation();
                    if (k11 >= 0 && k11 < arrayList.size()) {
                        if (k11 == k10) {
                            if (!allowStartAnimation) {
                                imageReceiver.setAllowStartAnimation(true);
                                imageReceiver.startAnimation();
                            }
                            ImageLocation imageLocation2 = (ImageLocation) arrayList.get(k11);
                            if (imageLocation2 != null) {
                                FileLoader.getInstance(my0Var.H0).setForceStreamLoadingFile(imageLocation2.location, "mp4");
                            }
                        } else if (allowStartAnimation) {
                            x5 animation = imageReceiver.getAnimation();
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
    public final void d(int i9) {
    }
}

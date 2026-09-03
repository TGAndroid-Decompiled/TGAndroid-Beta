package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class ht0 extends AnimatorListenerAdapter {
    public final int f37475a;
    public final PhotoViewer f37476b;

    public ht0(PhotoViewer photoViewer, int i10) {
        this.f37476b = photoViewer;
        this.f37475a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10;
        ou0 ou0Var;
        int i11;
        boolean z10;
        PhotoViewer photoViewer = this.f37476b;
        int i12 = photoViewer.f34379r4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.f34450z1.a();
            zf.n nVar = photoViewer.f34450z1.f25240b;
            nVar.d = null;
            nVar.G = false;
            photoViewer.R0.setVisibility(8);
            photoViewer.f34450z1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.f34450z1.f25240b.f51201a;
            cropAreaView.f24860k0 = 0.0f;
            cropAreaView.f24861l0 = 1.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.f24863n0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f34230b0.removeView(photoViewer.F1);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            photoViewer.F1 = null;
        } else if (i12 == 3) {
            photoViewer.I1.n0(false);
            try {
                photoViewer.f34230b0.removeView(photoViewer.I1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.I1 = null;
        } else if (i12 == 4) {
            photoViewer.L1 = true;
            photoViewer.f34230b0.invalidate();
            photoViewer.f34230b0.post(new pr0(3, this, photoViewer.K1));
            photoViewer.K1 = null;
            photoViewer.f34390s5.m(false, true);
            photoViewer.f34398t5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f34343n5.setVisibility(8);
            org.telegram.ui.Components.qf0 qf0Var = photoViewer.f34343n5;
            qf0Var.d = null;
            qf0Var.f30400a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f34334m6 = null;
        int i14 = photoViewer.f34379r4;
        photoViewer.f34379r4 = this.f37475a;
        qh.h3 h3Var = photoViewer.f1().I;
        if (photoViewer.f34379r4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        h3Var.b(z4);
        qh.h3 h3Var2 = photoViewer.H1;
        if (h3Var2 != null) {
            if (photoViewer.f34379r4 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            h3Var2.b(z10);
        }
        if (photoViewer.f34379r4 != 3) {
            photoViewer.W5 = 0.0f;
        }
        if (photoViewer.Z1 == 1) {
            photoViewer.f34450z1.setVisibility(0);
        }
        if (photoViewer.Z1 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.Z5 = photoViewer.e6;
            photoViewer.f34226a6 = photoViewer.f34273f6;
            photoViewer.f34236b6 = photoViewer.f34282g6;
            photoViewer.f34245c6 = photoViewer.f34291h6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f34236b6 = r22;
            photoViewer.X5 = r22;
            photoViewer.w3(r22);
            photoViewer.Z5 = 0.0f;
            photoViewer.f34226a6 = 0.0f;
        }
        photoViewer.f34326l6 = -1;
        photoViewer.f34230b0.invalidate();
        tu0 tu0Var = photoViewer.f34274f7;
        if (tu0Var != null) {
            PhotoViewer photoViewer2 = tu0Var.d;
            photoViewer2.d = tu0Var.f41642c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f34221a0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f34248d0.setFocusable(false);
            photoViewer2.f34230b0.setFocusable(false);
            photoViewer2.I0.setAlpha(255);
            photoViewer2.f34230b0.setAlpha(1.0f);
            ArrayList arrayList = tu0Var.f41641b;
            int i15 = tu0Var.f41640a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, tu0Var.f41642c.E((MessageObject) arrayList.get(i15), null, tu0Var.f41640a, true, false));
            photoViewer.f34274f7 = null;
            xt0 xt0Var = new xt0();
            xt0Var.f43452c = false;
            photoViewer.k3(false, false, xt0Var);
            photoViewer.k3(true, true, xt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        eg.q1 q1Var = photoViewer.M0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(q1Var, property, 0.0f));
        eg.q1 q1Var2 = photoViewer.M0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(q1Var2, property2, 1.0f));
        eg.o3 o3Var = photoViewer.f34333m5;
        if (o3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o3Var, property2, 1.0f));
        }
        oh.b3 b3Var = photoViewer.f34361p5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property, 0.0f));
        if (photoViewer.Z1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C, property, 0.0f));
        }
        if (photoViewer.f34269f2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N1, property, 0.0f));
        }
        int i16 = photoViewer.Z1;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f34450z1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.L0, property2, 1.0f));
        }
        if (photoViewer.f34231b1.getTag() != null) {
            org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f34231b1;
            if (photoViewer.a2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            l0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f34231b1, property2, 1.0f));
        }
        if (photoViewer.f34241c1.getTag() != null) {
            org.telegram.ui.Components.i90 i90Var = photoViewer.f34241c1;
            if (!photoViewer.a2 && photoViewer.G4 && ((ou0Var = photoViewer.d) == null || ou0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            i90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f34241c1, property2, 1.0f));
        }
        if (photoViewer.f34249d1.getTag() != null) {
            ks0 ks0Var = photoViewer.f34249d1;
            if (!photoViewer.a2) {
                i13 = 0;
            }
            ks0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f34249d1, property2, 1.0f));
        }
        View view = photoViewer.f34276g0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f34276g0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new gt0(this, i14));
        animatorSet.start();
    }
}

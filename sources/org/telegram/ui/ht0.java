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
    public final int f34750a;
    public final PhotoViewer f34751b;

    public ht0(PhotoViewer photoViewer, int i10) {
        this.f34751b = photoViewer;
        this.f34750a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10;
        ou0 ou0Var;
        int i11;
        boolean z10;
        PhotoViewer photoViewer = this.f34751b;
        int i12 = photoViewer.f31827r4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.f31898z1.a();
            yf.n nVar = photoViewer.f31898z1.f31372b;
            nVar.d = null;
            nVar.G = false;
            photoViewer.R0.setVisibility(8);
            photoViewer.f31898z1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.f31898z1.f31372b.f47310a;
            cropAreaView.f22983k0 = 0.0f;
            cropAreaView.f22984l0 = 1.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.f22986n0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31679b0.removeView(photoViewer.F1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.F1 = null;
        } else if (i12 == 3) {
            photoViewer.I1.n0(false);
            try {
                photoViewer.f31679b0.removeView(photoViewer.I1.getView());
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            photoViewer.I1 = null;
        } else if (i12 == 4) {
            photoViewer.L1 = true;
            photoViewer.f31679b0.invalidate();
            photoViewer.f31679b0.post(new gr0(4, this, photoViewer.K1));
            photoViewer.K1 = null;
            photoViewer.f31838s5.m(false, true);
            photoViewer.f31846t5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31791n5.setVisibility(8);
            org.telegram.ui.Components.pf0 pf0Var = photoViewer.f31791n5;
            pf0Var.d = null;
            pf0Var.f27844a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31782m6 = null;
        int i14 = photoViewer.f31827r4;
        photoViewer.f31827r4 = this.f34750a;
        ph.i3 i3Var = photoViewer.f1().I;
        if (photoViewer.f31827r4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        i3Var.b(z4);
        ph.i3 i3Var2 = photoViewer.H1;
        if (i3Var2 != null) {
            if (photoViewer.f31827r4 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            i3Var2.b(z10);
        }
        if (photoViewer.f31827r4 != 3) {
            photoViewer.W5 = 0.0f;
        }
        if (photoViewer.Z1 == 1) {
            photoViewer.f31898z1.setVisibility(0);
        }
        if (photoViewer.Z1 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.Z5 = photoViewer.e6;
            photoViewer.f31675a6 = photoViewer.f31721f6;
            photoViewer.f31685b6 = photoViewer.f31730g6;
            photoViewer.f31694c6 = photoViewer.f31739h6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f31685b6 = r22;
            photoViewer.X5 = r22;
            photoViewer.w3(r22);
            photoViewer.Z5 = 0.0f;
            photoViewer.f31675a6 = 0.0f;
        }
        photoViewer.f31774l6 = -1;
        photoViewer.f31679b0.invalidate();
        tu0 tu0Var = photoViewer.f31722f7;
        if (tu0Var != null) {
            PhotoViewer photoViewer2 = tu0Var.d;
            photoViewer2.d = tu0Var.f38592c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31670a0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31697d0.setFocusable(false);
            photoViewer2.f31679b0.setFocusable(false);
            photoViewer2.I0.setAlpha(255);
            photoViewer2.f31679b0.setAlpha(1.0f);
            ArrayList arrayList = tu0Var.f38591b;
            int i15 = tu0Var.f38590a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, tu0Var.f38592c.E((MessageObject) arrayList.get(i15), null, tu0Var.f38590a, true, false));
            photoViewer.f31722f7 = null;
            xt0 xt0Var = new xt0();
            xt0Var.f40069c = false;
            photoViewer.k3(false, false, xt0Var);
            photoViewer.k3(true, true, xt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        dg.s1 s1Var = photoViewer.M0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(s1Var, property, 0.0f));
        dg.s1 s1Var2 = photoViewer.M0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(s1Var2, property2, 1.0f));
        dg.q3 q3Var = photoViewer.f31781m5;
        if (q3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(q3Var, property2, 1.0f));
        }
        nh.a3 a3Var = photoViewer.f31809p5;
        if (a3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(a3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property, 0.0f));
        if (photoViewer.Z1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C, property, 0.0f));
        }
        if (photoViewer.f31717f2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N1, property, 0.0f));
        }
        int i16 = photoViewer.Z1;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31898z1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.L0, property2, 1.0f));
        }
        if (photoViewer.f31680b1.getTag() != null) {
            org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f31680b1;
            if (photoViewer.a2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            l0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31680b1, property2, 1.0f));
        }
        if (photoViewer.f31690c1.getTag() != null) {
            org.telegram.ui.Components.h90 h90Var = photoViewer.f31690c1;
            if (!photoViewer.a2 && photoViewer.G4 && ((ou0Var = photoViewer.d) == null || ou0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31690c1, property2, 1.0f));
        }
        if (photoViewer.f31698d1.getTag() != null) {
            ks0 ks0Var = photoViewer.f31698d1;
            if (!photoViewer.a2) {
                i13 = 0;
            }
            ks0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31698d1, property2, 1.0f));
        }
        View view = photoViewer.f31724g0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31724g0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new gt0(this, i14));
        animatorSet.start();
    }
}

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
public final class dt0 extends AnimatorListenerAdapter {
    public final int f36320a;
    public final PhotoViewer f36321b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f36321b = photoViewer;
        this.f36320a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ju0 ju0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f36321b;
        int i12 = photoViewer.f33411u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.p pVar = photoViewer.C1.f28747b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f28747b.f16911a;
            cropAreaView.f24195n0 = 0.0f;
            cropAreaView.f24196o0 = 1.0f;
            cropAreaView.f24197p0 = 0.0f;
            cropAreaView.f24198q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33266e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33266e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33266e0.invalidate();
            photoViewer.f33266e0.post(new zg0(25, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33421v5.m(false, true);
            photoViewer.f33431w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33375q5.setVisibility(8);
            org.telegram.ui.Components.dg0 dg0Var = photoViewer.f33375q5;
            dg0Var.d = null;
            dg0Var.f25583a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33367p6 = null;
        int i14 = photoViewer.f33411u4;
        photoViewer.f33411u4 = this.f36320a;
        ei.b4 b4Var = photoViewer.f1().L;
        if (photoViewer.f33411u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b4Var.b(z10);
        ei.b4 b4Var2 = photoViewer.K1;
        if (b4Var2 != null) {
            if (photoViewer.f33411u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            b4Var2.b(z11);
        }
        if (photoViewer.f33411u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33250c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33250c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33254c6 = photoViewer.f33298h6;
            photoViewer.f33263d6 = photoViewer.f33307i6;
            photoViewer.f33272e6 = photoViewer.f33316j6;
            photoViewer.f33281f6 = photoViewer.f33325k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f33272e6 = r22;
            photoViewer.f33234a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f33254c6 = 0.0f;
            photoViewer.f33263d6 = 0.0f;
        }
        photoViewer.f33359o6 = -1;
        photoViewer.f33266e0.invalidate();
        ou0 ou0Var = photoViewer.f33308i7;
        if (ou0Var != null) {
            PhotoViewer photoViewer2 = ou0Var.d;
            photoViewer2.d = ou0Var.f39887c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33257d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33283g0.setFocusable(false);
            photoViewer2.f33266e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33266e0.setAlpha(1.0f);
            ArrayList arrayList = ou0Var.f39886b;
            int i15 = ou0Var.f39885a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, ou0Var.f39887c.E((MessageObject) arrayList.get(i15), null, ou0Var.f39885a, true, false));
            photoViewer.f33308i7 = null;
            tt0 tt0Var = new tt0();
            tt0Var.f41822c = false;
            photoViewer.k3(false, false, tt0Var);
            photoViewer.k3(true, true, tt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        ai.n5 n5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(n5Var, property, 0.0f));
        ai.n5 n5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(n5Var2, property2, 1.0f));
        rg.m2 m2Var = photoViewer.p5;
        if (m2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(m2Var, property2, 1.0f));
        }
        ci.i3 i3Var = photoViewer.f33394s5;
        if (i3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(i3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33250c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33303i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33250c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33267e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33267e1;
            if (photoViewer.f33259d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33267e1, property2, 1.0f));
        }
        if (photoViewer.f33276f1.getTag() != null) {
            org.telegram.ui.Components.z90 z90Var = photoViewer.f33276f1;
            if (!photoViewer.f33259d2 && photoViewer.J4 && ((ju0Var = photoViewer.d) == null || ju0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33276f1, property2, 1.0f));
        }
        if (photoViewer.f33284g1.getTag() != null) {
            hs0 hs0Var = photoViewer.f33284g1;
            if (!photoViewer.f33259d2) {
                i13 = 0;
            }
            hs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33284g1, property2, 1.0f));
        }
        View view = photoViewer.f33310j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33310j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ct0(this, i14));
        animatorSet.start();
    }
}

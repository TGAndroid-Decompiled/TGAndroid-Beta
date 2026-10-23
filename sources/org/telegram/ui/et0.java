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
public final class et0 extends AnimatorListenerAdapter {
    public final int f37023a;
    public final PhotoViewer f37024b;

    public et0(PhotoViewer photoViewer, int i10) {
        this.f37024b = photoViewer;
        this.f37023a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ku0 ku0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f37024b;
        int i12 = photoViewer.f33725u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.p pVar = photoViewer.C1.f30163b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f30163b.f16980a;
            cropAreaView.f24344n0 = 0.0f;
            cropAreaView.f24345o0 = 1.0f;
            cropAreaView.f24346p0 = 0.0f;
            cropAreaView.f24347q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33580e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f33580e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33580e0.invalidate();
            photoViewer.f33580e0.post(new bh0(25, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33735v5.m(false, true);
            photoViewer.f33745w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33689q5.setVisibility(8);
            org.telegram.ui.Components.ig0 ig0Var = photoViewer.f33689q5;
            ig0Var.d = null;
            ig0Var.f27313a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33681p6 = null;
        int i14 = photoViewer.f33725u4;
        photoViewer.f33725u4 = this.f37023a;
        ei.b4 b4Var = photoViewer.g1().L;
        if (photoViewer.f33725u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b4Var.b(z10);
        ei.b4 b4Var2 = photoViewer.K1;
        if (b4Var2 != null) {
            if (photoViewer.f33725u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            b4Var2.b(z11);
        }
        if (photoViewer.f33725u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33564c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33564c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33568c6 = photoViewer.f33612h6;
            photoViewer.f33577d6 = photoViewer.f33621i6;
            photoViewer.f33586e6 = photoViewer.f33630j6;
            photoViewer.f33595f6 = photoViewer.f33639k6;
        } else {
            float t22 = photoViewer.t2(false);
            photoViewer.f33586e6 = t22;
            photoViewer.f33548a6 = t22;
            photoViewer.y3(t22);
            photoViewer.f33568c6 = 0.0f;
            photoViewer.f33577d6 = 0.0f;
        }
        photoViewer.f33673o6 = -1;
        photoViewer.f33580e0.invalidate();
        pu0 pu0Var = photoViewer.f33622i7;
        if (pu0Var != null) {
            PhotoViewer photoViewer2 = pu0Var.d;
            photoViewer2.d = pu0Var.f40545c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33571d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33597g0.setFocusable(false);
            photoViewer2.f33580e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33580e0.setAlpha(1.0f);
            ArrayList arrayList = pu0Var.f40544b;
            int i15 = pu0Var.f40543a;
            photoViewer2.b2(null, null, null, null, arrayList, null, null, i15, pu0Var.f40545c.E((MessageObject) arrayList.get(i15), null, pu0Var.f40543a, true, false));
            photoViewer.f33622i7 = null;
            ut0 ut0Var = new ut0();
            ut0Var.f42501c = false;
            photoViewer.m3(false, false, ut0Var);
            photoViewer.m3(true, true, ut0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        ai.o5 o5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(o5Var, property, 0.0f));
        ai.o5 o5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(o5Var2, property2, 1.0f));
        rg.o2 o2Var = photoViewer.p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, property2, 1.0f));
        }
        ci.h3 h3Var = photoViewer.f33708s5;
        if (h3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(h3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33564c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33617i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33564c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33581e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33581e1;
            if (photoViewer.f33573d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33581e1, property2, 1.0f));
        }
        if (photoViewer.f33590f1.getTag() != null) {
            org.telegram.ui.Components.aa0 aa0Var = photoViewer.f33590f1;
            if (!photoViewer.f33573d2 && photoViewer.J4 && ((ku0Var = photoViewer.d) == null || ku0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            aa0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33590f1, property2, 1.0f));
        }
        if (photoViewer.f33598g1.getTag() != null) {
            is0 is0Var = photoViewer.f33598g1;
            if (!photoViewer.f33573d2) {
                i13 = 0;
            }
            is0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33598g1, property2, 1.0f));
        }
        View view = photoViewer.f33624j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33624j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new dt0(this, i14));
        animatorSet.start();
    }
}

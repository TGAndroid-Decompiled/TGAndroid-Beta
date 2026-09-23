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
public final class ot0 extends AnimatorListenerAdapter {
    public final int f35956a;
    public final PhotoViewer f35957b;

    public ot0(PhotoViewer photoViewer, int i10) {
        this.f35957b = photoViewer;
        this.f35956a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        uu0 uu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f35957b;
        int i12 = photoViewer.f31052u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f28468b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f28468b.f14088a;
            cropAreaView.f21991n0 = 0.0f;
            cropAreaView.f21992o0 = 1.0f;
            cropAreaView.f21993p0 = 0.0f;
            cropAreaView.f21994q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f30908e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f30908e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f30908e0.invalidate();
            photoViewer.f30908e0.post(new gl0(17, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f31062v5.m(false, true);
            photoViewer.f31072w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31016q5.setVisibility(8);
            org.telegram.ui.Components.kf0 kf0Var = photoViewer.f31016q5;
            kf0Var.d = null;
            kf0Var.f25590a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31008p6 = null;
        int i14 = photoViewer.f31052u4;
        photoViewer.f31052u4 = this.f35956a;
        ci.i4 i4Var = photoViewer.f1().L;
        if (photoViewer.f31052u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4Var.b(z10);
        ci.i4 i4Var2 = photoViewer.K1;
        if (i4Var2 != null) {
            if (photoViewer.f31052u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var2.b(z11);
        }
        if (photoViewer.f31052u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f30892c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f30892c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f30896c6 = photoViewer.f30940h6;
            photoViewer.f30905d6 = photoViewer.f30949i6;
            photoViewer.f30914e6 = photoViewer.f30957j6;
            photoViewer.f30923f6 = photoViewer.f30966k6;
        } else {
            float q22 = photoViewer.q2(false);
            photoViewer.f30914e6 = q22;
            photoViewer.f30876a6 = q22;
            photoViewer.v3(q22);
            photoViewer.f30896c6 = 0.0f;
            photoViewer.f30905d6 = 0.0f;
        }
        photoViewer.f31000o6 = -1;
        photoViewer.f30908e0.invalidate();
        zu0 zu0Var = photoViewer.f30950i7;
        if (zu0Var != null) {
            PhotoViewer photoViewer2 = zu0Var.d;
            photoViewer2.d = zu0Var.f40251c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f30899d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f30925g0.setFocusable(false);
            photoViewer2.f30908e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f30908e0.setAlpha(1.0f);
            ArrayList arrayList = zu0Var.f40250b;
            int i15 = zu0Var.f40249a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, zu0Var.f40251c.E((MessageObject) arrayList.get(i15), null, zu0Var.f40249a, true, false));
            photoViewer.f30950i7 = null;
            eu0 eu0Var = new eu0();
            eu0Var.f33024c = false;
            photoViewer.j3(false, false, eu0Var);
            photoViewer.j3(true, true, eu0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        u5 u5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(u5Var, property, 0.0f));
        u5 u5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(u5Var2, property2, 1.0f));
        qg.p2 p2Var = photoViewer.p5;
        if (p2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(p2Var, property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.f31035s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f30892c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f30945i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f30892c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f30909e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f30909e1;
            if (photoViewer.f30901d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30909e1, property2, 1.0f));
        }
        if (photoViewer.f30918f1.getTag() != null) {
            org.telegram.ui.Components.f90 f90Var = photoViewer.f30918f1;
            if (!photoViewer.f30901d2 && photoViewer.J4 && ((uu0Var = photoViewer.d) == null || uu0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            f90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30918f1, property2, 1.0f));
        }
        if (photoViewer.f30926g1.getTag() != null) {
            ss0 ss0Var = photoViewer.f30926g1;
            if (!photoViewer.f30901d2) {
                i13 = 0;
            }
            ss0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30926g1, property2, 1.0f));
        }
        View view = photoViewer.f30952j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f30952j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new nt0(this, i14));
        animatorSet.start();
    }
}

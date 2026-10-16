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
public final class bu0 extends AnimatorListenerAdapter {
    public final int f34388a;
    public final PhotoViewer f34389b;

    public bu0(PhotoViewer photoViewer, int i10) {
        this.f34389b = photoViewer;
        this.f34388a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        hv0 hv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f34389b;
        int i12 = photoViewer.f32073u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.p pVar = photoViewer.C1.f29367b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f29367b.f15559a;
            cropAreaView.f22840n0 = 0.0f;
            cropAreaView.f22841o0 = 1.0f;
            cropAreaView.f22842p0 = 0.0f;
            cropAreaView.f22843q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31928e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f31928e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f31928e0.invalidate();
            photoViewer.f31928e0.post(new rr0(7, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f32083v5.m(false, true);
            photoViewer.f32093w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f32037q5.setVisibility(8);
            org.telegram.ui.Components.kg0 kg0Var = photoViewer.f32037q5;
            kg0Var.d = null;
            kg0Var.f26385a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f32029p6 = null;
        int i14 = photoViewer.f32073u4;
        photoViewer.f32073u4 = this.f34388a;
        di.h4 h4Var = photoViewer.f1().L;
        if (photoViewer.f32073u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4Var.b(z10);
        di.h4 h4Var2 = photoViewer.K1;
        if (h4Var2 != null) {
            if (photoViewer.f32073u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h4Var2.b(z11);
        }
        if (photoViewer.f32073u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f31912c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f31912c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f31916c6 = photoViewer.f31960h6;
            photoViewer.f31925d6 = photoViewer.f31969i6;
            photoViewer.f31934e6 = photoViewer.f31978j6;
            photoViewer.f31943f6 = photoViewer.f31987k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f31934e6 = r22;
            photoViewer.f31896a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f31916c6 = 0.0f;
            photoViewer.f31925d6 = 0.0f;
        }
        photoViewer.f32021o6 = -1;
        photoViewer.f31928e0.invalidate();
        mv0 mv0Var = photoViewer.f31970i7;
        if (mv0Var != null) {
            PhotoViewer photoViewer2 = mv0Var.d;
            photoViewer2.d = mv0Var.f38077c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31919d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31945g0.setFocusable(false);
            photoViewer2.f31928e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f31928e0.setAlpha(1.0f);
            ArrayList arrayList = mv0Var.f38076b;
            int i15 = mv0Var.f38075a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, mv0Var.f38077c.E((MessageObject) arrayList.get(i15), null, mv0Var.f38075a, true, false));
            photoViewer.f31970i7 = null;
            ru0 ru0Var = new ru0();
            ru0Var.f39590c = false;
            photoViewer.k3(false, false, ru0Var);
            photoViewer.k3(true, true, ru0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        x5 x5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(x5Var, property, 0.0f));
        x5 x5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(x5Var2, property2, 1.0f));
        rg.p2 p2Var = photoViewer.p5;
        if (p2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(p2Var, property2, 1.0f));
        }
        bi.d4 d4Var = photoViewer.f32056s5;
        if (d4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(d4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f31912c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f31965i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f31912c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f31929e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f31929e1;
            if (photoViewer.f31921d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31929e1, property2, 1.0f));
        }
        if (photoViewer.f31938f1.getTag() != null) {
            org.telegram.ui.Components.fa0 fa0Var = photoViewer.f31938f1;
            if (!photoViewer.f31921d2 && photoViewer.J4 && ((hv0Var = photoViewer.d) == null || hv0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fa0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31938f1, property2, 1.0f));
        }
        if (photoViewer.f31946g1.getTag() != null) {
            ft0 ft0Var = photoViewer.f31946g1;
            if (!photoViewer.f31921d2) {
                i13 = 0;
            }
            ft0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31946g1, property2, 1.0f));
        }
        View view = photoViewer.f31972j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31972j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new au0(this, i14));
        animatorSet.start();
    }
}

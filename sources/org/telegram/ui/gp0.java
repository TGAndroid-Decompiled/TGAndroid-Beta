package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class gp0 extends AnimatorListenerAdapter {
    public final int f45689a;
    public final PhotoViewer f45690b;

    public gp0(PhotoViewer photoViewer, int i3) {
        this.f45690b = photoViewer;
        this.f45689a = i3;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i3;
        kq0 kq0Var;
        int i10;
        boolean z11;
        PhotoViewer photoViewer = this.f45690b;
        int i11 = photoViewer.f41562v4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.D1.a();
            pg.m mVar = photoViewer.D1.f31808b;
            mVar.d = null;
            mVar.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.f31808b.f53511a;
            cropAreaView.f31388o0 = 0.0f;
            cropAreaView.f31389p0 = 1.0f;
            cropAreaView.f31390q0 = 0.0f;
            cropAreaView.f31392r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f41420f0.removeView(photoViewer.J1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.J1 = null;
        } else if (i11 == 3) {
            photoViewer.M1.m0(false);
            try {
                photoViewer.f41420f0.removeView(photoViewer.M1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.M1 = null;
        } else if (i11 == 4) {
            photoViewer.P1 = true;
            photoViewer.f41420f0.invalidate();
            photoViewer.f41420f0.post(new hk0(8, this, photoViewer.O1));
            photoViewer.O1 = null;
            photoViewer.f41573w5.m(false, true);
            photoViewer.f41583x5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.r5.setVisibility(8);
            org.telegram.ui.Components.od0 od0Var = photoViewer.r5;
            od0Var.d = null;
            od0Var.f36806a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f41519q6 = null;
        int i13 = photoViewer.f41562v4;
        photoViewer.f41562v4 = this.f45689a;
        gi.p3 p3Var = photoViewer.h1().M;
        if (photoViewer.f41562v4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p3Var.b(z10);
        gi.p3 p3Var2 = photoViewer.L1;
        if (p3Var2 != null) {
            if (photoViewer.f41562v4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            p3Var2.b(z11);
        }
        if (photoViewer.f41562v4 != 3) {
            photoViewer.f41378a6 = 0.0f;
        }
        if (photoViewer.f41402d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.f41402d2 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.f41406d6 = photoViewer.f41450i6;
            photoViewer.f41416e6 = photoViewer.f41459j6;
            photoViewer.f41426f6 = photoViewer.f41467k6;
            photoViewer.f41435g6 = photoViewer.f41476l6;
        } else {
            float u22 = photoViewer.u2(false);
            photoViewer.f41426f6 = u22;
            photoViewer.f41388b6 = u22;
            photoViewer.z3(u22);
            photoViewer.f41406d6 = 0.0f;
            photoViewer.f41416e6 = 0.0f;
        }
        photoViewer.f41510p6 = -1;
        photoViewer.f41420f0.invalidate();
        oq0 oq0Var = photoViewer.f41460j7;
        if (oq0Var != null) {
            PhotoViewer photoViewer2 = oq0Var.d;
            photoViewer2.d = oq0Var.f48333c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f41410e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f41437h0.setFocusable(false);
            photoViewer2.f41420f0.setFocusable(false);
            photoViewer2.M0.setAlpha(255);
            photoViewer2.f41420f0.setAlpha(1.0f);
            ArrayList arrayList = oq0Var.f48332b;
            int i14 = oq0Var.f48331a;
            photoViewer2.c2(null, null, null, null, arrayList, null, null, i14, oq0Var.f48333c.E((org.telegram.messenger.zi) arrayList.get(i14), null, oq0Var.f48331a, true, false));
            photoViewer.f41460j7 = null;
            wp0 wp0Var = new wp0();
            wp0Var.f51587c = false;
            photoViewer.n3(false, false, wp0Var);
            photoViewer.n3(true, true, wp0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        ci.t4 t4Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(t4Var, property, 0.0f));
        ci.t4 t4Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(t4Var2, property2, 1.0f));
        ug.c2 c2Var = photoViewer.f41518q5;
        if (c2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(c2Var, property2, 1.0f));
        }
        ei.e3 e3Var = photoViewer.f41545t5;
        if (e3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(e3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, property, 0.0f));
        if (photoViewer.f41402d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, property, 0.0f));
        }
        if (photoViewer.f41455j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, property, 0.0f));
        }
        int i15 = photoViewer.f41402d2;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property2, 1.0f));
        }
        if (photoViewer.f41421f1.getTag() != null) {
            org.telegram.ui.ActionBar.e0 e0Var = photoViewer.f41421f1;
            if (photoViewer.f41412e2) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            e0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41421f1, property2, 1.0f));
        }
        if (photoViewer.f41430g1.getTag() != null) {
            org.telegram.ui.Components.u70 u70Var = photoViewer.f41430g1;
            if (!photoViewer.f41412e2 && photoViewer.K4 && ((kq0Var = photoViewer.d) == null || kq0Var.O())) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            u70Var.setVisibility(i3);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41430g1, property2, 1.0f));
        }
        if (photoViewer.f41438h1.getTag() != null) {
            oo0 oo0Var = photoViewer.f41438h1;
            if (!photoViewer.f41412e2) {
                i12 = 0;
            }
            oo0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41438h1, property2, 1.0f));
        }
        View view = photoViewer.f41462k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41462k0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new fp0(this, i13));
        animatorSet.start();
    }
}

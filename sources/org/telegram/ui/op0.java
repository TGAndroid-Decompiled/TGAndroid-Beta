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
public final class op0 extends AnimatorListenerAdapter {
    public final int f50043a;
    public final PhotoViewer f50044b;

    public op0(PhotoViewer photoViewer, int i7) {
        this.f50044b = photoViewer;
        this.f50043a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7;
        sq0 sq0Var;
        int i10;
        boolean z11;
        PhotoViewer photoViewer = this.f50044b;
        int i11 = photoViewer.f42896u4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.D1.a();
            og.o oVar = photoViewer.D1.f34907b;
            oVar.d = null;
            oVar.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.f34907b.f21530a;
            cropAreaView.f32495o0 = 0.0f;
            cropAreaView.f32496p0 = 1.0f;
            cropAreaView.f32497q0 = 0.0f;
            cropAreaView.f32499r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f42763f0.removeView(photoViewer.J1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.J1 = null;
        } else if (i11 == 3) {
            photoViewer.M1.m0(false);
            try {
                photoViewer.f42763f0.removeView(photoViewer.M1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.M1 = null;
        } else if (i11 == 4) {
            photoViewer.P1 = true;
            photoViewer.f42763f0.invalidate();
            photoViewer.f42763f0.post(new mp0(0, this, photoViewer.O1));
            photoViewer.O1 = null;
            photoViewer.f42906v5.m(false, true);
            photoViewer.f42916w5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.f42861q5.setVisibility(8);
            org.telegram.ui.Components.ud0 ud0Var = photoViewer.f42861q5;
            ud0Var.d = null;
            ud0Var.f39999a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f42853p6 = null;
        int i13 = photoViewer.f42896u4;
        photoViewer.f42896u4 = this.f50043a;
        hi.p3 p3Var = photoViewer.b1().M;
        if (photoViewer.f42896u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        p3Var.b(z10);
        hi.p3 p3Var2 = photoViewer.L1;
        if (p3Var2 != null) {
            if (photoViewer.f42896u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            p3Var2.b(z11);
        }
        if (photoViewer.f42896u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.f42741c6 = photoViewer.f42787h6;
            photoViewer.f42749d6 = photoViewer.f42795i6;
            photoViewer.f42759e6 = photoViewer.f42802j6;
            photoViewer.f42769f6 = photoViewer.f42811k6;
        } else {
            float p22 = photoViewer.p2(false);
            photoViewer.f42759e6 = p22;
            photoViewer.f42721a6 = p22;
            photoViewer.u3(p22);
            photoViewer.f42741c6 = 0.0f;
            photoViewer.f42749d6 = 0.0f;
        }
        photoViewer.f42844o6 = -1;
        photoViewer.f42763f0.invalidate();
        wq0 wq0Var = photoViewer.i7;
        if (wq0Var != null) {
            PhotoViewer photoViewer2 = wq0Var.d;
            photoViewer2.d = wq0Var.f52985c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f42753e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f42781h0.setFocusable(false);
            photoViewer2.f42763f0.setFocusable(false);
            photoViewer2.M0.setAlpha(255);
            photoViewer2.f42763f0.setAlpha(1.0f);
            ArrayList arrayList = wq0Var.f52984b;
            int i14 = wq0Var.f52983a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i14, wq0Var.f52985c.E((org.telegram.messenger.gj) arrayList.get(i14), null, wq0Var.f52983a, true, false));
            photoViewer.i7 = null;
            eq0 eq0Var = new eq0();
            eq0Var.f46898c = false;
            photoViewer.i3(false, false, eq0Var);
            photoViewer.i3(true, true, eq0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        di.k4 k4Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(k4Var, property, 0.0f));
        di.k4 k4Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(k4Var2, property2, 1.0f));
        tg.f2 f2Var = photoViewer.f42852p5;
        if (f2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(f2Var, property2, 1.0f));
        }
        fi.w2 w2Var = photoViewer.s5;
        if (w2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(w2Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, property, 0.0f));
        }
        if (photoViewer.f42799j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, property, 0.0f));
        }
        int i15 = photoViewer.d2;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property2, 1.0f));
        }
        if (photoViewer.f42764f1.getTag() != null) {
            org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f42764f1;
            if (photoViewer.f42755e2) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            f0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f42764f1, property2, 1.0f));
        }
        if (photoViewer.f42773g1.getTag() != null) {
            org.telegram.ui.Components.b80 b80Var = photoViewer.f42773g1;
            if (!photoViewer.f42755e2 && photoViewer.J4 && ((sq0Var = photoViewer.d) == null || sq0Var.O())) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            b80Var.setVisibility(i7);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f42773g1, property2, 1.0f));
        }
        if (photoViewer.f42782h1.getTag() != null) {
            vo0 vo0Var = photoViewer.f42782h1;
            if (!photoViewer.f42755e2) {
                i12 = 0;
            }
            vo0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f42782h1, property2, 1.0f));
        }
        View view = photoViewer.f42805k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f42805k0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new np0(this, i13));
        animatorSet.start();
    }
}

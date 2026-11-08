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
public final class pp0 extends AnimatorListenerAdapter {
    public final int f48905a;
    public final PhotoViewer f48906b;

    public pp0(PhotoViewer photoViewer, int i7) {
        this.f48906b = photoViewer;
        this.f48905a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7;
        uq0 uq0Var;
        int i10;
        boolean z10;
        PhotoViewer photoViewer = this.f48906b;
        int i11 = photoViewer.f41519t4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.C1.a();
            og.o oVar = photoViewer.C1.f33525b;
            oVar.d = null;
            oVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f33525b.f21007a;
            cropAreaView.f31316n0 = 0.0f;
            cropAreaView.f31317o0 = 1.0f;
            cropAreaView.f31318p0 = 0.0f;
            cropAreaView.f31319q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f41384e0.removeView(photoViewer.I1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.I1 = null;
        } else if (i11 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f41384e0.removeView(photoViewer.L1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.L1 = null;
        } else if (i11 == 4) {
            photoViewer.O1 = true;
            photoViewer.f41384e0.invalidate();
            photoViewer.f41384e0.post(new qn0(4, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f41528u5.m(false, true);
            photoViewer.f41537v5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.f41483p5.setVisibility(8);
            org.telegram.ui.Components.ud0 ud0Var = photoViewer.f41483p5;
            ud0Var.d = null;
            ud0Var.f38613a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f41475o6 = null;
        int i13 = photoViewer.f41519t4;
        photoViewer.f41519t4 = this.f48905a;
        fi.q3 q3Var = photoViewer.a1().L;
        if (photoViewer.f41519t4 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        q3Var.b(z9);
        fi.q3 q3Var2 = photoViewer.K1;
        if (q3Var2 != null) {
            if (photoViewer.f41519t4 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            q3Var2.b(z10);
        }
        if (photoViewer.f41519t4 != 3) {
            photoViewer.Y5 = 0.0f;
        }
        if (photoViewer.f41368c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f41368c2 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.f41362b6 = photoViewer.f41409g6;
            photoViewer.f41372c6 = photoViewer.f41418h6;
            photoViewer.f41380d6 = photoViewer.f41426i6;
            photoViewer.f41390e6 = photoViewer.f41433j6;
        } else {
            float o22 = photoViewer.o2(false);
            photoViewer.f41380d6 = o22;
            photoViewer.Z5 = o22;
            photoViewer.t3(o22);
            photoViewer.f41362b6 = 0.0f;
            photoViewer.f41372c6 = 0.0f;
        }
        photoViewer.f41467n6 = -1;
        photoViewer.f41384e0.invalidate();
        yq0 yq0Var = photoViewer.h7;
        if (yq0Var != null) {
            PhotoViewer photoViewer2 = yq0Var.d;
            photoViewer2.d = yq0Var.f52292c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f41375d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f41403g0.setFocusable(false);
            photoViewer2.f41384e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f41384e0.setAlpha(1.0f);
            ArrayList arrayList = yq0Var.f52291b;
            int i14 = yq0Var.f52290a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i14, yq0Var.f52292c.E((org.telegram.messenger.ij) arrayList.get(i14), null, yq0Var.f52290a, true, false));
            photoViewer.h7 = null;
            fq0 fq0Var = new fq0();
            fq0Var.f45672c = false;
            photoViewer.h3(false, false, fq0Var);
            photoViewer.h3(true, true, fq0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bi.m5 m5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(m5Var, property, 0.0f));
        bi.m5 m5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(m5Var2, property2, 1.0f));
        tg.c2 c2Var = photoViewer.f41474o5;
        if (c2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(c2Var, property2, 1.0f));
        }
        di.b3 b3Var = photoViewer.f41502r5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f41368c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f41422i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i15 = photoViewer.f41368c2;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f41385e1.getTag() != null) {
            org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f41385e1;
            if (photoViewer.d2) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            f0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41385e1, property2, 1.0f));
        }
        if (photoViewer.f41395f1.getTag() != null) {
            org.telegram.ui.Components.y70 y70Var = photoViewer.f41395f1;
            if (!photoViewer.d2 && photoViewer.I4 && ((uq0Var = photoViewer.d) == null || uq0Var.O())) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            y70Var.setVisibility(i7);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41395f1, property2, 1.0f));
        }
        if (photoViewer.f41404g1.getTag() != null) {
            xo0 xo0Var = photoViewer.f41404g1;
            if (!photoViewer.d2) {
                i12 = 0;
            }
            xo0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41404g1, property2, 1.0f));
        }
        View view = photoViewer.f41428j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41428j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new op0(this, i13));
        animatorSet.start();
    }
}

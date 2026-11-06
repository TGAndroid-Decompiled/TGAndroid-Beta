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
    public final int f48439a;
    public final PhotoViewer f48440b;

    public op0(PhotoViewer photoViewer, int i7) {
        this.f48440b = photoViewer;
        this.f48439a = i7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7;
        tq0 tq0Var;
        int i10;
        boolean z10;
        PhotoViewer photoViewer = this.f48440b;
        int i11 = photoViewer.f41491t4;
        int i12 = 8;
        if (i11 == 1) {
            photoViewer.C1.a();
            og.o oVar = photoViewer.C1.f33564b;
            oVar.d = null;
            oVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f33564b.f21004a;
            cropAreaView.f31311n0 = 0.0f;
            cropAreaView.f31312o0 = 1.0f;
            cropAreaView.f31313p0 = 0.0f;
            cropAreaView.f31314q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i11 == 2) {
            try {
                photoViewer.f41356e0.removeView(photoViewer.I1);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            photoViewer.I1 = null;
        } else if (i11 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f41356e0.removeView(photoViewer.L1.getView());
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
            photoViewer.L1 = null;
        } else if (i11 == 4) {
            photoViewer.O1 = true;
            photoViewer.f41356e0.invalidate();
            photoViewer.f41356e0.post(new qn0(4, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f41500u5.m(false, true);
            photoViewer.f41509v5.m(false, true);
        } else if (i11 == 5) {
            photoViewer.f41455p5.setVisibility(8);
            org.telegram.ui.Components.ud0 ud0Var = photoViewer.f41455p5;
            ud0Var.d = null;
            ud0Var.f38611a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f41447o6 = null;
        int i13 = photoViewer.f41491t4;
        photoViewer.f41491t4 = this.f48439a;
        fi.q3 q3Var = photoViewer.a1().L;
        if (photoViewer.f41491t4 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        q3Var.b(z9);
        fi.q3 q3Var2 = photoViewer.K1;
        if (q3Var2 != null) {
            if (photoViewer.f41491t4 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            q3Var2.b(z10);
        }
        if (photoViewer.f41491t4 != 3) {
            photoViewer.Y5 = 0.0f;
        }
        if (photoViewer.f41340c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f41340c2 == 11 && (i13 == 3 || i13 == 2 || i13 == 1 || i13 == 4)) {
            photoViewer.f41334b6 = photoViewer.f41381g6;
            photoViewer.f41344c6 = photoViewer.f41390h6;
            photoViewer.f41352d6 = photoViewer.f41398i6;
            photoViewer.f41362e6 = photoViewer.f41405j6;
        } else {
            float o22 = photoViewer.o2(false);
            photoViewer.f41352d6 = o22;
            photoViewer.Z5 = o22;
            photoViewer.t3(o22);
            photoViewer.f41334b6 = 0.0f;
            photoViewer.f41344c6 = 0.0f;
        }
        photoViewer.f41439n6 = -1;
        photoViewer.f41356e0.invalidate();
        xq0 xq0Var = photoViewer.h7;
        if (xq0Var != null) {
            PhotoViewer photoViewer2 = xq0Var.d;
            photoViewer2.d = xq0Var.f51949c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f41347d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f41375g0.setFocusable(false);
            photoViewer2.f41356e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f41356e0.setAlpha(1.0f);
            ArrayList arrayList = xq0Var.f51948b;
            int i14 = xq0Var.f51947a;
            photoViewer2.X1(null, null, null, null, arrayList, null, null, i14, xq0Var.f51949c.E((org.telegram.messenger.ij) arrayList.get(i14), null, xq0Var.f51947a, true, false));
            photoViewer.h7 = null;
            eq0 eq0Var = new eq0();
            eq0Var.f45371c = false;
            photoViewer.h3(false, false, eq0Var);
            photoViewer.h3(true, true, eq0Var);
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
        tg.c2 c2Var = photoViewer.f41446o5;
        if (c2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(c2Var, property2, 1.0f));
        }
        di.b3 b3Var = photoViewer.f41474r5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f41340c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f41394i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i15 = photoViewer.f41340c2;
        if (i15 != 0 && i15 != 4) {
            if (i15 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f41357e1.getTag() != null) {
            org.telegram.ui.ActionBar.f0 f0Var = photoViewer.f41357e1;
            if (photoViewer.d2) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            f0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41357e1, property2, 1.0f));
        }
        if (photoViewer.f41367f1.getTag() != null) {
            org.telegram.ui.Components.y70 y70Var = photoViewer.f41367f1;
            if (!photoViewer.d2 && photoViewer.I4 && ((tq0Var = photoViewer.d) == null || tq0Var.O())) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            y70Var.setVisibility(i7);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41367f1, property2, 1.0f));
        }
        if (photoViewer.f41376g1.getTag() != null) {
            wo0 wo0Var = photoViewer.f41376g1;
            if (!photoViewer.d2) {
                i12 = 0;
            }
            wo0Var.setVisibility(i12);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41376g1, property2, 1.0f));
        }
        View view = photoViewer.f41400j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f41400j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new np0(this, i13));
        animatorSet.start();
    }
}

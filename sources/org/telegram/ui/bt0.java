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
public final class bt0 extends AnimatorListenerAdapter {
    public final int f35745a;
    public final PhotoViewer f35746b;

    public bt0(PhotoViewer photoViewer, int i10) {
        this.f35746b = photoViewer;
        this.f35745a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        hu0 hu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f35746b;
        int i12 = photoViewer.f33427u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.p pVar = photoViewer.C1.f29040b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f29040b.f16917a;
            cropAreaView.f24202n0 = 0.0f;
            cropAreaView.f24203o0 = 1.0f;
            cropAreaView.f24204p0 = 0.0f;
            cropAreaView.f24205q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33282e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f33282e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33282e0.invalidate();
            photoViewer.f33282e0.post(new xg0(25, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33437v5.m(false, true);
            photoViewer.f33447w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33391q5.setVisibility(8);
            org.telegram.ui.Components.eg0 eg0Var = photoViewer.f33391q5;
            eg0Var.d = null;
            eg0Var.f25899a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33383p6 = null;
        int i14 = photoViewer.f33427u4;
        photoViewer.f33427u4 = this.f35745a;
        ei.b4 b4Var = photoViewer.g1().L;
        if (photoViewer.f33427u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b4Var.b(z10);
        ei.b4 b4Var2 = photoViewer.K1;
        if (b4Var2 != null) {
            if (photoViewer.f33427u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            b4Var2.b(z11);
        }
        if (photoViewer.f33427u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33266c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33266c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33270c6 = photoViewer.f33314h6;
            photoViewer.f33279d6 = photoViewer.f33323i6;
            photoViewer.f33288e6 = photoViewer.f33332j6;
            photoViewer.f33297f6 = photoViewer.f33341k6;
        } else {
            float t22 = photoViewer.t2(false);
            photoViewer.f33288e6 = t22;
            photoViewer.f33250a6 = t22;
            photoViewer.y3(t22);
            photoViewer.f33270c6 = 0.0f;
            photoViewer.f33279d6 = 0.0f;
        }
        photoViewer.f33375o6 = -1;
        photoViewer.f33282e0.invalidate();
        mu0 mu0Var = photoViewer.f33324i7;
        if (mu0Var != null) {
            PhotoViewer photoViewer2 = mu0Var.d;
            photoViewer2.d = mu0Var.f39355c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33273d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33299g0.setFocusable(false);
            photoViewer2.f33282e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33282e0.setAlpha(1.0f);
            ArrayList arrayList = mu0Var.f39354b;
            int i15 = mu0Var.f39353a;
            photoViewer2.b2(null, null, null, null, arrayList, null, null, i15, mu0Var.f39355c.E((MessageObject) arrayList.get(i15), null, mu0Var.f39353a, true, false));
            photoViewer.f33324i7 = null;
            rt0 rt0Var = new rt0();
            rt0Var.f41283c = false;
            photoViewer.m3(false, false, rt0Var);
            photoViewer.m3(true, true, rt0Var);
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
        rg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, property2, 1.0f));
        }
        ci.i3 i3Var = photoViewer.f33410s5;
        if (i3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(i3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33266c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33319i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33266c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33283e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33283e1;
            if (photoViewer.f33275d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33283e1, property2, 1.0f));
        }
        if (photoViewer.f33292f1.getTag() != null) {
            org.telegram.ui.Components.z90 z90Var = photoViewer.f33292f1;
            if (!photoViewer.f33275d2 && photoViewer.J4 && ((hu0Var = photoViewer.d) == null || hu0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            z90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33292f1, property2, 1.0f));
        }
        if (photoViewer.f33300g1.getTag() != null) {
            fs0 fs0Var = photoViewer.f33300g1;
            if (!photoViewer.f33275d2) {
                i13 = 0;
            }
            fs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33300g1, property2, 1.0f));
        }
        View view = photoViewer.f33326j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33326j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new at0(this, i14));
        animatorSet.start();
    }
}

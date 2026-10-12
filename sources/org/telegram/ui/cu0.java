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
public final class cu0 extends AnimatorListenerAdapter {
    public final int f35075a;
    public final PhotoViewer f35076b;

    public cu0(PhotoViewer photoViewer, int i10) {
        this.f35076b = photoViewer;
        this.f35075a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        iv0 iv0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f35076b;
        int i12 = photoViewer.f32371u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.p pVar = photoViewer.C1.f29369b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f29369b.f15824a;
            cropAreaView.f23140n0 = 0.0f;
            cropAreaView.f23141o0 = 1.0f;
            cropAreaView.f23142p0 = 0.0f;
            cropAreaView.f23143q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f32226e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f32226e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f32226e0.invalidate();
            photoViewer.f32226e0.post(new on0(12, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f32381v5.m(false, true);
            photoViewer.f32391w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f32335q5.setVisibility(8);
            org.telegram.ui.Components.jg0 jg0Var = photoViewer.f32335q5;
            jg0Var.d = null;
            jg0Var.f26353a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f32327p6 = null;
        int i14 = photoViewer.f32371u4;
        photoViewer.f32371u4 = this.f35075a;
        di.h4 h4Var = photoViewer.f1().L;
        if (photoViewer.f32371u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4Var.b(z10);
        di.h4 h4Var2 = photoViewer.K1;
        if (h4Var2 != null) {
            if (photoViewer.f32371u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            h4Var2.b(z11);
        }
        if (photoViewer.f32371u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f32210c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f32210c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f32214c6 = photoViewer.f32258h6;
            photoViewer.f32223d6 = photoViewer.f32267i6;
            photoViewer.f32232e6 = photoViewer.f32276j6;
            photoViewer.f32241f6 = photoViewer.f32285k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f32232e6 = r22;
            photoViewer.f32194a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f32214c6 = 0.0f;
            photoViewer.f32223d6 = 0.0f;
        }
        photoViewer.f32319o6 = -1;
        photoViewer.f32226e0.invalidate();
        nv0 nv0Var = photoViewer.f32268i7;
        if (nv0Var != null) {
            PhotoViewer photoViewer2 = nv0Var.d;
            photoViewer2.d = nv0Var.f38802c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f32217d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f32243g0.setFocusable(false);
            photoViewer2.f32226e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f32226e0.setAlpha(1.0f);
            ArrayList arrayList = nv0Var.f38801b;
            int i15 = nv0Var.f38800a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, nv0Var.f38802c.E((MessageObject) arrayList.get(i15), null, nv0Var.f38800a, true, false));
            photoViewer.f32268i7 = null;
            su0 su0Var = new su0();
            su0Var.f40215c = false;
            photoViewer.k3(false, false, su0Var);
            photoViewer.k3(true, true, su0Var);
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
        bi.d4 d4Var = photoViewer.f32354s5;
        if (d4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(d4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f32210c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f32263i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f32210c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f32227e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f32227e1;
            if (photoViewer.f32219d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f32227e1, property2, 1.0f));
        }
        if (photoViewer.f32236f1.getTag() != null) {
            org.telegram.ui.Components.fa0 fa0Var = photoViewer.f32236f1;
            if (!photoViewer.f32219d2 && photoViewer.J4 && ((iv0Var = photoViewer.d) == null || iv0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            fa0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f32236f1, property2, 1.0f));
        }
        if (photoViewer.f32244g1.getTag() != null) {
            gt0 gt0Var = photoViewer.f32244g1;
            if (!photoViewer.f32219d2) {
                i13 = 0;
            }
            gt0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f32244g1, property2, 1.0f));
        }
        View view = photoViewer.f32270j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f32270j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new bu0(this, i14));
        animatorSet.start();
    }
}

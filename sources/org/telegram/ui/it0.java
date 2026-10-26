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
public final class it0 extends AnimatorListenerAdapter {
    public final int f40350a;
    public final PhotoViewer f40351b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f40351b = photoViewer;
        this.f40350a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ou0 ou0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f40351b;
        int i12 = photoViewer.f35791u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            ng.p pVar = photoViewer.C1.f31285b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f31285b.f18843a;
            cropAreaView.f26137n0 = 0.0f;
            cropAreaView.f26138o0 = 1.0f;
            cropAreaView.f26139p0 = 0.0f;
            cropAreaView.f26140q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f35646e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f35646e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f35646e0.invalidate();
            photoViewer.f35646e0.post(new yl0(14, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f35801v5.m(false, true);
            photoViewer.f35811w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.q5.setVisibility(8);
            org.telegram.ui.Components.fg0 fg0Var = photoViewer.q5;
            fg0Var.d = null;
            fg0Var.f28183a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f35748p6 = null;
        int i14 = photoViewer.f35791u4;
        photoViewer.f35791u4 = this.f40350a;
        fi.z3 z3Var = photoViewer.g1().L;
        if (photoViewer.f35791u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        z3Var.b(z10);
        fi.z3 z3Var2 = photoViewer.K1;
        if (z3Var2 != null) {
            if (photoViewer.f35791u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            z3Var2.b(z11);
        }
        if (photoViewer.f35791u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f35630c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f35630c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f35634c6 = photoViewer.f35678h6;
            photoViewer.f35643d6 = photoViewer.f35687i6;
            photoViewer.f35652e6 = photoViewer.f35696j6;
            photoViewer.f35662f6 = photoViewer.f35705k6;
        } else {
            float t22 = photoViewer.t2(false);
            photoViewer.f35652e6 = t22;
            photoViewer.f35614a6 = t22;
            photoViewer.y3(t22);
            photoViewer.f35634c6 = 0.0f;
            photoViewer.f35643d6 = 0.0f;
        }
        photoViewer.f35739o6 = -1;
        photoViewer.f35646e0.invalidate();
        tu0 tu0Var = photoViewer.f35688i7;
        if (tu0Var != null) {
            PhotoViewer photoViewer2 = tu0Var.d;
            photoViewer2.d = tu0Var.f43917c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f35637d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f35664g0.setFocusable(false);
            photoViewer2.f35646e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f35646e0.setAlpha(1.0f);
            ArrayList arrayList = tu0Var.f43916b;
            int i15 = tu0Var.f43915a;
            photoViewer2.b2(null, null, null, null, arrayList, null, null, i15, tu0Var.f43917c.E((MessageObject) arrayList.get(i15), null, tu0Var.f43915a, true, false));
            photoViewer.f35688i7 = null;
            yt0 yt0Var = new yt0();
            yt0Var.f46110c = false;
            photoViewer.m3(false, false, yt0Var);
            photoViewer.m3(true, true, yt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bi.j5 j5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(j5Var, property, 0.0f));
        bi.j5 j5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(j5Var2, property2, 1.0f));
        sg.p2 p2Var = photoViewer.f35747p5;
        if (p2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(p2Var, property2, 1.0f));
        }
        di.h3 h3Var = photoViewer.f35774s5;
        if (h3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(h3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f35630c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f35683i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f35630c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f35647e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f35647e1;
            if (photoViewer.f35639d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35647e1, property2, 1.0f));
        }
        if (photoViewer.f35657f1.getTag() != null) {
            org.telegram.ui.Components.ba0 ba0Var = photoViewer.f35657f1;
            if (!photoViewer.f35639d2 && photoViewer.J4 && ((ou0Var = photoViewer.d) == null || ou0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ba0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35657f1, property2, 1.0f));
        }
        if (photoViewer.f35665g1.getTag() != null) {
            ms0 ms0Var = photoViewer.f35665g1;
            if (!photoViewer.f35639d2) {
                i13 = 0;
            }
            ms0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35665g1, property2, 1.0f));
        }
        View view = photoViewer.f35690j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35690j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ht0(this, i14));
        animatorSet.start();
    }
}

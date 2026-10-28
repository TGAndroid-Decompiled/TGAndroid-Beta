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
public final class kt0 extends AnimatorListenerAdapter {
    public final int f40914a;
    public final PhotoViewer f40915b;

    public kt0(PhotoViewer photoViewer, int i10) {
        this.f40915b = photoViewer;
        this.f40914a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        qu0 qu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f40915b;
        int i12 = photoViewer.f35815u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            ng.p pVar = photoViewer.C1.f31597b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f31597b.f18842a;
            cropAreaView.f26139n0 = 0.0f;
            cropAreaView.f26140o0 = 1.0f;
            cropAreaView.f26141p0 = 0.0f;
            cropAreaView.f26142q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f35670e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f35670e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f35670e0.invalidate();
            photoViewer.f35670e0.post(new am0(15, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f35825v5.m(false, true);
            photoViewer.f35835w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.q5.setVisibility(8);
            org.telegram.ui.Components.gg0 gg0Var = photoViewer.q5;
            gg0Var.d = null;
            gg0Var.f28577a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f35772p6 = null;
        int i14 = photoViewer.f35815u4;
        photoViewer.f35815u4 = this.f40914a;
        fi.z3 z3Var = photoViewer.h1().L;
        if (photoViewer.f35815u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        z3Var.b(z10);
        fi.z3 z3Var2 = photoViewer.K1;
        if (z3Var2 != null) {
            if (photoViewer.f35815u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            z3Var2.b(z11);
        }
        if (photoViewer.f35815u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f35654c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f35654c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f35658c6 = photoViewer.f35702h6;
            photoViewer.f35667d6 = photoViewer.f35711i6;
            photoViewer.f35676e6 = photoViewer.f35720j6;
            photoViewer.f35686f6 = photoViewer.f35729k6;
        } else {
            float u22 = photoViewer.u2(false);
            photoViewer.f35676e6 = u22;
            photoViewer.f35638a6 = u22;
            photoViewer.z3(u22);
            photoViewer.f35658c6 = 0.0f;
            photoViewer.f35667d6 = 0.0f;
        }
        photoViewer.f35763o6 = -1;
        photoViewer.f35670e0.invalidate();
        vu0 vu0Var = photoViewer.f35712i7;
        if (vu0Var != null) {
            PhotoViewer photoViewer2 = vu0Var.d;
            photoViewer2.d = vu0Var.f44429c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f35661d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f35688g0.setFocusable(false);
            photoViewer2.f35670e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f35670e0.setAlpha(1.0f);
            ArrayList arrayList = vu0Var.f44428b;
            int i15 = vu0Var.f44427a;
            photoViewer2.c2(null, null, null, null, arrayList, null, null, i15, vu0Var.f44429c.E((MessageObject) arrayList.get(i15), null, vu0Var.f44427a, true, false));
            photoViewer.f35712i7 = null;
            au0 au0Var = new au0();
            au0Var.f37827c = false;
            photoViewer.n3(false, false, au0Var);
            photoViewer.n3(true, true, au0Var);
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
        sg.o2 o2Var = photoViewer.f35771p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, property2, 1.0f));
        }
        di.h3 h3Var = photoViewer.f35798s5;
        if (h3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(h3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f35654c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f35707i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f35654c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f35671e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f35671e1;
            if (photoViewer.f35663d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35671e1, property2, 1.0f));
        }
        if (photoViewer.f35681f1.getTag() != null) {
            org.telegram.ui.Components.ca0 ca0Var = photoViewer.f35681f1;
            if (!photoViewer.f35663d2 && photoViewer.J4 && ((qu0Var = photoViewer.d) == null || qu0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ca0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35681f1, property2, 1.0f));
        }
        if (photoViewer.f35689g1.getTag() != null) {
            os0 os0Var = photoViewer.f35689g1;
            if (!photoViewer.f35663d2) {
                i13 = 0;
            }
            os0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35689g1, property2, 1.0f));
        }
        View view = photoViewer.f35714j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35714j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new jt0(this, i14));
        animatorSet.start();
    }
}

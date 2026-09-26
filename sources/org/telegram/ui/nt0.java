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
public final class nt0 extends AnimatorListenerAdapter {
    public final int f35998a;
    public final PhotoViewer f35999b;

    public nt0(PhotoViewer photoViewer, int i10) {
        this.f35999b = photoViewer;
        this.f35998a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        tu0 tu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f35999b;
        int i12 = photoViewer.f31366u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f24262b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f24262b.f14323a;
            cropAreaView.f22242n0 = 0.0f;
            cropAreaView.f22243o0 = 1.0f;
            cropAreaView.f22244p0 = 0.0f;
            cropAreaView.f22245q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31222e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.o0(false);
            try {
                photoViewer.f31222e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f31222e0.invalidate();
            photoViewer.f31222e0.post(new sj0(22, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f31376v5.m(false, true);
            photoViewer.f31386w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31330q5.setVisibility(8);
            org.telegram.ui.Components.vf0 vf0Var = photoViewer.f31330q5;
            vf0Var.d = null;
            vf0Var.f29072a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31322p6 = null;
        int i14 = photoViewer.f31366u4;
        photoViewer.f31366u4 = this.f35998a;
        ci.i4 i4Var = photoViewer.f1().L;
        if (photoViewer.f31366u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4Var.b(z10);
        ci.i4 i4Var2 = photoViewer.K1;
        if (i4Var2 != null) {
            if (photoViewer.f31366u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var2.b(z11);
        }
        if (photoViewer.f31366u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f31206c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f31206c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f31210c6 = photoViewer.f31254h6;
            photoViewer.f31219d6 = photoViewer.f31263i6;
            photoViewer.f31228e6 = photoViewer.f31271j6;
            photoViewer.f31237f6 = photoViewer.f31280k6;
        } else {
            float q22 = photoViewer.q2(false);
            photoViewer.f31228e6 = q22;
            photoViewer.f31190a6 = q22;
            photoViewer.v3(q22);
            photoViewer.f31210c6 = 0.0f;
            photoViewer.f31219d6 = 0.0f;
        }
        photoViewer.f31314o6 = -1;
        photoViewer.f31222e0.invalidate();
        yu0 yu0Var = photoViewer.f31264i7;
        if (yu0Var != null) {
            PhotoViewer photoViewer2 = yu0Var.d;
            photoViewer2.d = yu0Var.f40255c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31213d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31239g0.setFocusable(false);
            photoViewer2.f31222e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f31222e0.setAlpha(1.0f);
            ArrayList arrayList = yu0Var.f40254b;
            int i15 = yu0Var.f40253a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, yu0Var.f40255c.E((MessageObject) arrayList.get(i15), null, yu0Var.f40253a, true, false));
            photoViewer.f31264i7 = null;
            du0 du0Var = new du0();
            du0Var.f33196c = false;
            photoViewer.j3(false, false, du0Var);
            photoViewer.j3(true, true, du0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        t5 t5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var, property, 0.0f));
        t5 t5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var2, property2, 1.0f));
        qg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.f31349s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f31206c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f31259i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f31206c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f31223e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f31223e1;
            if (photoViewer.f31215d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31223e1, property2, 1.0f));
        }
        if (photoViewer.f31232f1.getTag() != null) {
            org.telegram.ui.Components.q90 q90Var = photoViewer.f31232f1;
            if (!photoViewer.f31215d2 && photoViewer.J4 && ((tu0Var = photoViewer.d) == null || tu0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            q90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31232f1, property2, 1.0f));
        }
        if (photoViewer.f31240g1.getTag() != null) {
            rs0 rs0Var = photoViewer.f31240g1;
            if (!photoViewer.f31215d2) {
                i13 = 0;
            }
            rs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31240g1, property2, 1.0f));
        }
        View view = photoViewer.f31266j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31266j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new mt0(this, i14));
        animatorSet.start();
    }
}

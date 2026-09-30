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
    public final int f36137a;
    public final PhotoViewer f36138b;

    public nt0(PhotoViewer photoViewer, int i10) {
        this.f36138b = photoViewer;
        this.f36137a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        tu0 tu0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f36138b;
        int i12 = photoViewer.f31441u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.f24856b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f24856b.f14339a;
            cropAreaView.f22264n0 = 0.0f;
            cropAreaView.f22265o0 = 1.0f;
            cropAreaView.f22266p0 = 0.0f;
            cropAreaView.f22267q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31297e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f31297e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f31297e0.invalidate();
            photoViewer.f31297e0.post(new sj0(22, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f31451v5.m(false, true);
            photoViewer.f31461w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31405q5.setVisibility(8);
            org.telegram.ui.Components.xf0 xf0Var = photoViewer.f31405q5;
            xf0Var.d = null;
            xf0Var.f30239a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31397p6 = null;
        int i14 = photoViewer.f31441u4;
        photoViewer.f31441u4 = this.f36137a;
        ci.i4 i4Var = photoViewer.f1().L;
        if (photoViewer.f31441u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4Var.b(z10);
        ci.i4 i4Var2 = photoViewer.K1;
        if (i4Var2 != null) {
            if (photoViewer.f31441u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            i4Var2.b(z11);
        }
        if (photoViewer.f31441u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f31281c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f31281c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f31285c6 = photoViewer.f31329h6;
            photoViewer.f31294d6 = photoViewer.f31338i6;
            photoViewer.f31303e6 = photoViewer.f31346j6;
            photoViewer.f31312f6 = photoViewer.f31355k6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f31303e6 = r22;
            photoViewer.f31265a6 = r22;
            photoViewer.w3(r22);
            photoViewer.f31285c6 = 0.0f;
            photoViewer.f31294d6 = 0.0f;
        }
        photoViewer.f31389o6 = -1;
        photoViewer.f31297e0.invalidate();
        yu0 yu0Var = photoViewer.f31339i7;
        if (yu0Var != null) {
            PhotoViewer photoViewer2 = yu0Var.d;
            photoViewer2.d = yu0Var.f40366c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31288d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31314g0.setFocusable(false);
            photoViewer2.f31297e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f31297e0.setAlpha(1.0f);
            ArrayList arrayList = yu0Var.f40365b;
            int i15 = yu0Var.f40364a;
            photoViewer2.Z1(null, null, null, null, arrayList, null, null, i15, yu0Var.f40366c.E((MessageObject) arrayList.get(i15), null, yu0Var.f40364a, true, false));
            photoViewer.f31339i7 = null;
            du0 du0Var = new du0();
            du0Var.f33280c = false;
            photoViewer.k3(false, false, du0Var);
            photoViewer.k3(true, true, du0Var);
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
        ai.n4 n4Var = photoViewer.f31424s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f31281c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f31334i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f31281c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f31298e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f31298e1;
            if (photoViewer.f31290d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31298e1, property2, 1.0f));
        }
        if (photoViewer.f31307f1.getTag() != null) {
            org.telegram.ui.Components.s90 s90Var = photoViewer.f31307f1;
            if (!photoViewer.f31290d2 && photoViewer.J4 && ((tu0Var = photoViewer.d) == null || tu0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31307f1, property2, 1.0f));
        }
        if (photoViewer.f31315g1.getTag() != null) {
            rs0 rs0Var = photoViewer.f31315g1;
            if (!photoViewer.f31290d2) {
                i13 = 0;
            }
            rs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31315g1, property2, 1.0f));
        }
        View view = photoViewer.f31341j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31341j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new mt0(this, i14));
        animatorSet.start();
    }
}

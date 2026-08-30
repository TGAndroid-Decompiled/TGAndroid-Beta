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
public final class at0 extends AnimatorListenerAdapter {
    public final int f32699a;
    public final PhotoViewer f32700b;

    public at0(PhotoViewer photoViewer, int i10) {
        this.f32700b = photoViewer;
        this.f32699a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z4;
        int i10;
        hu0 hu0Var;
        int i11;
        boolean z10;
        PhotoViewer photoViewer = this.f32700b;
        int i12 = photoViewer.f31853r4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.f31924z1.a();
            yf.n nVar = photoViewer.f31924z1.f31004b;
            nVar.d = null;
            nVar.G = false;
            photoViewer.R0.setVisibility(8);
            photoViewer.f31924z1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.f31924z1.f31004b.f47246a;
            cropAreaView.f23010k0 = 0.0f;
            cropAreaView.f23011l0 = 1.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.f23013n0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f31705b0.removeView(photoViewer.F1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.F1 = null;
        } else if (i12 == 3) {
            photoViewer.I1.n0(false);
            try {
                photoViewer.f31705b0.removeView(photoViewer.I1.getView());
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            photoViewer.I1 = null;
        } else if (i12 == 4) {
            photoViewer.L1 = true;
            photoViewer.f31705b0.invalidate();
            photoViewer.f31705b0.post(new zq0(5, this, photoViewer.K1));
            photoViewer.K1 = null;
            photoViewer.f31864s5.m(false, true);
            photoViewer.f31872t5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f31817n5.setVisibility(8);
            org.telegram.ui.Components.of0 of0Var = photoViewer.f31817n5;
            of0Var.d = null;
            of0Var.f27555a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f31808m6 = null;
        int i14 = photoViewer.f31853r4;
        photoViewer.f31853r4 = this.f32699a;
        ph.i3 i3Var = photoViewer.f1().I;
        if (photoViewer.f31853r4 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        i3Var.b(z4);
        ph.i3 i3Var2 = photoViewer.H1;
        if (i3Var2 != null) {
            if (photoViewer.f31853r4 != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            i3Var2.b(z10);
        }
        if (photoViewer.f31853r4 != 3) {
            photoViewer.W5 = 0.0f;
        }
        if (photoViewer.Z1 == 1) {
            photoViewer.f31924z1.setVisibility(0);
        }
        if (photoViewer.Z1 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.Z5 = photoViewer.e6;
            photoViewer.f31701a6 = photoViewer.f31747f6;
            photoViewer.f31711b6 = photoViewer.f31756g6;
            photoViewer.f31720c6 = photoViewer.f31765h6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.f31711b6 = r22;
            photoViewer.X5 = r22;
            photoViewer.w3(r22);
            photoViewer.Z5 = 0.0f;
            photoViewer.f31701a6 = 0.0f;
        }
        photoViewer.f31800l6 = -1;
        photoViewer.f31705b0.invalidate();
        mu0 mu0Var = photoViewer.f31748f7;
        if (mu0Var != null) {
            PhotoViewer photoViewer2 = mu0Var.d;
            photoViewer2.d = mu0Var.f36388c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f31696a0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f31723d0.setFocusable(false);
            photoViewer2.f31705b0.setFocusable(false);
            photoViewer2.I0.setAlpha(255);
            photoViewer2.f31705b0.setAlpha(1.0f);
            ArrayList arrayList = mu0Var.f36387b;
            int i15 = mu0Var.f36386a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i15, mu0Var.f36388c.E((MessageObject) arrayList.get(i15), null, mu0Var.f36386a, true, false));
            photoViewer.f31748f7 = null;
            qt0 qt0Var = new qt0();
            qt0Var.f37842c = false;
            photoViewer.k3(false, false, qt0Var);
            photoViewer.k3(true, true, qt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        dg.s1 s1Var = photoViewer.M0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(s1Var, property, 0.0f));
        dg.s1 s1Var2 = photoViewer.M0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(s1Var2, property2, 1.0f));
        dg.q3 q3Var = photoViewer.f31807m5;
        if (q3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(q3Var, property2, 1.0f));
        }
        nh.a3 a3Var = photoViewer.f31835p5;
        if (a3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(a3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, property, 0.0f));
        if (photoViewer.Z1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C, property, 0.0f));
        }
        if (photoViewer.f31743f2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N1, property, 0.0f));
        }
        int i16 = photoViewer.Z1;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31924z1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.L0, property2, 1.0f));
        }
        if (photoViewer.f31706b1.getTag() != null) {
            org.telegram.ui.ActionBar.l0 l0Var = photoViewer.f31706b1;
            if (photoViewer.a2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            l0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31706b1, property2, 1.0f));
        }
        if (photoViewer.f31716c1.getTag() != null) {
            org.telegram.ui.Components.g90 g90Var = photoViewer.f31716c1;
            if (!photoViewer.a2 && photoViewer.G4 && ((hu0Var = photoViewer.d) == null || hu0Var.N())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            g90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31716c1, property2, 1.0f));
        }
        if (photoViewer.f31724d1.getTag() != null) {
            ds0 ds0Var = photoViewer.f31724d1;
            if (!photoViewer.a2) {
                i13 = 0;
            }
            ds0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31724d1, property2, 1.0f));
        }
        View view = photoViewer.f31750g0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f31750g0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new zs0(this, i14));
        animatorSet.start();
    }
}

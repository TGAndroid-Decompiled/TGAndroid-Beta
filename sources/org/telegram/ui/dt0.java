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
public final class dt0 extends AnimatorListenerAdapter {
    public final int f36722a;
    public final PhotoViewer f36723b;

    public dt0(PhotoViewer photoViewer, int i10) {
        this.f36723b = photoViewer;
        this.f36722a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ju0 ju0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f36723b;
        int i12 = photoViewer.f33727u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            mg.p pVar = photoViewer.C1.f29903b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f29903b.f16980a;
            cropAreaView.f24345n0 = 0.0f;
            cropAreaView.f24346o0 = 1.0f;
            cropAreaView.f24347p0 = 0.0f;
            cropAreaView.f24348q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f33582e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.f33582e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f33582e0.invalidate();
            photoViewer.f33582e0.post(new ah0(25, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f33737v5.m(false, true);
            photoViewer.f33747w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.f33691q5.setVisibility(8);
            org.telegram.ui.Components.hg0 hg0Var = photoViewer.f33691q5;
            hg0Var.d = null;
            hg0Var.f27027a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f33683p6 = null;
        int i14 = photoViewer.f33727u4;
        photoViewer.f33727u4 = this.f36722a;
        ei.b4 b4Var = photoViewer.g1().L;
        if (photoViewer.f33727u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        b4Var.b(z10);
        ei.b4 b4Var2 = photoViewer.K1;
        if (b4Var2 != null) {
            if (photoViewer.f33727u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            b4Var2.b(z11);
        }
        if (photoViewer.f33727u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f33566c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f33566c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f33570c6 = photoViewer.f33614h6;
            photoViewer.f33579d6 = photoViewer.f33623i6;
            photoViewer.f33588e6 = photoViewer.f33632j6;
            photoViewer.f33597f6 = photoViewer.f33641k6;
        } else {
            float t22 = photoViewer.t2(false);
            photoViewer.f33588e6 = t22;
            photoViewer.f33550a6 = t22;
            photoViewer.y3(t22);
            photoViewer.f33570c6 = 0.0f;
            photoViewer.f33579d6 = 0.0f;
        }
        photoViewer.f33675o6 = -1;
        photoViewer.f33582e0.invalidate();
        ou0 ou0Var = photoViewer.f33624i7;
        if (ou0Var != null) {
            PhotoViewer photoViewer2 = ou0Var.d;
            photoViewer2.d = ou0Var.f40262c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f33573d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f33599g0.setFocusable(false);
            photoViewer2.f33582e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f33582e0.setAlpha(1.0f);
            ArrayList arrayList = ou0Var.f40261b;
            int i15 = ou0Var.f40260a;
            photoViewer2.b2(null, null, null, null, arrayList, null, null, i15, ou0Var.f40262c.E((MessageObject) arrayList.get(i15), null, ou0Var.f40260a, true, false));
            photoViewer.f33624i7 = null;
            tt0 tt0Var = new tt0();
            tt0Var.f42118c = false;
            photoViewer.m3(false, false, tt0Var);
            photoViewer.m3(true, true, tt0Var);
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
        rg.o2 o2Var = photoViewer.p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, property2, 1.0f));
        }
        ci.h3 h3Var = photoViewer.f33710s5;
        if (h3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(h3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f33566c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f33619i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f33566c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f33583e1.getTag() != null) {
            org.telegram.ui.ActionBar.j0 j0Var = photoViewer.f33583e1;
            if (photoViewer.f33575d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            j0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33583e1, property2, 1.0f));
        }
        if (photoViewer.f33592f1.getTag() != null) {
            org.telegram.ui.Components.y90 y90Var = photoViewer.f33592f1;
            if (!photoViewer.f33575d2 && photoViewer.J4 && ((ju0Var = photoViewer.d) == null || ju0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            y90Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33592f1, property2, 1.0f));
        }
        if (photoViewer.f33600g1.getTag() != null) {
            hs0 hs0Var = photoViewer.f33600g1;
            if (!photoViewer.f33575d2) {
                i13 = 0;
            }
            hs0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33600g1, property2, 1.0f));
        }
        View view = photoViewer.f33626j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f33626j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ct0(this, i14));
        animatorSet.start();
    }
}

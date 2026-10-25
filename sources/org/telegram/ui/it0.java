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
    public final int f40347a;
    public final PhotoViewer f40348b;

    public it0(PhotoViewer photoViewer, int i10) {
        this.f40348b = photoViewer;
        this.f40347a = i10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10;
        ou0 ou0Var;
        int i11;
        boolean z11;
        PhotoViewer photoViewer = this.f40348b;
        int i12 = photoViewer.f35788u4;
        int i13 = 8;
        if (i12 == 1) {
            photoViewer.C1.a();
            ng.p pVar = photoViewer.C1.f31283b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.f31283b.f18843a;
            cropAreaView.f26135n0 = 0.0f;
            cropAreaView.f26136o0 = 1.0f;
            cropAreaView.f26137p0 = 0.0f;
            cropAreaView.f26138q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i12 == 2) {
            try {
                photoViewer.f35643e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i12 == 3) {
            photoViewer.L1.m0(false);
            try {
                photoViewer.f35643e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i12 == 4) {
            photoViewer.O1 = true;
            photoViewer.f35643e0.invalidate();
            photoViewer.f35643e0.post(new yl0(14, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.f35798v5.m(false, true);
            photoViewer.f35808w5.m(false, true);
        } else if (i12 == 5) {
            photoViewer.q5.setVisibility(8);
            org.telegram.ui.Components.fg0 fg0Var = photoViewer.q5;
            fg0Var.d = null;
            fg0Var.f28181a.o(false, null, 0L, 0.0f);
        }
        photoViewer.f35745p6 = null;
        int i14 = photoViewer.f35788u4;
        photoViewer.f35788u4 = this.f40347a;
        fi.z3 z3Var = photoViewer.g1().L;
        if (photoViewer.f35788u4 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        z3Var.b(z10);
        fi.z3 z3Var2 = photoViewer.K1;
        if (z3Var2 != null) {
            if (photoViewer.f35788u4 != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            z3Var2.b(z11);
        }
        if (photoViewer.f35788u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.f35627c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.f35627c2 == 11 && (i14 == 3 || i14 == 2 || i14 == 1 || i14 == 4)) {
            photoViewer.f35631c6 = photoViewer.f35675h6;
            photoViewer.f35640d6 = photoViewer.f35684i6;
            photoViewer.f35649e6 = photoViewer.f35693j6;
            photoViewer.f35659f6 = photoViewer.f35702k6;
        } else {
            float t22 = photoViewer.t2(false);
            photoViewer.f35649e6 = t22;
            photoViewer.f35611a6 = t22;
            photoViewer.y3(t22);
            photoViewer.f35631c6 = 0.0f;
            photoViewer.f35640d6 = 0.0f;
        }
        photoViewer.f35736o6 = -1;
        photoViewer.f35643e0.invalidate();
        tu0 tu0Var = photoViewer.f35685i7;
        if (tu0Var != null) {
            PhotoViewer photoViewer2 = tu0Var.d;
            photoViewer2.d = tu0Var.f43914c;
            WindowManager.LayoutParams layoutParams = photoViewer2.f35634d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.f35661g0.setFocusable(false);
            photoViewer2.f35643e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.f35643e0.setAlpha(1.0f);
            ArrayList arrayList = tu0Var.f43913b;
            int i15 = tu0Var.f43912a;
            photoViewer2.b2(null, null, null, null, arrayList, null, null, i15, tu0Var.f43914c.E((MessageObject) arrayList.get(i15), null, tu0Var.f43912a, true, false));
            photoViewer.f35685i7 = null;
            yt0 yt0Var = new yt0();
            yt0Var.f46107c = false;
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
        sg.p2 p2Var = photoViewer.f35744p5;
        if (p2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(p2Var, property2, 1.0f));
        }
        di.h3 h3Var = photoViewer.f35771s5;
        if (h3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(h3Var, property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, property, 0.0f));
        if (photoViewer.f35627c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, property, 0.0f));
        }
        if (photoViewer.f35680i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, property, 0.0f));
        }
        int i16 = photoViewer.f35627c2;
        if (i16 != 0 && i16 != 4) {
            if (i16 == 1) {
                arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, property2, 1.0f));
            }
        } else {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, property2, 1.0f));
        }
        if (photoViewer.f35644e1.getTag() != null) {
            org.telegram.ui.ActionBar.k0 k0Var = photoViewer.f35644e1;
            if (photoViewer.f35636d2) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            k0Var.setVisibility(i11);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35644e1, property2, 1.0f));
        }
        if (photoViewer.f35654f1.getTag() != null) {
            org.telegram.ui.Components.ba0 ba0Var = photoViewer.f35654f1;
            if (!photoViewer.f35636d2 && photoViewer.J4 && ((ou0Var = photoViewer.d) == null || ou0Var.O())) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ba0Var.setVisibility(i10);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35654f1, property2, 1.0f));
        }
        if (photoViewer.f35662g1.getTag() != null) {
            ms0 ms0Var = photoViewer.f35662g1;
            if (!photoViewer.f35636d2) {
                i13 = 0;
            }
            ms0Var.setVisibility(i13);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35662g1, property2, 1.0f));
        }
        View view = photoViewer.f35687j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f35687j0, property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ht0(this, i14));
        animatorSet.start();
    }
}

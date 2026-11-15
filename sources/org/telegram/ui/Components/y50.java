package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ec1;
import org.telegram.ui.jb1;
public final class y50 extends AnimatorListenerAdapter {
    public final int f41875a;
    public final Object f41876b;
    public final Object f41877c;

    public y50(int i7, Object obj, Object obj2) {
        this.f41875a = i7;
        this.f41877c = obj;
        this.f41876b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f41875a) {
            case 18:
                ((r0.m0) this.f41876b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7 = this.f41875a;
        Object obj = this.f41876b;
        Object obj2 = this.f41877c;
        switch (i7) {
            case 0:
                z50 z50Var = (z50) obj2;
                z50Var.removeView((f20) obj);
                z50Var.f42253c = null;
                z50Var.f42254e.Y1 = null;
                z50Var.f42251a = false;
                return;
            case 1:
                ti0 ti0Var = (ti0) obj2;
                wi0 wi0Var = ti0Var.f39704e;
                if (((ValueAnimator) wi0Var.f41361g) != null) {
                    ((uj0) wi0Var.f41359e).W1 = false;
                    ArrayList arrayList = ti0Var.f39702b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.b0) wi0Var.f41360f).getClass();
                        v4.o0.x0(view);
                        ((uj0) wi0Var.f41359e).removeView(view);
                        c8.ma maVar = (c8.ma) wi0Var.f41362i;
                        if (maVar != null) {
                            maVar.d(view);
                        }
                    }
                    ((uj0) wi0Var.f41359e).setScrollEnabled(true);
                    ((uj0) wi0Var.f41359e).setVerticalScrollBarEnabled(true);
                    boolean z11 = org.telegram.messenger.r2.f26206a;
                    int childCount = ((uj0) wi0Var.f41359e).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((uj0) wi0Var.f41359e).getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt).b(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj4 = arrayList2.get(i12);
                        i12++;
                        View view2 = (View) obj4;
                        if (view2 instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    ui0 ui0Var = ti0Var.d;
                    if (ui0Var != null) {
                        ui0Var.E();
                    }
                    c8.ma maVar2 = (c8.ma) wi0Var.f41362i;
                    if (maVar2 != null) {
                        maVar2.a();
                    }
                    ((SparseArray) wi0Var.f41363j).clear();
                    wi0Var.f41361g = null;
                    return;
                }
                return;
            case 2:
                pz pzVar = (pz) obj;
                pzVar.setAlpha(1.0f);
                v4.o0.x0(pzVar);
                xi0 xi0Var = (xi0) obj2;
                xi0Var.f41699c.remove(pzVar);
                xi0Var.f41697a.removeView(pzVar);
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.xp xpVar = (org.telegram.ui.xp) obj2;
                ((xi0) xpVar.d).f41702g.remove((AnimatorSet) obj);
                if (((xi0) xpVar.d).f41702g.isEmpty()) {
                    ((xi0) xpVar.d).f41698b.clear();
                    xi0 xi0Var2 = (xi0) xpVar.d;
                    xi0Var2.d = true;
                    xi0Var2.f41697a.invalidate();
                    return;
                }
                return;
            case 4:
                fn0 fn0Var = (fn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(fn0Var.B);
                } catch (Exception unused) {
                }
                hh0 hh0Var = fn0Var.C;
                if (hh0Var != null) {
                    org.telegram.messenger.g0.r(hh0Var);
                    return;
                }
                return;
            case 5:
                hv0 hv0Var = (hv0) obj2;
                hv0Var.f35344b = 0.0f;
                hv0Var.invalidate();
                ((wk0) obj).invalidate();
                return;
            case 6:
                org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) obj2;
                f3Var.d.setText((String) obj);
                f3Var.d.setTranslationY(0.0f);
                f3Var.d.setAlpha(1.0f);
                return;
            case 7:
                ((org.telegram.ui.Components.voip.f3) obj2).removeView((org.telegram.ui.Components.voip.e3) obj);
                return;
            case 8:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.yw) obj2).S3 = null;
                return;
            case 9:
                org.telegram.ui.x50 x50Var = (org.telegram.ui.x50) obj2;
                x50Var.removeView((f20) obj);
                x50Var.d = null;
                x50Var.f53097a = null;
                x50Var.f53098b = false;
                return;
            case 10:
                xt0 xt0Var = (xt0) obj2;
                xt0Var.setVisibility(8);
                xt0Var.setX(0.0f);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                gd0 gd0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = gd0Var.f34909e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                gd0Var.f34910f = z10;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = gd0Var.f34913s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = gd0Var.f34914w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                gd0Var.h = true;
                gd0Var.f34911n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                gd0Var.f34913s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(gd0Var, gd0Var.F, 0.0f, 1.0f));
                gd0Var.f34913s.setDuration(250L);
                gd0Var.f34913s.setInterpolator(new OvershootInterpolator(1.01f));
                gd0Var.f34913s.addListener(new ed0(gd0Var, 0));
                gd0Var.f34913s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.f42747d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(er.f34420g);
                photoViewer.B2.addListener(new org.telegram.ui.xx(this, 11));
                photoViewer.B2.start();
                return;
            case 12:
                org.telegram.ui.rs0 rs0Var = (org.telegram.ui.rs0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = rs0Var.f51016n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.V.getChildCount(); i13++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i13);
                    if (childAt2 != rs0Var.f51014e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 13:
                org.telegram.ui.uy0 uy0Var = (org.telegram.ui.uy0) obj2;
                if (uy0Var.h != null) {
                    uy0Var.h = null;
                    uy0Var.f52060n.e();
                    ((org.telegram.ui.bw) obj).onTransitionAnimationEnd(true, false);
                    uy0Var.f52058e = 1.0f;
                    uy0Var.g();
                    uy0Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.uq0 uq0Var = (org.telegram.ui.uq0) obj;
                if (uq0Var != null) {
                    uq0Var.f51997a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f43308s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.pu0(this, 13));
                return;
            case 15:
                ((org.telegram.ui.d11) obj).run();
                org.telegram.ui.n11 n11Var = (org.telegram.ui.n11) obj2;
                org.telegram.ui.d01 d01Var = n11Var.Y0;
                if (d01Var != null) {
                    d01Var.dismiss();
                    n11Var.Y0 = null;
                    return;
                }
                return;
            case 16:
                jb1 jb1Var = (jb1) obj2;
                jb1Var.removeView((f20) obj);
                jb1Var.f48282e = null;
                jb1Var.f48279a = null;
                jb1Var.f48280b = false;
                UsersSelectActivity usersSelectActivity = jb1Var.f48283f;
                usersSelectActivity.f43450c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.f43450c.t(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ec1 ec1Var = (ec1) obj2;
                ec1Var.f46686f0.setScaleX(1.15f);
                ec1Var.f46686f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ec1Var.f46686f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                ec1Var.f46686f0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f55711a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                tg.q1 q1Var = (tg.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f57527s0.b(q1Var.f57534z0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.A0 = 1.0f;
                return;
            case 21:
                ((ug.x0) obj2).f58379w1 = false;
                ((ug.o0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 22:
                ug.g1 g1Var = (ug.g1) obj2;
                g1Var.D2 = false;
                g1Var.C2 = 1.0f;
                g1Var.f58100o2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new v4.e(1, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                ((wi.h) obj2).f((vg.o) obj);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f41875a) {
            case 10:
                ((xt0) this.f41876b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f41876b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public y50(Object obj, View view, int i7) {
        this.f41875a = i7;
        this.f41876b = obj;
        this.f41877c = view;
    }

    public y50(xi0 xi0Var, pz pzVar, v4.o0 o0Var) {
        this.f41875a = 2;
        this.f41877c = xi0Var;
        this.f41876b = pzVar;
    }
}

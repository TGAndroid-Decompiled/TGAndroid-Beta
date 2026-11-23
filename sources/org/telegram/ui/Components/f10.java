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
import org.telegram.ui.fc1;
import org.telegram.ui.lb1;
public final class f10 extends AnimatorListenerAdapter {
    public final int f34942a;
    public final Object f34943b;
    public final Object f34944c;

    public f10(int i7, Object obj, Object obj2) {
        this.f34942a = i7;
        this.f34944c = obj;
        this.f34943b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f34942a) {
            case 19:
                ((r0.m0) this.f34943b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7 = this.f34942a;
        Object obj = this.f34943b;
        Object obj2 = this.f34944c;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                g10 g10Var = (g10) obj2;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    g10Var.removeView((View) arrayList.get(i10));
                }
                g10Var.f35274e.clear();
                g10Var.f35271a = null;
                g10Var.f35272b = false;
                return;
            case 1:
                h60 h60Var = (h60) obj2;
                h60Var.removeView((n20) obj);
                h60Var.f35647c = null;
                h60Var.f35648e.Y1 = null;
                h60Var.f35645a = false;
                return;
            case 2:
                ej0 ej0Var = (ej0) obj2;
                org.telegram.ui.ActionBar.l5 l5Var = ej0Var.f34730e;
                if (((ValueAnimator) l5Var.h) != null) {
                    ((ek0) l5Var.f29286e).W1 = false;
                    ArrayList arrayList2 = ej0Var.f34728b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.c0) l5Var.f29287f).getClass();
                        v4.p0.x0(view);
                        ((ek0) l5Var.f29286e).removeView(view);
                        c8.ra raVar = (c8.ra) l5Var.f29289r;
                        if (raVar != null) {
                            raVar.d(view);
                        }
                    }
                    ((ek0) l5Var.f29286e).setScrollEnabled(true);
                    ((ek0) l5Var.f29286e).setVerticalScrollBarEnabled(true);
                    boolean z11 = org.telegram.messenger.s2.f26829a;
                    int childCount = ((ek0) l5Var.f29286e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((ek0) l5Var.f29286e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) childAt).b(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList3 = (ArrayList) obj;
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj4 = arrayList3.get(i13);
                        i13++;
                        View view2 = (View) obj4;
                        if (view2 instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    fj0 fj0Var = ej0Var.d;
                    if (fj0Var != null) {
                        fj0Var.E();
                    }
                    c8.ra raVar2 = (c8.ra) l5Var.f29289r;
                    if (raVar2 != null) {
                        raVar2.a();
                    }
                    ((SparseArray) l5Var.f29290s).clear();
                    l5Var.h = null;
                    return;
                }
                return;
            case 3:
                vz vzVar = (vz) obj;
                vzVar.setAlpha(1.0f);
                v4.p0.x0(vzVar);
                hj0 hj0Var = (hj0) obj2;
                hj0Var.f35755c.remove(vzVar);
                hj0Var.f35753a.removeView(vzVar);
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.yp ypVar = (org.telegram.ui.yp) obj2;
                ((hj0) ypVar.d).f35758g.remove((AnimatorSet) obj);
                if (((hj0) ypVar.d).f35758g.isEmpty()) {
                    ((hj0) ypVar.d).f35754b.clear();
                    hj0 hj0Var2 = (hj0) ypVar.d;
                    hj0Var2.d = true;
                    hj0Var2.f35753a.invalidate();
                    return;
                }
                return;
            case 5:
                pn0 pn0Var = (pn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(pn0Var.B);
                } catch (Exception unused) {
                }
                sh0 sh0Var = pn0Var.C;
                if (sh0Var != null) {
                    org.telegram.messenger.g0.r(sh0Var);
                    return;
                }
                return;
            case 6:
                rv0 rv0Var = (rv0) obj2;
                rv0Var.f39418b = 0.0f;
                rv0Var.invalidate();
                ((gl0) obj).invalidate();
                return;
            case 7:
                org.telegram.ui.Components.voip.f3 f3Var = (org.telegram.ui.Components.voip.f3) obj2;
                f3Var.d.setText((String) obj);
                f3Var.d.setTranslationY(0.0f);
                f3Var.d.setAlpha(1.0f);
                return;
            case 8:
                ((org.telegram.ui.Components.voip.f3) obj2).removeView((org.telegram.ui.Components.voip.e3) obj);
                return;
            case 9:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.bx) obj2).V3 = null;
                return;
            case 10:
                org.telegram.ui.z50 z50Var = (org.telegram.ui.z50) obj2;
                z50Var.removeView((n20) obj);
                z50Var.d = null;
                z50Var.f54528a = null;
                z50Var.f54529b = false;
                return;
            case 11:
                hu0 hu0Var = (hu0) obj2;
                hu0Var.setVisibility(8);
                hu0Var.setX(0.0f);
                return;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                qd0 qd0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = qd0Var.f38813e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qd0Var.f38814f = z10;
                imageReceiver.w0(bitmap);
                imageReceiver.H0(0, 0, false);
                AnimatorSet animatorSet = qd0Var.f38817s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = qd0Var.f38818w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                qd0Var.h = true;
                qd0Var.f38815n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                qd0Var.f38817s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(qd0Var, qd0Var.F, 0.0f, 1.0f));
                qd0Var.f38817s.setDuration(250L);
                qd0Var.f38817s.setInterpolator(new OvershootInterpolator(1.01f));
                qd0Var.f38817s.addListener(new od0(qd0Var, 0));
                qd0Var.f38817s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.f43316d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(kr.f36859g);
                photoViewer.B2.addListener(new org.telegram.ui.zx(this, 11));
                photoViewer.B2.start();
                return;
            case 13:
                org.telegram.ui.us0 us0Var = (org.telegram.ui.us0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f52725n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.V.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i14);
                    if (childAt2 != us0Var.f52723e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 14:
                org.telegram.ui.xy0 xy0Var = (org.telegram.ui.xy0) obj2;
                if (xy0Var.h != null) {
                    xy0Var.h = null;
                    xy0Var.f54124n.e();
                    ((org.telegram.ui.dw) obj).onTransitionAnimationEnd(true, false);
                    xy0Var.f54122e = 1.0f;
                    xy0Var.g();
                    xy0Var.d(false);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) obj;
                if (wq0Var != null) {
                    wq0Var.f53726a.P0(true, true);
                }
                ((SecretMediaViewer) obj2).f43880s = false;
                org.telegram.messenger.g0.g3(new org.telegram.ui.qu0(this, 13));
                return;
            case 16:
                ((org.telegram.ui.g11) obj).run();
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) obj2;
                org.telegram.ui.g01 g01Var = q11Var.Y0;
                if (g01Var != null) {
                    g01Var.dismiss();
                    q11Var.Y0 = null;
                    return;
                }
                return;
            case 17:
                lb1 lb1Var = (lb1) obj2;
                lb1Var.removeView((n20) obj);
                lb1Var.f49718e = null;
                lb1Var.f49715a = null;
                lb1Var.f49716b = false;
                UsersSelectActivity usersSelectActivity = lb1Var.f49719f;
                usersSelectActivity.f44022c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.f44022c.t(true, true);
                    return;
                }
                return;
            case 18:
                ((Runnable) obj).run();
                fc1 fc1Var = (fc1) obj2;
                fc1Var.f47767f0.setScaleX(1.15f);
                fc1Var.f47767f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fc1Var.f47767f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                fc1Var.f47767f0.setVisibility(8);
                return;
            case 19:
                ((r0.m0) obj).c();
                return;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f56409a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 21:
                tg.v1 v1Var = (tg.v1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    v1Var.f58269t0.b(v1Var.A0, false);
                }
                v1Var.setRotationY(0.0f);
                v1Var.B0 = 1.0f;
                return;
            case 22:
                ((ug.y0) obj2).f59087w1 = false;
                ((ug.p0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 23:
                ug.h1 h1Var = (ug.h1) obj2;
                h1Var.D2 = false;
                h1Var.C2 = 1.0f;
                h1Var.f58809o2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new v4.f(1, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                ((wi.h) obj2).f((ug.u1) obj);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f34942a) {
            case 11:
                ((hu0) this.f34943b).setVisibility(0);
                return;
            case 19:
                ((r0.m0) this.f34943b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public f10(Object obj, View view, int i7) {
        this.f34942a = i7;
        this.f34943b = obj;
        this.f34944c = view;
    }

    public f10(hj0 hj0Var, vz vzVar, v4.p0 p0Var) {
        this.f34942a = 3;
        this.f34944c = hj0Var;
        this.f34943b = vzVar;
    }
}

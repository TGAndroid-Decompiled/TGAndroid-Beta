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
import org.telegram.ui.kb1;
public final class v50 extends AnimatorListenerAdapter {
    public final int f38858a;
    public final Object f38859b;
    public final Object f38860c;

    public v50(int i7, Object obj, Object obj2) {
        this.f38858a = i7;
        this.f38860c = obj;
        this.f38859b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38858a) {
            case 18:
                ((r0.m0) this.f38859b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7 = this.f38858a;
        Object obj = this.f38859b;
        Object obj2 = this.f38860c;
        switch (i7) {
            case 0:
                w50 w50Var = (w50) obj2;
                w50Var.removeView((c20) obj);
                w50Var.f39864c = null;
                w50Var.f39865e.U1 = null;
                w50Var.f39862a = false;
                return;
            case 1:
                oi0 oi0Var = (oi0) obj2;
                ri0 ri0Var = oi0Var.f36628e;
                if (((ValueAnimator) ri0Var.f37656g) != null) {
                    ((pj0) ri0Var.f37654e).V1 = false;
                    ArrayList arrayList = oi0Var.f36626b;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj3 = arrayList.get(i10);
                        i10++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) view).c(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.b0) ri0Var.f37655f).getClass();
                        v4.n0.x0(view);
                        ((pj0) ri0Var.f37654e).removeView(view);
                        c8.ja jaVar = (c8.ja) ri0Var.f37657i;
                        if (jaVar != null) {
                            jaVar.d(view);
                        }
                    }
                    ((pj0) ri0Var.f37654e).setScrollEnabled(true);
                    ((pj0) ri0Var.f37654e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.r2.f25199a;
                    int childCount = ((pj0) ri0Var.f37654e).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((pj0) ri0Var.f37654e).getChildAt(i11);
                        if (childAt instanceof org.telegram.ui.Cells.p4) {
                            ((org.telegram.ui.Cells.p4) childAt).c(false, false);
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
                            ((org.telegram.ui.Cells.p4) view2).c(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    pi0 pi0Var = oi0Var.d;
                    if (pi0Var != null) {
                        pi0Var.E();
                    }
                    c8.ja jaVar2 = (c8.ja) ri0Var.f37657i;
                    if (jaVar2 != null) {
                        jaVar2.a();
                    }
                    ((SparseArray) ri0Var.f37658j).clear();
                    ri0Var.f37656g = null;
                    return;
                }
                return;
            case 2:
                lz lzVar = (lz) obj;
                lzVar.setAlpha(1.0f);
                v4.n0.x0(lzVar);
                si0 si0Var = (si0) obj2;
                si0Var.f38073c.remove(lzVar);
                si0Var.f38071a.removeView(lzVar);
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.vp vpVar = (org.telegram.ui.vp) obj2;
                ((si0) vpVar.d).f38076g.remove((AnimatorSet) obj);
                if (((si0) vpVar.d).f38076g.isEmpty()) {
                    ((si0) vpVar.d).f38072b.clear();
                    si0 si0Var2 = (si0) vpVar.d;
                    si0Var2.d = true;
                    si0Var2.f38071a.invalidate();
                    return;
                }
                return;
            case 4:
                bn0 bn0Var = (bn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(bn0Var.B);
                } catch (Exception unused) {
                }
                v80 v80Var = bn0Var.C;
                if (v80Var != null) {
                    org.telegram.messenger.g0.r(v80Var);
                    return;
                }
                return;
            case 5:
                fv0 fv0Var = (fv0) obj2;
                fv0Var.f33640b = 0.0f;
                fv0Var.invalidate();
                ((rk0) obj).invalidate();
                return;
            case 6:
                org.telegram.ui.Components.voip.b3 b3Var = (org.telegram.ui.Components.voip.b3) obj2;
                b3Var.d.setText((String) obj);
                b3Var.d.setTranslationY(0.0f);
                b3Var.d.setAlpha(1.0f);
                return;
            case 7:
                ((org.telegram.ui.Components.voip.b3) obj2).removeView((org.telegram.ui.Components.voip.a3) obj);
                return;
            case 8:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.ww) obj2).Q3 = null;
                return;
            case 9:
                org.telegram.ui.y50 y50Var = (org.telegram.ui.y50) obj2;
                y50Var.removeView((c20) obj);
                y50Var.d = null;
                y50Var.f52091a = null;
                y50Var.f52092b = false;
                return;
            case 10:
                wt0 wt0Var = (wt0) obj2;
                wt0Var.setVisibility(8);
                wt0Var.setX(0.0f);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                fd0 fd0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = fd0Var.f33520e;
                if (bitmap != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                fd0Var.f33521f = z9;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = fd0Var.f33524s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = fd0Var.f33525w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                fd0Var.h = true;
                fd0Var.f33522n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                fd0Var.f33524s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fd0Var, fd0Var.E, 0.0f, 1.0f));
                fd0Var.f33524s.setDuration(250L);
                fd0Var.f33524s.setInterpolator(new OvershootInterpolator(1.01f));
                fd0Var.f33524s.addListener(new dd0(fd0Var, 0));
                fd0Var.f33524s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f41569z2, photoViewer.f41366c4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(xq.f40346g);
                photoViewer.A2.addListener(new org.telegram.ui.d30(this, 10));
                photoViewer.A2.start();
                return;
            case 12:
                org.telegram.ui.us0 us0Var = (org.telegram.ui.us0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f50492n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.U.getChildCount(); i13++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i13);
                    if (childAt2 != us0Var.f50490e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 13:
                org.telegram.ui.wy0 wy0Var = (org.telegram.ui.wy0) obj2;
                if (wy0Var.h != null) {
                    wy0Var.h = null;
                    wy0Var.f51682n.e();
                    ((org.telegram.ui.zv) obj).onTransitionAnimationEnd(true, false);
                    wy0Var.f51680e = 1.0f;
                    wy0Var.g();
                    wy0Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) obj;
                if (wq0Var != null) {
                    wq0Var.f51476a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f41933s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.ru0(this, 13));
                return;
            case 15:
                ((org.telegram.ui.g11) obj).run();
                org.telegram.ui.q11 q11Var = (org.telegram.ui.q11) obj2;
                org.telegram.ui.g01 g01Var = q11Var.X0;
                if (g01Var != null) {
                    g01Var.dismiss();
                    q11Var.X0 = null;
                    return;
                }
                return;
            case 16:
                kb1 kb1Var = (kb1) obj2;
                kb1Var.removeView((c20) obj);
                kb1Var.f47159e = null;
                kb1Var.f47156a = null;
                kb1Var.f47157b = false;
                UsersSelectActivity usersSelectActivity = kb1Var.f47160f;
                usersSelectActivity.f42072c.setAllowDrawCursor(true);
                if (usersSelectActivity.P.isEmpty()) {
                    usersSelectActivity.f42072c.t(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ec1 ec1Var = (ec1) obj2;
                ec1Var.f45283e0.setScaleX(1.15f);
                ec1Var.f45283e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ec1Var.f45283e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                ec1Var.f45283e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f54137a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                tg.q1 q1Var = (tg.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f55816r0.b(q1Var.f55823y0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.f55824z0 = 1.0f;
                return;
            case 21:
                ((ti.i) obj2).f((sg.t0) obj);
                return;
            case 22:
                ((ug.w0) obj2).f56759s1 = false;
                ((ug.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            default:
                ug.f1 f1Var = (ug.f1) obj2;
                f1Var.f56494z2 = false;
                f1Var.f56493y2 = 1.0f;
                f1Var.f56479k2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new v4.e(1, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f38858a) {
            case 10:
                ((wt0) this.f38859b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f38859b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public v50(Object obj, View view, int i7) {
        this.f38858a = i7;
        this.f38859b = obj;
        this.f38860c = view;
    }

    public v50(si0 si0Var, lz lzVar, v4.n0 n0Var) {
        this.f38858a = 2;
        this.f38860c = si0Var;
        this.f38859b = lzVar;
    }
}

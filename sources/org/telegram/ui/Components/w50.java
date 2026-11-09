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
import org.telegram.ui.ic1;
import org.telegram.ui.nb1;
public final class w50 extends AnimatorListenerAdapter {
    public final int f39917a;
    public final Object f39918b;
    public final Object f39919c;

    public w50(int i7, Object obj, Object obj2) {
        this.f39917a = i7;
        this.f39919c = obj;
        this.f39918b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f39917a) {
            case 18:
                ((r0.m0) this.f39918b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7 = this.f39917a;
        Object obj = this.f39918b;
        Object obj2 = this.f39919c;
        switch (i7) {
            case 0:
                x50 x50Var = (x50) obj2;
                x50Var.removeView((d20) obj);
                x50Var.f40302c = null;
                x50Var.f40303e.U1 = null;
                x50Var.f40300a = false;
                return;
            case 1:
                pi0 pi0Var = (pi0) obj2;
                si0 si0Var = pi0Var.f37025e;
                if (((ValueAnimator) si0Var.f38084g) != null) {
                    ((qj0) si0Var.f38082e).V1 = false;
                    ArrayList arrayList = pi0Var.f37023b;
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
                        ((v4.b0) si0Var.f38083f).getClass();
                        v4.n0.x0(view);
                        ((qj0) si0Var.f38082e).removeView(view);
                        c8.ja jaVar = (c8.ja) si0Var.f38085i;
                        if (jaVar != null) {
                            jaVar.d(view);
                        }
                    }
                    ((qj0) si0Var.f38082e).setScrollEnabled(true);
                    ((qj0) si0Var.f38082e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.r2.f25212a;
                    int childCount = ((qj0) si0Var.f38082e).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((qj0) si0Var.f38082e).getChildAt(i11);
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
                    qi0 qi0Var = pi0Var.d;
                    if (qi0Var != null) {
                        qi0Var.E();
                    }
                    c8.ja jaVar2 = (c8.ja) si0Var.f38085i;
                    if (jaVar2 != null) {
                        jaVar2.a();
                    }
                    ((SparseArray) si0Var.f38086j).clear();
                    si0Var.f38084g = null;
                    return;
                }
                return;
            case 2:
                mz mzVar = (mz) obj;
                mzVar.setAlpha(1.0f);
                v4.n0.x0(mzVar);
                ti0 ti0Var = (ti0) obj2;
                ti0Var.f38432c.remove(mzVar);
                ti0Var.f38430a.removeView(mzVar);
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.xp xpVar = (org.telegram.ui.xp) obj2;
                ((ti0) xpVar.d).f38435g.remove((AnimatorSet) obj);
                if (((ti0) xpVar.d).f38435g.isEmpty()) {
                    ((ti0) xpVar.d).f38431b.clear();
                    ti0 ti0Var2 = (ti0) xpVar.d;
                    ti0Var2.d = true;
                    ti0Var2.f38430a.invalidate();
                    return;
                }
                return;
            case 4:
                cn0 cn0Var = (cn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(cn0Var.B);
                } catch (Exception unused) {
                }
                w80 w80Var = cn0Var.C;
                if (w80Var != null) {
                    org.telegram.messenger.g0.r(w80Var);
                    return;
                }
                return;
            case 5:
                hv0 hv0Var = (hv0) obj2;
                hv0Var.f34382b = 0.0f;
                hv0Var.invalidate();
                ((sk0) obj).invalidate();
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
                ((org.telegram.ui.yw) obj2).R3 = null;
                return;
            case 9:
                org.telegram.ui.a60 a60Var = (org.telegram.ui.a60) obj2;
                a60Var.removeView((d20) obj);
                a60Var.d = null;
                a60Var.f43593a = null;
                a60Var.f43594b = false;
                return;
            case 10:
                yt0 yt0Var = (yt0) obj2;
                yt0Var.setVisibility(8);
                yt0Var.setX(0.0f);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                gd0 gd0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = gd0Var.f33934e;
                if (bitmap != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                gd0Var.f33935f = z9;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = gd0Var.f33938s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = gd0Var.f33939w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                gd0Var.h = true;
                gd0Var.f33936n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                gd0Var.f33938s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(gd0Var, gd0Var.E, 0.0f, 1.0f));
                gd0Var.f33938s.setDuration(250L);
                gd0Var.f33938s.setInterpolator(new OvershootInterpolator(1.01f));
                gd0Var.f33938s.addListener(new ed0(gd0Var, 0));
                gd0Var.f33938s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f41580z2, photoViewer.f41377c4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(xq.f40459g);
                photoViewer.A2.addListener(new org.telegram.ui.f30(this, 10));
                photoViewer.A2.start();
                return;
            case 12:
                org.telegram.ui.ws0 ws0Var = (org.telegram.ui.ws0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.f51471n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.U.getChildCount(); i13++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i13);
                    if (childAt2 != ws0Var.f51469e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 13:
                org.telegram.ui.zy0 zy0Var = (org.telegram.ui.zy0) obj2;
                if (zy0Var.h != null) {
                    zy0Var.h = null;
                    zy0Var.f52710n.e();
                    ((org.telegram.ui.bw) obj).onTransitionAnimationEnd(true, false);
                    zy0Var.f52708e = 1.0f;
                    zy0Var.g();
                    zy0Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.yq0 yq0Var = (org.telegram.ui.yq0) obj;
                if (yq0Var != null) {
                    yq0Var.f52159a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f41944s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.tu0(this, 13));
                return;
            case 15:
                ((org.telegram.ui.i11) obj).run();
                org.telegram.ui.s11 s11Var = (org.telegram.ui.s11) obj2;
                org.telegram.ui.i01 i01Var = s11Var.X0;
                if (i01Var != null) {
                    i01Var.dismiss();
                    s11Var.X0 = null;
                    return;
                }
                return;
            case 16:
                nb1 nb1Var = (nb1) obj2;
                nb1Var.removeView((d20) obj);
                nb1Var.f48155e = null;
                nb1Var.f48152a = null;
                nb1Var.f48153b = false;
                UsersSelectActivity usersSelectActivity = nb1Var.f48156f;
                usersSelectActivity.f42083c.setAllowDrawCursor(true);
                if (usersSelectActivity.P.isEmpty()) {
                    usersSelectActivity.f42083c.t(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                ic1 ic1Var = (ic1) obj2;
                ic1Var.f46583e0.setScaleX(1.15f);
                ic1Var.f46583e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ic1Var.f46583e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                ic1Var.f46583e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f54243a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                tg.q1 q1Var = (tg.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f55921r0.b(q1Var.f55928y0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.f55929z0 = 1.0f;
                return;
            case 21:
                ((ti.i) obj2).f((sh.b) obj);
                return;
            case 22:
                ((ug.w0) obj2).f56864s1 = false;
                ((ug.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            default:
                ug.f1 f1Var = (ug.f1) obj2;
                f1Var.f56599z2 = false;
                f1Var.f56598y2 = 1.0f;
                f1Var.f56584k2.invalidate();
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
        switch (this.f39917a) {
            case 10:
                ((yt0) this.f39918b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f39918b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public w50(Object obj, View view, int i7) {
        this.f39917a = i7;
        this.f39918b = obj;
        this.f39919c = view;
    }

    public w50(ti0 ti0Var, mz mzVar, v4.n0 n0Var) {
        this.f39917a = 2;
        this.f39919c = ti0Var;
        this.f39918b = mzVar;
    }
}

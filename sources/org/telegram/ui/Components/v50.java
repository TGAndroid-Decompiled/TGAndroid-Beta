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
public final class v50 extends AnimatorListenerAdapter {
    public final int f38893a;
    public final Object f38894b;
    public final Object f38895c;

    public v50(int i7, Object obj, Object obj2) {
        this.f38893a = i7;
        this.f38895c = obj;
        this.f38894b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38893a) {
            case 18:
                ((r0.m0) this.f38894b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7 = this.f38893a;
        Object obj = this.f38894b;
        Object obj2 = this.f38895c;
        switch (i7) {
            case 0:
                w50 w50Var = (w50) obj2;
                w50Var.removeView((c20) obj);
                w50Var.f39814c = null;
                w50Var.f39815e.U1 = null;
                w50Var.f39812a = false;
                return;
            case 1:
                oi0 oi0Var = (oi0) obj2;
                ri0 ri0Var = oi0Var.f36648e;
                if (((ValueAnimator) ri0Var.f37677g) != null) {
                    ((pj0) ri0Var.f37675e).V1 = false;
                    ArrayList arrayList = oi0Var.f36646b;
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
                        ((v4.b0) ri0Var.f37676f).getClass();
                        v4.n0.x0(view);
                        ((pj0) ri0Var.f37675e).removeView(view);
                        c8.ja jaVar = (c8.ja) ri0Var.f37678i;
                        if (jaVar != null) {
                            jaVar.d(view);
                        }
                    }
                    ((pj0) ri0Var.f37675e).setScrollEnabled(true);
                    ((pj0) ri0Var.f37675e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.r2.f25212a;
                    int childCount = ((pj0) ri0Var.f37675e).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((pj0) ri0Var.f37675e).getChildAt(i11);
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
                    c8.ja jaVar2 = (c8.ja) ri0Var.f37678i;
                    if (jaVar2 != null) {
                        jaVar2.a();
                    }
                    ((SparseArray) ri0Var.f37679j).clear();
                    ri0Var.f37677g = null;
                    return;
                }
                return;
            case 2:
                mz mzVar = (mz) obj;
                mzVar.setAlpha(1.0f);
                v4.n0.x0(mzVar);
                si0 si0Var = (si0) obj2;
                si0Var.f38089c.remove(mzVar);
                si0Var.f38087a.removeView(mzVar);
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.vp vpVar = (org.telegram.ui.vp) obj2;
                ((si0) vpVar.d).f38092g.remove((AnimatorSet) obj);
                if (((si0) vpVar.d).f38092g.isEmpty()) {
                    ((si0) vpVar.d).f38088b.clear();
                    si0 si0Var2 = (si0) vpVar.d;
                    si0Var2.d = true;
                    si0Var2.f38087a.invalidate();
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
                fv0Var.f33649b = 0.0f;
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
                y50Var.f52084a = null;
                y50Var.f52085b = false;
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
                ImageReceiver imageReceiver = fd0Var.f33527e;
                if (bitmap != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                fd0Var.f33528f = z9;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = fd0Var.f33531s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = fd0Var.f33532w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                fd0Var.h = true;
                fd0Var.f33529n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                fd0Var.f33531s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fd0Var, fd0Var.E, 0.0f, 1.0f));
                fd0Var.f33531s.setDuration(250L);
                fd0Var.f33531s.setInterpolator(new OvershootInterpolator(1.01f));
                fd0Var.f33531s.addListener(new dd0(fd0Var, 0));
                fd0Var.f33531s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f41573z2, photoViewer.f41370c4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(xq.f40367g);
                photoViewer.A2.addListener(new org.telegram.ui.d30(this, 10));
                photoViewer.A2.start();
                return;
            case 12:
                org.telegram.ui.us0 us0Var = (org.telegram.ui.us0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = us0Var.f50415n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.U.getChildCount(); i13++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i13);
                    if (childAt2 != us0Var.f50413e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 13:
                org.telegram.ui.wy0 wy0Var = (org.telegram.ui.wy0) obj2;
                if (wy0Var.h != null) {
                    wy0Var.h = null;
                    wy0Var.f51689n.e();
                    ((org.telegram.ui.zv) obj).onTransitionAnimationEnd(true, false);
                    wy0Var.f51687e = 1.0f;
                    wy0Var.g();
                    wy0Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) obj;
                if (wq0Var != null) {
                    wq0Var.f51483a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f41937s = false;
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
                lb1 lb1Var = (lb1) obj2;
                lb1Var.removeView((c20) obj);
                lb1Var.f47504e = null;
                lb1Var.f47501a = null;
                lb1Var.f47502b = false;
                UsersSelectActivity usersSelectActivity = lb1Var.f47505f;
                usersSelectActivity.f42076c.setAllowDrawCursor(true);
                if (usersSelectActivity.P.isEmpty()) {
                    usersSelectActivity.f42076c.t(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                fc1 fc1Var = (fc1) obj2;
                fc1Var.f45551e0.setScaleX(1.15f);
                fc1Var.f45551e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fc1Var.f45551e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                fc1Var.f45551e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f54231a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                tg.q1 q1Var = (tg.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f55909r0.b(q1Var.f55916y0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.f55917z0 = 1.0f;
                return;
            case 21:
                ((ti.i) obj2).f((sg.t0) obj);
                return;
            case 22:
                ((ug.w0) obj2).f56852s1 = false;
                ((ug.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            default:
                ug.f1 f1Var = (ug.f1) obj2;
                f1Var.f56587z2 = false;
                f1Var.f56586y2 = 1.0f;
                f1Var.f56572k2.invalidate();
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
        switch (this.f38893a) {
            case 10:
                ((wt0) this.f38894b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f38894b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public v50(Object obj, View view, int i7) {
        this.f38893a = i7;
        this.f38894b = obj;
        this.f38895c = view;
    }

    public v50(si0 si0Var, mz mzVar, v4.n0 n0Var) {
        this.f38893a = 2;
        this.f38895c = si0Var;
        this.f38894b = mzVar;
    }
}

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
import org.telegram.ui.jc1;
import org.telegram.ui.ob1;
public final class v50 extends AnimatorListenerAdapter {
    public final int f38861a;
    public final Object f38862b;
    public final Object f38863c;

    public v50(int i7, Object obj, Object obj2) {
        this.f38861a = i7;
        this.f38863c = obj;
        this.f38862b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38861a) {
            case 18:
                ((r0.m0) this.f38862b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z9;
        int i7 = this.f38861a;
        Object obj = this.f38862b;
        Object obj2 = this.f38863c;
        switch (i7) {
            case 0:
                w50 w50Var = (w50) obj2;
                w50Var.removeView((c20) obj);
                w50Var.f39887c = null;
                w50Var.f39888e.X1 = null;
                w50Var.f39885a = false;
                return;
            case 1:
                oi0 oi0Var = (oi0) obj2;
                ri0 ri0Var = oi0Var.f36619e;
                if (((ValueAnimator) ri0Var.f37670g) != null) {
                    ((pj0) ri0Var.f37668e).V1 = false;
                    ArrayList arrayList = oi0Var.f36617b;
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
                        ((v4.b0) ri0Var.f37669f).getClass();
                        v4.n0.x0(view);
                        ((pj0) ri0Var.f37668e).removeView(view);
                        c8.ja jaVar = (c8.ja) ri0Var.f37671i;
                        if (jaVar != null) {
                            jaVar.d(view);
                        }
                    }
                    ((pj0) ri0Var.f37668e).setScrollEnabled(true);
                    ((pj0) ri0Var.f37668e).setVerticalScrollBarEnabled(true);
                    boolean z10 = org.telegram.messenger.r2.f25216a;
                    int childCount = ((pj0) ri0Var.f37668e).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((pj0) ri0Var.f37668e).getChildAt(i11);
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
                    c8.ja jaVar2 = (c8.ja) ri0Var.f37671i;
                    if (jaVar2 != null) {
                        jaVar2.a();
                    }
                    ((SparseArray) ri0Var.f37672j).clear();
                    ri0Var.f37670g = null;
                    return;
                }
                return;
            case 2:
                lz lzVar = (lz) obj;
                lzVar.setAlpha(1.0f);
                v4.n0.x0(lzVar);
                si0 si0Var = (si0) obj2;
                si0Var.f38006c.remove(lzVar);
                si0Var.f38004a.removeView(lzVar);
                return;
            case 3:
                super.onAnimationEnd(animator);
                org.telegram.ui.xp xpVar = (org.telegram.ui.xp) obj2;
                ((si0) xpVar.d).f38009g.remove((AnimatorSet) obj);
                if (((si0) xpVar.d).f38009g.isEmpty()) {
                    ((si0) xpVar.d).f38005b.clear();
                    si0 si0Var2 = (si0) xpVar.d;
                    si0Var2.d = true;
                    si0Var2.f38004a.invalidate();
                    return;
                }
                return;
            case 4:
                bn0 bn0Var = (bn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(bn0Var.B);
                } catch (Exception unused) {
                }
                r80 r80Var = bn0Var.C;
                if (r80Var != null) {
                    org.telegram.messenger.g0.r(r80Var);
                    return;
                }
                return;
            case 5:
                gv0 gv0Var = (gv0) obj2;
                gv0Var.f33983b = 0.0f;
                gv0Var.invalidate();
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
                ((org.telegram.ui.zw) obj2).R3 = null;
                return;
            case 9:
                org.telegram.ui.b60 b60Var = (org.telegram.ui.b60) obj2;
                b60Var.removeView((c20) obj);
                b60Var.d = null;
                b60Var.f43934a = null;
                b60Var.f43935b = false;
                return;
            case 10:
                xt0 xt0Var = (xt0) obj2;
                xt0Var.setVisibility(8);
                xt0Var.setX(0.0f);
                return;
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                fd0 fd0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = fd0Var.f33529e;
                if (bitmap != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                fd0Var.f33530f = z9;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = fd0Var.f33533s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = fd0Var.f33534w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                fd0Var.h = true;
                fd0Var.f33531n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                fd0Var.f33533s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(fd0Var, fd0Var.E, 0.0f, 1.0f));
                fd0Var.f33533s.setDuration(250L);
                fd0Var.f33533s.setInterpolator(new OvershootInterpolator(1.01f));
                fd0Var.f33533s.addListener(new dd0(fd0Var, 0));
                fd0Var.f33533s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f41571z2, photoViewer.f41368c4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(wq.f40047g);
                photoViewer.A2.addListener(new org.telegram.ui.g30(this, 10));
                photoViewer.A2.start();
                return;
            case 12:
                org.telegram.ui.xs0 xs0Var = (org.telegram.ui.xs0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = xs0Var.f51812n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.U.getChildCount(); i13++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i13);
                    if (childAt2 != xs0Var.f51810e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 13:
                org.telegram.ui.az0 az0Var = (org.telegram.ui.az0) obj2;
                if (az0Var.h != null) {
                    az0Var.h = null;
                    az0Var.f43849n.e();
                    ((org.telegram.ui.cw) obj).onTransitionAnimationEnd(true, false);
                    az0Var.f43847e = 1.0f;
                    az0Var.g();
                    az0Var.d(false);
                    return;
                }
                return;
            case 14:
                org.telegram.ui.zq0 zq0Var = (org.telegram.ui.zq0) obj;
                if (zq0Var != null) {
                    zq0Var.f52503a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f41935s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.uu0(this, 13));
                return;
            case 15:
                ((org.telegram.ui.j11) obj).run();
                org.telegram.ui.t11 t11Var = (org.telegram.ui.t11) obj2;
                org.telegram.ui.j01 j01Var = t11Var.X0;
                if (j01Var != null) {
                    j01Var.dismiss();
                    t11Var.X0 = null;
                    return;
                }
                return;
            case 16:
                ob1 ob1Var = (ob1) obj2;
                ob1Var.removeView((c20) obj);
                ob1Var.f48493e = null;
                ob1Var.f48490a = null;
                ob1Var.f48491b = false;
                UsersSelectActivity usersSelectActivity = ob1Var.f48494f;
                usersSelectActivity.f42074c.setAllowDrawCursor(true);
                if (usersSelectActivity.P.isEmpty()) {
                    usersSelectActivity.f42074c.t(true, true);
                    return;
                }
                return;
            case 17:
                ((Runnable) obj).run();
                jc1 jc1Var = (jc1) obj2;
                jc1Var.f46919e0.setScaleX(1.15f);
                jc1Var.f46919e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jc1Var.f46919e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                jc1Var.f46919e0.setVisibility(8);
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f54242a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                tg.q1 q1Var = (tg.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f55920r0.b(q1Var.f55927y0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.f55928z0 = 1.0f;
                return;
            case 21:
                ((ti.i) obj2).f((sh.b) obj);
                return;
            case 22:
                ((ug.w0) obj2).f56863v1 = false;
                ((ug.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            default:
                ug.f1 f1Var = (ug.f1) obj2;
                f1Var.C2 = false;
                f1Var.B2 = 1.0f;
                f1Var.f56586n2.invalidate();
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
        switch (this.f38861a) {
            case 10:
                ((xt0) this.f38862b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f38862b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public v50(Object obj, View view, int i7) {
        this.f38861a = i7;
        this.f38862b = obj;
        this.f38863c = view;
    }

    public v50(si0 si0Var, lz lzVar, v4.n0 n0Var) {
        this.f38861a = 2;
        this.f38863c = si0Var;
        this.f38862b = lzVar;
    }
}

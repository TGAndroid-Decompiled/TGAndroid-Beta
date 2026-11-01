package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ed1;
import org.telegram.ui.zd1;
public final class jw0 extends AnimatorListenerAdapter {
    public final int f27582a;
    public final Object f27583b;
    public final Object f27584c;

    public jw0(int i10, View view, Object obj) {
        this.f27582a = i10;
        this.f27583b = obj;
        this.f27584c = view;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27582a) {
            case 14:
                ((r0.l0) this.f27583b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f27582a;
        Object obj = this.f27583b;
        Object obj2 = this.f27584c;
        switch (i10) {
            case 0:
                kw0 kw0Var = (kw0) obj2;
                kw0Var.f27965b = 0.0f;
                kw0Var.invalidate();
                ((vl0) obj).invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.s2 s2Var = (org.telegram.ui.Components.voip.s2) obj2;
                s2Var.d.setText((String) obj);
                s2Var.d.setTranslationY(0.0f);
                s2Var.d.setAlpha(1.0f);
                return;
            case 2:
                ((org.telegram.ui.Components.voip.s2) obj2).removeView((org.telegram.ui.Components.voip.r2) obj);
                return;
            case 3:
                View view = (View) obj;
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                ((org.telegram.ui.zx) obj2).Q3 = null;
                return;
            case 4:
                org.telegram.ui.w60 w60Var = (org.telegram.ui.w60) obj2;
                w60Var.removeView((s20) obj);
                w60Var.d = null;
                w60Var.f42677a = null;
                w60Var.f42678b = false;
                return;
            case 5:
                av0 av0Var = (av0) obj2;
                av0Var.setVisibility(8);
                av0Var.setX(0.0f);
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                be0 be0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = be0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                be0Var.f24717f = z10;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = be0Var.f24720s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = be0Var.f24721w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                be0Var.h = true;
                be0Var.f24718n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                be0Var.f24720s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(be0Var, be0Var.E, 0.0f, 1.0f));
                be0Var.f24720s.setDuration(250L);
                be0Var.f24720s.setInterpolator(new OvershootInterpolator(1.01f));
                be0Var.f24720s.addListener(new zd0(be0Var, 0));
                be0Var.f24720s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f33667z2, photoViewer.f33472d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(gr.f26524g);
                photoViewer.A2.addListener(new org.telegram.ui.Components.voip.i2(this, 21));
                photoViewer.A2.start();
                return;
            case 7:
                org.telegram.ui.cu0 cu0Var = (org.telegram.ui.cu0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = cu0Var.f36413n;
                ((View) obj).setVisibility(8);
                for (int i11 = 0; i11 < premiumPreviewFragment.U.getChildCount(); i11++) {
                    View childAt = premiumPreviewFragment.U.getChildAt(i11);
                    if (childAt != cu0Var.e) {
                        childAt.setTranslationY(0.0f);
                    }
                }
                return;
            case 8:
                org.telegram.ui.k01 k01Var = (org.telegram.ui.k01) obj2;
                if (k01Var.h != null) {
                    k01Var.h = null;
                    k01Var.f38626n.e();
                    ((org.telegram.ui.dx) obj).onTransitionAnimationEnd(true, false);
                    k01Var.e = 1.0f;
                    k01Var.g();
                    k01Var.d(false);
                    return;
                }
                return;
            case 9:
                org.telegram.ui.fs0 fs0Var = (org.telegram.ui.fs0) obj;
                if (fs0Var != null) {
                    fs0Var.f37215a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f34023s = false;
                org.telegram.messenger.i0.g3(new org.telegram.ui.vv0(this, 15));
                return;
            case 10:
                ((org.telegram.ui.w21) obj).run();
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                org.telegram.ui.w11 w11Var = g31Var.X0;
                if (w11Var != null) {
                    w11Var.dismiss();
                    g31Var.X0 = null;
                    return;
                }
                return;
            case 11:
                ed1 ed1Var = (ed1) obj2;
                ed1Var.removeView((s20) obj);
                ed1Var.e = null;
                ed1Var.f36804a = null;
                ed1Var.f36805b = false;
                UsersSelectActivity usersSelectActivity = ed1Var.f36807f;
                usersSelectActivity.f34155c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f34155c.t(true, true);
                    return;
                }
                return;
            case 12:
                ((Runnable) obj).run();
                zd1 zd1Var = (zd1) obj2;
                zd1Var.f43946e0.setScaleX(1.15f);
                zd1Var.f43946e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zd1Var.f43946e0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(10.0f);
                zd1Var.f43946e0.setVisibility(8);
                return;
            case 13:
                qg.g gVar = (qg.g) obj2;
                gVar.removeView((s20) obj);
                gVar.h.clear();
                gVar.f45549b = null;
                gVar.f45550c = false;
                ((qg.h) gVar.f45552n).f45554b.setAllowDrawCursor(true);
                return;
            case 14:
                ((r0.l0) obj).c();
                return;
            case 15:
                r0.u0 u0Var = (r0.u0) obj;
                u0Var.f46167a.d(1.0f);
                r0.p0.e((View) obj2, u0Var);
                return;
            case 16:
                rh.a9 a9Var = (rh.a9) obj2;
                a9Var.f46642b.remove((rh.z8) obj);
                a9Var.f1();
                return;
            case 17:
                super.onAnimationEnd(animator);
                ((th.l) obj2).f49166b0.f49222j0 = null;
                org.telegram.messenger.i0.E2((View) obj);
                return;
            case 18:
                ProfileStoriesView profileStoriesView = (ProfileStoriesView) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i12 = ProfileStoriesView.f34063s0;
                    if (org.telegram.messenger.uz.o() > 0) {
                        org.telegram.messenger.i0.b4(profileStoriesView);
                        org.telegram.messenger.i0.h3(new sg.v(profileStoriesView, 9), 180L);
                    }
                }
                profileStoriesView.W = 1.0f;
                profileStoriesView.invalidate();
                return;
            case 19:
                View view2 = (View) obj;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                ((vh.k2) ((org.telegram.ui.eo0) obj2).f36881c).h.setVisibility(8);
                return;
            case 20:
                vh.n2 n2Var = (vh.n2) obj2;
                n2Var.f51517j1 = null;
                n2Var.l1 = null;
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 21:
                vh.n nVar = (vh.n) obj2;
                ((jg.i2) obj).setDraw(true);
                if (nVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) nVar.getParent()).removeView(nVar);
                    return;
                }
                return;
            default:
                qg.g gVar2 = (qg.g) obj2;
                gVar2.removeView((s20) obj);
                gVar2.h.clear();
                gVar2.f45549b = null;
                gVar2.f45550c = false;
                vh.t6 t6Var = (vh.t6) gVar2.f45552n;
                t6Var.f51988b.setAllowDrawCursor(true);
                vh.i6 i6Var = t6Var.h;
                if (i6Var != null) {
                    i6Var.run();
                }
                if (t6Var.L) {
                    t6Var.fullScroll(130);
                    t6Var.L = false;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f27582a) {
            case 5:
                ((av0) this.f27583b).setVisibility(0);
                return;
            case 14:
                ((r0.l0) this.f27583b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public jw0(int i10, Object obj, Object obj2) {
        this.f27582a = i10;
        this.f27584c = obj;
        this.f27583b = obj2;
    }
}

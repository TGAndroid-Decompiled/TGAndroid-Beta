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
import org.telegram.ui.hc1;
import org.telegram.ui.nb1;
public final class h10 extends AnimatorListenerAdapter {
    public final int f35694a;
    public final Object f35695b;
    public final Object f35696c;

    public h10(int i7, Object obj, Object obj2) {
        this.f35694a = i7;
        this.f35696c = obj;
        this.f35695b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35694a) {
            case 19:
                ((r0.m0) this.f35695b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i7 = this.f35694a;
        Object obj = this.f35695b;
        Object obj2 = this.f35696c;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                i10 i10Var = (i10) obj2;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    i10Var.removeView((View) arrayList.get(i10));
                }
                i10Var.f36063e.clear();
                i10Var.f36060a = null;
                i10Var.f36061b = false;
                return;
            case 1:
                k60 k60Var = (k60) obj2;
                k60Var.removeView((p20) obj);
                k60Var.f36783c = null;
                k60Var.f36784e.Y1 = null;
                k60Var.f36781a = false;
                return;
            case 2:
                ej0 ej0Var = (ej0) obj2;
                org.telegram.ui.ActionBar.k5 k5Var = ej0Var.f34823e;
                if (((ValueAnimator) k5Var.h) != null) {
                    ((ek0) k5Var.f29154e).W1 = false;
                    ArrayList arrayList2 = ej0Var.f34821b;
                    int size = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList2.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) view).c(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((v4.b0) k5Var.f29155f).getClass();
                        v4.o0.x0(view);
                        ((ek0) k5Var.f29154e).removeView(view);
                        c8.ra raVar = (c8.ra) k5Var.f29157r;
                        if (raVar != null) {
                            raVar.d(view);
                        }
                    }
                    ((ek0) k5Var.f29154e).setScrollEnabled(true);
                    ((ek0) k5Var.f29154e).setVerticalScrollBarEnabled(true);
                    boolean z11 = org.telegram.messenger.s2.f26694a;
                    int childCount = ((ek0) k5Var.f29154e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((ek0) k5Var.f29154e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.q4) {
                            ((org.telegram.ui.Cells.q4) childAt).c(false, false);
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
                            ((org.telegram.ui.Cells.q4) view2).c(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    fj0 fj0Var = ej0Var.d;
                    if (fj0Var != null) {
                        fj0Var.E();
                    }
                    c8.ra raVar2 = (c8.ra) k5Var.f29157r;
                    if (raVar2 != null) {
                        raVar2.a();
                    }
                    ((SparseArray) k5Var.f29158s).clear();
                    k5Var.h = null;
                    return;
                }
                return;
            case 3:
                yz yzVar = (yz) obj;
                yzVar.setAlpha(1.0f);
                v4.o0.x0(yzVar);
                hj0 hj0Var = (hj0) obj2;
                hj0Var.f35875c.remove(yzVar);
                hj0Var.f35873a.removeView(yzVar);
                return;
            case 4:
                super.onAnimationEnd(animator);
                org.telegram.ui.yp ypVar = (org.telegram.ui.yp) obj2;
                ((hj0) ypVar.d).f35878g.remove((AnimatorSet) obj);
                if (((hj0) ypVar.d).f35878g.isEmpty()) {
                    ((hj0) ypVar.d).f35874b.clear();
                    hj0 hj0Var2 = (hj0) ypVar.d;
                    hj0Var2.d = true;
                    hj0Var2.f35873a.invalidate();
                    return;
                }
                return;
            case 5:
                qn0 qn0Var = (qn0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(qn0Var.B);
                } catch (Exception unused) {
                }
                jn0 jn0Var = qn0Var.C;
                if (jn0Var != null) {
                    org.telegram.messenger.g0.r(jn0Var);
                    return;
                }
                return;
            case 6:
                sv0 sv0Var = (sv0) obj2;
                sv0Var.f39652b = 0.0f;
                sv0Var.invalidate();
                ((gl0) obj).invalidate();
                return;
            case 7:
                org.telegram.ui.Components.voip.e3 e3Var = (org.telegram.ui.Components.voip.e3) obj2;
                e3Var.d.setText((String) obj);
                e3Var.d.setTranslationY(0.0f);
                e3Var.d.setAlpha(1.0f);
                return;
            case 8:
                ((org.telegram.ui.Components.voip.e3) obj2).removeView((org.telegram.ui.Components.voip.d3) obj);
                return;
            case 9:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.cx) obj2).V3 = null;
                return;
            case 10:
                org.telegram.ui.z50 z50Var = (org.telegram.ui.z50) obj2;
                z50Var.removeView((p20) obj);
                z50Var.d = null;
                z50Var.f54403a = null;
                z50Var.f54404b = false;
                return;
            case 11:
                iu0 iu0Var = (iu0) obj2;
                iu0Var.setVisibility(8);
                iu0Var.setX(0.0f);
                return;
            case 12:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                rd0 rd0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = rd0Var.f39120e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rd0Var.f39121f = z10;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = rd0Var.f39124s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = rd0Var.f39125w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                rd0Var.h = true;
                rd0Var.f39122n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                rd0Var.f39124s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(rd0Var, rd0Var.F, 0.0f, 1.0f));
                rd0Var.f39124s.setDuration(250L);
                rd0Var.f39124s.setInterpolator(new OvershootInterpolator(1.01f));
                rd0Var.f39124s.addListener(new pd0(rd0Var, 0));
                rd0Var.f39124s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.f43202d4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(nr.f37918g);
                photoViewer.B2.addListener(new org.telegram.ui.ay(this, 11));
                photoViewer.B2.start();
                return;
            case 13:
                org.telegram.ui.ws0 ws0Var = (org.telegram.ui.ws0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ws0Var.f53450n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.V.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i14);
                    if (childAt2 != ws0Var.f53448e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 14:
                org.telegram.ui.yy0 yy0Var = (org.telegram.ui.yy0) obj2;
                if (yy0Var.h != null) {
                    yy0Var.h = null;
                    yy0Var.f54304n.e();
                    ((org.telegram.ui.ew) obj).onTransitionAnimationEnd(true, false);
                    yy0Var.f54302e = 1.0f;
                    yy0Var.g();
                    yy0Var.d(false);
                    return;
                }
                return;
            case 15:
                org.telegram.ui.xq0 xq0Var = (org.telegram.ui.xq0) obj;
                if (xq0Var != null) {
                    xq0Var.f53898a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f43764s = false;
                org.telegram.messenger.g0.g3(new org.telegram.ui.su0(this, 13));
                return;
            case 16:
                ((org.telegram.ui.h11) obj).run();
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) obj2;
                org.telegram.ui.h01 h01Var = r11Var.Y0;
                if (h01Var != null) {
                    h01Var.dismiss();
                    r11Var.Y0 = null;
                    return;
                }
                return;
            case 17:
                nb1 nb1Var = (nb1) obj2;
                nb1Var.removeView((p20) obj);
                nb1Var.f50159e = null;
                nb1Var.f50156a = null;
                nb1Var.f50157b = false;
                UsersSelectActivity usersSelectActivity = nb1Var.f50160f;
                usersSelectActivity.f43906c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.f43906c.t(true, true);
                    return;
                }
                return;
            case 18:
                ((Runnable) obj).run();
                hc1 hc1Var = (hc1) obj2;
                hc1Var.f48310f0.setScaleX(1.15f);
                hc1Var.f48310f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hc1Var.f48310f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                hc1Var.f48310f0.setVisibility(8);
                return;
            case 19:
                ((r0.m0) obj).c();
                return;
            case 20:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f56296a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 21:
                tg.s1 s1Var = (tg.s1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    s1Var.f58127s0.b(s1Var.f58134z0, false);
                }
                s1Var.setRotationY(0.0f);
                s1Var.A0 = 1.0f;
                return;
            case 22:
                ((ug.y0) obj2).f58970w1 = false;
                ((ug.p0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 23:
                ug.h1 h1Var = (ug.h1) obj2;
                h1Var.D2 = false;
                h1Var.C2 = 1.0f;
                h1Var.f58694o2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new v4.e(1, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                ((wi.h) obj2).f((vg.d) obj);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f35694a) {
            case 11:
                ((iu0) this.f35695b).setVisibility(0);
                return;
            case 19:
                ((r0.m0) this.f35695b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public h10(Object obj, View view, int i7) {
        this.f35694a = i7;
        this.f35695b = obj;
        this.f35696c = view;
    }

    public h10(hj0 hj0Var, yz yzVar, v4.o0 o0Var) {
        this.f35694a = 3;
        this.f35696c = hj0Var;
        this.f35695b = yzVar;
    }
}

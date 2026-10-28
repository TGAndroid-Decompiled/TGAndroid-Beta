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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.rh1;
import org.telegram.ui.tg1;
public final class ml0 extends AnimatorListenerAdapter {
    public final int f30557a;
    public final Object f30558b;
    public final Object f30559c;

    public ml0(int i10, Object obj, Object obj2) {
        this.f30557a = i10;
        this.f30559c = obj;
        this.f30558b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f30557a) {
            case 17:
                ((r0.m0) this.f30558b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i10 = this.f30557a;
        Object obj = this.f30558b;
        Object obj2 = this.f30559c;
        switch (i10) {
            case 0:
                nl0 nl0Var = (nl0) obj2;
                ql0 ql0Var = nl0Var.e;
                if (((ValueAnimator) ql0Var.f31937g) != null) {
                    ((nm0) ql0Var.e).V1 = false;
                    ArrayList arrayList = nl0Var.f30953b;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj3 = arrayList.get(i11);
                        i11++;
                        View view = (View) obj3;
                        if (view instanceof org.telegram.ui.Cells.s4) {
                            ((org.telegram.ui.Cells.s4) view).b(false, true);
                        }
                        view.setTranslationY(0.0f);
                        ((s4.c0) ql0Var.f31936f).getClass();
                        s4.p0.x0(view);
                        ((nm0) ql0Var.e).removeView(view);
                        kb1 kb1Var = (kb1) ql0Var.f31938i;
                        if (kb1Var != null) {
                            kb1Var.S(view);
                        }
                    }
                    ((nm0) ql0Var.e).setScrollEnabled(true);
                    ((nm0) ql0Var.e).setVerticalScrollBarEnabled(true);
                    if (BuildVars.DEBUG_PRIVATE_VERSION) {
                        if (((nm0) ql0Var.e).e.k() == ((nm0) ql0Var.e).getChildCount()) {
                            if (((ArrayList) ((nm0) ql0Var.e).e.d).size() != 0) {
                                throw new RuntimeException("hidden child count must be 0");
                            }
                        } else {
                            throw new RuntimeException("views count in child helper must be quals views count in recycler view");
                        }
                    }
                    int childCount = ((nm0) ql0Var.e).getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = ((nm0) ql0Var.e).getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.s4) {
                            ((org.telegram.ui.Cells.s4) childAt).b(false, false);
                        }
                        childAt.setTranslationY(0.0f);
                    }
                    ArrayList arrayList2 = (ArrayList) obj;
                    int size2 = arrayList2.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj4 = arrayList2.get(i13);
                        i13++;
                        View view2 = (View) obj4;
                        if (view2 instanceof org.telegram.ui.Cells.s4) {
                            ((org.telegram.ui.Cells.s4) view2).b(false, false);
                        }
                        view2.setTranslationY(0.0f);
                    }
                    ol0 ol0Var = nl0Var.d;
                    if (ol0Var != null) {
                        ol0Var.E();
                    }
                    kb1 kb1Var2 = (kb1) ql0Var.f31938i;
                    if (kb1Var2 != null) {
                        kb1Var2.N();
                    }
                    ((SparseArray) ql0Var.f31939j).clear();
                    ql0Var.f31937g = null;
                    return;
                }
                return;
            case 1:
                c10 c10Var = (c10) obj;
                c10Var.setAlpha(1.0f);
                s4.p0.x0(c10Var);
                rl0 rl0Var = (rl0) obj2;
                rl0Var.f32276c.remove(c10Var);
                rl0Var.f32274a.removeView(c10Var);
                return;
            case 2:
                super.onAnimationEnd(animator);
                org.telegram.ui.tq tqVar = (org.telegram.ui.tq) obj2;
                ((rl0) tqVar.d).f32278g.remove((AnimatorSet) obj);
                if (((rl0) tqVar.d).f32278g.isEmpty()) {
                    ((rl0) tqVar.d).f32275b.clear();
                    rl0 rl0Var2 = (rl0) tqVar.d;
                    rl0Var2.d = true;
                    rl0Var2.f32274a.invalidate();
                    return;
                }
                return;
            case 3:
                cq0 cq0Var = (cq0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(cq0Var.B);
                } catch (Exception unused) {
                }
                u90 u90Var = cq0Var.C;
                if (u90Var != null) {
                    AndroidUtilities.cancelRunOnUIThread(u90Var);
                    return;
                }
                return;
            case 4:
                ky0 ky0Var = (ky0) obj2;
                ky0Var.f30052b = 0.0f;
                ky0Var.invalidate();
                ((qn0) obj).invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.l3 l3Var = (org.telegram.ui.Components.voip.l3) obj2;
                l3Var.d.setText((String) obj);
                l3Var.d.setTranslationY(0.0f);
                l3Var.d.setAlpha(1.0f);
                return;
            case 6:
                ((org.telegram.ui.Components.voip.l3) obj2).removeView((org.telegram.ui.Components.voip.k3) obj);
                return;
            case 7:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.ey) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.x70 x70Var = (org.telegram.ui.x70) obj2;
                x70Var.removeView((x30) obj);
                x70Var.d = null;
                x70Var.f45618a = null;
                x70Var.f45619b = false;
                return;
            case 9:
                bx0 bx0Var = (bx0) obj2;
                bx0Var.setVisibility(8);
                bx0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                pf0 pf0Var = photoViewer.C1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = pf0Var.e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                pf0Var.f31599f = z10;
                imageReceiver.setImageBitmap(bitmap);
                imageReceiver.setOrientation(0, false);
                AnimatorSet animatorSet = pf0Var.f31602s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = pf0Var.v;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                pf0Var.h = true;
                pf0Var.f31600n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                pf0Var.f31602s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pf0Var, pf0Var.E, 0.0f, 1.0f));
                pf0Var.f31602s.setDuration(250L);
                pf0Var.f31602s.setInterpolator(new OvershootInterpolator(1.01f));
                pf0Var.f31602s.addListener(new nf0(pf0Var, 0));
                pf0Var.f31602s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.A2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.f35860z2, photoViewer.f35665d4, 0.0f));
                photoViewer.A2.setDuration(85L);
                photoViewer.A2.setInterpolator(ds.f27531g);
                photoViewer.A2.addListener(new org.telegram.ui.k50(this, 10));
                photoViewer.A2.start();
                return;
            case 11:
                org.telegram.ui.xw0 xw0Var = (org.telegram.ui.xw0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = xw0Var.f45792n;
                ((View) obj).setVisibility(8);
                for (int i14 = 0; i14 < premiumPreviewFragment.U.getChildCount(); i14++) {
                    View childAt2 = premiumPreviewFragment.U.getChildAt(i14);
                    if (childAt2 != xw0Var.e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 12:
                org.telegram.ui.g31 g31Var = (org.telegram.ui.g31) obj2;
                if (g31Var.h != null) {
                    g31Var.h = null;
                    g31Var.f39489n.unlock();
                    ((org.telegram.ui.cx) obj).onTransitionAnimationEnd(true, false);
                    g31Var.e = 1.0f;
                    g31Var.g();
                    g31Var.d(false);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.su0 su0Var = (org.telegram.ui.su0) obj;
                if (su0Var != null) {
                    su0Var.f43406a.setVisible(true, true);
                }
                ((SecretMediaViewer) obj2).f36215s = false;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.oy0(this, 14));
                return;
            case 14:
                ((org.telegram.ui.v51) obj).run();
                org.telegram.ui.f61 f61Var = (org.telegram.ui.f61) obj2;
                org.telegram.ui.u41 u41Var = f61Var.X0;
                if (u41Var != null) {
                    u41Var.dismiss();
                    f61Var.X0 = null;
                    return;
                }
                return;
            case 15:
                tg1 tg1Var = (tg1) obj2;
                tg1Var.removeView((x30) obj);
                tg1Var.e = null;
                tg1Var.f43639a = null;
                tg1Var.f43640b = false;
                UsersSelectActivity usersSelectActivity = tg1Var.f43642f;
                usersSelectActivity.f36348c.setAllowDrawCursor(true);
                if (usersSelectActivity.O.isEmpty()) {
                    usersSelectActivity.f36348c.setHintVisible(true, true);
                    return;
                }
                return;
            case 16:
                ((Runnable) obj).run();
                rh1 rh1Var = (rh1) obj2;
                rh1Var.f43011e0.setScaleX(1.15f);
                rh1Var.f43011e0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rh1Var.f43011e0.getLayoutParams();
                marginLayoutParams.leftMargin = AndroidUtilities.dp(10.0f);
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
                rh1Var.f43011e0.setVisibility(8);
                return;
            case 17:
                ((r0.m0) obj).c();
                return;
            case 18:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f47177a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 19:
                sg.b2 b2Var = (sg.b2) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b2Var.f48194r0.b(b2Var.f48201y0, false);
                }
                b2Var.setRotationY(0.0f);
                b2Var.f48202z0 = 1.0f;
                return;
            case 20:
                ((tg.y0) obj2).f49168w = false;
                ((tg.n0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            case 21:
                tg.m1 m1Var = (tg.m1) obj2;
                m1Var.H0 = false;
                m1Var.G0 = 1.0f;
                m1Var.f48985s0.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new tg.i1(0, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
            default:
                fi.j9 j9Var = (fi.j9) obj2;
                j9Var.removeView((x30) obj);
                j9Var.h.clear();
                j9Var.f11065b = null;
                j9Var.f11066c = false;
                ((zg.i) j9Var.f11068n).f52935b.setAllowDrawCursor(true);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f30557a) {
            case 9:
                ((bx0) this.f30558b).setVisibility(0);
                return;
            case 17:
                ((r0.m0) this.f30558b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ml0(Object obj, View view, int i10) {
        this.f30557a = i10;
        this.f30558b = obj;
        this.f30559c = view;
    }

    public ml0(rl0 rl0Var, c10 c10Var, s4.p0 p0Var) {
        this.f30557a = 1;
        this.f30559c = rl0Var;
        this.f30558b = c10Var;
    }
}

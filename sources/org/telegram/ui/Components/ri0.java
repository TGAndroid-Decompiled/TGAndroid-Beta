package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.db1;
import org.telegram.ui.zb1;
public final class ri0 extends AnimatorListenerAdapter {
    public final int f37736a;
    public final Object f37737b;
    public final Object f37738c;

    public ri0(int i3, Object obj, Object obj2) {
        this.f37736a = i3;
        this.f37738c = obj;
        this.f37737b = obj2;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f37736a) {
            case 18:
                ((r0.m0) this.f37737b).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        boolean z10;
        int i3 = this.f37736a;
        Object obj = this.f37737b;
        Object obj2 = this.f37738c;
        switch (i3) {
            case 0:
                si0 si0Var = (si0) obj2;
                vi0 vi0Var = si0Var.f38041e;
                if (((ValueAnimator) vi0Var.f39130g) != null) {
                    ((tj0) vi0Var.f39128e).W1 = false;
                    ArrayList arrayList = si0Var.f38039b;
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
                        ((u4.b0) vi0Var.f39129f).getClass();
                        u4.o0.x0(view);
                        ((tj0) vi0Var.f39128e).removeView(view);
                        b8.of ofVar = (b8.of) vi0Var.f39131i;
                        if (ofVar != null) {
                            ofVar.d(view);
                        }
                    }
                    ((tj0) vi0Var.f39128e).setScrollEnabled(true);
                    ((tj0) vi0Var.f39128e).setVerticalScrollBarEnabled(true);
                    boolean z11 = org.telegram.messenger.r2.f25040a;
                    int childCount = ((tj0) vi0Var.f39128e).getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = ((tj0) vi0Var.f39128e).getChildAt(i11);
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
                    ti0 ti0Var = si0Var.d;
                    if (ti0Var != null) {
                        ti0Var.E();
                    }
                    b8.of ofVar2 = (b8.of) vi0Var.f39131i;
                    if (ofVar2 != null) {
                        ofVar2.a();
                    }
                    ((SparseArray) vi0Var.f39132j).clear();
                    vi0Var.f39130g = null;
                    return;
                }
                return;
            case 1:
                iz izVar = (iz) obj;
                izVar.setAlpha(1.0f);
                u4.o0.x0(izVar);
                wi0 wi0Var = (wi0) obj2;
                wi0Var.f40015c.remove(izVar);
                wi0Var.f40013a.removeView(izVar);
                return;
            case 2:
                super.onAnimationEnd(animator);
                org.telegram.ui.tp tpVar = (org.telegram.ui.tp) obj2;
                ((wi0) tpVar.d).f40018g.remove((AnimatorSet) obj);
                if (((wi0) tpVar.d).f40018g.isEmpty()) {
                    ((wi0) tpVar.d).f40014b.clear();
                    wi0 wi0Var2 = (wi0) tpVar.d;
                    wi0Var2.d = true;
                    wi0Var2.f40013a.invalidate();
                    return;
                }
                return;
            case 3:
                en0 en0Var = (en0) obj2;
                try {
                    ((WindowManager) obj).removeViewImmediate(en0Var.B);
                } catch (Exception unused) {
                }
                j50 j50Var = en0Var.C;
                if (j50Var != null) {
                    org.telegram.messenger.g0.r(j50Var);
                    return;
                }
                return;
            case 4:
                ev0 ev0Var = (ev0) obj2;
                ev0Var.f33469b = 0.0f;
                ev0Var.invalidate();
                ((vk0) obj).invalidate();
                return;
            case 5:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) obj2;
                q2Var.d.setText((String) obj);
                q2Var.d.setTranslationY(0.0f);
                q2Var.d.setAlpha(1.0f);
                return;
            case 6:
                ((org.telegram.ui.Components.voip.q2) obj2).removeView((org.telegram.ui.Components.voip.p2) obj);
                return;
            case 7:
                View view3 = (View) obj;
                if (view3.getParent() != null) {
                    ((ViewGroup) view3.getParent()).removeView(view3);
                }
                ((org.telegram.ui.uw) obj2).R3 = null;
                return;
            case 8:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj2;
                s50Var.removeView((y10) obj);
                s50Var.d = null;
                s50Var.f49364a = null;
                s50Var.f49365b = false;
                return;
            case 9:
                vt0 vt0Var = (vt0) obj2;
                vt0Var.setVisibility(8);
                vt0Var.setX(0.0f);
                return;
            case 10:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                ad0 ad0Var = photoViewer.D1;
                Bitmap bitmap = (Bitmap) obj;
                ImageReceiver imageReceiver = ad0Var.f31810e;
                if (bitmap != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ad0Var.f31811f = z10;
                imageReceiver.v0(bitmap);
                imageReceiver.G0(0, 0, false);
                AnimatorSet animatorSet = ad0Var.f31814s;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = ad0Var.f31815w;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ad0Var.h = true;
                ad0Var.f31812n = 1.0f;
                AnimatorSet animatorSet3 = new AnimatorSet();
                ad0Var.f31814s = animatorSet3;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ad0Var, ad0Var.F, 0.0f, 1.0f));
                ad0Var.f31814s.setDuration(250L);
                ad0Var.f31814s.setInterpolator(new OvershootInterpolator(1.01f));
                ad0Var.f31814s.addListener(new yc0(ad0Var, 0));
                ad0Var.f31814s.start();
                AnimatorSet animatorSet4 = new AnimatorSet();
                photoViewer.B2 = animatorSet4;
                animatorSet4.playTogether(ObjectAnimator.ofFloat(photoViewer.A2, photoViewer.f41414e4, 0.0f));
                photoViewer.B2.setDuration(85L);
                photoViewer.B2.setInterpolator(xq.f40453g);
                photoViewer.B2.addListener(new org.telegram.ui.y20(this, 10));
                photoViewer.B2.start();
                return;
            case 11:
                org.telegram.ui.ks0 ks0Var = (org.telegram.ui.ks0) obj2;
                PremiumPreviewFragment premiumPreviewFragment = ks0Var.f47012n;
                ((View) obj).setVisibility(8);
                for (int i13 = 0; i13 < premiumPreviewFragment.V.getChildCount(); i13++) {
                    View childAt2 = premiumPreviewFragment.V.getChildAt(i13);
                    if (childAt2 != ks0Var.f47010e) {
                        childAt2.setTranslationY(0.0f);
                    }
                }
                return;
            case 12:
                org.telegram.ui.my0 my0Var = (org.telegram.ui.my0) obj2;
                if (my0Var.h != null) {
                    my0Var.h = null;
                    my0Var.f47830n.e();
                    ((org.telegram.ui.wv) obj).onTransitionAnimationEnd(true, false);
                    my0Var.f47828e = 1.0f;
                    my0Var.g();
                    my0Var.d(false);
                    return;
                }
                return;
            case 13:
                org.telegram.ui.mq0 mq0Var = (org.telegram.ui.mq0) obj;
                if (mq0Var != null) {
                    mq0Var.f47751a.O0(true, true);
                }
                ((SecretMediaViewer) obj2).f41965s = false;
                org.telegram.messenger.g0.h3(new org.telegram.ui.pu0(this, 12));
                return;
            case 14:
                ((org.telegram.ui.w01) obj).run();
                org.telegram.ui.g11 g11Var = (org.telegram.ui.g11) obj2;
                org.telegram.ui.wz0 wz0Var = g11Var.Y0;
                if (wz0Var != null) {
                    wz0Var.dismiss();
                    g11Var.Y0 = null;
                    return;
                }
                return;
            case 15:
                db1 db1Var = (db1) obj2;
                db1Var.removeView((y10) obj);
                db1Var.f44619e = null;
                db1Var.f44616a = null;
                db1Var.f44617b = false;
                UsersSelectActivity usersSelectActivity = db1Var.f44620f;
                usersSelectActivity.f42107c.setAllowDrawCursor(true);
                if (usersSelectActivity.Q.isEmpty()) {
                    usersSelectActivity.f42107c.t(true, true);
                    return;
                }
                return;
            case 16:
                ((Runnable) obj).run();
                zb1 zb1Var = (zb1) obj2;
                zb1Var.f52619f0.setScaleX(1.15f);
                zb1Var.f52619f0.setScaleY(1.15f);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zb1Var.f52619f0.getLayoutParams();
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(10.0f);
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(10.0f);
                zb1Var.f52619f0.setVisibility(8);
                return;
            case 17:
                CropAreaView cropAreaView = (CropAreaView) obj2;
                cropAreaView.setActualRect((RectF) obj);
                cropAreaView.f31385l0 = null;
                return;
            case 18:
                ((r0.m0) obj).c();
                return;
            case 19:
                r0.v0 v0Var = (r0.v0) obj;
                v0Var.f54055a.d(1.0f);
                r0.q0.e((View) obj2, v0Var);
                return;
            case 20:
                ug.q1 q1Var = (ug.q1) obj2;
                boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q1Var.f56222s0.b(q1Var.f56229z0, false);
                }
                q1Var.setRotationY(0.0f);
                q1Var.A0 = 1.0f;
                return;
            case 21:
                ((vg.v0) obj2).f56882t1 = false;
                ((vg.m0) obj).setOffset(0.0f);
                super.onAnimationEnd(animator);
                return;
            default:
                vg.h1 h1Var = (vg.h1) obj2;
                h1Var.A2 = false;
                h1Var.f56648z2 = 1.0f;
                h1Var.f56634l2.invalidate();
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    ValueAnimator ofInt = ValueAnimator.ofInt(0, 255);
                    ofInt.addUpdateListener(new vg.e1(0, this, drawable));
                    ofInt.start();
                }
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f37736a) {
            case 9:
                ((vt0) this.f37737b).setVisibility(0);
                return;
            case 18:
                ((r0.m0) this.f37737b).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public ri0(Object obj, View view, int i3) {
        this.f37736a = i3;
        this.f37737b = obj;
        this.f37738c = view;
    }

    public ri0(wi0 wi0Var, iz izVar, u4.o0 o0Var) {
        this.f37736a = 1;
        this.f37738c = wi0Var;
        this.f37737b = izVar;
    }
}

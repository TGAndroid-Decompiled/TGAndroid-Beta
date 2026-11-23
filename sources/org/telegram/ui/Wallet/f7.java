package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ti;
import org.telegram.ui.bn;
public final class f7 {
    public final ViewGroup f44287a;
    public final View f44288b;
    public final ti f44289c;
    public final n7 d;
    public final bn f44290e;
    public final TL_wallet.walletTransaction f44291f;
    public final Runnable f44292g;
    public final c7 h;
    public final n7 f44293i;
    public final ga f44294j = new ga();
    public final PathInterpolator f44295k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f44296l;
    public final AnimatorSet f44297m;
    public final RectF f44298n;
    public final RectF f44299o;
    public org.telegram.ui.Cells.v0 f44300p;
    public final d7 f44301q;
    public float f44302r;
    public boolean f44303s;
    public boolean f44304t;
    public boolean f44305u;
    public boolean v;
    public final long f44306w;
    public final b7 f44307x;

    public f7(ViewGroup viewGroup, View view, n7 n7Var, bn bnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f44297m = animatorSet;
        this.f44299o = new RectF();
        this.f44306w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final f7 f44104b;

            {
                this.f44104b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        f7 f7Var = this.f44104b;
                        n7 n7Var2 = f7Var.d;
                        float f10 = f7Var.f44296l;
                        ViewGroup viewGroup2 = f7Var.f44287a;
                        d7 d7Var = f7Var.f44301q;
                        AnimatorSet animatorSet2 = f7Var.f44297m;
                        n7 n7Var3 = f7Var.f44293i;
                        RectF rectF = f7Var.f44299o;
                        RectF rectF2 = f7Var.f44298n;
                        if (!f7Var.v && !f7Var.f44305u) {
                            f7Var.e();
                            f7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = f7Var.f44290e.K8(f7Var.f44291f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = f7Var.f44300p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    f7Var.f44300p = K8;
                                }
                                m4 m4Var = f7Var.f44300p.J0.f44717m;
                                if (f7Var.f44304t && d7Var.f59674n && m4Var != null && m4Var.f59674n && m4Var.getWidth() > 0 && !f7Var.f44300p.isLayoutRequested()) {
                                    rectF.set(f7Var.c(m4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        f7Var.f44305u = true;
                                        f7Var.f44300p.J0.i(true);
                                        n7Var3.f(n7Var2);
                                        n7Var3.setAlpha(f10);
                                        n7Var2.setAlpha(0.0f);
                                        f7Var.f44294j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - f7Var.f44306w <= 700 && !f7Var.f44303s && viewGroup2.isAttachedToWindow()) {
                                f7Var.h.postOnAnimation(f7Var.f44307x);
                                return;
                            }
                            f7Var.f44305u = true;
                            n7Var3.setAlpha(0.0f);
                            d7Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f44104b.d();
                        return;
                    default:
                        this.f44104b.f44304t = true;
                        return;
                }
            }
        };
        this.f44307x = r12;
        this.f44289c = tiVar;
        this.f44287a = viewGroup;
        this.f44288b = view;
        this.d = n7Var;
        this.f44296l = n7Var.getAlpha();
        this.f44290e = bnVar;
        this.f44291f = wallettransaction;
        this.f44292g = runnable;
        RectF a10 = sa.a(n7Var, viewGroup);
        this.f44298n = a10;
        e();
        c7 c7Var = new c7(this, viewGroup.getContext());
        this.h = c7Var;
        c7Var.setClipChildren(false);
        c7Var.setClipToPadding(false);
        c7Var.setClickable(true);
        n7 n7Var2 = new n7(60, viewGroup.getContext(), true);
        this.f44293i = n7Var2;
        n7Var2.setContinuousRotation(540.0f);
        n7Var2.f(n7Var);
        n7Var2.setAlpha(0.0f);
        c7Var.addView(n7Var2, c8.na.e(60, 60, 51));
        d7 d7Var = new d7(this, viewGroup.getContext(), new Runnable(this) {
            public final f7 f44104b;

            {
                this.f44104b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        f7 f7Var = this.f44104b;
                        n7 n7Var22 = f7Var.d;
                        float f10 = f7Var.f44296l;
                        ViewGroup viewGroup2 = f7Var.f44287a;
                        d7 d7Var2 = f7Var.f44301q;
                        AnimatorSet animatorSet2 = f7Var.f44297m;
                        n7 n7Var3 = f7Var.f44293i;
                        RectF rectF = f7Var.f44299o;
                        RectF rectF2 = f7Var.f44298n;
                        if (!f7Var.v && !f7Var.f44305u) {
                            f7Var.e();
                            f7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = f7Var.f44290e.K8(f7Var.f44291f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = f7Var.f44300p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    f7Var.f44300p = K8;
                                }
                                m4 m4Var = f7Var.f44300p.J0.f44717m;
                                if (f7Var.f44304t && d7Var2.f59674n && m4Var != null && m4Var.f59674n && m4Var.getWidth() > 0 && !f7Var.f44300p.isLayoutRequested()) {
                                    rectF.set(f7Var.c(m4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        f7Var.f44305u = true;
                                        f7Var.f44300p.J0.i(true);
                                        n7Var3.f(n7Var22);
                                        n7Var3.setAlpha(f10);
                                        n7Var22.setAlpha(0.0f);
                                        f7Var.f44294j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - f7Var.f44306w <= 700 && !f7Var.f44303s && viewGroup2.isAttachedToWindow()) {
                                f7Var.h.postOnAnimation(f7Var.f44307x);
                                return;
                            }
                            f7Var.f44305u = true;
                            n7Var3.setAlpha(0.0f);
                            d7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f44104b.d();
                        return;
                    default:
                        this.f44104b.f44304t = true;
                        return;
                }
            }
        });
        this.f44301q = d7Var;
        d7Var.setAlpha(0.001f);
        d7Var.setPaused(false);
        c7Var.addView(d7Var, c8.na.e(60, 60, 51));
        viewGroup.addView(c7Var, new ViewGroup.LayoutParams(-1, -1));
        b(a10.centerX(), a10.centerY(), a10.width());
        n7Var2.l(new Runnable(this) {
            public final f7 f44104b;

            {
                this.f44104b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        f7 f7Var = this.f44104b;
                        n7 n7Var22 = f7Var.d;
                        float f10 = f7Var.f44296l;
                        ViewGroup viewGroup2 = f7Var.f44287a;
                        d7 d7Var2 = f7Var.f44301q;
                        AnimatorSet animatorSet2 = f7Var.f44297m;
                        n7 n7Var3 = f7Var.f44293i;
                        RectF rectF = f7Var.f44299o;
                        RectF rectF2 = f7Var.f44298n;
                        if (!f7Var.v && !f7Var.f44305u) {
                            f7Var.e();
                            f7Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 K8 = f7Var.f44290e.K8(f7Var.f44291f);
                            if (K8 != null && K8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = f7Var.f44300p;
                                if (v0Var != K8) {
                                    if (v0Var != null) {
                                        v0Var.J0.i(false);
                                    }
                                    f7Var.f44300p = K8;
                                }
                                m4 m4Var = f7Var.f44300p.J0.f44717m;
                                if (f7Var.f44304t && d7Var2.f59674n && m4Var != null && m4Var.f59674n && m4Var.getWidth() > 0 && !f7Var.f44300p.isLayoutRequested()) {
                                    rectF.set(f7Var.c(m4Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f10 > 0.01f) {
                                        f7Var.f44305u = true;
                                        f7Var.f44300p.J0.i(true);
                                        n7Var3.f(n7Var22);
                                        n7Var3.setAlpha(f10);
                                        n7Var22.setAlpha(0.0f);
                                        f7Var.f44294j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - f7Var.f44306w <= 700 && !f7Var.f44303s && viewGroup2.isAttachedToWindow()) {
                                f7Var.h.postOnAnimation(f7Var.f44307x);
                                return;
                            }
                            f7Var.f44305u = true;
                            n7Var3.setAlpha(0.0f);
                            d7Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f44104b.d();
                        return;
                    default:
                        this.f44104b.f44304t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a4(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new e7(this, tiVar, n7Var));
        c7Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        b7 b7Var = this.f44307x;
        c7 c7Var = this.h;
        c7Var.removeCallbacks(b7Var);
        n7 n7Var = this.f44293i;
        n7Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f44300p;
        if (v0Var != null) {
            v0Var.J0.i(false);
            if (z10 && this.f44302r >= 1.0f) {
                RectF rectF = this.f44299o;
                if (!rectF.isEmpty() && this.f44300p.isAttachedToWindow() && v0.Q(this.f44300p.getMessageObject(), this.f44291f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f44298n.centerY(), rectF.centerY()) - org.telegram.messenger.g0.L(150.0f))) * 2.0f) / 0.6f) / org.telegram.messenger.g0.f24225p;
                    n4 n4Var = this.f44300p.J0;
                    n4Var.l();
                    r1.g gVar = new r1.g(new r1.f(0.0f));
                    n4Var.f44698b0 = gVar;
                    r1.h hVar = new r1.h(0.0f);
                    hVar.a(0.65f);
                    hVar.b(200.0f);
                    gVar.f56446m = hVar;
                    n4Var.f44698b0.f(0.001f);
                    n4Var.f44698b0.f56436a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    n4Var.f44698b0.b(new h4(n4Var, 1));
                    n4Var.f44698b0.h();
                }
            }
        }
        d7 d7Var = this.f44301q;
        d7Var.setPaused(true);
        c7Var.removeView(d7Var);
        n7Var.setPaused(true);
        c7Var.removeView(n7Var);
        c7Var.setClickable(false);
        this.d.setAlpha(this.f44296l);
        ti tiVar = this.f44289c;
        if (tiVar == null) {
            this.f44288b.setTranslationY(0.0f);
        } else {
            tiVar.y1(1.0f);
        }
        ViewGroup viewGroup = this.f44287a;
        if (tiVar != null && z10 && this.f44294j.d()) {
            bn bnVar = this.f44290e;
            if (bnVar.getParentLayout() != null) {
                ViewGroup view = bnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(c7Var);
                    c7Var.setTranslationX(iArr[0] - iArr2[0]);
                    c7Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(c7Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f44292g.run();
        org.telegram.messenger.g0.h3(new r(11, this, viewGroup), 650L);
    }

    public final void b(float f10, float f11, float f12) {
        float L = org.telegram.messenger.g0.L(60.0f);
        c7 c7Var = this.h;
        float f13 = L / 2.0f;
        n7 n7Var = this.f44293i;
        n7Var.setTranslationX((f10 - c7Var.getLeft()) - f13);
        n7Var.setTranslationY((f11 - c7Var.getTop()) - f13);
        float f14 = f12 / L;
        n7Var.setScaleX(f14);
        n7Var.setScaleY(f14);
        float translationX = n7Var.getTranslationX();
        d7 d7Var = this.f44301q;
        d7Var.setTranslationX(translationX);
        d7Var.setTranslationY(n7Var.getTranslationY());
        d7Var.setScaleX(f14);
        d7Var.setScaleY(f14);
    }

    public final RectF c(m4 m4Var) {
        ti tiVar = this.f44289c;
        ViewGroup viewGroup = this.f44287a;
        if (tiVar == null) {
            return sa.a(m4Var, viewGroup);
        }
        ViewGroup viewGroup2 = (ViewGroup) m4Var.getRootView();
        RectF a10 = sa.a(m4Var, viewGroup2);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a10.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a10.offset(-iArr[0], -iArr[1]);
        return a10;
    }

    public final void d() {
        d7 d7Var = this.f44301q;
        if (d7Var == null) {
            return;
        }
        n7 n7Var = this.f44293i;
        float flightYaw = n7Var.getFlightYaw();
        float flightPitch = n7Var.getFlightPitch();
        if (this.f44300p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f44302r - 0.55f) / 0.45f));
            float C = com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f44300p.J0.g() - flightYaw, 6.283185307179586d)) * C;
            flightPitch += ((this.f44300p.J0.f44713k.F * 0.14f) - flightPitch) * C;
        }
        d7Var.f59675r = flightYaw;
        d7Var.f59676s = flightPitch;
        d7Var.f59677w = true;
        d7Var.f59678x = true;
    }

    public final void e() {
        n7 n7Var = this.d;
        if (n7Var.isAttachedToWindow()) {
            View rootView = n7Var.getRootView();
            ViewGroup viewGroup = this.f44287a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f44289c;
                RectF rectF = this.f44298n;
                if (tiVar == null) {
                    sa.f(n7Var, this.f44288b, viewGroup, rectF);
                    return;
                }
                rectF.set(sa.a(n7Var, viewGroup));
                rectF.offset(0.0f, tiVar.f39983j4 - tiVar.f40017t2);
            }
        }
    }
}

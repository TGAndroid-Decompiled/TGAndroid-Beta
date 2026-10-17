package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ti;
import org.telegram.ui.sn;
public final class h6 {
    public final ViewGroup f34267a;
    public final View f34268b;
    public final ti f34269c;
    public final p6 d;
    public final sn e;
    public final TL_wallet.walletTransaction f34270f;
    public final Runnable f34271g;
    public final e6 h;
    public final p6 f34272i;
    public final n9 f34273j = new n9();
    public final PathInterpolator f34274k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f34275l;
    public final AnimatorSet f34276m;
    public final RectF f34277n;
    public final RectF f34278o;
    public org.telegram.ui.Cells.x0 f34279p;
    public final f6 f34280q;
    public float f34281r;
    public boolean f34282s;
    public boolean f34283t;
    public boolean f34284u;
    public boolean v;
    public final long f34285w;
    public final d6 f34286x;

    public h6(ViewGroup viewGroup, View view, p6 p6Var, sn snVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f34276m = animatorSet;
        this.f34278o = new RectF();
        this.f34285w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final h6 f34134b;

            {
                this.f34134b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h6 h6Var = this.f34134b;
                        p6 p6Var2 = h6Var.d;
                        float f7 = h6Var.f34275l;
                        ViewGroup viewGroup2 = h6Var.f34267a;
                        f6 f6Var = h6Var.f34280q;
                        AnimatorSet animatorSet2 = h6Var.f34276m;
                        p6 p6Var3 = h6Var.f34272i;
                        RectF rectF = h6Var.f34278o;
                        RectF rectF2 = h6Var.f34277n;
                        if (!h6Var.v && !h6Var.f34284u) {
                            h6Var.e();
                            h6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f34270f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = h6Var.f34279p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.k(false);
                                    }
                                    h6Var.f34279p = u82;
                                }
                                j3 j3Var = h6Var.f34279p.I0.f34406m;
                                if (h6Var.f34283t && f6Var.f47204n && j3Var != null && j3Var.f47204n && j3Var.getWidth() > 0 && !h6Var.f34279p.isLayoutRequested()) {
                                    rectF.set(h6Var.c(j3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        h6Var.f34284u = true;
                                        h6Var.f34279p.I0.k(true);
                                        p6Var3.f(p6Var2);
                                        p6Var3.setAlpha(f7);
                                        p6Var2.setAlpha(0.0f);
                                        h6Var.f34273j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - h6Var.f34285w <= 700 && !h6Var.f34282s && viewGroup2.isAttachedToWindow()) {
                                h6Var.h.postOnAnimation(h6Var.f34286x);
                                return;
                            }
                            h6Var.f34284u = true;
                            p6Var3.setAlpha(0.0f);
                            f6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34134b.d();
                        return;
                    default:
                        this.f34134b.f34283t = true;
                        return;
                }
            }
        };
        this.f34286x = r12;
        this.f34269c = tiVar;
        this.f34267a = viewGroup;
        this.f34268b = view;
        this.d = p6Var;
        this.f34275l = p6Var.getAlpha();
        this.e = snVar;
        this.f34270f = wallettransaction;
        this.f34271g = runnable;
        RectF a2 = x9.a(viewGroup, p6Var);
        this.f34277n = a2;
        e();
        e6 e6Var = new e6(this, viewGroup.getContext());
        this.h = e6Var;
        e6Var.setClipChildren(false);
        e6Var.setClipToPadding(false);
        e6Var.setClickable(true);
        p6 p6Var2 = new p6(60, viewGroup.getContext(), true);
        this.f34272i = p6Var2;
        p6Var2.setContinuousRotation(540.0f);
        p6Var2.f(p6Var);
        p6Var2.setAlpha(0.0f);
        e6Var.addView(p6Var2, w7.z5.e(60, 60, 51));
        f6 f6Var = new f6(this, viewGroup.getContext(), new Runnable(this) {
            public final h6 f34134b;

            {
                this.f34134b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h6 h6Var = this.f34134b;
                        p6 p6Var22 = h6Var.d;
                        float f7 = h6Var.f34275l;
                        ViewGroup viewGroup2 = h6Var.f34267a;
                        f6 f6Var2 = h6Var.f34280q;
                        AnimatorSet animatorSet2 = h6Var.f34276m;
                        p6 p6Var3 = h6Var.f34272i;
                        RectF rectF = h6Var.f34278o;
                        RectF rectF2 = h6Var.f34277n;
                        if (!h6Var.v && !h6Var.f34284u) {
                            h6Var.e();
                            h6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f34270f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = h6Var.f34279p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.k(false);
                                    }
                                    h6Var.f34279p = u82;
                                }
                                j3 j3Var = h6Var.f34279p.I0.f34406m;
                                if (h6Var.f34283t && f6Var2.f47204n && j3Var != null && j3Var.f47204n && j3Var.getWidth() > 0 && !h6Var.f34279p.isLayoutRequested()) {
                                    rectF.set(h6Var.c(j3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        h6Var.f34284u = true;
                                        h6Var.f34279p.I0.k(true);
                                        p6Var3.f(p6Var22);
                                        p6Var3.setAlpha(f7);
                                        p6Var22.setAlpha(0.0f);
                                        h6Var.f34273j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - h6Var.f34285w <= 700 && !h6Var.f34282s && viewGroup2.isAttachedToWindow()) {
                                h6Var.h.postOnAnimation(h6Var.f34286x);
                                return;
                            }
                            h6Var.f34284u = true;
                            p6Var3.setAlpha(0.0f);
                            f6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34134b.d();
                        return;
                    default:
                        this.f34134b.f34283t = true;
                        return;
                }
            }
        });
        this.f34280q = f6Var;
        f6Var.setAlpha(0.001f);
        f6Var.setPaused(false);
        e6Var.addView(f6Var, w7.z5.e(60, 60, 51));
        viewGroup.addView(e6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        p6Var2.l(new Runnable(this) {
            public final h6 f34134b;

            {
                this.f34134b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h6 h6Var = this.f34134b;
                        p6 p6Var22 = h6Var.d;
                        float f7 = h6Var.f34275l;
                        ViewGroup viewGroup2 = h6Var.f34267a;
                        f6 f6Var2 = h6Var.f34280q;
                        AnimatorSet animatorSet2 = h6Var.f34276m;
                        p6 p6Var3 = h6Var.f34272i;
                        RectF rectF = h6Var.f34278o;
                        RectF rectF2 = h6Var.f34277n;
                        if (!h6Var.v && !h6Var.f34284u) {
                            h6Var.e();
                            h6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = h6Var.e.u8(h6Var.f34270f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = h6Var.f34279p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.k(false);
                                    }
                                    h6Var.f34279p = u82;
                                }
                                j3 j3Var = h6Var.f34279p.I0.f34406m;
                                if (h6Var.f34283t && f6Var2.f47204n && j3Var != null && j3Var.f47204n && j3Var.getWidth() > 0 && !h6Var.f34279p.isLayoutRequested()) {
                                    rectF.set(h6Var.c(j3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        h6Var.f34284u = true;
                                        h6Var.f34279p.I0.k(true);
                                        p6Var3.f(p6Var22);
                                        p6Var3.setAlpha(f7);
                                        p6Var22.setAlpha(0.0f);
                                        h6Var.f34273j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - h6Var.f34285w <= 700 && !h6Var.f34282s && viewGroup2.isAttachedToWindow()) {
                                h6Var.h.postOnAnimation(h6Var.f34286x);
                                return;
                            }
                            h6Var.f34284u = true;
                            p6Var3.setAlpha(0.0f);
                            f6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f34134b.d();
                        return;
                    default:
                        this.f34134b.f34283t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new g6(this, tiVar, p6Var));
        e6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        d6 d6Var = this.f34286x;
        e6 e6Var = this.h;
        e6Var.removeCallbacks(d6Var);
        p6 p6Var = this.f34272i;
        p6Var.l(null);
        org.telegram.ui.Cells.x0 x0Var = this.f34279p;
        if (x0Var != null) {
            x0Var.I0.k(false);
            if (z10 && this.f34281r >= 1.0f) {
                RectF rectF = this.f34278o;
                if (!rectF.isEmpty() && this.f34279p.isAttachedToWindow() && m0.G(this.f34279p.getMessageObject(), this.f34270f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f34277n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    k3 k3Var = this.f34279p.I0;
                    k3Var.n();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    k3Var.f34388b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f17555u = lVar;
                    k3Var.f34388b0.e(0.001f);
                    k3Var.f34388b0.f17545a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    k3Var.f34388b0.b(new e3(k3Var, 1));
                    k3Var.f34388b0.h();
                }
            }
        }
        f6 f6Var = this.f34280q;
        f6Var.setPaused(true);
        e6Var.removeView(f6Var);
        p6Var.setPaused(true);
        e6Var.removeView(p6Var);
        e6Var.setClickable(false);
        this.d.setAlpha(this.f34275l);
        ti tiVar = this.f34269c;
        if (tiVar == null) {
            this.f34268b.setTranslationY(0.0f);
        } else {
            tiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f34267a;
        if (tiVar != null && z10 && this.f34273j.d()) {
            sn snVar = this.e;
            if (snVar.getParentLayout() != null) {
                ViewGroup view = snVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(e6Var);
                    e6Var.setTranslationX(iArr[0] - iArr2[0]);
                    e6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(e6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f34271g.run();
        AndroidUtilities.runOnUIThread(new t3(9, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        e6 e6Var = this.h;
        float f12 = dp / 2.0f;
        p6 p6Var = this.f34272i;
        p6Var.setTranslationX((f7 - e6Var.getLeft()) - f12);
        p6Var.setTranslationY((f10 - e6Var.getTop()) - f12);
        float f13 = f11 / dp;
        p6Var.setScaleX(f13);
        p6Var.setScaleY(f13);
        float translationX = p6Var.getTranslationX();
        f6 f6Var = this.f34280q;
        f6Var.setTranslationX(translationX);
        f6Var.setTranslationY(p6Var.getTranslationY());
        f6Var.setScaleX(f13);
        f6Var.setScaleY(f13);
    }

    public final RectF c(j3 j3Var) {
        ti tiVar = this.f34269c;
        ViewGroup viewGroup = this.f34267a;
        if (tiVar == null) {
            return x9.a(viewGroup, j3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) j3Var.getRootView();
        RectF a2 = x9.a(viewGroup2, j3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        f6 f6Var = this.f34280q;
        if (f6Var == null) {
            return;
        }
        p6 p6Var = this.f34272i;
        float flightYaw = p6Var.getFlightYaw();
        float flightPitch = p6Var.getFlightPitch();
        if (this.f34279p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f34281r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.cast.a6.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f34279p.I0.i() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f34279p.I0.f34402k.E * 0.14f) - flightPitch) * B;
        }
        f6Var.f47205r = flightYaw;
        f6Var.f47206s = flightPitch;
        f6Var.v = true;
        f6Var.f47207w = true;
    }

    public final void e() {
        p6 p6Var = this.d;
        if (p6Var.isAttachedToWindow()) {
            View rootView = p6Var.getRootView();
            ViewGroup viewGroup = this.f34267a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f34269c;
                RectF rectF = this.f34277n;
                if (tiVar == null) {
                    x9.f(p6Var, this.f34268b, viewGroup, rectF);
                    return;
                }
                rectF.set(x9.a(viewGroup, p6Var));
                rectF.offset(0.0f, tiVar.f30602o2 - tiVar.f30635y0);
            }
        }
    }
}

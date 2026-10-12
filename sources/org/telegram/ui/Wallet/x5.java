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
import org.telegram.ui.Components.aj;
import org.telegram.ui.eo;
public final class x5 {
    public final ViewGroup f35508a;
    public final View f35509b;
    public final aj f35510c;
    public final e6 d;
    public final eo f35511e;
    public final TL_wallet.walletTransaction f35512f;
    public final Runnable f35513g;
    public final u5 h;
    public final e6 f35514i;
    public final n8 f35515j = new n8();
    public final PathInterpolator f35516k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35517l;
    public final AnimatorSet f35518m;
    public final RectF f35519n;
    public final RectF f35520o;
    public org.telegram.ui.Cells.w0 f35521p;
    public final v5 f35522q;
    public float f35523r;
    public boolean f35524s;
    public boolean f35525t;
    public boolean f35526u;
    public boolean v;
    public final long f35527w;
    public final t5 f35528x;

    public x5(ViewGroup viewGroup, View view, e6 e6Var, eo eoVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, aj ajVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35518m = animatorSet;
        this.f35520o = new RectF();
        this.f35527w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final x5 f35389b;

            {
                this.f35389b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f35389b;
                        e6 e6Var2 = x5Var.d;
                        float f7 = x5Var.f35517l;
                        ViewGroup viewGroup2 = x5Var.f35508a;
                        v5 v5Var = x5Var.f35522q;
                        AnimatorSet animatorSet2 = x5Var.f35518m;
                        e6 e6Var3 = x5Var.f35514i;
                        RectF rectF = x5Var.f35520o;
                        RectF rectF2 = x5Var.f35519n;
                        if (!x5Var.v && !x5Var.f35526u) {
                            x5Var.e();
                            x5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = x5Var.f35511e.u8(x5Var.f35512f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = x5Var.f35521p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    x5Var.f35521p = u82;
                                }
                                e3 e3Var = x5Var.f35521p.I0.f34727m;
                                if (x5Var.f35525t && v5Var.h && e3Var != null && e3Var.h && e3Var.getWidth() > 0 && !x5Var.f35521p.isLayoutRequested()) {
                                    rectF.set(x5Var.c(e3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        x5Var.f35526u = true;
                                        x5Var.f35521p.I0.i(true);
                                        e6Var3.f(e6Var2);
                                        e6Var3.setAlpha(f7);
                                        e6Var2.setAlpha(0.0f);
                                        x5Var.f35515j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - x5Var.f35527w <= 700 && !x5Var.f35524s && viewGroup2.isAttachedToWindow()) {
                                x5Var.h.postOnAnimation(x5Var.f35528x);
                                return;
                            }
                            x5Var.f35526u = true;
                            e6Var3.setAlpha(0.0f);
                            v5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35389b.d();
                        return;
                    default:
                        this.f35389b.f35525t = true;
                        return;
                }
            }
        };
        this.f35528x = r12;
        this.f35510c = ajVar;
        this.f35508a = viewGroup;
        this.f35509b = view;
        this.d = e6Var;
        this.f35517l = e6Var.getAlpha();
        this.f35511e = eoVar;
        this.f35512f = wallettransaction;
        this.f35513g = runnable;
        RectF a2 = y8.a(viewGroup, e6Var);
        this.f35519n = a2;
        e();
        u5 u5Var = new u5(this, viewGroup.getContext());
        this.h = u5Var;
        u5Var.setClipChildren(false);
        u5Var.setClipToPadding(false);
        u5Var.setClickable(true);
        e6 e6Var2 = new e6(60, viewGroup.getContext(), true);
        this.f35514i = e6Var2;
        e6Var2.setContinuousRotation(540.0f);
        e6Var2.f(e6Var);
        e6Var2.setAlpha(0.0f);
        u5Var.addView(e6Var2, w7.w5.e(60, 60, 51));
        v5 v5Var = new v5(this, viewGroup.getContext(), new Runnable(this) {
            public final x5 f35389b;

            {
                this.f35389b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f35389b;
                        e6 e6Var22 = x5Var.d;
                        float f7 = x5Var.f35517l;
                        ViewGroup viewGroup2 = x5Var.f35508a;
                        v5 v5Var2 = x5Var.f35522q;
                        AnimatorSet animatorSet2 = x5Var.f35518m;
                        e6 e6Var3 = x5Var.f35514i;
                        RectF rectF = x5Var.f35520o;
                        RectF rectF2 = x5Var.f35519n;
                        if (!x5Var.v && !x5Var.f35526u) {
                            x5Var.e();
                            x5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = x5Var.f35511e.u8(x5Var.f35512f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = x5Var.f35521p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    x5Var.f35521p = u82;
                                }
                                e3 e3Var = x5Var.f35521p.I0.f34727m;
                                if (x5Var.f35525t && v5Var2.h && e3Var != null && e3Var.h && e3Var.getWidth() > 0 && !x5Var.f35521p.isLayoutRequested()) {
                                    rectF.set(x5Var.c(e3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        x5Var.f35526u = true;
                                        x5Var.f35521p.I0.i(true);
                                        e6Var3.f(e6Var22);
                                        e6Var3.setAlpha(f7);
                                        e6Var22.setAlpha(0.0f);
                                        x5Var.f35515j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - x5Var.f35527w <= 700 && !x5Var.f35524s && viewGroup2.isAttachedToWindow()) {
                                x5Var.h.postOnAnimation(x5Var.f35528x);
                                return;
                            }
                            x5Var.f35526u = true;
                            e6Var3.setAlpha(0.0f);
                            v5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35389b.d();
                        return;
                    default:
                        this.f35389b.f35525t = true;
                        return;
                }
            }
        });
        this.f35522q = v5Var;
        v5Var.setAlpha(0.001f);
        v5Var.setPaused(false);
        u5Var.addView(v5Var, w7.w5.e(60, 60, 51));
        viewGroup.addView(u5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        e6Var2.l(new Runnable(this) {
            public final x5 f35389b;

            {
                this.f35389b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f35389b;
                        e6 e6Var22 = x5Var.d;
                        float f7 = x5Var.f35517l;
                        ViewGroup viewGroup2 = x5Var.f35508a;
                        v5 v5Var2 = x5Var.f35522q;
                        AnimatorSet animatorSet2 = x5Var.f35518m;
                        e6 e6Var3 = x5Var.f35514i;
                        RectF rectF = x5Var.f35520o;
                        RectF rectF2 = x5Var.f35519n;
                        if (!x5Var.v && !x5Var.f35526u) {
                            x5Var.e();
                            x5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = x5Var.f35511e.u8(x5Var.f35512f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = x5Var.f35521p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    x5Var.f35521p = u82;
                                }
                                e3 e3Var = x5Var.f35521p.I0.f34727m;
                                if (x5Var.f35525t && v5Var2.h && e3Var != null && e3Var.h && e3Var.getWidth() > 0 && !x5Var.f35521p.isLayoutRequested()) {
                                    rectF.set(x5Var.c(e3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        x5Var.f35526u = true;
                                        x5Var.f35521p.I0.i(true);
                                        e6Var3.f(e6Var22);
                                        e6Var3.setAlpha(f7);
                                        e6Var22.setAlpha(0.0f);
                                        x5Var.f35515j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - x5Var.f35527w <= 700 && !x5Var.f35524s && viewGroup2.isAttachedToWindow()) {
                                x5Var.h.postOnAnimation(x5Var.f35528x);
                                return;
                            }
                            x5Var.f35526u = true;
                            e6Var3.setAlpha(0.0f);
                            v5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35389b.d();
                        return;
                    default:
                        this.f35389b.f35525t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new w5(this, ajVar, e6Var));
        u5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        t5 t5Var = this.f35528x;
        u5 u5Var = this.h;
        u5Var.removeCallbacks(t5Var);
        e6 e6Var = this.f35514i;
        e6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f35521p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f35523r >= 1.0f) {
                RectF rectF = this.f35520o;
                if (!rectF.isEmpty() && this.f35521p.isAttachedToWindow() && l0.F(this.f35521p.getMessageObject(), this.f35512f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f35519n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    f3 f3Var = this.f35521p.I0;
                    f3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    f3Var.f34708b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f16690u = lVar;
                    f3Var.f34708b0.e(0.001f);
                    f3Var.f34708b0.f16679a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    f3Var.f34708b0.b(new a3(f3Var, 1));
                    f3Var.f34708b0.h();
                }
            }
        }
        v5 v5Var = this.f35522q;
        v5Var.setPaused(true);
        u5Var.removeView(v5Var);
        e6Var.setPaused(true);
        u5Var.removeView(e6Var);
        u5Var.setClickable(false);
        this.d.setAlpha(this.f35517l);
        aj ajVar = this.f35510c;
        if (ajVar == null) {
            this.f35509b.setTranslationY(0.0f);
        } else {
            ajVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35508a;
        if (ajVar != null && z10 && this.f35515j.d()) {
            eo eoVar = this.f35511e;
            if (eoVar.getParentLayout() != null) {
                ViewGroup view = eoVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(u5Var);
                    u5Var.setTranslationX(iArr[0] - iArr2[0]);
                    u5Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(u5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35513g.run();
        AndroidUtilities.runOnUIThread(new s(10, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u5 u5Var = this.h;
        float f12 = dp / 2.0f;
        e6 e6Var = this.f35514i;
        e6Var.setTranslationX((f7 - u5Var.getLeft()) - f12);
        e6Var.setTranslationY((f10 - u5Var.getTop()) - f12);
        float f13 = f11 / dp;
        e6Var.setScaleX(f13);
        e6Var.setScaleY(f13);
        float translationX = e6Var.getTranslationX();
        v5 v5Var = this.f35522q;
        v5Var.setTranslationX(translationX);
        v5Var.setTranslationY(e6Var.getTranslationY());
        v5Var.setScaleX(f13);
        v5Var.setScaleY(f13);
    }

    public final RectF c(e3 e3Var) {
        aj ajVar = this.f35510c;
        ViewGroup viewGroup = this.f35508a;
        if (ajVar == null) {
            return y8.a(viewGroup, e3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) e3Var.getRootView();
        RectF a2 = y8.a(viewGroup2, e3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        v5 v5Var = this.f35522q;
        if (v5Var == null) {
            return;
        }
        e6 e6Var = this.f35514i;
        float flightYaw = e6Var.getFlightYaw();
        float flightPitch = e6Var.getFlightPitch();
        if (this.f35521p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f35523r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f35521p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f35521p.I0.f34723k.E * 0.14f) - flightPitch) * B;
        }
        v5Var.f48388n = flightYaw;
        v5Var.f48389r = flightPitch;
        v5Var.f48390s = true;
        v5Var.v = true;
    }

    public final void e() {
        e6 e6Var = this.d;
        if (e6Var.isAttachedToWindow()) {
            View rootView = e6Var.getRootView();
            ViewGroup viewGroup = this.f35508a;
            if (rootView == viewGroup.getRootView()) {
                aj ajVar = this.f35510c;
                RectF rectF = this.f35519n;
                if (ajVar == null) {
                    y8.f(e6Var, this.f35509b, viewGroup, rectF);
                    return;
                }
                rectF.set(y8.a(viewGroup, e6Var));
                rectF.offset(0.0f, ajVar.f24370o2 - ajVar.f24403y0);
            }
        }
    }
}

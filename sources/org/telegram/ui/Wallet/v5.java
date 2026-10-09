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
import org.telegram.ui.Components.yi;
import org.telegram.ui.ii1;
import org.telegram.ui.zn;
public final class v5 {
    public final ViewGroup f35574a;
    public final View f35575b;
    public final yi f35576c;
    public final c6 d;
    public final zn f35577e;
    public final TL_wallet.walletTransaction f35578f;
    public final Runnable f35579g;
    public final s5 h;
    public final c6 f35580i;
    public final l8 f35581j = new l8();
    public final PathInterpolator f35582k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35583l;
    public final AnimatorSet f35584m;
    public final RectF f35585n;
    public final RectF f35586o;
    public org.telegram.ui.Cells.w0 f35587p;
    public final t5 f35588q;
    public float f35589r;
    public boolean f35590s;
    public boolean f35591t;
    public boolean f35592u;
    public boolean v;
    public final long f35593w;
    public final r5 f35594x;

    public v5(ViewGroup viewGroup, View view, c6 c6Var, zn znVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35584m = animatorSet;
        this.f35586o = new RectF();
        this.f35593w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final v5 f35454b;

            {
                this.f35454b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f35454b;
                        c6 c6Var2 = v5Var.d;
                        float f7 = v5Var.f35583l;
                        ViewGroup viewGroup2 = v5Var.f35574a;
                        t5 t5Var = v5Var.f35588q;
                        AnimatorSet animatorSet2 = v5Var.f35584m;
                        c6 c6Var3 = v5Var.f35580i;
                        RectF rectF = v5Var.f35586o;
                        RectF rectF2 = v5Var.f35585n;
                        if (!v5Var.v && !v5Var.f35592u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.f35577e.u8(v5Var.f35578f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.f35587p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.f35587p = u82;
                                }
                                c3 c3Var = v5Var.f35587p.I0.f34795m;
                                if (v5Var.f35591t && t5Var.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !v5Var.f35587p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.f35592u = true;
                                        v5Var.f35587p.I0.i(true);
                                        c6Var3.f(c6Var2);
                                        c6Var3.setAlpha(f7);
                                        c6Var2.setAlpha(0.0f);
                                        v5Var.f35581j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.f35593w <= 700 && !v5Var.f35590s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.f35594x);
                                return;
                            }
                            v5Var.f35592u = true;
                            c6Var3.setAlpha(0.0f);
                            t5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35454b.d();
                        return;
                    default:
                        this.f35454b.f35591t = true;
                        return;
                }
            }
        };
        this.f35594x = r12;
        this.f35576c = yiVar;
        this.f35574a = viewGroup;
        this.f35575b = view;
        this.d = c6Var;
        this.f35583l = c6Var.getAlpha();
        this.f35577e = znVar;
        this.f35578f = wallettransaction;
        this.f35579g = runnable;
        RectF a2 = w8.a(viewGroup, c6Var);
        this.f35585n = a2;
        e();
        s5 s5Var = new s5(this, viewGroup.getContext());
        this.h = s5Var;
        s5Var.setClipChildren(false);
        s5Var.setClipToPadding(false);
        s5Var.setClickable(true);
        c6 c6Var2 = new c6(60, viewGroup.getContext(), true);
        this.f35580i = c6Var2;
        c6Var2.setContinuousRotation(540.0f);
        c6Var2.f(c6Var);
        c6Var2.setAlpha(0.0f);
        s5Var.addView(c6Var2, w7.x5.e(60, 60, 51));
        t5 t5Var = new t5(this, viewGroup.getContext(), new Runnable(this) {
            public final v5 f35454b;

            {
                this.f35454b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f35454b;
                        c6 c6Var22 = v5Var.d;
                        float f7 = v5Var.f35583l;
                        ViewGroup viewGroup2 = v5Var.f35574a;
                        t5 t5Var2 = v5Var.f35588q;
                        AnimatorSet animatorSet2 = v5Var.f35584m;
                        c6 c6Var3 = v5Var.f35580i;
                        RectF rectF = v5Var.f35586o;
                        RectF rectF2 = v5Var.f35585n;
                        if (!v5Var.v && !v5Var.f35592u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.f35577e.u8(v5Var.f35578f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.f35587p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.f35587p = u82;
                                }
                                c3 c3Var = v5Var.f35587p.I0.f34795m;
                                if (v5Var.f35591t && t5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !v5Var.f35587p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.f35592u = true;
                                        v5Var.f35587p.I0.i(true);
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(f7);
                                        c6Var22.setAlpha(0.0f);
                                        v5Var.f35581j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.f35593w <= 700 && !v5Var.f35590s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.f35594x);
                                return;
                            }
                            v5Var.f35592u = true;
                            c6Var3.setAlpha(0.0f);
                            t5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35454b.d();
                        return;
                    default:
                        this.f35454b.f35591t = true;
                        return;
                }
            }
        });
        this.f35588q = t5Var;
        t5Var.setAlpha(0.001f);
        t5Var.setPaused(false);
        s5Var.addView(t5Var, w7.x5.e(60, 60, 51));
        viewGroup.addView(s5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        c6Var2.l(new Runnable(this) {
            public final v5 f35454b;

            {
                this.f35454b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        v5 v5Var = this.f35454b;
                        c6 c6Var22 = v5Var.d;
                        float f7 = v5Var.f35583l;
                        ViewGroup viewGroup2 = v5Var.f35574a;
                        t5 t5Var2 = v5Var.f35588q;
                        AnimatorSet animatorSet2 = v5Var.f35584m;
                        c6 c6Var3 = v5Var.f35580i;
                        RectF rectF = v5Var.f35586o;
                        RectF rectF2 = v5Var.f35585n;
                        if (!v5Var.v && !v5Var.f35592u) {
                            v5Var.e();
                            v5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = v5Var.f35577e.u8(v5Var.f35578f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = v5Var.f35587p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    v5Var.f35587p = u82;
                                }
                                c3 c3Var = v5Var.f35587p.I0.f34795m;
                                if (v5Var.f35591t && t5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !v5Var.f35587p.isLayoutRequested()) {
                                    rectF.set(v5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        v5Var.f35592u = true;
                                        v5Var.f35587p.I0.i(true);
                                        c6Var3.f(c6Var22);
                                        c6Var3.setAlpha(f7);
                                        c6Var22.setAlpha(0.0f);
                                        v5Var.f35581j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - v5Var.f35593w <= 700 && !v5Var.f35590s && viewGroup2.isAttachedToWindow()) {
                                v5Var.h.postOnAnimation(v5Var.f35594x);
                                return;
                            }
                            v5Var.f35592u = true;
                            c6Var3.setAlpha(0.0f);
                            t5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35454b.d();
                        return;
                    default:
                        this.f35454b.f35591t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new u5(this, yiVar, c6Var));
        s5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        r5 r5Var = this.f35594x;
        s5 s5Var = this.h;
        s5Var.removeCallbacks(r5Var);
        c6 c6Var = this.f35580i;
        c6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f35587p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f35589r >= 1.0f) {
                RectF rectF = this.f35586o;
                if (!rectF.isEmpty() && this.f35587p.isAttachedToWindow() && k0.F(this.f35587p.getMessageObject(), this.f35578f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f35585n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    d3 d3Var = this.f35587p.I0;
                    d3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    d3Var.f34776b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f16938u = lVar;
                    d3Var.f34776b0.e(0.001f);
                    d3Var.f34776b0.f16927a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d3Var.f34776b0.b(new y2(d3Var, 1));
                    d3Var.f34776b0.h();
                }
            }
        }
        t5 t5Var = this.f35588q;
        t5Var.setPaused(true);
        s5Var.removeView(t5Var);
        c6Var.setPaused(true);
        s5Var.removeView(c6Var);
        s5Var.setClickable(false);
        this.d.setAlpha(this.f35583l);
        yi yiVar = this.f35576c;
        if (yiVar == null) {
            this.f35575b.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35574a;
        if (yiVar != null && z10 && this.f35581j.d()) {
            zn znVar = this.f35577e;
            if (znVar.getParentLayout() != null) {
                ViewGroup view = znVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(s5Var);
                    s5Var.setTranslationX(iArr[0] - iArr2[0]);
                    s5Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(s5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35579g.run();
        AndroidUtilities.runOnUIThread(new ii1(13, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        s5 s5Var = this.h;
        float f12 = dp / 2.0f;
        c6 c6Var = this.f35580i;
        c6Var.setTranslationX((f7 - s5Var.getLeft()) - f12);
        c6Var.setTranslationY((f10 - s5Var.getTop()) - f12);
        float f13 = f11 / dp;
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
        float translationX = c6Var.getTranslationX();
        t5 t5Var = this.f35588q;
        t5Var.setTranslationX(translationX);
        t5Var.setTranslationY(c6Var.getTranslationY());
        t5Var.setScaleX(f13);
        t5Var.setScaleY(f13);
    }

    public final RectF c(c3 c3Var) {
        yi yiVar = this.f35576c;
        ViewGroup viewGroup = this.f35574a;
        if (yiVar == null) {
            return w8.a(viewGroup, c3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) c3Var.getRootView();
        RectF a2 = w8.a(viewGroup2, c3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        t5 t5Var = this.f35588q;
        if (t5Var == null) {
            return;
        }
        c6 c6Var = this.f35580i;
        float flightYaw = c6Var.getFlightYaw();
        float flightPitch = c6Var.getFlightPitch();
        if (this.f35587p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f35589r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f35587p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f35587p.I0.f34791k.E * 0.14f) - flightPitch) * B;
        }
        t5Var.f48157n = flightYaw;
        t5Var.f48158r = flightPitch;
        t5Var.f48159s = true;
        t5Var.v = true;
    }

    public final void e() {
        c6 c6Var = this.d;
        if (c6Var.isAttachedToWindow()) {
            View rootView = c6Var.getRootView();
            ViewGroup viewGroup = this.f35574a;
            if (rootView == viewGroup.getRootView()) {
                yi yiVar = this.f35576c;
                RectF rectF = this.f35585n;
                if (yiVar == null) {
                    w8.f(c6Var, this.f35575b, viewGroup, rectF);
                    return;
                }
                rectF.set(w8.a(viewGroup, c6Var));
                rectF.offset(0.0f, yiVar.f33256o2 - yiVar.f33289y0);
            }
        }
    }
}

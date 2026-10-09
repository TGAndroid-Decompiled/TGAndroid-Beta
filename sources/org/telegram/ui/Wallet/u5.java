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
public final class u5 {
    public final ViewGroup f35506a;
    public final View f35507b;
    public final yi f35508c;
    public final b6 d;
    public final zn f35509e;
    public final TL_wallet.walletTransaction f35510f;
    public final Runnable f35511g;
    public final r5 h;
    public final b6 f35512i;
    public final k8 f35513j = new k8();
    public final PathInterpolator f35514k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35515l;
    public final AnimatorSet f35516m;
    public final RectF f35517n;
    public final RectF f35518o;
    public org.telegram.ui.Cells.w0 f35519p;
    public final s5 f35520q;
    public float f35521r;
    public boolean f35522s;
    public boolean f35523t;
    public boolean f35524u;
    public boolean v;
    public final long f35525w;
    public final q5 f35526x;

    public u5(ViewGroup viewGroup, View view, b6 b6Var, zn znVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35516m = animatorSet;
        this.f35518o = new RectF();
        this.f35525w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final u5 f35391b;

            {
                this.f35391b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u5 u5Var = this.f35391b;
                        b6 b6Var2 = u5Var.d;
                        float f7 = u5Var.f35515l;
                        ViewGroup viewGroup2 = u5Var.f35506a;
                        s5 s5Var = u5Var.f35520q;
                        AnimatorSet animatorSet2 = u5Var.f35516m;
                        b6 b6Var3 = u5Var.f35512i;
                        RectF rectF = u5Var.f35518o;
                        RectF rectF2 = u5Var.f35517n;
                        if (!u5Var.v && !u5Var.f35524u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = u5Var.f35509e.u8(u5Var.f35510f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = u5Var.f35519p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    u5Var.f35519p = u82;
                                }
                                b3 b3Var = u5Var.f35519p.I0.f34730m;
                                if (u5Var.f35523t && s5Var.h && b3Var != null && b3Var.h && b3Var.getWidth() > 0 && !u5Var.f35519p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(b3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.f35524u = true;
                                        u5Var.f35519p.I0.i(true);
                                        b6Var3.f(b6Var2);
                                        b6Var3.setAlpha(f7);
                                        b6Var2.setAlpha(0.0f);
                                        u5Var.f35513j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.f35525w <= 700 && !u5Var.f35522s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.f35526x);
                                return;
                            }
                            u5Var.f35524u = true;
                            b6Var3.setAlpha(0.0f);
                            s5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35391b.d();
                        return;
                    default:
                        this.f35391b.f35523t = true;
                        return;
                }
            }
        };
        this.f35526x = r12;
        this.f35508c = yiVar;
        this.f35506a = viewGroup;
        this.f35507b = view;
        this.d = b6Var;
        this.f35515l = b6Var.getAlpha();
        this.f35509e = znVar;
        this.f35510f = wallettransaction;
        this.f35511g = runnable;
        RectF a2 = v8.a(viewGroup, b6Var);
        this.f35517n = a2;
        e();
        r5 r5Var = new r5(this, viewGroup.getContext());
        this.h = r5Var;
        r5Var.setClipChildren(false);
        r5Var.setClipToPadding(false);
        r5Var.setClickable(true);
        b6 b6Var2 = new b6(60, viewGroup.getContext(), true);
        this.f35512i = b6Var2;
        b6Var2.setContinuousRotation(540.0f);
        b6Var2.f(b6Var);
        b6Var2.setAlpha(0.0f);
        r5Var.addView(b6Var2, w7.x5.e(60, 60, 51));
        s5 s5Var = new s5(this, viewGroup.getContext(), new Runnable(this) {
            public final u5 f35391b;

            {
                this.f35391b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u5 u5Var = this.f35391b;
                        b6 b6Var22 = u5Var.d;
                        float f7 = u5Var.f35515l;
                        ViewGroup viewGroup2 = u5Var.f35506a;
                        s5 s5Var2 = u5Var.f35520q;
                        AnimatorSet animatorSet2 = u5Var.f35516m;
                        b6 b6Var3 = u5Var.f35512i;
                        RectF rectF = u5Var.f35518o;
                        RectF rectF2 = u5Var.f35517n;
                        if (!u5Var.v && !u5Var.f35524u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = u5Var.f35509e.u8(u5Var.f35510f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = u5Var.f35519p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    u5Var.f35519p = u82;
                                }
                                b3 b3Var = u5Var.f35519p.I0.f34730m;
                                if (u5Var.f35523t && s5Var2.h && b3Var != null && b3Var.h && b3Var.getWidth() > 0 && !u5Var.f35519p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(b3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.f35524u = true;
                                        u5Var.f35519p.I0.i(true);
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(f7);
                                        b6Var22.setAlpha(0.0f);
                                        u5Var.f35513j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.f35525w <= 700 && !u5Var.f35522s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.f35526x);
                                return;
                            }
                            u5Var.f35524u = true;
                            b6Var3.setAlpha(0.0f);
                            s5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35391b.d();
                        return;
                    default:
                        this.f35391b.f35523t = true;
                        return;
                }
            }
        });
        this.f35520q = s5Var;
        s5Var.setAlpha(0.001f);
        s5Var.setPaused(false);
        r5Var.addView(s5Var, w7.x5.e(60, 60, 51));
        viewGroup.addView(r5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        b6Var2.l(new Runnable(this) {
            public final u5 f35391b;

            {
                this.f35391b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u5 u5Var = this.f35391b;
                        b6 b6Var22 = u5Var.d;
                        float f7 = u5Var.f35515l;
                        ViewGroup viewGroup2 = u5Var.f35506a;
                        s5 s5Var2 = u5Var.f35520q;
                        AnimatorSet animatorSet2 = u5Var.f35516m;
                        b6 b6Var3 = u5Var.f35512i;
                        RectF rectF = u5Var.f35518o;
                        RectF rectF2 = u5Var.f35517n;
                        if (!u5Var.v && !u5Var.f35524u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = u5Var.f35509e.u8(u5Var.f35510f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = u5Var.f35519p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    u5Var.f35519p = u82;
                                }
                                b3 b3Var = u5Var.f35519p.I0.f34730m;
                                if (u5Var.f35523t && s5Var2.h && b3Var != null && b3Var.h && b3Var.getWidth() > 0 && !u5Var.f35519p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(b3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.f35524u = true;
                                        u5Var.f35519p.I0.i(true);
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(f7);
                                        b6Var22.setAlpha(0.0f);
                                        u5Var.f35513j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.f35525w <= 700 && !u5Var.f35522s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.f35526x);
                                return;
                            }
                            u5Var.f35524u = true;
                            b6Var3.setAlpha(0.0f);
                            s5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35391b.d();
                        return;
                    default:
                        this.f35391b.f35523t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new t5(this, yiVar, b6Var));
        r5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        q5 q5Var = this.f35526x;
        r5 r5Var = this.h;
        r5Var.removeCallbacks(q5Var);
        b6 b6Var = this.f35512i;
        b6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f35519p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f35521r >= 1.0f) {
                RectF rectF = this.f35518o;
                if (!rectF.isEmpty() && this.f35519p.isAttachedToWindow() && k0.F(this.f35519p.getMessageObject(), this.f35510f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f35517n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    c3 c3Var = this.f35519p.I0;
                    c3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    c3Var.f34711b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f16938u = lVar;
                    c3Var.f34711b0.e(0.001f);
                    c3Var.f34711b0.f16927a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    c3Var.f34711b0.b(new y2(c3Var, 1));
                    c3Var.f34711b0.h();
                }
            }
        }
        s5 s5Var = this.f35520q;
        s5Var.setPaused(true);
        r5Var.removeView(s5Var);
        b6Var.setPaused(true);
        r5Var.removeView(b6Var);
        r5Var.setClickable(false);
        this.d.setAlpha(this.f35515l);
        yi yiVar = this.f35508c;
        if (yiVar == null) {
            this.f35507b.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35506a;
        if (yiVar != null && z10 && this.f35513j.d()) {
            zn znVar = this.f35509e;
            if (znVar.getParentLayout() != null) {
                ViewGroup view = znVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(r5Var);
                    r5Var.setTranslationX(iArr[0] - iArr2[0]);
                    r5Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(r5Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f35511g.run();
        AndroidUtilities.runOnUIThread(new ii1(13, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        r5 r5Var = this.h;
        float f12 = dp / 2.0f;
        b6 b6Var = this.f35512i;
        b6Var.setTranslationX((f7 - r5Var.getLeft()) - f12);
        b6Var.setTranslationY((f10 - r5Var.getTop()) - f12);
        float f13 = f11 / dp;
        b6Var.setScaleX(f13);
        b6Var.setScaleY(f13);
        float translationX = b6Var.getTranslationX();
        s5 s5Var = this.f35520q;
        s5Var.setTranslationX(translationX);
        s5Var.setTranslationY(b6Var.getTranslationY());
        s5Var.setScaleX(f13);
        s5Var.setScaleY(f13);
    }

    public final RectF c(b3 b3Var) {
        yi yiVar = this.f35508c;
        ViewGroup viewGroup = this.f35506a;
        if (yiVar == null) {
            return v8.a(viewGroup, b3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) b3Var.getRootView();
        RectF a2 = v8.a(viewGroup2, b3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        s5 s5Var = this.f35520q;
        if (s5Var == null) {
            return;
        }
        b6 b6Var = this.f35512i;
        float flightYaw = b6Var.getFlightYaw();
        float flightPitch = b6Var.getFlightPitch();
        if (this.f35519p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f35521r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f35519p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f35519p.I0.f34726k.E * 0.14f) - flightPitch) * B;
        }
        s5Var.f48155n = flightYaw;
        s5Var.f48156r = flightPitch;
        s5Var.f48157s = true;
        s5Var.v = true;
    }

    public final void e() {
        b6 b6Var = this.d;
        if (b6Var.isAttachedToWindow()) {
            View rootView = b6Var.getRootView();
            ViewGroup viewGroup = this.f35506a;
            if (rootView == viewGroup.getRootView()) {
                yi yiVar = this.f35508c;
                RectF rectF = this.f35517n;
                if (yiVar == null) {
                    v8.f(b6Var, this.f35507b, viewGroup, rectF);
                    return;
                }
                rectF.set(v8.a(viewGroup, b6Var));
                rectF.offset(0.0f, yiVar.f33256o2 - yiVar.f33289y0);
            }
        }
    }
}

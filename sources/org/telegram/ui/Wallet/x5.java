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
import org.telegram.ui.zn;
public final class x5 {
    public final ViewGroup f35732a;
    public final View f35733b;
    public final yi f35734c;
    public final e6 d;
    public final zn f35735e;
    public final TL_wallet.walletTransaction f35736f;
    public final Runnable f35737g;
    public final u5 h;
    public final e6 f35738i;
    public final n8 f35739j = new n8();
    public final PathInterpolator f35740k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f35741l;
    public final AnimatorSet f35742m;
    public final RectF f35743n;
    public final RectF f35744o;
    public org.telegram.ui.Cells.w0 f35745p;
    public final v5 f35746q;
    public float f35747r;
    public boolean f35748s;
    public boolean f35749t;
    public boolean f35750u;
    public boolean v;
    public final long f35751w;
    public final t5 f35752x;

    public x5(ViewGroup viewGroup, View view, e6 e6Var, zn znVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, yi yiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35742m = animatorSet;
        this.f35744o = new RectF();
        this.f35751w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final x5 f35613b;

            {
                this.f35613b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f35613b;
                        e6 e6Var2 = x5Var.d;
                        float f7 = x5Var.f35741l;
                        ViewGroup viewGroup2 = x5Var.f35732a;
                        v5 v5Var = x5Var.f35746q;
                        AnimatorSet animatorSet2 = x5Var.f35742m;
                        e6 e6Var3 = x5Var.f35738i;
                        RectF rectF = x5Var.f35744o;
                        RectF rectF2 = x5Var.f35743n;
                        if (!x5Var.v && !x5Var.f35750u) {
                            x5Var.e();
                            x5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = x5Var.f35735e.u8(x5Var.f35736f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = x5Var.f35745p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    x5Var.f35745p = u82;
                                }
                                e3 e3Var = x5Var.f35745p.I0.f34952m;
                                if (x5Var.f35749t && v5Var.h && e3Var != null && e3Var.h && e3Var.getWidth() > 0 && !x5Var.f35745p.isLayoutRequested()) {
                                    rectF.set(x5Var.c(e3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        x5Var.f35750u = true;
                                        x5Var.f35745p.I0.i(true);
                                        e6Var3.f(e6Var2);
                                        e6Var3.setAlpha(f7);
                                        e6Var2.setAlpha(0.0f);
                                        x5Var.f35739j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - x5Var.f35751w <= 700 && !x5Var.f35748s && viewGroup2.isAttachedToWindow()) {
                                x5Var.h.postOnAnimation(x5Var.f35752x);
                                return;
                            }
                            x5Var.f35750u = true;
                            e6Var3.setAlpha(0.0f);
                            v5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35613b.d();
                        return;
                    default:
                        this.f35613b.f35749t = true;
                        return;
                }
            }
        };
        this.f35752x = r12;
        this.f35734c = yiVar;
        this.f35732a = viewGroup;
        this.f35733b = view;
        this.d = e6Var;
        this.f35741l = e6Var.getAlpha();
        this.f35735e = znVar;
        this.f35736f = wallettransaction;
        this.f35737g = runnable;
        RectF a2 = y8.a(viewGroup, e6Var);
        this.f35743n = a2;
        e();
        u5 u5Var = new u5(this, viewGroup.getContext());
        this.h = u5Var;
        u5Var.setClipChildren(false);
        u5Var.setClipToPadding(false);
        u5Var.setClickable(true);
        e6 e6Var2 = new e6(60, viewGroup.getContext(), true);
        this.f35738i = e6Var2;
        e6Var2.setContinuousRotation(540.0f);
        e6Var2.f(e6Var);
        e6Var2.setAlpha(0.0f);
        u5Var.addView(e6Var2, w7.x5.e(60, 60, 51));
        v5 v5Var = new v5(this, viewGroup.getContext(), new Runnable(this) {
            public final x5 f35613b;

            {
                this.f35613b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f35613b;
                        e6 e6Var22 = x5Var.d;
                        float f7 = x5Var.f35741l;
                        ViewGroup viewGroup2 = x5Var.f35732a;
                        v5 v5Var2 = x5Var.f35746q;
                        AnimatorSet animatorSet2 = x5Var.f35742m;
                        e6 e6Var3 = x5Var.f35738i;
                        RectF rectF = x5Var.f35744o;
                        RectF rectF2 = x5Var.f35743n;
                        if (!x5Var.v && !x5Var.f35750u) {
                            x5Var.e();
                            x5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = x5Var.f35735e.u8(x5Var.f35736f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = x5Var.f35745p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    x5Var.f35745p = u82;
                                }
                                e3 e3Var = x5Var.f35745p.I0.f34952m;
                                if (x5Var.f35749t && v5Var2.h && e3Var != null && e3Var.h && e3Var.getWidth() > 0 && !x5Var.f35745p.isLayoutRequested()) {
                                    rectF.set(x5Var.c(e3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        x5Var.f35750u = true;
                                        x5Var.f35745p.I0.i(true);
                                        e6Var3.f(e6Var22);
                                        e6Var3.setAlpha(f7);
                                        e6Var22.setAlpha(0.0f);
                                        x5Var.f35739j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - x5Var.f35751w <= 700 && !x5Var.f35748s && viewGroup2.isAttachedToWindow()) {
                                x5Var.h.postOnAnimation(x5Var.f35752x);
                                return;
                            }
                            x5Var.f35750u = true;
                            e6Var3.setAlpha(0.0f);
                            v5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35613b.d();
                        return;
                    default:
                        this.f35613b.f35749t = true;
                        return;
                }
            }
        });
        this.f35746q = v5Var;
        v5Var.setAlpha(0.001f);
        v5Var.setPaused(false);
        u5Var.addView(v5Var, w7.x5.e(60, 60, 51));
        viewGroup.addView(u5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        e6Var2.l(new Runnable(this) {
            public final x5 f35613b;

            {
                this.f35613b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        x5 x5Var = this.f35613b;
                        e6 e6Var22 = x5Var.d;
                        float f7 = x5Var.f35741l;
                        ViewGroup viewGroup2 = x5Var.f35732a;
                        v5 v5Var2 = x5Var.f35746q;
                        AnimatorSet animatorSet2 = x5Var.f35742m;
                        e6 e6Var3 = x5Var.f35738i;
                        RectF rectF = x5Var.f35744o;
                        RectF rectF2 = x5Var.f35743n;
                        if (!x5Var.v && !x5Var.f35750u) {
                            x5Var.e();
                            x5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.w0 u82 = x5Var.f35735e.u8(x5Var.f35736f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.w0 w0Var = x5Var.f35745p;
                                if (w0Var != u82) {
                                    if (w0Var != null) {
                                        w0Var.I0.i(false);
                                    }
                                    x5Var.f35745p = u82;
                                }
                                e3 e3Var = x5Var.f35745p.I0.f34952m;
                                if (x5Var.f35749t && v5Var2.h && e3Var != null && e3Var.h && e3Var.getWidth() > 0 && !x5Var.f35745p.isLayoutRequested()) {
                                    rectF.set(x5Var.c(e3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        x5Var.f35750u = true;
                                        x5Var.f35745p.I0.i(true);
                                        e6Var3.f(e6Var22);
                                        e6Var3.setAlpha(f7);
                                        e6Var22.setAlpha(0.0f);
                                        x5Var.f35739j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - x5Var.f35751w <= 700 && !x5Var.f35748s && viewGroup2.isAttachedToWindow()) {
                                x5Var.h.postOnAnimation(x5Var.f35752x);
                                return;
                            }
                            x5Var.f35750u = true;
                            e6Var3.setAlpha(0.0f);
                            v5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f35613b.d();
                        return;
                    default:
                        this.f35613b.f35749t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new u2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new w5(this, yiVar, e6Var));
        u5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        t5 t5Var = this.f35752x;
        u5 u5Var = this.h;
        u5Var.removeCallbacks(t5Var);
        e6 e6Var = this.f35738i;
        e6Var.l(null);
        org.telegram.ui.Cells.w0 w0Var = this.f35745p;
        if (w0Var != null) {
            w0Var.I0.i(false);
            if (z10 && this.f35747r >= 1.0f) {
                RectF rectF = this.f35744o;
                if (!rectF.isEmpty() && this.f35745p.isAttachedToWindow() && l0.F(this.f35745p.getMessageObject(), this.f35736f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f35743n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    f3 f3Var = this.f35745p.I0;
                    f3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    f3Var.f34933b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f17024u = lVar;
                    f3Var.f34933b0.e(0.001f);
                    f3Var.f34933b0.f17013a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    f3Var.f34933b0.b(new a3(f3Var, 1));
                    f3Var.f34933b0.h();
                }
            }
        }
        v5 v5Var = this.f35746q;
        v5Var.setPaused(true);
        u5Var.removeView(v5Var);
        e6Var.setPaused(true);
        u5Var.removeView(e6Var);
        u5Var.setClickable(false);
        this.d.setAlpha(this.f35741l);
        yi yiVar = this.f35734c;
        if (yiVar == null) {
            this.f35733b.setTranslationY(0.0f);
        } else {
            yiVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f35732a;
        if (yiVar != null && z10 && this.f35739j.d()) {
            zn znVar = this.f35735e;
            if (znVar.getParentLayout() != null) {
                ViewGroup view = znVar.getParentLayout().getView();
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
        this.f35737g.run();
        AndroidUtilities.runOnUIThread(new i(12, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        u5 u5Var = this.h;
        float f12 = dp / 2.0f;
        e6 e6Var = this.f35738i;
        e6Var.setTranslationX((f7 - u5Var.getLeft()) - f12);
        e6Var.setTranslationY((f10 - u5Var.getTop()) - f12);
        float f13 = f11 / dp;
        e6Var.setScaleX(f13);
        e6Var.setScaleY(f13);
        float translationX = e6Var.getTranslationX();
        v5 v5Var = this.f35746q;
        v5Var.setTranslationX(translationX);
        v5Var.setTranslationY(e6Var.getTranslationY());
        v5Var.setScaleX(f13);
        v5Var.setScaleY(f13);
    }

    public final RectF c(e3 e3Var) {
        yi yiVar = this.f35734c;
        ViewGroup viewGroup = this.f35732a;
        if (yiVar == null) {
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
        v5 v5Var = this.f35746q;
        if (v5Var == null) {
            return;
        }
        e6 e6Var = this.f35738i;
        float flightYaw = e6Var.getFlightYaw();
        float flightPitch = e6Var.getFlightPitch();
        if (this.f35745p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f35747r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.vision.e2.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f35745p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f35745p.I0.f34948k.E * 0.14f) - flightPitch) * B;
        }
        v5Var.f48281n = flightYaw;
        v5Var.f48282r = flightPitch;
        v5Var.f48283s = true;
        v5Var.v = true;
    }

    public final void e() {
        e6 e6Var = this.d;
        if (e6Var.isAttachedToWindow()) {
            View rootView = e6Var.getRootView();
            ViewGroup viewGroup = this.f35732a;
            if (rootView == viewGroup.getRootView()) {
                yi yiVar = this.f35734c;
                RectF rectF = this.f35743n;
                if (yiVar == null) {
                    y8.f(e6Var, this.f35733b, viewGroup, rectF);
                    return;
                }
                rectF.set(y8.a(viewGroup, e6Var));
                rectF.offset(0.0f, yiVar.f33317o2 - yiVar.f33350y0);
            }
        }
    }
}

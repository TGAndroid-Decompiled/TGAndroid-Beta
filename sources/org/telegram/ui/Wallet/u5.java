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
import org.telegram.ui.Components.vi;
import org.telegram.ui.fo;
import org.telegram.ui.je1;
public final class u5 {
    public final ViewGroup f33734a;
    public final View f33735b;
    public final vi f33736c;
    public final b6 d;
    public final fo e;
    public final TL_wallet.walletTransaction f33737f;
    public final Runnable f33738g;
    public final r5 h;
    public final b6 f33739i;
    public final k8 f33740j = new k8();
    public final PathInterpolator f33741k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f33742l;
    public final AnimatorSet f33743m;
    public final RectF f33744n;
    public final RectF f33745o;
    public org.telegram.ui.Cells.x0 f33746p;
    public final s5 f33747q;
    public float f33748r;
    public boolean f33749s;
    public boolean f33750t;
    public boolean f33751u;
    public boolean v;
    public final long f33752w;
    public final q5 f33753x;

    public u5(ViewGroup viewGroup, View view, b6 b6Var, fo foVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, vi viVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f33743m = animatorSet;
        this.f33745o = new RectF();
        this.f33752w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final u5 f33625b;

            {
                this.f33625b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u5 u5Var = this.f33625b;
                        b6 b6Var2 = u5Var.d;
                        float f7 = u5Var.f33742l;
                        ViewGroup viewGroup2 = u5Var.f33734a;
                        s5 s5Var = u5Var.f33747q;
                        AnimatorSet animatorSet2 = u5Var.f33743m;
                        b6 b6Var3 = u5Var.f33739i;
                        RectF rectF = u5Var.f33745o;
                        RectF rectF2 = u5Var.f33744n;
                        if (!u5Var.v && !u5Var.f33751u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f33737f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = u5Var.f33746p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.i(false);
                                    }
                                    u5Var.f33746p = u82;
                                }
                                c3 c3Var = u5Var.f33746p.I0.f33066m;
                                if (u5Var.f33750t && s5Var.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !u5Var.f33746p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.f33751u = true;
                                        u5Var.f33746p.I0.i(true);
                                        b6Var3.f(b6Var2);
                                        b6Var3.setAlpha(f7);
                                        b6Var2.setAlpha(0.0f);
                                        u5Var.f33740j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.f33752w <= 700 && !u5Var.f33749s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.f33753x);
                                return;
                            }
                            u5Var.f33751u = true;
                            b6Var3.setAlpha(0.0f);
                            s5Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f33625b.d();
                        return;
                    default:
                        this.f33625b.f33750t = true;
                        return;
                }
            }
        };
        this.f33753x = r12;
        this.f33736c = viVar;
        this.f33734a = viewGroup;
        this.f33735b = view;
        this.d = b6Var;
        this.f33742l = b6Var.getAlpha();
        this.e = foVar;
        this.f33737f = wallettransaction;
        this.f33738g = runnable;
        RectF a2 = w8.a(viewGroup, b6Var);
        this.f33744n = a2;
        e();
        r5 r5Var = new r5(this, viewGroup.getContext());
        this.h = r5Var;
        r5Var.setClipChildren(false);
        r5Var.setClipToPadding(false);
        r5Var.setClickable(true);
        b6 b6Var2 = new b6(60, viewGroup.getContext(), true);
        this.f33739i = b6Var2;
        b6Var2.setContinuousRotation(540.0f);
        b6Var2.f(b6Var);
        b6Var2.setAlpha(0.0f);
        r5Var.addView(b6Var2, w7.a6.e(60, 60, 51));
        s5 s5Var = new s5(this, viewGroup.getContext(), new Runnable(this) {
            public final u5 f33625b;

            {
                this.f33625b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u5 u5Var = this.f33625b;
                        b6 b6Var22 = u5Var.d;
                        float f7 = u5Var.f33742l;
                        ViewGroup viewGroup2 = u5Var.f33734a;
                        s5 s5Var2 = u5Var.f33747q;
                        AnimatorSet animatorSet2 = u5Var.f33743m;
                        b6 b6Var3 = u5Var.f33739i;
                        RectF rectF = u5Var.f33745o;
                        RectF rectF2 = u5Var.f33744n;
                        if (!u5Var.v && !u5Var.f33751u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f33737f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = u5Var.f33746p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.i(false);
                                    }
                                    u5Var.f33746p = u82;
                                }
                                c3 c3Var = u5Var.f33746p.I0.f33066m;
                                if (u5Var.f33750t && s5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !u5Var.f33746p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.f33751u = true;
                                        u5Var.f33746p.I0.i(true);
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(f7);
                                        b6Var22.setAlpha(0.0f);
                                        u5Var.f33740j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.f33752w <= 700 && !u5Var.f33749s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.f33753x);
                                return;
                            }
                            u5Var.f33751u = true;
                            b6Var3.setAlpha(0.0f);
                            s5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f33625b.d();
                        return;
                    default:
                        this.f33625b.f33750t = true;
                        return;
                }
            }
        });
        this.f33747q = s5Var;
        s5Var.setAlpha(0.001f);
        s5Var.setPaused(false);
        r5Var.addView(s5Var, w7.a6.e(60, 60, 51));
        viewGroup.addView(r5Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        b6Var2.l(new Runnable(this) {
            public final u5 f33625b;

            {
                this.f33625b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        u5 u5Var = this.f33625b;
                        b6 b6Var22 = u5Var.d;
                        float f7 = u5Var.f33742l;
                        ViewGroup viewGroup2 = u5Var.f33734a;
                        s5 s5Var2 = u5Var.f33747q;
                        AnimatorSet animatorSet2 = u5Var.f33743m;
                        b6 b6Var3 = u5Var.f33739i;
                        RectF rectF = u5Var.f33745o;
                        RectF rectF2 = u5Var.f33744n;
                        if (!u5Var.v && !u5Var.f33751u) {
                            u5Var.e();
                            u5Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.x0 u82 = u5Var.e.u8(u5Var.f33737f);
                            if (u82 != null && u82.getWidth() > 0) {
                                org.telegram.ui.Cells.x0 x0Var = u5Var.f33746p;
                                if (x0Var != u82) {
                                    if (x0Var != null) {
                                        x0Var.I0.i(false);
                                    }
                                    u5Var.f33746p = u82;
                                }
                                c3 c3Var = u5Var.f33746p.I0.f33066m;
                                if (u5Var.f33750t && s5Var2.h && c3Var != null && c3Var.h && c3Var.getWidth() > 0 && !u5Var.f33746p.isLayoutRequested()) {
                                    rectF.set(u5Var.c(c3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        u5Var.f33751u = true;
                                        u5Var.f33746p.I0.i(true);
                                        b6Var3.f(b6Var22);
                                        b6Var3.setAlpha(f7);
                                        b6Var22.setAlpha(0.0f);
                                        u5Var.f33740j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - u5Var.f33752w <= 700 && !u5Var.f33749s && viewGroup2.isAttachedToWindow()) {
                                u5Var.h.postOnAnimation(u5Var.f33753x);
                                return;
                            }
                            u5Var.f33751u = true;
                            b6Var3.setAlpha(0.0f);
                            s5Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f33625b.d();
                        return;
                    default:
                        this.f33625b.f33750t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new s2(this, 4));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new t5(this, viVar, b6Var));
        r5Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        q5 q5Var = this.f33753x;
        r5 r5Var = this.h;
        r5Var.removeCallbacks(q5Var);
        b6 b6Var = this.f33739i;
        b6Var.l(null);
        org.telegram.ui.Cells.x0 x0Var = this.f33746p;
        if (x0Var != null) {
            x0Var.I0.i(false);
            if (z10 && this.f33748r >= 1.0f) {
                RectF rectF = this.f33745o;
                if (!rectF.isEmpty() && this.f33746p.isAttachedToWindow() && j0.F(this.f33746p.getMessageObject(), this.f33737f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f33744n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    d3 d3Var = this.f33746p.I0;
                    d3Var.l();
                    o1.k kVar = new o1.k(new o1.j(0.0f));
                    d3Var.f33048b0 = kVar;
                    o1.l lVar = new o1.l(0.0f);
                    lVar.a(0.65f);
                    lVar.b(200.0f);
                    kVar.f16468u = lVar;
                    d3Var.f33048b0.e(0.001f);
                    d3Var.f33048b0.f16458a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    d3Var.f33048b0.b(new y2(d3Var, 1));
                    d3Var.f33048b0.h();
                }
            }
        }
        s5 s5Var = this.f33747q;
        s5Var.setPaused(true);
        r5Var.removeView(s5Var);
        b6Var.setPaused(true);
        r5Var.removeView(b6Var);
        r5Var.setClickable(false);
        this.d.setAlpha(this.f33742l);
        vi viVar = this.f33736c;
        if (viVar == null) {
            this.f33735b.setTranslationY(0.0f);
        } else {
            viVar.M1(1.0f);
        }
        ViewGroup viewGroup = this.f33734a;
        if (viVar != null && z10 && this.f33740j.d()) {
            fo foVar = this.e;
            if (foVar.getParentLayout() != null) {
                ViewGroup view = foVar.getParentLayout().getView();
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
        this.f33738g.run();
        AndroidUtilities.runOnUIThread(new je1(24, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        r5 r5Var = this.h;
        float f12 = dp / 2.0f;
        b6 b6Var = this.f33739i;
        b6Var.setTranslationX((f7 - r5Var.getLeft()) - f12);
        b6Var.setTranslationY((f10 - r5Var.getTop()) - f12);
        float f13 = f11 / dp;
        b6Var.setScaleX(f13);
        b6Var.setScaleY(f13);
        float translationX = b6Var.getTranslationX();
        s5 s5Var = this.f33747q;
        s5Var.setTranslationX(translationX);
        s5Var.setTranslationY(b6Var.getTranslationY());
        s5Var.setScaleX(f13);
        s5Var.setScaleY(f13);
    }

    public final RectF c(c3 c3Var) {
        vi viVar = this.f33736c;
        ViewGroup viewGroup = this.f33734a;
        if (viVar == null) {
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
        s5 s5Var = this.f33747q;
        if (s5Var == null) {
            return;
        }
        b6 b6Var = this.f33739i;
        float flightYaw = b6Var.getFlightYaw();
        float flightPitch = b6Var.getFlightPitch();
        if (this.f33746p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f33748r - 0.55f) / 0.45f));
            float B = com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f33746p.I0.g() - flightYaw, 6.283185307179586d)) * B;
            flightPitch += ((this.f33746p.I0.f33062k.E * 0.14f) - flightPitch) * B;
        }
        s5Var.f45814n = flightYaw;
        s5Var.f45815r = flightPitch;
        s5Var.f45816s = true;
        s5Var.v = true;
    }

    public final void e() {
        b6 b6Var = this.d;
        if (b6Var.isAttachedToWindow()) {
            View rootView = b6Var.getRootView();
            ViewGroup viewGroup = this.f33734a;
            if (rootView == viewGroup.getRootView()) {
                vi viVar = this.f33736c;
                RectF rectF = this.f33744n;
                if (viVar == null) {
                    w8.f(b6Var, this.f33735b, viewGroup, rectF);
                    return;
                }
                rectF.set(w8.a(viewGroup, b6Var));
                rectF.offset(0.0f, viVar.f30029o2 - viVar.f30062y0);
            }
        }
    }
}

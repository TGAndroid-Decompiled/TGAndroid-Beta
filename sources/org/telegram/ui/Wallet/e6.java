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
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.ti;
import org.telegram.ui.wn;
public final class e6 {
    public final ViewGroup f36524a;
    public final View f36525b;
    public final ti f36526c;
    public final m6 d;
    public final wn e;
    public final TL_wallet.walletTransaction f36527f;
    public final Runnable f36528g;
    public final b6 h;
    public final m6 f36529i;
    public final k9 f36530j = new k9();
    public final PathInterpolator f36531k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f36532l;
    public final AnimatorSet f36533m;
    public final RectF f36534n;
    public final RectF f36535o;
    public org.telegram.ui.Cells.v0 f36536p;
    public final c6 f36537q;
    public float f36538r;
    public boolean f36539s;
    public boolean f36540t;
    public boolean f36541u;
    public boolean v;
    public final long f36542w;
    public final z5 f36543x;

    public e6(ViewGroup viewGroup, View view, m6 m6Var, wn wnVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f36533m = animatorSet;
        this.f36535o = new RectF();
        this.f36542w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final e6 f37587b;

            {
                this.f37587b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f37587b;
                        m6 m6Var2 = e6Var.d;
                        float f7 = e6Var.f36532l;
                        ViewGroup viewGroup2 = e6Var.f36524a;
                        c6 c6Var = e6Var.f36537q;
                        AnimatorSet animatorSet2 = e6Var.f36533m;
                        m6 m6Var3 = e6Var.f36529i;
                        RectF rectF = e6Var.f36535o;
                        RectF rectF2 = e6Var.f36534n;
                        if (!e6Var.v && !e6Var.f36541u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 B8 = e6Var.e.B8(e6Var.f36527f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f36536p;
                                if (v0Var != B8) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f36536p = B8;
                                }
                                l3 l3Var = e6Var.f36536p.I0.f36913m;
                                if (e6Var.f36540t && c6Var.f49929n && l3Var != null && l3Var.f49929n && l3Var.getWidth() > 0 && !e6Var.f36536p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f36541u = true;
                                        e6Var.f36536p.I0.i(true);
                                        m6Var3.f(m6Var2);
                                        m6Var3.setAlpha(f7);
                                        m6Var2.setAlpha(0.0f);
                                        e6Var.f36530j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f36542w <= 700 && !e6Var.f36539s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f36543x);
                                return;
                            }
                            e6Var.f36541u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f37587b.d();
                        return;
                    default:
                        this.f37587b.f36540t = true;
                        return;
                }
            }
        };
        this.f36543x = r12;
        this.f36526c = tiVar;
        this.f36524a = viewGroup;
        this.f36525b = view;
        this.d = m6Var;
        this.f36532l = m6Var.getAlpha();
        this.e = wnVar;
        this.f36527f = wallettransaction;
        this.f36528g = runnable;
        RectF a2 = v9.a(viewGroup, m6Var);
        this.f36534n = a2;
        e();
        b6 b6Var = new b6(this, viewGroup.getContext());
        this.h = b6Var;
        b6Var.setClipChildren(false);
        b6Var.setClipToPadding(false);
        b6Var.setClickable(true);
        m6 m6Var2 = new m6(60, viewGroup.getContext(), true);
        this.f36529i = m6Var2;
        m6Var2.setContinuousRotation(540.0f);
        m6Var2.f(m6Var);
        m6Var2.setAlpha(0.0f);
        b6Var.addView(m6Var2, kb1.i(60, 60, 51));
        c6 c6Var = new c6(this, viewGroup.getContext(), new Runnable(this) {
            public final e6 f37587b;

            {
                this.f37587b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f37587b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f36532l;
                        ViewGroup viewGroup2 = e6Var.f36524a;
                        c6 c6Var2 = e6Var.f36537q;
                        AnimatorSet animatorSet2 = e6Var.f36533m;
                        m6 m6Var3 = e6Var.f36529i;
                        RectF rectF = e6Var.f36535o;
                        RectF rectF2 = e6Var.f36534n;
                        if (!e6Var.v && !e6Var.f36541u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 B8 = e6Var.e.B8(e6Var.f36527f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f36536p;
                                if (v0Var != B8) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f36536p = B8;
                                }
                                l3 l3Var = e6Var.f36536p.I0.f36913m;
                                if (e6Var.f36540t && c6Var2.f49929n && l3Var != null && l3Var.f49929n && l3Var.getWidth() > 0 && !e6Var.f36536p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f36541u = true;
                                        e6Var.f36536p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f36530j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f36542w <= 700 && !e6Var.f36539s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f36543x);
                                return;
                            }
                            e6Var.f36541u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f37587b.d();
                        return;
                    default:
                        this.f37587b.f36540t = true;
                        return;
                }
            }
        });
        this.f36537q = c6Var;
        c6Var.setAlpha(0.001f);
        c6Var.setPaused(false);
        b6Var.addView(c6Var, kb1.i(60, 60, 51));
        viewGroup.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        m6Var2.l(new Runnable(this) {
            public final e6 f37587b;

            {
                this.f37587b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        e6 e6Var = this.f37587b;
                        m6 m6Var22 = e6Var.d;
                        float f7 = e6Var.f36532l;
                        ViewGroup viewGroup2 = e6Var.f36524a;
                        c6 c6Var2 = e6Var.f36537q;
                        AnimatorSet animatorSet2 = e6Var.f36533m;
                        m6 m6Var3 = e6Var.f36529i;
                        RectF rectF = e6Var.f36535o;
                        RectF rectF2 = e6Var.f36534n;
                        if (!e6Var.v && !e6Var.f36541u) {
                            e6Var.e();
                            e6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 B8 = e6Var.e.B8(e6Var.f36527f);
                            if (B8 != null && B8.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = e6Var.f36536p;
                                if (v0Var != B8) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    e6Var.f36536p = B8;
                                }
                                l3 l3Var = e6Var.f36536p.I0.f36913m;
                                if (e6Var.f36540t && c6Var2.f49929n && l3Var != null && l3Var.f49929n && l3Var.getWidth() > 0 && !e6Var.f36536p.isLayoutRequested()) {
                                    rectF.set(e6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        e6Var.f36541u = true;
                                        e6Var.f36536p.I0.i(true);
                                        m6Var3.f(m6Var22);
                                        m6Var3.setAlpha(f7);
                                        m6Var22.setAlpha(0.0f);
                                        e6Var.f36530j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - e6Var.f36542w <= 700 && !e6Var.f36539s && viewGroup2.isAttachedToWindow()) {
                                e6Var.h.postOnAnimation(e6Var.f36543x);
                                return;
                            }
                            e6Var.f36541u = true;
                            m6Var3.setAlpha(0.0f);
                            c6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f37587b.d();
                        return;
                    default:
                        this.f37587b.f36540t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new d6(this, tiVar, m6Var));
        b6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        z5 z5Var = this.f36543x;
        b6 b6Var = this.h;
        b6Var.removeCallbacks(z5Var);
        m6 m6Var = this.f36529i;
        m6Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f36536p;
        if (v0Var != null) {
            v0Var.I0.i(false);
            if (z10 && this.f36538r >= 1.0f) {
                RectF rectF = this.f36535o;
                if (!rectF.isEmpty() && this.f36536p.isAttachedToWindow() && l0.I(this.f36536p.getMessageObject(), this.f36527f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f36534n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    m3 m3Var = this.f36536p.I0;
                    m3Var.l();
                    o1.j jVar = new o1.j(new ac.a(0.0f));
                    m3Var.f36895b0 = jVar;
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.65f);
                    kVar.b(200.0f);
                    jVar.f18968u = kVar;
                    m3Var.f36895b0.e(0.001f);
                    m3Var.f36895b0.f18959a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m3Var.f36895b0.b(new g3(m3Var, 1));
                    m3Var.f36895b0.h();
                }
            }
        }
        c6 c6Var = this.f36537q;
        c6Var.setPaused(true);
        b6Var.removeView(c6Var);
        m6Var.setPaused(true);
        b6Var.removeView(m6Var);
        b6Var.setClickable(false);
        this.d.setAlpha(this.f36532l);
        ti tiVar = this.f36526c;
        if (tiVar == null) {
            this.f36525b.setTranslationY(0.0f);
        } else {
            tiVar.Q1(1.0f);
        }
        ViewGroup viewGroup = this.f36524a;
        if (tiVar != null && z10 && this.f36530j.d()) {
            wn wnVar = this.e;
            if (wnVar.getParentLayout() != null) {
                ViewGroup view = wnVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(b6Var);
                    b6Var.setTranslationX(iArr[0] - iArr2[0]);
                    b6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(b6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f36528g.run();
        AndroidUtilities.runOnUIThread(new a6(0, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        b6 b6Var = this.h;
        float f12 = dp / 2.0f;
        m6 m6Var = this.f36529i;
        m6Var.setTranslationX((f7 - b6Var.getLeft()) - f12);
        m6Var.setTranslationY((f10 - b6Var.getTop()) - f12);
        float f13 = f11 / dp;
        m6Var.setScaleX(f13);
        m6Var.setScaleY(f13);
        float translationX = m6Var.getTranslationX();
        c6 c6Var = this.f36537q;
        c6Var.setTranslationX(translationX);
        c6Var.setTranslationY(m6Var.getTranslationY());
        c6Var.setScaleX(f13);
        c6Var.setScaleY(f13);
    }

    public final RectF c(l3 l3Var) {
        ti tiVar = this.f36526c;
        ViewGroup viewGroup = this.f36524a;
        if (tiVar == null) {
            return v9.a(viewGroup, l3Var);
        }
        ViewGroup viewGroup2 = (ViewGroup) l3Var.getRootView();
        RectF a2 = v9.a(viewGroup2, l3Var);
        int[] iArr = new int[2];
        viewGroup2.getLocationOnScreen(iArr);
        a2.offset(iArr[0], iArr[1]);
        viewGroup.getLocationOnScreen(iArr);
        a2.offset(-iArr[0], -iArr[1]);
        return a2;
    }

    public final void d() {
        c6 c6Var = this.f36537q;
        if (c6Var == null) {
            return;
        }
        m6 m6Var = this.f36529i;
        float flightYaw = m6Var.getFlightYaw();
        float flightPitch = m6Var.getFlightPitch();
        if (this.f36536p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f36538r - 0.55f) / 0.45f));
            float D = c3.h0.D(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f36536p.I0.g() - flightYaw, 6.283185307179586d)) * D;
            flightPitch += ((this.f36536p.I0.f36909k.E * 0.14f) - flightPitch) * D;
        }
        c6Var.f49930r = flightYaw;
        c6Var.f49931s = flightPitch;
        c6Var.v = true;
        c6Var.f49932w = true;
    }

    public final void e() {
        m6 m6Var = this.d;
        if (m6Var.isAttachedToWindow()) {
            View rootView = m6Var.getRootView();
            ViewGroup viewGroup = this.f36524a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f36526c;
                RectF rectF = this.f36534n;
                if (tiVar == null) {
                    v9.f(m6Var, this.f36525b, viewGroup, rectF);
                    return;
                }
                rectF.set(v9.a(viewGroup, m6Var));
                rectF.offset(0.0f, tiVar.f33018o2 - tiVar.f33051y0);
            }
        }
    }
}

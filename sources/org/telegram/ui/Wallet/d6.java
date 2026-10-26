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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.ti;
import org.telegram.ui.un;
import org.telegram.ui.zc1;
public final class d6 {
    public final ViewGroup f36464a;
    public final View f36465b;
    public final ti f36466c;
    public final l6 d;
    public final un e;
    public final TL_wallet.walletTransaction f36467f;
    public final Runnable f36468g;
    public final a6 h;
    public final l6 f36469i;
    public final k9 f36470j = new k9();
    public final PathInterpolator f36471k = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
    public final float f36472l;
    public final AnimatorSet f36473m;
    public final RectF f36474n;
    public final RectF f36475o;
    public org.telegram.ui.Cells.v0 f36476p;
    public final b6 f36477q;
    public float f36478r;
    public boolean f36479s;
    public boolean f36480t;
    public boolean f36481u;
    public boolean v;
    public final long f36482w;
    public final z5 f36483x;

    public d6(ViewGroup viewGroup, View view, l6 l6Var, un unVar, TL_wallet.walletTransaction wallettransaction, Runnable runnable, ti tiVar) {
        AnimatorSet animatorSet = new AnimatorSet();
        this.f36473m = animatorSet;
        this.f36475o = new RectF();
        this.f36482w = SystemClock.uptimeMillis();
        ?? r12 = new Runnable(this) {
            public final d6 f37563b;

            {
                this.f37563b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d6 d6Var = this.f37563b;
                        l6 l6Var2 = d6Var.d;
                        float f7 = d6Var.f36472l;
                        ViewGroup viewGroup2 = d6Var.f36464a;
                        b6 b6Var = d6Var.f36477q;
                        AnimatorSet animatorSet2 = d6Var.f36473m;
                        l6 l6Var3 = d6Var.f36469i;
                        RectF rectF = d6Var.f36475o;
                        RectF rectF2 = d6Var.f36474n;
                        if (!d6Var.v && !d6Var.f36481u) {
                            d6Var.e();
                            d6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 y82 = d6Var.e.y8(d6Var.f36467f);
                            if (y82 != null && y82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = d6Var.f36476p;
                                if (v0Var != y82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    d6Var.f36476p = y82;
                                }
                                l3 l3Var = d6Var.f36476p.I0.f36908m;
                                if (d6Var.f36480t && b6Var.f49894n && l3Var != null && l3Var.f49894n && l3Var.getWidth() > 0 && !d6Var.f36476p.isLayoutRequested()) {
                                    rectF.set(d6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        d6Var.f36481u = true;
                                        d6Var.f36476p.I0.i(true);
                                        l6Var3.f(l6Var2);
                                        l6Var3.setAlpha(f7);
                                        l6Var2.setAlpha(0.0f);
                                        d6Var.f36470j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - d6Var.f36482w <= 700 && !d6Var.f36479s && viewGroup2.isAttachedToWindow()) {
                                d6Var.h.postOnAnimation(d6Var.f36483x);
                                return;
                            }
                            d6Var.f36481u = true;
                            l6Var3.setAlpha(0.0f);
                            b6Var.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f37563b.d();
                        return;
                    default:
                        this.f37563b.f36480t = true;
                        return;
                }
            }
        };
        this.f36483x = r12;
        this.f36466c = tiVar;
        this.f36464a = viewGroup;
        this.f36465b = view;
        this.d = l6Var;
        this.f36472l = l6Var.getAlpha();
        this.e = unVar;
        this.f36467f = wallettransaction;
        this.f36468g = runnable;
        RectF a2 = v9.a(viewGroup, l6Var);
        this.f36474n = a2;
        e();
        a6 a6Var = new a6(this, viewGroup.getContext());
        this.h = a6Var;
        a6Var.setClipChildren(false);
        a6Var.setClipToPadding(false);
        a6Var.setClickable(true);
        l6 l6Var2 = new l6(60, viewGroup.getContext(), true);
        this.f36469i = l6Var2;
        l6Var2.setContinuousRotation(540.0f);
        l6Var2.f(l6Var);
        l6Var2.setAlpha(0.0f);
        a6Var.addView(l6Var2, gb1.i(60, 60, 51));
        b6 b6Var = new b6(this, viewGroup.getContext(), new Runnable(this) {
            public final d6 f37563b;

            {
                this.f37563b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d6 d6Var = this.f37563b;
                        l6 l6Var22 = d6Var.d;
                        float f7 = d6Var.f36472l;
                        ViewGroup viewGroup2 = d6Var.f36464a;
                        b6 b6Var2 = d6Var.f36477q;
                        AnimatorSet animatorSet2 = d6Var.f36473m;
                        l6 l6Var3 = d6Var.f36469i;
                        RectF rectF = d6Var.f36475o;
                        RectF rectF2 = d6Var.f36474n;
                        if (!d6Var.v && !d6Var.f36481u) {
                            d6Var.e();
                            d6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 y82 = d6Var.e.y8(d6Var.f36467f);
                            if (y82 != null && y82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = d6Var.f36476p;
                                if (v0Var != y82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    d6Var.f36476p = y82;
                                }
                                l3 l3Var = d6Var.f36476p.I0.f36908m;
                                if (d6Var.f36480t && b6Var2.f49894n && l3Var != null && l3Var.f49894n && l3Var.getWidth() > 0 && !d6Var.f36476p.isLayoutRequested()) {
                                    rectF.set(d6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        d6Var.f36481u = true;
                                        d6Var.f36476p.I0.i(true);
                                        l6Var3.f(l6Var22);
                                        l6Var3.setAlpha(f7);
                                        l6Var22.setAlpha(0.0f);
                                        d6Var.f36470j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - d6Var.f36482w <= 700 && !d6Var.f36479s && viewGroup2.isAttachedToWindow()) {
                                d6Var.h.postOnAnimation(d6Var.f36483x);
                                return;
                            }
                            d6Var.f36481u = true;
                            l6Var3.setAlpha(0.0f);
                            b6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f37563b.d();
                        return;
                    default:
                        this.f37563b.f36480t = true;
                        return;
                }
            }
        });
        this.f36477q = b6Var;
        b6Var.setAlpha(0.001f);
        b6Var.setPaused(false);
        a6Var.addView(b6Var, gb1.i(60, 60, 51));
        viewGroup.addView(a6Var, new ViewGroup.LayoutParams(-1, -1));
        b(a2.centerX(), a2.centerY(), a2.width());
        l6Var2.l(new Runnable(this) {
            public final d6 f37563b;

            {
                this.f37563b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        d6 d6Var = this.f37563b;
                        l6 l6Var22 = d6Var.d;
                        float f7 = d6Var.f36472l;
                        ViewGroup viewGroup2 = d6Var.f36464a;
                        b6 b6Var2 = d6Var.f36477q;
                        AnimatorSet animatorSet2 = d6Var.f36473m;
                        l6 l6Var3 = d6Var.f36469i;
                        RectF rectF = d6Var.f36475o;
                        RectF rectF2 = d6Var.f36474n;
                        if (!d6Var.v && !d6Var.f36481u) {
                            d6Var.e();
                            d6Var.b(rectF2.centerX(), rectF2.centerY(), rectF2.width());
                            org.telegram.ui.Cells.v0 y82 = d6Var.e.y8(d6Var.f36467f);
                            if (y82 != null && y82.getWidth() > 0) {
                                org.telegram.ui.Cells.v0 v0Var = d6Var.f36476p;
                                if (v0Var != y82) {
                                    if (v0Var != null) {
                                        v0Var.I0.i(false);
                                    }
                                    d6Var.f36476p = y82;
                                }
                                l3 l3Var = d6Var.f36476p.I0.f36908m;
                                if (d6Var.f36480t && b6Var2.f49894n && l3Var != null && l3Var.f49894n && l3Var.getWidth() > 0 && !d6Var.f36476p.isLayoutRequested()) {
                                    rectF.set(d6Var.c(l3Var));
                                    if (rectF.centerY() > 0.0f && rectF.centerY() < viewGroup2.getHeight() && f7 > 0.01f) {
                                        d6Var.f36481u = true;
                                        d6Var.f36476p.I0.i(true);
                                        l6Var3.f(l6Var22);
                                        l6Var3.setAlpha(f7);
                                        l6Var22.setAlpha(0.0f);
                                        d6Var.f36470j.b(rectF2.centerX(), rectF2.centerY());
                                        animatorSet2.start();
                                        return;
                                    }
                                    rectF.setEmpty();
                                }
                            }
                            if (SystemClock.uptimeMillis() - d6Var.f36482w <= 700 && !d6Var.f36479s && viewGroup2.isAttachedToWindow()) {
                                d6Var.h.postOnAnimation(d6Var.f36483x);
                                return;
                            }
                            d6Var.f36481u = true;
                            l6Var3.setAlpha(0.0f);
                            b6Var2.setAlpha(0.0f);
                            animatorSet2.setDuration(180L);
                            animatorSet2.start();
                            return;
                        }
                        return;
                    case 1:
                        this.f37563b.d();
                        return;
                    default:
                        this.f37563b.f36480t = true;
                        return;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new a3(this, 3));
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new c6(this, tiVar, l6Var));
        a6Var.post(r12);
    }

    public final void a(boolean z10) {
        if (this.v) {
            return;
        }
        this.v = true;
        z5 z5Var = this.f36483x;
        a6 a6Var = this.h;
        a6Var.removeCallbacks(z5Var);
        l6 l6Var = this.f36469i;
        l6Var.l(null);
        org.telegram.ui.Cells.v0 v0Var = this.f36476p;
        if (v0Var != null) {
            v0Var.I0.i(false);
            if (z10 && this.f36478r >= 1.0f) {
                RectF rectF = this.f36475o;
                if (!rectF.isEmpty() && this.f36476p.isAttachedToWindow() && l0.G(this.f36476p.getMessageObject(), this.f36467f)) {
                    float centerY = (((rectF.centerY() - (Math.min(this.f36474n.centerY(), rectF.centerY()) - AndroidUtilities.dp(150.0f))) * 2.0f) / 0.6f) / AndroidUtilities.density;
                    m3 m3Var = this.f36476p.I0;
                    m3Var.l();
                    o1.j jVar = new o1.j(new ac.a(0.0f));
                    m3Var.f36890b0 = jVar;
                    o1.k kVar = new o1.k(0.0f);
                    kVar.a(0.65f);
                    kVar.b(200.0f);
                    jVar.f18969u = kVar;
                    m3Var.f36890b0.e(0.001f);
                    m3Var.f36890b0.f18960a = Math.max(20.0f, Math.min(36.0f, centerY * 0.04f));
                    m3Var.f36890b0.b(new g3(m3Var, 1));
                    m3Var.f36890b0.h();
                }
            }
        }
        b6 b6Var = this.f36477q;
        b6Var.setPaused(true);
        a6Var.removeView(b6Var);
        l6Var.setPaused(true);
        a6Var.removeView(l6Var);
        a6Var.setClickable(false);
        this.d.setAlpha(this.f36472l);
        ti tiVar = this.f36466c;
        if (tiVar == null) {
            this.f36465b.setTranslationY(0.0f);
        } else {
            tiVar.P1(1.0f);
        }
        ViewGroup viewGroup = this.f36464a;
        if (tiVar != null && z10 && this.f36470j.d()) {
            un unVar = this.e;
            if (unVar.getParentLayout() != null) {
                ViewGroup view = unVar.getParentLayout().getView();
                if (view.isAttachedToWindow()) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    view.getLocationOnScreen(iArr2);
                    viewGroup.removeView(a6Var);
                    a6Var.setTranslationX(iArr[0] - iArr2[0]);
                    a6Var.setTranslationY(iArr[1] - iArr2[1]);
                    view.addView(a6Var, new ViewGroup.LayoutParams(-1, -1));
                    viewGroup = view;
                }
            }
        }
        this.f36468g.run();
        AndroidUtilities.runOnUIThread(new zc1(29, this, viewGroup), 650L);
    }

    public final void b(float f7, float f10, float f11) {
        float dp = AndroidUtilities.dp(60.0f);
        a6 a6Var = this.h;
        float f12 = dp / 2.0f;
        l6 l6Var = this.f36469i;
        l6Var.setTranslationX((f7 - a6Var.getLeft()) - f12);
        l6Var.setTranslationY((f10 - a6Var.getTop()) - f12);
        float f13 = f11 / dp;
        l6Var.setScaleX(f13);
        l6Var.setScaleY(f13);
        float translationX = l6Var.getTranslationX();
        b6 b6Var = this.f36477q;
        b6Var.setTranslationX(translationX);
        b6Var.setTranslationY(l6Var.getTranslationY());
        b6Var.setScaleX(f13);
        b6Var.setScaleY(f13);
    }

    public final RectF c(l3 l3Var) {
        ti tiVar = this.f36466c;
        ViewGroup viewGroup = this.f36464a;
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
        b6 b6Var = this.f36477q;
        if (b6Var == null) {
            return;
        }
        l6 l6Var = this.f36469i;
        float flightYaw = l6Var.getFlightYaw();
        float flightPitch = l6Var.getFlightPitch();
        if (this.f36476p != null) {
            float max = Math.max(0.0f, Math.min(1.0f, (this.f36478r - 0.55f) / 0.45f));
            float D = c3.h0.D(max, 2.0f, 3.0f, max * max);
            flightYaw += ((float) Math.IEEEremainder(this.f36476p.I0.g() - flightYaw, 6.283185307179586d)) * D;
            flightPitch += ((this.f36476p.I0.f36904k.E * 0.14f) - flightPitch) * D;
        }
        b6Var.f49895r = flightYaw;
        b6Var.f49896s = flightPitch;
        b6Var.v = true;
        b6Var.f49897w = true;
    }

    public final void e() {
        l6 l6Var = this.d;
        if (l6Var.isAttachedToWindow()) {
            View rootView = l6Var.getRootView();
            ViewGroup viewGroup = this.f36464a;
            if (rootView == viewGroup.getRootView()) {
                ti tiVar = this.f36466c;
                RectF rectF = this.f36474n;
                if (tiVar == null) {
                    v9.f(l6Var, this.f36465b, viewGroup, rectF);
                    return;
                }
                rectF.set(v9.a(viewGroup, l6Var));
                rectF.offset(0.0f, tiVar.f33049o2 - tiVar.f33082y0);
            }
        }
    }
}

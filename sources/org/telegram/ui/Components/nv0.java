package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public class nv0 extends FrameLayout implements org.telegram.messenger.fs {
    public final ik E;
    public boolean F;
    public int G;
    public int H;
    public ValueAnimator I;
    public float J;
    public boolean K;
    public final org.telegram.ui.d61 f37988a;
    public final q9 f37989b;
    public final RadialProgressView f37990c;
    public final xh.l d;
    public final m80 f37991e;
    public final hi.e f37992f;
    public boolean h;
    public final org.telegram.ui.ActionBar.h6 f37993n;
    public int f37994r;
    public final View f37995s;
    public int f37996w;
    public final int f37997x;
    public boolean f37998y;

    public nv0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i7, boolean z10) {
        if (this.f37996w != i7) {
            int i10 = 0;
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.f37996w = i7;
            int i11 = -(i7 >> 1);
            if (i7 > 0) {
                i10 = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = i11 + i10;
            RadialProgressView radialProgressView = this.f37990c;
            org.telegram.ui.d61 d61Var = this.f37988a;
            if (z10) {
                ViewPropertyAnimator translationY = d61Var.animate().translationY(f10);
                nr nrVar = nr.f37956f;
                translationY.setInterpolator(nrVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f10).setInterpolator(nrVar).setDuration(250L);
                    return;
                }
                return;
            }
            d61Var.setTranslationY(f10);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f10);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i7;
        int i10 = this.f37994r;
        q9 q9Var = this.f37989b;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.f37997x;
                if (i10 == 16) {
                    document = org.telegram.messenger.ri.d0(i11).V("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i11).r0("tg_placeholders_android");
                    if (r02 == null) {
                        r02 = org.telegram.messenger.ri.d0(i11).p0("tg_placeholders_android");
                    }
                    if (r02 != null && (i7 = this.f37994r) >= 0 && i7 < r02.documents.size()) {
                        document2 = r02.documents.get(this.f37994r);
                    }
                    obj = r02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.pc.e(3)) {
                    str = p5.c.v(str, "_firstframe");
                }
                if (document != null) {
                    org.telegram.messenger.lz d = org.telegram.messenger.u5.d(document.thumbs, this.H, 0.2f, false);
                    if (d != null) {
                        d.f25514e = 512;
                        d.f25515f = 512;
                    }
                    q9Var.k(org.telegram.messenger.fc.b(document), str, "tgs", d, obj);
                    int i12 = this.f37994r;
                    if (i12 != 9 && i12 != 0) {
                        q9Var.getImageReceiver().W(2);
                        return;
                    } else {
                        q9Var.getImageReceiver().W(1);
                        return;
                    }
                }
                org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(i11);
                if (obj != null) {
                    z10 = false;
                }
                d02.f1("tg_placeholders_android", false, z10);
                q9Var.getImageReceiver().f();
                return;
            }
        }
        q9Var.setImageDrawable(new oh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
    }

    public final void d(int i7, boolean z10) {
        boolean z11;
        float f10;
        float f11;
        if (i7 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.K != z11) {
            this.K = z11;
            setEnabled(z11);
            ValueAnimator valueAnimator = this.I;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.I = null;
            }
            if (!z10) {
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                this.J = f11;
                a();
            } else {
                float f12 = this.J;
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                this.I = ofFloat;
                ofFloat.setDuration(480L);
                this.I.setInterpolator(nr.h);
                this.I.addUpdateListener(new h60(this, 24));
                this.I.start();
            }
        }
        int visibility = getVisibility();
        q9 q9Var = this.f37989b;
        RadialProgressView radialProgressView = this.f37990c;
        org.telegram.ui.d61 d61Var = this.f37988a;
        View view = this.f37995s;
        if (visibility != i7 && i7 == 0) {
            if (this.h) {
                d61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                d61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new mv0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                q9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i7);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.G = 0;
        d61Var.setAlpha(0.0f);
        d61Var.setScaleX(0.8f);
        d61Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new mv0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        q9Var.getImageReceiver().Q0();
        q9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ks.f25253y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f37990c;
                View view = this.f37995s;
                org.telegram.ui.d61 d61Var = this.f37988a;
                if (z11) {
                    if (z10) {
                        d61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.E.run();
                        return;
                    }
                    d61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new mv0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f37989b.getImageReceiver().P0(false);
                } else if (z10) {
                    d61Var.animate().cancel();
                    d61Var.setAlpha(0.0f);
                    d61Var.setScaleX(0.8f);
                    d61Var.setScaleY(0.8f);
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.setAlpha(1.0f);
                        view.setVisibility(0);
                        return;
                    }
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setScaleX(1.0f);
                    radialProgressView.setScaleY(1.0f);
                } else {
                    d61Var.animate().cancel();
                    d61Var.setAlpha(1.0f);
                    d61Var.setScaleX(1.0f);
                    d61Var.setScaleY(1.0f);
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.setVisibility(8);
                        return;
                    }
                    radialProgressView.setAlpha(0.0f);
                    radialProgressView.setScaleX(0.5f);
                    radialProgressView.setScaleY(0.5f);
                }
            }
        }
    }

    public float getVisibilityFactor() {
        return this.J;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        org.telegram.messenger.ks.f(this.f37997x).c(this, org.telegram.messenger.ks.f25253y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f37997x).n(this, org.telegram.messenger.ks.f25253y0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if ((this.F || this.f37998y) && (i13 = this.G) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.G - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.d61 d61Var = this.f37988a;
            d61Var.setTranslationY(d61Var.getTranslationY() + measuredHeight);
            if (!this.f37998y) {
                d61Var.animate().translationY(0.0f).setInterpolator(nr.f37956f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f37990c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f37998y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(nr.f37956f).setDuration(250L);
                }
            }
        }
        this.G = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.F = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f37998y = z10;
        if (!z10) {
            this.f37988a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f37990c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i7) {
        if (this.f37994r != i7) {
            this.f37994r = i7;
            c();
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        int i7 = 0;
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (Character.isWhitespace(charSequence.charAt(i10))) {
                i7++;
            }
        }
        if (i7 > 4 && charSequence.length() > 20) {
            int length = charSequence.length() >> 1;
            int i11 = 0;
            int i12 = -1;
            for (int i13 = 0; i13 < charSequence.length(); i13++) {
                if (Character.isWhitespace(charSequence.charAt(i13))) {
                    int abs = Math.abs(length - i13);
                    if (i12 == -1 || abs < i11) {
                        i12 = i13;
                        i11 = abs;
                    }
                }
            }
            if (i12 > 0) {
                charSequence = ((Object) charSequence.subSequence(0, i12)) + "\n" + ((Object) charSequence.subSequence(i12 + 1, charSequence.length()));
            }
        }
        this.f37991e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        d(i7, true);
    }

    public nv0(Context context, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f37997x = org.telegram.messenger.j10.f24798t0;
        this.E = new ik(this, 18);
        this.H = org.telegram.ui.ActionBar.m6.f29361c7;
        this.f37993n = h6Var;
        this.f37995s = view;
        this.f37994r = i7;
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(16, context, this);
        this.f37988a = d61Var;
        d61Var.setOrientation(1);
        q9 q9Var = new q9(context);
        this.f37989b = q9Var;
        q9Var.setOnClickListener(new j70(this, 17));
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        lVar.setTag(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.t6.U(lVar, i10, h6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        m80 m80Var = new m80(context, null);
        this.f37991e = m80Var;
        int i11 = org.telegram.ui.ActionBar.m6.f29770y6;
        m80Var.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.t6.U(m80Var, i11, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        m80Var.setTextSize(1, 14.0f);
        m80Var.setGravity(17);
        hi.e g10 = org.telegram.messenger.n10.g(24, context, h6Var, true);
        this.f37992f = g10;
        g10.setVisibility(8);
        d61Var.addView(q9Var, c8.ma.r(117, 117, 1));
        d61Var.addView(lVar, c8.ma.t(-2, -2, 1, 0, 12, 0, 0));
        d61Var.addView(m80Var, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
        d61Var.addView(g10, c8.ma.t(-1, 48, 1, 28, 16, 28, 0));
        addView(d61Var, c8.ma.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
            this.f37990c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, c8.ma.e(-2, -2, 17));
        }
    }
}

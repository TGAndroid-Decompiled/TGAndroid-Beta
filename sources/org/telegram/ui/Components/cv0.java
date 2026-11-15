package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public class cv0 extends FrameLayout implements org.telegram.messenger.is {
    public final zj E;
    public boolean F;
    public int G;
    public int H;
    public ValueAnimator I;
    public float J;
    public boolean K;
    public final org.telegram.ui.z51 f33706a;
    public final i9 f33707b;
    public final RadialProgressView f33708c;
    public final xh.l d;
    public final z70 f33709e;
    public final hi.d f33710f;
    public boolean h;
    public final org.telegram.ui.ActionBar.e6 f33711n;
    public int f33712r;
    public final View f33713s;
    public int f33714w;
    public final int f33715x;
    public boolean f33716y;

    public cv0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i7, boolean z10) {
        if (this.f33714w != i7) {
            int i10 = 0;
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.f33714w = i7;
            int i11 = -(i7 >> 1);
            if (i7 > 0) {
                i10 = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = i11 + i10;
            RadialProgressView radialProgressView = this.f33708c;
            org.telegram.ui.z51 z51Var = this.f33706a;
            if (z10) {
                ViewPropertyAnimator translationY = z51Var.animate().translationY(f10);
                er erVar = er.f34419f;
                translationY.setInterpolator(erVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f10).setInterpolator(erVar).setDuration(250L);
                    return;
                }
                return;
            }
            z51Var.setTranslationY(f10);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f10);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i7;
        int i10 = this.f33712r;
        i9 i9Var = this.f33707b;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.f33715x;
                if (i10 == 16) {
                    document = org.telegram.messenger.si.b0(i11).T("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.si.b0(i11).p0("tg_placeholders_android");
                    if (p02 == null) {
                        p02 = org.telegram.messenger.si.b0(i11).n0("tg_placeholders_android");
                    }
                    if (p02 != null && (i7 = this.f33712r) >= 0 && i7 < p02.documents.size()) {
                        document2 = p02.documents.get(this.f33712r);
                    }
                    obj = p02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.qc.e(3)) {
                    str = r.b.v(str, "_firstframe");
                }
                if (document != null) {
                    org.telegram.messenger.pz d = org.telegram.messenger.t5.d(document.thumbs, this.H, 0.2f, false);
                    if (d != null) {
                        d.f26029e = 512;
                        d.f26030f = 512;
                    }
                    i9Var.k(org.telegram.messenger.gc.b(document), str, "tgs", d, obj);
                    int i12 = this.f33712r;
                    if (i12 != 9 && i12 != 0) {
                        i9Var.getImageReceiver().W(2);
                        return;
                    } else {
                        i9Var.getImageReceiver().W(1);
                        return;
                    }
                }
                org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(i11);
                if (obj != null) {
                    z10 = false;
                }
                b02.c1("tg_placeholders_android", false, z10);
                i9Var.getImageReceiver().f();
                return;
            }
        }
        i9Var.setImageDrawable(new ch0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
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
                this.I.setInterpolator(er.h);
                this.I.addUpdateListener(new f60(this, 22));
                this.I.start();
            }
        }
        int visibility = getVisibility();
        i9 i9Var = this.f33707b;
        RadialProgressView radialProgressView = this.f33708c;
        org.telegram.ui.z51 z51Var = this.f33706a;
        View view = this.f33713s;
        if (visibility != i7 && i7 == 0) {
            if (this.h) {
                z51Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                z51Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new bv0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                i9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i7);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.G = 0;
        z51Var.setAlpha(0.0f);
        z51Var.setScaleX(0.8f);
        z51Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new bv0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        i9Var.getImageReceiver().Q0();
        i9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25608y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f33708c;
                View view = this.f33713s;
                org.telegram.ui.z51 z51Var = this.f33706a;
                if (z11) {
                    if (z10) {
                        z51Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.E.run();
                        return;
                    }
                    z51Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new bv0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f33707b.getImageReceiver().P0(false);
                } else if (z10) {
                    z51Var.animate().cancel();
                    z51Var.setAlpha(0.0f);
                    z51Var.setScaleX(0.8f);
                    z51Var.setScaleY(0.8f);
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
                    z51Var.animate().cancel();
                    z51Var.setAlpha(1.0f);
                    z51Var.setScaleX(1.0f);
                    z51Var.setScaleY(1.0f);
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
        org.telegram.messenger.ns.f(this.f33715x).c(this, org.telegram.messenger.ns.f25608y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ns.f(this.f33715x).n(this, org.telegram.messenger.ns.f25608y0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if ((this.F || this.f33716y) && (i13 = this.G) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.G - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.z51 z51Var = this.f33706a;
            z51Var.setTranslationY(z51Var.getTranslationY() + measuredHeight);
            if (!this.f33716y) {
                z51Var.animate().translationY(0.0f).setInterpolator(er.f34419f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f33708c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f33716y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(er.f34419f).setDuration(250L);
                }
            }
        }
        this.G = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.F = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f33716y = z10;
        if (!z10) {
            this.f33706a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f33708c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i7) {
        if (this.f33712r != i7) {
            this.f33712r = i7;
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
        this.f33709e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        d(i7, true);
    }

    public cv0(Context context, View view, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f33715x = org.telegram.messenger.m10.f24940t0;
        this.E = new zj(this, 18);
        this.H = org.telegram.ui.ActionBar.j6.f28832c7;
        this.f33711n = e6Var;
        this.f33713s = view;
        this.f33712r = i7;
        org.telegram.ui.z51 z51Var = new org.telegram.ui.z51(17, context, this);
        this.f33706a = z51Var;
        z51Var.setOrientation(1);
        i9 i9Var = new i9(context);
        this.f33707b = i9Var;
        i9Var.setOnClickListener(new y60(this, 15));
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        lVar.setTag(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.q6.U(lVar, i10, e6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        z70 z70Var = new z70(context, null);
        this.f33709e = z70Var;
        int i11 = org.telegram.ui.ActionBar.j6.f29241y6;
        z70Var.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.q6.U(z70Var, i11, e6Var);
        org.telegram.ui.ActionBar.q6.G(z70Var, org.telegram.ui.ActionBar.j6.J6, e6Var);
        z70Var.setTextSize(1, 14.0f);
        z70Var.setGravity(17);
        hi.d g10 = org.telegram.messenger.i20.g(24, context, e6Var, true);
        this.f33710f = g10;
        g10.setVisibility(8);
        z51Var.addView(i9Var, c8.ja.r(117, 117, 1));
        z51Var.addView(lVar, c8.ja.t(-2, -2, 1, 0, 12, 0, 0));
        z51Var.addView(z70Var, c8.ja.t(-2, -2, 1, 0, 8, 0, 0));
        z51Var.addView(g10, c8.ja.t(-1, 48, 1, 28, 16, 28, 0));
        addView(z51Var, c8.ja.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, e6Var);
            this.f33708c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, c8.ja.e(-2, -2, 17));
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public class kv0 extends FrameLayout implements org.telegram.messenger.fs {
    public final gk E;
    public boolean F;
    public int G;
    public int H;
    public ValueAnimator I;
    public float J;
    public boolean K;
    public final org.telegram.ui.d61 f36893a;
    public final q9 f36894b;
    public final RadialProgressView f36895c;
    public final xh.l d;
    public final k80 f36896e;
    public final hi.d f36897f;
    public boolean h;
    public final org.telegram.ui.ActionBar.i6 f36898n;
    public int f36899r;
    public final View f36900s;
    public int f36901w;
    public final int f36902x;
    public boolean f36903y;

    public kv0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i7, boolean z10) {
        if (this.f36901w != i7) {
            int i10 = 0;
            if (getVisibility() != 0) {
                z10 = false;
            }
            this.f36901w = i7;
            int i11 = -(i7 >> 1);
            if (i7 > 0) {
                i10 = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = i11 + i10;
            RadialProgressView radialProgressView = this.f36895c;
            org.telegram.ui.d61 d61Var = this.f36893a;
            if (z10) {
                ViewPropertyAnimator translationY = d61Var.animate().translationY(f10);
                lr lrVar = lr.f37208f;
                translationY.setInterpolator(lrVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f10).setInterpolator(lrVar).setDuration(250L);
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
        int i10 = this.f36899r;
        q9 q9Var = this.f36894b;
        if (i10 != 0) {
            boolean z10 = true;
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.f36902x;
                if (i10 == 16) {
                    document = org.telegram.messenger.ri.d0(i11).V("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet r02 = org.telegram.messenger.ri.d0(i11).r0("tg_placeholders_android");
                    if (r02 == null) {
                        r02 = org.telegram.messenger.ri.d0(i11).p0("tg_placeholders_android");
                    }
                    if (r02 != null && (i7 = this.f36899r) >= 0 && i7 < r02.documents.size()) {
                        document2 = r02.documents.get(this.f36899r);
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
                        d.f25486e = 512;
                        d.f25487f = 512;
                    }
                    q9Var.k(org.telegram.messenger.fc.b(document), str, "tgs", d, obj);
                    int i12 = this.f36899r;
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
        q9Var.setImageDrawable(new mh0(2131624320, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
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
                this.I.setInterpolator(lr.h);
                this.I.addUpdateListener(new e60(this, 24));
                this.I.start();
            }
        }
        int visibility = getVisibility();
        q9 q9Var = this.f36894b;
        RadialProgressView radialProgressView = this.f36895c;
        org.telegram.ui.d61 d61Var = this.f36893a;
        View view = this.f36900s;
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
                    view.animate().setListener(new jv0(this, 0)).alpha(0.0f).setDuration(150L).start();
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
            view.animate().setListener(new jv0(this, 1)).alpha(0.0f).setDuration(150L).start();
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
        if (i7 == org.telegram.messenger.ks.f25225y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z10, boolean z11) {
        if (this.h != z10) {
            this.h = z10;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f36895c;
                View view = this.f36900s;
                org.telegram.ui.d61 d61Var = this.f36893a;
                if (z11) {
                    if (z10) {
                        d61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.E.run();
                        return;
                    }
                    d61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new jv0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f36894b.getImageReceiver().P0(false);
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
        org.telegram.messenger.ks.f(this.f36902x).c(this, org.telegram.messenger.ks.f25225y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f36902x).n(this, org.telegram.messenger.ks.f25225y0);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i7, i10, i11, i12);
        if ((this.F || this.f36903y) && (i13 = this.G) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.G - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.d61 d61Var = this.f36893a;
            d61Var.setTranslationY(d61Var.getTranslationY() + measuredHeight);
            if (!this.f36903y) {
                d61Var.animate().translationY(0.0f).setInterpolator(lr.f37208f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f36895c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f36903y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(lr.f37208f).setDuration(250L);
                }
            }
        }
        this.G = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z10) {
        this.F = z10;
    }

    public void setPreventMoving(boolean z10) {
        this.f36903y = z10;
        if (!z10) {
            this.f36893a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f36895c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i7) {
        if (this.f36899r != i7) {
            this.f36899r = i7;
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
        this.f36896e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        d(i7, true);
    }

    public kv0(Context context, View view, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f36902x = org.telegram.messenger.j10.f24770t0;
        this.E = new gk(this, 18);
        this.H = org.telegram.ui.ActionBar.n6.f29377c7;
        this.f36898n = i6Var;
        this.f36900s = view;
        this.f36899r = i7;
        org.telegram.ui.d61 d61Var = new org.telegram.ui.d61(16, context, this);
        this.f36893a = d61Var;
        d61Var.setOrientation(1);
        q9 q9Var = new q9(context);
        this.f36894b = q9Var;
        q9Var.setOnClickListener(new h70(this, 16));
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        lVar.setTag(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.u6.U(lVar, i10, i6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        k80 k80Var = new k80(context, null);
        this.f36896e = k80Var;
        int i11 = org.telegram.ui.ActionBar.n6.f29786y6;
        k80Var.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.u6.U(k80Var, i11, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        k80Var.setTextSize(1, 14.0f);
        k80Var.setGravity(17);
        hi.d g10 = org.telegram.messenger.n10.g(24, context, i6Var, true);
        this.f36897f = g10;
        g10.setVisibility(8);
        d61Var.addView(q9Var, c8.ma.r(117, 117, 1));
        d61Var.addView(lVar, c8.ma.t(-2, -2, 1, 0, 12, 0, 0));
        d61Var.addView(k80Var, c8.ma.t(-2, -2, 1, 0, 8, 0, 0));
        d61Var.addView(g10, c8.ma.t(-1, 48, 1, 28, 16, 28, 0));
        addView(d61Var, c8.ma.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, i6Var);
            this.f36895c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, c8.ma.e(-2, -2, 17));
        }
    }
}

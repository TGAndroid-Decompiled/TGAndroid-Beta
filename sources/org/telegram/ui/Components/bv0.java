package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public class bv0 extends FrameLayout implements org.telegram.messenger.ls {
    public final dt D;
    public boolean E;
    public int F;
    public int G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public final org.telegram.ui.e61 f32365a;
    public final k9 f32366b;
    public final RadialProgressView f32367c;
    public final xh.l d;
    public final w70 f32368e;
    public final fi.d f32369f;
    public boolean h;
    public final org.telegram.ui.ActionBar.h6 f32370n;
    public int f32371r;
    public final View f32372s;
    public int f32373w;
    public final int f32374x;
    public boolean f32375y;

    public bv0(Context context) {
        this(context, null, 1, null);
    }

    public void a() {
        invalidate();
    }

    public final void b(int i7, boolean z9) {
        if (this.f32373w != i7) {
            int i10 = 0;
            if (getVisibility() != 0) {
                z9 = false;
            }
            this.f32373w = i7;
            int i11 = -(i7 >> 1);
            if (i7 > 0) {
                i10 = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = i11 + i10;
            RadialProgressView radialProgressView = this.f32367c;
            org.telegram.ui.e61 e61Var = this.f32365a;
            if (z9) {
                ViewPropertyAnimator translationY = e61Var.animate().translationY(f10);
                wq wqVar = wq.f40046f;
                translationY.setInterpolator(wqVar).setDuration(250L);
                if (radialProgressView != null) {
                    radialProgressView.animate().translationY(f10).setInterpolator(wqVar).setDuration(250L);
                    return;
                }
                return;
            }
            e61Var.setTranslationY(f10);
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(f10);
            }
        }
    }

    public final void c() {
        Object obj;
        TLRPC.Document document;
        int i7;
        int i10 = this.f32371r;
        k9 k9Var = this.f32366b;
        if (i10 != 0) {
            boolean z9 = true;
            if (i10 != 1) {
                TLRPC.Document document2 = null;
                String str = null;
                document2 = null;
                document2 = null;
                int i11 = this.f32374x;
                if (i10 == 16) {
                    document = org.telegram.messenger.ui.b0(i11).T("👍");
                    obj = null;
                } else {
                    TLRPC.TL_messages_stickerSet p02 = org.telegram.messenger.ui.b0(i11).p0("tg_placeholders_android");
                    if (p02 == null) {
                        p02 = org.telegram.messenger.ui.b0(i11).n0("tg_placeholders_android");
                    }
                    if (p02 != null && (i7 = this.f32371r) >= 0 && i7 < p02.documents.size()) {
                        document2 = p02.documents.get(this.f32371r);
                    }
                    obj = p02;
                    document = document2;
                    str = "130_130";
                }
                if (!org.telegram.messenger.sc.e(3)) {
                    str = rf.b.r(str, "_firstframe");
                }
                if (document != null) {
                    org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, this.G, 0.2f, false);
                    if (d != null) {
                        d.f25386e = 512;
                        d.f25387f = 512;
                    }
                    k9Var.k(org.telegram.messenger.hc.b(document), str, "tgs", d, obj);
                    int i12 = this.f32371r;
                    if (i12 != 9 && i12 != 0) {
                        k9Var.getImageReceiver().W(2);
                        return;
                    } else {
                        k9Var.getImageReceiver().W(1);
                        return;
                    }
                }
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(i11);
                if (obj != null) {
                    z9 = false;
                }
                b02.c1("tg_placeholders_android", false, z9);
                k9Var.getImageReceiver().f();
                return;
            }
        }
        k9Var.setImageDrawable(new zg0(2131624319, org.telegram.messenger.g0.L(130.0f), org.telegram.messenger.g0.L(130.0f)));
    }

    public final void d(int i7, boolean z9) {
        boolean z10;
        float f10;
        float f11;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.J != z10) {
            this.J = z10;
            setEnabled(z10);
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.H = null;
            }
            if (!z9) {
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                this.I = f11;
                a();
            } else {
                float f12 = this.I;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
                this.H = ofFloat;
                ofFloat.setDuration(480L);
                this.H.setInterpolator(wq.h);
                this.H.addUpdateListener(new c60(this, 22));
                this.H.start();
            }
        }
        int visibility = getVisibility();
        k9 k9Var = this.f32366b;
        RadialProgressView radialProgressView = this.f32367c;
        org.telegram.ui.e61 e61Var = this.f32365a;
        View view = this.f32372s;
        if (visibility != i7 && i7 == 0) {
            if (this.h) {
                e61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                view.animate().setListener(null).cancel();
                view.setVisibility(0);
                view.setAlpha(1.0f);
            } else {
                e61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                if (view != null) {
                    view.animate().setListener(null).cancel();
                    view.animate().setListener(new av0(this, 0)).alpha(0.0f).setDuration(150L).start();
                } else {
                    radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                }
                k9Var.getImageReceiver().P0(false);
            }
        }
        super.setVisibility(i7);
        if (getVisibility() == 0) {
            c();
            return;
        }
        this.F = 0;
        e61Var.setAlpha(0.0f);
        e61Var.setScaleX(0.8f);
        e61Var.setScaleY(0.8f);
        if (view != null) {
            view.animate().setListener(null).cancel();
            view.animate().setListener(new av0(this, 1)).alpha(0.0f).setDuration(150L).start();
        } else {
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleX(0.5f);
            radialProgressView.setScaleY(0.5f);
        }
        k9Var.getImageReceiver().Q0();
        k9Var.getImageReceiver().f();
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25115y0 && "tg_placeholders_android".equals((String) objArr[0]) && getVisibility() == 0) {
            c();
        }
    }

    public void e(boolean z9, boolean z10) {
        if (this.h != z9) {
            this.h = z9;
            if (getVisibility() == 0) {
                RadialProgressView radialProgressView = this.f32367c;
                View view = this.f32372s;
                org.telegram.ui.e61 e61Var = this.f32365a;
                if (z10) {
                    if (z9) {
                        e61Var.animate().alpha(0.0f).scaleY(0.8f).scaleX(0.8f).setDuration(150L).start();
                        this.D.run();
                        return;
                    }
                    e61Var.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    if (view != null) {
                        view.animate().setListener(null).cancel();
                        view.animate().setListener(new av0(this, 2)).alpha(0.0f).setDuration(150L).start();
                    } else {
                        radialProgressView.animate().alpha(0.0f).scaleY(0.5f).scaleX(0.5f).setDuration(150L).start();
                    }
                    this.f32366b.getImageReceiver().P0(false);
                } else if (z9) {
                    e61Var.animate().cancel();
                    e61Var.setAlpha(0.0f);
                    e61Var.setScaleX(0.8f);
                    e61Var.setScaleY(0.8f);
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
                    e61Var.animate().cancel();
                    e61Var.setAlpha(1.0f);
                    e61Var.setScaleX(1.0f);
                    e61Var.setScaleY(1.0f);
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
        return this.I;
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            c();
        }
        org.telegram.messenger.qs.f(this.f32374x).c(this, org.telegram.messenger.qs.f25115y0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f32374x).n(this, org.telegram.messenger.qs.f25115y0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z9, i7, i10, i11, i12);
        if ((this.E || this.f32375y) && (i13 = this.F) > 0 && i13 != getMeasuredHeight()) {
            float measuredHeight = (this.F - getMeasuredHeight()) / 2.0f;
            org.telegram.ui.e61 e61Var = this.f32365a;
            e61Var.setTranslationY(e61Var.getTranslationY() + measuredHeight);
            if (!this.f32375y) {
                e61Var.animate().translationY(0.0f).setInterpolator(wq.f40046f).setDuration(250L);
            }
            RadialProgressView radialProgressView = this.f32367c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(radialProgressView.getTranslationY() + measuredHeight);
                if (!this.f32375y) {
                    radialProgressView.animate().translationY(0.0f).setInterpolator(wq.f40046f).setDuration(250L);
                }
            }
        }
        this.F = getMeasuredHeight();
    }

    public void setAnimateLayoutChange(boolean z9) {
        this.E = z9;
    }

    public void setPreventMoving(boolean z9) {
        this.f32375y = z9;
        if (!z9) {
            this.f32365a.setTranslationY(0.0f);
            RadialProgressView radialProgressView = this.f32367c;
            if (radialProgressView != null) {
                radialProgressView.setTranslationY(0.0f);
            }
        }
    }

    public void setStickerType(int i7) {
        if (this.f32371r != i7) {
            this.f32371r = i7;
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
        this.f32368e.setText(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        d(i7, true);
    }

    public bv0(Context context, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f32374x = org.telegram.messenger.p10.f24474s0;
        this.D = new dt(this, 15);
        this.G = org.telegram.ui.ActionBar.m6.f27873c7;
        this.f32370n = h6Var;
        this.f32372s = view;
        this.f32371r = i7;
        org.telegram.ui.e61 e61Var = new org.telegram.ui.e61(15, context, this);
        this.f32365a = e61Var;
        e61Var.setOrientation(1);
        k9 k9Var = new k9(context);
        this.f32366b = k9Var;
        k9Var.setOnClickListener(new la0(this, 14));
        xh.l lVar = new xh.l(context);
        this.d = lVar;
        lVar.setTypeface(org.telegram.messenger.g0.o());
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        lVar.setTag(Integer.valueOf(i10));
        org.telegram.ui.ActionBar.t6.U(lVar, i10, h6Var);
        lVar.setTextSize(1, 20.0f);
        lVar.setGravity(17);
        w70 w70Var = new w70(context, null);
        this.f32368e = w70Var;
        int i11 = org.telegram.ui.ActionBar.m6.f28282y6;
        w70Var.setTag(Integer.valueOf(i11));
        org.telegram.ui.ActionBar.t6.U(w70Var, i11, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        w70Var.setTextSize(1, 14.0f);
        w70Var.setGravity(17);
        fi.d h = org.telegram.messenger.k5.h(24, context, h6Var, true);
        this.f32369f = h;
        h.setVisibility(8);
        e61Var.addView(k9Var, c8.ha.r(117, 117, 1));
        e61Var.addView(lVar, c8.ha.t(-2, -2, 1, 0, 12, 0, 0));
        e61Var.addView(w70Var, c8.ha.t(-2, -2, 1, 0, 8, 0, 0));
        e61Var.addView(h, c8.ha.t(-1, 48, 1, 28, 16, 28, 0));
        addView(e61Var, c8.ha.d(-2, -2.0f, 17, 46.0f, 0.0f, 46.0f, 30.0f));
        if (view == null) {
            RadialProgressView radialProgressView = new RadialProgressView(context, h6Var);
            this.f32367c = radialProgressView;
            radialProgressView.setAlpha(0.0f);
            radialProgressView.setScaleY(0.5f);
            radialProgressView.setScaleX(0.5f);
            addView(radialProgressView, c8.ha.e(-2, -2, 17));
        }
    }
}

package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class d10 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.ui.Components.voip.z {
    public int E;
    public final TextPaint F;
    public final org.telegram.ui.xc G;
    public float H;
    public boolean I;
    public org.telegram.ui.Components.voip.a0 J;
    public final org.telegram.ui.Cells.e4 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final e10 Q;
    public final u8 f32892a;
    public TLRPC.User f32893b;
    public TLRPC.Chat f32894c;
    public final k9 d;
    public long f32895e;
    public org.telegram.messenger.s3 f32896f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f32897n;
    public final Paint f32898r;
    public float f32899s;
    public org.telegram.ui.Components.voip.r f32900w;
    public String f32901x;
    public String f32902y;

    public d10(e10 e10Var, Context context) {
        super(context);
        this.Q = e10Var;
        u8 u8Var = new u8((org.telegram.ui.ActionBar.e6) null);
        this.f32892a = u8Var;
        Paint paint = new Paint(1);
        this.f32897n = paint;
        Paint paint2 = new Paint(1);
        this.f32898r = paint2;
        this.f32899s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        u8Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        k9 k9Var = new k9(context);
        this.d = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(k9Var, b8.mf.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27964hh, false));
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27908eh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(2, context, this);
        this.G = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(xcVar, b8.mf.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.H != f10) {
            this.H = f10;
            this.f32898r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.K.e(this, this.J.f39209e);
        f(true);
    }

    public final void b(boolean z10) {
        e10 e10Var = this.Q;
        org.telegram.ui.x30 x30Var = e10Var.f33268r;
        if (!x30Var.J) {
            if (z10 && this.f32900w == null) {
                this.f32900w = org.telegram.ui.Components.voip.r.c(e10Var.h, e10Var.f33267n, null, this, null, this.f32896f, e10Var.f33264c, x30Var);
            } else if (!z10) {
                org.telegram.ui.Components.voip.r rVar = this.f32900w;
                if (rVar != null) {
                    rVar.setSecondaryView(null);
                }
                this.f32900w = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f32901x != null) {
            canvas.save();
            int y9 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.f32899s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f32901x, org.telegram.messenger.g0.L(22.0f) + y9, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y9, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.xc xcVar = this.G;
            if (xcVar.getDrawable() != null) {
                xcVar.getDrawable().setAlpha((int) (getAlpha() * this.f32899s * 255.0f));
                xcVar.draw(canvas);
                xcVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d10.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.r rVar = this.f32900w;
        if (rVar != null && !rVar.f39548b && !rVar.f39568r && rVar.f39575w && rVar.f39546a.d.isFirstFrameRendered() && rVar.getAlpha() == 1.0f && !this.Q.f33268r.f51817x4) {
            d(canvas);
            return;
        }
        if (this.f32899s > 0.0f) {
            float measuredWidth = (1.0f - this.f32899s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.f32897n);
            d(canvas);
        }
        k9 k9Var = this.d;
        float x10 = k9Var.getX() + (k9Var.getMeasuredWidth() / 2);
        float y9 = k9Var.getY() + (k9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.f();
        e4Var.a(canvas, x10, y9, this);
        float L = org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f);
        float f10 = this.f32899s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * L);
        k9Var.setScaleX(e4Var.b() * f11);
        k9Var.setScaleY(e4Var.b() * f11);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(org.telegram.messenger.s3 s3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f10;
        e10 e10Var = this.Q;
        int i3 = e10Var.d;
        this.f32896f = s3Var;
        this.h = groupCallParticipant;
        long j10 = this.f32895e;
        long C1 = org.telegram.messenger.zi.C1(groupCallParticipant.peer);
        this.f32895e = C1;
        int i10 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
        k9 k9Var = this.d;
        u8 u8Var = this.f32892a;
        boolean z11 = true;
        if (i10 > 0) {
            TLRPC.User a22 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).f21919a).a2(Long.valueOf(this.f32895e));
            this.f32893b = a22;
            this.f32894c = null;
            u8Var.r(a22);
            this.f32902y = org.telegram.messenger.l10.j(this.f32893b, true);
            k9Var.getImageReceiver().d = i3;
            k9Var.j(org.telegram.messenger.ac.l(org.telegram.messenger.h10.f22829t0, 1, this.f32893b), "50_50", u8Var, this.f32893b);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).f21919a).M0(Long.valueOf(-this.f32895e));
            this.f32894c = M0;
            this.f32893b = null;
            u8Var.q(M0);
            TLRPC.Chat chat = this.f32894c;
            if (chat != null) {
                this.f32902y = chat.title;
                k9Var.getImageReceiver().d = i3;
                k9Var.j(org.telegram.messenger.ac.a(1, this.f32894c), "50_50", u8Var, this.f32894c);
            }
        }
        if (j10 == this.f32895e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (s3Var == null) {
            if (e10Var.f33267n.d != org.telegram.messenger.zi.C1(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.I = z11;
        } else {
            org.telegram.messenger.s3 s3Var2 = e10Var.f33267n.f39675e;
            if (s3Var2 != null) {
                this.I = s3Var2.equals(s3Var);
            } else {
                this.I = false;
            }
        }
        if (!z10) {
            if (this.I) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            setSelectedProgress(f10);
        }
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var != null) {
            a0Var.h = groupCallParticipant;
            a0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d10.f(boolean):void");
    }

    public k9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f32895e;
    }

    public float getProgressToFullscreen() {
        return this.f32899s;
    }

    public org.telegram.ui.Components.voip.r getRenderer() {
        return this.f32900w;
    }

    public org.telegram.messenger.s3 getVideoParticipant() {
        return this.f32896f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        org.telegram.ui.Components.voip.r rVar = this.f32900w;
        if (rVar != null) {
            rVar.invalidate();
        } else {
            this.Q.f33267n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e10 e10Var = this.Q;
        org.telegram.ui.x30 x30Var = e10Var.f33268r;
        if (e10Var.f33269s && this.f32896f != null) {
            b(true);
        }
        this.L = true;
        if (x30Var.f51762l4.size() > 0) {
            this.J = (org.telegram.ui.Components.voip.a0) org.telegram.ui.Cells.f1.o(1, x30Var.f51762l4);
        } else {
            this.J = new org.telegram.ui.Components.voip.a0();
        }
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        a0Var.f39211g = this;
        a0Var.f39208c = this.G;
        a0Var.c(false);
        org.telegram.ui.Components.voip.a0 a0Var2 = this.J;
        a0Var2.h = this.h;
        a0Var2.c(false);
        f(false);
        boolean z10 = this.J.f39209e;
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.e(this, z10);
        if (!this.J.f39209e) {
            e4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var != null) {
            this.Q.f33268r.f51762l4.add(a0Var);
            org.telegram.ui.Components.voip.a0 a0Var2 = this.J;
            a0Var2.f39208c = null;
            a0Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        if (this.f32902y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.f32902y));
            this.E = min;
            this.f32901x = TextUtils.ellipsize(this.f32902y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.a0 a0Var = this.J;
        if (a0Var != null) {
            a0Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f32899s != f10) {
            this.f32899s = f10;
            int i3 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            Paint paint = this.f32897n;
            k9 k9Var = this.d;
            if (i3 == 0) {
                k9Var.setTranslationY(0.0f);
                k9Var.setScaleX(1.0f);
                k9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.r rVar = this.f32900w;
                if (rVar != null) {
                    rVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((k9Var.getMeasuredHeight() / 2.0f) + k9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float L = f12 + ((org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)) * f11);
            k9Var.setTranslationY((-measuredHeight) * f11);
            k9Var.setScaleX(L);
            k9Var.setScaleY(L);
            paint.setAlpha((int) (f10 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.r rVar2 = this.f32900w;
            if (rVar2 != null) {
                rVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.r rVar) {
        this.f32900w = rVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f32897n.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27964hh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

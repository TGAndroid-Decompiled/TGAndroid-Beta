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
public final class h10 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.voip.m0 {
    public int D;
    public final TextPaint E;
    public final org.telegram.ui.yc F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.n0 I;
    public final org.telegram.ui.Cells.e4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final i10 P;
    public final w8 f34139a;
    public TLRPC.User f34140b;
    public TLRPC.Chat f34141c;
    public final l9 d;
    public long f34142e;
    public org.telegram.messenger.s3 f34143f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f34144n;
    public final Paint f34145r;
    public float f34146s;
    public org.telegram.ui.Components.voip.y f34147w;
    public String f34148x;
    public String f34149y;

    public h10(i10 i10Var, Context context) {
        super(context);
        this.P = i10Var;
        w8 w8Var = new w8((org.telegram.ui.ActionBar.g6) null);
        this.f34139a = w8Var;
        Paint paint = new Paint(1);
        this.f34144n = paint;
        Paint paint2 = new Paint(1);
        this.f34145r = paint2;
        this.f34146s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        w8Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        l9 l9Var = new l9(context);
        this.d = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(l9Var, c8.ha.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27948hh, false));
        paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27894eh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.yc ycVar = new org.telegram.ui.yc(2, context, this);
        this.F = ycVar;
        ycVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(ycVar, c8.ha.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.G != f10) {
            this.G = f10;
            this.f34145r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.f39476e);
        f(true);
    }

    public final void b(boolean z9) {
        i10 i10Var = this.P;
        org.telegram.ui.e40 e40Var = i10Var.f34518r;
        if (!e40Var.I) {
            if (z9 && this.f34147w == null) {
                this.f34147w = org.telegram.ui.Components.voip.y.c(i10Var.h, i10Var.f34517n, null, this, null, this.f34143f, i10Var.f34514c, e40Var);
            } else if (!z9) {
                org.telegram.ui.Components.voip.y yVar = this.f34147w;
                if (yVar != null) {
                    yVar.setSecondaryView(null);
                }
                this.f34147w = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f34148x != null) {
            canvas.save();
            int y10 = org.telegram.messenger.camera.q.y(24.0f, getMeasuredWidth() - this.D, 2);
            int alpha = (int) (getAlpha() * this.f34146s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f34148x, org.telegram.messenger.g0.L(22.0f) + y10, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y10, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.yc ycVar = this.F;
            if (ycVar.getDrawable() != null) {
                ycVar.getDrawable().setAlpha((int) (getAlpha() * this.f34146s * 255.0f));
                ycVar.draw(canvas);
                ycVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h10.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.y yVar = this.f34147w;
        if (yVar != null && !yVar.f39716b && !yVar.f39736r && yVar.f39743w && yVar.f39714a.d.isFirstFrameRendered() && yVar.getAlpha() == 1.0f && !this.P.f34518r.f45285w4) {
            d(canvas);
            return;
        }
        if (this.f34146s > 0.0f) {
            float measuredWidth = (1.0f - this.f34146s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.f34144n);
            d(canvas);
        }
        l9 l9Var = this.d;
        float x10 = l9Var.getX() + (l9Var.getMeasuredWidth() / 2);
        float y10 = l9Var.getY() + (l9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.e4 e4Var = this.J;
        e4Var.f();
        e4Var.a(canvas, x10, y10, this);
        float L = org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f);
        float f10 = this.f34146s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * L);
        l9Var.setScaleX(e4Var.b() * f11);
        l9Var.setScaleY(e4Var.b() * f11);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(org.telegram.messenger.s3 s3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z9;
        float f10;
        i10 i10Var = this.P;
        int i7 = i10Var.d;
        this.f34143f = s3Var;
        this.h = groupCallParticipant;
        long j3 = this.f34142e;
        long B1 = org.telegram.messenger.ij.B1(groupCallParticipant.peer);
        this.f34142e = B1;
        int i10 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        l9 l9Var = this.d;
        w8 w8Var = this.f34139a;
        boolean z10 = true;
        if (i10 > 0) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21765a).a2(Long.valueOf(this.f34142e));
            this.f34140b = a22;
            this.f34141c = null;
            w8Var.r(a22);
            this.f34149y = org.telegram.messenger.t10.j(this.f34140b, true);
            l9Var.getImageReceiver().d = i7;
            l9Var.j(org.telegram.messenger.hc.l(org.telegram.messenger.p10.f24470s0, 1, this.f34140b), "50_50", w8Var, this.f34140b);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(org.telegram.messenger.c.a(i7).f21765a).M0(Long.valueOf(-this.f34142e));
            this.f34141c = M0;
            this.f34140b = null;
            w8Var.q(M0);
            TLRPC.Chat chat = this.f34141c;
            if (chat != null) {
                this.f34149y = chat.title;
                l9Var.getImageReceiver().d = i7;
                l9Var.j(org.telegram.messenger.hc.a(1, this.f34141c), "50_50", w8Var, this.f34141c);
            }
        }
        if (j3 == this.f34142e) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (s3Var == null) {
            if (i10Var.f34517n.d != org.telegram.messenger.ij.B1(groupCallParticipant.peer)) {
                z10 = false;
            }
            this.H = z10;
        } else {
            org.telegram.messenger.s3 s3Var2 = i10Var.f34517n.f39387e;
            if (s3Var2 != null) {
                this.H = s3Var2.equals(s3Var);
            } else {
                this.H = false;
            }
        }
        if (!z9) {
            if (this.H) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            setSelectedProgress(f10);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z9);
            f(z9);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h10.f(boolean):void");
    }

    public l9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f34142e;
    }

    public float getProgressToFullscreen() {
        return this.f34146s;
    }

    public org.telegram.ui.Components.voip.y getRenderer() {
        return this.f34147w;
    }

    public org.telegram.messenger.s3 getVideoParticipant() {
        return this.f34143f;
    }

    @Override
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.y yVar = this.f34147w;
        if (yVar != null) {
            yVar.invalidate();
        } else {
            this.P.f34517n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i10 i10Var = this.P;
        org.telegram.ui.e40 e40Var = i10Var.f34518r;
        if (i10Var.f34519s && this.f34143f != null) {
            b(true);
        }
        this.K = true;
        if (e40Var.f45231k4.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.n0) org.telegram.ui.Cells.f1.k(1, e40Var.f45231k4);
        } else {
            this.I = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        n0Var.f39478g = this;
        n0Var.f39475c = this.F;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.I;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z9 = this.I.f39476e;
        org.telegram.ui.Cells.e4 e4Var = this.J;
        e4Var.e(this, z9);
        if (!this.I.f39476e) {
            e4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var != null) {
            this.P.f34518r.f45231k4.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.I;
            n0Var2.f39475c = null;
            n0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        if (this.f34149y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.f34149y));
            this.D = min;
            this.f34148x = TextUtils.ellipsize(this.f34149y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.I;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f34146s != f10) {
            this.f34146s = f10;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            Paint paint = this.f34144n;
            l9 l9Var = this.d;
            if (i7 == 0) {
                l9Var.setTranslationY(0.0f);
                l9Var.setScaleX(1.0f);
                l9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.y yVar = this.f34147w;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((l9Var.getMeasuredHeight() / 2.0f) + l9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float L = f12 + ((org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)) * f11);
            l9Var.setTranslationY((-measuredHeight) * f11);
            l9Var.setScaleX(L);
            l9Var.setScaleY(L);
            paint.setAlpha((int) (f10 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.y yVar2 = this.f34147w;
            if (yVar2 != null) {
                yVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.y yVar) {
        this.f34147w = yVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f34144n.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27948hh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

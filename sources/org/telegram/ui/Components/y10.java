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
public final class y10 extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.ui.Components.voip.y {
    public int D;
    public final TextPaint E;
    public final org.telegram.ui.hd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.z I;
    public final org.telegram.ui.Cells.g4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final z10 P;
    public final r8 f32596a;
    public TLRPC.User f32597b;
    public TLRPC.Chat f32598c;
    public final g9 d;
    public long e;
    public org.telegram.messenger.v3 f32599f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f32600n;
    public final Paint f32601r;
    public float f32602s;
    public org.telegram.ui.Components.voip.r f32603w;
    public String f32604x;
    public String f32605y;

    public y10(z10 z10Var, Context context) {
        super(context);
        this.P = z10Var;
        r8 r8Var = new r8((org.telegram.ui.ActionBar.p6) null);
        this.f32596a = r8Var;
        Paint paint = new Paint(1);
        this.f32600n = paint;
        Paint paint2 = new Paint(1);
        this.f32601r = paint2;
        this.f32602s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.g4(org.telegram.messenger.i0.L(26.0f), org.telegram.messenger.i0.L(29.0f));
        r8Var.u((int) (org.telegram.messenger.i0.L(18.0f) / 1.15f));
        g9 g9Var = new g9(context);
        this.d = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        addView(g9Var, w7.b6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21011hh, false));
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20957eh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.hd hdVar = new org.telegram.ui.hd(this, context, 2);
        this.F = hdVar;
        hdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(hdVar, w7.b6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f32601r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        z10 z10Var = this.P;
        org.telegram.ui.b50 b50Var = z10Var.f32871r;
        if (!b50Var.I) {
            if (z10 && this.f32603w == null) {
                this.f32603w = org.telegram.ui.Components.voip.r.c(z10Var.h, z10Var.f32870n, null, this, null, this.f32599f, z10Var.f32868c, b50Var);
            } else if (!z10) {
                org.telegram.ui.Components.voip.r rVar = this.f32603w;
                if (rVar != null) {
                    rVar.setSecondaryView(null);
                }
                this.f32603w = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f32604x != null) {
            canvas.save();
            int y3 = org.telegram.messenger.z20.y(24.0f, getMeasuredWidth() - this.D, 2);
            int alpha = (int) (getAlpha() * this.f32602s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f32604x, org.telegram.messenger.i0.L(22.0f) + y3, org.telegram.messenger.i0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y3, org.telegram.messenger.i0.L(53.0f));
            org.telegram.ui.hd hdVar = this.F;
            if (hdVar.getDrawable() != null) {
                hdVar.getDrawable().setAlpha((int) (getAlpha() * this.f32602s * 255.0f));
                hdVar.draw(canvas);
                hdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y10.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.r rVar = this.f32603w;
        if (rVar != null && !rVar.f31602b && !rVar.f31621r && rVar.f31628w && rVar.f31600a.d.isFirstFrameRendered() && rVar.getAlpha() == 1.0f && !this.P.f32871r.f36094w4) {
            d(canvas);
            return;
        }
        if (this.f32602s > 0.0f) {
            float measuredWidth = (1.0f - this.f32602s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(13.0f), this.f32600n);
            d(canvas);
        }
        g9 g9Var = this.d;
        float x10 = g9Var.getX() + (g9Var.getMeasuredWidth() / 2);
        float y3 = g9Var.getY() + (g9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.g4 g4Var = this.J;
        g4Var.f();
        g4Var.a(canvas, x10, y3, this);
        float L = org.telegram.messenger.i0.L(46.0f) / org.telegram.messenger.i0.L(40.0f);
        float f7 = this.f32602s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * L);
        g9Var.setScaleX(g4Var.b() * f10);
        g9Var.setScaleY(g4Var.b() * f10);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(org.telegram.messenger.v3 v3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f7;
        z10 z10Var = this.P;
        int i10 = z10Var.d;
        this.f32599f = v3Var;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long C1 = org.telegram.messenger.jj.C1(groupCallParticipant.peer);
        this.e = C1;
        int i11 = (C1 > 0L ? 1 : (C1 == 0L ? 0 : -1));
        g9 g9Var = this.d;
        r8 r8Var = this.f32596a;
        boolean z11 = true;
        if (i11 > 0) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).f14863a).Z1(Long.valueOf(this.e));
            this.f32597b = Z1;
            this.f32598c = null;
            r8Var.r(Z1);
            this.f32605y = org.telegram.messenger.h20.j(this.f32597b, true);
            g9Var.getImageReceiver().d = i10;
            g9Var.j(org.telegram.messenger.ic.l(org.telegram.messenger.d20.f15147s0, 1, this.f32597b), "50_50", r8Var, this.f32597b);
        } else {
            TLRPC.Chat L0 = org.telegram.messenger.vp.r1(org.telegram.messenger.c.a(i10).f14863a).L0(Long.valueOf(-this.e));
            this.f32598c = L0;
            this.f32597b = null;
            r8Var.q(L0);
            TLRPC.Chat chat = this.f32598c;
            if (chat != null) {
                this.f32605y = chat.title;
                g9Var.getImageReceiver().d = i10;
                g9Var.j(org.telegram.messenger.ic.a(1, this.f32598c), "50_50", r8Var, this.f32598c);
            }
        }
        if (j10 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (v3Var == null) {
            if (z10Var.f32870n.d != org.telegram.messenger.jj.C1(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            org.telegram.messenger.v3 v3Var2 = z10Var.f32870n.e;
            if (v3Var2 != null) {
                this.H = v3Var2.equals(v3Var);
            } else {
                this.H = false;
            }
        }
        if (!z10) {
            if (this.H) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            setSelectedProgress(f7);
        }
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar != null) {
            zVar.h = groupCallParticipant;
            zVar.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y10.f(boolean):void");
    }

    public g9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.f32602s;
    }

    public org.telegram.ui.Components.voip.r getRenderer() {
        return this.f32603w;
    }

    public org.telegram.messenger.v3 getVideoParticipant() {
        return this.f32599f;
    }

    @Override
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.r rVar = this.f32603w;
        if (rVar != null) {
            rVar.invalidate();
        } else {
            this.P.f32870n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z10 z10Var = this.P;
        org.telegram.ui.b50 b50Var = z10Var.f32871r;
        if (z10Var.f32872s && this.f32599f != null) {
            b(true);
        }
        this.K = true;
        if (b50Var.f36039k4.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.z) i0.a.v(1, b50Var.f36039k4);
        } else {
            this.I = new org.telegram.ui.Components.voip.z();
        }
        org.telegram.ui.Components.voip.z zVar = this.I;
        zVar.f31787g = this;
        zVar.f31785c = this.F;
        zVar.c(false);
        org.telegram.ui.Components.voip.z zVar2 = this.I;
        zVar2.h = this.h;
        zVar2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.g4 g4Var = this.J;
        g4Var.e(this, z10);
        if (!this.I.e) {
            g4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar != null) {
            this.P.f32871r.f36039k4.add(zVar);
            org.telegram.ui.Components.voip.z zVar2 = this.I;
            zVar2.f31785c = null;
            zVar2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        if (this.f32605y != null) {
            int min = (int) Math.min(org.telegram.messenger.i0.L(46.0f), textPaint.measureText(this.f32605y));
            this.D = min;
            this.f32604x = TextUtils.ellipsize(this.f32605y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.z zVar = this.I;
        if (zVar != null) {
            zVar.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f7) {
        if (this.f32602s != f7) {
            this.f32602s = f7;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            Paint paint = this.f32600n;
            g9 g9Var = this.d;
            if (i10 == 0) {
                g9Var.setTranslationY(0.0f);
                g9Var.setScaleX(1.0f);
                g9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.r rVar = this.f32603w;
                if (rVar != null) {
                    rVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((g9Var.getMeasuredHeight() / 2.0f) + g9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f7;
            float f11 = 1.0f * f7;
            float L = f11 + ((org.telegram.messenger.i0.L(46.0f) / org.telegram.messenger.i0.L(40.0f)) * f10);
            g9Var.setTranslationY((-measuredHeight) * f10);
            g9Var.setScaleX(L);
            g9Var.setScaleY(L);
            paint.setAlpha((int) (f7 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.r rVar2 = this.f32603w;
            if (rVar2 != null) {
                rVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.r rVar) {
        this.f32603w = rVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f32600n.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21011hh, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

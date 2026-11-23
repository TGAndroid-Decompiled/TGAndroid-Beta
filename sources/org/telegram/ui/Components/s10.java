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
public final class s10 extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.ui.Components.voip.n0 {
    public int E;
    public final TextPaint F;
    public final org.telegram.ui.xc G;
    public float H;
    public boolean I;
    public org.telegram.ui.Components.voip.o0 J;
    public final org.telegram.ui.Cells.f4 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final t10 Q;
    public final a9 f39453a;
    public TLRPC.User f39454b;
    public TLRPC.Chat f39455c;
    public final p9 d;
    public long f39456e;
    public org.telegram.messenger.u3 f39457f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f39458n;
    public final Paint f39459r;
    public float f39460s;
    public org.telegram.ui.Components.voip.z f39461w;
    public String f39462x;
    public String f39463y;

    public s10(t10 t10Var, Context context) {
        super(context);
        this.Q = t10Var;
        a9 a9Var = new a9((org.telegram.ui.ActionBar.i6) null);
        this.f39453a = a9Var;
        Paint paint = new Paint(1);
        this.f39458n = paint;
        Paint paint2 = new Paint(1);
        this.f39459r = paint2;
        this.f39460s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new org.telegram.ui.Cells.f4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        a9Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(p9Var, c8.na.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29590kh, false));
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29534hh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(2, context, this);
        this.G = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(xcVar, c8.na.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.H != f10) {
            this.H = f10;
            this.f39459r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.K.e(this, this.J.f41095e);
        f(true);
    }

    public final void b(boolean z10) {
        t10 t10Var = this.Q;
        org.telegram.ui.e40 e40Var = t10Var.f39779r;
        if (!e40Var.J) {
            if (z10 && this.f39461w == null) {
                this.f39461w = org.telegram.ui.Components.voip.z.c(t10Var.h, t10Var.f39778n, null, this, null, this.f39457f, t10Var.f39775c, e40Var);
            } else if (!z10) {
                org.telegram.ui.Components.voip.z zVar = this.f39461w;
                if (zVar != null) {
                    zVar.setSecondaryView(null);
                }
                this.f39461w = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f39462x != null) {
            canvas.save();
            int z10 = org.telegram.messenger.m10.z(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.f39460s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f39462x, org.telegram.messenger.g0.L(22.0f) + z10, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(z10, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.xc xcVar = this.G;
            if (xcVar.getDrawable() != null) {
                xcVar.getDrawable().setAlpha((int) (getAlpha() * this.f39460s * 255.0f));
                xcVar.draw(canvas);
                xcVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s10.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.z zVar = this.f39461w;
        if (zVar != null && !zVar.f41359b && !zVar.f41379r && zVar.f41386w && zVar.f41357a.d.isFirstFrameRendered() && zVar.getAlpha() == 1.0f && !this.Q.f39779r.E4) {
            d(canvas);
            return;
        }
        if (this.f39460s > 0.0f) {
            float measuredWidth = (1.0f - this.f39460s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.f39458n);
            d(canvas);
        }
        p9 p9Var = this.d;
        float x10 = p9Var.getX() + (p9Var.getMeasuredWidth() / 2);
        float y10 = p9Var.getY() + (p9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.f4 f4Var = this.K;
        f4Var.f();
        f4Var.a(canvas, x10, y10, this);
        float L = org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f);
        float f10 = this.f39460s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * L);
        p9Var.setScaleX(f4Var.b() * f11);
        p9Var.setScaleY(f4Var.b() * f11);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(org.telegram.messenger.u3 u3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f10;
        t10 t10Var = this.Q;
        int i7 = t10Var.d;
        this.f39457f = u3Var;
        this.h = groupCallParticipant;
        long j3 = this.f39456e;
        long B1 = org.telegram.messenger.fj.B1(groupCallParticipant.peer);
        this.f39456e = B1;
        int i10 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        p9 p9Var = this.d;
        a9 a9Var = this.f39453a;
        boolean z11 = true;
        if (i10 > 0) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).f23343a).c2(Long.valueOf(this.f39456e));
            this.f39454b = c22;
            this.f39455c = null;
            a9Var.r(c22);
            this.f39463y = org.telegram.messenger.n10.k(this.f39454b, true);
            p9Var.getImageReceiver().d = i7;
            p9Var.j(org.telegram.messenger.fc.l(org.telegram.messenger.i10.f24637t0, 1, this.f39454b), "50_50", a9Var, this.f39454b);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(org.telegram.messenger.c.a(i7).f23343a).O0(Long.valueOf(-this.f39456e));
            this.f39455c = O0;
            this.f39454b = null;
            a9Var.q(O0);
            TLRPC.Chat chat = this.f39455c;
            if (chat != null) {
                this.f39463y = chat.title;
                p9Var.getImageReceiver().d = i7;
                p9Var.j(org.telegram.messenger.fc.a(1, this.f39455c), "50_50", a9Var, this.f39455c);
            }
        }
        if (j3 == this.f39456e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u3Var == null) {
            if (t10Var.f39778n.d != org.telegram.messenger.fj.B1(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.I = z11;
        } else {
            org.telegram.messenger.u3 u3Var2 = t10Var.f39778n.f41008e;
            if (u3Var2 != null) {
                this.I = u3Var2.equals(u3Var);
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
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        if (o0Var != null) {
            o0Var.h = groupCallParticipant;
            o0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s10.f(boolean):void");
    }

    public p9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f39456e;
    }

    public float getProgressToFullscreen() {
        return this.f39460s;
    }

    public org.telegram.ui.Components.voip.z getRenderer() {
        return this.f39461w;
    }

    public org.telegram.messenger.u3 getVideoParticipant() {
        return this.f39457f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        org.telegram.ui.Components.voip.z zVar = this.f39461w;
        if (zVar != null) {
            zVar.invalidate();
        } else {
            this.Q.f39778n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t10 t10Var = this.Q;
        org.telegram.ui.e40 e40Var = t10Var.f39779r;
        if (t10Var.f39780s && this.f39457f != null) {
            b(true);
        }
        this.L = true;
        if (e40Var.f47398s4.size() > 0) {
            this.J = (org.telegram.ui.Components.voip.o0) p5.c.g(1, e40Var.f47398s4);
        } else {
            this.J = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        o0Var.f41097g = this;
        o0Var.f41094c = this.G;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.J;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.J.f41095e;
        org.telegram.ui.Cells.f4 f4Var = this.K;
        f4Var.e(this, z10);
        if (!this.J.f41095e) {
            f4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        if (o0Var != null) {
            this.Q.f39779r.f47398s4.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.J;
            o0Var2.f41094c = null;
            o0Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        if (this.f39463y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.f39463y));
            this.E = min;
            this.f39462x = TextUtils.ellipsize(this.f39463y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        if (o0Var != null) {
            o0Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f39460s != f10) {
            this.f39460s = f10;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            Paint paint = this.f39458n;
            p9 p9Var = this.d;
            if (i7 == 0) {
                p9Var.setTranslationY(0.0f);
                p9Var.setScaleX(1.0f);
                p9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.z zVar = this.f39461w;
                if (zVar != null) {
                    zVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((p9Var.getMeasuredHeight() / 2.0f) + p9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float L = f12 + ((org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)) * f11);
            p9Var.setTranslationY((-measuredHeight) * f11);
            p9Var.setScaleX(L);
            p9Var.setScaleY(L);
            paint.setAlpha((int) (f10 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.z zVar2 = this.f39461w;
            if (zVar2 != null) {
                zVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.z zVar) {
        this.f39461w = zVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f39458n.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29590kh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

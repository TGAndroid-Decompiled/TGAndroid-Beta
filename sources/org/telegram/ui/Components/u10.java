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
public final class u10 extends FrameLayout implements org.telegram.ui.ActionBar.b6, org.telegram.ui.Components.voip.m0 {
    public int E;
    public final TextPaint F;
    public final org.telegram.ui.xc G;
    public float H;
    public boolean I;
    public org.telegram.ui.Components.voip.n0 J;
    public final org.telegram.ui.Cells.f4 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final v10 Q;
    public final b9 f40192a;
    public TLRPC.User f40193b;
    public TLRPC.Chat f40194c;
    public final q9 d;
    public long f40195e;
    public org.telegram.messenger.u3 f40196f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f40197n;
    public final Paint f40198r;
    public float f40199s;
    public org.telegram.ui.Components.voip.y f40200w;
    public String f40201x;
    public String f40202y;

    public u10(v10 v10Var, Context context) {
        super(context);
        this.Q = v10Var;
        b9 b9Var = new b9((org.telegram.ui.ActionBar.h6) null);
        this.f40192a = b9Var;
        Paint paint = new Paint(1);
        this.f40197n = paint;
        Paint paint2 = new Paint(1);
        this.f40198r = paint2;
        this.f40199s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new org.telegram.ui.Cells.f4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        b9Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        q9 q9Var = new q9(context);
        this.d = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(q9Var, c8.ma.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29520kh, false));
        paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29464hh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(2, context, this);
        this.G = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(xcVar, c8.ma.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.H != f10) {
            this.H = f10;
            this.f40198r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.K.e(this, this.J.f41199e);
        f(true);
    }

    public final void b(boolean z10) {
        v10 v10Var = this.Q;
        org.telegram.ui.f40 f40Var = v10Var.f40630r;
        if (!f40Var.J) {
            if (z10 && this.f40200w == null) {
                this.f40200w = org.telegram.ui.Components.voip.y.c(v10Var.h, v10Var.f40629n, null, this, null, this.f40196f, v10Var.f40626c, f40Var);
            } else if (!z10) {
                org.telegram.ui.Components.voip.y yVar = this.f40200w;
                if (yVar != null) {
                    yVar.setSecondaryView(null);
                }
                this.f40200w = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f40201x != null) {
            canvas.save();
            int z10 = org.telegram.messenger.o10.z(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.f40199s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f40201x, org.telegram.messenger.g0.L(22.0f) + z10, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(z10, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.xc xcVar = this.G;
            if (xcVar.getDrawable() != null) {
                xcVar.getDrawable().setAlpha((int) (getAlpha() * this.f40199s * 255.0f));
                xcVar.draw(canvas);
                xcVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u10.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.y yVar = this.f40200w;
        if (yVar != null && !yVar.f41463b && !yVar.f41483r && yVar.f41490w && yVar.f41461a.d.isFirstFrameRendered() && yVar.getAlpha() == 1.0f && !this.Q.f40630r.E4) {
            d(canvas);
            return;
        }
        if (this.f40199s > 0.0f) {
            float measuredWidth = (1.0f - this.f40199s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.f40197n);
            d(canvas);
        }
        q9 q9Var = this.d;
        float x10 = q9Var.getX() + (q9Var.getMeasuredWidth() / 2);
        float y10 = q9Var.getY() + (q9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.f4 f4Var = this.K;
        f4Var.f();
        f4Var.a(canvas, x10, y10, this);
        float L = org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f);
        float f10 = this.f40199s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * L);
        q9Var.setScaleX(f4Var.b() * f11);
        q9Var.setScaleY(f4Var.b() * f11);
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
        v10 v10Var = this.Q;
        int i7 = v10Var.d;
        this.f40196f = u3Var;
        this.h = groupCallParticipant;
        long j3 = this.f40195e;
        long B1 = org.telegram.messenger.gj.B1(groupCallParticipant.peer);
        this.f40195e = B1;
        int i10 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        q9 q9Var = this.d;
        b9 b9Var = this.f40192a;
        boolean z11 = true;
        if (i10 > 0) {
            TLRPC.User c22 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i7).f23202a).c2(Long.valueOf(this.f40195e));
            this.f40193b = c22;
            this.f40194c = null;
            b9Var.r(c22);
            this.f40202y = org.telegram.messenger.p10.k(this.f40193b, true);
            q9Var.getImageReceiver().d = i7;
            q9Var.j(org.telegram.messenger.gc.l(org.telegram.messenger.k10.f24968t0, 1, this.f40193b), "50_50", b9Var, this.f40193b);
        } else {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(org.telegram.messenger.c.a(i7).f23202a).O0(Long.valueOf(-this.f40195e));
            this.f40194c = O0;
            this.f40193b = null;
            b9Var.q(O0);
            TLRPC.Chat chat = this.f40194c;
            if (chat != null) {
                this.f40202y = chat.title;
                q9Var.getImageReceiver().d = i7;
                q9Var.j(org.telegram.messenger.gc.a(1, this.f40194c), "50_50", b9Var, this.f40194c);
            }
        }
        if (j3 == this.f40195e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (u3Var == null) {
            if (v10Var.f40629n.d != org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.I = z11;
        } else {
            org.telegram.messenger.u3 u3Var2 = v10Var.f40629n.f41114e;
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
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u10.f(boolean):void");
    }

    public q9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f40195e;
    }

    public float getProgressToFullscreen() {
        return this.f40199s;
    }

    public org.telegram.ui.Components.voip.y getRenderer() {
        return this.f40200w;
    }

    public org.telegram.messenger.u3 getVideoParticipant() {
        return this.f40196f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        org.telegram.ui.Components.voip.y yVar = this.f40200w;
        if (yVar != null) {
            yVar.invalidate();
        } else {
            this.Q.f40629n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v10 v10Var = this.Q;
        org.telegram.ui.f40 f40Var = v10Var.f40630r;
        if (v10Var.f40631s && this.f40196f != null) {
            b(true);
        }
        this.L = true;
        if (f40Var.f47548s4.size() > 0) {
            this.J = (org.telegram.ui.Components.voip.n0) p5.c.g(1, f40Var.f47548s4);
        } else {
            this.J = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        n0Var.f41201g = this;
        n0Var.f41198c = this.G;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.J;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z10 = this.J.f41199e;
        org.telegram.ui.Cells.f4 f4Var = this.K;
        f4Var.e(this, z10);
        if (!this.J.f41199e) {
            f4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var != null) {
            this.Q.f40630r.f47548s4.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.J;
            n0Var2.f41198c = null;
            n0Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        if (this.f40202y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.f40202y));
            this.E = min;
            this.f40201x = TextUtils.ellipsize(this.f40202y, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.J;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.K.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f40199s != f10) {
            this.f40199s = f10;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            Paint paint = this.f40197n;
            q9 q9Var = this.d;
            if (i7 == 0) {
                q9Var.setTranslationY(0.0f);
                q9Var.setScaleX(1.0f);
                q9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.y yVar = this.f40200w;
                if (yVar != null) {
                    yVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((q9Var.getMeasuredHeight() / 2.0f) + q9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float L = f12 + ((org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)) * f11);
            q9Var.setTranslationY((-measuredHeight) * f11);
            q9Var.setScaleX(L);
            q9Var.setScaleY(L);
            paint.setAlpha((int) (f10 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.y yVar2 = this.f40200w;
            if (yVar2 != null) {
                yVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.y yVar) {
        this.f40200w = yVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f40197n.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29520kh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public final class k10 extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.ui.Components.voip.n0 {
    public int E;
    public final TextPaint F;
    public final org.telegram.ui.xc G;
    public float H;
    public boolean I;
    public org.telegram.ui.Components.voip.o0 J;
    public final org.telegram.ui.Cells.e4 K;
    public boolean L;
    public int M;
    public int N;
    public ValueAnimator O;
    public boolean P;
    public final l10 Q;
    public final t8 f36215a;
    public TLRPC.User f36216b;
    public TLRPC.Chat f36217c;
    public final i9 d;
    public long f36218e;
    public org.telegram.messenger.s3 f36219f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f36220n;
    public final Paint f36221r;
    public float f36222s;
    public org.telegram.ui.Components.voip.z f36223w;
    public String f36224x;
    public String f36225y;

    public k10(l10 l10Var, Context context) {
        super(context);
        this.Q = l10Var;
        t8 t8Var = new t8((org.telegram.ui.ActionBar.e6) null);
        this.f36215a = t8Var;
        Paint paint = new Paint(1);
        this.f36220n = paint;
        Paint paint2 = new Paint(1);
        this.f36221r = paint2;
        this.f36222s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.K = new org.telegram.ui.Cells.e4(org.telegram.messenger.g0.L(26.0f), org.telegram.messenger.g0.L(29.0f));
        t8Var.u((int) (org.telegram.messenger.g0.L(18.0f) / 1.15f));
        i9 i9Var = new i9(context);
        this.d = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        addView(i9Var, c8.ja.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28988kh, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28932hh, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.xc xcVar = new org.telegram.ui.xc(2, context, this);
        this.G = xcVar;
        xcVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(xcVar, c8.ja.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.H != f10) {
            this.H = f10;
            this.f36221r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.K.e(this, this.J.f40818e);
        f(true);
    }

    public final void b(boolean z10) {
        l10 l10Var = this.Q;
        org.telegram.ui.c40 c40Var = l10Var.f36686r;
        if (!c40Var.J) {
            if (z10 && this.f36223w == null) {
                this.f36223w = org.telegram.ui.Components.voip.z.c(l10Var.h, l10Var.f36685n, null, this, null, this.f36219f, l10Var.f36682c, c40Var);
            } else if (!z10) {
                org.telegram.ui.Components.voip.z zVar = this.f36223w;
                if (zVar != null) {
                    zVar.setSecondaryView(null);
                }
                this.f36223w = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f36224x != null) {
            canvas.save();
            int y10 = org.telegram.messenger.i20.y(24.0f, getMeasuredWidth() - this.E, 2);
            int alpha = (int) (getAlpha() * this.f36222s * 255.0f);
            TextPaint textPaint = this.F;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f36224x, org.telegram.messenger.g0.L(22.0f) + y10, org.telegram.messenger.g0.L(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y10, org.telegram.messenger.g0.L(53.0f));
            org.telegram.ui.xc xcVar = this.G;
            if (xcVar.getDrawable() != null) {
                xcVar.getDrawable().setAlpha((int) (getAlpha() * this.f36222s * 255.0f));
                xcVar.draw(canvas);
                xcVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k10.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.z zVar = this.f36223w;
        if (zVar != null && !zVar.f41083b && !zVar.f41103r && zVar.f41110w && zVar.f41081a.d.isFirstFrameRendered() && zVar.getAlpha() == 1.0f && !this.Q.f36686r.E4) {
            d(canvas);
            return;
        }
        if (this.f36222s > 0.0f) {
            float measuredWidth = (1.0f - this.f36222s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), this.f36220n);
            d(canvas);
        }
        i9 i9Var = this.d;
        float x10 = i9Var.getX() + (i9Var.getMeasuredWidth() / 2);
        float y10 = i9Var.getY() + (i9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.f();
        e4Var.a(canvas, x10, y10, this);
        float L = org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f);
        float f10 = this.f36222s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * L);
        i9Var.setScaleX(e4Var.b() * f11);
        i9Var.setScaleY(e4Var.b() * f11);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.G) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(org.telegram.messenger.s3 s3Var, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f10;
        l10 l10Var = this.Q;
        int i7 = l10Var.d;
        this.f36219f = s3Var;
        this.h = groupCallParticipant;
        long j3 = this.f36218e;
        long B1 = org.telegram.messenger.gj.B1(groupCallParticipant.peer);
        this.f36218e = B1;
        int i10 = (B1 > 0L ? 1 : (B1 == 0L ? 0 : -1));
        i9 i9Var = this.d;
        t8 t8Var = this.f36215a;
        boolean z11 = true;
        if (i10 > 0) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i7).f22782a).a2(Long.valueOf(this.f36218e));
            this.f36216b = a22;
            this.f36217c = null;
            t8Var.r(a22);
            this.f36225y = org.telegram.messenger.q10.j(this.f36216b, true);
            i9Var.getImageReceiver().d = i7;
            i9Var.j(org.telegram.messenger.gc.l(org.telegram.messenger.m10.f24940t0, 1, this.f36216b), "50_50", t8Var, this.f36216b);
        } else {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(org.telegram.messenger.c.a(i7).f22782a).M0(Long.valueOf(-this.f36218e));
            this.f36217c = M0;
            this.f36216b = null;
            t8Var.q(M0);
            TLRPC.Chat chat = this.f36217c;
            if (chat != null) {
                this.f36225y = chat.title;
                i9Var.getImageReceiver().d = i7;
                i9Var.j(org.telegram.messenger.gc.a(1, this.f36217c), "50_50", t8Var, this.f36217c);
            }
        }
        if (j3 == this.f36218e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (s3Var == null) {
            if (l10Var.f36685n.d != org.telegram.messenger.gj.B1(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.I = z11;
        } else {
            org.telegram.messenger.s3 s3Var2 = l10Var.f36685n.f40732e;
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
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        if (o0Var != null) {
            o0Var.h = groupCallParticipant;
            o0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.k10.f(boolean):void");
    }

    public i9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f36218e;
    }

    public float getProgressToFullscreen() {
        return this.f36222s;
    }

    public org.telegram.ui.Components.voip.z getRenderer() {
        return this.f36223w;
    }

    public org.telegram.messenger.s3 getVideoParticipant() {
        return this.f36219f;
    }

    @Override
    public final void invalidate() {
        if (this.P) {
            return;
        }
        this.P = true;
        super.invalidate();
        org.telegram.ui.Components.voip.z zVar = this.f36223w;
        if (zVar != null) {
            zVar.invalidate();
        } else {
            this.Q.f36685n.invalidate();
        }
        this.P = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        l10 l10Var = this.Q;
        org.telegram.ui.c40 c40Var = l10Var.f36686r;
        if (l10Var.f36687s && this.f36219f != null) {
            b(true);
        }
        this.L = true;
        if (c40Var.f45962s4.size() > 0) {
            this.J = (org.telegram.ui.Components.voip.o0) r.b.g(1, c40Var.f45962s4);
        } else {
            this.J = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        o0Var.f40820g = this;
        o0Var.f40817c = this.G;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.J;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.J.f40818e;
        org.telegram.ui.Cells.e4 e4Var = this.K;
        e4Var.e(this, z10);
        if (!this.J.f40818e) {
            e4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.L = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.J;
        if (o0Var != null) {
            this.Q.f36686r.f45962s4.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.J;
            o0Var2.f40817c = null;
            o0Var2.c(false);
            this.J.b();
        }
        this.J = null;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextPaint textPaint = this.F;
        textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
        if (this.f36225y != null) {
            int min = (int) Math.min(org.telegram.messenger.g0.L(46.0f), textPaint.measureText(this.f36225y));
            this.E = min;
            this.f36224x = TextUtils.ellipsize(this.f36225y, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f36222s != f10) {
            this.f36222s = f10;
            int i7 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
            Paint paint = this.f36220n;
            i9 i9Var = this.d;
            if (i7 == 0) {
                i9Var.setTranslationY(0.0f);
                i9Var.setScaleX(1.0f);
                i9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.z zVar = this.f36223w;
                if (zVar != null) {
                    zVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((i9Var.getMeasuredHeight() / 2.0f) + i9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float L = f12 + ((org.telegram.messenger.g0.L(46.0f) / org.telegram.messenger.g0.L(40.0f)) * f11);
            i9Var.setTranslationY((-measuredHeight) * f11);
            i9Var.setScaleX(L);
            i9Var.setScaleY(L);
            paint.setAlpha((int) (f10 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.z zVar2 = this.f36223w;
            if (zVar2 != null) {
                zVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.z zVar) {
        this.f36223w = zVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f36220n.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28988kh, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class vj0 extends View {
    public final RectF A;
    public final RectF B;
    public final Path C;
    public final RectF D;
    public final RectF E;
    public final RectF F;
    public int G;
    public byte[] H;
    public final Path I;
    public final y5 J;
    public final y5 K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public float R;
    public final org.telegram.ui.ActionBar.b6 f33389a;
    public final Paint f33390b;
    public final Paint f33391c;
    public final Paint d;
    public final Paint f33392e;
    public final qf0 f33393f;
    public final i6 h;
    public k61 f33394n;
    public float f33395r;
    public float f33396s;
    public float v;
    public boolean f33397w;
    public final ib0 f33398x;
    public final RectF f33399y;

    public vj0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f33390b = new Paint(1);
        this.f33391c = new Paint(1);
        this.d = new Paint(1);
        this.f33392e = new Paint(1);
        this.f33396s = 0.0f;
        this.v = 1.0f;
        this.f33397w = false;
        this.f33398x = new ib0(this, 18);
        this.f33399y = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Path();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.I = new Path();
        gr grVar = gr.h;
        this.J = new y5(this, 0L, 340L, grVar);
        this.K = new y5(this, 0L, 340L, grVar);
        this.L = true;
        this.f33389a = b6Var;
        qf0 qf0Var = new qf0(12);
        this.f33393f = qf0Var;
        qf0Var.f31935f = this;
        qf0Var.setCallback(this);
        i6 i6Var = new i6(false, false, false, false);
        this.h = i6Var;
        i6Var.k(0.5f, 200L, grVar);
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        Paint paint2;
        i6 i6Var;
        qf0 qf0Var;
        Paint paint3;
        int i9;
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        float f10;
        float clamp;
        boolean z10;
        int i13 = org.telegram.ui.ActionBar.f6.f23135kf;
        org.telegram.ui.ActionBar.b6 b6Var = this.f33389a;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i13, b6Var);
        Paint paint4 = this.f33390b;
        paint4.setColor(v02);
        int v03 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23153lf, b6Var);
        Paint paint5 = this.f33391c;
        paint5.setColor(v03);
        int i14 = org.telegram.ui.ActionBar.f6.f23082hf;
        int v04 = org.telegram.ui.ActionBar.f6.v0(i14, b6Var);
        i6 i6Var2 = this.h;
        i6Var2.r(v04);
        int v05 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23045ff, b6Var);
        qf0 qf0Var2 = this.f33393f;
        qf0Var2.f31931a.setColor(v05);
        int v06 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23064gf, b6Var);
        Paint paint6 = this.d;
        paint6.setColor(v06);
        int v07 = org.telegram.ui.ActionBar.f6.v0(i14, b6Var);
        Paint paint7 = this.f33392e;
        paint7.setColor(v07);
        int lerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.f33396s));
        int lerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i15 = this.G;
        Path path = this.I;
        if (i15 == measuredWidth) {
            paint = paint5;
            paint2 = paint4;
            i6Var = i6Var2;
            qf0Var = qf0Var2;
            paint3 = paint7;
            i9 = lerp2;
        } else {
            int dp = measuredWidth / AndroidUtilities.dp(3.0f);
            int dp2 = AndroidUtilities.dp(2.0f);
            paint = paint5;
            int dp3 = AndroidUtilities.dp(12.0f);
            paint2 = paint4;
            i6Var = i6Var2;
            qf0Var = qf0Var2;
            byte b12 = Byte.MAX_VALUE;
            byte b13 = Byte.MIN_VALUE;
            int i16 = 0;
            while (i16 < dp) {
                Paint paint8 = paint7;
                byte[] bArr = this.H;
                if (bArr == null) {
                    i12 = i16;
                    i11 = lerp2;
                    b11 = 0;
                } else {
                    i11 = lerp2;
                    i12 = i16;
                    b11 = bArr[(int) ((i16 / dp) * bArr.length)];
                }
                b12 = (byte) Math.min((int) b12, (int) b11);
                b13 = (byte) Math.max((int) b13, (int) b11);
                i16 = i12 + 1;
                paint7 = paint8;
                lerp2 = i11;
            }
            paint3 = paint7;
            i9 = lerp2;
            path.rewind();
            int i17 = 0;
            while (i17 < dp) {
                byte[] bArr2 = this.H;
                if (bArr2 == null) {
                    i10 = i17;
                    b10 = 0;
                } else {
                    i10 = i17;
                    b10 = bArr2[(int) ((i17 / dp) * bArr2.length)];
                }
                float lerp3 = AndroidUtilities.lerp(dp2, dp3, Utilities.clamp01(AndroidUtilities.ilerp((int) b10, (int) b12, (int) b13)));
                float dp4 = AndroidUtilities.dp(3.0f) * i10;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(dp4, (-lerp3) / 2.0f, AndroidUtilities.dp(2.0f) + dp4, lerp3 / 2.0f);
                path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                i17 = i10 + 1;
                dp = dp;
                dp2 = dp2;
            }
            this.G = measuredWidth;
        }
        canvas.save();
        Path path2 = this.C;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        Paint paint9 = paint;
        canvas.drawRect(rectF.left, rectF.top, lerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint9);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i9, rectF.top, rectF.right, rectF.bottom, paint9);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i18 = org.telegram.ui.ActionBar.f6.f23064gf;
        paint6.setColor(org.telegram.ui.ActionBar.f6.l1(0.3f, org.telegram.ui.ActionBar.f6.v0(i18, b6Var)));
        canvas.drawPath(path, paint6);
        canvas.restore();
        float f11 = lerp;
        float f12 = i9;
        canvas.drawRect(f11, rectF.top, f12, rectF.bottom, paint2);
        if (this.Q) {
            clamp = this.R;
        } else {
            k61 k61Var = this.f33394n;
            if (k61Var != null) {
                f10 = ((float) k61Var.o()) / ((float) this.f33394n.q());
            } else {
                f10 = 1.0f;
            }
            clamp = Utilities.clamp(f10, this.v, this.f33396s);
        }
        float clamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), clamp), f12, f11);
        if (clamp2 < f12) {
            canvas.save();
            canvas.clipRect(clamp2, rectF.top, f12, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (this.f33397w && clamp < this.f33396s && !this.Q) {
                paint6.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23082hf, b6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.f6.v0(i18, b6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        if (clamp2 > f11) {
            canvas.save();
            canvas.clipRect(f11, rectF.top, clamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!b() && !this.f33397w && !this.Q) {
                paint6.setColor(org.telegram.ui.ActionBar.f6.v0(i18, b6Var));
            } else {
                paint6.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23082hf, b6Var));
            }
            canvas.drawPath(path, paint6);
            canvas.restore();
        }
        float centerY = rectF.centerY() + AndroidUtilities.dp(5.33f);
        RectF rectF3 = this.B;
        rectF3.set(lerp - AndroidUtilities.dp(7.0f), rectF.centerY() - AndroidUtilities.dp(5.33f), lerp - AndroidUtilities.dp(5.33f), centerY);
        Paint paint10 = paint3;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        rectF3.set(AndroidUtilities.dp(5.33f) + i9, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i9, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint10);
        this.E.set(lerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + lerp, getHeight());
        this.F.set(i9 - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i9, getHeight());
        float e10 = this.K.e(!this.Q);
        if (e10 > 0.0f) {
            float d = (int) (i6Var.d() + AndroidUtilities.dp(30.0f));
            if (d <= (i9 - lerp) - AndroidUtilities.dp(8.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e11 = this.J.e(z10);
            float lerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), d, e11);
            float f13 = lerp + i9;
            float dp5 = AndroidUtilities.dp(20.0f) / 2.0f;
            float centerY2 = rectF.centerY() + dp5;
            RectF rectF4 = this.A;
            rectF4.set((f13 - lerp4) / 2.0f, rectF.centerY() - dp5, (f13 + lerp4) / 2.0f, centerY2);
            int alpha = paint9.getAlpha();
            paint9.setAlpha((int) (alpha * e10));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint9);
            paint9.setAlpha(alpha);
            RectF rectF5 = this.D;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int dp6 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (dp6 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), e11), rectF4.centerY());
            qf0 qf0Var3 = qf0Var;
            qf0Var3.setBounds(0, (-dp6) / 2, dp6, dp6 / 2);
            qf0Var3.f31936g = (int) (e10 * 255.0f);
            qf0Var3.draw(canvas);
            canvas.restore();
            if (e11 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                i6 i6Var3 = i6Var;
                i6Var3.setBounds(-1, -1, 1, 1);
                i6Var3.f29351w = (int) (e11 * 255.0f * e10);
                i6Var3.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        k61 k61Var = this.f33394n;
        if (k61Var != null && k61Var.z()) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.L) {
            a(canvas, this.f33399y);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean contains = this.D.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.E;
        if (!contains && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            z10 = true;
        } else {
            z10 = false;
        }
        RectF rectF2 = this.F;
        if (!contains && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!contains && !z10 && !z11 && motionEvent.getX() > rectF.right && motionEvent.getX() < rectF2.left) {
            z12 = true;
        } else {
            z12 = false;
        }
        float f10 = 1.0f;
        if (motionEvent.getAction() == 0) {
            this.P = contains;
            this.N = z10;
            this.O = z11;
            if (z10 || z11) {
                b();
                setPlaying(false);
            }
            this.Q = z12;
            if (z12) {
                b();
                k61 k61Var = this.f33394n;
                if (k61Var != null) {
                    f10 = ((float) k61Var.o()) / ((float) this.f33394n.q());
                }
                this.R = f10;
                setPlaying(false);
            }
            if (getParent() != null && (this.P || this.N || this.O || this.Q)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.N;
            RectF rectF3 = this.f33399y;
            if (z13) {
                this.f33396s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.f33395r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.O) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.f33395r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.f33396s));
                invalidate();
            } else if (this.Q) {
                k61 k61Var2 = this.f33394n;
                if (k61Var2 != null) {
                    float clamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.f33396s);
                    this.R = clamp;
                    k61Var2.M(clamp * ((float) this.f33394n.q()), false);
                }
                invalidate();
            }
            this.h.q(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.f33396s) * this.f33395r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.P) {
                setPlaying(!b());
            } else if (this.N && this.f33397w) {
                k61 k61Var3 = this.f33394n;
                if (k61Var3 != null) {
                    k61Var3.M(this.f33396s * ((float) k61Var3.q()), false);
                }
                setPlaying(true);
            } else if (this.O && this.f33397w) {
                k61 k61Var4 = this.f33394n;
                if (k61Var4 != null) {
                    k61Var4.M(Math.max(this.f33396s * ((float) k61Var4.q()), (this.v * ((float) this.f33394n.q())) - 1500), false);
                }
                setPlaying(true);
            } else if (this.Q && !b()) {
                setPlaying(true);
            }
            this.P = false;
            this.N = false;
            this.O = false;
            this.Q = false;
        }
        if (this.P || this.N || this.O || this.Q || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public float getAudioLeft() {
        return this.f33396s;
    }

    public long getAudioLeftMs() {
        return this.f33396s * ((float) getDuration());
    }

    public float getAudioRight() {
        return this.v;
    }

    public long getAudioRightMs() {
        return this.v * ((float) getDuration());
    }

    public long getDuration() {
        k61 k61Var = this.f33394n;
        if (k61Var == null) {
            return 0L;
        }
        return k61Var.q();
    }

    public double getNewDuration() {
        return ((this.v - this.f33396s) * ((float) getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        float dp = AndroidUtilities.dp(32.0f);
        this.f33399y.set(0.0f, (getHeight() - dp) / 2.0f, getWidth(), (getHeight() + dp) / 2.0f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        float dp = AndroidUtilities.dp(32.0f);
        this.f33399y.set(0.0f, (getMeasuredHeight() - dp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + dp) / 2.0f);
    }

    public void setAllowDraw(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
            invalidate();
        }
    }

    public void setPlaying(boolean z10) {
        if (this.M) {
            z10 = false;
        }
        k61 k61Var = this.f33394n;
        if (k61Var != null) {
            float o6 = ((float) k61Var.o()) / ((float) this.f33394n.q());
            float f10 = this.f33396s;
            if (o6 < f10 || o6 > this.v) {
                k61 k61Var2 = this.f33394n;
                k61Var2.M(f10 * ((float) k61Var2.q()), false);
            }
            this.f33394n.Q(z10);
        }
        this.f33393f.a(z10, true);
        ib0 ib0Var = this.f33398x;
        AndroidUtilities.cancelRunOnUIThread(ib0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(ib0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.h != drawable && this.f33393f != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

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

public final class xj0 extends View {
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

    public final org.telegram.ui.ActionBar.c6 f34630a;

    public final Paint f34631b;

    public final Paint f34632c;
    public final Paint d;

    public final Paint f34633e;

    public final tf0 f34634f;
    public final i6 h;

    public m61 f34635n;

    public float f34636r;

    public float f34637s;
    public float v;

    public boolean f34638w;

    public final mb0 f34639x;

    public final RectF f34640y;

    public xj0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f34631b = new Paint(1);
        this.f34632c = new Paint(1);
        this.d = new Paint(1);
        this.f34633e = new Paint(1);
        this.f34637s = 0.0f;
        this.v = 1.0f;
        this.f34638w = false;
        this.f34639x = new mb0(this, 18);
        this.f34640y = new RectF();
        this.A = new RectF();
        this.B = new RectF();
        this.C = new Path();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new RectF();
        this.I = new Path();
        er erVar = er.h;
        this.J = new y5(this, 0L, 340L, erVar);
        this.K = new y5(this, 0L, 340L, erVar);
        this.L = true;
        this.f34630a = c6Var;
        tf0 tf0Var = new tf0(12);
        this.f34634f = tf0Var;
        tf0Var.f32766f = this;
        tf0Var.setCallback(this);
        i6 i6Var = new i6(false, false, false, false);
        this.h = i6Var;
        i6Var.k(0.5f, 200L, erVar);
        i6Var.setCallback(this);
        i6Var.t(AndroidUtilities.dp(12.0f));
        i6Var.u(AndroidUtilities.bold());
        i6Var.G = AndroidUtilities.displaySize.x;
    }

    public final void a(Canvas canvas, RectF rectF) {
        Paint paint;
        int i10;
        float fClamp;
        int i11 = org.telegram.ui.ActionBar.g6.f23189kf;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34630a;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        Paint paint2 = this.f34631b;
        paint2.setColor(iV0);
        int iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23206lf, c6Var);
        Paint paint3 = this.f34632c;
        paint3.setColor(iV1);
        int i12 = org.telegram.ui.ActionBar.g6.f23134hf;
        int iV2 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        i6 i6Var = this.h;
        i6Var.r(iV2);
        int iV3 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23098ff, c6Var);
        tf0 tf0Var = this.f34634f;
        tf0Var.f32762a.setColor(iV3);
        int iV4 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23116gf, c6Var);
        Paint paint4 = this.d;
        paint4.setColor(iV4);
        int iV5 = org.telegram.ui.ActionBar.g6.v0(i12, c6Var);
        Paint paint5 = this.f34633e;
        paint5.setColor(iV5);
        int iLerp = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.f34637s));
        int iLerp2 = (int) AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(11.33f), rectF.right - AndroidUtilities.dp(11.33f), Utilities.clamp01(this.v));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(27.0f);
        int i13 = this.G;
        Path path = this.I;
        if (i13 == measuredWidth) {
            paint = paint5;
            i10 = iLerp2;
        } else {
            int iDp = measuredWidth / AndroidUtilities.dp(3.0f);
            int iDp2 = AndroidUtilities.dp(2.0f);
            int iDp3 = AndroidUtilities.dp(12.0f);
            byte bMin = 127;
            byte bMax = -128;
            int i14 = 0;
            while (i14 < iDp) {
                Paint paint6 = paint5;
                byte[] bArr = this.H;
                byte b10 = bArr == null ? (byte) 0 : bArr[(int) ((i14 / iDp) * bArr.length)];
                bMin = (byte) Math.min((int) bMin, (int) b10);
                bMax = (byte) Math.max((int) bMax, (int) b10);
                i14++;
                paint5 = paint6;
                iLerp2 = iLerp2;
            }
            paint = paint5;
            i10 = iLerp2;
            path.rewind();
            int i15 = 0;
            while (i15 < iDp) {
                byte[] bArr2 = this.H;
                float fLerp = AndroidUtilities.lerp(iDp2, iDp3, Utilities.clamp01(AndroidUtilities.ilerp((int) (bArr2 == null ? (byte) 0 : bArr2[(int) ((i15 / iDp) * bArr2.length)]), (int) bMin, (int) bMax)));
                float fDp = AndroidUtilities.dp(3.0f) * i15;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fDp, (-fLerp) / 2.0f, AndroidUtilities.dp(2.0f) + fDp, fLerp / 2.0f);
                path.addRoundRect(rectF2, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), Path.Direction.CW);
                i15++;
                iDp = iDp;
                iDp2 = iDp2;
            }
            this.G = measuredWidth;
        }
        canvas.save();
        Path path2 = this.C;
        path2.rewind();
        path2.addRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.drawRect(rectF.left, rectF.top, iLerp - AndroidUtilities.dp(1.33f), rectF.bottom, paint3);
        canvas.drawRect(AndroidUtilities.dp(1.33f) + i10, rectF.top, rectF.right, rectF.bottom, paint3);
        canvas.save();
        canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
        int i16 = org.telegram.ui.ActionBar.g6.f23116gf;
        paint4.setColor(org.telegram.ui.ActionBar.g6.l1(0.3f, org.telegram.ui.ActionBar.g6.v0(i16, c6Var)));
        canvas.drawPath(path, paint4);
        canvas.restore();
        float f10 = iLerp;
        float f11 = i10;
        canvas.drawRect(f10, rectF.top, f11, rectF.bottom, paint2);
        if (this.Q) {
            fClamp = this.R;
        } else {
            m61 m61Var = this.f34635n;
            fClamp = Utilities.clamp(m61Var != null ? m61Var.o() / this.f34635n.q() : 1.0f, this.v, this.f34637s);
        }
        float fClamp2 = Utilities.clamp(AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(13.0f), rectF.right - AndroidUtilities.dp(14.0f), fClamp), f11, f10);
        if (fClamp2 < f11) {
            canvas.save();
            canvas.clipRect(fClamp2, rectF.top, f11, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (!this.f34638w || fClamp >= this.f34637s || this.Q) {
                paint4.setColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
            } else {
                paint4.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23134hf, c6Var));
            }
            canvas.drawPath(path, paint4);
            canvas.restore();
        }
        if (fClamp2 > f10) {
            canvas.save();
            canvas.clipRect(f10, rectF.top, fClamp2, rectF.bottom);
            canvas.translate(rectF.left + AndroidUtilities.dp(14.0f), rectF.centerY());
            if (b() || this.f34638w || this.Q) {
                paint4.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23134hf, c6Var));
            } else {
                paint4.setColor(org.telegram.ui.ActionBar.g6.v0(i16, c6Var));
            }
            canvas.drawPath(path, paint4);
            canvas.restore();
        }
        float fDp2 = iLerp - AndroidUtilities.dp(7.0f);
        float fCenterY = rectF.centerY() - AndroidUtilities.dp(5.33f);
        float fDp3 = iLerp - AndroidUtilities.dp(5.33f);
        float fCenterY2 = rectF.centerY() + AndroidUtilities.dp(5.33f);
        RectF rectF3 = this.B;
        rectF3.set(fDp2, fCenterY, fDp3, fCenterY2);
        Paint paint7 = paint;
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint7);
        rectF3.set(AndroidUtilities.dp(5.33f) + i10, rectF.centerY() - AndroidUtilities.dp(5.33f), AndroidUtilities.dp(7.0f) + i10, rectF.centerY() + AndroidUtilities.dp(5.33f));
        canvas.drawRoundRect(rectF3, rectF3.width() / 2.0f, rectF3.width() / 2.0f, paint7);
        this.E.set(iLerp - AndroidUtilities.dp(24.0f), 0.0f, AndroidUtilities.dp(6.0f) + iLerp, getHeight());
        this.F.set(i10 - AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(24.0f) + i10, getHeight());
        float fE = this.K.e(!this.Q);
        if (fE > 0.0f) {
            float fD = (int) (i6Var.d() + AndroidUtilities.dp(30.0f));
            float fE2 = this.J.e(fD <= ((float) ((i10 - iLerp) - AndroidUtilities.dp(8.0f))));
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), fD, fE2);
            float f12 = iLerp + i10;
            float f13 = (f12 - fLerp2) / 2.0f;
            float fDp4 = AndroidUtilities.dp(20.0f) / 2.0f;
            float fCenterY3 = rectF.centerY() - fDp4;
            float f14 = (f12 + fLerp2) / 2.0f;
            float fCenterY4 = rectF.centerY() + fDp4;
            RectF rectF4 = this.A;
            rectF4.set(f13, fCenterY3, f14, fCenterY4);
            int alpha = paint3.getAlpha();
            paint3.setAlpha((int) (alpha * fE));
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, rectF4.height() / 2.0f, paint3);
            paint3.setAlpha(alpha);
            RectF rectF5 = this.D;
            rectF5.set(rectF4);
            rectF5.inset(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f));
            canvas.save();
            int iDp4 = AndroidUtilities.dp(12.0f);
            canvas.translate(AndroidUtilities.lerp(rectF4.centerX() - (iDp4 / 2.0f), rectF4.left + AndroidUtilities.dp(6.0f), fE2), rectF4.centerY());
            tf0Var.setBounds(0, (-iDp4) / 2, iDp4, iDp4 / 2);
            tf0Var.f32767g = (int) (fE * 255.0f);
            tf0Var.draw(canvas);
            canvas.restore();
            if (fE2 > 0.0f) {
                canvas.save();
                canvas.translate(rectF4.left + AndroidUtilities.dp(21.66f), rectF4.centerY() - AndroidUtilities.dp(1.0f));
                i6Var.setBounds(-1, -1, 1, 1);
                i6Var.f29257w = (int) (fE2 * 255.0f * fE);
                i6Var.draw(canvas);
                canvas.restore();
            }
        }
        canvas.restore();
    }

    public final boolean b() {
        m61 m61Var = this.f34635n;
        return m61Var != null && m61Var.z();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.L) {
            a(canvas, this.f34640y);
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zContains = this.D.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF = this.E;
        boolean z10 = !zContains && rectF.contains(motionEvent.getX(), motionEvent.getY());
        RectF rectF2 = this.F;
        boolean z11 = !zContains && rectF2.contains(motionEvent.getX(), motionEvent.getY());
        boolean z12 = (zContains || z10 || z11 || motionEvent.getX() <= rectF.right || motionEvent.getX() >= rectF2.left) ? false : true;
        if (motionEvent.getAction() == 0) {
            this.P = zContains;
            this.N = z10;
            this.O = z11;
            if (z10 || z11) {
                b();
                setPlaying(false);
            }
            this.Q = z12;
            if (z12) {
                b();
                m61 m61Var = this.f34635n;
                this.R = m61Var != null ? m61Var.o() / this.f34635n.q() : 1.0f;
                setPlaying(false);
            }
            if (getParent() != null && (this.P || this.N || this.O || this.Q)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (motionEvent.getAction() == 2) {
            boolean z13 = this.N;
            RectF rectF3 = this.f34640y;
            if (z13) {
                this.f34637s = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), Utilities.clamp01(this.v - Math.max(1.0f / this.f34636r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f)))), 0.0f);
                invalidate();
            } else if (this.O) {
                this.v = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), 1.0f, Utilities.clamp01(Math.max(1.0f / this.f34636r, AndroidUtilities.dp(30.0f) / (rectF3.width() - AndroidUtilities.dp(22.66f))) + this.f34637s));
                invalidate();
            } else if (this.Q) {
                m61 m61Var2 = this.f34635n;
                if (m61Var2 != null) {
                    float fClamp = Utilities.clamp(AndroidUtilities.ilerp(motionEvent.getX(), rectF3.left + AndroidUtilities.dp(11.33f), rectF3.right - AndroidUtilities.dp(11.33f)), this.v, this.f34637s);
                    this.R = fClamp;
                    m61Var2.M((long) (fClamp * this.f34635n.q()), false);
                }
                invalidate();
            }
            this.h.q(AndroidUtilities.formatDuration(Math.round(Math.max(1.0f, (this.v - this.f34637s) * this.f34636r)), false), true, true);
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && this.P) {
                setPlaying(!b());
            } else if (this.N && this.f34638w) {
                m61 m61Var3 = this.f34635n;
                if (m61Var3 != null) {
                    m61Var3.M((long) (this.f34637s * m61Var3.q()), false);
                }
                setPlaying(true);
            } else if (this.O && this.f34638w) {
                m61 m61Var4 = this.f34635n;
                if (m61Var4 != null) {
                    m61Var4.M(Math.max((long) (this.f34637s * m61Var4.q()), ((long) (this.v * this.f34635n.q())) - 1500), false);
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
        return this.P || this.N || this.O || this.Q || super.dispatchTouchEvent(motionEvent);
    }

    public float getAudioLeft() {
        return this.f34637s;
    }

    public long getAudioLeftMs() {
        return (long) (this.f34637s * getDuration());
    }

    public float getAudioRight() {
        return this.v;
    }

    public long getAudioRightMs() {
        return (long) (this.v * getDuration());
    }

    public long getDuration() {
        m61 m61Var = this.f34635n;
        if (m61Var == null) {
            return 0L;
        }
        return m61Var.q();
    }

    public double getNewDuration() {
        return ((double) ((this.v - this.f34637s) * getDuration())) / 1000.0d;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        float fDp = AndroidUtilities.dp(32.0f);
        this.f34640y.set(0.0f, (getHeight() - fDp) / 2.0f, getWidth(), (getHeight() + fDp) / 2.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float fDp = AndroidUtilities.dp(32.0f);
        this.f34640y.set(0.0f, (getMeasuredHeight() - fDp) / 2.0f, getMeasuredWidth(), (getMeasuredHeight() + fDp) / 2.0f);
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
        m61 m61Var = this.f34635n;
        if (m61Var != null) {
            float fO = m61Var.o() / this.f34635n.q();
            float f10 = this.f34637s;
            if (fO < f10 || fO > this.v) {
                m61 m61Var2 = this.f34635n;
                m61Var2.M((long) (f10 * m61Var2.q()), false);
            }
            this.f34635n.Q(z10);
        }
        this.f34634f.a(z10, true);
        mb0 mb0Var = this.f34639x;
        AndroidUtilities.cancelRunOnUIThread(mb0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(mb0Var, 16L);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.h == drawable || this.f34634f == drawable || super.verifyDrawable(drawable);
    }
}

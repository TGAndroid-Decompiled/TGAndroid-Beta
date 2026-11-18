package org.telegram.ui.Stories;

import a8.w9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d6.i;
import fi.a4;
import fi.b4;
import fi.g7;
import fi.o6;
import fi.p6;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.g0;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.v3;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.cv0;
import org.telegram.ui.wv0;
public class ProfileStoriesView extends View implements fs {
    public static final int f43797t0 = 0;
    public qh0 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public o6 L;
    public final g7 M;
    public final p6 N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final c6 U;
    public final c6 V;
    public final c6 W;
    public final Paint f43798a;
    public float f43799a0;
    public final Paint f43800b;
    public ValueAnimator f43801b0;
    public final int f43802c;
    public final Path f43803c0;
    public final long d;
    public final Matrix f43804d0;
    public final boolean f43805e;
    public final PathMeasure f43806e0;
    public final View f43807f;
    public final Path f43808f0;
    public float f43809g0;
    public final wv0 h;
    public float f43810h0;
    public float f43811i0;
    public float f43812j0;
    public float f43813k0;
    public boolean f43814l0;
    public final c6 m0;
    public final m6 f43815n;
    public final c6 f43816n0;
    public final i f43817o0;
    public final a4 f43818p0;
    public long f43819q0;
    public int f43820r;
    public float f43821r0;
    public int f43822s;
    public float f43823s0;
    public b4 f43824w;
    public final ArrayList f43825x;
    public boolean f43826y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z10, View view, wv0 wv0Var, i6 i6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43798a = paint;
        Paint paint2 = new Paint(1);
        this.f43800b = paint2;
        Paint paint3 = new Paint(1);
        m6 m6Var = new m6(false, true, true);
        this.f43815n = m6Var;
        Paint paint4 = new Paint(1);
        this.f43825x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new g7(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        lr lrVar = lr.h;
        this.U = new c6(this, 0L, 480L, lrVar);
        this.V = new c6(this, 0L, 240L, lrVar);
        this.W = new c6(this, 0L, 150L, lr.f37208f);
        this.f43799a0 = 1.0f;
        this.f43803c0 = new Path();
        this.f43804d0 = new Matrix();
        this.f43806e0 = new PathMeasure();
        this.f43808f0 = new Path();
        this.m0 = new c6(this, 0L, 350L, lrVar);
        this.f43816n0 = new c6(this, 0L, 350L, lrVar);
        cv0 cv0Var = (cv0) this;
        this.f43817o0 = new i(cv0Var, 21);
        this.f43818p0 = new a4(cv0Var, 0);
        this.f43802c = i7;
        this.d = j3;
        this.f43805e = z10;
        this.f43807f = view;
        this.h = wv0Var;
        wv0Var.getImageReceiver().F1 = new a4(cv0Var, 1);
        this.N = mp.u1(i7).R1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(n6.w0(n6.el, i6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(n6.w0(n6.f29396d6, i6Var));
        m6Var.w(g0.L(18.0f));
        m6Var.n(0.4f, 320L, lrVar);
        m6Var.x(g0.o());
        m6Var.u(-1);
        m6Var.q(true);
        m6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static b4 d(b4 b4Var, b4 b4Var2, b4 b4Var3) {
        if (b4Var3 != null) {
            RectF rectF = b4Var3.f11779n;
            if (b4Var != null || b4Var2 != null) {
                if (b4Var != null) {
                    RectF rectF2 = b4Var.f11779n;
                    if (b4Var2 != null) {
                        RectF rectF3 = b4Var2.f11779n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return b4Var;
                        }
                        return b4Var2;
                    }
                }
                if (b4Var != null) {
                    return b4Var;
                }
                return b4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f43812j0 - (this.m0.d(this.f43814l0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, b4 b4Var, b4 b4Var2) {
        if (b4Var2 == null) {
            return;
        }
        RectF rectF = b4Var2.f11778m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * b4Var2.f11775j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = b4Var.f11778m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.T;
        path.rewind();
        if (centerX > centerX2) {
            float degrees = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2));
            path.arcTo(rectF2, 180.0f + degrees, (-degrees) * 2.0f);
            path.arcTo(rectF3, degrees, 360.0f - (2.0f * degrees));
        } else {
            float degrees2 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2));
            float f11 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f11);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f11));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (v3.b0(j10.f24773t0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f43803c0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f43804d0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f43806e0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f43808f0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, b4 b4Var, b4 b4Var2, b4 b4Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        b4 b4Var4 = b4Var;
        RectF rectF = b4Var2.f11779n;
        if (b4Var4 == null && b4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (b4Var4 != null) {
            RectF rectF2 = b4Var4.f11779n;
            if (b4Var3 != null) {
                RectF rectF3 = b4Var3.f11779n;
                float centerX = rectF2.centerX();
                float width2 = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width3 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width4 = rectF3.width() / 2.0f;
                boolean z11 = false;
                if (centerX > centerX2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX - width2)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX + width2)) / 2.0f) - centerX2) / width3));
                }
                float f10 = (float) degrees;
                if (centerX3 > centerX2) {
                    z11 = true;
                }
                if (z11) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX3 - width4)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX3 + width4)) / 2.0f) - centerX2) / width3));
                }
                float f11 = (float) degrees2;
                if (z10 && z11) {
                    float max = Math.max(f10, f11);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z10) {
                    b(f11 + 180.0f, 180.0f - (f10 + f11), canvas, paint, rectF);
                    b(f10, (180.0f - f11) - f10, canvas, paint, rectF);
                    return;
                } else if (z11) {
                    b(f10 + 180.0f, 180.0f - (f11 + f10), canvas, paint, rectF);
                    b(f11, (180.0f - f11) - f10, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(f10, f11);
                    b(max2 + 180.0f, 360.0f - (max2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        }
        if (b4Var4 == null && b4Var3 == null) {
            return;
        }
        if (b4Var4 == null) {
            b4Var4 = b4Var3;
        }
        float centerX4 = b4Var4.f11779n.centerX();
        float width5 = b4Var4.f11779n.width() / 2.0f;
        float centerX5 = rectF.centerX();
        if (Math.abs(centerX4 - centerX5) > width5 + (rectF.width() / 2.0f)) {
            b(0.0f, 360.0f, canvas, paint, rectF);
        } else if (centerX4 > centerX5) {
            float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 + width) + (centerX4 - width5)) / 2.0f) - centerX5) / width));
            b(degrees3, 360.0f - (2.0f * degrees3), canvas, paint, rectF);
        } else {
            float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 - width) + (centerX4 + width5)) / 2.0f) - centerX5) / width));
            b(degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), canvas, paint, rectF);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.f25225x5) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.f(boolean, boolean):void");
    }

    public float getFragmentTransitionProgress() {
        return this.J;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43826y = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f43825x;
            if (i7 < arrayList.size()) {
                ((b4) arrayList.get(i7)).f11769b.P();
                i7++;
            } else {
                ks.f(this.f43802c).c(this, ks.f25225x5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.f43826y = false;
        while (true) {
            ArrayList arrayList = this.f43825x;
            if (i7 < arrayList.size()) {
                ((b4) arrayList.get(i7)).f11769b.R();
                i7++;
            } else {
                ks.f(this.f43802c).n(this, ks.f25225x5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.O < 0.9f) {
            z10 = this.R.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f43809g0 && motionEvent.getX() <= this.f43810h0 && Math.abs(motionEvent.getY() - this.f43811i0) < g0.L(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a4 a4Var = this.f43818p0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f43819q0 = System.currentTimeMillis();
            this.f43821r0 = motionEvent.getX();
            this.f43823s0 = motionEvent.getY();
            g0.r(a4Var);
            g0.h3(a4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(a4Var);
            if (z10 && System.currentTimeMillis() - this.f43819q0 <= ViewConfiguration.getTapTimeout() && w9.a(this.f43821r0, this.f43823s0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                p6 p6Var = this.N;
                long j3 = this.d;
                if (p6Var.M(j3) || p6Var.K(j3) || !this.f43825x.isEmpty()) {
                    e(this.f43817o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f43819q0 = -1L;
            g0.r(a4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (n6.I.q()) {
            return;
        }
        this.P = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.O != f10) {
            this.O = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.J == f10) {
            return;
        }
        this.J = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.I == f10) {
            return;
        }
        this.I = f10;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f43815n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

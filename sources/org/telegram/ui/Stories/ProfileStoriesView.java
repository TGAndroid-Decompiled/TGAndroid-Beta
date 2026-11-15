package org.telegram.ui.Stories;

import a8.t9;
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
import cb.c;
import fi.c4;
import fi.d4;
import fi.j7;
import fi.r6;
import fi.s6;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.av0;
import org.telegram.ui.vv0;
public class ProfileStoriesView extends View implements is {
    public static final int f43351t0 = 0;
    public gh0 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public r6 L;
    public final j7 M;
    public final s6 N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final u5 U;
    public final u5 V;
    public final u5 W;
    public final Paint f43352a;
    public float f43353a0;
    public final Paint f43354b;
    public ValueAnimator f43355b0;
    public final int f43356c;
    public final Path f43357c0;
    public final long d;
    public final Matrix f43358d0;
    public final boolean f43359e;
    public final PathMeasure f43360e0;
    public final View f43361f;
    public final Path f43362f0;
    public float f43363g0;
    public final vv0 h;
    public float f43364h0;
    public float f43365i0;
    public float f43366j0;
    public float f43367k0;
    public boolean f43368l0;
    public final u5 m0;
    public final g6 f43369n;
    public final u5 f43370n0;
    public final c f43371o0;
    public final c4 f43372p0;
    public long f43373q0;
    public int f43374r;
    public float f43375r0;
    public int f43376s;
    public float f43377s0;
    public d4 f43378w;
    public final ArrayList f43379x;
    public boolean f43380y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z10, View view, vv0 vv0Var, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43352a = paint;
        Paint paint2 = new Paint(1);
        this.f43354b = paint2;
        Paint paint3 = new Paint(1);
        g6 g6Var = new g6(false, true, true);
        this.f43369n = g6Var;
        Paint paint4 = new Paint(1);
        this.f43379x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new j7(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        er erVar = er.h;
        this.U = new u5(this, 0L, 480L, erVar);
        this.V = new u5(this, 0L, 240L, erVar);
        this.W = new u5(this, 0L, 150L, er.f34420f);
        this.f43353a0 = 1.0f;
        this.f43357c0 = new Path();
        this.f43358d0 = new Matrix();
        this.f43360e0 = new PathMeasure();
        this.f43362f0 = new Path();
        this.m0 = new u5(this, 0L, 350L, erVar);
        this.f43370n0 = new u5(this, 0L, 350L, erVar);
        av0 av0Var = (av0) this;
        this.f43371o0 = new c(av0Var, 25);
        this.f43372p0 = new c4(av0Var, 0);
        this.f43356c = i7;
        this.d = j3;
        this.f43359e = z10;
        this.f43361f = view;
        this.h = vv0Var;
        vv0Var.getImageReceiver().F1 = new c4(av0Var, 1);
        this.N = np.s1(i7).P1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(j6.w0(j6.el, e6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(j6.w0(j6.f28849d6, e6Var));
        g6Var.w(g0.L(18.0f));
        g6Var.n(0.4f, 320L, erVar);
        g6Var.x(g0.o());
        g6Var.u(-1);
        g6Var.q(true);
        g6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static d4 d(d4 d4Var, d4 d4Var2, d4 d4Var3) {
        if (d4Var3 != null) {
            RectF rectF = d4Var3.f11635n;
            if (d4Var != null || d4Var2 != null) {
                if (d4Var != null) {
                    RectF rectF2 = d4Var.f11635n;
                    if (d4Var2 != null) {
                        RectF rectF3 = d4Var2.f11635n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return d4Var;
                        }
                        return d4Var2;
                    }
                }
                if (d4Var != null) {
                    return d4Var;
                }
                return d4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f43366j0 - (this.m0.d(this.f43368l0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, d4 d4Var, d4 d4Var2) {
        if (d4Var2 == null) {
            return;
        }
        RectF rectF = d4Var2.f11634m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * d4Var2.f11631j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = d4Var.f11634m;
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
        if (t3.b0(m10.f24934t0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f43357c0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f43358d0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f43360e0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f43362f0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, d4 d4Var, d4 d4Var2, d4 d4Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        d4 d4Var4 = d4Var;
        RectF rectF = d4Var2.f11635n;
        if (d4Var4 == null && d4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (d4Var4 != null) {
            RectF rectF2 = d4Var4.f11635n;
            if (d4Var3 != null) {
                RectF rectF3 = d4Var3.f11635n;
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
        if (d4Var4 == null && d4Var3 == null) {
            return;
        }
        if (d4Var4 == null) {
            d4Var4 = d4Var3;
        }
        float centerX4 = d4Var4.f11635n.centerX();
        float width5 = d4Var4.f11635n.width() / 2.0f;
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
        if (i7 == ns.f25591v5) {
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
        this.f43380y = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f43379x;
            if (i7 < arrayList.size()) {
                ((d4) arrayList.get(i7)).f11625b.P();
                i7++;
            } else {
                ns.f(this.f43356c).c(this, ns.f25591v5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.f43380y = false;
        while (true) {
            ArrayList arrayList = this.f43379x;
            if (i7 < arrayList.size()) {
                ((d4) arrayList.get(i7)).f11625b.R();
                i7++;
            } else {
                ns.f(this.f43356c).n(this, ns.f25591v5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.O < 0.9f) {
            z10 = this.R.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f43363g0 && motionEvent.getX() <= this.f43364h0 && Math.abs(motionEvent.getY() - this.f43365i0) < g0.L(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        c4 c4Var = this.f43372p0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f43373q0 = System.currentTimeMillis();
            this.f43375r0 = motionEvent.getX();
            this.f43377s0 = motionEvent.getY();
            g0.r(c4Var);
            g0.i3(c4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(c4Var);
            if (z10 && System.currentTimeMillis() - this.f43373q0 <= ViewConfiguration.getTapTimeout() && t9.a(this.f43375r0, this.f43377s0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                s6 s6Var = this.N;
                long j3 = this.d;
                if (s6Var.M(j3) || s6Var.K(j3) || !this.f43379x.isEmpty()) {
                    e(this.f43371o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f43373q0 = -1L;
            g0.r(c4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (j6.I.q()) {
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
        if (drawable != this.f43369n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(c cVar) {
    }
}

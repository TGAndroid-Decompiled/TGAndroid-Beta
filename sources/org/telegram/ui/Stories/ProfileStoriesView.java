package org.telegram.ui.Stories;

import a8.r9;
import aa.n;
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
import di.j4;
import di.k4;
import di.p7;
import di.x6;
import di.y6;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.cv0;
import org.telegram.ui.wv0;
public class ProfileStoriesView extends View implements ls {
    public static final int f41976s0 = 0;
    public dh0 D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public x6 K;
    public final p7 L;
    public final y6 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final w5 T;
    public final w5 U;
    public final w5 V;
    public float W;
    public final Paint f41977a;
    public ValueAnimator f41978a0;
    public final Paint f41979b;
    public final Path f41980b0;
    public final int f41981c;
    public final Matrix f41982c0;
    public final long d;
    public final PathMeasure f41983d0;
    public final boolean f41984e;
    public final Path f41985e0;
    public final View f41986f;
    public float f41987f0;
    public float f41988g0;
    public final wv0 h;
    public float f41989h0;
    public float f41990i0;
    public float f41991j0;
    public boolean f41992k0;
    public final w5 f41993l0;
    public final w5 m0;
    public final i6 f41994n;
    public final n f41995n0;
    public final j4 f41996o0;
    public long f41997p0;
    public float f41998q0;
    public int f41999r;
    public float f42000r0;
    public int f42001s;
    public k4 f42002w;
    public final ArrayList f42003x;
    public boolean f42004y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z9, View view, wv0 wv0Var, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f41977a = paint;
        Paint paint2 = new Paint(1);
        this.f41979b = paint2;
        Paint paint3 = new Paint(1);
        i6 i6Var = new i6(false, true, true);
        this.f41994n = i6Var;
        Paint paint4 = new Paint(1);
        this.f42003x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new p7(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        xq xqVar = xq.h;
        this.T = new w5(this, 0L, 480L, xqVar);
        this.U = new w5(this, 0L, 240L, xqVar);
        this.V = new w5(this, 0L, 150L, xq.f40329f);
        this.W = 1.0f;
        this.f41980b0 = new Path();
        this.f41982c0 = new Matrix();
        this.f41983d0 = new PathMeasure();
        this.f41985e0 = new Path();
        this.f41993l0 = new w5(this, 0L, 350L, xqVar);
        this.m0 = new w5(this, 0L, 350L, xqVar);
        cv0 cv0Var = (cv0) this;
        this.f41995n0 = new n(cv0Var, 14);
        this.f41996o0 = new j4(cv0Var, 0);
        this.f41981c = i7;
        this.d = j3;
        this.f41984e = z9;
        this.f41986f = view;
        this.h = wv0Var;
        wv0Var.getImageReceiver().E1 = new j4(cv0Var, 1);
        this.M = qp.s1(i7).P1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(k6.w0(k6.bl, f6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(k6.w0(k6.f27848d6, f6Var));
        i6Var.w(g0.L(18.0f));
        i6Var.n(0.4f, 320L, xqVar);
        i6Var.x(g0.o());
        i6Var.u(-1);
        i6Var.q(true);
        i6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static k4 d(k4 k4Var, k4 k4Var2, k4 k4Var3) {
        if (k4Var3 != null) {
            RectF rectF = k4Var3.f9297n;
            if (k4Var != null || k4Var2 != null) {
                if (k4Var != null) {
                    RectF rectF2 = k4Var.f9297n;
                    if (k4Var2 != null) {
                        RectF rectF3 = k4Var2.f9297n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return k4Var;
                        }
                        return k4Var2;
                    }
                }
                if (k4Var != null) {
                    return k4Var;
                }
                return k4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f41990i0 - (this.f41993l0.d(this.f41992k0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, k4 k4Var, k4 k4Var2) {
        if (k4Var2 == null) {
            return;
        }
        RectF rectF = k4Var2.f9296m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * k4Var2.f9293j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = k4Var.f9296m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.S;
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
        if (t3.b0(p10.f24459s0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f41980b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f41982c0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f41983d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f41985e0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, k4 k4Var, k4 k4Var2, k4 k4Var3, Paint paint) {
        float width;
        boolean z9;
        double degrees;
        double degrees2;
        k4 k4Var4 = k4Var;
        RectF rectF = k4Var2.f9297n;
        if (k4Var4 == null && k4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (k4Var4 != null) {
            RectF rectF2 = k4Var4.f9297n;
            if (k4Var3 != null) {
                RectF rectF3 = k4Var3.f9297n;
                float centerX = rectF2.centerX();
                float width2 = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width3 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width4 = rectF3.width() / 2.0f;
                boolean z10 = false;
                if (centerX > centerX2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX - width2)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX + width2)) / 2.0f) - centerX2) / width3));
                }
                float f10 = (float) degrees;
                if (centerX3 > centerX2) {
                    z10 = true;
                }
                if (z10) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX3 - width4)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX3 + width4)) / 2.0f) - centerX2) / width3));
                }
                float f11 = (float) degrees2;
                if (z9 && z10) {
                    float max = Math.max(f10, f11);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z9) {
                    b(f11 + 180.0f, 180.0f - (f10 + f11), canvas, paint, rectF);
                    b(f10, (180.0f - f11) - f10, canvas, paint, rectF);
                    return;
                } else if (z10) {
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
        if (k4Var4 == null && k4Var3 == null) {
            return;
        }
        if (k4Var4 == null) {
            k4Var4 = k4Var3;
        }
        float centerX4 = k4Var4.f9297n.centerX();
        float width5 = k4Var4.f9297n.width() / 2.0f;
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
        if (i7 == qs.f25078v5) {
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
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42004y = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f42003x;
            if (i7 < arrayList.size()) {
                ((k4) arrayList.get(i7)).f9287b.P();
                i7++;
            } else {
                qs.f(this.f41981c).c(this, qs.f25078v5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.f42004y = false;
        while (true) {
            ArrayList arrayList = this.f42003x;
            if (i7 < arrayList.size()) {
                ((k4) arrayList.get(i7)).f9287b.R();
                i7++;
            } else {
                qs.f(this.f41981c).n(this, qs.f25078v5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.N < 0.9f) {
            z9 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f41987f0 && motionEvent.getX() <= this.f41988g0 && Math.abs(motionEvent.getY() - this.f41989h0) < g0.L(32.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        j4 j4Var = this.f41996o0;
        if (z9 && motionEvent.getAction() == 0) {
            this.f41997p0 = System.currentTimeMillis();
            this.f41998q0 = motionEvent.getX();
            this.f42000r0 = motionEvent.getY();
            g0.r(j4Var);
            g0.i3(j4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(j4Var);
            if (z9 && System.currentTimeMillis() - this.f41997p0 <= ViewConfiguration.getTapTimeout() && r9.a(this.f41998q0, this.f42000r0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                y6 y6Var = this.M;
                long j3 = this.d;
                if (y6Var.M(j3) || y6Var.K(j3) || !this.f42003x.isEmpty()) {
                    e(this.f41995n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f41997p0 = -1L;
            g0.r(j4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (k6.I.q()) {
            return;
        }
        this.O = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.N != f10) {
            this.N = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.I == f10) {
            return;
        }
        this.I = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.H == f10) {
            return;
        }
        this.H = f10;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f41994n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(n nVar) {
    }
}

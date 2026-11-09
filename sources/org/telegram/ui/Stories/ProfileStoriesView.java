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
import di.k4;
import di.l4;
import di.q7;
import di.y6;
import di.z6;
import java.util.ArrayList;
import org.telegram.messenger.g0;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ev0;
import org.telegram.ui.yv0;
public class ProfileStoriesView extends View implements ls {
    public static final int f41986s0 = 0;
    public eh0 D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public y6 K;
    public final q7 L;
    public final z6 M;
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
    public final Paint f41987a;
    public ValueAnimator f41988a0;
    public final Paint f41989b;
    public final Path f41990b0;
    public final int f41991c;
    public final Matrix f41992c0;
    public final long d;
    public final PathMeasure f41993d0;
    public final boolean f41994e;
    public final Path f41995e0;
    public final View f41996f;
    public float f41997f0;
    public float f41998g0;
    public final yv0 h;
    public float f41999h0;
    public float f42000i0;
    public float f42001j0;
    public boolean f42002k0;
    public final w5 f42003l0;
    public final w5 m0;
    public final i6 f42004n;
    public final n f42005n0;
    public final k4 f42006o0;
    public long f42007p0;
    public float f42008q0;
    public int f42009r;
    public float f42010r0;
    public int f42011s;
    public l4 f42012w;
    public final ArrayList f42013x;
    public boolean f42014y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z9, View view, yv0 yv0Var, g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f41987a = paint;
        Paint paint2 = new Paint(1);
        this.f41989b = paint2;
        Paint paint3 = new Paint(1);
        i6 i6Var = new i6(false, true, true);
        this.f42004n = i6Var;
        Paint paint4 = new Paint(1);
        this.f42013x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new q7(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        xq xqVar = xq.h;
        this.T = new w5(this, 0L, 480L, xqVar);
        this.U = new w5(this, 0L, 240L, xqVar);
        this.V = new w5(this, 0L, 150L, xq.f40458f);
        this.W = 1.0f;
        this.f41990b0 = new Path();
        this.f41992c0 = new Matrix();
        this.f41993d0 = new PathMeasure();
        this.f41995e0 = new Path();
        this.f42003l0 = new w5(this, 0L, 350L, xqVar);
        this.m0 = new w5(this, 0L, 350L, xqVar);
        ev0 ev0Var = (ev0) this;
        this.f42005n0 = new n(ev0Var, 14);
        this.f42006o0 = new k4(ev0Var, 0);
        this.f41991c = i7;
        this.d = j3;
        this.f41994e = z9;
        this.f41996f = view;
        this.h = yv0Var;
        yv0Var.getImageReceiver().E1 = new k4(ev0Var, 1);
        this.M = qp.s1(i7).P1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(l6.w0(l6.bl, g6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(l6.w0(l6.f27865d6, g6Var));
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

    public static l4 d(l4 l4Var, l4 l4Var2, l4 l4Var3) {
        if (l4Var3 != null) {
            RectF rectF = l4Var3.f9321n;
            if (l4Var != null || l4Var2 != null) {
                if (l4Var != null) {
                    RectF rectF2 = l4Var.f9321n;
                    if (l4Var2 != null) {
                        RectF rectF3 = l4Var2.f9321n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return l4Var;
                        }
                        return l4Var2;
                    }
                }
                if (l4Var != null) {
                    return l4Var;
                }
                return l4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f42000i0 - (this.f42003l0.d(this.f42002k0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, l4 l4Var, l4 l4Var2) {
        if (l4Var2 == null) {
            return;
        }
        RectF rectF = l4Var2.f9320m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * l4Var2.f9317j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = l4Var.f9320m;
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
        if (t3.b0(p10.f24470s0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f41990b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f41992c0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f41993d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f41995e0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, l4 l4Var, l4 l4Var2, l4 l4Var3, Paint paint) {
        float width;
        boolean z9;
        double degrees;
        double degrees2;
        l4 l4Var4 = l4Var;
        RectF rectF = l4Var2.f9321n;
        if (l4Var4 == null && l4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (l4Var4 != null) {
            RectF rectF2 = l4Var4.f9321n;
            if (l4Var3 != null) {
                RectF rectF3 = l4Var3.f9321n;
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
        if (l4Var4 == null && l4Var3 == null) {
            return;
        }
        if (l4Var4 == null) {
            l4Var4 = l4Var3;
        }
        float centerX4 = l4Var4.f9321n.centerX();
        float width5 = l4Var4.f9321n.width() / 2.0f;
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
        if (i7 == qs.f25095v5) {
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
        this.f42014y = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f42013x;
            if (i7 < arrayList.size()) {
                ((l4) arrayList.get(i7)).f9311b.P();
                i7++;
            } else {
                qs.f(this.f41991c).c(this, qs.f25095v5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.f42014y = false;
        while (true) {
            ArrayList arrayList = this.f42013x;
            if (i7 < arrayList.size()) {
                ((l4) arrayList.get(i7)).f9311b.R();
                i7++;
            } else {
                qs.f(this.f41991c).n(this, qs.f25095v5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.N < 0.9f) {
            z9 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f41997f0 && motionEvent.getX() <= this.f41998g0 && Math.abs(motionEvent.getY() - this.f41999h0) < g0.L(32.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        k4 k4Var = this.f42006o0;
        if (z9 && motionEvent.getAction() == 0) {
            this.f42007p0 = System.currentTimeMillis();
            this.f42008q0 = motionEvent.getX();
            this.f42010r0 = motionEvent.getY();
            g0.r(k4Var);
            g0.i3(k4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(k4Var);
            if (z9 && System.currentTimeMillis() - this.f42007p0 <= ViewConfiguration.getTapTimeout() && r9.a(this.f42008q0, this.f42010r0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                z6 z6Var = this.M;
                long j3 = this.d;
                if (z6Var.M(j3) || z6Var.K(j3) || !this.f42013x.isEmpty()) {
                    e(this.f42005n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f42007p0 = -1L;
            g0.r(k4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (l6.I.q()) {
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
        if (drawable != this.f42004n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(n nVar) {
    }
}

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
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
import org.telegram.ui.fv0;
import org.telegram.ui.zv0;
public class ProfileStoriesView extends View implements ls {
    public static final int f41977s0 = 0;
    public dh0 D;
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
    public final v5 T;
    public final v5 U;
    public final v5 V;
    public float W;
    public final Paint f41978a;
    public ValueAnimator f41979a0;
    public final Paint f41980b;
    public final Path f41981b0;
    public final int f41982c;
    public final Matrix f41983c0;
    public final long d;
    public final PathMeasure f41984d0;
    public final boolean f41985e;
    public final Path f41986e0;
    public final View f41987f;
    public float f41988f0;
    public float f41989g0;
    public final zv0 h;
    public float f41990h0;
    public float f41991i0;
    public float f41992j0;
    public boolean f41993k0;
    public final v5 f41994l0;
    public final v5 m0;
    public final h6 f41995n;
    public final n f41996n0;
    public final k4 f41997o0;
    public long f41998p0;
    public float f41999q0;
    public int f42000r;
    public float f42001r0;
    public int f42002s;
    public l4 f42003w;
    public final ArrayList f42004x;
    public boolean f42005y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z9, View view, zv0 zv0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f41978a = paint;
        Paint paint2 = new Paint(1);
        this.f41980b = paint2;
        Paint paint3 = new Paint(1);
        h6 h6Var2 = new h6(false, true, true);
        this.f41995n = h6Var2;
        Paint paint4 = new Paint(1);
        this.f42004x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new q7(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        wq wqVar = wq.h;
        this.T = new v5(this, 0L, 480L, wqVar);
        this.U = new v5(this, 0L, 240L, wqVar);
        this.V = new v5(this, 0L, 150L, wq.f40046f);
        this.W = 1.0f;
        this.f41981b0 = new Path();
        this.f41983c0 = new Matrix();
        this.f41984d0 = new PathMeasure();
        this.f41986e0 = new Path();
        this.f41994l0 = new v5(this, 0L, 350L, wqVar);
        this.m0 = new v5(this, 0L, 350L, wqVar);
        fv0 fv0Var = (fv0) this;
        this.f41996n0 = new n(fv0Var, 14);
        this.f41997o0 = new k4(fv0Var, 0);
        this.f41982c = i7;
        this.d = j3;
        this.f41985e = z9;
        this.f41987f = view;
        this.h = zv0Var;
        zv0Var.getImageReceiver().E1 = new k4(fv0Var, 1);
        this.M = qp.s1(i7).P1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(m6.w0(m6.bl, h6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(m6.w0(m6.f27890d6, h6Var));
        h6Var2.w(g0.L(18.0f));
        h6Var2.n(0.4f, 320L, wqVar);
        h6Var2.x(g0.o());
        h6Var2.u(-1);
        h6Var2.q(true);
        h6Var2.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static l4 d(l4 l4Var, l4 l4Var2, l4 l4Var3) {
        if (l4Var3 != null) {
            RectF rectF = l4Var3.f9326n;
            if (l4Var != null || l4Var2 != null) {
                if (l4Var != null) {
                    RectF rectF2 = l4Var.f9326n;
                    if (l4Var2 != null) {
                        RectF rectF3 = l4Var2.f9326n;
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
        return this.f41991i0 - (this.f41994l0.d(this.f41993k0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, l4 l4Var, l4 l4Var2) {
        if (l4Var2 == null) {
            return;
        }
        RectF rectF = l4Var2.f9325m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * l4Var2.f9322j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = l4Var.f9325m;
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
        if (t3.b0(p10.f24474s0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f41981b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f41983c0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f41984d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f41986e0;
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
        RectF rectF = l4Var2.f9326n;
        if (l4Var4 == null && l4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (l4Var4 != null) {
            RectF rectF2 = l4Var4.f9326n;
            if (l4Var3 != null) {
                RectF rectF3 = l4Var3.f9326n;
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
        float centerX4 = l4Var4.f9326n.centerX();
        float width5 = l4Var4.f9326n.width() / 2.0f;
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
        if (i7 == qs.f25099v5) {
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
        this.f42005y = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f42004x;
            if (i7 < arrayList.size()) {
                ((l4) arrayList.get(i7)).f9316b.P();
                i7++;
            } else {
                qs.f(this.f41982c).c(this, qs.f25099v5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.f42005y = false;
        while (true) {
            ArrayList arrayList = this.f42004x;
            if (i7 < arrayList.size()) {
                ((l4) arrayList.get(i7)).f9316b.R();
                i7++;
            } else {
                qs.f(this.f41982c).n(this, qs.f25099v5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (this.N < 0.9f) {
            z9 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f41988f0 && motionEvent.getX() <= this.f41989g0 && Math.abs(motionEvent.getY() - this.f41990h0) < g0.L(32.0f)) {
            z9 = true;
        } else {
            z9 = false;
        }
        k4 k4Var = this.f41997o0;
        if (z9 && motionEvent.getAction() == 0) {
            this.f41998p0 = System.currentTimeMillis();
            this.f41999q0 = motionEvent.getX();
            this.f42001r0 = motionEvent.getY();
            g0.r(k4Var);
            g0.i3(k4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(k4Var);
            if (z9 && System.currentTimeMillis() - this.f41998p0 <= ViewConfiguration.getTapTimeout() && r9.a(this.f41999q0, this.f42001r0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                z6 z6Var = this.M;
                long j3 = this.d;
                if (z6Var.M(j3) || z6Var.K(j3) || !this.f42004x.isEmpty()) {
                    e(this.f41996n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f41998p0 = -1L;
            g0.r(k4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (m6.I.q()) {
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
        if (drawable != this.f41995n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(n nVar) {
    }
}

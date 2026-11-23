package org.telegram.ui.Stories;

import a8.x9;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.gs;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.v3;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.dv0;
import org.telegram.ui.xv0;
public class ProfileStoriesView extends View implements gs {
    public static final int f43807t0 = 0;
    public sh0 E;
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
    public final d6 U;
    public final d6 V;
    public final d6 W;
    public final Paint f43808a;
    public float f43809a0;
    public final Paint f43810b;
    public ValueAnimator f43811b0;
    public final int f43812c;
    public final Path f43813c0;
    public final long d;
    public final Matrix f43814d0;
    public final boolean f43815e;
    public final PathMeasure f43816e0;
    public final View f43817f;
    public final Path f43818f0;
    public float f43819g0;
    public final xv0 h;
    public float f43820h0;
    public float f43821i0;
    public float f43822j0;
    public float f43823k0;
    public boolean f43824l0;
    public final d6 m0;
    public final n6 f43825n;
    public final d6 f43826n0;
    public final i f43827o0;
    public final a4 f43828p0;
    public long f43829q0;
    public int f43830r;
    public float f43831r0;
    public int f43832s;
    public float f43833s0;
    public b4 f43834w;
    public final ArrayList f43835x;
    public boolean f43836y;

    public ProfileStoriesView(Context context, int i7, long j3, boolean z10, View view, xv0 xv0Var, h6 h6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f43808a = paint;
        Paint paint2 = new Paint(1);
        this.f43810b = paint2;
        Paint paint3 = new Paint(1);
        n6 n6Var = new n6(false, true, true);
        this.f43825n = n6Var;
        Paint paint4 = new Paint(1);
        this.f43835x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new g7(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        nr nrVar = nr.h;
        this.U = new d6(this, 0L, 480L, nrVar);
        this.V = new d6(this, 0L, 240L, nrVar);
        this.W = new d6(this, 0L, 150L, nr.f37917f);
        this.f43809a0 = 1.0f;
        this.f43813c0 = new Path();
        this.f43814d0 = new Matrix();
        this.f43816e0 = new PathMeasure();
        this.f43818f0 = new Path();
        this.m0 = new d6(this, 0L, 350L, nrVar);
        this.f43826n0 = new d6(this, 0L, 350L, nrVar);
        dv0 dv0Var = (dv0) this;
        this.f43827o0 = new i(dv0Var, 21);
        this.f43828p0 = new a4(dv0Var, 0);
        this.f43812c = i7;
        this.d = j3;
        this.f43815e = z10;
        this.f43817f = view;
        this.h = xv0Var;
        xv0Var.getImageReceiver().F1 = new a4(dv0Var, 1);
        this.N = np.u1(i7).R1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(m6.w0(m6.el, h6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(m6.w0(m6.f29347d6, h6Var));
        n6Var.w(g0.L(18.0f));
        n6Var.n(0.4f, 320L, nrVar);
        n6Var.x(g0.o());
        n6Var.u(-1);
        n6Var.q(true);
        n6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static b4 d(b4 b4Var, b4 b4Var2, b4 b4Var3) {
        if (b4Var3 != null) {
            RectF rectF = b4Var3.f11771n;
            if (b4Var != null || b4Var2 != null) {
                if (b4Var != null) {
                    RectF rectF2 = b4Var.f11771n;
                    if (b4Var2 != null) {
                        RectF rectF3 = b4Var2.f11771n;
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
        return this.f43822j0 - (this.m0.d(this.f43824l0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, b4 b4Var, b4 b4Var2) {
        if (b4Var2 == null) {
            return;
        }
        RectF rectF = b4Var2.f11770m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * b4Var2.f11767j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = b4Var.f11770m;
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
        if (v3.b0(k10.f24932t0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f43813c0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f43814d0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f43816e0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f43818f0;
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
        RectF rectF = b4Var2.f11771n;
        if (b4Var4 == null && b4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (b4Var4 != null) {
            RectF rectF2 = b4Var4.f11771n;
            if (b4Var3 != null) {
                RectF rectF3 = b4Var3.f11771n;
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
        float centerX4 = b4Var4.f11771n.centerX();
        float width5 = b4Var4.f11771n.width() / 2.0f;
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
        if (i7 == ls.f25388y5) {
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
        this.f43836y = true;
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f43835x;
            if (i7 < arrayList.size()) {
                ((b4) arrayList.get(i7)).f11761b.P();
                i7++;
            } else {
                ls.f(this.f43812c).c(this, ls.f25388y5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        this.f43836y = false;
        while (true) {
            ArrayList arrayList = this.f43835x;
            if (i7 < arrayList.size()) {
                ((b4) arrayList.get(i7)).f11761b.R();
                i7++;
            } else {
                ls.f(this.f43812c).n(this, ls.f25388y5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.O < 0.9f) {
            z10 = this.R.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f43819g0 && motionEvent.getX() <= this.f43820h0 && Math.abs(motionEvent.getY() - this.f43821i0) < g0.L(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        a4 a4Var = this.f43828p0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f43829q0 = System.currentTimeMillis();
            this.f43831r0 = motionEvent.getX();
            this.f43833s0 = motionEvent.getY();
            g0.r(a4Var);
            g0.h3(a4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(a4Var);
            if (z10 && System.currentTimeMillis() - this.f43829q0 <= ViewConfiguration.getTapTimeout() && x9.a(this.f43831r0, this.f43833s0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                p6 p6Var = this.N;
                long j3 = this.d;
                if (p6Var.M(j3) || p6Var.K(j3) || !this.f43835x.isEmpty()) {
                    e(this.f43827o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f43829q0 = -1L;
            g0.r(a4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (m6.I.q()) {
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
        if (drawable != this.f43825n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

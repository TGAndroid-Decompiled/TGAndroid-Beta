package org.telegram.ui.Stories;

import a7.h;
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
import c6.i;
import ei.k4;
import ei.l4;
import ei.q7;
import ei.y6;
import ei.z6;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
import org.telegram.ui.nv0;
import org.telegram.ui.tu0;
public class ProfileStoriesView extends View implements cs {
    public static final int f42008t0 = 0;
    public gh0 E;
    public boolean F;
    public boolean G;
    public float H;
    public float I;
    public float J;
    public int K;
    public y6 L;
    public final q7 M;
    public final z6 N;
    public float O;
    public float P;
    public final RectF Q;
    public final RectF R;
    public final RectF S;
    public final Path T;
    public final u5 U;
    public final u5 V;
    public final u5 W;
    public final Paint f42009a;
    public float f42010a0;
    public final Paint f42011b;
    public ValueAnimator f42012b0;
    public final int f42013c;
    public final Path f42014c0;
    public final long d;
    public final Matrix f42015d0;
    public final boolean f42016e;
    public final PathMeasure f42017e0;
    public final View f42018f;
    public final Path f42019f0;
    public float f42020g0;
    public final nv0 h;
    public float f42021h0;
    public float f42022i0;
    public float f42023j0;
    public float f42024k0;
    public boolean f42025l0;
    public final u5 m0;
    public final g6 f42026n;
    public final u5 f42027n0;
    public final i f42028o0;
    public final k4 f42029p0;
    public long f42030q0;
    public int f42031r;
    public float f42032r0;
    public int f42033s;
    public float f42034s0;
    public l4 f42035w;
    public final ArrayList f42036x;
    public boolean f42037y;

    public ProfileStoriesView(Context context, int i3, long j10, boolean z10, View view, nv0 nv0Var, e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f42009a = paint;
        Paint paint2 = new Paint(1);
        this.f42011b = paint2;
        Paint paint3 = new Paint(1);
        g6 g6Var = new g6(false, true, true);
        this.f42026n = g6Var;
        Paint paint4 = new Paint(1);
        this.f42036x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.H = 1.0f;
        this.I = 1.0f;
        this.M = new q7(this);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new RectF();
        this.T = new Path();
        xq xqVar = xq.h;
        this.U = new u5(this, 0L, 480L, xqVar);
        this.V = new u5(this, 0L, 240L, xqVar);
        this.W = new u5(this, 0L, 150L, xq.f40452f);
        this.f42010a0 = 1.0f;
        this.f42014c0 = new Path();
        this.f42015d0 = new Matrix();
        this.f42017e0 = new PathMeasure();
        this.f42019f0 = new Path();
        this.m0 = new u5(this, 0L, 350L, xqVar);
        this.f42027n0 = new u5(this, 0L, 350L, xqVar);
        tu0 tu0Var = (tu0) this;
        this.f42028o0 = new i(tu0Var, 22);
        this.f42029p0 = new k4(tu0Var, 0);
        this.f42013c = i3;
        this.d = j10;
        this.f42016e = z10;
        this.f42018f = view;
        this.h = nv0Var;
        nv0Var.getImageReceiver().F1 = new k4(tu0Var, 1);
        this.N = hp.s1(i3).P1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(g0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(k6.w0(k6.bl, e6Var));
        paint2.setStrokeWidth(g0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(k6.w0(k6.f27878d6, e6Var));
        g6Var.w(g0.L(18.0f));
        g6Var.n(0.4f, 320L, xqVar);
        g6Var.x(g0.o());
        g6Var.u(-1);
        g6Var.q(true);
        g6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(g0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static l4 d(l4 l4Var, l4 l4Var2, l4 l4Var3) {
        if (l4Var3 != null) {
            RectF rectF = l4Var3.f10616n;
            if (l4Var != null || l4Var2 != null) {
                if (l4Var != null) {
                    RectF rectF2 = l4Var.f10616n;
                    if (l4Var2 != null) {
                        RectF rectF3 = l4Var2.f10616n;
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
        return this.f42023j0 - (this.m0.d(this.f42025l0) * g0.L(71.0f));
    }

    public final void a(Canvas canvas, l4 l4Var, l4 l4Var2) {
        if (l4Var2 == null) {
            return;
        }
        RectF rectF = l4Var2.f10615m;
        RectF rectF2 = g0.P;
        rectF2.set(rectF);
        float f10 = -(g0.N(1.66f) * l4Var2.f10612j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = l4Var.f10615m;
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
        if (t3.b0(h10.f22829t0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.f42014c0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f42015d0;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f42017e0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f42019f0;
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
        boolean z10;
        double degrees;
        double degrees2;
        l4 l4Var4 = l4Var;
        RectF rectF = l4Var2.f10616n;
        if (l4Var4 == null && l4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (l4Var4 != null) {
            RectF rectF2 = l4Var4.f10616n;
            if (l4Var3 != null) {
                RectF rectF3 = l4Var3.f10616n;
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
        if (l4Var4 == null && l4Var3 == null) {
            return;
        }
        if (l4Var4 == null) {
            l4Var4 = l4Var3;
        }
        float centerX4 = l4Var4.f10616n.centerX();
        float width5 = l4Var4.f10616n.width() / 2.0f;
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23324v5) {
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
        this.f42037y = true;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f42036x;
            if (i3 < arrayList.size()) {
                ((l4) arrayList.get(i3)).f10606b.P();
                i3++;
            } else {
                hs.f(this.f42013c).c(this, hs.f23324v5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        this.f42037y = false;
        while (true) {
            ArrayList arrayList = this.f42036x;
            if (i3 < arrayList.size()) {
                ((l4) arrayList.get(i3)).f10606b.R();
                i3++;
            } else {
                hs.f(this.f42013c).n(this, hs.f23324v5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.O < 0.9f) {
            z10 = this.R.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f42020g0 && motionEvent.getX() <= this.f42021h0 && Math.abs(motionEvent.getY() - this.f42022i0) < g0.L(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        k4 k4Var = this.f42029p0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f42030q0 = System.currentTimeMillis();
            this.f42032r0 = motionEvent.getX();
            this.f42034s0 = motionEvent.getY();
            g0.r(k4Var);
            g0.i3(k4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            g0.r(k4Var);
            if (z10 && System.currentTimeMillis() - this.f42030q0 <= ViewConfiguration.getTapTimeout() && h.a(this.f42032r0, this.f42034s0, motionEvent.getX(), motionEvent.getY()) <= g0.L(12.0f)) {
                z6 z6Var = this.N;
                long j10 = this.d;
                if (z6Var.M(j10) || z6Var.K(j10) || !this.f42036x.isEmpty()) {
                    e(this.f42028o0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f42030q0 = -1L;
            g0.r(k4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (k6.I.q()) {
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
        if (drawable != this.f42026n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

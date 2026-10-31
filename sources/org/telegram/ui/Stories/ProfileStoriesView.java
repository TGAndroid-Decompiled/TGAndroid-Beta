package org.telegram.ui.Stories;

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
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.i0;
import org.telegram.messenger.us;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.zs;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.t5;
import org.telegram.ui.jx0;
import org.telegram.ui.mw0;
import r2.y;
import th.b3;
import th.c3;
import th.d5;
import th.e5;
import th.u5;
import w7.z8;
public class ProfileStoriesView extends View implements us {
    public static final int f34056s0 = 0;
    public fi0 D;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public d5 K;
    public final u5 L;
    public final e5 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final t5 T;
    public final t5 U;
    public final t5 V;
    public float W;
    public final Paint f34057a;
    public ValueAnimator f34058a0;
    public final Paint f34059b;
    public final Path f34060b0;
    public final int f34061c;
    public final Matrix f34062c0;
    public final long d;
    public final PathMeasure f34063d0;
    public final boolean e;
    public final Path f34064e0;
    public final View f34065f;
    public float f34066f0;
    public float f34067g0;
    public final jx0 h;
    public float f34068h0;
    public float f34069i0;
    public float f34070j0;
    public boolean f34071k0;
    public final t5 f34072l0;
    public final t5 m0;
    public final e6 f34073n;
    public final y f34074n0;
    public final b3 f34075o0;
    public long f34076p0;
    public float f34077q0;
    public int f34078r;
    public float f34079r0;
    public int f34080s;
    public c3 f34081w;
    public final ArrayList f34082x;
    public boolean f34083y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, jx0 jx0Var, p6 p6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34057a = paint;
        Paint paint2 = new Paint(1);
        this.f34059b = paint2;
        Paint paint3 = new Paint(1);
        e6 e6Var = new e6(false, true, true);
        this.f34073n = e6Var;
        Paint paint4 = new Paint(1);
        this.f34082x = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new u5(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        gr grVar = gr.h;
        this.T = new t5(this, 0L, 480L, grVar);
        this.U = new t5(this, 0L, 240L, grVar);
        this.V = new t5(this, 0L, 150L, gr.f26495f);
        this.W = 1.0f;
        this.f34060b0 = new Path();
        this.f34062c0 = new Matrix();
        this.f34063d0 = new PathMeasure();
        this.f34064e0 = new Path();
        this.f34072l0 = new t5(this, 0L, 350L, grVar);
        this.m0 = new t5(this, 0L, 350L, grVar);
        mw0 mw0Var = (mw0) this;
        this.f34074n0 = new y(mw0Var, 8);
        this.f34075o0 = new b3(mw0Var, 0);
        this.f34061c = i10;
        this.d = j10;
        this.e = z10;
        this.f34065f = view;
        this.h = jx0Var;
        jx0Var.getImageReceiver().E1 = new b3(mw0Var, 1);
        this.M = vp.r1(i10).O1();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(i0.N(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(t6.w0(t6.bl, p6Var));
        paint2.setStrokeWidth(i0.N(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(t6.w0(t6.f20929d6, p6Var));
        e6Var.w(i0.L(18.0f));
        e6Var.n(0.4f, 320L, grVar);
        e6Var.x(i0.o());
        e6Var.u(-1);
        e6Var.q(true);
        e6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(i0.N(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static c3 d(c3 c3Var, c3 c3Var2, c3 c3Var3) {
        if (c3Var3 != null) {
            RectF rectF = c3Var3.f48840n;
            if (c3Var != null || c3Var2 != null) {
                if (c3Var != null) {
                    RectF rectF2 = c3Var.f48840n;
                    if (c3Var2 != null) {
                        RectF rectF3 = c3Var2.f48840n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return c3Var;
                        }
                        return c3Var2;
                    }
                }
                if (c3Var != null) {
                    return c3Var;
                }
                return c3Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f34069i0 - (this.f34072l0.d(this.f34071k0) * i0.L(71.0f));
    }

    public final void a(Canvas canvas, c3 c3Var, c3 c3Var2) {
        if (c3Var2 == null) {
            return;
        }
        RectF rectF = c3Var2.f48839m;
        RectF rectF2 = i0.P;
        rectF2.set(rectF);
        float f7 = -(i0.N(1.66f) * c3Var2.f48836j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = c3Var.f48839m;
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
            float f10 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f10);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f10));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f7, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (w3.b0(d20.f15147s0, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = f7 + f10;
            float f12 = (((int) f11) / 90) * 90;
            float f13 = (-199.0f) + f12;
            Path path = this.f34060b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f34062c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f34063d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f34064e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, c3 c3Var, c3 c3Var2, c3 c3Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        c3 c3Var4 = c3Var;
        RectF rectF = c3Var2.f48840n;
        if (c3Var4 == null && c3Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (c3Var4 != null) {
            RectF rectF2 = c3Var4.f48840n;
            if (c3Var3 != null) {
                RectF rectF3 = c3Var3.f48840n;
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
                float f7 = (float) degrees;
                if (centerX3 > centerX2) {
                    z11 = true;
                }
                if (z11) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width3) + (centerX3 - width4)) / 2.0f) - centerX2) / width3));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width3) + (centerX3 + width4)) / 2.0f) - centerX2) / width3));
                }
                float f10 = (float) degrees2;
                if (z10 && z11) {
                    float max = Math.max(f7, f10);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z10) {
                    b(f10 + 180.0f, 180.0f - (f7 + f10), canvas, paint, rectF);
                    b(f7, (180.0f - f10) - f7, canvas, paint, rectF);
                    return;
                } else if (z11) {
                    b(f7 + 180.0f, 180.0f - (f10 + f7), canvas, paint, rectF);
                    b(f10, (180.0f - f10) - f7, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(f7, f10);
                    b(max2 + 180.0f, 360.0f - (max2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        }
        if (c3Var4 == null && c3Var3 == null) {
            return;
        }
        if (c3Var4 == null) {
            c3Var4 = c3Var3;
        }
        float centerX4 = c3Var4.f48840n.centerX();
        float width5 = c3Var4.f48840n.width() / 2.0f;
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
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.f19709v5) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.f(boolean, boolean):void");
    }

    public float getFragmentTransitionProgress() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34083y = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34082x;
            if (i10 < arrayList.size()) {
                ((c3) arrayList.get(i10)).f48831b.P();
                i10++;
            } else {
                zs.f(this.f34061c).c(this, zs.f19709v5);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f34083y = false;
        while (true) {
            ArrayList arrayList = this.f34082x;
            if (i10 < arrayList.size()) {
                ((c3) arrayList.get(i10)).f48831b.R();
                i10++;
            } else {
                zs.f(this.f34061c).n(this, zs.f19709v5);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f34066f0 && motionEvent.getX() <= this.f34067g0 && Math.abs(motionEvent.getY() - this.f34068h0) < i0.L(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        b3 b3Var = this.f34075o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f34076p0 = System.currentTimeMillis();
            this.f34077q0 = motionEvent.getX();
            this.f34079r0 = motionEvent.getY();
            i0.r(b3Var);
            i0.h3(b3Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            i0.r(b3Var);
            if (z10 && System.currentTimeMillis() - this.f34076p0 <= ViewConfiguration.getTapTimeout() && z8.a(this.f34077q0, this.f34079r0, motionEvent.getX(), motionEvent.getY()) <= i0.L(12.0f)) {
                e5 e5Var = this.M;
                long j10 = this.d;
                if (e5Var.M(j10) || e5Var.K(j10) || !this.f34082x.isEmpty()) {
                    e(this.f34074n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f34076p0 = -1L;
            i0.r(b3Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (t6.I.q()) {
            return;
        }
        this.O = f7;
        invalidate();
    }

    public void setExpandProgress(float f7) {
        if (this.N != f7) {
            this.N = f7;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f7) {
        if (this.I == f7) {
            return;
        }
        this.I = f7;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f7) {
        if (this.H == f7) {
            return;
        }
        this.H = f7;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34073n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(y yVar) {
    }
}

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
import k7.o6;
import oh.g4;
import oh.h4;
import oh.i4;
import oh.k7;
import oh.s6;
import oh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.fz0;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f34841p0 = 0;
    public boolean B;
    public boolean C;
    public float D;
    public float E;
    public float F;
    public int G;
    public s6 H;
    public final k7 I;
    public final t6 J;
    public float K;
    public float L;
    public final RectF M;
    public final RectF N;
    public final RectF O;
    public final Path P;
    public final z5 Q;
    public final z5 R;
    public final z5 S;
    public float T;
    public ValueAnimator U;
    public final Path V;
    public final Matrix W;
    public final Paint f34842a;
    public final PathMeasure f34843a0;
    public final Paint f34844b;
    public final Path f34845b0;
    public final int f34846c;
    public float f34847c0;
    public final long d;
    public float f34848d0;
    public final boolean f34849e;
    public float f34850e0;
    public final View f34851f;
    public float f34852f0;
    public float f34853g0;
    public final a01 h;
    public boolean f34854h0;
    public final z5 f34855i0;
    public final z5 f34856j0;
    public final h4 f34857k0;
    public final g4 f34858l0;
    public long m0;
    public final j6 f34859n;
    public float f34860n0;
    public float f34861o0;
    public int f34862r;
    public int f34863s;
    public i4 v;
    public final ArrayList f34864w;
    public boolean f34865x;
    public lj0 f34866y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z4, View view, a01 a01Var, g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34842a = paint;
        Paint paint2 = new Paint(1);
        this.f34844b = paint2;
        Paint paint3 = new Paint(1);
        j6 j6Var = new j6(false, true, true, false);
        this.f34859n = j6Var;
        Paint paint4 = new Paint(1);
        this.f34864w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.D = 1.0f;
        this.E = 1.0f;
        this.I = new k7(this);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new Path();
        pr prVar = pr.h;
        this.Q = new z5(this, 0L, 480L, prVar);
        this.R = new z5(this, 0L, 240L, prVar);
        this.S = new z5(this, 0L, 150L, pr.f30168f);
        this.T = 1.0f;
        this.V = new Path();
        this.W = new Matrix();
        this.f34843a0 = new PathMeasure();
        this.f34845b0 = new Path();
        this.f34855i0 = new z5(this, 0L, 350L, prVar);
        this.f34856j0 = new z5(this, 0L, 350L, prVar);
        final fz0 fz0Var = (fz0) this;
        this.f34857k0 = new h4(fz0Var, 0);
        this.f34858l0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                fz0 fz0Var2 = fz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34841p0;
                        fz0Var2.f36943r0.w4(false);
                        return;
                    default:
                        fz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f34846c = i10;
        this.d = j10;
        this.f34849e = z4;
        this.f34851f = view;
        this.h = a01Var;
        a01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                fz0 fz0Var2 = fz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34841p0;
                        fz0Var2.f36943r0.w4(false);
                        return;
                    default:
                        fz0Var2.invalidate();
                        return;
                }
            }
        });
        this.J = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(k6.v0(k6.nk, g6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(k6.v0(k6.f21661d6, g6Var));
        j6Var.t(AndroidUtilities.dp(18.0f));
        j6Var.k(0.4f, 320L, prVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.r(-1);
        j6Var.n(true);
        j6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static i4 d(i4 i4Var, i4 i4Var2, i4 i4Var3) {
        if (i4Var3 != null) {
            RectF rectF = i4Var3.f17220n;
            if (i4Var != null || i4Var2 != null) {
                if (i4Var != null) {
                    RectF rectF2 = i4Var.f17220n;
                    if (i4Var2 != null) {
                        RectF rectF3 = i4Var2.f17220n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return i4Var;
                        }
                        return i4Var2;
                    }
                }
                if (i4Var != null) {
                    return i4Var;
                }
                return i4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f34852f0 - (this.f34855i0.e(this.f34854h0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, i4 i4Var, i4 i4Var2) {
        if (i4Var2 == null) {
            return;
        }
        RectF rectF = i4Var2.f17219m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f10 = -(AndroidUtilities.dpf2(1.66f) * i4Var2.f17216j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = i4Var.f17219m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.P;
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
        if (ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.V;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.W;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f34843a0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f34845b0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, i4 i4Var, i4 i4Var2, i4 i4Var3, Paint paint) {
        boolean z4;
        double degrees;
        double degrees2;
        i4 i4Var4 = i4Var;
        RectF rectF = i4Var2.f17220n;
        if (i4Var4 == null && i4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (i4Var4 != null) {
            RectF rectF2 = i4Var4.f17220n;
            if (i4Var3 != null) {
                RectF rectF3 = i4Var3.f17220n;
                float centerX = rectF2.centerX();
                float width = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width2 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width3 = rectF3.width() / 2.0f;
                boolean z10 = false;
                if (centerX > centerX2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2));
                } else {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2));
                }
                float f10 = (float) degrees;
                if (centerX3 > centerX2) {
                    z10 = true;
                }
                if (z10) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX3 - width3)) / 2.0f) - centerX2) / width2));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX3 + width3)) / 2.0f) - centerX2) / width2));
                }
                float f11 = (float) degrees2;
                if (z4 && z10) {
                    float max = Math.max(f10, f11);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z4) {
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
        if (i4Var4 == null && i4Var3 == null) {
            return;
        }
        if (i4Var4 == null) {
            i4Var4 = i4Var3;
        }
        float centerX4 = i4Var4.f17220n.centerX();
        float width4 = i4Var4.f17220n.width() / 2.0f;
        float centerX5 = rectF.centerX();
        float width5 = rectF.width() / 2.0f;
        if (Math.abs(centerX4 - centerX5) > width4 + width5) {
            b(0.0f, 360.0f, canvas, paint, rectF);
        } else if (centerX4 > centerX5) {
            float degrees3 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 + width5) + (centerX4 - width4)) / 2.0f) - centerX5) / width5));
            b(degrees3, 360.0f - (2.0f * degrees3), canvas, paint, rectF);
        } else {
            float degrees4 = (float) Math.toDegrees(Math.acos(Math.abs((((centerX5 - width5) + (centerX4 + width4)) / 2.0f) - centerX5) / width5));
            b(degrees4 + 180.0f, 360.0f - (degrees4 * 2.0f), canvas, paint, rectF);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.storiesUpdated) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.f(boolean, boolean):void");
    }

    public float getFragmentTransitionProgress() {
        return this.F;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f34865x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34864w;
            if (i10 < arrayList.size()) {
                ((i4) arrayList.get(i10)).f17210b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f34846c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f34865x = false;
        while (true) {
            ArrayList arrayList = this.f34864w;
            if (i10 < arrayList.size()) {
                ((i4) arrayList.get(i10)).f17210b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f34846c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.K < 0.9f) {
            z4 = this.N.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f34847c0 && motionEvent.getX() <= this.f34848d0 && Math.abs(motionEvent.getY() - this.f34850e0) < AndroidUtilities.dp(32.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        g4 g4Var = this.f34858l0;
        if (z4 && motionEvent.getAction() == 0) {
            this.m0 = System.currentTimeMillis();
            this.f34860n0 = motionEvent.getX();
            this.f34861o0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(g4Var);
            AndroidUtilities.runOnUIThread(g4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(g4Var);
            if (z4 && System.currentTimeMillis() - this.m0 <= ViewConfiguration.getTapTimeout() && o6.a(this.f34860n0, this.f34861o0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                t6 t6Var = this.J;
                long j10 = this.d;
                if (t6Var.K(j10) || t6Var.I(j10) || !this.f34864w.isEmpty()) {
                    e(this.f34857k0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.m0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(g4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (k6.I.q()) {
            return;
        }
        this.L = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.K != f10) {
            this.K = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.F == f10) {
            return;
        }
        this.F = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34859n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(h4 h4Var) {
    }
}

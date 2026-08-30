package org.telegram.ui.Stories;

import a3.c;
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
import k7.n6;
import nh.f4;
import nh.g4;
import nh.k7;
import nh.s6;
import nh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.tz0;
import org.telegram.ui.zy0;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f32303p0 = 0;
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
    public final Paint f32304a;
    public final PathMeasure f32305a0;
    public final Paint f32306b;
    public final Path f32307b0;
    public final int f32308c;
    public float f32309c0;
    public final long d;
    public float f32310d0;
    public final boolean e;
    public float f32311e0;
    public final View f32312f;
    public float f32313f0;
    public float f32314g0;
    public final tz0 h;
    public boolean f32315h0;
    public final z5 f32316i0;
    public final z5 f32317j0;
    public final c f32318k0;
    public final f4 f32319l0;
    public long m0;
    public final j6 f32320n;
    public float f32321n0;
    public float f32322o0;
    public int f32323r;
    public int f32324s;
    public g4 v;
    public final ArrayList f32325w;
    public boolean f32326x;
    public kj0 f32327y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z4, View view, tz0 tz0Var, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f32304a = paint;
        Paint paint2 = new Paint(1);
        this.f32306b = paint2;
        Paint paint3 = new Paint(1);
        j6 j6Var = new j6(false, true, true, false);
        this.f32320n = j6Var;
        Paint paint4 = new Paint(1);
        this.f32325w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.D = 1.0f;
        this.E = 1.0f;
        this.I = new k7(this);
        this.M = new RectF();
        this.N = new RectF();
        this.O = new RectF();
        this.P = new Path();
        nr nrVar = nr.h;
        this.Q = new z5(this, 0L, 480L, nrVar);
        this.R = new z5(this, 0L, 240L, nrVar);
        this.S = new z5(this, 0L, 150L, nr.f27346f);
        this.T = 1.0f;
        this.V = new Path();
        this.W = new Matrix();
        this.f32305a0 = new PathMeasure();
        this.f32307b0 = new Path();
        this.f32316i0 = new z5(this, 0L, 350L, nrVar);
        this.f32317j0 = new z5(this, 0L, 350L, nrVar);
        final zy0 zy0Var = (zy0) this;
        this.f32318k0 = new c(zy0Var, 26);
        this.f32319l0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                zy0 zy0Var2 = zy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f32303p0;
                        zy0Var2.f40880r0.w4(false);
                        return;
                    default:
                        zy0Var2.invalidate();
                        return;
                }
            }
        };
        this.f32308c = i10;
        this.d = j10;
        this.e = z4;
        this.f32312f = view;
        this.h = tz0Var;
        tz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                zy0 zy0Var2 = zy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f32303p0;
                        zy0Var2.f40880r0.w4(false);
                        return;
                    default:
                        zy0Var2.invalidate();
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
        paint2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.nk, f6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
        j6Var.t(AndroidUtilities.dp(18.0f));
        j6Var.k(0.4f, 320L, nrVar);
        j6Var.u(AndroidUtilities.bold());
        j6Var.r(-1);
        j6Var.n(true);
        j6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static g4 d(g4 g4Var, g4 g4Var2, g4 g4Var3) {
        if (g4Var3 != null) {
            RectF rectF = g4Var3.f15360n;
            if (g4Var != null || g4Var2 != null) {
                if (g4Var != null) {
                    RectF rectF2 = g4Var.f15360n;
                    if (g4Var2 != null) {
                        RectF rectF3 = g4Var2.f15360n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return g4Var;
                        }
                        return g4Var2;
                    }
                }
                if (g4Var != null) {
                    return g4Var;
                }
                return g4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f32313f0 - (this.f32316i0.e(this.f32315h0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, g4 g4Var, g4 g4Var2) {
        if (g4Var2 == null) {
            return;
        }
        RectF rectF = g4Var2.f15359m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f10 = -(AndroidUtilities.dpf2(1.66f) * g4Var2.f15356j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = g4Var.f15359m;
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
            PathMeasure pathMeasure = this.f32305a0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f32307b0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, g4 g4Var, g4 g4Var2, g4 g4Var3, Paint paint) {
        boolean z4;
        double degrees;
        double degrees2;
        g4 g4Var4 = g4Var;
        RectF rectF = g4Var2.f15360n;
        if (g4Var4 == null && g4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (g4Var4 != null) {
            RectF rectF2 = g4Var4.f15360n;
            if (g4Var3 != null) {
                RectF rectF3 = g4Var3.f15360n;
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
        if (g4Var4 == null && g4Var3 == null) {
            return;
        }
        if (g4Var4 == null) {
            g4Var4 = g4Var3;
        }
        float centerX4 = g4Var4.f15360n.centerX();
        float width4 = g4Var4.f15360n.width() / 2.0f;
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
        this.f32326x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f32325w;
            if (i10 < arrayList.size()) {
                ((g4) arrayList.get(i10)).f15351b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f32308c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f32326x = false;
        while (true) {
            ArrayList arrayList = this.f32325w;
            if (i10 < arrayList.size()) {
                ((g4) arrayList.get(i10)).f15351b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f32308c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        if (this.K < 0.9f) {
            z4 = this.N.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f32309c0 && motionEvent.getX() <= this.f32310d0 && Math.abs(motionEvent.getY() - this.f32311e0) < AndroidUtilities.dp(32.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        f4 f4Var = this.f32319l0;
        if (z4 && motionEvent.getAction() == 0) {
            this.m0 = System.currentTimeMillis();
            this.f32321n0 = motionEvent.getX();
            this.f32322o0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            AndroidUtilities.runOnUIThread(f4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            if (z4 && System.currentTimeMillis() - this.m0 <= ViewConfiguration.getTapTimeout() && n6.a(this.f32321n0, this.f32322o0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                t6 t6Var = this.J;
                long j10 = this.d;
                if (t6Var.K(j10) || t6Var.I(j10) || !this.f32325w.isEmpty()) {
                    e(this.f32318k0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.m0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(f4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (org.telegram.ui.ActionBar.j6.I.q()) {
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
        if (drawable != this.f32320n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(c cVar) {
    }
}

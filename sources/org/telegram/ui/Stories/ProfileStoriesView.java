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
import bi.o9;
import bi.r5;
import bi.t5;
import bi.w8;
import bi.x8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.r01;
import org.telegram.ui.xz0;
import v7.f7;
import ya.c;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f32511s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public w8 K;
    public final o9 L;
    public final x8 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final g6 T;
    public final g6 U;
    public final g6 V;
    public float W;
    public final Paint f32512a;
    public ValueAnimator f32513a0;
    public final Paint f32514b;
    public final Path f32515b0;
    public final int f32516c;
    public final Matrix f32517c0;
    public final long d;
    public final PathMeasure f32518d0;
    public final boolean e;
    public final Path f32519e0;
    public final View f32520f;
    public float f32521f0;
    public float f32522g0;
    public final r01 h;
    public float f32523h0;
    public float f32524i0;
    public float f32525j0;
    public boolean f32526k0;
    public final g6 f32527l0;
    public final g6 m0;
    public final r6 f32528n;
    public final c f32529n0;
    public final r5 f32530o0;
    public long f32531p0;
    public float f32532q0;
    public int f32533r;
    public float f32534r0;
    public int f32535s;
    public t5 v;
    public final ArrayList f32536w;
    public boolean f32537x;
    public ck0 f32538y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, r01 r01Var, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f32512a = paint;
        Paint paint2 = new Paint(1);
        this.f32514b = paint2;
        Paint paint3 = new Paint(1);
        r6 r6Var = new r6(false, true, true);
        this.f32528n = r6Var;
        Paint paint4 = new Paint(1);
        this.f32536w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new o9(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        es esVar = es.h;
        this.T = new g6(this, 0L, 480L, esVar);
        this.U = new g6(this, 0L, 240L, esVar);
        this.V = new g6(this, 0L, 150L, es.f24465f);
        this.W = 1.0f;
        this.f32515b0 = new Path();
        this.f32517c0 = new Matrix();
        this.f32518d0 = new PathMeasure();
        this.f32519e0 = new Path();
        this.f32527l0 = new g6(this, 0L, 350L, esVar);
        this.m0 = new g6(this, 0L, 350L, esVar);
        final xz0 xz0Var = (xz0) this;
        this.f32529n0 = new c(xz0Var, 8);
        this.f32530o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                xz0 xz0Var2 = xz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f32511s0;
                        xz0Var2.f41693u0.w4(false);
                        return;
                    default:
                        xz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f32516c = i10;
        this.d = j10;
        this.e = z10;
        this.f32520f = view;
        this.h = r01Var;
        r01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                xz0 xz0Var2 = xz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f32511s0;
                        xz0Var2.f41693u0.w4(false);
                        return;
                    default:
                        xz0Var2.invalidate();
                        return;
                }
            }
        });
        this.M = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.nk, c6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var));
        r6Var.w(AndroidUtilities.dp(18.0f));
        r6Var.n(0.4f, 320L, esVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(-1);
        r6Var.q(true);
        r6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static t5 d(t5 t5Var, t5 t5Var2, t5 t5Var3) {
        if (t5Var3 != null) {
            RectF rectF = t5Var3.f3751n;
            if (t5Var != null || t5Var2 != null) {
                if (t5Var != null) {
                    RectF rectF2 = t5Var.f3751n;
                    if (t5Var2 != null) {
                        RectF rectF3 = t5Var2.f3751n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return t5Var;
                        }
                        return t5Var2;
                    }
                }
                if (t5Var != null) {
                    return t5Var;
                }
                return t5Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f32524i0 - (this.f32527l0.e(this.f32526k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, t5 t5Var, t5 t5Var2) {
        if (t5Var2 == null) {
            return;
        }
        RectF rectF = t5Var2.f3750m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * t5Var2.f3747j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = t5Var.f3750m;
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
        if (ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = f7 + f10;
            float f12 = (((int) f11) / 90) * 90;
            float f13 = (-199.0f) + f12;
            Path path = this.f32515b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f32517c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f32518d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f32519e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, t5 t5Var, t5 t5Var2, t5 t5Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        t5 t5Var4 = t5Var;
        RectF rectF = t5Var2.f3751n;
        if (t5Var4 == null && t5Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (t5Var4 != null) {
            RectF rectF2 = t5Var4.f3751n;
            if (t5Var3 != null) {
                RectF rectF3 = t5Var3.f3751n;
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
        if (t5Var4 == null && t5Var3 == null) {
            return;
        }
        if (t5Var4 == null) {
            t5Var4 = t5Var3;
        }
        float centerX4 = t5Var4.f3751n.centerX();
        float width5 = t5Var4.f3751n.width() / 2.0f;
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
        if (i10 == NotificationCenter.storiesUpdated) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r44) {
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
        this.f32537x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f32536w;
            if (i10 < arrayList.size()) {
                ((t5) arrayList.get(i10)).f3742b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f32516c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f32537x = false;
        while (true) {
            ArrayList arrayList = this.f32536w;
            if (i10 < arrayList.size()) {
                ((t5) arrayList.get(i10)).f3742b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f32516c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f32521f0 && motionEvent.getX() <= this.f32522g0 && Math.abs(motionEvent.getY() - this.f32523h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        r5 r5Var = this.f32530o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f32531p0 = System.currentTimeMillis();
            this.f32532q0 = motionEvent.getX();
            this.f32534r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(r5Var);
            AndroidUtilities.runOnUIThread(r5Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(r5Var);
            if (z10 && System.currentTimeMillis() - this.f32531p0 <= ViewConfiguration.getTapTimeout() && f7.a(this.f32532q0, this.f32534r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                x8 x8Var = this.M;
                long j10 = this.d;
                if (x8Var.K(j10) || x8Var.I(j10) || !this.f32536w.isEmpty()) {
                    e(this.f32529n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f32531p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(r5Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (org.telegram.ui.ActionBar.g6.I.q()) {
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
        if (drawable != this.f32528n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(c cVar) {
    }
}

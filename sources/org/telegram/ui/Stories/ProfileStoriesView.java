package org.telegram.ui.Stories;

import a6.i;
import ai.fa;
import ai.i6;
import ai.l9;
import ai.m9;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.k01;
import org.telegram.ui.qz0;
import v7.z6;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f34525s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public l9 K;
    public final fa L;
    public final m9 M;
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
    public final Paint f34526a;
    public ValueAnimator f34527a0;
    public final Paint f34528b;
    public final Path f34529b0;
    public final int f34530c;
    public final Matrix f34531c0;
    public final long d;
    public final PathMeasure f34532d0;
    public final boolean f34533e;
    public final Path f34534e0;
    public final View f34535f;
    public float f34536f0;
    public float f34537g0;
    public final k01 h;
    public float f34538h0;
    public float f34539i0;
    public float f34540j0;
    public boolean f34541k0;
    public final g6 f34542l0;
    public final g6 m0;
    public final q6 f34543n;
    public final i f34544n0;
    public final ai.g6 f34545o0;
    public long f34546p0;
    public float f34547q0;
    public int f34548r;
    public float f34549r0;
    public int f34550s;
    public i6 v;
    public final ArrayList f34551w;
    public boolean f34552x;
    public ik0 f34553y;

    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, k01 k01Var, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34526a = paint;
        Paint paint2 = new Paint(1);
        this.f34528b = paint2;
        Paint paint3 = new Paint(1);
        q6 q6Var = new q6(false, true, true);
        this.f34543n = q6Var;
        Paint paint4 = new Paint(1);
        this.f34551w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new fa(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        is isVar = is.h;
        this.T = new g6(this, 0L, 480L, isVar);
        this.U = new g6(this, 0L, 240L, isVar);
        this.V = new g6(this, 0L, 150L, is.f27451f);
        this.W = 1.0f;
        this.f34529b0 = new Path();
        this.f34531c0 = new Matrix();
        this.f34532d0 = new PathMeasure();
        this.f34534e0 = new Path();
        this.f34542l0 = new g6(this, 0L, 350L, isVar);
        this.m0 = new g6(this, 0L, 350L, isVar);
        final qz0 qz0Var = (qz0) this;
        this.f34544n0 = new i(qz0Var, 3);
        this.f34545o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                qz0 qz0Var2 = qz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34525s0;
                        qz0Var2.f41288u0.w4(false);
                        return;
                    default:
                        qz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f34530c = i10;
        this.d = j3;
        this.f34533e = z10;
        this.f34535f = view;
        this.h = k01Var;
        k01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                qz0 qz0Var2 = qz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34525s0;
                        qz0Var2.f41288u0.w4(false);
                        return;
                    default:
                        qz0Var2.invalidate();
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
        paint2.setColor(h6.w0(h6.nk, d6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(h6.w0(h6.f20786d6, d6Var));
        q6Var.w(AndroidUtilities.dp(18.0f));
        q6Var.n(0.4f, 320L, isVar);
        q6Var.x(AndroidUtilities.bold());
        q6Var.u(-1);
        q6Var.q(true);
        q6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static i6 d(i6 i6Var, i6 i6Var2, i6 i6Var3) {
        if (i6Var3 != null) {
            RectF rectF = i6Var3.f1151n;
            if (i6Var != null || i6Var2 != null) {
                if (i6Var != null) {
                    RectF rectF2 = i6Var.f1151n;
                    if (i6Var2 != null) {
                        RectF rectF3 = i6Var2.f1151n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return i6Var;
                        }
                        return i6Var2;
                    }
                }
                if (i6Var != null) {
                    return i6Var;
                }
                return i6Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f34539i0 - (this.f34542l0.e(this.f34541k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, i6 i6Var, i6 i6Var2) {
        if (i6Var2 == null) {
            return;
        }
        RectF rectF = i6Var2.f1150m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * i6Var2.f1147j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = i6Var.f1150m;
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
            Path path = this.f34529b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f34531c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f34532d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f34534e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, i6 i6Var, i6 i6Var2, i6 i6Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        i6 i6Var4 = i6Var;
        RectF rectF = i6Var2.f1151n;
        if (i6Var4 == null && i6Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (i6Var4 != null) {
            RectF rectF2 = i6Var4.f1151n;
            if (i6Var3 != null) {
                RectF rectF3 = i6Var3.f1151n;
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
        if (i6Var4 == null && i6Var3 == null) {
            return;
        }
        if (i6Var4 == null) {
            i6Var4 = i6Var3;
        }
        float centerX4 = i6Var4.f1151n.centerX();
        float width5 = i6Var4.f1151n.width() / 2.0f;
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
        this.f34552x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34551w;
            if (i10 < arrayList.size()) {
                ((i6) arrayList.get(i10)).f1141b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f34530c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f34552x = false;
        while (true) {
            ArrayList arrayList = this.f34551w;
            if (i10 < arrayList.size()) {
                ((i6) arrayList.get(i10)).f1141b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f34530c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f34536f0 && motionEvent.getX() <= this.f34537g0 && Math.abs(motionEvent.getY() - this.f34538h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        ai.g6 g6Var = this.f34545o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f34546p0 = System.currentTimeMillis();
            this.f34547q0 = motionEvent.getX();
            this.f34549r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            AndroidUtilities.runOnUIThread(g6Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            if (z10 && System.currentTimeMillis() - this.f34546p0 <= ViewConfiguration.getTapTimeout() && z6.a(this.f34547q0, this.f34549r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                m9 m9Var = this.M;
                long j3 = this.d;
                if (m9Var.K(j3) || m9Var.I(j3) || !this.f34551w.isEmpty()) {
                    e(this.f34544n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f34546p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(g6Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (h6.I.q()) {
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
        if (drawable != this.f34543n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

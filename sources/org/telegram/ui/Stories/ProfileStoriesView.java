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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.s01;
import org.telegram.ui.vz0;
import v7.a7;
import zh.c3;
import zh.d3;
import zh.e3;
import zh.h5;
import zh.i5;
import zh.y5;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f30630s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public h5 K;
    public final y5 L;
    public final i5 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final d6 T;
    public final d6 U;
    public final d6 V;
    public float W;
    public final Paint f30631a;
    public ValueAnimator f30632a0;
    public final Paint f30633b;
    public final Path f30634b0;
    public final int f30635c;
    public final Matrix f30636c0;
    public final long d;
    public final PathMeasure f30637d0;
    public final boolean e;
    public final Path f30638e0;
    public final View f30639f;
    public float f30640f0;
    public float f30641g0;
    public final s01 h;
    public float f30642h0;
    public float f30643i0;
    public float f30644j0;
    public boolean f30645k0;
    public final d6 f30646l0;
    public final d6 m0;
    public final n6 f30647n;
    public final d3 f30648n0;
    public final c3 f30649o0;
    public long f30650p0;
    public float f30651q0;
    public int f30652r;
    public float f30653r0;
    public int f30654s;
    public e3 v;
    public final ArrayList f30655w;
    public boolean f30656x;
    public lj0 f30657y;

    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, s01 s01Var, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f30631a = paint;
        Paint paint2 = new Paint(1);
        this.f30633b = paint2;
        Paint paint3 = new Paint(1);
        n6 n6Var = new n6(false, true, true, false);
        this.f30647n = n6Var;
        Paint paint4 = new Paint(1);
        this.f30655w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new y5(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        wr wrVar = wr.h;
        this.T = new d6(this, 0L, 480L, wrVar);
        this.U = new d6(this, 0L, 240L, wrVar);
        this.V = new d6(this, 0L, 150L, wr.f28819f);
        this.W = 1.0f;
        this.f30634b0 = new Path();
        this.f30636c0 = new Matrix();
        this.f30637d0 = new PathMeasure();
        this.f30638e0 = new Path();
        this.f30646l0 = new d6(this, 0L, 350L, wrVar);
        this.m0 = new d6(this, 0L, 350L, wrVar);
        final vz0 vz0Var = (vz0) this;
        this.f30648n0 = new d3(vz0Var);
        this.f30649o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                vz0 vz0Var2 = vz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f30630s0;
                        vz0Var2.f37659u0.w4(false);
                        return;
                    default:
                        vz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f30635c = i10;
        this.d = j3;
        this.e = z10;
        this.f30639f = view;
        this.h = s01Var;
        s01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                vz0 vz0Var2 = vz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f30630s0;
                        vz0Var2.f37659u0.w4(false);
                        return;
                    default:
                        vz0Var2.invalidate();
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
        paint2.setColor(j6.v0(j6.nk, f6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(j6.v0(j6.f17928d6, f6Var));
        n6Var.t(AndroidUtilities.dp(18.0f));
        n6Var.k(0.4f, 320L, wrVar);
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(-1);
        n6Var.n(true);
        n6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static e3 d(e3 e3Var, e3 e3Var2, e3 e3Var3) {
        if (e3Var3 != null) {
            RectF rectF = e3Var3.f48379n;
            if (e3Var != null || e3Var2 != null) {
                if (e3Var != null) {
                    RectF rectF2 = e3Var.f48379n;
                    if (e3Var2 != null) {
                        RectF rectF3 = e3Var2.f48379n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return e3Var;
                        }
                        return e3Var2;
                    }
                }
                if (e3Var != null) {
                    return e3Var;
                }
                return e3Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f30643i0 - (this.f30646l0.e(this.f30645k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, e3 e3Var, e3 e3Var2) {
        if (e3Var2 == null) {
            return;
        }
        RectF rectF = e3Var2.f48378m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * e3Var2.f48375j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = e3Var.f48378m;
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
            Path path = this.f30634b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f30636c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f30637d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f30638e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, e3 e3Var, e3 e3Var2, e3 e3Var3, Paint paint) {
        boolean z10;
        double degrees;
        double degrees2;
        e3 e3Var4 = e3Var;
        RectF rectF = e3Var2.f48379n;
        if (e3Var4 == null && e3Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (e3Var4 != null) {
            RectF rectF2 = e3Var4.f48379n;
            if (e3Var3 != null) {
                RectF rectF3 = e3Var3.f48379n;
                float centerX = rectF2.centerX();
                float width = rectF2.width() / 2.0f;
                float centerX2 = rectF.centerX();
                float width2 = rectF.width() / 2.0f;
                float centerX3 = rectF3.centerX();
                float width3 = rectF3.width() / 2.0f;
                boolean z11 = false;
                if (centerX > centerX2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX - width)) / 2.0f) - centerX2) / width2));
                } else {
                    degrees = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX + width)) / 2.0f) - centerX2) / width2));
                }
                float f7 = (float) degrees;
                if (centerX3 > centerX2) {
                    z11 = true;
                }
                if (z11) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX3 - width3)) / 2.0f) - centerX2) / width2));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX3 + width3)) / 2.0f) - centerX2) / width2));
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
        if (e3Var4 == null && e3Var3 == null) {
            return;
        }
        if (e3Var4 == null) {
            e3Var4 = e3Var3;
        }
        float centerX4 = e3Var4.f48379n.centerX();
        float width4 = e3Var4.f48379n.width() / 2.0f;
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
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30656x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f30655w;
            if (i10 < arrayList.size()) {
                ((e3) arrayList.get(i10)).f48370b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f30635c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f30656x = false;
        while (true) {
            ArrayList arrayList = this.f30655w;
            if (i10 < arrayList.size()) {
                ((e3) arrayList.get(i10)).f48370b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f30635c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f30640f0 && motionEvent.getX() <= this.f30641g0 && Math.abs(motionEvent.getY() - this.f30642h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        c3 c3Var = this.f30649o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f30650p0 = System.currentTimeMillis();
            this.f30651q0 = motionEvent.getX();
            this.f30653r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(c3Var);
            AndroidUtilities.runOnUIThread(c3Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(c3Var);
            if (z10 && System.currentTimeMillis() - this.f30650p0 <= ViewConfiguration.getTapTimeout() && a7.a(this.f30651q0, this.f30653r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                i5 i5Var = this.M;
                long j3 = this.d;
                if (i5Var.K(j3) || i5Var.I(j3) || !this.f30655w.isEmpty()) {
                    e(this.f30648n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f30650p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(c3Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (j6.I.q()) {
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
        if (drawable != this.f30647n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(d3 d3Var) {
    }
}

package org.telegram.ui.Stories;

import a6.i;
import ai.ea;
import ai.g6;
import ai.i6;
import ai.k9;
import ai.l9;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.m01;
import org.telegram.ui.rz0;
import v7.z6;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f31762s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public k9 K;
    public final ea L;
    public final l9 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final e6 T;
    public final e6 U;
    public final e6 V;
    public float W;
    public final Paint f31763a;
    public ValueAnimator f31764a0;
    public final Paint f31765b;
    public final Path f31766b0;
    public final int f31767c;
    public final Matrix f31768c0;
    public final long d;
    public final PathMeasure f31769d0;
    public final boolean e;
    public final Path f31770e0;
    public final View f31771f;
    public float f31772f0;
    public float f31773g0;
    public final m01 h;
    public float f31774h0;
    public float f31775i0;
    public float f31776j0;
    public boolean f31777k0;
    public final e6 f31778l0;
    public final e6 m0;
    public final o6 f31779n;
    public final i f31780n0;
    public final g6 f31781o0;
    public long f31782p0;
    public float f31783q0;
    public int f31784r;
    public float f31785r0;
    public int f31786s;
    public i6 v;
    public final ArrayList f31787w;
    public boolean f31788x;
    public mj0 f31789y;

    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, m01 m01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f31763a = paint;
        Paint paint2 = new Paint(1);
        this.f31765b = paint2;
        Paint paint3 = new Paint(1);
        o6 o6Var = new o6(false, true, true, false);
        this.f31779n = o6Var;
        Paint paint4 = new Paint(1);
        this.f31787w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new ea(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        qr qrVar = qr.h;
        this.T = new e6(this, 0L, 480L, qrVar);
        this.U = new e6(this, 0L, 240L, qrVar);
        this.V = new e6(this, 0L, 150L, qr.f27715f);
        this.W = 1.0f;
        this.f31766b0 = new Path();
        this.f31768c0 = new Matrix();
        this.f31769d0 = new PathMeasure();
        this.f31770e0 = new Path();
        this.f31778l0 = new e6(this, 0L, 350L, qrVar);
        this.m0 = new e6(this, 0L, 350L, qrVar);
        final rz0 rz0Var = (rz0) this;
        this.f31780n0 = new i(rz0Var, 3);
        this.f31781o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                rz0 rz0Var2 = rz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f31762s0;
                        rz0Var2.f37161u0.w4(false);
                        return;
                    default:
                        rz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f31767c = i10;
        this.d = j3;
        this.e = z10;
        this.f31771f = view;
        this.h = m01Var;
        m01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                rz0 rz0Var2 = rz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f31762s0;
                        rz0Var2.f37161u0.w4(false);
                        return;
                    default:
                        rz0Var2.invalidate();
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
        paint2.setColor(j6.v0(j6.nk, e6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(j6.v0(j6.f19062d6, e6Var));
        o6Var.t(AndroidUtilities.dp(18.0f));
        o6Var.k(0.4f, 320L, qrVar);
        o6Var.u(AndroidUtilities.bold());
        o6Var.r(-1);
        o6Var.n(true);
        o6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static i6 d(i6 i6Var, i6 i6Var2, i6 i6Var3) {
        if (i6Var3 != null) {
            RectF rectF = i6Var3.f994n;
            if (i6Var != null || i6Var2 != null) {
                if (i6Var != null) {
                    RectF rectF2 = i6Var.f994n;
                    if (i6Var2 != null) {
                        RectF rectF3 = i6Var2.f994n;
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
        return this.f31775i0 - (this.f31778l0.e(this.f31777k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, i6 i6Var, i6 i6Var2) {
        if (i6Var2 == null) {
            return;
        }
        RectF rectF = i6Var2.f993m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * i6Var2.f990j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = i6Var.f993m;
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
            Path path = this.f31766b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f31768c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f31769d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f31770e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, i6 i6Var, i6 i6Var2, i6 i6Var3, Paint paint) {
        boolean z10;
        double degrees;
        double degrees2;
        i6 i6Var4 = i6Var;
        RectF rectF = i6Var2.f994n;
        if (i6Var4 == null && i6Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (i6Var4 != null) {
            RectF rectF2 = i6Var4.f994n;
            if (i6Var3 != null) {
                RectF rectF3 = i6Var3.f994n;
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
        if (i6Var4 == null && i6Var3 == null) {
            return;
        }
        if (i6Var4 == null) {
            i6Var4 = i6Var3;
        }
        float centerX4 = i6Var4.f994n.centerX();
        float width4 = i6Var4.f994n.width() / 2.0f;
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
        this.f31788x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31787w;
            if (i10 < arrayList.size()) {
                ((i6) arrayList.get(i10)).f985b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f31767c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f31788x = false;
        while (true) {
            ArrayList arrayList = this.f31787w;
            if (i10 < arrayList.size()) {
                ((i6) arrayList.get(i10)).f985b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f31767c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f31772f0 && motionEvent.getX() <= this.f31773g0 && Math.abs(motionEvent.getY() - this.f31774h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        g6 g6Var = this.f31781o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f31782p0 = System.currentTimeMillis();
            this.f31783q0 = motionEvent.getX();
            this.f31785r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            AndroidUtilities.runOnUIThread(g6Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(g6Var);
            if (z10 && System.currentTimeMillis() - this.f31782p0 <= ViewConfiguration.getTapTimeout() && z6.a(this.f31783q0, this.f31785r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                l9 l9Var = this.M;
                long j3 = this.d;
                if (l9Var.K(j3) || l9Var.I(j3) || !this.f31787w.isEmpty()) {
                    e(this.f31780n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f31782p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(g6Var);
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
        if (drawable != this.f31779n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

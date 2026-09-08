package org.telegram.ui.Stories;

import a6.i;
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
import bi.l9;
import bi.p5;
import bi.r5;
import bi.t8;
import bi.u8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.n01;
import org.telegram.ui.sz0;
import v7.z6;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f34169s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public t8 K;
    public final l9 L;
    public final u8 M;
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
    public final Paint f34170a;
    public ValueAnimator f34171a0;
    public final Paint f34172b;
    public final Path f34173b0;
    public final int f34174c;
    public final Matrix f34175c0;
    public final long d;
    public final PathMeasure f34176d0;
    public final boolean f34177e;
    public final Path f34178e0;
    public final View f34179f;
    public float f34180f0;
    public float f34181g0;
    public final n01 h;
    public float f34182h0;
    public float f34183i0;
    public float f34184j0;
    public boolean f34185k0;
    public final e6 f34186l0;
    public final e6 m0;
    public final p6 f34187n;
    public final i f34188n0;
    public final p5 f34189o0;
    public long f34190p0;
    public float f34191q0;
    public int f34192r;
    public float f34193r0;
    public int f34194s;
    public r5 v;
    public final ArrayList f34195w;
    public boolean f34196x;
    public bj0 f34197y;

    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, n01 n01Var, f6 f6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34170a = paint;
        Paint paint2 = new Paint(1);
        this.f34172b = paint2;
        Paint paint3 = new Paint(1);
        p6 p6Var = new p6(false, true, true, false);
        this.f34187n = p6Var;
        Paint paint4 = new Paint(1);
        this.f34195w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new l9(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        pr prVar = pr.h;
        this.T = new e6(this, 0L, 480L, prVar);
        this.U = new e6(this, 0L, 240L, prVar);
        this.V = new e6(this, 0L, 150L, pr.f29493f);
        this.W = 1.0f;
        this.f34173b0 = new Path();
        this.f34175c0 = new Matrix();
        this.f34176d0 = new PathMeasure();
        this.f34178e0 = new Path();
        this.f34186l0 = new e6(this, 0L, 350L, prVar);
        this.m0 = new e6(this, 0L, 350L, prVar);
        final sz0 sz0Var = (sz0) this;
        this.f34188n0 = new i(sz0Var, 8);
        this.f34189o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                sz0 sz0Var2 = sz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34169s0;
                        sz0Var2.f40603u0.w4(false);
                        return;
                    default:
                        sz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f34174c = i10;
        this.d = j3;
        this.f34177e = z10;
        this.f34179f = view;
        this.h = n01Var;
        n01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                sz0 sz0Var2 = sz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34169s0;
                        sz0Var2.f40603u0.w4(false);
                        return;
                    default:
                        sz0Var2.invalidate();
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
        paint3.setColor(j6.v0(j6.f20690d6, f6Var));
        p6Var.t(AndroidUtilities.dp(18.0f));
        p6Var.k(0.4f, 320L, prVar);
        p6Var.u(AndroidUtilities.bold());
        p6Var.r(-1);
        p6Var.n(true);
        p6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static r5 d(r5 r5Var, r5 r5Var2, r5 r5Var3) {
        if (r5Var3 != null) {
            RectF rectF = r5Var3.f3666n;
            if (r5Var != null || r5Var2 != null) {
                if (r5Var != null) {
                    RectF rectF2 = r5Var.f3666n;
                    if (r5Var2 != null) {
                        RectF rectF3 = r5Var2.f3666n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return r5Var;
                        }
                        return r5Var2;
                    }
                }
                if (r5Var != null) {
                    return r5Var;
                }
                return r5Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f34183i0 - (this.f34186l0.e(this.f34185k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, r5 r5Var, r5 r5Var2) {
        if (r5Var2 == null) {
            return;
        }
        RectF rectF = r5Var2.f3665m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * r5Var2.f3662j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = r5Var.f3665m;
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
            Path path = this.f34173b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f34175c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f34176d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f34178e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, r5 r5Var, r5 r5Var2, r5 r5Var3, Paint paint) {
        boolean z10;
        double degrees;
        double degrees2;
        r5 r5Var4 = r5Var;
        RectF rectF = r5Var2.f3666n;
        if (r5Var4 == null && r5Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (r5Var4 != null) {
            RectF rectF2 = r5Var4.f3666n;
            if (r5Var3 != null) {
                RectF rectF3 = r5Var3.f3666n;
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
        if (r5Var4 == null && r5Var3 == null) {
            return;
        }
        if (r5Var4 == null) {
            r5Var4 = r5Var3;
        }
        float centerX4 = r5Var4.f3666n.centerX();
        float width4 = r5Var4.f3666n.width() / 2.0f;
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
        this.f34196x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34195w;
            if (i10 < arrayList.size()) {
                ((r5) arrayList.get(i10)).f3656b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f34174c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f34196x = false;
        while (true) {
            ArrayList arrayList = this.f34195w;
            if (i10 < arrayList.size()) {
                ((r5) arrayList.get(i10)).f3656b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f34174c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f34180f0 && motionEvent.getX() <= this.f34181g0 && Math.abs(motionEvent.getY() - this.f34182h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        p5 p5Var = this.f34189o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f34190p0 = System.currentTimeMillis();
            this.f34191q0 = motionEvent.getX();
            this.f34193r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(p5Var);
            AndroidUtilities.runOnUIThread(p5Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(p5Var);
            if (z10 && System.currentTimeMillis() - this.f34190p0 <= ViewConfiguration.getTapTimeout() && z6.a(this.f34191q0, this.f34193r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                u8 u8Var = this.M;
                long j3 = this.d;
                if (u8Var.K(j3) || u8Var.I(j3) || !this.f34195w.isEmpty()) {
                    e(this.f34188n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f34190p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(p5Var);
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
        if (drawable != this.f34187n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

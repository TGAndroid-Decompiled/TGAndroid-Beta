package org.telegram.ui.Stories;

import a4.l;
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
import ci.a8;
import ci.h7;
import ci.i7;
import ci.r4;
import ci.s4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.zj0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.oz0;
import org.telegram.ui.uy0;
import v7.f7;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f33869s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public h7 K;
    public final a8 L;
    public final i7 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final f6 T;
    public final f6 U;
    public final f6 V;
    public float W;
    public final Paint f33870a;
    public ValueAnimator f33871a0;
    public final Paint f33872b;
    public final Path f33873b0;
    public final int f33874c;
    public final Matrix f33875c0;
    public final long d;
    public final PathMeasure f33876d0;
    public final boolean e;
    public final Path f33877e0;
    public final View f33878f;
    public float f33879f0;
    public float f33880g0;
    public final oz0 h;
    public float f33881h0;
    public float f33882i0;
    public float f33883j0;
    public boolean f33884k0;
    public final f6 f33885l0;
    public final f6 m0;
    public final p6 f33886n;
    public final l f33887n0;
    public final r4 f33888o0;
    public long f33889p0;
    public float f33890q0;
    public int f33891r;
    public float f33892r0;
    public int f33893s;
    public s4 v;
    public final ArrayList f33894w;
    public boolean f33895x;
    public zj0 f33896y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, oz0 oz0Var, d6 d6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f33870a = paint;
        Paint paint2 = new Paint(1);
        this.f33872b = paint2;
        Paint paint3 = new Paint(1);
        p6 p6Var = new p6(false, true, true);
        this.f33886n = p6Var;
        Paint paint4 = new Paint(1);
        this.f33894w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new a8(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        bs bsVar = bs.h;
        this.T = new f6(this, 0L, 480L, bsVar);
        this.U = new f6(this, 0L, 240L, bsVar);
        this.V = new f6(this, 0L, 150L, bs.f25024f);
        this.W = 1.0f;
        this.f33873b0 = new Path();
        this.f33875c0 = new Matrix();
        this.f33876d0 = new PathMeasure();
        this.f33877e0 = new Path();
        this.f33885l0 = new f6(this, 0L, 350L, bsVar);
        this.m0 = new f6(this, 0L, 350L, bsVar);
        final uy0 uy0Var = (uy0) this;
        this.f33887n0 = new l(uy0Var, 9);
        this.f33888o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                uy0 uy0Var2 = uy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f33869s0;
                        uy0Var2.f42078u0.w4(false);
                        return;
                    default:
                        uy0Var2.invalidate();
                        return;
                }
            }
        };
        this.f33874c = i10;
        this.d = j10;
        this.e = z10;
        this.f33878f = view;
        this.h = oz0Var;
        oz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                uy0 uy0Var2 = uy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f33869s0;
                        uy0Var2.f42078u0.w4(false);
                        return;
                    default:
                        uy0Var2.invalidate();
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
        paint3.setColor(h6.w0(h6.f20993d6, d6Var));
        p6Var.w(AndroidUtilities.dp(18.0f));
        p6Var.n(0.4f, 320L, bsVar);
        p6Var.x(AndroidUtilities.bold());
        p6Var.u(-1);
        p6Var.q(true);
        p6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static s4 d(s4 s4Var, s4 s4Var2, s4 s4Var3) {
        if (s4Var3 != null) {
            RectF rectF = s4Var3.f5968n;
            if (s4Var != null || s4Var2 != null) {
                if (s4Var != null) {
                    RectF rectF2 = s4Var.f5968n;
                    if (s4Var2 != null) {
                        RectF rectF3 = s4Var2.f5968n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return s4Var;
                        }
                        return s4Var2;
                    }
                }
                if (s4Var != null) {
                    return s4Var;
                }
                return s4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f33882i0 - (this.f33885l0.e(this.f33884k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, s4 s4Var, s4 s4Var2) {
        if (s4Var2 == null) {
            return;
        }
        RectF rectF = s4Var2.f5967m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * s4Var2.f5964j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = s4Var.f5967m;
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
            Path path = this.f33873b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f33875c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f33876d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f33877e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, s4 s4Var, s4 s4Var2, s4 s4Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        s4 s4Var4 = s4Var;
        RectF rectF = s4Var2.f5968n;
        if (s4Var4 == null && s4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (s4Var4 != null) {
            RectF rectF2 = s4Var4.f5968n;
            if (s4Var3 != null) {
                RectF rectF3 = s4Var3.f5968n;
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
        if (s4Var4 == null && s4Var3 == null) {
            return;
        }
        if (s4Var4 == null) {
            s4Var4 = s4Var3;
        }
        float centerX4 = s4Var4.f5968n.centerX();
        float width5 = s4Var4.f5968n.width() / 2.0f;
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
    public final void dispatchDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.f(boolean, boolean):void");
    }

    public float getFragmentTransitionProgress() {
        return this.I;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f33895x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f33894w;
            if (i10 < arrayList.size()) {
                ((s4) arrayList.get(i10)).f5959b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f33874c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f33895x = false;
        while (true) {
            ArrayList arrayList = this.f33894w;
            if (i10 < arrayList.size()) {
                ((s4) arrayList.get(i10)).f5959b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f33874c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f33879f0 && motionEvent.getX() <= this.f33880g0 && Math.abs(motionEvent.getY() - this.f33881h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        r4 r4Var = this.f33888o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f33889p0 = System.currentTimeMillis();
            this.f33890q0 = motionEvent.getX();
            this.f33892r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            AndroidUtilities.runOnUIThread(r4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            if (z10 && System.currentTimeMillis() - this.f33889p0 <= ViewConfiguration.getTapTimeout() && f7.a(this.f33890q0, this.f33892r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                i7 i7Var = this.M;
                long j10 = this.d;
                if (i7Var.K(j10) || i7Var.I(j10) || !this.f33894w.isEmpty()) {
                    e(this.f33887n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f33889p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(r4Var);
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
        if (drawable != this.f33886n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(l lVar) {
    }
}

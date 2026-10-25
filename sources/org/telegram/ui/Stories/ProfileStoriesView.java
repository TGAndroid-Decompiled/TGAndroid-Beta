package org.telegram.ui.Stories;

import a8.ic;
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
import di.g7;
import di.h7;
import di.r4;
import di.s4;
import di.y7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.r6;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.bz0;
import org.telegram.ui.wz0;
import rb.c;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f36229s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public g7 K;
    public final y7 L;
    public final h7 M;
    public float N;
    public float O;
    public final RectF P;
    public final RectF Q;
    public final RectF R;
    public final Path S;
    public final h6 T;
    public final h6 U;
    public final h6 V;
    public float W;
    public final Paint f36230a;
    public ValueAnimator f36231a0;
    public final Paint f36232b;
    public final Path f36233b0;
    public final int f36234c;
    public final Matrix f36235c0;
    public final long d;
    public final PathMeasure f36236d0;
    public final boolean e;
    public final Path f36237e0;
    public final View f36238f;
    public float f36239f0;
    public float f36240g0;
    public final wz0 h;
    public float f36241h0;
    public float f36242i0;
    public float f36243j0;
    public boolean f36244k0;
    public final h6 f36245l0;
    public final h6 m0;
    public final r6 f36246n;
    public final c f36247n0;
    public final r4 f36248o0;
    public long f36249p0;
    public float f36250q0;
    public int f36251r;
    public float f36252r0;
    public int f36253s;
    public s4 v;
    public final ArrayList f36254w;
    public boolean f36255x;
    public bk0 f36256y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, wz0 wz0Var, u6 u6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36230a = paint;
        Paint paint2 = new Paint(1);
        this.f36232b = paint2;
        Paint paint3 = new Paint(1);
        r6 r6Var = new r6(false, true, true);
        this.f36246n = r6Var;
        Paint paint4 = new Paint(1);
        this.f36254w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new y7(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        ds dsVar = ds.h;
        this.T = new h6(this, 0L, 480L, dsVar);
        this.U = new h6(this, 0L, 240L, dsVar);
        this.V = new h6(this, 0L, 150L, ds.f27584f);
        this.W = 1.0f;
        this.f36233b0 = new Path();
        this.f36235c0 = new Matrix();
        this.f36236d0 = new PathMeasure();
        this.f36237e0 = new Path();
        this.f36245l0 = new h6(this, 0L, 350L, dsVar);
        this.m0 = new h6(this, 0L, 350L, dsVar);
        final bz0 bz0Var = (bz0) this;
        this.f36247n0 = new c(bz0Var, 17);
        this.f36248o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                bz0 bz0Var2 = bz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f36229s0;
                        ProfileActivity profileActivity = bz0Var2.f38186u0;
                        int i13 = ProfileActivity.R6;
                        profileActivity.E4(false);
                        return;
                    default:
                        bz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f36234c = i10;
        this.d = j10;
        this.e = z10;
        this.f36238f = view;
        this.h = wz0Var;
        wz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                bz0 bz0Var2 = bz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f36229s0;
                        ProfileActivity profileActivity = bz0Var2.f38186u0;
                        int i13 = ProfileActivity.R6;
                        profileActivity.E4(false);
                        return;
                    default:
                        bz0Var2.invalidate();
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
        paint2.setColor(y6.w0(y6.nk, u6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(y6.w0(y6.f23354d6, u6Var));
        r6Var.w(AndroidUtilities.dp(18.0f));
        r6Var.n(0.4f, 320L, dsVar);
        r6Var.x(AndroidUtilities.bold());
        r6Var.u(-1);
        r6Var.q(true);
        r6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static s4 d(s4 s4Var, s4 s4Var2, s4 s4Var3) {
        if (s4Var3 != null) {
            RectF rectF = s4Var3.f9155n;
            if (s4Var != null || s4Var2 != null) {
                if (s4Var != null) {
                    RectF rectF2 = s4Var.f9155n;
                    if (s4Var2 != null) {
                        RectF rectF3 = s4Var2.f9155n;
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
        return this.f36242i0 - (this.f36245l0.e(this.f36244k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, s4 s4Var, s4 s4Var2) {
        if (s4Var2 == null) {
            return;
        }
        RectF rectF = s4Var2.f9154m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * s4Var2.f9151j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = s4Var.f9154m;
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
            Path path = this.f36233b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f36235c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f36236d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f36237e0;
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
        RectF rectF = s4Var2.f9155n;
        if (s4Var4 == null && s4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (s4Var4 != null) {
            RectF rectF2 = s4Var4.f9155n;
            if (s4Var3 != null) {
                RectF rectF3 = s4Var3.f9155n;
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
        float centerX4 = s4Var4.f9155n.centerX();
        float width5 = s4Var4.f9155n.width() / 2.0f;
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
        this.f36255x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36254w;
            if (i10 < arrayList.size()) {
                ((s4) arrayList.get(i10)).f9146b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f36234c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f36255x = false;
        while (true) {
            ArrayList arrayList = this.f36254w;
            if (i10 < arrayList.size()) {
                ((s4) arrayList.get(i10)).f9146b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f36234c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f36239f0 && motionEvent.getX() <= this.f36240g0 && Math.abs(motionEvent.getY() - this.f36241h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        r4 r4Var = this.f36248o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f36249p0 = System.currentTimeMillis();
            this.f36250q0 = motionEvent.getX();
            this.f36252r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            AndroidUtilities.runOnUIThread(r4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(r4Var);
            if (z10 && System.currentTimeMillis() - this.f36249p0 <= ViewConfiguration.getTapTimeout() && ic.a(this.f36250q0, this.f36252r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                h7 h7Var = this.M;
                long j10 = this.d;
                if (h7Var.K(j10) || h7Var.I(j10) || !this.f36254w.isEmpty()) {
                    e(this.f36247n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f36249p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(r4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (y6.I.q()) {
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
        if (drawable != this.f36246n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(c cVar) {
    }
}

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
import ci.g7;
import ci.h7;
import ci.q4;
import ci.r4;
import ci.z7;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.rz0;
import org.telegram.ui.xy0;
import v7.f7;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f34169s0 = 0;
    public boolean E;
    public boolean F;
    public float G;
    public float H;
    public float I;
    public int J;
    public g7 K;
    public final z7 L;
    public final h7 M;
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
    public final Paint f34170a;
    public ValueAnimator f34171a0;
    public final Paint f34172b;
    public final Path f34173b0;
    public final int f34174c;
    public final Matrix f34175c0;
    public final long d;
    public final PathMeasure f34176d0;
    public final boolean e;
    public final Path f34177e0;
    public final View f34178f;
    public float f34179f0;
    public float f34180g0;
    public final rz0 h;
    public float f34181h0;
    public float f34182i0;
    public float f34183j0;
    public boolean f34184k0;
    public final d6 f34185l0;
    public final d6 m0;
    public final n6 f34186n;
    public final l f34187n0;
    public final q4 f34188o0;
    public long f34189p0;
    public float f34190q0;
    public int f34191r;
    public float f34192r0;
    public int f34193s;
    public r4 v;
    public final ArrayList f34194w;
    public boolean f34195x;
    public bk0 f34196y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, rz0 rz0Var, g6 g6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f34170a = paint;
        Paint paint2 = new Paint(1);
        this.f34172b = paint2;
        Paint paint3 = new Paint(1);
        n6 n6Var = new n6(false, true, true);
        this.f34186n = n6Var;
        Paint paint4 = new Paint(1);
        this.f34194w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new z7(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        zr zrVar = zr.h;
        this.T = new d6(this, 0L, 480L, zrVar);
        this.U = new d6(this, 0L, 240L, zrVar);
        this.V = new d6(this, 0L, 150L, zr.f33337f);
        this.W = 1.0f;
        this.f34173b0 = new Path();
        this.f34175c0 = new Matrix();
        this.f34176d0 = new PathMeasure();
        this.f34177e0 = new Path();
        this.f34185l0 = new d6(this, 0L, 350L, zrVar);
        this.m0 = new d6(this, 0L, 350L, zrVar);
        final xy0 xy0Var = (xy0) this;
        this.f34187n0 = new l(xy0Var, 9);
        this.f34188o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                xy0 xy0Var2 = xy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34169s0;
                        xy0Var2.f43713u0.y4(false);
                        return;
                    default:
                        xy0Var2.invalidate();
                        return;
                }
            }
        };
        this.f34174c = i10;
        this.d = j10;
        this.e = z10;
        this.f34178f = view;
        this.h = rz0Var;
        rz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                xy0 xy0Var2 = xy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f34169s0;
                        xy0Var2.f43713u0.y4(false);
                        return;
                    default:
                        xy0Var2.invalidate();
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
        paint2.setColor(k6.w0(k6.nk, g6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(k6.w0(k6.f21184d6, g6Var));
        n6Var.w(AndroidUtilities.dp(18.0f));
        n6Var.n(0.4f, 320L, zrVar);
        n6Var.x(AndroidUtilities.bold());
        n6Var.u(-1);
        n6Var.q(true);
        n6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static r4 d(r4 r4Var, r4 r4Var2, r4 r4Var3) {
        if (r4Var3 != null) {
            RectF rectF = r4Var3.f5867n;
            if (r4Var != null || r4Var2 != null) {
                if (r4Var != null) {
                    RectF rectF2 = r4Var.f5867n;
                    if (r4Var2 != null) {
                        RectF rectF3 = r4Var2.f5867n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return r4Var;
                        }
                        return r4Var2;
                    }
                }
                if (r4Var != null) {
                    return r4Var;
                }
                return r4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f34182i0 - (this.f34185l0.e(this.f34184k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, r4 r4Var, r4 r4Var2) {
        if (r4Var2 == null) {
            return;
        }
        RectF rectF = r4Var2.f5866m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * r4Var2.f5863j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = r4Var.f5866m;
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
            Path path2 = this.f34177e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, r4 r4Var, r4 r4Var2, r4 r4Var3, Paint paint) {
        float width;
        boolean z10;
        double degrees;
        double degrees2;
        r4 r4Var4 = r4Var;
        RectF rectF = r4Var2.f5867n;
        if (r4Var4 == null && r4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (r4Var4 != null) {
            RectF rectF2 = r4Var4.f5867n;
            if (r4Var3 != null) {
                RectF rectF3 = r4Var3.f5867n;
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
        if (r4Var4 == null && r4Var3 == null) {
            return;
        }
        if (r4Var4 == null) {
            r4Var4 = r4Var3;
        }
        float centerX4 = r4Var4.f5867n.centerX();
        float width5 = r4Var4.f5867n.width() / 2.0f;
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
        this.f34195x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f34194w;
            if (i10 < arrayList.size()) {
                ((r4) arrayList.get(i10)).f5858b.onAttachedToWindow();
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
        this.f34195x = false;
        while (true) {
            ArrayList arrayList = this.f34194w;
            if (i10 < arrayList.size()) {
                ((r4) arrayList.get(i10)).f5858b.onDetachedFromWindow();
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
        } else if (motionEvent.getX() >= this.f34179f0 && motionEvent.getX() <= this.f34180g0 && Math.abs(motionEvent.getY() - this.f34181h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        q4 q4Var = this.f34188o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f34189p0 = System.currentTimeMillis();
            this.f34190q0 = motionEvent.getX();
            this.f34192r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(q4Var);
            AndroidUtilities.runOnUIThread(q4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(q4Var);
            if (z10 && System.currentTimeMillis() - this.f34189p0 <= ViewConfiguration.getTapTimeout() && f7.a(this.f34190q0, this.f34192r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                h7 h7Var = this.M;
                long j10 = this.d;
                if (h7Var.K(j10) || h7Var.I(j10) || !this.f34194w.isEmpty()) {
                    e(this.f34187n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f34189p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(q4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (k6.I.q()) {
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
        if (drawable != this.f34186n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(l lVar) {
    }
}

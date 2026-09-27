package org.telegram.ui.Stories;

import a6.i;
import ai.ea;
import ai.f6;
import ai.h6;
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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.f01;
import org.telegram.ui.kz0;
import v7.a7;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f31806s0 = 0;
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
    public final Paint f31807a;
    public ValueAnimator f31808a0;
    public final Paint f31809b;
    public final Path f31810b0;
    public final int f31811c;
    public final Matrix f31812c0;
    public final long d;
    public final PathMeasure f31813d0;
    public final boolean e;
    public final Path f31814e0;
    public final View f31815f;
    public float f31816f0;
    public float f31817g0;
    public final f01 h;
    public float f31818h0;
    public float f31819i0;
    public float f31820j0;
    public boolean f31821k0;
    public final e6 f31822l0;
    public final e6 m0;
    public final o6 f31823n;
    public final i f31824n0;
    public final f6 f31825o0;
    public long f31826p0;
    public float f31827q0;
    public int f31828r;
    public float f31829r0;
    public int f31830s;
    public h6 v;
    public final ArrayList f31831w;
    public boolean f31832x;
    public oj0 f31833y;

    public ProfileStoriesView(Context context, int i10, long j3, boolean z10, View view, f01 f01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f31807a = paint;
        Paint paint2 = new Paint(1);
        this.f31809b = paint2;
        Paint paint3 = new Paint(1);
        o6 o6Var = new o6(false, true, true, false);
        this.f31823n = o6Var;
        Paint paint4 = new Paint(1);
        this.f31831w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.G = 1.0f;
        this.H = 1.0f;
        this.L = new ea(this);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Path();
        sr srVar = sr.h;
        this.T = new e6(this, 0L, 480L, srVar);
        this.U = new e6(this, 0L, 240L, srVar);
        this.V = new e6(this, 0L, 150L, sr.f28359f);
        this.W = 1.0f;
        this.f31810b0 = new Path();
        this.f31812c0 = new Matrix();
        this.f31813d0 = new PathMeasure();
        this.f31814e0 = new Path();
        this.f31822l0 = new e6(this, 0L, 350L, srVar);
        this.m0 = new e6(this, 0L, 350L, srVar);
        final kz0 kz0Var = (kz0) this;
        this.f31824n0 = new i(kz0Var, 3);
        this.f31825o0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                kz0 kz0Var2 = kz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f31806s0;
                        kz0Var2.f35204u0.w4(false);
                        return;
                    default:
                        kz0Var2.invalidate();
                        return;
                }
            }
        };
        this.f31811c = i10;
        this.d = j3;
        this.e = z10;
        this.f31815f = view;
        this.h = f01Var;
        f01Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                kz0 kz0Var2 = kz0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f31806s0;
                        kz0Var2.f35204u0.w4(false);
                        return;
                    default:
                        kz0Var2.invalidate();
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
        paint2.setColor(i6.v0(i6.nk, e6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(i6.v0(i6.f19057d6, e6Var));
        o6Var.t(AndroidUtilities.dp(18.0f));
        o6Var.k(0.4f, 320L, srVar);
        o6Var.u(AndroidUtilities.bold());
        o6Var.r(-1);
        o6Var.n(true);
        o6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static h6 d(h6 h6Var, h6 h6Var2, h6 h6Var3) {
        if (h6Var3 != null) {
            RectF rectF = h6Var3.f958n;
            if (h6Var != null || h6Var2 != null) {
                if (h6Var != null) {
                    RectF rectF2 = h6Var.f958n;
                    if (h6Var2 != null) {
                        RectF rectF3 = h6Var2.f958n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return h6Var;
                        }
                        return h6Var2;
                    }
                }
                if (h6Var != null) {
                    return h6Var;
                }
                return h6Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f31819i0 - (this.f31822l0.e(this.f31821k0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, h6 h6Var, h6 h6Var2) {
        if (h6Var2 == null) {
            return;
        }
        RectF rectF = h6Var2.f957m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f7 = -(AndroidUtilities.dpf2(1.66f) * h6Var2.f954j);
        rectF2.inset(f7, f7);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = h6Var.f957m;
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
            Path path = this.f31810b0;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.f31812c0;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.f31813d0;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f31814e0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f7, f10, false, paint);
    }

    public final void c(Canvas canvas, h6 h6Var, h6 h6Var2, h6 h6Var3, Paint paint) {
        boolean z10;
        double degrees;
        double degrees2;
        h6 h6Var4 = h6Var;
        RectF rectF = h6Var2.f958n;
        if (h6Var4 == null && h6Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (h6Var4 != null) {
            RectF rectF2 = h6Var4.f958n;
            if (h6Var3 != null) {
                RectF rectF3 = h6Var3.f958n;
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
        if (h6Var4 == null && h6Var3 == null) {
            return;
        }
        if (h6Var4 == null) {
            h6Var4 = h6Var3;
        }
        float centerX4 = h6Var4.f958n.centerX();
        float width4 = h6Var4.f958n.width() / 2.0f;
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
        this.f31832x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31831w;
            if (i10 < arrayList.size()) {
                ((h6) arrayList.get(i10)).f949b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f31811c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f31832x = false;
        while (true) {
            ArrayList arrayList = this.f31831w;
            if (i10 < arrayList.size()) {
                ((h6) arrayList.get(i10)).f949b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f31811c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.N < 0.9f) {
            z10 = this.Q.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f31816f0 && motionEvent.getX() <= this.f31817g0 && Math.abs(motionEvent.getY() - this.f31818h0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f6 f6Var = this.f31825o0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f31826p0 = System.currentTimeMillis();
            this.f31827q0 = motionEvent.getX();
            this.f31829r0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(f6Var);
            AndroidUtilities.runOnUIThread(f6Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(f6Var);
            if (z10 && System.currentTimeMillis() - this.f31826p0 <= ViewConfiguration.getTapTimeout() && a7.a(this.f31827q0, this.f31829r0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                l9 l9Var = this.M;
                long j3 = this.d;
                if (l9Var.K(j3) || l9Var.I(j3) || !this.f31831w.isEmpty()) {
                    e(this.f31824n0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f31826p0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(f6Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f7) {
        if (i6.I.q()) {
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
        if (drawable != this.f31823n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

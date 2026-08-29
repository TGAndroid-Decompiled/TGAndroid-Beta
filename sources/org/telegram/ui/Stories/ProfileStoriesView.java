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
import ha.c;
import i7.z5;
import java.util.ArrayList;
import lh.f4;
import lh.g4;
import lh.j7;
import lh.r6;
import lh.s6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f36262o0 = 0;
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public int F;
    public r6 G;
    public final j7 H;
    public final s6 I;
    public float J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final Path O;
    public final d6 P;
    public final d6 Q;
    public final d6 R;
    public float S;
    public ValueAnimator T;
    public final Path U;
    public final Matrix V;
    public final PathMeasure W;
    public final Paint f36263a;
    public final Path f36264a0;
    public final Paint f36265b;
    public float f36266b0;
    public final int f36267c;
    public float f36268c0;
    public final long d;
    public float f36269d0;
    public final boolean f36270e;
    public float f36271e0;
    public final View f36272f;
    public float f36273f0;
    public boolean f36274g0;
    public final iz0 h;
    public final d6 f36275h0;
    public final d6 f36276i0;
    public final c f36277j0;
    public final f4 f36278k0;
    public long f36279l0;
    public float m0;
    public final n6 f36280n;
    public float f36281n0;
    public int f36282r;
    public int f36283s;
    public g4 v;
    public final ArrayList f36284w;
    public boolean f36285x;
    public bj0 f36286y;

    public ProfileStoriesView(Context context, int i10, long j10, boolean z10, View view, iz0 iz0Var, c6 c6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36263a = paint;
        Paint paint2 = new Paint(1);
        this.f36265b = paint2;
        Paint paint3 = new Paint(1);
        n6 n6Var = new n6(false, true, true, false);
        this.f36280n = n6Var;
        Paint paint4 = new Paint(1);
        this.f36284w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.C = 1.0f;
        this.D = 1.0f;
        this.H = new j7(this);
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Path();
        jr jrVar = jr.h;
        this.P = new d6(this, 0L, 480L, jrVar);
        this.Q = new d6(this, 0L, 240L, jrVar);
        this.R = new d6(this, 0L, 150L, jr.f29800f);
        this.S = 1.0f;
        this.U = new Path();
        this.V = new Matrix();
        this.W = new PathMeasure();
        this.f36264a0 = new Path();
        this.f36275h0 = new d6(this, 0L, 350L, jrVar);
        this.f36276i0 = new d6(this, 0L, 350L, jrVar);
        final oy0 oy0Var = (oy0) this;
        this.f36277j0 = new c(oy0Var, 25);
        this.f36278k0 = new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                oy0 oy0Var2 = oy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f36262o0;
                        oy0Var2.f41249q0.w4(false);
                        return;
                    default:
                        oy0Var2.invalidate();
                        return;
                }
            }
        };
        this.f36267c = i10;
        this.d = j10;
        this.f36270e = z10;
        this.f36272f = view;
        this.h = iz0Var;
        iz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i11 = r2;
                oy0 oy0Var2 = oy0Var;
                switch (i11) {
                    case 0:
                        int i12 = ProfileStoriesView.f36262o0;
                        oy0Var2.f41249q0.w4(false);
                        return;
                    default:
                        oy0Var2.invalidate();
                        return;
                }
            }
        });
        this.I = MessagesController.getInstance(i10).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(g6.v0(g6.nk, c6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(g6.v0(g6.f23062d6, c6Var));
        n6Var.t(AndroidUtilities.dp(18.0f));
        n6Var.k(0.4f, 320L, jrVar);
        n6Var.u(AndroidUtilities.bold());
        n6Var.r(-1);
        n6Var.n(true);
        n6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static g4 d(g4 g4Var, g4 g4Var2, g4 g4Var3) {
        if (g4Var3 != null) {
            RectF rectF = g4Var3.f15631n;
            if (g4Var != null || g4Var2 != null) {
                if (g4Var != null) {
                    RectF rectF2 = g4Var.f15631n;
                    if (g4Var2 != null) {
                        RectF rectF3 = g4Var2.f15631n;
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
        return this.f36271e0 - (this.f36275h0.e(this.f36274g0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, g4 g4Var, g4 g4Var2) {
        if (g4Var2 == null) {
            return;
        }
        RectF rectF = g4Var2.f15630m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f9 = -(AndroidUtilities.dpf2(1.66f) * g4Var2.f15627j);
        rectF2.inset(f9, f9);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = g4Var.f15630m;
        float centerX2 = rectF3.centerX();
        float width2 = rectF3.width() / 2.0f;
        Path path = this.O;
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

    public final void b(float f9, float f10, Canvas canvas, Paint paint, RectF rectF) {
        if (ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f10) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f11 = f9 + f10;
            float f12 = (((int) f11) / 90) * 90;
            float f13 = (-199.0f) + f12;
            Path path = this.U;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.V;
            matrix.reset();
            matrix.postRotate(f12, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.W;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f36264a0;
            path2.reset();
            pathMeasure.getSegment(((f11 - f13) / 360.0f) * length, length * (((f11 - f10) - f13) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f9, f10, false, paint);
    }

    public final void c(Canvas canvas, g4 g4Var, g4 g4Var2, g4 g4Var3, Paint paint) {
        boolean z10;
        double degrees;
        double degrees2;
        g4 g4Var4 = g4Var;
        RectF rectF = g4Var2.f15631n;
        if (g4Var4 == null && g4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (g4Var4 != null) {
            RectF rectF2 = g4Var4.f15631n;
            if (g4Var3 != null) {
                RectF rectF3 = g4Var3.f15631n;
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
                float f9 = (float) degrees;
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
                    float max = Math.max(f9, f10);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z10) {
                    b(f10 + 180.0f, 180.0f - (f9 + f10), canvas, paint, rectF);
                    b(f9, (180.0f - f10) - f9, canvas, paint, rectF);
                    return;
                } else if (z11) {
                    b(f9 + 180.0f, 180.0f - (f10 + f9), canvas, paint, rectF);
                    b(f10, (180.0f - f10) - f9, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(f9, f10);
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
        float centerX4 = g4Var4.f15631n.centerX();
        float width4 = g4Var4.f15631n.width() / 2.0f;
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
    public final void dispatchDraw(android.graphics.Canvas r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.f(boolean, boolean):void");
    }

    public float getFragmentTransitionProgress() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36285x = true;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f36284w;
            if (i10 < arrayList.size()) {
                ((g4) arrayList.get(i10)).f15621b.onAttachedToWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f36267c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        this.f36285x = false;
        while (true) {
            ArrayList arrayList = this.f36284w;
            if (i10 < arrayList.size()) {
                ((g4) arrayList.get(i10)).f15621b.onDetachedFromWindow();
                i10++;
            } else {
                NotificationCenter.getInstance(this.f36267c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.J < 0.9f) {
            z10 = this.M.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f36266b0 && motionEvent.getX() <= this.f36268c0 && Math.abs(motionEvent.getY() - this.f36269d0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4 f4Var = this.f36278k0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f36279l0 = System.currentTimeMillis();
            this.m0 = motionEvent.getX();
            this.f36281n0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            AndroidUtilities.runOnUIThread(f4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(f4Var);
            if (z10 && System.currentTimeMillis() - this.f36279l0 <= ViewConfiguration.getTapTimeout() && z5.a(this.m0, this.f36281n0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                s6 s6Var = this.I;
                long j10 = this.d;
                if (s6Var.K(j10) || s6Var.I(j10) || !this.f36284w.isEmpty()) {
                    e(this.f36277j0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f36279l0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(f4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f9) {
        if (g6.I.q()) {
            return;
        }
        this.K = f9;
        invalidate();
    }

    public void setExpandProgress(float f9) {
        if (this.J != f9) {
            this.J = f9;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f9) {
        if (this.E == f9) {
            return;
        }
        this.E = f9;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f9) {
        if (this.D == f9) {
            return;
        }
        this.D = f9;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f36280n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(c cVar) {
    }
}

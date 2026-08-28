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
import g7.w;
import ih.j4;
import ih.k4;
import ih.n7;
import ih.u6;
import ih.v6;
import java.util.ArrayList;
import k5.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
public class ProfileStoriesView extends View implements NotificationCenter.NotificationCenterDelegate {
    public static final int f36197o0 = 0;
    public boolean A;
    public boolean B;
    public float C;
    public float D;
    public float E;
    public int F;
    public u6 G;
    public final n7 H;
    public final v6 I;
    public float J;
    public float K;
    public final RectF L;
    public final RectF M;
    public final RectF N;
    public final Path O;
    public final y5 P;
    public final y5 Q;
    public final y5 R;
    public float S;
    public ValueAnimator T;
    public final Path U;
    public final Matrix V;
    public final PathMeasure W;
    public final Paint f36198a;
    public final Path f36199a0;
    public final Paint f36200b;
    public float f36201b0;
    public final int f36202c;
    public float f36203c0;
    public final long d;
    public float f36204d0;
    public final boolean f36205e;
    public float f36206e0;
    public final View f36207f;
    public float f36208f0;
    public boolean f36209g0;
    public final iz0 h;
    public final y5 f36210h0;
    public final y5 f36211i0;
    public final i f36212j0;
    public final j4 f36213k0;
    public long f36214l0;
    public float m0;
    public final i6 f36215n;
    public float f36216n0;
    public int f36217r;
    public int f36218s;
    public k4 v;
    public final ArrayList f36219w;
    public boolean f36220x;
    public qi0 f36221y;

    public ProfileStoriesView(Context context, int i9, long j10, boolean z10, View view, iz0 iz0Var, b6 b6Var) {
        super(context);
        Paint paint = new Paint(1);
        this.f36198a = paint;
        Paint paint2 = new Paint(1);
        this.f36200b = paint2;
        Paint paint3 = new Paint(1);
        i6 i6Var = new i6(false, true, true, false);
        this.f36215n = i6Var;
        Paint paint4 = new Paint(1);
        this.f36219w = new ArrayList();
        Paint paint5 = new Paint(1);
        this.C = 1.0f;
        this.D = 1.0f;
        this.H = new n7(this);
        this.L = new RectF();
        this.M = new RectF();
        this.N = new RectF();
        this.O = new Path();
        gr grVar = gr.h;
        this.P = new y5(this, 0L, 480L, grVar);
        this.Q = new y5(this, 0L, 240L, grVar);
        this.R = new y5(this, 0L, 150L, gr.f28844f);
        this.S = 1.0f;
        this.U = new Path();
        this.V = new Matrix();
        this.W = new PathMeasure();
        this.f36199a0 = new Path();
        this.f36210h0 = new y5(this, 0L, 350L, grVar);
        this.f36211i0 = new y5(this, 0L, 350L, grVar);
        final oy0 oy0Var = (oy0) this;
        this.f36212j0 = new i(oy0Var, 19);
        this.f36213k0 = new Runnable() {
            @Override
            public final void run() {
                int i10 = r2;
                oy0 oy0Var2 = oy0Var;
                switch (i10) {
                    case 0:
                        int i11 = ProfileStoriesView.f36197o0;
                        oy0Var2.f41280q0.w4(false);
                        return;
                    default:
                        oy0Var2.invalidate();
                        return;
                }
            }
        };
        this.f36202c = i9;
        this.d = j10;
        this.f36205e = z10;
        this.f36207f = view;
        this.h = iz0Var;
        iz0Var.getImageReceiver().setVisibleInvalidate(new Runnable() {
            @Override
            public final void run() {
                int i10 = r2;
                oy0 oy0Var2 = oy0Var;
                switch (i10) {
                    case 0:
                        int i11 = ProfileStoriesView.f36197o0;
                        oy0Var2.f41280q0.w4(false);
                        return;
                    default:
                        oy0Var2.invalidate();
                        return;
                }
            }
        });
        this.I = MessagesController.getInstance(i9).getStoriesController();
        paint.setColor(1526726655);
        paint.getAlpha();
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setColor(f6.v0(f6.nk, b6Var));
        paint2.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint3.setColor(f6.v0(f6.f23001d6, b6Var));
        i6Var.t(AndroidUtilities.dp(18.0f));
        i6Var.k(0.4f, 320L, grVar);
        i6Var.u(AndroidUtilities.bold());
        i6Var.r(-1);
        i6Var.n(true);
        i6Var.setCallback(this);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint5.setStrokeWidth(AndroidUtilities.dpf2(2.33f));
        paint5.setStyle(style);
        f(false, false);
    }

    public static k4 d(k4 k4Var, k4 k4Var2, k4 k4Var3) {
        if (k4Var3 != null) {
            RectF rectF = k4Var3.f11682n;
            if (k4Var != null || k4Var2 != null) {
                if (k4Var != null) {
                    RectF rectF2 = k4Var.f11682n;
                    if (k4Var2 != null) {
                        RectF rectF3 = k4Var2.f11682n;
                        if (Math.min(Math.abs(rectF2.left - rectF.right), Math.abs(rectF2.right - rectF.left)) > Math.min(Math.abs(rectF3.left - rectF.right), Math.abs(rectF3.right - rectF.left))) {
                            return k4Var;
                        }
                        return k4Var2;
                    }
                }
                if (k4Var != null) {
                    return k4Var;
                }
                return k4Var2;
            }
            return null;
        }
        return null;
    }

    private float getExpandRight() {
        return this.f36206e0 - (this.f36210h0.e(this.f36209g0) * AndroidUtilities.dp(71.0f));
    }

    public final void a(Canvas canvas, k4 k4Var, k4 k4Var2) {
        if (k4Var2 == null) {
            return;
        }
        RectF rectF = k4Var2.f11681m;
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(rectF);
        float f10 = -(AndroidUtilities.dpf2(1.66f) * k4Var2.f11678j);
        rectF2.inset(f10, f10);
        float centerX = rectF.centerX();
        float width = rectF.width() / 2.0f;
        RectF rectF3 = k4Var.f11681m;
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
            float f11 = 2.0f * degrees2;
            path.arcTo(rectF2, -degrees2, f11);
            path.arcTo(rectF3, 180.0f - degrees2, -(360.0f - f11));
        }
        path.close();
        canvas.save();
        canvas.clipPath(path);
    }

    public final void b(float f10, float f11, Canvas canvas, Paint paint, RectF rectF) {
        if (ChatObject.isForum(UserConfig.selectedAccount, this.d)) {
            float height = rectF.height() * 0.32f;
            if (Math.abs(f11) == 360.0f) {
                canvas.drawRoundRect(rectF, height, height, paint);
                return;
            }
            float f12 = f10 + f11;
            float f13 = (((int) f12) / 90) * 90;
            float f14 = (-199.0f) + f13;
            Path path = this.U;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = this.V;
            matrix.reset();
            matrix.postRotate(f13, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = this.W;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = this.f36199a0;
            path2.reset();
            pathMeasure.getSegment(((f12 - f14) / 360.0f) * length, length * (((f12 - f11) - f14) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        canvas.drawArc(rectF, f10, f11, false, paint);
    }

    public final void c(Canvas canvas, k4 k4Var, k4 k4Var2, k4 k4Var3, Paint paint) {
        boolean z10;
        double degrees;
        double degrees2;
        k4 k4Var4 = k4Var;
        RectF rectF = k4Var2.f11682n;
        if (k4Var4 == null && k4Var3 == null) {
            b(0.0f, 360.0f, canvas, paint, rectF);
            return;
        }
        if (k4Var4 != null) {
            RectF rectF2 = k4Var4.f11682n;
            if (k4Var3 != null) {
                RectF rectF3 = k4Var3.f11682n;
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
                float f10 = (float) degrees;
                if (centerX3 > centerX2) {
                    z11 = true;
                }
                if (z11) {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 + width2) + (centerX3 - width3)) / 2.0f) - centerX2) / width2));
                } else {
                    degrees2 = Math.toDegrees(Math.acos(Math.abs((((centerX2 - width2) + (centerX3 + width3)) / 2.0f) - centerX2) / width2));
                }
                float f11 = (float) degrees2;
                if (z10 && z11) {
                    float max = Math.max(f10, f11);
                    b(max, 360.0f - (2.0f * max), canvas, paint, rectF);
                    return;
                } else if (z10) {
                    b(f11 + 180.0f, 180.0f - (f10 + f11), canvas, paint, rectF);
                    b(f10, (180.0f - f11) - f10, canvas, paint, rectF);
                    return;
                } else if (z11) {
                    b(f10 + 180.0f, 180.0f - (f11 + f10), canvas, paint, rectF);
                    b(f11, (180.0f - f11) - f10, canvas, paint, rectF);
                    return;
                } else {
                    float max2 = Math.max(f10, f11);
                    b(max2 + 180.0f, 360.0f - (max2 * 2.0f), canvas, paint, rectF);
                    return;
                }
            }
        }
        if (k4Var4 == null && k4Var3 == null) {
            return;
        }
        if (k4Var4 == null) {
            k4Var4 = k4Var3;
        }
        float centerX4 = k4Var4.f11682n.centerX();
        float width4 = k4Var4.f11682n.width() / 2.0f;
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
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.storiesUpdated) {
            f(true, true);
        }
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void f(boolean r24, boolean r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.ProfileStoriesView.f(boolean, boolean):void");
    }

    public float getFragmentTransitionProgress() {
        return this.E;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36220x = true;
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f36219w;
            if (i9 < arrayList.size()) {
                ((k4) arrayList.get(i9)).f11672b.onAttachedToWindow();
                i9++;
            } else {
                NotificationCenter.getInstance(this.f36202c).addObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        this.f36220x = false;
        while (true) {
            ArrayList arrayList = this.f36219w;
            if (i9 < arrayList.size()) {
                ((k4) arrayList.get(i9)).f11672b.onDetachedFromWindow();
                i9++;
            } else {
                NotificationCenter.getInstance(this.f36202c).removeObserver(this, NotificationCenter.storiesUpdated);
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.J < 0.9f) {
            z10 = this.M.contains(motionEvent.getX(), motionEvent.getY());
        } else if (motionEvent.getX() >= this.f36201b0 && motionEvent.getX() <= this.f36203c0 && Math.abs(motionEvent.getY() - this.f36204d0) < AndroidUtilities.dp(32.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4 j4Var = this.f36213k0;
        if (z10 && motionEvent.getAction() == 0) {
            this.f36214l0 = System.currentTimeMillis();
            this.m0 = motionEvent.getX();
            this.f36216n0 = motionEvent.getY();
            AndroidUtilities.cancelRunOnUIThread(j4Var);
            AndroidUtilities.runOnUIThread(j4Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (motionEvent.getAction() == 1) {
            AndroidUtilities.cancelRunOnUIThread(j4Var);
            if (z10 && System.currentTimeMillis() - this.f36214l0 <= ViewConfiguration.getTapTimeout() && w.a(this.m0, this.f36216n0, motionEvent.getX(), motionEvent.getY()) <= AndroidUtilities.dp(12.0f)) {
                v6 v6Var = this.I;
                long j10 = this.d;
                if (v6Var.K(j10) || v6Var.I(j10) || !this.f36219w.isEmpty()) {
                    e(this.f36212j0);
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 3) {
            this.f36214l0 = -1L;
            AndroidUtilities.cancelRunOnUIThread(j4Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setActionBarActionMode(float f10) {
        if (f6.I.q()) {
            return;
        }
        this.K = f10;
        invalidate();
    }

    public void setExpandProgress(float f10) {
        if (this.J != f10) {
            this.J = f10;
            invalidate();
        }
    }

    public void setFragmentTransitionProgress(float f10) {
        if (this.E == f10) {
            return;
        }
        this.E = f10;
        invalidate();
    }

    public void setProgressToStoriesInsets(float f10) {
        if (this.D == f10) {
            return;
        }
        this.D = f10;
        invalidate();
    }

    public void setStories(TL_stories.PeerStories peerStories) {
        f(true, false);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f36215n && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void e(i iVar) {
    }
}

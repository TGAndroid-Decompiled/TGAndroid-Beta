package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wh;
public final class z5 extends FrameLayout {
    public float E;
    public float F;
    public float G;
    public boolean H;
    public final RectF I;
    public final RectF J;
    public final RectF K;
    public final RectF L;
    public final Path M;
    public final float[] N;
    public final int[] O;
    public r5 f23790a;
    public y5 f23791b;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout f23792c;
    public eh.d d;
    public r5 e;
    public final Paint f23793f;
    public final Paint h;
    public boolean f23794n;
    public boolean f23795r;
    public boolean f23796s;
    public long v;
    public Runnable f23797w;
    public long f23798x;
    public float f23799y;

    public z5(Context context) {
        super(context);
        this.f23793f = new Paint(1);
        Paint paint = new Paint();
        this.h = paint;
        this.I = new RectF();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new RectF();
        this.M = new Path();
        this.N = new float[2];
        this.O = new int[2];
        setWillNotDraw(false);
        setClipChildren(false);
        setVisibility(8);
        paint.setColor(-16777216);
    }

    public static double e(double d, double d10, double d11) {
        if (d <= 0.0d) {
            return 0.0d;
        }
        double d12 = 6.283185307179586d / d11;
        double d13 = 1.0d - (d10 * d10);
        double sqrt = Math.sqrt(d13) * d12;
        double d14 = sqrt * d;
        return 1.0d - (((Math.sin(d14) * (d10 / Math.sqrt(d13))) + Math.cos(d14)) * Math.exp(((-d10) * d12) * d));
    }

    public final void a(boolean z10) {
        boolean z11 = this.f23794n;
        if (!z11 && !this.H) {
            return;
        }
        if (z11) {
            this.f23794n = false;
            if (z10 && isAttachedToWindow() && isLaidOut()) {
                this.f23799y = Math.max(this.E, this.F);
                this.f23798x = 0L;
                this.H = true;
                invalidate();
                return;
            }
        }
        d();
    }

    public final void b(View view) {
        ViewParent parent = getParent();
        float f7 = 0.0f;
        View view2 = view;
        float f10 = 0.0f;
        while (view2 != null && view2 != parent) {
            f7 += view2.getX();
            f10 += view2.getY();
            ViewParent parent2 = view2.getParent();
            if (parent2 instanceof View) {
                view2 = (View) parent2;
            } else {
                view2 = null;
            }
        }
        float[] fArr = this.N;
        if (view2 != null) {
            fArr[0] = f7 - getX();
            fArr[1] = f10 - getY();
            return;
        }
        int[] iArr = this.O;
        view.getLocationInWindow(iArr);
        getLocationInWindow(iArr);
        fArr[0] = iArr[0] - iArr[0];
        fArr[1] = iArr[1] - iArr[1];
    }

    public final void c() {
        y5 y5Var;
        r5 r5Var = this.f23790a;
        if (r5Var != null && (y5Var = this.f23791b) != null) {
            RectF rectF = this.I;
            this.f23795r = r5Var.m(y5Var, rectF);
            b(this.f23790a);
            float[] fArr = this.N;
            rectF.offset(fArr[0], fArr[1]);
        }
    }

    public final void d() {
        this.H = false;
        this.f23794n = false;
        this.G = 0.0f;
        this.F = 0.0f;
        this.E = 0.0f;
        clearFocus();
        setVisibility(8);
        y5 y5Var = this.f23791b;
        r5 r5Var = this.f23790a;
        this.f23791b = null;
        if (r5Var != null) {
            r5Var.O = null;
            r5Var.P = null;
            r5Var.invalidate();
        }
        if (y5Var != null) {
            y5Var.getIconView().setAlpha(1.0f);
            t0 t0Var = y5Var.Q;
            if (t0Var != null) {
                t0Var.a();
            }
        }
        Runnable runnable = this.f23797w;
        if (runnable != null) {
            this.f23797w = null;
            runnable.run();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        char c10;
        float clamp01;
        float f10;
        View iconView;
        float f11;
        float f12;
        float clamp012;
        float f13;
        float f14;
        float f15;
        float f16;
        float e;
        float e10;
        if (this.f23790a != null && this.f23791b != null && this.f23792c != null) {
            if (this.H) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                if (this.f23798x == 0) {
                    this.f23798x = currentAnimationTimeMillis;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    f14 = ValueAnimator.getDurationScale();
                } else {
                    f14 = 1.0f;
                }
                if (f14 <= 0.0f) {
                    f15 = 10.0f;
                } else {
                    f15 = (((float) (currentAnimationTimeMillis - this.f23798x)) / 1000.0f) / f14;
                }
                float f17 = this.f23799y;
                if (this.f23794n) {
                    this.G = 0.0f;
                    int i10 = (f15 > 0.7f ? 1 : (f15 == 0.7f ? 0 : -1));
                    if (i10 > 0) {
                        e = 1.0f;
                    } else {
                        e = ((1.0f - f17) * ((float) e(f15, 0.78d, 0.3d))) + f17;
                    }
                    this.E = e;
                    if (i10 > 0) {
                        e10 = 1.0f;
                    } else {
                        e10 = ((1.0f - f17) * ((float) e(f15 - 0.02d, 0.8d, 0.34d))) + f17;
                    }
                    this.F = e10;
                    if (i10 > 0) {
                        this.H = false;
                    }
                } else {
                    float clamp013 = Utilities.clamp01(f15 / 0.2f);
                    float clamp014 = Utilities.clamp01(f15 / 0.17f);
                    this.E = (1.0f - ((3.0f - (clamp014 * 2.0f)) * (clamp014 * clamp014))) * f17;
                    this.F = (1.0f - ((3.0f - (clamp013 * 2.0f)) * (clamp013 * clamp013))) * f17;
                    float f18 = f15 - 0.2f;
                    int i11 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
                    if (i11 > 0 && this.f23795r) {
                        f16 = f17 * 0.07f * ((float) Math.exp((-f18) / 0.11f)) * ((float) Math.sin((f18 * 6.283185307179586d) / 0.17000000178813934d));
                    } else {
                        f16 = 0.0f;
                    }
                    this.G = f16;
                    if (!this.f23795r ? i11 >= 0 : f18 > 0.45f) {
                        this.G = 0.0f;
                        post(new q(this, 15));
                    }
                }
            }
            c();
            RectF rectF = this.J;
            rectF.set(this.f23792c.getLeft(), this.f23792c.getTop(), this.f23792c.getRight(), this.f23792c.getBottom());
            float f19 = this.E;
            float f20 = this.F;
            float clamp015 = Utilities.clamp01(Math.max(f19, f20));
            RectF rectF2 = this.I;
            float lerp = AndroidUtilities.lerp(rectF2.left, rectF.left, f19);
            float lerp2 = AndroidUtilities.lerp(rectF2.top, rectF.top, f20);
            float lerp3 = AndroidUtilities.lerp(rectF2.right, rectF.right, f19);
            float lerp4 = AndroidUtilities.lerp(rectF2.bottom, rectF.bottom, f20);
            RectF rectF3 = this.K;
            rectF3.set(lerp, lerp2, lerp3, lerp4);
            if (this.G != 0.0f) {
                float centerX = rectF3.centerX();
                float centerY = rectF3.centerY();
                f7 = 0.45f;
                float C = c3.h0.C(this.G, 0.5f, 1.0f, rectF3.width() / 2.0f);
                float height = (1.0f - this.G) * (rectF3.height() / 2.0f);
                c10 = 0;
                rectF3.set(centerX - C, centerY - height, centerX + C, centerY + height);
            } else {
                f7 = 0.45f;
                c10 = 0;
            }
            float min = Math.min(Math.min(rectF3.height(), rectF3.width()) / 2.0f, AndroidUtilities.lerp(rectF2.height() / 2.0f, AndroidUtilities.dp(22.0f), Utilities.clamp01(f20)));
            Paint paint = this.h;
            paint.setAlpha((int) (26.0f * clamp015));
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            int dp = AndroidUtilities.dp(6.0f);
            if (this.f23795r) {
                clamp01 = 1.0f;
            } else {
                clamp01 = Utilities.clamp01(clamp015 / 0.25f);
            }
            eh.d dVar = this.d;
            if (dVar != null) {
                dVar.x(min);
                this.d.setBounds(((int) rectF3.left) - dp, ((int) rectF3.top) - dp, ((int) rectF3.right) + dp, ((int) rectF3.bottom) + dp);
                this.d.setAlpha((int) (clamp01 * 255.0f));
                this.d.draw(canvas);
            } else {
                int w02 = y6.w0(y6.G8, this.f23790a.f23029a);
                Paint paint2 = this.f23793f;
                paint2.setColor(w02);
                paint2.setAlpha((int) (paint2.getAlpha() * clamp01));
                canvas.drawRoundRect(rectF3, min, min, paint2);
            }
            canvas.save();
            Path path = this.M;
            path.rewind();
            path.addRoundRect(rectF3, min, min, Path.Direction.CW);
            canvas.clipPath(path);
            if (this.f23794n) {
                f10 = 0.3f;
            } else {
                f10 = 0.7f;
            }
            float clamp016 = 1.0f - Utilities.clamp01(clamp015 / f10);
            if (this.f23795r) {
                iconView = this.f23790a.getMenuView();
            } else {
                iconView = this.f23791b.getIconView();
            }
            View view = iconView;
            if (clamp016 > 0.004f && view != null) {
                b(view);
                float[] fArr = this.N;
                float f21 = fArr[c10];
                f11 = 0.004f;
                float height2 = fArr[1] + view.getHeight();
                RectF rectF4 = this.L;
                rectF4.set(f21, fArr[1], view.getWidth() + f21, height2);
                float clamp017 = 1.0f - (Utilities.clamp01(clamp015 / 0.3f) * 0.15f);
                canvas.saveLayerAlpha(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, (int) (clamp016 * 255.0f));
                float f22 = this.G;
                canvas.scale(c3.h0.C(f22, 0.5f, 1.0f, clamp017), (1.0f - f22) * clamp017, rectF4.centerX(), rectF4.centerY());
                canvas.translate(rectF4.left, rectF4.top);
                view.draw(canvas);
                canvas.restore();
            } else {
                f11 = 0.004f;
            }
            if (this.f23794n) {
                clamp012 = Utilities.clamp01((clamp015 - 0.25f) / 0.5f);
                f13 = clamp012 * clamp012;
                f12 = 3.0f;
            } else {
                f12 = 3.0f;
                clamp012 = Utilities.clamp01((clamp015 - 0.5f) / f7);
                f13 = clamp012 * clamp012;
            }
            float D = c3.h0.D(clamp012, 2.0f, f12, f13);
            if (D > f11) {
                float max = Math.max(0.3f, rectF3.width() / Math.max(1.0f, rectF.width()));
                canvas.saveLayerAlpha(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, (int) (D * 255.0f));
                canvas.translate(rectF3.right - rectF.right, rectF3.top - rectF.top);
                canvas.scale(max, max, rectF.right, rectF.top);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
            canvas.restore();
            if (this.H) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f23794n && keyEvent.getAction() == 1 && keyEvent.getRepeatCount() == 0 && (keyEvent.getKeyCode() == 82 || keyEvent.getKeyCode() == 4)) {
            a(true);
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.z5.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public y5 getItem() {
        return this.f23791b;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.f23794n && !this.H) {
            return;
        }
        d();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23792c;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            c();
            RectF rectF = this.I;
            int i14 = (int) rectF.top;
            int max = Math.max(AndroidUtilities.dp(8.0f), ((int) rectF.right) - this.f23792c.getMeasuredWidth());
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = this.f23792c;
            actionBarPopupWindow$ActionBarPopupWindowLayout2.layout(max, i14, actionBarPopupWindow$ActionBarPopupWindowLayout2.getMeasuredWidth() + max, this.f23792c.getMeasuredHeight() + i14);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.f23792c;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null && actionBarPopupWindow$ActionBarPopupWindowLayout.getParent() == this) {
            c();
            this.f23792c.measure(wh.x(16.0f, size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(48.0f), (int) (((size2 - this.I.top) - AndroidUtilities.dp(16.0f)) - AndroidUtilities.navigationBarHeight)), Integer.MIN_VALUE));
        }
    }

    public void setOnClosed(Runnable runnable) {
        this.f23797w = runnable;
    }
}

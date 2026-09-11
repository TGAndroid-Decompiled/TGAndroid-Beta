package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;
public final class ig0 extends FrameLayout {
    public final int f27112a = 4;
    public boolean f27113b;
    public Object f27114c;
    public final Object d;

    public ig0(pg0 pg0Var, Context context) {
        super(context);
        this.d = pg0Var;
        this.f27113b = false;
        this.f27114c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f27112a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f27114c;
                if (this.f27113b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.uy) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f27114c;
                if (this.f27113b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.eh0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj;
                if (!this.f27113b && a61Var.f43006r > 0.0f) {
                    if (((Paint) this.f27114c) == null) {
                        Paint paint3 = new Paint();
                        this.f27114c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f27114c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f27114c).setAlpha((int) (a61Var.f43006r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f27114c);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        switch (this.f27112a) {
            case 4:
                boolean z11 = this.f27113b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f24045a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f24053e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f27114c, 31);
                        sg.t tVar = limitPreviewView.f24053e0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y3 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.z0) tVar).f43251b).t0(x10, getY() + y3));
                        canvas.restore();
                        invalidate();
                        return drawChild;
                    }
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        int i10;
        switch (this.f27112a) {
            case 0:
                RectF rectF = (RectF) this.f27114c;
                int dp = AndroidUtilities.dp(13.0f);
                pg0 pg0Var = (pg0) this.d;
                Drawable drawable = pg0Var.d;
                int u10 = (pg0Var.E - pg0.u(pg0Var)) - dp;
                if (pg0.v(pg0Var) == 1) {
                    u10 = (int) (pg0Var.f29370b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = pg0.w(pg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (pg0.x(pg0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - pg0.y(pg0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
                    u10 -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    w10 += currentActionBarHeight;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i11 = AndroidUtilities.statusBarHeight;
                int i12 = dp2 + i11;
                drawable.setBounds(0, u10 + i11, getMeasuredWidth(), w10);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.j6.f20948t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
                    rectF.set(pg0.A(pg0Var), pg0.B(pg0Var) + i10, getMeasuredWidth() - pg0.C(pg0Var), AndroidUtilities.dp(24.0f) + pg0.D(pg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f20948t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.j6.f20948t0.setColor(w02);
                    org.telegram.ui.ActionBar.j6.f20948t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f20948t0);
                }
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false);
                org.telegram.ui.ActionBar.j6.f20948t0.setColor(Color.argb((int) (pg0Var.f29373f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(pg0.F(pg0Var), 0.0f, getMeasuredWidth() - pg0.G(pg0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.f20948t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f27112a) {
            case 0:
                pg0 pg0Var = (pg0) this.d;
                if (motionEvent.getAction() == 0 && pg0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + pg0Var.E && pg0Var.f29373f.getAlpha() == 0.0f) {
                        pg0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f27112a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                pg0.t((pg0) this.d);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        switch (this.f27112a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                pg0 pg0Var = (pg0) this.d;
                y5 y5Var = pg0Var.f29379y;
                lg0 lg0Var = pg0Var.f29371c;
                jg0 jg0Var = pg0Var.f29370b;
                if (!pg0.L(pg0Var)) {
                    this.f27113b = true;
                    setPadding(pg0.M(pg0Var), AndroidUtilities.statusBarHeight, pg0.N(pg0Var), 0);
                    this.f27113b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) jg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) pg0Var.f29372e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + pg0.r(pg0Var) + AndroidUtilities.statusBarHeight;
                int R = lg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        y5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (pg0.s(pg0Var) * 2)), 1073741824), i11);
                        dp = y5Var.getMeasuredHeight();
                    } else {
                        int M = lg0Var.M(i13);
                        dp = ((M - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp2 = dp + dp2;
                }
                if (dp2 < paddingTop) {
                    i12 = paddingTop - dp2;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp3 = AndroidUtilities.dp(8.0f) + i12;
                if (jg0Var.getPaddingTop() != dp3) {
                    this.f27113b = true;
                    jg0Var.setPinnedSectionOffsetY(-dp3);
                    jg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f27113b = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f27112a) {
            case 0:
                if (!((pg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f27112a) {
            case 0:
                if (!this.f27113b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public ig0(org.telegram.ui.eh0 eh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = eh0Var;
        this.f27113b = z10;
        this.f27114c = new Paint(1);
    }

    public ig0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f27114c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f27113b = z10;
    }

    public ig0(org.telegram.ui.a61 a61Var, Context context, boolean z10) {
        super(context);
        this.d = a61Var;
        this.f27113b = z10;
    }

    public ig0(org.telegram.ui.uy uyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = uyVar;
        this.f27113b = z10;
        this.f27114c = new Paint(1);
    }
}

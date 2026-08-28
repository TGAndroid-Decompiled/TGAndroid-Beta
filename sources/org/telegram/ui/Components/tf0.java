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
public final class tf0 extends FrameLayout {
    public final int f32692a = 4;
    public boolean f32693b;
    public Object f32694c;
    public final Object d;

    public tf0(ag0 ag0Var, Context context) {
        super(context);
        this.d = ag0Var;
        this.f32693b = false;
        this.f32694c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i9 = this.f32692a;
        Object obj = this.d;
        switch (i9) {
            case 1:
                Paint paint = (Paint) this.f32694c;
                if (this.f32693b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.dy) obj).getThemedColor(org.telegram.ui.ActionBar.f6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f32694c;
                if (this.f32693b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.ng0) obj).getThemedColor(org.telegram.ui.ActionBar.f6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.s41 s41Var = (org.telegram.ui.s41) obj;
                if (!this.f32693b && s41Var.f41688r > 0.0f) {
                    if (((Paint) this.f32694c) == null) {
                        Paint paint3 = new Paint();
                        this.f32694c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f32694c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f32694c).setAlpha((int) (s41Var.f41688r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f32694c);
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
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.f32692a) {
            case 4:
                boolean z11 = this.f32693b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f10 = limitPreviewView.f26447a;
                    boolean z12 = false;
                    if (f10 != 0.0f && f10 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f10 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f26448a0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f32694c, 31);
                        zf.t tVar = limitPreviewView.f26448a0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y10 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.u5) ((org.telegram.ui.b1) tVar).f36593b).s0(x10, getY() + y10));
                        canvas.restore();
                        invalidate();
                        return drawChild;
                    }
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f10;
        int i9;
        switch (this.f32692a) {
            case 0:
                RectF rectF = (RectF) this.f32694c;
                int dp = AndroidUtilities.dp(13.0f);
                ag0 ag0Var = (ag0) this.d;
                Drawable drawable = ag0Var.d;
                int u10 = (ag0Var.A - ag0.u(ag0Var)) - dp;
                if (ag0.v(ag0Var) == 1) {
                    u10 = (int) (ag0Var.f26783b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w8 = ag0.w(ag0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (ag0.x(ag0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - ag0.y(ag0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
                    u10 -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    w8 += currentActionBarHeight;
                    f10 = 1.0f - min;
                } else {
                    f10 = 1.0f;
                }
                int i10 = AndroidUtilities.statusBarHeight;
                int i11 = dp2 + i10;
                drawable.setBounds(0, u10 + i10, getMeasuredWidth(), w8);
                drawable.draw(canvas);
                if (f10 != 1.0f) {
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
                    rectF.set(ag0.z(ag0Var), ag0.A(ag0Var) + i9, getMeasuredWidth() - ag0.C(ag0Var), AndroidUtilities.dp(24.0f) + ag0.D(ag0Var) + i9);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f10, AndroidUtilities.dp(12.0f) * f10, org.telegram.ui.ActionBar.f6.f23279t0);
                }
                if (f10 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i11, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i11);
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.f6.f23279t0.setColor(w02);
                    org.telegram.ui.ActionBar.f6.f23279t0.setAlpha((int) (alpha * 1.0f * f10));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.f23279t0);
                }
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false);
                org.telegram.ui.ActionBar.f6.f23279t0.setColor(Color.argb((int) (ag0Var.f26786f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(ag0.E(ag0Var), 0.0f, getMeasuredWidth() - ag0.F(ag0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.f6.f23279t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f32692a) {
            case 0:
                ag0 ag0Var = (ag0) this.d;
                if (motionEvent.getAction() == 0 && ag0Var.A != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + ag0Var.A && ag0Var.f26786f.getAlpha() == 0.0f) {
                        ag0Var.dismiss();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f32692a) {
            case 0:
                super.onLayout(z10, i9, i10, i11, i12);
                ag0.t((ag0) this.d);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        switch (this.f32692a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10);
                ag0 ag0Var = (ag0) this.d;
                s5 s5Var = ag0Var.f26792y;
                wf0 wf0Var = ag0Var.f26784c;
                uf0 uf0Var = ag0Var.f26783b;
                if (!ag0.K(ag0Var)) {
                    this.f32693b = true;
                    setPadding(ag0.L(ag0Var), AndroidUtilities.statusBarHeight, ag0.M(ag0Var), 0);
                    this.f32693b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) uf0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ag0Var.f26785e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + ag0.r(ag0Var) + AndroidUtilities.statusBarHeight;
                int R = wf0Var.R();
                for (int i12 = 0; i12 < R; i12++) {
                    if (i12 == 0) {
                        s5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9 - (ag0.s(ag0Var) * 2)), 1073741824), i10);
                        dp = s5Var.getMeasuredHeight();
                    } else {
                        int M = wf0Var.M(i12);
                        dp = ((M - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp2 = dp + dp2;
                }
                if (dp2 < paddingTop) {
                    i11 = paddingTop - dp2;
                } else {
                    i11 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp3 = AndroidUtilities.dp(8.0f) + i11;
                if (uf0Var.getPaddingTop() != dp3) {
                    this.f32693b = true;
                    uf0Var.setPinnedSectionOffsetY(-dp3);
                    uf0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f32693b = false;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f32692a) {
            case 0:
                if (!((ag0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f32692a) {
            case 0:
                if (!this.f32693b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public tf0(org.telegram.ui.ng0 ng0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ng0Var;
        this.f32693b = z10;
        this.f32694c = new Paint(1);
    }

    public tf0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f32694c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f32693b = z10;
    }

    public tf0(org.telegram.ui.s41 s41Var, Context context, boolean z10) {
        super(context);
        this.d = s41Var;
        this.f32693b = z10;
    }

    public tf0(org.telegram.ui.dy dyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = dyVar;
        this.f32693b = z10;
        this.f32694c = new Paint(1);
    }
}

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
public final class jg0 extends FrameLayout {
    public final int f25272a = 4;
    public boolean f25273b;
    public Object f25274c;
    public final Object d;

    public jg0(qg0 qg0Var, Context context) {
        super(context);
        this.d = qg0Var;
        this.f25273b = false;
        this.f25274c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f25272a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f25274c;
                if (this.f25273b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.wy) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f25274c;
                if (this.f25273b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.gh0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.z51 z51Var = (org.telegram.ui.z51) obj;
                if (!this.f25273b && z51Var.f39400r > 0.0f) {
                    if (((Paint) this.f25274c) == null) {
                        Paint paint3 = new Paint();
                        this.f25274c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f25274c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f25274c).setAlpha((int) (z51Var.f39400r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f25274c);
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
        switch (this.f25272a) {
            case 4:
                boolean z11 = this.f25273b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f22114a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f22121e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f25274c, 31);
                        rg.t tVar = limitPreviewView.f22121e0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y3 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.y0) tVar).f39746b).t0(x10, getY() + y3));
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
        switch (this.f25272a) {
            case 0:
                RectF rectF = (RectF) this.f25274c;
                int dp = AndroidUtilities.dp(13.0f);
                qg0 qg0Var = (qg0) this.d;
                Drawable drawable = qg0Var.d;
                int u10 = (qg0Var.E - qg0.u(qg0Var)) - dp;
                if (qg0.v(qg0Var) == 1) {
                    u10 = (int) (qg0Var.f27301b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = qg0.w(qg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (qg0.x(qg0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - qg0.y(qg0Var)) / dp3);
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
                    org.telegram.ui.ActionBar.j6.f19151t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18934h5, false));
                    rectF.set(qg0.z(qg0Var), qg0.A(qg0Var) + i10, getMeasuredWidth() - qg0.B(qg0Var), AndroidUtilities.dp(24.0f) + qg0.E(qg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f19151t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.j6.f19151t0.setColor(w02);
                    org.telegram.ui.ActionBar.j6.f19151t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19151t0);
                }
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18934h5, false);
                org.telegram.ui.ActionBar.j6.f19151t0.setColor(Color.argb((int) (qg0Var.f27303f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(qg0.F(qg0Var), 0.0f, getMeasuredWidth() - qg0.G(qg0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.f19151t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f25272a) {
            case 0:
                qg0 qg0Var = (qg0) this.d;
                if (motionEvent.getAction() == 0 && qg0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + qg0Var.E && qg0Var.f27303f.getAlpha() == 0.0f) {
                        qg0Var.dismiss();
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
        switch (this.f25272a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                qg0.t((qg0) this.d);
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
        switch (this.f25272a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                qg0 qg0Var = (qg0) this.d;
                w5 w5Var = qg0Var.f27309y;
                mg0 mg0Var = qg0Var.f27302c;
                kg0 kg0Var = qg0Var.f27301b;
                if (!qg0.L(qg0Var)) {
                    this.f25273b = true;
                    setPadding(qg0.M(qg0Var), AndroidUtilities.statusBarHeight, qg0.N(qg0Var), 0);
                    this.f25273b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) kg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) qg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + qg0.r(qg0Var) + AndroidUtilities.statusBarHeight;
                int R = mg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        w5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (qg0.s(qg0Var) * 2)), 1073741824), i11);
                        dp = w5Var.getMeasuredHeight();
                    } else {
                        int M = mg0Var.M(i13);
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
                if (kg0Var.getPaddingTop() != dp3) {
                    this.f25273b = true;
                    kg0Var.setPinnedSectionOffsetY(-dp3);
                    kg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f25273b = false;
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
        switch (this.f25272a) {
            case 0:
                if (!((qg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f25272a) {
            case 0:
                if (!this.f25273b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public jg0(org.telegram.ui.gh0 gh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = gh0Var;
        this.f25273b = z10;
        this.f25274c = new Paint(1);
    }

    public jg0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f25274c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f25273b = z10;
    }

    public jg0(org.telegram.ui.z51 z51Var, Context context, boolean z10) {
        super(context);
        this.d = z51Var;
        this.f25273b = z10;
    }

    public jg0(org.telegram.ui.wy wyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = wyVar;
        this.f25273b = z10;
        this.f25274c = new Paint(1);
    }
}

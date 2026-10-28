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
public final class hh0 extends FrameLayout {
    public final int f28994a = 4;
    public boolean f28995b;
    public Object f28996c;
    public final Object d;

    public hh0(org.telegram.ui.rg0 rg0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = rg0Var;
        this.f28995b = z10;
        this.f28996c = new Paint(1);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f28994a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f28996c;
                if (this.f28995b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.ey) obj).getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f28996c;
                if (this.f28995b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.rg0) obj).getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.w41 w41Var = (org.telegram.ui.w41) obj;
                if (!this.f28995b && w41Var.f43884r > 0.0f) {
                    if (((Paint) this.f28996c) == null) {
                        Paint paint3 = new Paint();
                        this.f28996c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f28996c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f28996c).setAlpha((int) (w41Var.f43884r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f28996c);
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
        switch (this.f28994a) {
            case 4:
                boolean z11 = this.f28995b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f7 = limitPreviewView.f26219a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f26226e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f28996c, 31);
                        tg.t tVar = limitPreviewView.f26226e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.x5) ((org.telegram.ui.y0) tVar).f45809b).r0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        float f7;
        int i10;
        switch (this.f28994a) {
            case 0:
                RectF rectF = (RectF) this.f28996c;
                int dp = AndroidUtilities.dp(13.0f);
                oh0 oh0Var = (oh0) this.d;
                Drawable drawable = oh0Var.d;
                int v = (oh0Var.E - oh0.v(oh0Var)) - dp;
                if (oh0.w(oh0Var) == 1) {
                    v = (int) (oh0Var.f31285b.getTranslationY() + v);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + v;
                int x9 = oh0.x(oh0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (oh0.y(oh0Var) + v < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - v) - oh0.A(oh0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
                    v -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    x9 += currentActionBarHeight;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i11 = AndroidUtilities.statusBarHeight;
                int i12 = dp2 + i11;
                drawable.setBounds(0, v + i11, getMeasuredWidth(), x9);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.y6.f23649t0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false));
                    rectF.set(oh0.B(oh0Var), oh0.C(oh0Var) + i10, getMeasuredWidth() - oh0.D(oh0Var), AndroidUtilities.dp(24.0f) + oh0.F(oh0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.y6.f23649t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ii, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.y6.f23649t0.setColor(x02);
                    org.telegram.ui.ActionBar.y6.f23649t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.f23649t0);
                }
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23428h5, false);
                org.telegram.ui.ActionBar.y6.f23649t0.setColor(Color.argb((int) (oh0Var.f31287f.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(oh0.G(oh0Var), 0.0f, getMeasuredWidth() - oh0.H(oh0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.y6.f23649t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f28994a) {
            case 0:
                oh0 oh0Var = (oh0) this.d;
                if (motionEvent.getAction() == 0 && oh0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + oh0Var.E && oh0Var.f31287f.getAlpha() == 0.0f) {
                        oh0Var.dismiss();
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
        switch (this.f28994a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                oh0.u((oh0) this.d);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int M;
        switch (this.f28994a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                oh0 oh0Var = (oh0) this.d;
                b6 b6Var = oh0Var.f31293y;
                kh0 kh0Var = oh0Var.f31286c;
                ih0 ih0Var = oh0Var.f31285b;
                if (!oh0.O(oh0Var)) {
                    this.f28995b = true;
                    setPadding(oh0.P(oh0Var), AndroidUtilities.statusBarHeight, oh0.r(oh0Var), 0);
                    this.f28995b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ih0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) oh0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp = AndroidUtilities.dp(15.0f) + oh0.s(oh0Var) + AndroidUtilities.statusBarHeight;
                int R = kh0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        b6Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (oh0.t(oh0Var) * 2)), 1073741824), i11);
                        M = b6Var.getMeasuredHeight();
                    } else {
                        M = ((kh0Var.M(i13) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp2 = AndroidUtilities.dp(8.0f) + i12;
                if (ih0Var.getPaddingTop() != dp2) {
                    this.f28995b = true;
                    ih0Var.setPinnedSectionOffsetY(-dp2);
                    ih0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f28995b = false;
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
        switch (this.f28994a) {
            case 0:
                if (!((oh0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28994a) {
            case 0:
                if (!this.f28995b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public hh0(oh0 oh0Var, Context context) {
        super(context);
        this.d = oh0Var;
        this.f28995b = false;
        this.f28996c = new RectF();
    }

    public hh0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f28996c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f28995b = z10;
    }

    public hh0(org.telegram.ui.w41 w41Var, Context context, boolean z10) {
        super(context);
        this.d = w41Var;
        this.f28995b = z10;
    }

    public hh0(org.telegram.ui.ey eyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = eyVar;
        this.f28995b = z10;
        this.f28996c = new Paint(1);
    }
}

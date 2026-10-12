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
public final class oh0 extends FrameLayout {
    public final int f29213a = 4;
    public boolean f29214b;
    public Object f29215c;
    public final Object d;

    public oh0(wh0 wh0Var, Context context) {
        super(context);
        this.d = wh0Var;
        this.f29214b = false;
        this.f29215c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f29213a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f29215c;
                if (this.f29214b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.vy) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f29215c;
                if (this.f29214b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.gh0) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.e61 e61Var = (org.telegram.ui.e61) obj;
                if (!this.f29214b && e61Var.f36359r > 0.0f) {
                    if (((Paint) this.f29215c) == null) {
                        Paint paint3 = new Paint();
                        this.f29215c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f29215c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f29215c).setAlpha((int) (e61Var.f36359r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f29215c);
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
        switch (this.f29213a) {
            case 4:
                boolean z11 = this.f29214b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f24012a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f24020e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f29215c, 31);
                        rg.t tVar = limitPreviewView.f24020e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.y5) ((org.telegram.ui.z0) tVar).f44581b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f29213a) {
            case 0:
                RectF rectF = (RectF) this.f29215c;
                int dp = AndroidUtilities.dp(13.0f);
                wh0 wh0Var = (wh0) this.d;
                Drawable drawable = wh0Var.d;
                int w10 = (wh0Var.E - wh0.w(wh0Var)) - dp;
                if (wh0.x(wh0Var) == 1) {
                    w10 = (int) (wh0Var.f32406b.getTranslationY() + w10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + w10;
                int y3 = wh0.y(wh0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (wh0.z(wh0Var) + w10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w10) - wh0.A(wh0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
                    w10 -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    y3 += currentActionBarHeight;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i11 = AndroidUtilities.statusBarHeight;
                int i12 = dp2 + i11;
                drawable.setBounds(0, w10 + i11, getMeasuredWidth(), y3);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.h6.f20850t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20630h5, false));
                    rectF.set(wh0.B(wh0Var), wh0.D(wh0Var) + i10, getMeasuredWidth() - wh0.E(wh0Var), AndroidUtilities.dp(24.0f) + wh0.F(wh0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f20850t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.h6.f20850t0.setColor(x02);
                    org.telegram.ui.ActionBar.h6.f20850t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f20850t0);
                }
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20630h5, false);
                org.telegram.ui.ActionBar.h6.f20850t0.setColor(Color.argb((int) (wh0Var.f32409f.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(wh0.G(wh0Var), 0.0f, getMeasuredWidth() - wh0.H(wh0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f20850t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f29213a) {
            case 0:
                wh0 wh0Var = (wh0) this.d;
                if (motionEvent.getAction() == 0 && wh0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + wh0Var.E && wh0Var.f32409f.getAlpha() == 0.0f) {
                        wh0Var.dismiss();
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
        switch (this.f29213a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                wh0.v((wh0) this.d);
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
        switch (this.f29213a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                wh0 wh0Var = (wh0) this.d;
                a6 a6Var = wh0Var.f32415y;
                sh0 sh0Var = wh0Var.f32407c;
                ph0 ph0Var = wh0Var.f32406b;
                if (!wh0.M(wh0Var)) {
                    this.f29214b = true;
                    setPadding(wh0.N(wh0Var), AndroidUtilities.statusBarHeight, wh0.O(wh0Var), 0);
                    this.f29214b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ph0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) wh0Var.f32408e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp = AndroidUtilities.dp(15.0f) + wh0.t(wh0Var) + AndroidUtilities.statusBarHeight;
                int R = sh0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        a6Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (wh0.u(wh0Var) * 2)), 1073741824), i11);
                        M = a6Var.getMeasuredHeight();
                    } else {
                        M = ((sh0Var.M(i13) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp2 = AndroidUtilities.dp(8.0f) + i12;
                if (ph0Var.getPaddingTop() != dp2) {
                    this.f29214b = true;
                    ph0Var.setPinnedSectionOffsetY(-dp2);
                    ph0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f29214b = false;
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
        switch (this.f29213a) {
            case 0:
                if (!((wh0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f29213a) {
            case 0:
                if (!this.f29214b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public oh0(org.telegram.ui.gh0 gh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = gh0Var;
        this.f29214b = z10;
        this.f29215c = new Paint(1);
    }

    public oh0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f29215c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f29214b = z10;
    }

    public oh0(org.telegram.ui.e61 e61Var, Context context, boolean z10) {
        super(context);
        this.d = e61Var;
        this.f29214b = z10;
    }

    public oh0(org.telegram.ui.vy vyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = vyVar;
        this.f29214b = z10;
        this.f29215c = new Paint(1);
    }
}

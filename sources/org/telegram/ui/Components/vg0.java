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
public final class vg0 extends FrameLayout {
    public final int f29073a = 4;
    public boolean f29074b;
    public Object f29075c;
    public final Object d;

    public vg0(ch0 ch0Var, Context context) {
        super(context);
        this.d = ch0Var;
        this.f29074b = false;
        this.f29075c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f29073a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f29075c;
                if (this.f29074b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.uy) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f29075c;
                if (this.f29074b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.gh0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj;
                if (!this.f29074b && a61Var.f39830r > 0.0f) {
                    if (((Paint) this.f29075c) == null) {
                        Paint paint3 = new Paint();
                        this.f29075c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f29075c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f29075c).setAlpha((int) (a61Var.f39830r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f29075c);
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
        switch (this.f29073a) {
            case 4:
                boolean z11 = this.f29074b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f22338a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f22345e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f29075c, 31);
                        rg.t tVar = limitPreviewView.f22345e0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y3 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.y0) tVar).f39778b).t0(x10, getY() + y3));
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
        switch (this.f29073a) {
            case 0:
                RectF rectF = (RectF) this.f29075c;
                int dp = AndroidUtilities.dp(13.0f);
                ch0 ch0Var = (ch0) this.d;
                Drawable drawable = ch0Var.d;
                int u10 = (ch0Var.E - ch0.u(ch0Var)) - dp;
                if (ch0.v(ch0Var) == 1) {
                    u10 = (int) (ch0Var.f23357b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = ch0.w(ch0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (ch0.x(ch0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - ch0.y(ch0Var)) / dp3);
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
                    org.telegram.ui.ActionBar.j6.f19398t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false));
                    rectF.set(ch0.z(ch0Var), ch0.A(ch0Var) + i10, getMeasuredWidth() - ch0.B(ch0Var), AndroidUtilities.dp(24.0f) + ch0.D(ch0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f19398t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.j6.f19398t0.setColor(w02);
                    org.telegram.ui.ActionBar.j6.f19398t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f19398t0);
                }
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19180h5, false);
                org.telegram.ui.ActionBar.j6.f19398t0.setColor(Color.argb((int) (ch0Var.f23359f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(ch0.E(ch0Var), 0.0f, getMeasuredWidth() - ch0.F(ch0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.f19398t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f29073a) {
            case 0:
                ch0 ch0Var = (ch0) this.d;
                if (motionEvent.getAction() == 0 && ch0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + ch0Var.E && ch0Var.f23359f.getAlpha() == 0.0f) {
                        ch0Var.dismiss();
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
        switch (this.f29073a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                ch0.t((ch0) this.d);
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
        switch (this.f29073a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                ch0 ch0Var = (ch0) this.d;
                x5 x5Var = ch0Var.f23365y;
                yg0 yg0Var = ch0Var.f23358c;
                wg0 wg0Var = ch0Var.f23357b;
                if (!ch0.L(ch0Var)) {
                    this.f29074b = true;
                    setPadding(ch0.M(ch0Var), AndroidUtilities.statusBarHeight, ch0.N(ch0Var), 0);
                    this.f29074b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) wg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) ch0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + ch0.r(ch0Var) + AndroidUtilities.statusBarHeight;
                int R = yg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        x5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (ch0.s(ch0Var) * 2)), 1073741824), i11);
                        dp = x5Var.getMeasuredHeight();
                    } else {
                        int M = yg0Var.M(i13);
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
                if (wg0Var.getPaddingTop() != dp3) {
                    this.f29074b = true;
                    wg0Var.setPinnedSectionOffsetY(-dp3);
                    wg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f29074b = false;
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
        switch (this.f29073a) {
            case 0:
                if (!((ch0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f29073a) {
            case 0:
                if (!this.f29074b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public vg0(org.telegram.ui.gh0 gh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = gh0Var;
        this.f29074b = z10;
        this.f29075c = new Paint(1);
    }

    public vg0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f29075c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f29074b = z10;
    }

    public vg0(org.telegram.ui.a61 a61Var, Context context, boolean z10) {
        super(context);
        this.d = a61Var;
        this.f29074b = z10;
    }

    public vg0(org.telegram.ui.uy uyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = uyVar;
        this.f29074b = z10;
        this.f29075c = new Paint(1);
    }
}

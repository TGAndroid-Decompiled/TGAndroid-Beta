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
public final class mh0 extends FrameLayout {
    public final int f28707a = 4;
    public boolean f28708b;
    public Object f28709c;
    public final Object d;

    public mh0(uh0 uh0Var, Context context) {
        super(context);
        this.d = uh0Var;
        this.f28708b = false;
        this.f28709c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f28707a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f28709c;
                if (this.f28708b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.sy) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f28709c;
                if (this.f28708b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.eh0) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.a61 a61Var = (org.telegram.ui.a61) obj;
                if (!this.f28708b && a61Var.f44268r > 0.0f) {
                    if (((Paint) this.f28709c) == null) {
                        Paint paint3 = new Paint();
                        this.f28709c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f28709c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f28709c).setAlpha((int) (a61Var.f44268r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f28709c);
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
        switch (this.f28707a) {
            case 4:
                boolean z11 = this.f28708b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f24227a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f24235e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f28709c, 31);
                        rg.t tVar = limitPreviewView.f24235e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.u5) ((org.telegram.ui.y0) tVar).f44212b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f28707a) {
            case 0:
                RectF rectF = (RectF) this.f28709c;
                int dp = AndroidUtilities.dp(13.0f);
                uh0 uh0Var = (uh0) this.d;
                Drawable drawable = uh0Var.d;
                int w10 = (uh0Var.E - uh0.w(uh0Var)) - dp;
                if (uh0.x(uh0Var) == 1) {
                    w10 = (int) (uh0Var.f31451b.getTranslationY() + w10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + w10;
                int y3 = uh0.y(uh0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (uh0.z(uh0Var) + w10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w10) - uh0.B(uh0Var)) / dp3);
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
                    org.telegram.ui.ActionBar.h6.f21076t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false));
                    rectF.set(uh0.C(uh0Var), uh0.D(uh0Var) + i10, getMeasuredWidth() - uh0.E(uh0Var), AndroidUtilities.dp(24.0f) + uh0.F(uh0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f21076t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.h6.f21076t0.setColor(x02);
                    org.telegram.ui.ActionBar.h6.f21076t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21076t0);
                }
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20857h5, false);
                org.telegram.ui.ActionBar.h6.f21076t0.setColor(Color.argb((int) (uh0Var.f31454f.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(uh0.G(uh0Var), 0.0f, getMeasuredWidth() - uh0.H(uh0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f21076t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f28707a) {
            case 0:
                uh0 uh0Var = (uh0) this.d;
                if (motionEvent.getAction() == 0 && uh0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + uh0Var.E && uh0Var.f31454f.getAlpha() == 0.0f) {
                        uh0Var.dismiss();
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
        switch (this.f28707a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                uh0.v((uh0) this.d);
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
        switch (this.f28707a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                uh0 uh0Var = (uh0) this.d;
                a6 a6Var = uh0Var.f31460y;
                qh0 qh0Var = uh0Var.f31452c;
                nh0 nh0Var = uh0Var.f31451b;
                if (!uh0.M(uh0Var)) {
                    this.f28708b = true;
                    setPadding(uh0.N(uh0Var), AndroidUtilities.statusBarHeight, uh0.O(uh0Var), 0);
                    this.f28708b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) nh0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) uh0Var.f31453e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp = AndroidUtilities.dp(15.0f) + uh0.t(uh0Var) + AndroidUtilities.statusBarHeight;
                int R = qh0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        a6Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (uh0.u(uh0Var) * 2)), 1073741824), i11);
                        M = a6Var.getMeasuredHeight();
                    } else {
                        M = ((qh0Var.M(i13) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp2 = AndroidUtilities.dp(8.0f) + i12;
                if (nh0Var.getPaddingTop() != dp2) {
                    this.f28708b = true;
                    nh0Var.setPinnedSectionOffsetY(-dp2);
                    nh0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f28708b = false;
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
        switch (this.f28707a) {
            case 0:
                if (!((uh0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28707a) {
            case 0:
                if (!this.f28708b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public mh0(org.telegram.ui.eh0 eh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = eh0Var;
        this.f28708b = z10;
        this.f28709c = new Paint(1);
    }

    public mh0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f28709c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f28708b = z10;
    }

    public mh0(org.telegram.ui.a61 a61Var, Context context, boolean z10) {
        super(context);
        this.d = a61Var;
        this.f28708b = z10;
    }

    public mh0(org.telegram.ui.sy syVar, Activity activity, boolean z10) {
        super(activity);
        this.d = syVar;
        this.f28708b = z10;
        this.f28709c = new Paint(1);
    }
}

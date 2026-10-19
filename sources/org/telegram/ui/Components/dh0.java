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
public final class dh0 extends FrameLayout {
    public final int f25562a = 4;
    public boolean f25563b;
    public Object f25564c;
    public final Object d;

    public dh0(kh0 kh0Var, Context context) {
        super(context);
        this.d = kh0Var;
        this.f25563b = false;
        this.f25564c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f25562a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f25564c;
                if (this.f25563b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.cy) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f25564c;
                if (this.f25563b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.ng0) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.o41 o41Var = (org.telegram.ui.o41) obj;
                if (!this.f25563b && o41Var.f39112r > 0.0f) {
                    if (((Paint) this.f25564c) == null) {
                        Paint paint3 = new Paint();
                        this.f25564c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f25564c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f25564c).setAlpha((int) (o41Var.f39112r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f25564c);
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
        switch (this.f25562a) {
            case 4:
                boolean z11 = this.f25563b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f7 = limitPreviewView.f24277a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f24284e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f25564c, 31);
                        sg.t tVar = limitPreviewView.f24284e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.z5) ((org.telegram.ui.b1) tVar).f35464b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f25562a) {
            case 0:
                RectF rectF = (RectF) this.f25564c;
                int dp = AndroidUtilities.dp(13.0f);
                kh0 kh0Var = (kh0) this.d;
                Drawable drawable = kh0Var.d;
                int w9 = (kh0Var.E - kh0.w(kh0Var)) - dp;
                if (kh0.x(kh0Var) == 1) {
                    w9 = (int) (kh0Var.f27853b.getTranslationY() + w9);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + w9;
                int y3 = kh0.y(kh0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (kh0.z(kh0Var) + w9 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w9) - kh0.A(kh0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - dp3) * min);
                    w9 -= currentActionBarHeight;
                    dp2 -= currentActionBarHeight;
                    y3 += currentActionBarHeight;
                    f7 = 1.0f - min;
                } else {
                    f7 = 1.0f;
                }
                int i11 = AndroidUtilities.statusBarHeight;
                int i12 = dp2 + i11;
                drawable.setBounds(0, w9 + i11, getMeasuredWidth(), y3);
                drawable.draw(canvas);
                if (f7 != 1.0f) {
                    org.telegram.ui.ActionBar.h6.f21277t0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21058h5, false));
                    rectF.set(kh0.B(kh0Var), kh0.C(kh0Var) + i10, getMeasuredWidth() - kh0.D(kh0Var), AndroidUtilities.dp(24.0f) + kh0.E(kh0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f21277t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ii, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.h6.f21277t0.setColor(x02);
                    org.telegram.ui.ActionBar.h6.f21277t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f21277t0);
                }
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21058h5, false);
                org.telegram.ui.ActionBar.h6.f21277t0.setColor(Color.argb((int) (kh0Var.f27855f.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(kh0.F(kh0Var), 0.0f, getMeasuredWidth() - kh0.G(kh0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f21277t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f25562a) {
            case 0:
                kh0 kh0Var = (kh0) this.d;
                if (motionEvent.getAction() == 0 && kh0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + kh0Var.E && kh0Var.f27855f.getAlpha() == 0.0f) {
                        kh0Var.dismiss();
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
        switch (this.f25562a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                kh0.v((kh0) this.d);
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
        switch (this.f25562a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                kh0 kh0Var = (kh0) this.d;
                z5 z5Var = kh0Var.f27861y;
                gh0 gh0Var = kh0Var.f27854c;
                eh0 eh0Var = kh0Var.f27853b;
                if (!kh0.M(kh0Var)) {
                    this.f25563b = true;
                    setPadding(kh0.N(kh0Var), AndroidUtilities.statusBarHeight, kh0.O(kh0Var), 0);
                    this.f25563b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) eh0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) kh0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp = AndroidUtilities.dp(15.0f) + kh0.t(kh0Var) + AndroidUtilities.statusBarHeight;
                int R = gh0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        z5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (kh0.u(kh0Var) * 2)), 1073741824), i11);
                        M = z5Var.getMeasuredHeight();
                    } else {
                        M = ((gh0Var.M(i13) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp2 = AndroidUtilities.dp(8.0f) + i12;
                if (eh0Var.getPaddingTop() != dp2) {
                    this.f25563b = true;
                    eh0Var.setPinnedSectionOffsetY(-dp2);
                    eh0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f25563b = false;
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
        switch (this.f25562a) {
            case 0:
                if (!((kh0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f25562a) {
            case 0:
                if (!this.f25563b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public dh0(org.telegram.ui.ng0 ng0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = ng0Var;
        this.f25563b = z10;
        this.f25564c = new Paint(1);
    }

    public dh0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f25564c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f25563b = z10;
    }

    public dh0(org.telegram.ui.o41 o41Var, Context context, boolean z10) {
        super(context);
        this.d = o41Var;
        this.f25563b = z10;
    }

    public dh0(org.telegram.ui.cy cyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = cyVar;
        this.f25563b = z10;
        this.f25564c = new Paint(1);
    }
}

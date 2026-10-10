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
public final class lh0 extends FrameLayout {
    public final int f28342a = 4;
    public boolean f28343b;
    public Object f28344c;
    public final Object d;

    public lh0(th0 th0Var, Context context) {
        super(context);
        this.d = th0Var;
        this.f28343b = false;
        this.f28344c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f28342a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f28344c;
                if (this.f28343b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.ty) obj).getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f28344c;
                if (this.f28343b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.fh0) obj).getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.b61 b61Var = (org.telegram.ui.b61) obj;
                if (!this.f28343b && b61Var.f44542r > 0.0f) {
                    if (((Paint) this.f28344c) == null) {
                        Paint paint3 = new Paint();
                        this.f28344c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f28344c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f28344c).setAlpha((int) (b61Var.f44542r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f28344c);
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
        switch (this.f28342a) {
            case 4:
                boolean z11 = this.f28343b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f24239a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f24247e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f28344c, 31);
                        rg.t tVar = limitPreviewView.f24247e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.z0) tVar).f44483b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f28342a) {
            case 0:
                RectF rectF = (RectF) this.f28344c;
                int dp = AndroidUtilities.dp(13.0f);
                th0 th0Var = (th0) this.d;
                Drawable drawable = th0Var.d;
                int w10 = (th0Var.E - th0.w(th0Var)) - dp;
                if (th0.x(th0Var) == 1) {
                    w10 = (int) (th0Var.f31136b.getTranslationY() + w10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + w10;
                int y3 = th0.y(th0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (th0.z(th0Var) + w10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w10) - th0.B(th0Var)) / dp3);
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
                    org.telegram.ui.ActionBar.i6.f21090t0.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false));
                    rectF.set(th0.C(th0Var), th0.D(th0Var) + i10, getMeasuredWidth() - th0.E(th0Var), AndroidUtilities.dp(24.0f) + th0.F(th0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.i6.f21090t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int x02 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Ii, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.i6.f21090t0.setColor(x02);
                    org.telegram.ui.ActionBar.i6.f21090t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.i6.f21090t0);
                }
                int x03 = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20872h5, false);
                org.telegram.ui.ActionBar.i6.f21090t0.setColor(Color.argb((int) (th0Var.f31139f.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(th0.G(th0Var), 0.0f, getMeasuredWidth() - th0.H(th0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.i6.f21090t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f28342a) {
            case 0:
                th0 th0Var = (th0) this.d;
                if (motionEvent.getAction() == 0 && th0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + th0Var.E && th0Var.f31139f.getAlpha() == 0.0f) {
                        th0Var.dismiss();
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
        switch (this.f28342a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                th0.v((th0) this.d);
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
        switch (this.f28342a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                th0 th0Var = (th0) this.d;
                a6 a6Var = th0Var.f31145y;
                ph0 ph0Var = th0Var.f31137c;
                mh0 mh0Var = th0Var.f31136b;
                if (!th0.M(th0Var)) {
                    this.f28343b = true;
                    setPadding(th0.N(th0Var), AndroidUtilities.statusBarHeight, th0.O(th0Var), 0);
                    this.f28343b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) mh0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) th0Var.f31138e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp = AndroidUtilities.dp(15.0f) + th0.t(th0Var) + AndroidUtilities.statusBarHeight;
                int R = ph0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        a6Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (th0.u(th0Var) * 2)), 1073741824), i11);
                        M = a6Var.getMeasuredHeight();
                    } else {
                        M = ((ph0Var.M(i13) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp2 = AndroidUtilities.dp(8.0f) + i12;
                if (mh0Var.getPaddingTop() != dp2) {
                    this.f28343b = true;
                    mh0Var.setPinnedSectionOffsetY(-dp2);
                    mh0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f28343b = false;
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
        switch (this.f28342a) {
            case 0:
                if (!((th0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28342a) {
            case 0:
                if (!this.f28343b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public lh0(org.telegram.ui.fh0 fh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = fh0Var;
        this.f28343b = z10;
        this.f28344c = new Paint(1);
    }

    public lh0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f28344c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f28343b = z10;
    }

    public lh0(org.telegram.ui.b61 b61Var, Context context, boolean z10) {
        super(context);
        this.d = b61Var;
        this.f28343b = z10;
    }

    public lh0(org.telegram.ui.ty tyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = tyVar;
        this.f28343b = z10;
        this.f28344c = new Paint(1);
    }
}

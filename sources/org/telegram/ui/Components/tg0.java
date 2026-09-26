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
public final class tg0 extends FrameLayout {
    public final int f28531a = 4;
    public boolean f28532b;
    public Object f28533c;
    public final Object d;

    public tg0(bh0 bh0Var, Context context) {
        super(context);
        this.d = bh0Var;
        this.f28532b = false;
        this.f28533c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f28531a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f28533c;
                if (this.f28532b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.qy) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f28533c;
                if (this.f28532b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.yg0) obj).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.r51 r51Var = (org.telegram.ui.r51) obj;
                if (!this.f28532b && r51Var.f36412r > 0.0f) {
                    if (((Paint) this.f28533c) == null) {
                        Paint paint3 = new Paint();
                        this.f28533c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f28533c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f28533c).setAlpha((int) (r51Var.f36412r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f28533c);
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
        switch (this.f28531a) {
            case 4:
                boolean z11 = this.f28532b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f22323a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f22330e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f28533c, 31);
                        rg.t tVar = limitPreviewView.f22330e0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y3 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.v5) ((org.telegram.ui.z0) tVar).f40299b).t0(x10, getY() + y3));
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
        switch (this.f28531a) {
            case 0:
                RectF rectF = (RectF) this.f28533c;
                int dp = AndroidUtilities.dp(13.0f);
                bh0 bh0Var = (bh0) this.d;
                Drawable drawable = bh0Var.d;
                int u10 = (bh0Var.E - bh0.u(bh0Var)) - dp;
                if (bh0.v(bh0Var) == 1) {
                    u10 = (int) (bh0Var.f23017b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = bh0.w(bh0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (bh0.x(bh0Var) + u10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - u10) - bh0.y(bh0Var)) / dp3);
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
                    org.telegram.ui.ActionBar.h6.f19348t0.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false));
                    rectF.set(bh0.z(bh0Var), bh0.A(bh0Var) + i10, getMeasuredWidth() - bh0.B(bh0Var), AndroidUtilities.dp(24.0f) + bh0.E(bh0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.h6.f19348t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.h6.f19348t0.setColor(w02);
                    org.telegram.ui.ActionBar.h6.f19348t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.f19348t0);
                }
                int w03 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19129h5, false);
                org.telegram.ui.ActionBar.h6.f19348t0.setColor(Color.argb((int) (bh0Var.f23019f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(bh0.F(bh0Var), 0.0f, getMeasuredWidth() - bh0.G(bh0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.h6.f19348t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f28531a) {
            case 0:
                bh0 bh0Var = (bh0) this.d;
                if (motionEvent.getAction() == 0 && bh0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + bh0Var.E && bh0Var.f23019f.getAlpha() == 0.0f) {
                        bh0Var.dismiss();
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
        switch (this.f28531a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                bh0.t((bh0) this.d);
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
        switch (this.f28531a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                bh0 bh0Var = (bh0) this.d;
                y5 y5Var = bh0Var.f23025y;
                xg0 xg0Var = bh0Var.f23018c;
                ug0 ug0Var = bh0Var.f23017b;
                if (!bh0.L(bh0Var)) {
                    this.f28532b = true;
                    setPadding(bh0.M(bh0Var), AndroidUtilities.statusBarHeight, bh0.N(bh0Var), 0);
                    this.f28532b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) ug0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) bh0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + bh0.r(bh0Var) + AndroidUtilities.statusBarHeight;
                int R = xg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        y5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (bh0.s(bh0Var) * 2)), 1073741824), i11);
                        dp = y5Var.getMeasuredHeight();
                    } else {
                        int M = xg0Var.M(i13);
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
                if (ug0Var.getPaddingTop() != dp3) {
                    this.f28532b = true;
                    ug0Var.setPinnedSectionOffsetY(-dp3);
                    ug0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f28532b = false;
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
        switch (this.f28531a) {
            case 0:
                if (!((bh0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f28531a) {
            case 0:
                if (!this.f28532b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public tg0(org.telegram.ui.yg0 yg0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = yg0Var;
        this.f28532b = z10;
        this.f28533c = new Paint(1);
    }

    public tg0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f28533c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f28532b = z10;
    }

    public tg0(org.telegram.ui.r51 r51Var, Context context, boolean z10) {
        super(context);
        this.d = r51Var;
        this.f28532b = z10;
    }

    public tg0(org.telegram.ui.qy qyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = qyVar;
        this.f28532b = z10;
        this.f28533c = new Paint(1);
    }
}

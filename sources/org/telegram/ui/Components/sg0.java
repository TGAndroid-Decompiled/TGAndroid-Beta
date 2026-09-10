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
public final class sg0 extends FrameLayout {
    public final int f27049a = 4;
    public boolean f27050b;
    public Object f27051c;
    public final Object d;

    public sg0(zg0 zg0Var, Context context) {
        super(context);
        this.d = zg0Var;
        this.f27050b = false;
        this.f27051c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f27049a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f27051c;
                if (this.f27050b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.wy) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f27051c;
                if (this.f27050b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.fh0) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.c61 c61Var = (org.telegram.ui.c61) obj;
                if (!this.f27050b && c61Var.f30817r > 0.0f) {
                    if (((Paint) this.f27051c) == null) {
                        Paint paint3 = new Paint();
                        this.f27051c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f27051c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f27051c).setAlpha((int) (c61Var.f30817r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f27051c);
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
        switch (this.f27049a) {
            case 4:
                boolean z11 = this.f27050b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    float f7 = limitPreviewView.f21186a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f21193e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f27051c, 31);
                        qg.u uVar = limitPreviewView.f21193e0;
                        float x10 = getX() + ((ViewGroup) getParent()).getX();
                        float y3 = ((ViewGroup) getParent()).getY();
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.w5) ((org.telegram.ui.a1) uVar).f30765b).t0(x10, getY() + y3));
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
        switch (this.f27049a) {
            case 0:
                RectF rectF = (RectF) this.f27051c;
                int dp = AndroidUtilities.dp(13.0f);
                zg0 zg0Var = (zg0) this.d;
                Drawable drawable = zg0Var.d;
                int u10 = (zg0Var.E - zg0.u(zg0Var)) - dp;
                if (zg0.v(zg0Var) == 1) {
                    u10 = (int) (zg0Var.f29678b.getTranslationY() + u10);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + u10;
                int w10 = zg0.w(zg0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (zg0.x(zg0Var) + u10 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - u10) - zg0.y(zg0Var)) / dp3);
                    int currentActionBarHeight = (int) ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - dp3) * min);
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
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
                    rectF.set(zg0.z(zg0Var), zg0.A(zg0Var) + i10, getMeasuredWidth() - zg0.C(zg0Var), AndroidUtilities.dp(24.0f) + zg0.D(zg0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.j6.f18212t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false);
                    int alpha = Color.alpha(w02);
                    org.telegram.ui.ActionBar.j6.f18212t0.setColor(w02);
                    org.telegram.ui.ActionBar.j6.f18212t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.f18212t0);
                }
                int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false);
                org.telegram.ui.ActionBar.j6.f18212t0.setColor(Color.argb((int) (zg0Var.f29680f.getAlpha() * 255.0f), Color.red(w03), Color.green(w03), Color.blue(w03)));
                canvas.drawRect(zg0.E(zg0Var), 0.0f, getMeasuredWidth() - zg0.F(zg0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.j6.f18212t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f27049a) {
            case 0:
                zg0 zg0Var = (zg0) this.d;
                if (motionEvent.getAction() == 0 && zg0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + zg0Var.E && zg0Var.f29680f.getAlpha() == 0.0f) {
                        zg0Var.dismiss();
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
        switch (this.f27049a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                zg0.t((zg0) this.d);
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
        switch (this.f27049a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                zg0 zg0Var = (zg0) this.d;
                x5 x5Var = zg0Var.f29686y;
                vg0 vg0Var = zg0Var.f29679c;
                tg0 tg0Var = zg0Var.f29678b;
                if (!zg0.L(zg0Var)) {
                    this.f27050b = true;
                    setPadding(zg0.M(zg0Var), AndroidUtilities.statusBarHeight, zg0.N(zg0Var), 0);
                    this.f27050b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) tg0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) zg0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                int dp2 = AndroidUtilities.dp(15.0f) + zg0.r(zg0Var) + AndroidUtilities.statusBarHeight;
                int R = vg0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        x5Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (zg0.s(zg0Var) * 2)), 1073741824), i11);
                        dp = x5Var.getMeasuredHeight();
                    } else {
                        int M = vg0Var.M(i13);
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
                if (tg0Var.getPaddingTop() != dp3) {
                    this.f27050b = true;
                    tg0Var.setPinnedSectionOffsetY(-dp3);
                    tg0Var.setPadding(0, dp3, 0, AndroidUtilities.navigationBarHeight);
                    this.f27050b = false;
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
        switch (this.f27049a) {
            case 0:
                if (!((zg0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f27049a) {
            case 0:
                if (!this.f27050b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public sg0(org.telegram.ui.fh0 fh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = fh0Var;
        this.f27050b = z10;
        this.f27051c = new Paint(1);
    }

    public sg0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f27051c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f27050b = z10;
    }

    public sg0(org.telegram.ui.c61 c61Var, Context context, boolean z10) {
        super(context);
        this.d = c61Var;
        this.f27050b = z10;
    }

    public sg0(org.telegram.ui.wy wyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = wyVar;
        this.f27050b = z10;
        this.f27051c = new Paint(1);
    }
}

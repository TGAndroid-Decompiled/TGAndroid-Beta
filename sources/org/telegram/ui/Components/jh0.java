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
public final class jh0 extends FrameLayout {
    public final int f26032a = 4;
    public boolean f26033b;
    public Object f26034c;
    public final Object d;

    public jh0(qh0 qh0Var, Context context) {
        super(context);
        this.d = qh0Var;
        this.f26033b = false;
        this.f26034c = new RectF();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10 = this.f26032a;
        Object obj = this.d;
        switch (i10) {
            case 1:
                Paint paint = (Paint) this.f26034c;
                if (this.f26033b) {
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint.setColor(((org.telegram.ui.yy) obj).getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint);
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f26034c;
                if (this.f26033b) {
                    paint2.setStyle(Paint.Style.STROKE);
                    paint2.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    paint2.setColor(((org.telegram.ui.jh0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 3:
                org.telegram.ui.i61 i61Var = (org.telegram.ui.i61) obj;
                if (!this.f26033b && i61Var.f36089r > 0.0f) {
                    if (((Paint) this.f26034c) == null) {
                        Paint paint3 = new Paint();
                        this.f26034c = paint3;
                        paint3.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f26034c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f26034c).setAlpha((int) (i61Var.f36089r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f26034c);
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
        switch (this.f26032a) {
            case 4:
                boolean z11 = this.f26033b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.d;
                if (view instanceof TextView) {
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    float f7 = limitPreviewView.f22921a;
                    boolean z12 = false;
                    if (f7 != 0.0f && f7 <= 1.0f && z11) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (f7 == 1.0f && !z11) {
                        z12 = true;
                    }
                    if ((z10 || z12) && limitPreviewView.f22928e0 != null) {
                        canvas.saveLayer(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), (Paint) this.f26034c, 31);
                        sg.t tVar = limitPreviewView.f22928e0;
                        canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), ((org.telegram.ui.z5) ((org.telegram.ui.b1) tVar).f34139b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
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
        switch (this.f26032a) {
            case 0:
                RectF rectF = (RectF) this.f26034c;
                int dp = AndroidUtilities.dp(13.0f);
                qh0 qh0Var = (qh0) this.d;
                Drawable drawable = qh0Var.d;
                int w9 = (qh0Var.E - qh0.w(qh0Var)) - dp;
                if (qh0.x(qh0Var) == 1) {
                    w9 = (int) (qh0Var.f28286b.getTranslationY() + w9);
                }
                int dp2 = AndroidUtilities.dp(20.0f) + w9;
                int y3 = qh0.y(qh0Var) + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                if (qh0.z(qh0Var) + w9 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) {
                    float dp3 = AndroidUtilities.dp(4.0f) + dp;
                    float min = Math.min(1.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - w9) - qh0.B(qh0Var)) / dp3);
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
                    org.telegram.ui.ActionBar.g6.f19891t0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
                    rectF.set(qh0.C(qh0Var), qh0.D(qh0Var) + i10, getMeasuredWidth() - qh0.E(qh0Var), AndroidUtilities.dp(24.0f) + qh0.F(qh0Var) + i10);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) * f7, AndroidUtilities.dp(12.0f) * f7, org.telegram.ui.ActionBar.g6.f19891t0);
                }
                if (f7 != 0.0f) {
                    int dp4 = AndroidUtilities.dp(36.0f);
                    rectF.set((getMeasuredWidth() - dp4) / 2, i12, (getMeasuredWidth() + dp4) / 2, AndroidUtilities.dp(4.0f) + i12);
                    int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Ii, false);
                    int alpha = Color.alpha(x02);
                    org.telegram.ui.ActionBar.g6.f19891t0.setColor(x02);
                    org.telegram.ui.ActionBar.g6.f19891t0.setAlpha((int) (alpha * 1.0f * f7));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.f19891t0);
                }
                int x03 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false);
                org.telegram.ui.ActionBar.g6.f19891t0.setColor(Color.argb((int) (qh0Var.f28288f.getAlpha() * 255.0f), Color.red(x03), Color.green(x03), Color.blue(x03)));
                canvas.drawRect(qh0.G(qh0Var), 0.0f, getMeasuredWidth() - qh0.H(qh0Var), AndroidUtilities.statusBarHeight, org.telegram.ui.ActionBar.g6.f19891t0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f26032a) {
            case 0:
                qh0 qh0Var = (qh0) this.d;
                if (motionEvent.getAction() == 0 && qh0Var.E != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + qh0Var.E && qh0Var.f28288f.getAlpha() == 0.0f) {
                        qh0Var.dismiss();
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
        switch (this.f26032a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                qh0.v((qh0) this.d);
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
        switch (this.f26032a) {
            case 0:
                int size = View.MeasureSpec.getSize(i11);
                qh0 qh0Var = (qh0) this.d;
                a6 a6Var = qh0Var.f28294y;
                mh0 mh0Var = qh0Var.f28287c;
                kh0 kh0Var = qh0Var.f28286b;
                if (!qh0.M(qh0Var)) {
                    this.f26033b = true;
                    setPadding(qh0.N(qh0Var), AndroidUtilities.statusBarHeight, qh0.O(qh0Var), 0);
                    this.f26033b = false;
                }
                int paddingTop = size - getPaddingTop();
                ((FrameLayout.LayoutParams) kh0Var.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                ((FrameLayout.LayoutParams) qh0Var.e.getLayoutParams()).topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                int dp = AndroidUtilities.dp(15.0f) + qh0.t(qh0Var) + AndroidUtilities.statusBarHeight;
                int R = mh0Var.R();
                for (int i13 = 0; i13 < R; i13++) {
                    if (i13 == 0) {
                        a6Var.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10 - (qh0.u(qh0Var) * 2)), 1073741824), i11);
                        M = a6Var.getMeasuredHeight();
                    } else {
                        M = ((mh0Var.M(i13) - 1) * AndroidUtilities.dp(50.0f)) + AndroidUtilities.dp(32.0f);
                    }
                    dp = M + dp;
                }
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                } else {
                    i12 = paddingTop - ((paddingTop / 5) * 3);
                }
                int dp2 = AndroidUtilities.dp(8.0f) + i12;
                if (kh0Var.getPaddingTop() != dp2) {
                    this.f26033b = true;
                    kh0Var.setPinnedSectionOffsetY(-dp2);
                    kh0Var.setPadding(0, dp2, 0, AndroidUtilities.navigationBarHeight);
                    this.f26033b = false;
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
        switch (this.f26032a) {
            case 0:
                if (!((qh0) this.d).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f26032a) {
            case 0:
                if (!this.f26033b) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    public jh0(org.telegram.ui.jh0 jh0Var, Activity activity, boolean z10) {
        super(activity);
        this.d = jh0Var;
        this.f26033b = z10;
        this.f26034c = new Paint(1);
    }

    public jh0(LimitPreviewView limitPreviewView, Context context, boolean z10) {
        super(context);
        this.d = limitPreviewView;
        Paint paint = new Paint();
        this.f26034c = paint;
        setLayerType(2, null);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.f26033b = z10;
    }

    public jh0(org.telegram.ui.i61 i61Var, Context context, boolean z10) {
        super(context);
        this.d = i61Var;
        this.f26033b = z10;
    }

    public jh0(org.telegram.ui.yy yyVar, Activity activity, boolean z10) {
        super(activity);
        this.d = yyVar;
        this.f26033b = z10;
        this.f26034c = new Paint(1);
    }
}

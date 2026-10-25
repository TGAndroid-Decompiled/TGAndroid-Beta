package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qg0 extends ub {
    public final LinearLayout f31917a;
    public final TextView f31918b;
    public final ak0 f31919c;
    public final RectF d;
    public final Path e;
    public final wh.b f31920f;
    public ValueAnimator h;
    public float f31921n;
    public float f31922r;
    public float f31923s;
    public float v;

    public qg0(Context context, org.telegram.ui.ActionBar.u6 u6Var, Drawable drawable, CharSequence charSequence) {
        super(context, u6Var);
        this.d = new RectF();
        this.e = new Path();
        this.f31921n = 1.0f;
        this.f31922r = 1.0f;
        this.f31923s = 1.0f;
        this.v = 1.0f;
        setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        setBackground(Integer.MIN_VALUE, 24);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f31917a = linearLayout;
        linearLayout.setGravity(16);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(context);
        this.f31919c = imageView;
        imageView.setImageDrawable(drawable);
        imageView.setColorFilter(-1);
        linearLayout.addView((View) imageView, gb1.r(24, 24));
        TextView textView = new TextView(context);
        this.f31918b = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 15.0f);
        textView.setGravity(16);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(charSequence);
        linearLayout.addView(textView, gb1.q(1.0f, 0, -1, 12, 0, 0));
        addView(linearLayout, gb1.i(-1, 48, 17));
        this.f31920f = new wh.b(new tv(this, 13));
    }

    public static void c(qg0 qg0Var, Canvas canvas, int i10) {
        int saveLayerAlpha = canvas.saveLayerAlpha(0.0f, 0.0f, qg0Var.getWidth(), qg0Var.getHeight(), i10);
        qg0Var.drawChild(canvas, qg0Var.f31917a, qg0Var.getDrawingTime());
        canvas.restoreToCount(saveLayerAlpha);
    }

    public static void d(qg0 qg0Var, boolean z10, q0.a aVar, ValueAnimator valueAnimator) {
        float f7;
        RenderEffect renderEffect;
        float sin;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z10) {
            if (floatValue <= 200.0f) {
                float f10 = 1.0f - f(floatValue / 200.0f);
                qg0Var.f31921n = (1.0f - (f10 * f10)) * 1.027027f;
            } else {
                float f11 = 1.0f - f((floatValue - 200.0f) / 120.0f);
                qg0Var.f31921n = c3.h0.u(f11, 0.027027028f, f11, 1.0f);
            }
            if (floatValue < 160.0f) {
                sin = 1.0f - ((float) Math.pow(1.0f - (floatValue / 160.0f), 3.0d));
            } else {
                sin = (((float) Math.sin(f((floatValue - 160.0f) / 160.0f) * 3.141592653589793d)) / 48.0f) + 1.0f;
            }
            qg0Var.f31922r = sin;
            qg0Var.f31923s = f((floatValue - 130.0f) / 70.0f);
            qg0Var.v = f(floatValue / 160.0f);
        } else {
            qg0Var.f31923s = 1.0f - f(floatValue / 60.0f);
            float f12 = f(floatValue / 150.0f);
            qg0Var.f31921n = 1.0f - (((float) Math.pow(f12, 0.7d)) * 0.8783784f);
            qg0Var.f31922r = org.telegram.ui.d3.A(f12, 0.625f, f12, 1.0f);
            qg0Var.v = (1.0f - f((floatValue - 150.0f) / 30.0f)) * (1.0f - (f12 * 0.15f));
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (z10) {
                f7 = (1.0f - f(floatValue / 160.0f)) * AndroidUtilities.dp(6.0f);
            } else {
                f7 = (f(floatValue / 180.0f) + 1.0f) * AndroidUtilities.dp(3.0f);
            }
            if (f7 > 0.01f) {
                renderEffect = RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.DECAL);
            } else {
                renderEffect = null;
            }
            qg0Var.setRenderEffect(renderEffect);
        }
        aVar.accept(Float.valueOf(0.0f));
        qg0Var.invalidate();
    }

    public static void e(qg0 qg0Var, final boolean z10, Runnable runnable, Runnable runnable2, final q0.a aVar) {
        float f7;
        long j10;
        ValueAnimator valueAnimator = qg0Var.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            qg0Var.h.cancel();
            qg0Var.transitionRunningEnter = false;
        }
        qg0Var.f31920f.a();
        ub.IN_OUT_OFFSET_Y.b(qg0Var, 0.0f);
        runnable.run();
        if (z10) {
            f7 = 320.0f;
        } else {
            f7 = 180.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f7);
        qg0Var.h = ofFloat;
        if (z10) {
            j10 = 320;
        } else {
            j10 = 180;
        }
        ofFloat.setDuration(j10);
        qg0Var.h.setInterpolator(null);
        qg0Var.h.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                qg0.d(qg0.this, z10, aVar, valueAnimator2);
            }
        });
        qg0Var.h.addListener(new bi.ce(29, qg0Var, runnable2));
        if (z10) {
            qg0Var.v = 0.0f;
            qg0Var.f31923s = 0.0f;
            qg0Var.f31922r = 0.0f;
            qg0Var.f31921n = 0.0f;
        }
        qg0Var.h.start();
    }

    public static float f(float f7) {
        return Math.max(0.0f, Math.min(1.0f, f7));
    }

    @Override
    public final tb createTransition() {
        return new jg.i(this);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width = (getWidth() - AndroidUtilities.dp(8.0f)) * this.f31921n;
        float dp = AndroidUtilities.dp(48.0f) * this.f31922r;
        RectF rectF = this.d;
        rectF.set((getWidth() - width) / 2.0f, (getHeight() - dp) / 2.0f, (getWidth() + width) / 2.0f, (getHeight() + dp) / 2.0f);
        this.background.setBounds(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        this.background.setAlpha(Math.round(this.v * 255.0f));
        this.background.draw(canvas);
        this.background.setAlpha(255);
        if (this.f31923s > 0.0f) {
            canvas.save();
            Path path = this.e;
            path.rewind();
            float f7 = dp / 2.0f;
            path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
            canvas.clipPath(path);
            int i10 = (this.f31923s > 1.0f ? 1 : (this.f31923s == 1.0f ? 0 : -1));
            wh.b bVar = this.f31920f;
            if (i10 < 0 && bVar.f51204c == null) {
                bVar.b(getWidth(), getHeight(), 2.0f, AndroidUtilities.dp(3.0f));
            }
            bVar.setBounds(0, 0, getWidth(), getHeight());
            bVar.f51207i = Math.round(this.f31923s * 255.0f);
            bVar.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public CharSequence getAccessibilityText() {
        return this.f31918b.getText();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.h;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.h.cancel();
            this.h = null;
        }
        this.f31920f.a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(304.0f), Math.max(0, View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(24.0f))), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    public final void onShow() {
        super.onShow();
        this.f31919c.d();
    }
}

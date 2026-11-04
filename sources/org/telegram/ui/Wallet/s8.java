package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;
public final class s8 extends FrameLayout {
    public boolean E;
    public final View f43165a;
    public final EditTextBoldCursor f43166b;
    public final View f43167c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final k4 f43168e;
    public final k4 f43169f;
    public final Paint h;
    public final TextPaint f43170n;
    public final RectF f43171r;
    public ValueAnimator f43172s;
    public float f43173w;
    public float f43174x;
    public boolean f43175y;

    public s8(Context context, View view, org.telegram.ui.ActionBar.e6 e6Var, k4 k4Var, k4 k4Var2, k4 k4Var3) {
        super(context);
        this.h = new Paint(1);
        this.f43170n = new TextPaint(1);
        this.f43171r = new RectF();
        this.f43174x = 1.0f;
        this.f43165a = view;
        this.d = e6Var;
        this.f43168e = k4Var;
        this.f43169f = k4Var3;
        setWillNotDraw(false);
        addView(view, mf.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43166b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i3, e6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, e6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i3, e6Var);
        editTextBoldCursor.setHint(bd.M0(2131743036, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new r8(this, 0));
        editTextBoldCursor.addTextChangedListener(new bh.h(k4Var2, 27));
        addView(editTextBoldCursor, mf.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.f43167c = view2;
        view2.setContentDescription(bd.M0(2131745846, null));
        int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
        Drawable h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, e6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(view2, h02, null, N, e6Var);
        view2.setOnClickListener(new h3(this, 5));
        addView(view2, mf.e(40, 40, 53));
    }

    public static float c(float f10, float f11, float f12) {
        float max = Math.max(0.0f, Math.min(1.0f, (f12 - f10) / (f11 - f10)));
        return com.google.android.recaptcha.internal.a.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.f43175y) {
            return;
        }
        this.E = true;
        EditTextBoldCursor editTextBoldCursor = this.f43166b;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    public final void b(boolean z10) {
        int i3;
        float f10;
        long j10;
        if (this.f43175y == z10) {
            return;
        }
        this.f43175y = z10;
        this.E = false;
        ValueAnimator valueAnimator = this.f43172s;
        if (valueAnimator != null) {
            this.f43172s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.f43166b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        if (z10) {
            i3 = 2131752041;
        } else {
            i3 = 2131745846;
        }
        this.f43167c.setContentDescription(bd.M0(i3, null));
        if (!z10) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.f43168e.a(Boolean.valueOf(z10));
        float f11 = this.f43173w;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f43172s = ofFloat;
        if (z10) {
            j10 = 380;
        } else {
            j10 = 300;
        }
        ofFloat.setDuration(j10);
        this.f43172s.setInterpolator(xq.h);
        this.f43165a.setVisibility(0);
        this.f43172s.addUpdateListener(new p3(this, 7));
        this.f43172s.addListener(new i81(this, 10));
        this.f43172s.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        float f10;
        float f11;
        float f12;
        int i3;
        ValueAnimator valueAnimator = this.f43172s;
        if (valueAnimator != null) {
            this.f43172s = null;
            valueAnimator.cancel();
        }
        float f13 = 1.0f;
        if (this.f43175y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f43173w = f10;
        this.f43169f.a(Float.valueOf(f10));
        if (this.f43175y) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        View view = this.f43165a;
        view.setAlpha(f11);
        if (this.f43175y) {
            f12 = 0.94f;
        } else {
            f12 = 1.0f;
        }
        view.setScaleX(f12);
        int i10 = 0;
        if (this.f43175y) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        if (!this.f43175y) {
            f13 = 0.0f;
        }
        EditTextBoldCursor editTextBoldCursor = this.f43166b;
        editTextBoldCursor.setAlpha(f13);
        editTextBoldCursor.setTranslationX(0.0f);
        if (!this.f43175y) {
            i10 = 4;
        }
        editTextBoldCursor.setVisibility(i10);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        super.onDraw(canvas);
        float max = Math.max(this.f43174x, this.f43173w);
        if (max > 0.0f) {
            int i3 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
            if (i3 < 0) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
                float f10 = (max * 0.2f) + 0.8f;
                float L = org.telegram.messenger.g0.L(40.0f) / 2.0f;
                canvas2.scale(f10, f10, getWidth() - L, L);
            } else {
                canvas2 = canvas;
            }
            float L2 = org.telegram.messenger.g0.L(40.0f);
            float f11 = L2 / 2.0f;
            float width = getWidth() - f11;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.h;
            paint.setStyle(style);
            int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
            org.telegram.ui.ActionBar.e6 e6Var = this.d;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, e6Var));
            float f12 = 1.0f - this.f43173w;
            RectF rectF = this.f43171r;
            rectF.set(f12 * (getWidth() - L2), 0.0f, getWidth(), L2);
            canvas2.drawRoundRect(rectF, f11, f11, paint);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, e6Var));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c2 = c(0.08f, 0.85f, this.f43173w);
            float f13 = 1.0f - c2;
            float L3 = org.telegram.messenger.g0.L(6.0f) * f13;
            if (L3 > 0.3f) {
                canvas2.drawCircle(width - (org.telegram.messenger.g0.L(1.5f) * f13), f11 - (org.telegram.messenger.g0.L(1.5f) * f13), L3, paint);
            }
            float L4 = (org.telegram.messenger.g0.L(2.6f) * f13) - (org.telegram.messenger.g0.L(5.0f) * c2);
            float L5 = (org.telegram.messenger.g0.L(5.0f) * c2) + (org.telegram.messenger.g0.L(6.5f) * f13);
            canvas2.drawLine(width + L4, L4 + f11, width + L5, L5 + f11, paint);
            float L6 = org.telegram.messenger.g0.L(5.0f) * c2;
            if (L6 > 0.3f) {
                float f14 = width + L6;
                float f15 = f11 - L6;
                float f16 = width - L6;
                float f17 = f11 + L6;
                canvas3 = canvas;
                canvas3.drawLine(f14, f15, f16, f17, paint);
            } else {
                canvas3 = canvas;
            }
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.f43173w) * 255.0f));
            float d = ((1.0f - this.f43173w) * k2.p1.d(80.0f, getWidth(), 0)) + org.telegram.messenger.g0.L(22.0f);
            canvas3.drawCircle(d - org.telegram.messenger.g0.L(1.0f), f11 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), paint);
            canvas3.drawLine(org.telegram.messenger.g0.L(3.0f) + d, org.telegram.messenger.g0.L(3.0f) + f11, d + org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + f11, paint);
            paint.setAlpha(255);
            if (i3 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TextPaint textPaint = this.f43170n;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(bd.M0(2131742992, null)))) + ((int) Math.ceil(textPaint.measureText(bd.M0(2131743180, null))));
        int size = View.MeasureSpec.getSize(i3);
        int min = Math.min(L, Math.max(0, size - org.telegram.messenger.g0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f43165a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.g0.L(48.0f)) - min));
        super.onMeasure(i3, i10);
    }
}

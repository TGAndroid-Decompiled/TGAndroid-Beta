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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xq;
import org.telegram.ui.r81;
public final class t8 extends FrameLayout {
    public boolean D;
    public final View f43147a;
    public final EditTextBoldCursor f43148b;
    public final View f43149c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final m4 f43150e;
    public final m4 f43151f;
    public final Paint h;
    public final TextPaint f43152n;
    public final RectF f43153r;
    public ValueAnimator f43154s;
    public float f43155w;
    public float f43156x;
    public boolean f43157y;

    public t8(Context context, View view, org.telegram.ui.ActionBar.f6 f6Var, m4 m4Var, m4 m4Var2, m4 m4Var3) {
        super(context);
        this.h = new Paint(1);
        this.f43152n = new TextPaint(1);
        this.f43153r = new RectF();
        this.f43156x = 1.0f;
        this.f43147a = view;
        this.d = f6Var;
        this.f43150e = m4Var;
        this.f43151f = m4Var3;
        setWillNotDraw(false);
        addView(view, c8.ha.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f43148b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i7, f6Var);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, f6Var);
        org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 30, i7, f6Var);
        editTextBoldCursor.setHint(hd.M0(2131743027, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new s8(this, 0));
        editTextBoldCursor.addTextChangedListener(new ah.j(m4Var2, 27));
        addView(editTextBoldCursor, c8.ha.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.f43149c = view2;
        view2.setContentDescription(hd.M0(2131745837, null));
        int i10 = org.telegram.ui.ActionBar.k6.f27940i6;
        Drawable h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i10, f6Var), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(view2, h02, null, N, f6Var);
        view2.setOnClickListener(new j3(this, 5));
        addView(view2, c8.ha.e(40, 40, 53));
    }

    public static float c(float f10, float f11, float f12) {
        float max = Math.max(0.0f, Math.min(1.0f, (f12 - f10) / (f11 - f10)));
        return com.google.android.recaptcha.internal.a.C(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.f43157y) {
            return;
        }
        this.D = true;
        EditTextBoldCursor editTextBoldCursor = this.f43148b;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    public final void b(boolean z9) {
        int i7;
        float f10;
        long j3;
        if (this.f43157y == z9) {
            return;
        }
        this.f43157y = z9;
        this.D = false;
        ValueAnimator valueAnimator = this.f43154s;
        if (valueAnimator != null) {
            this.f43154s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.f43148b;
        editTextBoldCursor.setEnabled(z9);
        editTextBoldCursor.setVisibility(0);
        if (z9) {
            i7 = 2131752041;
        } else {
            i7 = 2131745837;
        }
        this.f43149c.setContentDescription(hd.M0(i7, null));
        if (!z9) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.f43150e.a(Boolean.valueOf(z9));
        float f11 = this.f43155w;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f43154s = ofFloat;
        if (z9) {
            j3 = 380;
        } else {
            j3 = 300;
        }
        ofFloat.setDuration(j3);
        this.f43154s.setInterpolator(xq.h);
        this.f43147a.setVisibility(0);
        this.f43154s.addUpdateListener(new r3(this, 7));
        this.f43154s.addListener(new r81(this, 10));
        this.f43154s.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        float f10;
        float f11;
        float f12;
        int i7;
        ValueAnimator valueAnimator = this.f43154s;
        if (valueAnimator != null) {
            this.f43154s = null;
            valueAnimator.cancel();
        }
        float f13 = 1.0f;
        if (this.f43157y) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f43155w = f10;
        this.f43151f.a(Float.valueOf(f10));
        if (this.f43157y) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        View view = this.f43147a;
        view.setAlpha(f11);
        if (this.f43157y) {
            f12 = 0.94f;
        } else {
            f12 = 1.0f;
        }
        view.setScaleX(f12);
        int i10 = 0;
        if (this.f43157y) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
        if (!this.f43157y) {
            f13 = 0.0f;
        }
        EditTextBoldCursor editTextBoldCursor = this.f43148b;
        editTextBoldCursor.setAlpha(f13);
        editTextBoldCursor.setTranslationX(0.0f);
        if (!this.f43157y) {
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
        float max = Math.max(this.f43156x, this.f43155w);
        if (max > 0.0f) {
            int i7 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
            if (i7 < 0) {
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
            int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
            org.telegram.ui.ActionBar.f6 f6Var = this.d;
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, f6Var));
            float f12 = 1.0f - this.f43155w;
            RectF rectF = this.f43153r;
            rectF.set(f12 * (getWidth() - L2), 0.0f, getWidth(), L2);
            canvas2.drawRoundRect(rectF, f11, f11, paint);
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, f6Var));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c10 = c(0.08f, 0.85f, this.f43155w);
            float f13 = 1.0f - c10;
            float L3 = org.telegram.messenger.g0.L(6.0f) * f13;
            if (L3 > 0.3f) {
                canvas2.drawCircle(width - (org.telegram.messenger.g0.L(1.5f) * f13), f11 - (org.telegram.messenger.g0.L(1.5f) * f13), L3, paint);
            }
            float L4 = (org.telegram.messenger.g0.L(2.6f) * f13) - (org.telegram.messenger.g0.L(5.0f) * c10);
            float L5 = (org.telegram.messenger.g0.L(5.0f) * c10) + (org.telegram.messenger.g0.L(6.5f) * f13);
            canvas2.drawLine(width + L4, L4 + f11, width + L5, L5 + f11, paint);
            float L6 = org.telegram.messenger.g0.L(5.0f) * c10;
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
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.f43155w) * 255.0f));
            float e10 = ((1.0f - this.f43155w) * jg.g.e(80.0f, getWidth(), 0)) + org.telegram.messenger.g0.L(22.0f);
            canvas3.drawCircle(e10 - org.telegram.messenger.g0.L(1.0f), f11 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), paint);
            canvas3.drawLine(org.telegram.messenger.g0.L(3.0f) + e10, org.telegram.messenger.g0.L(3.0f) + f11, e10 + org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + f11, paint);
            paint.setAlpha(255);
            if (i7 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextPaint textPaint = this.f43152n;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(hd.M0(2131742983, null)))) + ((int) Math.ceil(textPaint.measureText(hd.M0(2131743171, null))));
        int size = View.MeasureSpec.getSize(i7);
        int min = Math.min(L, Math.max(0, size - org.telegram.messenger.g0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f43147a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.g0.L(48.0f)) - min));
        super.onMeasure(i7, i10);
    }
}

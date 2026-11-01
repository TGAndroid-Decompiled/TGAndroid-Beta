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
import org.telegram.messenger.dd;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gr;
import org.telegram.ui.ms0;
public final class y8 extends FrameLayout {
    public boolean D;
    public final View f35422a;
    public final EditTextBoldCursor f35423b;
    public final View f35424c;
    public final org.telegram.ui.ActionBar.p6 d;
    public final m4 e;
    public final m4 f35425f;
    public final Paint h;
    public final TextPaint f35426n;
    public final RectF f35427r;
    public ValueAnimator f35428s;
    public float f35429w;
    public float f35430x;
    public boolean f35431y;

    public y8(Context context, View view, org.telegram.ui.ActionBar.p6 p6Var, m4 m4Var, m4 m4Var2, m4 m4Var3) {
        super(context);
        this.h = new Paint(1);
        this.f35426n = new TextPaint(1);
        this.f35427r = new RectF();
        this.f35430x = 1.0f;
        this.f35422a = view;
        this.d = p6Var;
        this.e = m4Var;
        this.f35425f = m4Var3;
        setWillNotDraw(false);
        addView(view, w7.b6.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f35423b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editTextBoldCursor, i10, p6Var);
        org.telegram.ui.ActionBar.a7.E(editTextBoldCursor, org.telegram.ui.ActionBar.t6.H6, p6Var);
        org.telegram.ui.ActionBar.a7.m(editTextBoldCursor, 30, i10, p6Var);
        editTextBoldCursor.setHint(dd.L0(2131743052, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new x8(this, 0));
        editTextBoldCursor.addTextChangedListener(new ag.a1(m4Var2, 22));
        addView(editTextBoldCursor, w7.b6.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.f35424c = view2;
        view2.setContentDescription(dd.L0(2131745853, null));
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        Drawable h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 1, -1);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.a7.k(view2, h02, null, N, p6Var);
        view2.setOnClickListener(new j3(this, 5));
        addView(view2, w7.b6.e(40, 40, 53));
    }

    public static float c(float f7, float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (f11 - f7) / (f10 - f7)));
        return c3.i0.D(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.f35431y) {
            return;
        }
        this.D = true;
        EditTextBoldCursor editTextBoldCursor = this.f35423b;
        org.telegram.messenger.i0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    public final void b(boolean z10) {
        int i10;
        float f7;
        long j10;
        if (this.f35431y == z10) {
            return;
        }
        this.f35431y = z10;
        this.D = false;
        ValueAnimator valueAnimator = this.f35428s;
        if (valueAnimator != null) {
            this.f35428s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.f35423b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        if (z10) {
            i10 = 2131752041;
        } else {
            i10 = 2131745853;
        }
        this.f35424c.setContentDescription(dd.L0(i10, null));
        if (!z10) {
            org.telegram.messenger.i0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.a(Boolean.valueOf(z10));
        float f10 = this.f35429w;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f35428s = ofFloat;
        if (z10) {
            j10 = 380;
        } else {
            j10 = 300;
        }
        ofFloat.setDuration(j10);
        this.f35428s.setInterpolator(gr.h);
        this.f35422a.setVisibility(0);
        this.f35428s.addUpdateListener(new r3(this, 7));
        this.f35428s.addListener(new ms0(this, 21));
        this.f35428s.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        float f7;
        float f10;
        float f11;
        int i10;
        ValueAnimator valueAnimator = this.f35428s;
        if (valueAnimator != null) {
            this.f35428s = null;
            valueAnimator.cancel();
        }
        float f12 = 1.0f;
        if (this.f35431y) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.f35429w = f7;
        this.f35425f.a(Float.valueOf(f7));
        if (this.f35431y) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        View view = this.f35422a;
        view.setAlpha(f10);
        if (this.f35431y) {
            f11 = 0.94f;
        } else {
            f11 = 1.0f;
        }
        view.setScaleX(f11);
        int i11 = 0;
        if (this.f35431y) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (!this.f35431y) {
            f12 = 0.0f;
        }
        EditTextBoldCursor editTextBoldCursor = this.f35423b;
        editTextBoldCursor.setAlpha(f12);
        editTextBoldCursor.setTranslationX(0.0f);
        if (!this.f35431y) {
            i11 = 4;
        }
        editTextBoldCursor.setVisibility(i11);
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        super.onDraw(canvas);
        float max = Math.max(this.f35430x, this.f35429w);
        if (max > 0.0f) {
            int i10 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
            if (i10 < 0) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
                float f7 = (max * 0.2f) + 0.8f;
                float L = org.telegram.messenger.i0.L(40.0f) / 2.0f;
                canvas2.scale(f7, f7, getWidth() - L, L);
            } else {
                canvas2 = canvas;
            }
            float L2 = org.telegram.messenger.i0.L(40.0f);
            float f10 = L2 / 2.0f;
            float width = getWidth() - f10;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.h;
            paint.setStyle(style);
            int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
            org.telegram.ui.ActionBar.p6 p6Var = this.d;
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, p6Var));
            float f11 = 1.0f - this.f35429w;
            RectF rectF = this.f35427r;
            rectF.set(f11 * (getWidth() - L2), 0.0f, getWidth(), L2);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, p6Var));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.i0.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c10 = c(0.08f, 0.85f, this.f35429w);
            float f12 = 1.0f - c10;
            float L3 = org.telegram.messenger.i0.L(6.0f) * f12;
            if (L3 > 0.3f) {
                canvas2.drawCircle(width - (org.telegram.messenger.i0.L(1.5f) * f12), f10 - (org.telegram.messenger.i0.L(1.5f) * f12), L3, paint);
            }
            float L4 = (org.telegram.messenger.i0.L(2.6f) * f12) - (org.telegram.messenger.i0.L(5.0f) * c10);
            float L5 = (org.telegram.messenger.i0.L(5.0f) * c10) + (org.telegram.messenger.i0.L(6.5f) * f12);
            canvas2.drawLine(width + L4, L4 + f10, width + L5, L5 + f10, paint);
            float L6 = org.telegram.messenger.i0.L(5.0f) * c10;
            if (L6 > 0.3f) {
                float f13 = width + L6;
                float f14 = f10 - L6;
                float f15 = width - L6;
                float f16 = f10 + L6;
                canvas3 = canvas;
                canvas3.drawLine(f13, f14, f15, f16, paint);
            } else {
                canvas3 = canvas;
            }
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.f35429w) * 255.0f));
            float d = ((1.0f - this.f35429w) * i0.a.d(80.0f, getWidth(), 0)) + org.telegram.messenger.i0.L(22.0f);
            canvas3.drawCircle(d - org.telegram.messenger.i0.L(1.0f), f10 - org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(5.0f), paint);
            canvas3.drawLine(org.telegram.messenger.i0.L(3.0f) + d, org.telegram.messenger.i0.L(3.0f) + f10, d + org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f) + f10, paint);
            paint.setAlpha(255);
            if (i10 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.f35426n;
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(dd.L0(2131743008, null)))) + ((int) Math.ceil(textPaint.measureText(dd.L0(2131743196, null))));
        int size = View.MeasureSpec.getSize(i10);
        int min = Math.min(L, Math.max(0, size - org.telegram.messenger.i0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f35422a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.i0.L(48.0f)) - min));
        super.onMeasure(i10, i11);
    }
}

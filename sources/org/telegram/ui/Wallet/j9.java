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
import org.telegram.ui.Components.nr;
import org.telegram.ui.k71;
public final class j9 extends FrameLayout {
    public boolean E;
    public boolean F;
    public final View f44425a;
    public final EditTextBoldCursor f44426b;
    public final View f44427c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final v4 f44428e;
    public final v4 f44429f;
    public final Paint h;
    public final TextPaint f44430n;
    public final RectF f44431r;
    public ValueAnimator f44432s;
    public float f44433w;
    public float f44434x;
    public fh.g f44435y;

    public j9(Context context, View view, org.telegram.ui.ActionBar.h6 h6Var, v4 v4Var, v4 v4Var2, v4 v4Var3) {
        super(context);
        this.h = new Paint(1);
        this.f44430n = new TextPaint(1);
        this.f44431r = new RectF();
        this.f44434x = 1.0f;
        this.f44425a = view;
        this.d = h6Var;
        this.f44428e = v4Var;
        this.f44429f = v4Var3;
        setWillNotDraw(false);
        addView(view, c8.na.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f44426b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, i7, h6Var);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.H6, h6Var);
        org.telegram.ui.ActionBar.t6.l(editTextBoldCursor, 30, i7, h6Var);
        editTextBoldCursor.setHint(hd.N0(2131742762, null));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new h9(this, 0));
        editTextBoldCursor.addTextChangedListener(new i9(v4Var2, 0));
        addView(editTextBoldCursor, c8.na.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.f44427c = view2;
        view2.setContentDescription(hd.N0(2131745640, null));
        int i10 = org.telegram.ui.ActionBar.m6.f29439i6;
        Drawable h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i10, h6Var), 1, -1);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i10);
        view2.setBackground(h02);
        org.telegram.ui.ActionBar.t6.j(view2, h02, null, M, h6Var);
        view2.setOnClickListener(new o3(this, 5));
        addView(view2, c8.na.e(40, 40, 53));
    }

    public static float c(float f10, float f11, float f12) {
        float max = Math.max(0.0f, Math.min(1.0f, (f12 - f10) / (f11 - f10)));
        return com.google.android.gms.internal.vision.e2.C(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.E) {
            return;
        }
        this.F = true;
        EditTextBoldCursor editTextBoldCursor = this.f44426b;
        org.telegram.messenger.g0.v1(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    public final void b(boolean z10) {
        int i7;
        float f10;
        long j3;
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        this.F = false;
        ValueAnimator valueAnimator = this.f44432s;
        if (valueAnimator != null) {
            this.f44432s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.f44426b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        if (z10) {
            i7 = 2131752029;
        } else {
            i7 = 2131745640;
        }
        this.f44427c.setContentDescription(hd.N0(i7, null));
        if (!z10) {
            org.telegram.messenger.g0.v1(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.f44428e.a(Boolean.valueOf(z10));
        float f11 = this.f44433w;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.f44432s = ofFloat;
        if (z10) {
            j3 = 380;
        } else {
            j3 = 300;
        }
        ofFloat.setDuration(j3);
        this.f44432s.setInterpolator(nr.h);
        this.f44425a.setVisibility(0);
        this.f44432s.addUpdateListener(new z3(this, 7));
        this.f44432s.addListener(new k71(this, 11));
        this.f44432s.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        float f10;
        float f11;
        float f12;
        int i7;
        ValueAnimator valueAnimator = this.f44432s;
        if (valueAnimator != null) {
            this.f44432s = null;
            valueAnimator.cancel();
        }
        float f13 = 1.0f;
        if (this.E) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        this.f44433w = f10;
        this.f44429f.a(Float.valueOf(f10));
        if (this.E) {
            f11 = 0.0f;
        } else {
            f11 = 1.0f;
        }
        View view = this.f44425a;
        view.setAlpha(f11);
        if (this.E) {
            f12 = 0.94f;
        } else {
            f12 = 1.0f;
        }
        view.setScaleX(f12);
        int i10 = 0;
        if (this.E) {
            i7 = 4;
        } else {
            i7 = 0;
        }
        view.setVisibility(i7);
        if (!this.E) {
            f13 = 0.0f;
        }
        EditTextBoldCursor editTextBoldCursor = this.f44426b;
        editTextBoldCursor.setAlpha(f13);
        editTextBoldCursor.setTranslationX(0.0f);
        if (!this.E) {
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
        float max = Math.max(this.f44434x, this.f44433w);
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
            float f12 = 1.0f - this.f44433w;
            RectF rectF = this.f44431r;
            rectF.set(f12 * (getWidth() - L2), 0.0f, getWidth(), L2);
            fh.g gVar = this.f44435y;
            org.telegram.ui.ActionBar.h6 h6Var = this.d;
            Paint paint = this.h;
            if (gVar != null) {
                gVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f44435y.draw(canvas2);
            } else {
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var));
                canvas2.drawRoundRect(rectF, f11, f11, paint);
            }
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, h6Var));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(org.telegram.messenger.g0.L(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c10 = c(0.08f, 0.85f, this.f44433w);
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
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.f44433w) * 255.0f));
            float d = ((1.0f - this.f44433w) * i5.c.d(80.0f, getWidth(), 0)) + org.telegram.messenger.g0.L(22.0f);
            canvas3.drawCircle(d - org.telegram.messenger.g0.L(1.0f), f11 - org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(5.0f), paint);
            canvas3.drawLine(org.telegram.messenger.g0.L(3.0f) + d, org.telegram.messenger.g0.L(3.0f) + f11, d + org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f) + f11, paint);
            paint.setAlpha(255);
            if (i7 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TextPaint textPaint = this.f44430n;
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(62.0f) + ((int) Math.ceil(textPaint.measureText(hd.N0(2131742718, null)))) + ((int) Math.ceil(textPaint.measureText(hd.N0(2131742926, null))));
        int size = View.MeasureSpec.getSize(i7);
        int min = Math.min(L, Math.max(0, size - org.telegram.messenger.g0.L(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44425a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - org.telegram.messenger.g0.L(48.0f)) - min));
        super.onMeasure(i7, i10);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f44435y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

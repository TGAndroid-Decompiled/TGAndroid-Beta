package org.telegram.ui.Wallet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.tf1;
public final class n8 extends FrameLayout {
    public final View f34609a;
    public final EditTextBoldCursor f34610b;
    public final View f34611c;
    public final org.telegram.ui.ActionBar.d6 d;
    public final w3 e;
    public final w3 f34612f;
    public final Paint h;
    public final TextPaint f34613n;
    public final RectF f34614r;
    public ValueAnimator f34615s;
    public float v;
    public float f34616w;
    public boolean f34617x;
    public boolean f34618y;

    public n8(Context context, View view, org.telegram.ui.ActionBar.d6 d6Var, w3 w3Var, w3 w3Var2, w3 w3Var3) {
        super(context);
        this.h = new Paint(1);
        this.f34613n = new TextPaint(1);
        this.f34614r = new RectF();
        this.f34616w = 1.0f;
        this.f34609a = view;
        this.d = d6Var;
        this.e = w3Var;
        this.f34612f = w3Var3;
        setWillNotDraw(false);
        addView(view, w7.z5.e(-2, 40, 51));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34610b = editTextBoldCursor;
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setTextSize(15.0f);
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        editTextBoldCursor.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        editTextBoldCursor.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        editTextBoldCursor.setHint(LocaleController.getString(R.string.WalletSearchGifts));
        editTextBoldCursor.setBackground(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setGravity(16);
        editTextBoldCursor.setImeOptions(3);
        editTextBoldCursor.setVisibility(4);
        editTextBoldCursor.setEnabled(false);
        editTextBoldCursor.setOnEditorActionListener(new l8(this, 0));
        editTextBoldCursor.addTextChangedListener(new m8(w3Var2));
        addView(editTextBoldCursor, w7.z5.d(-1, 40.0f, 48, 40.0f, 0.0f, 44.0f, 0.0f));
        View view2 = new View(context);
        this.f34611c = view2;
        view2.setContentDescription(LocaleController.getString(R.string.Search));
        view2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, d6Var), 1, -1));
        view2.setOnClickListener(new t2(this, 5));
        addView(view2, w7.z5.e(40, 40, 53));
    }

    public static float c(float f7, float f10, float f11) {
        float max = Math.max(0.0f, Math.min(1.0f, (f11 - f7) / (f10 - f7)));
        return com.google.android.gms.internal.play_billing.k3.B(max, 2.0f, 3.0f, max * max);
    }

    public final void a() {
        if (!this.f34617x) {
            return;
        }
        this.f34618y = true;
        EditTextBoldCursor editTextBoldCursor = this.f34610b;
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        editTextBoldCursor.clearFocus();
    }

    public final void b(boolean z10) {
        int i10;
        float f7;
        long j10;
        if (this.f34617x == z10) {
            return;
        }
        this.f34617x = z10;
        this.f34618y = false;
        ValueAnimator valueAnimator = this.f34615s;
        if (valueAnimator != null) {
            this.f34615s = null;
            valueAnimator.cancel();
        }
        EditTextBoldCursor editTextBoldCursor = this.f34610b;
        editTextBoldCursor.setEnabled(z10);
        editTextBoldCursor.setVisibility(0);
        if (z10) {
            i10 = R.string.Close;
        } else {
            i10 = R.string.Search;
        }
        this.f34611c.setContentDescription(LocaleController.getString(i10));
        if (!z10) {
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
            editTextBoldCursor.clearFocus();
            editTextBoldCursor.setText("");
        }
        this.e.run(Boolean.valueOf(z10));
        float f10 = this.v;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.f34615s = ofFloat;
        if (z10) {
            j10 = 380;
        } else {
            j10 = 300;
        }
        ofFloat.setDuration(j10);
        this.f34615s.setInterpolator(bs.h);
        this.f34609a.setVisibility(0);
        this.f34615s.addUpdateListener(new b3(this, 7));
        this.f34615s.addListener(new tf1(this, 8));
        this.f34615s.start();
    }

    @Override
    public final void onDetachedFromWindow() {
        float f7;
        float f10;
        float f11;
        int i10;
        ValueAnimator valueAnimator = this.f34615s;
        if (valueAnimator != null) {
            this.f34615s = null;
            valueAnimator.cancel();
        }
        float f12 = 1.0f;
        if (this.f34617x) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        this.v = f7;
        this.f34612f.run(Float.valueOf(f7));
        if (this.f34617x) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        View view = this.f34609a;
        view.setAlpha(f10);
        if (this.f34617x) {
            f11 = 0.94f;
        } else {
            f11 = 1.0f;
        }
        view.setScaleX(f11);
        int i11 = 0;
        if (this.f34617x) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        view.setVisibility(i10);
        if (!this.f34617x) {
            f12 = 0.0f;
        }
        EditTextBoldCursor editTextBoldCursor = this.f34610b;
        editTextBoldCursor.setAlpha(f12);
        editTextBoldCursor.setTranslationX(0.0f);
        if (!this.f34617x) {
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
        float max = Math.max(this.f34616w, this.v);
        if (max > 0.0f) {
            int i10 = (max > 1.0f ? 1 : (max == 1.0f ? 0 : -1));
            if (i10 < 0) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), Math.round(max * 255.0f));
                float f7 = (max * 0.2f) + 0.8f;
                float dp = AndroidUtilities.dp(40.0f) / 2.0f;
                canvas2.scale(f7, f7, getWidth() - dp, dp);
            } else {
                canvas2 = canvas;
            }
            float dp2 = AndroidUtilities.dp(40.0f);
            float f10 = dp2 / 2.0f;
            float width = getWidth() - f10;
            Paint.Style style = Paint.Style.FILL;
            Paint paint = this.h;
            paint.setStyle(style);
            int i11 = org.telegram.ui.ActionBar.h6.f20990d6;
            org.telegram.ui.ActionBar.d6 d6Var = this.d;
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
            float f11 = 1.0f - this.v;
            RectF rectF = this.f34614r;
            rectF.set(f11 * (getWidth() - dp2), 0.0f, getWidth(), dp2);
            canvas2.drawRoundRect(rectF, f10, f10, paint);
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.9f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            float c10 = c(0.08f, 0.85f, this.v);
            float f12 = 1.0f - c10;
            float dp3 = AndroidUtilities.dp(6.0f) * f12;
            if (dp3 > 0.3f) {
                canvas2.drawCircle(width - (AndroidUtilities.dp(1.5f) * f12), f10 - (AndroidUtilities.dp(1.5f) * f12), dp3, paint);
            }
            float dp4 = (AndroidUtilities.dp(2.6f) * f12) - (AndroidUtilities.dp(5.0f) * c10);
            float dp5 = (AndroidUtilities.dp(5.0f) * c10) + (AndroidUtilities.dp(6.5f) * f12);
            canvas2.drawLine(width + dp4, dp4 + f10, width + dp5, dp5 + f10, paint);
            float dp6 = AndroidUtilities.dp(5.0f) * c10;
            if (dp6 > 0.3f) {
                float f13 = width + dp6;
                float f14 = f10 - dp6;
                float f15 = width - dp6;
                float f16 = f10 + dp6;
                canvas3 = canvas;
                canvas3.drawLine(f13, f14, f15, f16, paint);
            } else {
                canvas3 = canvas;
            }
            paint.setAlpha(Math.round(c(0.3f, 0.9f, this.v) * 255.0f));
            float b10 = ((1.0f - this.v) * org.telegram.messenger.g0.b(80.0f, getWidth(), 0)) + AndroidUtilities.dp(22.0f);
            canvas3.drawCircle(b10 - AndroidUtilities.dp(1.0f), f10 - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), paint);
            canvas3.drawLine(AndroidUtilities.dp(3.0f) + b10, AndroidUtilities.dp(3.0f) + f10, b10 + AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f) + f10, paint);
            paint.setAlpha(255);
            if (i10 < 0) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.f34613n;
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(62.0f) + ((int) Math.ceil(textPaint.measureText(LocaleController.getString(R.string.WalletTransactions)))) + ((int) Math.ceil(textPaint.measureText(LocaleController.getString(R.string.WalletCollectibles))));
        int size = View.MeasureSpec.getSize(i10);
        int min = Math.min(dp, Math.max(0, size - AndroidUtilities.dp(48.0f)));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f34609a.getLayoutParams();
        layoutParams.width = min;
        layoutParams.leftMargin = Math.max(0, Math.min((size - min) / 2, (size - AndroidUtilities.dp(48.0f)) - min));
        super.onMeasure(i10, i11);
    }
}

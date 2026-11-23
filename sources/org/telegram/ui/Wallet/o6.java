package org.telegram.ui.Wallet;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
public final class o6 extends ReplacementSpan {
    public static Typeface f44717x;
    public final String f44718a;
    public final String f44719b;
    public final String f44720c;
    public final String d;
    public final org.telegram.ui.ActionBar.h6 f44721e;
    public final TextPaint f44722f;
    public final Paint h;
    public final RectF f44723n;
    public LinearGradient f44724r;
    public float f44725s;
    public int f44726w;

    public o6(String str, String str2, String str3, String str4, org.telegram.ui.ActionBar.h6 h6Var) {
        TextPaint textPaint = new TextPaint(1);
        this.f44722f = textPaint;
        this.h = new Paint(1);
        this.f44723n = new RectF();
        this.f44718a = str;
        this.f44719b = str2;
        this.f44720c = str3;
        this.d = str4;
        this.f44721e = h6Var;
        if (f44717x == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                f44717x = new Typeface.Builder(org.telegram.messenger.t0.f26895b.getAssets(), "fonts/rmono_var.ttf").setFontVariationSettings("'wght' 500").setWeight(500).build();
            } else {
                f44717x = org.telegram.messenger.g0.o1("fonts/rmono.ttf");
            }
        }
        textPaint.setTypeface(f44717x);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i7, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        float f11;
        float f12;
        TextPaint textPaint = this.f44722f;
        textPaint.setTextSize(paint.getTextSize() * 0.95f);
        int color = paint.getColor();
        textPaint.setColor(color);
        int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29290a7, this.f44721e);
        Paint paint2 = this.h;
        paint2.setColor(w02);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        float f13 = i12;
        float f14 = ((fontMetricsInt.ascent + fontMetricsInt.descent) / 2.0f) + f13;
        float L = org.telegram.messenger.g0.L(6.0f);
        float L2 = org.telegram.messenger.g0.L(5.0f);
        String str = this.f44718a;
        float L3 = org.telegram.messenger.g0.L(21.0f) / 2.0f;
        float f15 = f14 - L3;
        float f16 = 2.0f * L2;
        float f17 = f14 + L3;
        RectF rectF = this.f44723n;
        rectF.set(f10, f15, textPaint.measureText(str) + f10 + f16, f17);
        canvas.drawRoundRect(rectF, L, L, paint2);
        canvas.drawText(str, f10 + L2, f13, textPaint);
        float L4 = org.telegram.messenger.g0.L(3.0f) + rectF.right;
        String str2 = this.f44719b;
        float measureText = (textPaint.measureText(" ") * 0.3f) + textPaint.measureText(str2);
        String str3 = this.f44720c;
        float measureText2 = textPaint.measureText(str3) + measureText;
        rectF.set(L4, f15, L4 + measureText2 + f16, f17);
        canvas.drawRoundRect(rectF, L, L, paint2);
        float f18 = L4 + L2;
        if (this.f44724r != null && this.f44725s == f18 && this.f44726w == color) {
            f11 = f16;
            f12 = f18;
        } else {
            float max = Math.max(0.0f, Math.min(0.4f, textPaint.measureText("0") / measureText2));
            f11 = f16;
            float min = Math.min(0.49f, ((0.5f - max) * 0.75f) + max);
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.0f, color);
            f12 = f18;
            this.f44724r = new LinearGradient(f18, 0.0f, f18 + measureText2, 0.0f, new int[]{color, color, r12, r12, color, color}, new float[]{0.0f, max, min, 1.0f - min, 1.0f - max, 1.0f}, Shader.TileMode.CLAMP);
            this.f44725s = f12;
            this.f44726w = color;
        }
        textPaint.setShader(this.f44724r);
        canvas.drawText(str2, f12, f13, textPaint);
        canvas.drawText(str3, (f12 + measureText2) - textPaint.measureText(str3), f13, textPaint);
        textPaint.setShader(null);
        float L5 = org.telegram.messenger.g0.L(3.0f) + rectF.right;
        String str4 = this.d;
        rectF.set(L5, f15, textPaint.measureText(str4) + L5 + f11, f17);
        canvas.drawRoundRect(rectF, L, L, paint2);
        canvas.drawText(str4, L5 + L2, f13, textPaint);
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        TextPaint textPaint = this.f44722f;
        textPaint.setTextSize(paint.getTextSize() * 0.95f);
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            float f10 = (fontMetricsInt2.ascent + fontMetricsInt2.descent) / 2.0f;
            int floor = (int) Math.floor(f10 - (org.telegram.messenger.g0.L(21.0f) / 2.0f));
            fontMetricsInt.top = floor;
            fontMetricsInt.ascent = floor;
            int ceil = (int) Math.ceil((org.telegram.messenger.g0.L(21.0f) / 2.0f) + f10);
            fontMetricsInt.bottom = ceil;
            fontMetricsInt.descent = ceil;
            fontMetricsInt.leading = 0;
        }
        float L = org.telegram.messenger.g0.L(5.0f) * 2.0f;
        float measureText = textPaint.measureText(this.f44720c) + (textPaint.measureText(" ") * 0.3f) + textPaint.measureText(this.f44719b);
        return (int) Math.ceil((org.telegram.messenger.g0.L(3.0f) * 2.0f) + textPaint.measureText(this.d) + measureText + textPaint.measureText(this.f44718a) + L + L + L);
    }
}

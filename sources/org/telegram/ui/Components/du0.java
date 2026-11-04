package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class du0 extends CharacterStyle {
    public final Paint f33193a;
    public final Path f33194b;

    public du0() {
        Paint paint = new Paint(1);
        this.f33193a = paint;
        this.f33194b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void a(Canvas canvas, Layout layout) {
        CharSequence text;
        int lineStart;
        int lineEnd;
        Layout layout2 = layout;
        if (layout2 != null && (text = layout2.getText()) != null && (text instanceof Spanned)) {
            Spanned spanned = (Spanned) text;
            du0[] du0VarArr = (du0[]) spanned.getSpans(0, spanned.length(), du0.class);
            if (du0VarArr != null && du0VarArr.length != 0) {
                int i3 = 0;
                while (i3 < du0VarArr.length) {
                    du0 du0Var = du0VarArr[i3];
                    int spanStart = spanned.getSpanStart(du0Var);
                    int spanEnd = spanned.getSpanEnd(du0Var);
                    int lineForOffset = layout2.getLineForOffset(spanStart);
                    int lineForOffset2 = layout2.getLineForOffset(spanEnd);
                    int i10 = lineForOffset;
                    while (i10 <= lineForOffset2) {
                        float lineBottom = layout2.getLineBottom(i10) - org.telegram.messenger.g0.L(1.0f);
                        if (i10 == lineForOffset) {
                            lineStart = spanStart;
                        } else {
                            lineStart = layout2.getLineStart(i10);
                        }
                        float primaryHorizontal = layout2.getPrimaryHorizontal(lineStart);
                        if (i10 == lineForOffset2) {
                            lineEnd = spanEnd;
                        } else {
                            lineEnd = layout2.getLineEnd(i10) - 1;
                        }
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(lineEnd);
                        du0Var.getClass();
                        float L = org.telegram.messenger.g0.L(1.33f);
                        float L2 = org.telegram.messenger.g0.L(10.0f);
                        float L3 = org.telegram.messenger.g0.L(2.0f);
                        Paint paint = du0Var.f33193a;
                        Spanned spanned2 = spanned;
                        du0[] du0VarArr2 = du0VarArr;
                        int i11 = i3;
                        paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false));
                        paint.setStrokeWidth(L);
                        Path path = du0Var.f33194b;
                        path.rewind();
                        path.moveTo(primaryHorizontal, lineBottom);
                        float f10 = primaryHorizontal;
                        while (f10 < primaryHorizontal2) {
                            float f11 = f10;
                            float f12 = L2;
                            path.quadTo((L2 / 4.0f) + f10, lineBottom - L3, (L2 / 2.0f) + f11, lineBottom);
                            float f13 = f11 + f12;
                            path.quadTo(((f12 * 3.0f) / 4.0f) + f11, lineBottom + L3, f13, lineBottom);
                            f10 = f13;
                            L2 = f12;
                        }
                        if (f10 > primaryHorizontal2) {
                            canvas.save();
                            float f14 = L / 2.0f;
                            canvas.clipRect(primaryHorizontal - f14, (lineBottom - L3) - f14, primaryHorizontal2 + f14, lineBottom + L3 + f14);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i10++;
                        layout2 = layout;
                        spanned = spanned2;
                        du0VarArr = du0VarArr2;
                        i3 = i11;
                    }
                    i3++;
                    layout2 = layout;
                }
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }
}

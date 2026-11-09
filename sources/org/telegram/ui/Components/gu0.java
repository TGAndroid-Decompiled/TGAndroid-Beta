package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class gu0 extends CharacterStyle {
    public final Paint f34050a;
    public final Path f34051b;

    public gu0() {
        Paint paint = new Paint(1);
        this.f34050a = paint;
        this.f34051b = new Path();
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
            gu0[] gu0VarArr = (gu0[]) spanned.getSpans(0, spanned.length(), gu0.class);
            if (gu0VarArr != null && gu0VarArr.length != 0) {
                int i7 = 0;
                while (i7 < gu0VarArr.length) {
                    gu0 gu0Var = gu0VarArr[i7];
                    int spanStart = spanned.getSpanStart(gu0Var);
                    int spanEnd = spanned.getSpanEnd(gu0Var);
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
                        gu0Var.getClass();
                        float L = org.telegram.messenger.g0.L(1.33f);
                        float L2 = org.telegram.messenger.g0.L(10.0f);
                        float L3 = org.telegram.messenger.g0.L(2.0f);
                        Paint paint = gu0Var.f34050a;
                        Spanned spanned2 = spanned;
                        gu0[] gu0VarArr2 = gu0VarArr;
                        int i11 = i7;
                        paint.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ci, false));
                        paint.setStrokeWidth(L);
                        Path path = gu0Var.f34051b;
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
                        gu0VarArr = gu0VarArr2;
                        i7 = i11;
                    }
                    i7++;
                    layout2 = layout;
                }
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }
}

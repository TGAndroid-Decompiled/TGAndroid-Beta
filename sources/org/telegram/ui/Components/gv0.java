package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
public final class gv0 extends CharacterStyle {
    public final Paint f26524a;
    public final Path f26525b;

    public gv0() {
        Paint paint = new Paint(1);
        this.f26524a = paint;
        this.f26525b = new Path();
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
            gv0[] gv0VarArr = (gv0[]) spanned.getSpans(0, spanned.length(), gv0.class);
            if (gv0VarArr != null && gv0VarArr.length != 0) {
                int i10 = 0;
                while (i10 < gv0VarArr.length) {
                    gv0 gv0Var = gv0VarArr[i10];
                    int spanStart = spanned.getSpanStart(gv0Var);
                    int spanEnd = spanned.getSpanEnd(gv0Var);
                    int lineForOffset = layout2.getLineForOffset(spanStart);
                    int lineForOffset2 = layout2.getLineForOffset(spanEnd);
                    int i11 = lineForOffset;
                    while (i11 <= lineForOffset2) {
                        float lineBottom = layout2.getLineBottom(i11) - org.telegram.messenger.i0.L(1.0f);
                        if (i11 == lineForOffset) {
                            lineStart = spanStart;
                        } else {
                            lineStart = layout2.getLineStart(i11);
                        }
                        float primaryHorizontal = layout2.getPrimaryHorizontal(lineStart);
                        if (i11 == lineForOffset2) {
                            lineEnd = spanEnd;
                        } else {
                            lineEnd = layout2.getLineEnd(i11) - 1;
                        }
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(lineEnd);
                        gv0Var.getClass();
                        float L = org.telegram.messenger.i0.L(1.33f);
                        float L2 = org.telegram.messenger.i0.L(10.0f);
                        float L3 = org.telegram.messenger.i0.L(2.0f);
                        Paint paint = gv0Var.f26524a;
                        Spanned spanned2 = spanned;
                        gv0[] gv0VarArr2 = gv0VarArr;
                        int i12 = i10;
                        paint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ci, false));
                        paint.setStrokeWidth(L);
                        Path path = gv0Var.f26525b;
                        path.rewind();
                        path.moveTo(primaryHorizontal, lineBottom);
                        float f7 = primaryHorizontal;
                        while (f7 < primaryHorizontal2) {
                            float f10 = f7;
                            float f11 = L2;
                            path.quadTo((L2 / 4.0f) + f7, lineBottom - L3, (L2 / 2.0f) + f10, lineBottom);
                            float f12 = f10 + f11;
                            path.quadTo(((f11 * 3.0f) / 4.0f) + f10, lineBottom + L3, f12, lineBottom);
                            f7 = f12;
                            L2 = f11;
                        }
                        if (f7 > primaryHorizontal2) {
                            canvas.save();
                            float f13 = L / 2.0f;
                            canvas.clipRect(primaryHorizontal - f13, (lineBottom - L3) - f13, primaryHorizontal2 + f13, lineBottom + L3 + f13);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i11++;
                        layout2 = layout;
                        spanned = spanned2;
                        gv0VarArr = gv0VarArr2;
                        i10 = i12;
                    }
                    i10++;
                    layout2 = layout;
                }
            }
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }
}

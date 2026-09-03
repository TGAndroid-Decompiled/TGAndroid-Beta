package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class cw0 extends CharacterStyle {
    public final Paint f24052a;
    public final Path f24053b;

    public cw0() {
        Paint paint = new Paint(1);
        this.f24052a = paint;
        this.f24053b = new Path();
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
            cw0[] cw0VarArr = (cw0[]) spanned.getSpans(0, spanned.length(), cw0.class);
            if (cw0VarArr != null && cw0VarArr.length != 0) {
                int i10 = 0;
                while (i10 < cw0VarArr.length) {
                    cw0 cw0Var = cw0VarArr[i10];
                    int spanStart = spanned.getSpanStart(cw0Var);
                    int spanEnd = spanned.getSpanEnd(cw0Var);
                    int lineForOffset = layout2.getLineForOffset(spanStart);
                    int lineForOffset2 = layout2.getLineForOffset(spanEnd);
                    int i11 = lineForOffset;
                    while (i11 <= lineForOffset2) {
                        float lineBottom = layout2.getLineBottom(i11) - AndroidUtilities.dp(1.0f);
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
                        cw0Var.getClass();
                        float dp = AndroidUtilities.dp(1.33f);
                        float dp2 = AndroidUtilities.dp(10.0f);
                        float dp3 = AndroidUtilities.dp(2.0f);
                        Paint paint = cw0Var.f24052a;
                        Spanned spanned2 = spanned;
                        cw0[] cw0VarArr2 = cw0VarArr;
                        int i12 = i10;
                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
                        paint.setStrokeWidth(dp);
                        Path path = cw0Var.f24053b;
                        path.rewind();
                        path.moveTo(primaryHorizontal, lineBottom);
                        float f10 = primaryHorizontal;
                        while (f10 < primaryHorizontal2) {
                            float f11 = f10;
                            float f12 = dp2;
                            path.quadTo((dp2 / 4.0f) + f10, lineBottom - dp3, (dp2 / 2.0f) + f11, lineBottom);
                            float f13 = f11 + f12;
                            path.quadTo(((f12 * 3.0f) / 4.0f) + f11, lineBottom + dp3, f13, lineBottom);
                            f10 = f13;
                            dp2 = f12;
                        }
                        if (f10 > primaryHorizontal2) {
                            canvas.save();
                            float f14 = dp / 2.0f;
                            canvas.clipRect(primaryHorizontal - f14, (lineBottom - dp3) - f14, primaryHorizontal2 + f14, lineBottom + dp3 + f14);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i11++;
                        layout2 = layout;
                        spanned = spanned2;
                        cw0VarArr = cw0VarArr2;
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

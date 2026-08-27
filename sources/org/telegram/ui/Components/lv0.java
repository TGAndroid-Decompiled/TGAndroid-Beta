package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;

public final class lv0 extends CharacterStyle {

    public final Paint f30474a;

    public final Path f30475b;

    public lv0() {
        Paint paint = new Paint(1);
        this.f30474a = paint;
        this.f30475b = new Path();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
    }

    public static void a(Canvas canvas, Layout layout) {
        CharSequence text;
        Layout layout2 = layout;
        if (layout2 == null || (text = layout2.getText()) == null || !(text instanceof Spanned)) {
            return;
        }
        Spanned spanned = (Spanned) text;
        lv0[] lv0VarArr = (lv0[]) spanned.getSpans(0, spanned.length(), lv0.class);
        if (lv0VarArr == null || lv0VarArr.length == 0) {
            return;
        }
        int i10 = 0;
        while (i10 < lv0VarArr.length) {
            lv0 lv0Var = lv0VarArr[i10];
            int spanStart = spanned.getSpanStart(lv0Var);
            int spanEnd = spanned.getSpanEnd(lv0Var);
            int lineForOffset = layout2.getLineForOffset(spanStart);
            int lineForOffset2 = layout2.getLineForOffset(spanEnd);
            int i11 = lineForOffset;
            while (i11 <= lineForOffset2) {
                float lineBottom = layout2.getLineBottom(i11) - AndroidUtilities.dp(1.0f);
                float primaryHorizontal = layout2.getPrimaryHorizontal(i11 == lineForOffset ? spanStart : layout2.getLineStart(i11));
                float primaryHorizontal2 = layout2.getPrimaryHorizontal(i11 == lineForOffset2 ? spanEnd : layout2.getLineEnd(i11) - 1);
                lv0Var.getClass();
                float fDp = AndroidUtilities.dp(1.33f);
                float fDp2 = AndroidUtilities.dp(10.0f);
                float fDp3 = AndroidUtilities.dp(2.0f);
                Paint paint = lv0Var.f30474a;
                Spanned spanned2 = spanned;
                lv0[] lv0VarArr2 = lv0VarArr;
                int i12 = i10;
                paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Oh, false));
                paint.setStrokeWidth(fDp);
                Path path = lv0Var.f30475b;
                path.rewind();
                path.moveTo(primaryHorizontal, lineBottom);
                float f10 = primaryHorizontal;
                while (f10 < primaryHorizontal2) {
                    float f11 = f10;
                    float f12 = fDp2;
                    path.quadTo((fDp2 / 4.0f) + f10, lineBottom - fDp3, (fDp2 / 2.0f) + f11, lineBottom);
                    float f13 = f11 + f12;
                    path.quadTo(((f12 * 3.0f) / 4.0f) + f11, lineBottom + fDp3, f13, lineBottom);
                    f10 = f13;
                    fDp2 = f12;
                }
                if (f10 > primaryHorizontal2) {
                    canvas.save();
                    float f14 = fDp / 2.0f;
                    canvas.clipRect(primaryHorizontal - f14, (lineBottom - fDp3) - f14, primaryHorizontal2 + f14, lineBottom + fDp3 + f14);
                    canvas.drawPath(path, paint);
                    canvas.restore();
                } else {
                    canvas.drawPath(path, paint);
                }
                i11++;
                layout2 = layout;
                spanned = spanned2;
                lv0VarArr = lv0VarArr2;
                i10 = i12;
            }
            i10++;
            layout2 = layout;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
    }
}

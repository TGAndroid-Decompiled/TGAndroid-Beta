package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import org.telegram.messenger.AndroidUtilities;
public final class mw0 extends CharacterStyle {
    public final Paint f25305a;
    public final Path f25306b;

    public mw0() {
        Paint paint = new Paint(1);
        this.f25305a = paint;
        this.f25306b = new Path();
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
            mw0[] mw0VarArr = (mw0[]) spanned.getSpans(0, spanned.length(), mw0.class);
            if (mw0VarArr != null && mw0VarArr.length != 0) {
                int i10 = 0;
                while (i10 < mw0VarArr.length) {
                    mw0 mw0Var = mw0VarArr[i10];
                    int spanStart = spanned.getSpanStart(mw0Var);
                    int spanEnd = spanned.getSpanEnd(mw0Var);
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
                        mw0Var.getClass();
                        float dp = AndroidUtilities.dp(1.33f);
                        float dp2 = AndroidUtilities.dp(10.0f);
                        float dp3 = AndroidUtilities.dp(2.0f);
                        Paint paint = mw0Var.f25305a;
                        Spanned spanned2 = spanned;
                        mw0[] mw0VarArr2 = mw0VarArr;
                        int i12 = i10;
                        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Oh, false));
                        paint.setStrokeWidth(dp);
                        Path path = mw0Var.f25306b;
                        path.rewind();
                        path.moveTo(primaryHorizontal, lineBottom);
                        float f7 = primaryHorizontal;
                        while (f7 < primaryHorizontal2) {
                            float f10 = f7;
                            float f11 = dp2;
                            path.quadTo((dp2 / 4.0f) + f7, lineBottom - dp3, (dp2 / 2.0f) + f10, lineBottom);
                            float f12 = f10 + f11;
                            path.quadTo(((f11 * 3.0f) / 4.0f) + f10, lineBottom + dp3, f12, lineBottom);
                            f7 = f12;
                            dp2 = f11;
                        }
                        if (f7 > primaryHorizontal2) {
                            canvas.save();
                            float f13 = dp / 2.0f;
                            canvas.clipRect(primaryHorizontal - f13, (lineBottom - dp3) - f13, primaryHorizontal2 + f13, lineBottom + dp3 + f13);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                        } else {
                            canvas.drawPath(path, paint);
                        }
                        i11++;
                        layout2 = layout;
                        spanned = spanned2;
                        mw0VarArr = mw0VarArr2;
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

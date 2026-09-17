package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a10 extends View {
    public TextPaint f22280a;
    public Paint f22281b;
    public Path f22282c;
    public float[] d;
    public h01 e;
    public h01 f22283f;
    public h01 h;
    public LinearGradient f22284n;
    public LinearGradient f22285r;
    public Paint f22286s;
    public Paint v;
    public Matrix f22287w;
    public Matrix f22288x;
    public m6 f22289y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return LocaleController.getString(R.string.FilterAllChats);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        float f12;
        h01 h01Var;
        float f13;
        float f14;
        Paint paint = this.f22281b;
        Matrix matrix = this.f22288x;
        Matrix matrix2 = this.f22287w;
        Path path = this.f22282c;
        h01 h01Var2 = this.e;
        m6 m6Var = this.f22289y;
        h01 h01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        h01 h01Var4 = this.f22283f;
        if (h01Var4 != null) {
            canvas.save();
            float f15 = h01Var4.f24439c;
            f7 = 15.32f;
            CharSequence charSequence = m6Var.f26070g;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = m6Var.d() + AndroidUtilities.dp(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (h01Var4.j() / 2.0f));
            h01Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = m6Var.f26070g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            h01Var = h01Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            f12 = measuredHeight;
            h01Var = h01Var4;
            rect.set((int) (h01Var4.f24439c + f10 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (m6Var.d() + h01Var4.f24439c + f10 + AndroidUtilities.dp(f7)), (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            m6Var.setBounds(rect);
            m6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp) - h01Var2.f24439c;
        canvas.save();
        canvas.translate(f17, (f12 - (h01Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        h01Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (h01Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp, (f12 - (h01Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            h01Var3.d(canvas);
            canvas.restore();
            f18 += dp + h01Var3.f24439c;
        }
        float f19 = f18;
        float dp2 = AndroidUtilities.dp(12.0f) + (h01Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f22280a);
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f20 = f11 / f13;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - AndroidUtilities.dp(4.0f), dp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, dp2);
        path.addRoundRect(rectF2, this.d, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(AndroidUtilities.dp(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f10, max + AndroidUtilities.dp(8.0f)), 0.0f);
        this.f22284n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f22285r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f22286s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22289y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

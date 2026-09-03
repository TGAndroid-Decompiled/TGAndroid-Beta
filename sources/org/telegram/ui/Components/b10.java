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
public final class b10 extends View {
    public TextPaint f23504a;
    public Paint f23505b;
    public Path f23506c;
    public float[] d;
    public k01 e;
    public k01 f23507f;
    public k01 h;
    public LinearGradient f23508n;
    public LinearGradient f23509r;
    public Paint f23510s;
    public Paint v;
    public Matrix f23511w;
    public Matrix f23512x;
    public j6 f23513y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return LocaleController.getString(R.string.FilterAllChats);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        k01 k01Var;
        float f14;
        float f15;
        Paint paint = this.f23505b;
        Matrix matrix = this.f23512x;
        Matrix matrix2 = this.f23511w;
        Path path = this.f23506c;
        k01 k01Var2 = this.e;
        j6 j6Var = this.f23513y;
        k01 k01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        k01 k01Var4 = this.f23507f;
        if (k01Var4 != null) {
            canvas.save();
            float f16 = k01Var4.f26124c;
            f10 = 15.32f;
            CharSequence charSequence = j6Var.f25850g;
            if (charSequence != null && charSequence.length() != 0) {
                f15 = j6Var.d() + AndroidUtilities.dp(15.32f);
            } else {
                f15 = 0.0f;
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (k01Var4.j() / 2.0f));
            k01Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = j6Var.f25850g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            k01Var = k01Var4;
            f14 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f14 = 2.0f;
            f13 = measuredHeight;
            k01Var = k01Var4;
            rect.set((int) (k01Var4.f26124c + f11 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (j6Var.d() + k01Var4.f26124c + f11 + AndroidUtilities.dp(f10)), (int) (f13 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            j6Var.setBounds(rect);
            j6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f18 = (f11 - dp) - k01Var2.f26124c;
        canvas.save();
        canvas.translate(f18, (f13 - (k01Var2.j() / f14)) + AndroidUtilities.dp(1.0f));
        k01Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (k01Var3 != null) {
            canvas.save();
            canvas.translate(f19 + dp, (f13 - (k01Var3.j() / f14)) + AndroidUtilities.dp(1.0f));
            k01Var3.d(canvas);
            canvas.restore();
            f19 += dp + k01Var3.f26124c;
        }
        float f20 = f19;
        float dp2 = AndroidUtilities.dp(12.0f) + (k01Var.j() / f14) + f13;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f23504a);
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f21 = f12 / f14;
        float f22 = measuredWidth + f21;
        rectF2.set((measuredWidth - f21) - AndroidUtilities.dp(4.0f), dp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f22, dp2);
        path.addRoundRect(rectF2, this.d, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(AndroidUtilities.dp(8.0f), f18);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, max + AndroidUtilities.dp(8.0f)), 0.0f);
        this.f23508n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f23509r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f23510s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23513y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

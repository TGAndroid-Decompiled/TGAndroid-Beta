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
public final class i10 extends View {
    public TextPaint f23851a;
    public Paint f23852b;
    public Path f23853c;
    public float[] d;
    public t01 e;
    public t01 f23854f;
    public t01 h;
    public LinearGradient f23855n;
    public LinearGradient f23856r;
    public Paint f23857s;
    public Paint v;
    public Matrix f23858w;
    public Matrix f23859x;
    public n6 f23860y;

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
        t01 t01Var;
        float f13;
        float f14;
        Paint paint = this.f23852b;
        Matrix matrix = this.f23859x;
        Matrix matrix2 = this.f23858w;
        Path path = this.f23853c;
        t01 t01Var2 = this.e;
        n6 n6Var = this.f23860y;
        t01 t01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        t01 t01Var4 = this.f23854f;
        if (t01Var4 != null) {
            canvas.save();
            float f15 = t01Var4.f27247c;
            f7 = 15.32f;
            CharSequence charSequence = n6Var.f25428g;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = n6Var.d() + AndroidUtilities.dp(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (t01Var4.j() / 2.0f));
            t01Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = n6Var.f25428g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            t01Var = t01Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            f12 = measuredHeight;
            t01Var = t01Var4;
            rect.set((int) (t01Var4.f27247c + f10 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (n6Var.d() + t01Var4.f27247c + f10 + AndroidUtilities.dp(f7)), (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp) - t01Var2.f27247c;
        canvas.save();
        canvas.translate(f17, (f12 - (t01Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        t01Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (t01Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp, (f12 - (t01Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            t01Var3.d(canvas);
            canvas.restore();
            f18 += dp + t01Var3.f27247c;
        }
        float f19 = f18;
        float dp2 = AndroidUtilities.dp(12.0f) + (t01Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f23851a);
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
        this.f23855n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f23856r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f23857s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f23860y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

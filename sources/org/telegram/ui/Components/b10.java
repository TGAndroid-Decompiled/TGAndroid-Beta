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
    public TextPaint f25443a;
    public Paint f25444b;
    public Path f25445c;
    public float[] d;
    public l01 f25446e;
    public l01 f25447f;
    public l01 h;
    public LinearGradient f25448n;
    public LinearGradient f25449r;
    public Paint f25450s;
    public Paint v;
    public Matrix f25451w;
    public Matrix f25452x;
    public j6 f25453y;

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
        l01 l01Var;
        float f14;
        float f15;
        Paint paint = this.f25444b;
        Matrix matrix = this.f25452x;
        Matrix matrix2 = this.f25451w;
        Path path = this.f25445c;
        l01 l01Var2 = this.f25446e;
        j6 j6Var = this.f25453y;
        l01 l01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        l01 l01Var4 = this.f25447f;
        if (l01Var4 != null) {
            canvas.save();
            float f16 = l01Var4.f28521c;
            f10 = 15.32f;
            CharSequence charSequence = j6Var.f28033g;
            if (charSequence != null && charSequence.length() != 0) {
                f15 = j6Var.d() + AndroidUtilities.dp(15.32f);
            } else {
                f15 = 0.0f;
            }
            float f17 = f16 + f15;
            f11 = measuredWidth - (f17 / 2.0f);
            canvas.translate(f11, measuredHeight - (l01Var4.j() / 2.0f));
            l01Var4.d(canvas);
            canvas.restore();
            f12 = f17;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = j6Var.f28033g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            l01Var = l01Var4;
            f14 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f14 = 2.0f;
            f13 = measuredHeight;
            l01Var = l01Var4;
            rect.set((int) (l01Var4.f28521c + f11 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (j6Var.d() + l01Var4.f28521c + f11 + AndroidUtilities.dp(f10)), (int) (f13 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            j6Var.setBounds(rect);
            j6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f18 = (f11 - dp) - l01Var2.f28521c;
        canvas.save();
        canvas.translate(f18, (f13 - (l01Var2.j() / f14)) + AndroidUtilities.dp(1.0f));
        l01Var2.d(canvas);
        canvas.restore();
        float f19 = f11 + f12;
        if (l01Var3 != null) {
            canvas.save();
            canvas.translate(f19 + dp, (f13 - (l01Var3.j() / f14)) + AndroidUtilities.dp(1.0f));
            l01Var3.d(canvas);
            canvas.restore();
            f19 += dp + l01Var3.f28521c;
        }
        float f20 = f19;
        float dp2 = AndroidUtilities.dp(12.0f) + (l01Var.j() / f14) + f13;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f25443a);
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
        this.f25448n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f20);
        matrix.reset();
        matrix.postTranslate(Math.max(f22, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f25449r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f25450s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25453y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

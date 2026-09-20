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
    public TextPaint f22492a;
    public Paint f22493b;
    public Path f22494c;
    public float[] d;
    public u01 e;
    public u01 f22495f;
    public u01 h;
    public LinearGradient f22496n;
    public LinearGradient f22497r;
    public Paint f22498s;
    public Paint v;
    public Matrix f22499w;
    public Matrix f22500x;
    public n6 f22501y;

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
        u01 u01Var;
        float f13;
        float f14;
        Paint paint = this.f22493b;
        Matrix matrix = this.f22500x;
        Matrix matrix2 = this.f22499w;
        Path path = this.f22494c;
        u01 u01Var2 = this.e;
        n6 n6Var = this.f22501y;
        u01 u01Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        u01 u01Var4 = this.f22495f;
        if (u01Var4 != null) {
            canvas.save();
            float f15 = u01Var4.f28493c;
            f7 = 15.32f;
            CharSequence charSequence = n6Var.f26578g;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = n6Var.d() + AndroidUtilities.dp(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (u01Var4.j() / 2.0f));
            u01Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = n6Var.f26578g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            u01Var = u01Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            f12 = measuredHeight;
            u01Var = u01Var4;
            rect.set((int) (u01Var4.f28493c + f10 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (n6Var.d() + u01Var4.f28493c + f10 + AndroidUtilities.dp(f7)), (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp) - u01Var2.f28493c;
        canvas.save();
        canvas.translate(f17, (f12 - (u01Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        u01Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (u01Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp, (f12 - (u01Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            u01Var3.d(canvas);
            canvas.restore();
            f18 += dp + u01Var3.f28493c;
        }
        float f19 = f18;
        float dp2 = AndroidUtilities.dp(12.0f) + (u01Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f22492a);
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
        this.f22496n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f22497r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f22498s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f22501y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

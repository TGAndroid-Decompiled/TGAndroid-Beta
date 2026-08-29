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
public final class w00 extends View {
    public TextPaint f34252a;
    public Paint f34253b;
    public Path f34254c;
    public float[] d;
    public zz0 f34255e;
    public zz0 f34256f;
    public zz0 h;
    public LinearGradient f34257n;
    public LinearGradient f34258r;
    public Paint f34259s;
    public Paint v;
    public Matrix f34260w;
    public Matrix f34261x;
    public n6 f34262y;

    public static CharSequence a(CharSequence charSequence) {
        if ("ALL_CHATS".equals(charSequence.toString())) {
            return LocaleController.getString(R.string.FilterAllChats);
        }
        return charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
        float f10;
        float f11;
        float f12;
        zz0 zz0Var;
        float f13;
        float f14;
        Paint paint = this.f34253b;
        Matrix matrix = this.f34261x;
        Matrix matrix2 = this.f34260w;
        Path path = this.f34254c;
        zz0 zz0Var2 = this.f34255e;
        n6 n6Var = this.f34262y;
        zz0 zz0Var3 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        zz0 zz0Var4 = this.f34256f;
        if (zz0Var4 != null) {
            canvas.save();
            float f15 = zz0Var4.f35462c;
            f9 = 15.32f;
            CharSequence charSequence = n6Var.f30866g;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = n6Var.d() + AndroidUtilities.dp(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (zz0Var4.j() / 2.0f));
            zz0Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f9 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = n6Var.f30866g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            zz0Var = zz0Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            f12 = measuredHeight;
            zz0Var = zz0Var4;
            rect.set((int) (zz0Var4.f35462c + f10 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (n6Var.d() + zz0Var4.f35462c + f10 + AndroidUtilities.dp(f9)), (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            n6Var.setBounds(rect);
            n6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp) - zz0Var2.f35462c;
        canvas.save();
        canvas.translate(f17, (f12 - (zz0Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        zz0Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (zz0Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp, (f12 - (zz0Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            zz0Var3.d(canvas);
            canvas.restore();
            f18 += dp + zz0Var3.f35462c;
        }
        float f19 = f18;
        float dp2 = AndroidUtilities.dp(12.0f) + (zz0Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f34252a);
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
        this.f34257n.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f34258r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f34259s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f34262y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

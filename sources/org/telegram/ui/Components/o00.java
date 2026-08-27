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

public final class o00 extends View {

    public TextPaint f31125a;

    public Paint f31126b;

    public Path f31127c;
    public float[] d;

    public pz0 f31128e;

    public pz0 f31129f;
    public pz0 h;

    public LinearGradient f31130n;

    public LinearGradient f31131r;

    public Paint f31132s;
    public Paint v;

    public Matrix f31133w;

    public Matrix f31134x;

    public i6 f31135y;

    public static CharSequence a(CharSequence charSequence) {
        return "ALL_CHATS".equals(charSequence.toString()) ? LocaleController.getString(R.string.FilterAllChats) : charSequence;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float fD;
        Paint paint = this.f31126b;
        Matrix matrix = this.f31134x;
        Matrix matrix2 = this.f31133w;
        Path path = this.f31127c;
        pz0 pz0Var = this.f31128e;
        i6 i6Var = this.f31135y;
        pz0 pz0Var2 = this.h;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        pz0 pz0Var3 = this.f31129f;
        if (pz0Var3 != null) {
            canvas.save();
            float f15 = pz0Var3.f31697c;
            f10 = 15.32f;
            CharSequence charSequence = i6Var.f29243g;
            if (charSequence == null || charSequence.length() == 0) {
                fD = 0.0f;
            } else {
                fD = i6Var.d() + AndroidUtilities.dp(15.32f);
            }
            float f16 = f15 + fD;
            f11 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f11, measuredHeight - (pz0Var3.j() / 2.0f));
            pz0Var3.d(canvas);
            canvas.restore();
            f12 = f16;
        } else {
            f10 = 15.32f;
            f11 = measuredWidth;
            f12 = 0.0f;
        }
        CharSequence charSequence2 = i6Var.f29243g;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f13 = measuredHeight;
            f14 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f14 = 2.0f;
            f13 = measuredHeight;
            rect.set((int) (pz0Var3.f31697c + f11 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (i6Var.d() + pz0Var3.f31697c + f11 + AndroidUtilities.dp(f10)), (int) (f13 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            i6Var.setBounds(rect);
            i6Var.draw(canvas);
        }
        float fDp = AndroidUtilities.dp(30.0f);
        float f17 = (f11 - fDp) - pz0Var.f31697c;
        canvas.save();
        canvas.translate(f17, (f13 - (pz0Var.j() / f14)) + AndroidUtilities.dp(1.0f));
        pz0Var.d(canvas);
        canvas.restore();
        float f18 = f11 + f12;
        if (pz0Var2 != null) {
            canvas.save();
            canvas.translate(f18 + fDp, (f13 - (pz0Var2.j() / f14)) + AndroidUtilities.dp(1.0f));
            pz0Var2.d(canvas);
            canvas.restore();
            f18 += fDp + pz0Var2.f31697c;
        }
        float f19 = f18;
        float fDp2 = AndroidUtilities.dp(12.0f) + (pz0Var3.j() / f14) + f13;
        canvas.drawRect(0.0f, fDp2, getMeasuredWidth(), 1.0f + fDp2, this.f31125a);
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f20 = f12 / f14;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - AndroidUtilities.dp(4.0f), fDp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, fDp2);
        path.addRoundRect(rectF2, this.d, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float fMax = Math.max(AndroidUtilities.dp(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f11, fMax + AndroidUtilities.dp(8.0f)), 0.0f);
        this.f31130n.setLocalMatrix(matrix2);
        float fMin = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, fMin - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f31131r.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f31132s);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.v);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f31135y || super.verifyDrawable(drawable);
    }
}

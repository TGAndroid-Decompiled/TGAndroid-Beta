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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class l10 extends View implements org.telegram.ui.ActionBar.p6 {
    public r6 E;
    public TextPaint f30082a;
    public TextPaint f30083b;
    public Paint f30084c;
    public Path d;
    public float[] e;
    public r11 f30085f;
    public r11 h;
    public r11 f30086n;
    public LinearGradient f30087r;
    public LinearGradient f30088s;
    public Paint v;
    public Paint f30089w;
    public Matrix f30090x;
    public Matrix f30091y;

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
        r11 r11Var;
        float f13;
        float f14;
        Paint paint = this.f30084c;
        Matrix matrix = this.f30091y;
        Matrix matrix2 = this.f30090x;
        Path path = this.d;
        r11 r11Var2 = this.f30085f;
        r6 r6Var = this.E;
        r11 r11Var3 = this.f30086n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        r11 r11Var4 = this.h;
        if (r11Var4 != null) {
            canvas.save();
            float f15 = r11Var4.f32090c;
            f7 = 15.32f;
            CharSequence charSequence = r6Var.f32147i;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = r6Var.c() + AndroidUtilities.dp(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (r11Var4.j() / 2.0f));
            r11Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = r6Var.f32147i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            r11Var = r11Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            f12 = measuredHeight;
            r11Var = r11Var4;
            rect.set((int) (r11Var4.f32090c + f10 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (r6Var.c() + r11Var4.f32090c + f10 + AndroidUtilities.dp(f7)), (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            r6Var.setBounds(rect);
            r6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp) - r11Var2.f32090c;
        canvas.save();
        canvas.translate(f17, (f12 - (r11Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        r11Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (r11Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp, (f12 - (r11Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            r11Var3.d(canvas);
            canvas.restore();
            f18 += dp + r11Var3.f32090c;
        }
        float f19 = f18;
        float dp2 = AndroidUtilities.dp(12.0f) + (r11Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f30082a);
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        float f20 = f11 / f13;
        float f21 = measuredWidth + f20;
        rectF2.set((measuredWidth - f20) - AndroidUtilities.dp(4.0f), dp2 - AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + f21, dp2);
        path.addRoundRect(rectF2, this.e, Path.Direction.CW);
        canvas.drawPath(path, paint);
        canvas.save();
        float max = Math.max(AndroidUtilities.dp(8.0f), f17);
        matrix2.reset();
        matrix2.postTranslate(Math.min(f10, max + AndroidUtilities.dp(8.0f)), 0.0f);
        this.f30087r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f30088s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.v);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f30089w);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f30084c;
        TextPaint textPaint = this.f30083b;
        TextPaint textPaint2 = this.f30082a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i10 = org.telegram.ui.ActionBar.y6.Eh;
            textPaint2.setColor(org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i10, false)));
            int i11 = org.telegram.ui.ActionBar.y6.f23561o6;
            textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Th, false));
            try {
                r6 r6Var = this.E;
                if (r6Var != null) {
                    r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
                }
                int o12 = org.telegram.ui.ActionBar.y6.o1(0.8f, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
                r11 r11Var = this.f30085f;
                if (r11Var != null) {
                    r11Var.o(o12);
                }
                r11 r11Var2 = this.h;
                if (r11Var2 != null) {
                    r11Var2.o(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                }
                r11 r11Var3 = this.f30086n;
                if (r11Var3 != null) {
                    r11Var3.o(o12);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

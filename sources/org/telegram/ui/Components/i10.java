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
public final class i10 extends View implements org.telegram.ui.ActionBar.b6 {
    public p6 E;
    public TextPaint f27152a;
    public TextPaint f27153b;
    public Paint f27154c;
    public Path d;
    public float[] e;
    public i11 f27155f;
    public i11 h;
    public i11 f27156n;
    public LinearGradient f27157r;
    public LinearGradient f27158s;
    public Paint v;
    public Paint f27159w;
    public Matrix f27160x;
    public Matrix f27161y;

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
        i11 i11Var;
        float f13;
        float f14;
        Paint paint = this.f27154c;
        Matrix matrix = this.f27161y;
        Matrix matrix2 = this.f27160x;
        Path path = this.d;
        i11 i11Var2 = this.f27155f;
        p6 p6Var = this.E;
        i11 i11Var3 = this.f27156n;
        super.onDraw(canvas);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        i11 i11Var4 = this.h;
        if (i11Var4 != null) {
            canvas.save();
            float f15 = i11Var4.f27164c;
            f7 = 15.32f;
            CharSequence charSequence = p6Var.f29442i;
            if (charSequence != null && charSequence.length() != 0) {
                f14 = p6Var.c() + AndroidUtilities.dp(15.32f);
            } else {
                f14 = 0.0f;
            }
            float f16 = f15 + f14;
            f10 = measuredWidth - (f16 / 2.0f);
            canvas.translate(f10, measuredHeight - (i11Var4.j() / 2.0f));
            i11Var4.d(canvas);
            canvas.restore();
            f11 = f16;
        } else {
            f7 = 15.32f;
            f10 = measuredWidth;
            f11 = 0.0f;
        }
        CharSequence charSequence2 = p6Var.f29442i;
        if (charSequence2 == null || charSequence2.length() == 0) {
            f12 = measuredHeight;
            i11Var = i11Var4;
            f13 = 2.0f;
        } else {
            Rect rect = AndroidUtilities.rectTmp2;
            f13 = 2.0f;
            f12 = measuredHeight;
            i11Var = i11Var4;
            rect.set((int) (i11Var4.f27164c + f10 + AndroidUtilities.dp(4.66f)), (int) (measuredHeight - AndroidUtilities.dp(9.0f)), (int) (p6Var.c() + i11Var4.f27164c + f10 + AndroidUtilities.dp(f7)), (int) (f12 + AndroidUtilities.dp(9.0f)));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.33f), -AndroidUtilities.dp(0.66f));
            p6Var.setBounds(rect);
            p6Var.draw(canvas);
        }
        float dp = AndroidUtilities.dp(30.0f);
        float f17 = (f10 - dp) - i11Var2.f27164c;
        canvas.save();
        canvas.translate(f17, (f12 - (i11Var2.j() / f13)) + AndroidUtilities.dp(1.0f));
        i11Var2.d(canvas);
        canvas.restore();
        float f18 = f10 + f11;
        if (i11Var3 != null) {
            canvas.save();
            canvas.translate(f18 + dp, (f12 - (i11Var3.j() / f13)) + AndroidUtilities.dp(1.0f));
            i11Var3.d(canvas);
            canvas.restore();
            f18 += dp + i11Var3.f27164c;
        }
        float f19 = f18;
        float dp2 = AndroidUtilities.dp(12.0f) + (i11Var.j() / f13) + f12;
        canvas.drawRect(0.0f, dp2, getMeasuredWidth(), 1.0f + dp2, this.f27152a);
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
        this.f27157r.setLocalMatrix(matrix2);
        float min = Math.min(getMeasuredWidth() - AndroidUtilities.dp(8.0f), f19);
        matrix.reset();
        matrix.postTranslate(Math.max(f21, min - AndroidUtilities.dp(88.0f)), 0.0f);
        this.f27158s.setLocalMatrix(matrix);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.v);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f27159w);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void updateColors() {
        Paint paint = this.f27154c;
        TextPaint textPaint = this.f27153b;
        TextPaint textPaint2 = this.f27152a;
        if (textPaint2 != null && textPaint != null && paint != null) {
            int i10 = org.telegram.ui.ActionBar.k6.Eh;
            textPaint2.setColor(org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i10, false)));
            int i11 = org.telegram.ui.ActionBar.k6.f21386o6;
            textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Th, false));
            try {
                p6 p6Var = this.E;
                if (p6Var != null) {
                    p6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false));
                }
                int o12 = org.telegram.ui.ActionBar.k6.o1(0.8f, org.telegram.ui.ActionBar.k6.x0(null, i10, false));
                i11 i11Var = this.f27155f;
                if (i11Var != null) {
                    i11Var.o(o12);
                }
                i11 i11Var2 = this.h;
                if (i11Var2 != null) {
                    i11Var2.o(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
                }
                i11 i11Var3 = this.f27156n;
                if (i11Var3 != null) {
                    i11Var3.o(o12);
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

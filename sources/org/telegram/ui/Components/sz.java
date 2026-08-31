package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class sz extends View {
    public final Paint f31202a;
    public final Paint f31203b;
    public l01[] f31204c;
    public RectF[] d;
    public float f31205e;
    public org.telegram.ui.w3 f31206f;
    public int h;

    public sz(Context context) {
        super(context);
        this.f31202a = new Paint(1);
        Paint paint = new Paint(1);
        this.f31203b = paint;
        this.h = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f31204c == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.messenger.y3.D(24.0f, this.f31204c.length, AndroidUtilities.dp(2.0f));
        int i10 = 0;
        while (true) {
            l01[] l01VarArr = this.f31204c;
            if (i10 >= l01VarArr.length) {
                break;
            }
            dp = (int) (l01VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f10 = (width - dp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, dp2, dp + f10, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f31202a);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float dp4 = f10 + AndroidUtilities.dp(14.0f);
        int i11 = 0;
        while (true) {
            l01[] l01VarArr2 = this.f31204c;
            if (i11 < l01VarArr2.length) {
                l01VarArr2[i11].c(dp4, height / 2.0f, 1.0f, -1, canvas);
                this.d[i11].set(dp4 - AndroidUtilities.dp(14.0f), dp2, this.f31204c[i11].l() + dp4 + AndroidUtilities.dp(14.0f), dp3);
                dp4 += this.f31204c[i11].l() + AndroidUtilities.dp(24.0f);
                i11++;
            } else {
                AndroidUtilities.dp(2.0f);
                int clamp = Utilities.clamp((int) Math.floor(this.f31205e), this.f31204c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(this.f31205e), this.f31204c.length - 1, 0);
                float dp5 = this.d[clamp].left + AndroidUtilities.dp(2.0f);
                float dp6 = this.d[clamp2].left + AndroidUtilities.dp(2.0f);
                float f11 = this.f31205e;
                float lerp = AndroidUtilities.lerp(dp5, dp6, (float) (f11 - Math.floor(f11)));
                float dp7 = this.d[clamp].right - AndroidUtilities.dp(2.0f);
                float dp8 = this.d[clamp2].right - AndroidUtilities.dp(2.0f);
                float f12 = this.f31205e;
                float lerp2 = AndroidUtilities.lerp(dp7, dp8, (float) (f12 - Math.floor(f12)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(lerp, (height - AndroidUtilities.dp(26.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(26.0f) + height) / 2.0f);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f31203b);
                canvas.restore();
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f31204c == null || this.d == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.d;
            if (i10 < rectFArr.length) {
                if (rectFArr[i10].contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 >= 0 && i10 != this.h) {
            this.h = i10;
            org.telegram.ui.w3 w3Var = this.f31206f;
            if (w3Var != null) {
                w3Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h = -1;
        }
        if (motionEvent.getAction() == 0 && i10 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f31202a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.f31205e) > 0.001f) {
            invalidate();
        }
        this.f31205e = f10;
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f31204c = new l01[charSequenceArr.length];
        this.d = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f31204c[i10] = new l01(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.d[i10] = new RectF();
        }
        invalidate();
    }
}

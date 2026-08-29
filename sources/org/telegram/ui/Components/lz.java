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
public final class lz extends View {
    public final Paint f30472a;
    public final Paint f30473b;
    public zz0[] f30474c;
    public RectF[] d;
    public float f30475e;
    public org.telegram.ui.x3 f30476f;
    public int h;

    public lz(Context context) {
        super(context);
        this.f30472a = new Paint(1);
        Paint paint = new Paint(1);
        this.f30473b = paint;
        this.h = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f30474c == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.messenger.x3.D(24.0f, this.f30474c.length, AndroidUtilities.dp(2.0f));
        int i10 = 0;
        while (true) {
            zz0[] zz0VarArr = this.f30474c;
            if (i10 >= zz0VarArr.length) {
                break;
            }
            dp = (int) (zz0VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f9 = (width - dp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f9, dp2, dp + f9, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f30472a);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float dp4 = f9 + AndroidUtilities.dp(14.0f);
        int i11 = 0;
        while (true) {
            zz0[] zz0VarArr2 = this.f30474c;
            if (i11 < zz0VarArr2.length) {
                zz0VarArr2[i11].c(dp4, height / 2.0f, 1.0f, -1, canvas);
                this.d[i11].set(dp4 - AndroidUtilities.dp(14.0f), dp2, this.f30474c[i11].l() + dp4 + AndroidUtilities.dp(14.0f), dp3);
                dp4 += this.f30474c[i11].l() + AndroidUtilities.dp(24.0f);
                i11++;
            } else {
                AndroidUtilities.dp(2.0f);
                int clamp = Utilities.clamp((int) Math.floor(this.f30475e), this.f30474c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(this.f30475e), this.f30474c.length - 1, 0);
                float dp5 = this.d[clamp].left + AndroidUtilities.dp(2.0f);
                float dp6 = this.d[clamp2].left + AndroidUtilities.dp(2.0f);
                float f10 = this.f30475e;
                float lerp = AndroidUtilities.lerp(dp5, dp6, (float) (f10 - Math.floor(f10)));
                float dp7 = this.d[clamp].right - AndroidUtilities.dp(2.0f);
                float dp8 = this.d[clamp2].right - AndroidUtilities.dp(2.0f);
                float f11 = this.f30475e;
                float lerp2 = AndroidUtilities.lerp(dp7, dp8, (float) (f11 - Math.floor(f11)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(lerp, (height - AndroidUtilities.dp(26.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(26.0f) + height) / 2.0f);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f30473b);
                canvas.restore();
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f30474c == null || this.d == null) {
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
            org.telegram.ui.x3 x3Var = this.f30476f;
            if (x3Var != null) {
                x3Var.run(Integer.valueOf(i10));
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
        this.f30472a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f9) {
        if (Math.abs(f9 - this.f30475e) > 0.001f) {
            invalidate();
        }
        this.f30475e = f9;
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f30474c = new zz0[charSequenceArr.length];
        this.d = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f30474c[i10] = new zz0(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.d[i10] = new RectF();
        }
        invalidate();
    }
}

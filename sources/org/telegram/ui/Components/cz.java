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
public final class cz extends View {
    public final Paint f27595a;
    public final Paint f27596b;
    public nz0[] f27597c;
    public RectF[] d;
    public float f27598e;
    public org.telegram.ui.w3 f27599f;
    public int h;

    public cz(Context context) {
        super(context);
        this.f27595a = new Paint(1);
        Paint paint = new Paint(1);
        this.f27596b = paint;
        this.h = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f27597c == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.messenger.l0.D(24.0f, this.f27597c.length, AndroidUtilities.dp(2.0f));
        int i9 = 0;
        while (true) {
            nz0[] nz0VarArr = this.f27597c;
            if (i9 >= nz0VarArr.length) {
                break;
            }
            dp = (int) (nz0VarArr[i9].l() + dp);
            i9++;
        }
        float dp2 = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f10 = (width - dp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, dp2, dp + f10, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f27595a);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float dp4 = f10 + AndroidUtilities.dp(14.0f);
        int i10 = 0;
        while (true) {
            nz0[] nz0VarArr2 = this.f27597c;
            if (i10 < nz0VarArr2.length) {
                nz0VarArr2[i10].c(dp4, height / 2.0f, 1.0f, -1, canvas);
                this.d[i10].set(dp4 - AndroidUtilities.dp(14.0f), dp2, this.f27597c[i10].l() + dp4 + AndroidUtilities.dp(14.0f), dp3);
                dp4 += this.f27597c[i10].l() + AndroidUtilities.dp(24.0f);
                i10++;
            } else {
                AndroidUtilities.dp(2.0f);
                int clamp = Utilities.clamp((int) Math.floor(this.f27598e), this.f27597c.length - 1, 0);
                int clamp2 = Utilities.clamp((int) Math.ceil(this.f27598e), this.f27597c.length - 1, 0);
                float dp5 = this.d[clamp].left + AndroidUtilities.dp(2.0f);
                float dp6 = this.d[clamp2].left + AndroidUtilities.dp(2.0f);
                float f11 = this.f27598e;
                float lerp = AndroidUtilities.lerp(dp5, dp6, (float) (f11 - Math.floor(f11)));
                float dp7 = this.d[clamp].right - AndroidUtilities.dp(2.0f);
                float dp8 = this.d[clamp2].right - AndroidUtilities.dp(2.0f);
                float f12 = this.f27598e;
                float lerp2 = AndroidUtilities.lerp(dp7, dp8, (float) (f12 - Math.floor(f12)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(lerp, (height - AndroidUtilities.dp(26.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(26.0f) + height) / 2.0f);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f27596b);
                canvas.restore();
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i9 = 0;
        if (this.f27597c == null || this.d == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.d;
            if (i9 < rectFArr.length) {
                if (rectFArr[i9].contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 >= 0 && i9 != this.h) {
            this.h = i9;
            org.telegram.ui.w3 w3Var = this.f27599f;
            if (w3Var != null) {
                w3Var.run(Integer.valueOf(i9));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h = -1;
        }
        if (motionEvent.getAction() == 0 && i9 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i9) {
        this.f27595a.setColor(i9);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.f27598e) > 0.001f) {
            invalidate();
        }
        this.f27598e = f10;
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f27597c = new nz0[charSequenceArr.length];
        this.d = new RectF[charSequenceArr.length];
        for (int i9 = 0; i9 < charSequenceArr.length; i9++) {
            this.f27597c[i9] = new nz0(charSequenceArr[i9], 14.0f, AndroidUtilities.bold());
            this.d[i9] = new RectF();
        }
        invalidate();
    }
}

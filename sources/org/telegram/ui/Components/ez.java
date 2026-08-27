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

public final class ez extends View {

    public final Paint f28199a;

    public final Paint f28200b;

    public pz0[] f28201c;
    public RectF[] d;

    public float f28202e;

    public org.telegram.ui.x3 f28203f;
    public int h;

    public ez(Context context) {
        super(context);
        this.f28199a = new Paint(1);
        Paint paint = new Paint(1);
        this.f28200b = paint;
        this.h = -1;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OUT));
        paint.setColor(-1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f28201c == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int iDp = AndroidUtilities.dp(2.0f) + org.telegram.messenger.y1.D(24.0f, this.f28201c.length, AndroidUtilities.dp(2.0f));
        int i10 = 0;
        while (true) {
            pz0[] pz0VarArr = this.f28201c;
            if (i10 >= pz0VarArr.length) {
                break;
            }
            iDp = (int) (pz0VarArr[i10].l() + iDp);
            i10++;
        }
        float fDp = (height - AndroidUtilities.dp(30.0f)) / 2.0f;
        float fDp2 = (AndroidUtilities.dp(30.0f) + height) / 2.0f;
        float f10 = (width - iDp) / 2.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f10, fDp, iDp + f10, fDp2);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f28199a);
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
        float fDp3 = f10 + AndroidUtilities.dp(14.0f);
        int i11 = 0;
        while (true) {
            pz0[] pz0VarArr2 = this.f28201c;
            if (i11 >= pz0VarArr2.length) {
                AndroidUtilities.dp(2.0f);
                float fDp4 = (height - AndroidUtilities.dp(26.0f)) / 2.0f;
                float fDp5 = (AndroidUtilities.dp(26.0f) + height) / 2.0f;
                int iClamp = Utilities.clamp((int) Math.floor(this.f28202e), this.f28201c.length - 1, 0);
                int iClamp2 = Utilities.clamp((int) Math.ceil(this.f28202e), this.f28201c.length - 1, 0);
                float fDp6 = this.d[iClamp].left + AndroidUtilities.dp(2.0f);
                float fDp7 = this.d[iClamp2].left + AndroidUtilities.dp(2.0f);
                float f11 = this.f28202e;
                float fLerp = AndroidUtilities.lerp(fDp6, fDp7, (float) (((double) f11) - Math.floor(f11)));
                float fDp8 = this.d[iClamp].right - AndroidUtilities.dp(2.0f);
                float fDp9 = this.d[iClamp2].right - AndroidUtilities.dp(2.0f);
                float f12 = this.f28202e;
                float fLerp2 = AndroidUtilities.lerp(fDp8, fDp9, (float) (((double) f12) - Math.floor(f12)));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(fLerp, fDp4, fLerp2, fDp5);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f28200b);
                canvas.restore();
                return;
            }
            pz0VarArr2[i11].c(fDp3, height / 2.0f, 1.0f, -1, canvas);
            this.d[i11].set(fDp3 - AndroidUtilities.dp(14.0f), fDp, this.f28201c[i11].l() + fDp3 + AndroidUtilities.dp(14.0f), fDp2);
            fDp3 += this.f28201c[i11].l() + AndroidUtilities.dp(24.0f);
            i11++;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f28201c == null || this.d == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.d;
            if (i10 >= rectFArr.length) {
                i10 = -1;
                break;
            }
            if (rectFArr[i10].contains(motionEvent.getX(), motionEvent.getY())) {
                break;
            }
            i10++;
        }
        if (i10 >= 0 && i10 != this.h) {
            this.h = i10;
            org.telegram.ui.x3 x3Var = this.f28203f;
            if (x3Var != null) {
                x3Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.h = -1;
        }
        if (motionEvent.getAction() != 0 || i10 < 0) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f28199a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f10) {
        if (Math.abs(f10 - this.f28202e) > 0.001f) {
            invalidate();
        }
        this.f28202e = f10;
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f28201c = new pz0[charSequenceArr.length];
        this.d = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f28201c[i10] = new pz0(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.d[i10] = new RectF();
        }
        invalidate();
    }
}

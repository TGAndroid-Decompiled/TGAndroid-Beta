package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
public final class tz extends View {
    public final Paint f31210a;
    public final Paint f31211b;
    public final Path f31212c;
    public int d;
    public int f31213e;
    public e11[] f31214f;
    public RectF[] h;
    public float f31215n;
    public org.telegram.ui.to0 f31216r;
    public int f31217s;

    public tz(Context context) {
        super(context);
        this.f31210a = new Paint(1);
        this.f31211b = new Paint(1);
        this.f31212c = new Path();
        this.d = -1;
        this.f31213e = -1;
        this.f31217s = -1;
    }

    public final void a(float f7, int i10, int i11, Canvas canvas) {
        e11[] e11VarArr = this.f31214f;
        int length = e11VarArr.length;
        int i12 = 0;
        float f10 = f7;
        while (i12 < length) {
            e11 e11Var = e11VarArr[i12];
            int i13 = i11;
            e11Var.c(f10, i10 / 2.0f, 1.0f, i13, canvas);
            f10 += e11Var.l() + AndroidUtilities.dp(24.0f);
            i12++;
            i11 = i13;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.f31214f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.q.D(24.0f, this.f31214f.length, AndroidUtilities.dp(4.0f));
        int i10 = 0;
        while (true) {
            e11[] e11VarArr = this.f31214f;
            if (i10 >= e11VarArr.length) {
                break;
            }
            dp = (int) (e11VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(36.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(36.0f) + height) / 2.0f;
        float f7 = (width - dp) / 2.0f;
        float dp4 = AndroidUtilities.dp(16.0f) + f7;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f7, dp2, dp + f7, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f31210a);
        float dp5 = f7 + AndroidUtilities.dp(16.0f);
        for (int i11 = 0; i11 < this.f31214f.length; i11++) {
            this.h[i11].set(dp5 - AndroidUtilities.dp(16.0f), dp2, this.f31214f[i11].l() + dp5 + AndroidUtilities.dp(16.0f), dp3);
            dp5 += this.f31214f[i11].l() + AndroidUtilities.dp(24.0f);
        }
        AndroidUtilities.dp(4.0f);
        int clamp = Utilities.clamp((int) Math.floor(this.f31215n), this.f31214f.length - 1, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(this.f31215n), this.f31214f.length - 1, 0);
        float dp6 = this.h[clamp].left + AndroidUtilities.dp(4.0f);
        float dp7 = this.h[clamp2].left + AndroidUtilities.dp(4.0f);
        float f10 = this.f31215n;
        float lerp = AndroidUtilities.lerp(dp6, dp7, (float) (f10 - Math.floor(f10)));
        float dp8 = this.h[clamp].right - AndroidUtilities.dp(4.0f);
        float dp9 = this.h[clamp2].right - AndroidUtilities.dp(4.0f);
        float f11 = this.f31215n;
        float lerp2 = AndroidUtilities.lerp(dp8, dp9, (float) (f11 - Math.floor(f11)));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(lerp, (height - AndroidUtilities.dp(28.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(28.0f) + height) / 2.0f);
        Path path = this.f31212c;
        path.rewind();
        path.addRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f31211b);
        a(dp4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(dp4, height, this.f31213e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f31214f == null || this.h == null) {
            return false;
        }
        while (true) {
            RectF[] rectFArr = this.h;
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
        if (i10 >= 0 && i10 != this.f31217s) {
            this.f31217s = i10;
            org.telegram.ui.to0 to0Var = this.f31216r;
            if (to0Var != null) {
                to0Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f31217s = -1;
        }
        if (motionEvent.getAction() == 0 && i10 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f31210a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f7) {
        if (Math.abs(f7 - this.f31215n) > 0.001f) {
            invalidate();
        }
        this.f31215n = f7;
    }

    public void setSelectedColor(int i10) {
        this.f31211b.setColor(i10);
        invalidate();
    }

    public void setSelectedTextColor(int i10) {
        this.f31213e = i10;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f31214f = new e11[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f31214f[i10] = new e11(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.h[i10] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i10) {
        this.d = i10;
        invalidate();
    }
}

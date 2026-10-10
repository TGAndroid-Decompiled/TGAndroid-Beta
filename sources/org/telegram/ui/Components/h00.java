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
public final class h00 extends View {
    public final Paint f26884a;
    public final Paint f26885b;
    public final Path f26886c;
    public int d;
    public int f26887e;
    public m11[] f26888f;
    public RectF[] h;
    public float f26889n;
    public org.telegram.ui.xo0 f26890r;
    public int f26891s;

    public h00(Context context) {
        super(context);
        this.f26884a = new Paint(1);
        this.f26885b = new Paint(1);
        this.f26886c = new Path();
        this.d = -1;
        this.f26887e = -1;
        this.f26891s = -1;
    }

    public final void a(float f7, int i10, int i11, Canvas canvas) {
        m11[] m11VarArr = this.f26888f;
        int length = m11VarArr.length;
        int i12 = 0;
        float f10 = f7;
        while (i12 < length) {
            m11 m11Var = m11VarArr[i12];
            int i13 = i11;
            m11Var.c(f10, i10 / 2.0f, 1.0f, i13, canvas);
            f10 += m11Var.l() + AndroidUtilities.dp(24.0f);
            i12++;
            i11 = i13;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f26888f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f10 = 4.0f;
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.q.D(24.0f, this.f26888f.length, AndroidUtilities.dp(4.0f));
        int i10 = 0;
        while (true) {
            m11[] m11VarArr = this.f26888f;
            if (i10 >= m11VarArr.length) {
                break;
            }
            dp = (int) (m11VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(36.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(36.0f) + height) / 2.0f;
        float f11 = (width - dp) / 2.0f;
        float dp4 = AndroidUtilities.dp(16.0f) + f11;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f11, dp2, dp + f11, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f26884a);
        float dp5 = f11 + AndroidUtilities.dp(16.0f);
        int i11 = 0;
        while (i11 < this.f26888f.length) {
            this.h[i11].set(dp5 - AndroidUtilities.dp(16.0f), dp2, this.f26888f[i11].l() + dp5 + AndroidUtilities.dp(16.0f), dp3);
            dp5 += this.f26888f[i11].l() + AndroidUtilities.dp(24.0f);
            i11++;
            f10 = f10;
        }
        AndroidUtilities.dp(f10);
        int clamp = Utilities.clamp((int) Math.floor(this.f26889n), this.f26888f.length - 1, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(this.f26889n), this.f26888f.length - 1, 0);
        float dp6 = this.h[clamp].left + AndroidUtilities.dp(f7);
        float dp7 = this.h[clamp2].left + AndroidUtilities.dp(f7);
        float f12 = this.f26889n;
        float lerp = AndroidUtilities.lerp(dp6, dp7, (float) (f12 - Math.floor(f12)));
        float dp8 = this.h[clamp].right - AndroidUtilities.dp(f7);
        float dp9 = this.h[clamp2].right - AndroidUtilities.dp(f7);
        float f13 = this.f26889n;
        float lerp2 = AndroidUtilities.lerp(dp8, dp9, (float) (f13 - Math.floor(f13)));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(lerp, (height - AndroidUtilities.dp(28.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(28.0f) + height) / 2.0f);
        Path path = this.f26886c;
        path.rewind();
        path.addRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f26885b);
        a(dp4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(dp4, height, this.f26887e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f26888f == null || this.h == null) {
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
        if (i10 >= 0 && i10 != this.f26891s) {
            this.f26891s = i10;
            org.telegram.ui.xo0 xo0Var = this.f26890r;
            if (xo0Var != null) {
                xo0Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f26891s = -1;
        }
        if (motionEvent.getAction() == 0 && i10 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f26884a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f7) {
        if (Math.abs(f7 - this.f26889n) > 0.001f) {
            invalidate();
        }
        this.f26889n = f7;
    }

    public void setSelectedColor(int i10) {
        this.f26885b.setColor(i10);
        invalidate();
    }

    public void setSelectedTextColor(int i10) {
        this.f26887e = i10;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f26888f = new m11[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f26888f[i10] = new m11(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.h[i10] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i10) {
        this.d = i10;
        invalidate();
    }
}

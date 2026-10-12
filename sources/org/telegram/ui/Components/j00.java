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
public final class j00 extends View {
    public final Paint f27309a;
    public final Paint f27310b;
    public final Path f27311c;
    public int d;
    public int f27312e;
    public r11[] f27313f;
    public RectF[] h;
    public float f27314n;
    public org.telegram.ui.zo0 f27315r;
    public int f27316s;

    public j00(Context context) {
        super(context);
        this.f27309a = new Paint(1);
        this.f27310b = new Paint(1);
        this.f27311c = new Path();
        this.d = -1;
        this.f27312e = -1;
        this.f27316s = -1;
    }

    public final void a(float f7, int i10, int i11, Canvas canvas) {
        r11[] r11VarArr = this.f27313f;
        int length = r11VarArr.length;
        int i12 = 0;
        float f10 = f7;
        while (i12 < length) {
            r11 r11Var = r11VarArr[i12];
            int i13 = i11;
            r11Var.c(f10, i10 / 2.0f, 1.0f, i13, canvas);
            f10 += r11Var.l() + AndroidUtilities.dp(24.0f);
            i12++;
            i11 = i13;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        if (this.f27313f == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float f10 = 4.0f;
        int dp = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.D(24.0f, this.f27313f.length, AndroidUtilities.dp(4.0f));
        int i10 = 0;
        while (true) {
            r11[] r11VarArr = this.f27313f;
            if (i10 >= r11VarArr.length) {
                break;
            }
            dp = (int) (r11VarArr[i10].l() + dp);
            i10++;
        }
        float dp2 = (height - AndroidUtilities.dp(36.0f)) / 2.0f;
        float dp3 = (AndroidUtilities.dp(36.0f) + height) / 2.0f;
        float f11 = (width - dp) / 2.0f;
        float dp4 = AndroidUtilities.dp(16.0f) + f11;
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f11, dp2, dp + f11, dp3);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), this.f27309a);
        float dp5 = f11 + AndroidUtilities.dp(16.0f);
        int i11 = 0;
        while (i11 < this.f27313f.length) {
            this.h[i11].set(dp5 - AndroidUtilities.dp(16.0f), dp2, this.f27313f[i11].l() + dp5 + AndroidUtilities.dp(16.0f), dp3);
            dp5 += this.f27313f[i11].l() + AndroidUtilities.dp(24.0f);
            i11++;
            f10 = f10;
        }
        AndroidUtilities.dp(f10);
        int clamp = Utilities.clamp((int) Math.floor(this.f27314n), this.f27313f.length - 1, 0);
        int clamp2 = Utilities.clamp((int) Math.ceil(this.f27314n), this.f27313f.length - 1, 0);
        float dp6 = this.h[clamp].left + AndroidUtilities.dp(f7);
        float dp7 = this.h[clamp2].left + AndroidUtilities.dp(f7);
        float f12 = this.f27314n;
        float lerp = AndroidUtilities.lerp(dp6, dp7, (float) (f12 - Math.floor(f12)));
        float dp8 = this.h[clamp].right - AndroidUtilities.dp(f7);
        float dp9 = this.h[clamp2].right - AndroidUtilities.dp(f7);
        float f13 = this.f27314n;
        float lerp2 = AndroidUtilities.lerp(dp8, dp9, (float) (f13 - Math.floor(f13)));
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(lerp, (height - AndroidUtilities.dp(28.0f)) / 2.0f, lerp2, (AndroidUtilities.dp(28.0f) + height) / 2.0f);
        Path path = this.f27311c;
        path.rewind();
        path.addRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), Path.Direction.CW);
        canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), this.f27310b);
        a(dp4, height, this.d, canvas);
        canvas.save();
        canvas.clipPath(path);
        a(dp4, height, this.f27312e, canvas);
        canvas.restore();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i10 = 0;
        if (this.f27313f == null || this.h == null) {
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
        if (i10 >= 0 && i10 != this.f27316s) {
            this.f27316s = i10;
            org.telegram.ui.zo0 zo0Var = this.f27315r;
            if (zo0Var != null) {
                zo0Var.run(Integer.valueOf(i10));
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f27316s = -1;
        }
        if (motionEvent.getAction() == 0 && i10 >= 0) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        this.f27309a.setColor(i10);
        invalidate();
    }

    public void setSelected(float f7) {
        if (Math.abs(f7 - this.f27314n) > 0.001f) {
            invalidate();
        }
        this.f27314n = f7;
    }

    public void setSelectedColor(int i10) {
        this.f27310b.setColor(i10);
        invalidate();
    }

    public void setSelectedTextColor(int i10) {
        this.f27312e = i10;
        invalidate();
    }

    public void setTabs(CharSequence... charSequenceArr) {
        this.f27313f = new r11[charSequenceArr.length];
        this.h = new RectF[charSequenceArr.length];
        for (int i10 = 0; i10 < charSequenceArr.length; i10++) {
            this.f27313f[i10] = new r11(charSequenceArr[i10], 14.0f, AndroidUtilities.bold());
            this.h[i10] = new RectF();
        }
        invalidate();
    }

    public void setTextColor(int i10) {
        this.d = i10;
        invalidate();
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public final class tp0 extends Drawable {

    public long f32854a = 0;

    public final float[] f32855b = {0.0f, -0.5f};

    public final Drawable f32856c;
    public final Drawable d;

    public final Drawable f32857e;

    public final int f32858f;

    public tp0(Context context, int i10) {
        this.f32858f = i10;
        if (i10 == 4) {
            this.f32856c = context.getResources().getDrawable(R.drawable.filled_extend_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.f32857e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i10 == 5) {
            this.f32856c = context.getResources().getDrawable(R.drawable.filled_stop_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.f32857e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i10 == 1) {
            this.f32856c = context.getResources().getDrawable(R.drawable.smallanimationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.f32857e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else {
            this.f32856c = context.getResources().getDrawable(R.drawable.animationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.f32857e = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int iDp;
        float[] fArr;
        int iDp2;
        int iDp3;
        int iDp4;
        int iC;
        int iDp5;
        Drawable drawable = this.f32856c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i10 = 3;
        int i11 = 5;
        int i12 = 1;
        int i13 = this.f32858f;
        int i14 = 4;
        if (i13 == 4 || i13 == 5) {
            iDp = AndroidUtilities.dp(24.0f);
        } else if (i13 == 3) {
            iDp = AndroidUtilities.dp(44.0f);
        } else if (i13 == 2) {
            iDp = AndroidUtilities.dp(32.0f);
        } else {
            iDp = i13 == 1 ? AndroidUtilities.dp(30.0f) : AndroidUtilities.dp(120.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - iDp) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - iDp) / 2) + getBounds().left;
        int i15 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i15, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i16 = 0;
        while (true) {
            fArr = this.f32855b;
            if (i16 >= 2) {
                break;
            }
            float f10 = fArr[i16];
            if (f10 >= 0.0f) {
                float f11 = (f10 * 0.5f) + 0.5f;
                if (i13 == i14 || i13 == i11) {
                    int iDp6 = AndroidUtilities.dp(2.5f * f11);
                    iDp2 = AndroidUtilities.dp(f11 * 6.5f);
                    int iDp7 = AndroidUtilities.dp(fArr[i16] * 6.0f);
                    iDp3 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - iDp7;
                    iDp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    iC = org.telegram.messenger.rl.C(3.0f, i15, iDp7);
                    iDp5 = iDp6;
                } else if (i13 == i10) {
                    iDp5 = AndroidUtilities.dp(5.0f * f11);
                    iDp2 = AndroidUtilities.dp(f11 * 18.0f);
                    int iDp8 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                    iDp3 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - iDp8;
                    iDp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    iC = org.telegram.messenger.rl.C(2.0f, i15, iDp8);
                } else if (i13 == 2) {
                    iDp5 = AndroidUtilities.dp(5.0f * f11);
                    iDp2 = AndroidUtilities.dp(f11 * 18.0f);
                    int iDp9 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                    iDp3 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - iDp9;
                    iDp4 = (intrinsicHeight / 2) + intrinsicHeight2;
                    iC = org.telegram.messenger.rl.C(2.0f, i15, iDp9);
                } else if (i13 == i12) {
                    int iDp10 = AndroidUtilities.dp(2.5f * f11);
                    iDp2 = AndroidUtilities.dp(f11 * 6.5f);
                    int iDp11 = AndroidUtilities.dp(fArr[i16] * 6.0f);
                    iDp3 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - iDp11;
                    iDp4 = (intrinsicHeight / 2) + intrinsicHeight2;
                    iDp5 = iDp10;
                    iC = org.telegram.messenger.rl.C(7.0f, i15, iDp11);
                } else {
                    iDp5 = AndroidUtilities.dp(5.0f * f11);
                    iDp2 = AndroidUtilities.dp(f11 * 18.0f);
                    int iDp12 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                    iDp3 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - iDp12;
                    iDp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    iC = org.telegram.messenger.rl.C(42.0f, i15, iDp12);
                }
                float f12 = fArr[i16];
                int iA = (int) ((f12 < 0.5f ? f12 / 0.5f : org.telegram.messenger.y1.a(f12, 0.5f, 0.5f, 1.0f)) * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(iA);
                int i17 = iDp4 - iDp2;
                int i18 = iDp4 + iDp2;
                drawable2.setBounds(iDp3 - iDp5, i17, iDp3 + iDp5, i18);
                drawable2.draw(canvas);
                Drawable drawable3 = this.f32857e;
                drawable3.setAlpha(iA);
                drawable3.setBounds(iC - iDp5, i17, iC + iDp5, i18);
                drawable3.draw(canvas);
            }
            i16++;
            i10 = 3;
            i11 = 5;
            i12 = 1;
            i14 = 4;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f32854a;
        this.f32854a = jCurrentTimeMillis;
        if (j10 > 16) {
            j10 = 16;
        }
        for (int i19 = 0; i19 < 2; i19++) {
            if (fArr[i19] >= 1.0f) {
                fArr[i19] = 0.0f;
            }
            float f13 = (j10 / 1300.0f) + fArr[i19];
            fArr[i19] = f13;
            if (f13 > 1.0f) {
                fArr[i19] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f32858f;
        if (i10 == 4 || i10 == 5) {
            return AndroidUtilities.dp(42.0f);
        }
        if (i10 == 3) {
            return AndroidUtilities.dp(100.0f);
        }
        if (i10 == 2) {
            return AndroidUtilities.dp(74.0f);
        }
        return i10 == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(180.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.f32858f;
        if (i10 == 4 || i10 == 5) {
            return AndroidUtilities.dp(42.0f);
        }
        if (i10 == 3) {
            return AndroidUtilities.dp(100.0f);
        }
        if (i10 == 2) {
            return AndroidUtilities.dp(74.0f);
        }
        return i10 == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(120.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32856c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f32857e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}

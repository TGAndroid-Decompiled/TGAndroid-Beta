package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class sp0 extends Drawable {
    public long f32540a = 0;
    public final float[] f32541b = {0.0f, -0.5f};
    public final Drawable f32542c;
    public final Drawable d;
    public final Drawable f32543e;
    public final int f32544f;

    public sp0(Context context, int i9) {
        this.f32544f = i9;
        if (i9 == 4) {
            this.f32542c = context.getResources().getDrawable(R.drawable.filled_extend_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.f32543e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i9 == 5) {
            this.f32542c = context.getResources().getDrawable(R.drawable.filled_stop_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.f32543e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i9 == 1) {
            this.f32542c = context.getResources().getDrawable(R.drawable.smallanimationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.f32543e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else {
            this.f32542c = context.getResources().getDrawable(R.drawable.animationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.f32543e = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        float[] fArr;
        int dp2;
        int dp3;
        int dp4;
        int D;
        int i9;
        float a2;
        Drawable drawable = this.f32542c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i10 = 3;
        int i11 = 5;
        int i12 = 1;
        int i13 = this.f32544f;
        int i14 = 4;
        if (i13 != 4 && i13 != 5) {
            if (i13 == 3) {
                dp = AndroidUtilities.dp(44.0f);
            } else if (i13 == 2) {
                dp = AndroidUtilities.dp(32.0f);
            } else if (i13 == 1) {
                dp = AndroidUtilities.dp(30.0f);
            } else {
                dp = AndroidUtilities.dp(120.0f);
            }
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - dp) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - dp) / 2) + getBounds().left;
        int i15 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i15, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i16 = 0;
        while (true) {
            fArr = this.f32541b;
            if (i16 >= 2) {
                break;
            }
            float f10 = fArr[i16];
            if (f10 >= 0.0f) {
                float f11 = (f10 * 0.5f) + 0.5f;
                if (i13 != i14 && i13 != i11) {
                    if (i13 == i10) {
                        i9 = AndroidUtilities.dp(5.0f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 18.0f);
                        int dp5 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                        dp3 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp5;
                        dp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                        D = org.telegram.messenger.ll.D(2.0f, i15, dp5);
                    } else if (i13 == 2) {
                        i9 = AndroidUtilities.dp(5.0f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 18.0f);
                        int dp6 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                        dp3 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp6;
                        dp4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        D = org.telegram.messenger.ll.D(2.0f, i15, dp6);
                    } else if (i13 == i12) {
                        int dp7 = AndroidUtilities.dp(2.5f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 6.5f);
                        int dp8 = AndroidUtilities.dp(fArr[i16] * 6.0f);
                        dp3 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - dp8;
                        dp4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i9 = dp7;
                        D = org.telegram.messenger.ll.D(7.0f, i15, dp8);
                    } else {
                        i9 = AndroidUtilities.dp(5.0f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 18.0f);
                        int dp9 = AndroidUtilities.dp(fArr[i16] * 15.0f);
                        dp3 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - dp9;
                        dp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                        D = org.telegram.messenger.ll.D(42.0f, i15, dp9);
                    }
                } else {
                    int dp10 = AndroidUtilities.dp(2.5f * f11);
                    dp2 = AndroidUtilities.dp(f11 * 6.5f);
                    int dp11 = AndroidUtilities.dp(fArr[i16] * 6.0f);
                    dp3 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - dp11;
                    dp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    D = org.telegram.messenger.ll.D(3.0f, i15, dp11);
                    i9 = dp10;
                }
                float f12 = fArr[i16];
                if (f12 < 0.5f) {
                    a2 = f12 / 0.5f;
                } else {
                    a2 = org.telegram.messenger.l0.a(f12, 0.5f, 0.5f, 1.0f);
                }
                int i17 = (int) (a2 * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i17);
                int i18 = dp4 - dp2;
                int i19 = dp4 + dp2;
                drawable2.setBounds(dp3 - i9, i18, dp3 + i9, i19);
                drawable2.draw(canvas);
                Drawable drawable3 = this.f32543e;
                drawable3.setAlpha(i17);
                drawable3.setBounds(D - i9, i18, D + i9, i19);
                drawable3.draw(canvas);
            }
            i16++;
            i10 = 3;
            i11 = 5;
            i12 = 1;
            i14 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f32540a;
        this.f32540a = currentTimeMillis;
        if (j10 > 16) {
            j10 = 16;
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (fArr[i20] >= 1.0f) {
                fArr[i20] = 0.0f;
            }
            float f13 = (((float) j10) / 1300.0f) + fArr[i20];
            fArr[i20] = f13;
            if (f13 > 1.0f) {
                fArr[i20] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i9 = this.f32544f;
        if (i9 != 4 && i9 != 5) {
            if (i9 == 3) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i9 == 2) {
                return AndroidUtilities.dp(74.0f);
            }
            if (i9 == 1) {
                return AndroidUtilities.dp(40.0f);
            }
            return AndroidUtilities.dp(180.0f);
        }
        return AndroidUtilities.dp(42.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i9 = this.f32544f;
        if (i9 != 4 && i9 != 5) {
            if (i9 == 3) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i9 == 2) {
                return AndroidUtilities.dp(74.0f);
            }
            if (i9 == 1) {
                return AndroidUtilities.dp(40.0f);
            }
            return AndroidUtilities.dp(120.0f);
        }
        return AndroidUtilities.dp(42.0f);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32542c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.f32543e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i9) {
    }
}

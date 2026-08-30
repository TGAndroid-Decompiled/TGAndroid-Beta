package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class mq0 extends Drawable {
    public long f27105a = 0;
    public final float[] f27106b = {0.0f, -0.5f};
    public final Drawable f27107c;
    public final Drawable d;
    public final Drawable e;
    public final int f27108f;

    public mq0(Context context, int i10) {
        this.f27108f = i10;
        if (i10 == 4) {
            this.f27107c = context.getResources().getDrawable(R.drawable.filled_extend_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i10 == 5) {
            this.f27107c = context.getResources().getDrawable(R.drawable.filled_stop_location).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i10 == 1) {
            this.f27107c = context.getResources().getDrawable(R.drawable.smallanimationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else {
            this.f27107c = context.getResources().getDrawable(R.drawable.animationpin).mutate();
            this.d = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.e = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        int dp;
        float[] fArr;
        int dp2;
        int dp3;
        int dp4;
        int C;
        int i10;
        float a2;
        Drawable drawable = this.f27107c;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i11 = 3;
        int i12 = 5;
        int i13 = 1;
        int i14 = this.f27108f;
        int i15 = 4;
        if (i14 != 4 && i14 != 5) {
            if (i14 == 3) {
                dp = AndroidUtilities.dp(44.0f);
            } else if (i14 == 2) {
                dp = AndroidUtilities.dp(32.0f);
            } else if (i14 == 1) {
                dp = AndroidUtilities.dp(30.0f);
            } else {
                dp = AndroidUtilities.dp(120.0f);
            }
        } else {
            dp = AndroidUtilities.dp(24.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - dp) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - dp) / 2) + getBounds().left;
        int i16 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i16, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i17 = 0;
        while (true) {
            fArr = this.f27106b;
            if (i17 >= 2) {
                break;
            }
            float f10 = fArr[i17];
            if (f10 >= 0.0f) {
                float f11 = (f10 * 0.5f) + 0.5f;
                if (i14 != i15 && i14 != i12) {
                    if (i14 == i11) {
                        i10 = AndroidUtilities.dp(5.0f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 18.0f);
                        int dp5 = AndroidUtilities.dp(fArr[i17] * 15.0f);
                        dp3 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp5;
                        dp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                        C = org.telegram.ui.b.C(2.0f, i16, dp5);
                    } else if (i14 == 2) {
                        i10 = AndroidUtilities.dp(5.0f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 18.0f);
                        int dp6 = AndroidUtilities.dp(fArr[i17] * 15.0f);
                        dp3 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp6;
                        dp4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        C = org.telegram.ui.b.C(2.0f, i16, dp6);
                    } else if (i14 == i13) {
                        int dp7 = AndroidUtilities.dp(2.5f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 6.5f);
                        int dp8 = AndroidUtilities.dp(fArr[i17] * 6.0f);
                        dp3 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - dp8;
                        dp4 = (intrinsicHeight / 2) + intrinsicHeight2;
                        i10 = dp7;
                        C = org.telegram.ui.b.C(7.0f, i16, dp8);
                    } else {
                        i10 = AndroidUtilities.dp(5.0f * f11);
                        dp2 = AndroidUtilities.dp(f11 * 18.0f);
                        int dp9 = AndroidUtilities.dp(fArr[i17] * 15.0f);
                        dp3 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - dp9;
                        dp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                        C = org.telegram.ui.b.C(42.0f, i16, dp9);
                    }
                } else {
                    int dp10 = AndroidUtilities.dp(2.5f * f11);
                    dp2 = AndroidUtilities.dp(f11 * 6.5f);
                    int dp11 = AndroidUtilities.dp(fArr[i17] * 6.0f);
                    dp3 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - dp11;
                    dp4 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    C = org.telegram.ui.b.C(3.0f, i16, dp11);
                    i10 = dp10;
                }
                float f12 = fArr[i17];
                if (f12 < 0.5f) {
                    a2 = f12 / 0.5f;
                } else {
                    a2 = org.telegram.messenger.y3.a(f12, 0.5f, 0.5f, 1.0f);
                }
                int i18 = (int) (a2 * 255.0f);
                Drawable drawable2 = this.d;
                drawable2.setAlpha(i18);
                int i19 = dp4 - dp2;
                int i20 = dp4 + dp2;
                drawable2.setBounds(dp3 - i10, i19, dp3 + i10, i20);
                drawable2.draw(canvas);
                Drawable drawable3 = this.e;
                drawable3.setAlpha(i18);
                drawable3.setBounds(C - i10, i19, C + i10, i20);
                drawable3.draw(canvas);
            }
            i17++;
            i11 = 3;
            i12 = 5;
            i13 = 1;
            i15 = 4;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = currentTimeMillis - this.f27105a;
        this.f27105a = currentTimeMillis;
        if (j10 > 16) {
            j10 = 16;
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (fArr[i21] >= 1.0f) {
                fArr[i21] = 0.0f;
            }
            float f13 = (((float) j10) / 1300.0f) + fArr[i21];
            fArr[i21] = f13;
            if (f13 > 1.0f) {
                fArr[i21] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
        int i10 = this.f27108f;
        if (i10 != 4 && i10 != 5) {
            if (i10 == 3) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i10 == 2) {
                return AndroidUtilities.dp(74.0f);
            }
            if (i10 == 1) {
                return AndroidUtilities.dp(40.0f);
            }
            return AndroidUtilities.dp(180.0f);
        }
        return AndroidUtilities.dp(42.0f);
    }

    @Override
    public final int getIntrinsicWidth() {
        int i10 = this.f27108f;
        if (i10 != 4 && i10 != 5) {
            if (i10 == 3) {
                return AndroidUtilities.dp(100.0f);
            }
            if (i10 == 2) {
                return AndroidUtilities.dp(74.0f);
            }
            if (i10 == 1) {
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
        this.f27107c.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
    }

    @Override
    public final void setAlpha(int i10) {
    }
}

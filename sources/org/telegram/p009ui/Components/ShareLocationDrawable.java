package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0890R;

public class ShareLocationDrawable extends Drawable {
    private int currentType;
    private Drawable drawable;
    private Drawable drawableLeft;
    private Drawable drawableRight;
    private long lastUpdateTime = 0;
    private float[] progress = {0.0f, -0.5f};

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    public ShareLocationDrawable(Context context, int i) {
        this.currentType = i;
        if (i == 4) {
            this.drawable = context.getResources().getDrawable(C0890R.C0891drawable.pin);
            this.drawableLeft = context.getResources().getDrawable(C0890R.C0891drawable.smallanimationpinleft);
            this.drawableRight = context.getResources().getDrawable(C0890R.C0891drawable.smallanimationpinright);
        } else if (i == 3) {
            this.drawable = context.getResources().getDrawable(C0890R.C0891drawable.nearby_l);
            this.drawableLeft = context.getResources().getDrawable(C0890R.C0891drawable.animationpinleft);
            this.drawableRight = context.getResources().getDrawable(C0890R.C0891drawable.animationpinright);
        } else if (i == 2) {
            this.drawable = context.getResources().getDrawable(C0890R.C0891drawable.nearby_m);
            this.drawableLeft = context.getResources().getDrawable(C0890R.C0891drawable.animationpinleft);
            this.drawableRight = context.getResources().getDrawable(C0890R.C0891drawable.animationpinright);
        } else if (i == 1) {
            this.drawable = context.getResources().getDrawable(C0890R.C0891drawable.smallanimationpin);
            this.drawableLeft = context.getResources().getDrawable(C0890R.C0891drawable.smallanimationpinleft);
            this.drawableRight = context.getResources().getDrawable(C0890R.C0891drawable.smallanimationpinright);
        } else {
            this.drawable = context.getResources().getDrawable(C0890R.C0891drawable.animationpin);
            this.drawableLeft = context.getResources().getDrawable(C0890R.C0891drawable.animationpinleft);
            this.drawableRight = context.getResources().getDrawable(C0890R.C0891drawable.animationpinright);
        }
    }

    private void update() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        if (j > 16) {
            j = 16;
        }
        for (int i = 0; i < 2; i++) {
            float[] fArr = this.progress;
            if (fArr[i] >= 1.0f) {
                fArr[i] = 0.0f;
            }
            fArr[i] = fArr[i] + (((float) j) / 1300.0f);
            if (fArr[i] > 1.0f) {
                fArr[i] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        int i;
        int dp;
        int dp2;
        int dp3;
        int dp4;
        int dp5;
        int dp6;
        float f;
        int intrinsicWidth = this.drawable.getIntrinsicWidth();
        int intrinsicHeight = this.drawable.getIntrinsicHeight();
        int i2 = this.currentType;
        int i3 = 3;
        int i4 = 4;
        int i5 = 1;
        if (i2 == 4) {
            i = AndroidUtilities.m34dp(24.0f);
        } else if (i2 == 3) {
            i = AndroidUtilities.m34dp(44.0f);
        } else if (i2 == 2) {
            i = AndroidUtilities.m34dp(32.0f);
        } else if (i2 == 1) {
            i = AndroidUtilities.m34dp(30.0f);
        } else {
            i = AndroidUtilities.m34dp(120.0f);
        }
        int intrinsicHeight2 = getBounds().top + ((getIntrinsicHeight() - i) / 2);
        int intrinsicWidth2 = getBounds().left + ((getIntrinsicWidth() - i) / 2);
        int i6 = intrinsicWidth + intrinsicWidth2;
        this.drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i6, intrinsicHeight2 + intrinsicHeight);
        this.drawable.draw(canvas);
        int i7 = 0;
        while (i7 < 2) {
            float[] fArr = this.progress;
            if (fArr[i7] >= 0.0f) {
                float f2 = (fArr[i7] * 0.5f) + 0.5f;
                int i8 = this.currentType;
                if (i8 == i4) {
                    dp = AndroidUtilities.m34dp(2.5f * f2);
                    dp2 = AndroidUtilities.m34dp(f2 * 6.5f);
                    dp3 = AndroidUtilities.m34dp(this.progress[i7] * 6.0f);
                    dp4 = (intrinsicWidth2 + AndroidUtilities.m34dp(3.0f)) - dp3;
                    dp5 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.m34dp(2.0f);
                    dp6 = AndroidUtilities.m34dp(3.0f);
                } else if (i8 == i3) {
                    dp = AndroidUtilities.m34dp(5.0f * f2);
                    dp2 = AndroidUtilities.m34dp(f2 * 18.0f);
                    dp3 = AndroidUtilities.m34dp(this.progress[i7] * 15.0f);
                    dp4 = (AndroidUtilities.m34dp(2.0f) + intrinsicWidth2) - dp3;
                    dp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.m34dp(7.0f);
                    dp6 = AndroidUtilities.m34dp(2.0f);
                } else if (i8 == 2) {
                    dp = AndroidUtilities.m34dp(5.0f * f2);
                    dp2 = AndroidUtilities.m34dp(f2 * 18.0f);
                    dp3 = AndroidUtilities.m34dp(this.progress[i7] * 15.0f);
                    dp4 = (AndroidUtilities.m34dp(2.0f) + intrinsicWidth2) - dp3;
                    dp5 = intrinsicHeight2 + (intrinsicHeight / 2);
                    dp6 = AndroidUtilities.m34dp(2.0f);
                } else if (i8 == i5) {
                    dp = AndroidUtilities.m34dp(2.5f * f2);
                    dp2 = AndroidUtilities.m34dp(f2 * 6.5f);
                    dp3 = AndroidUtilities.m34dp(this.progress[i7] * 6.0f);
                    dp4 = (AndroidUtilities.m34dp(7.0f) + intrinsicWidth2) - dp3;
                    dp5 = intrinsicHeight2 + (intrinsicHeight / 2);
                    dp6 = AndroidUtilities.m34dp(7.0f);
                } else {
                    dp = AndroidUtilities.m34dp(5.0f * f2);
                    dp2 = AndroidUtilities.m34dp(f2 * 18.0f);
                    dp3 = AndroidUtilities.m34dp(this.progress[i7] * 15.0f);
                    dp4 = (intrinsicWidth2 + AndroidUtilities.m34dp(42.0f)) - dp3;
                    dp5 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.m34dp(7.0f);
                    dp6 = AndroidUtilities.m34dp(42.0f);
                }
                int i9 = (i6 - dp6) + dp3;
                float[] fArr2 = this.progress;
                if (fArr2[i7] < 0.5f) {
                    f = fArr2[i7] / 0.5f;
                } else {
                    f = 1.0f - ((fArr2[i7] - 0.5f) / 0.5f);
                }
                int i10 = (int) (f * 255.0f);
                this.drawableLeft.setAlpha(i10);
                int i11 = dp5 - dp2;
                int i12 = dp5 + dp2;
                this.drawableLeft.setBounds(dp4 - dp, i11, dp4 + dp, i12);
                this.drawableLeft.draw(canvas);
                this.drawableRight.setAlpha(i10);
                this.drawableRight.setBounds(i9 - dp, i11, i9 + dp, i12);
                this.drawableRight.draw(canvas);
            }
            i7++;
            i3 = 3;
            i4 = 4;
            i5 = 1;
        }
        update();
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
        this.drawableLeft.setColorFilter(colorFilter);
        this.drawableRight.setColorFilter(colorFilter);
    }

    @Override
    public int getIntrinsicWidth() {
        int i = this.currentType;
        if (i == 4) {
            return AndroidUtilities.m34dp(42.0f);
        }
        if (i == 3) {
            return AndroidUtilities.m34dp(100.0f);
        }
        if (i == 2) {
            return AndroidUtilities.m34dp(74.0f);
        }
        if (i == 1) {
            return AndroidUtilities.m34dp(40.0f);
        }
        return AndroidUtilities.m34dp(120.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        int i = this.currentType;
        if (i == 4) {
            return AndroidUtilities.m34dp(42.0f);
        }
        if (i == 3) {
            return AndroidUtilities.m34dp(100.0f);
        }
        if (i == 2) {
            return AndroidUtilities.m34dp(74.0f);
        }
        if (i == 1) {
            return AndroidUtilities.m34dp(40.0f);
        }
        return AndroidUtilities.m34dp(180.0f);
    }
}

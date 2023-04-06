package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
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
            this.drawable = context.getResources().getDrawable(R.drawable.pin);
            this.drawableLeft = context.getResources().getDrawable(R.drawable.smallanimationpinleft);
            this.drawableRight = context.getResources().getDrawable(R.drawable.smallanimationpinright);
        } else if (i == 3) {
            this.drawable = context.getResources().getDrawable(R.drawable.nearby_l);
            this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft);
            this.drawableRight = context.getResources().getDrawable(R.drawable.animationpinright);
        } else if (i == 2) {
            this.drawable = context.getResources().getDrawable(R.drawable.nearby_m);
            this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft);
            this.drawableRight = context.getResources().getDrawable(R.drawable.animationpinright);
        } else if (i == 1) {
            this.drawable = context.getResources().getDrawable(R.drawable.smallanimationpin);
            this.drawableLeft = context.getResources().getDrawable(R.drawable.smallanimationpinleft);
            this.drawableRight = context.getResources().getDrawable(R.drawable.smallanimationpinright);
        } else {
            this.drawable = context.getResources().getDrawable(R.drawable.animationpin);
            this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft);
            this.drawableRight = context.getResources().getDrawable(R.drawable.animationpinright);
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
        int dp;
        int dp2;
        int dp3;
        int dp4;
        int dp5;
        int dp6;
        int dp7;
        float f;
        int intrinsicWidth = this.drawable.getIntrinsicWidth();
        int intrinsicHeight = this.drawable.getIntrinsicHeight();
        int i = this.currentType;
        int i2 = 3;
        int i3 = 4;
        int i4 = 1;
        if (i == 4) {
            dp = AndroidUtilities.dp(24.0f);
        } else if (i == 3) {
            dp = AndroidUtilities.dp(44.0f);
        } else if (i == 2) {
            dp = AndroidUtilities.dp(32.0f);
        } else if (i == 1) {
            dp = AndroidUtilities.dp(30.0f);
        } else {
            dp = AndroidUtilities.dp(120.0f);
        }
        int intrinsicHeight2 = getBounds().top + ((getIntrinsicHeight() - dp) / 2);
        int intrinsicWidth2 = getBounds().left + ((getIntrinsicWidth() - dp) / 2);
        int i5 = intrinsicWidth + intrinsicWidth2;
        this.drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i5, intrinsicHeight2 + intrinsicHeight);
        this.drawable.draw(canvas);
        int i6 = 0;
        while (i6 < 2) {
            float[] fArr = this.progress;
            if (fArr[i6] >= 0.0f) {
                float f2 = (fArr[i6] * 0.5f) + 0.5f;
                int i7 = this.currentType;
                if (i7 == i3) {
                    dp2 = AndroidUtilities.dp(2.5f * f2);
                    dp3 = AndroidUtilities.dp(f2 * 6.5f);
                    dp4 = AndroidUtilities.dp(this.progress[i6] * 6.0f);
                    dp5 = (intrinsicWidth2 + AndroidUtilities.dp(3.0f)) - dp4;
                    dp6 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.dp(2.0f);
                    dp7 = AndroidUtilities.dp(3.0f);
                } else if (i7 == i2) {
                    dp2 = AndroidUtilities.dp(5.0f * f2);
                    dp3 = AndroidUtilities.dp(f2 * 18.0f);
                    dp4 = AndroidUtilities.dp(this.progress[i6] * 15.0f);
                    dp5 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp4;
                    dp6 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    dp7 = AndroidUtilities.dp(2.0f);
                } else if (i7 == 2) {
                    dp2 = AndroidUtilities.dp(5.0f * f2);
                    dp3 = AndroidUtilities.dp(f2 * 18.0f);
                    dp4 = AndroidUtilities.dp(this.progress[i6] * 15.0f);
                    dp5 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - dp4;
                    dp6 = intrinsicHeight2 + (intrinsicHeight / 2);
                    dp7 = AndroidUtilities.dp(2.0f);
                } else if (i7 == i4) {
                    dp2 = AndroidUtilities.dp(2.5f * f2);
                    dp3 = AndroidUtilities.dp(f2 * 6.5f);
                    dp4 = AndroidUtilities.dp(this.progress[i6] * 6.0f);
                    dp5 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - dp4;
                    dp6 = intrinsicHeight2 + (intrinsicHeight / 2);
                    dp7 = AndroidUtilities.dp(7.0f);
                } else {
                    dp2 = AndroidUtilities.dp(5.0f * f2);
                    dp3 = AndroidUtilities.dp(f2 * 18.0f);
                    dp4 = AndroidUtilities.dp(this.progress[i6] * 15.0f);
                    dp5 = (intrinsicWidth2 + AndroidUtilities.dp(42.0f)) - dp4;
                    dp6 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.dp(7.0f);
                    dp7 = AndroidUtilities.dp(42.0f);
                }
                int i8 = (i5 - dp7) + dp4;
                float[] fArr2 = this.progress;
                if (fArr2[i6] < 0.5f) {
                    f = fArr2[i6] / 0.5f;
                } else {
                    f = 1.0f - ((fArr2[i6] - 0.5f) / 0.5f);
                }
                int i9 = (int) (f * 255.0f);
                this.drawableLeft.setAlpha(i9);
                int i10 = dp6 - dp3;
                int i11 = dp6 + dp3;
                this.drawableLeft.setBounds(dp5 - dp2, i10, dp5 + dp2, i11);
                this.drawableLeft.draw(canvas);
                this.drawableRight.setAlpha(i9);
                this.drawableRight.setBounds(i8 - dp2, i10, i8 + dp2, i11);
                this.drawableRight.draw(canvas);
            }
            i6++;
            i2 = 3;
            i3 = 4;
            i4 = 1;
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
            return AndroidUtilities.dp(42.0f);
        }
        if (i == 3) {
            return AndroidUtilities.dp(100.0f);
        }
        if (i == 2) {
            return AndroidUtilities.dp(74.0f);
        }
        if (i == 1) {
            return AndroidUtilities.dp(40.0f);
        }
        return AndroidUtilities.dp(120.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        int i = this.currentType;
        if (i == 4) {
            return AndroidUtilities.dp(42.0f);
        }
        if (i == 3) {
            return AndroidUtilities.dp(100.0f);
        }
        if (i == 2) {
            return AndroidUtilities.dp(74.0f);
        }
        if (i == 1) {
            return AndroidUtilities.dp(40.0f);
        }
        return AndroidUtilities.dp(180.0f);
    }
}

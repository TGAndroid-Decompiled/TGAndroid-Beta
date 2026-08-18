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
            this.drawable = context.getResources().getDrawable(R.drawable.filled_extend_location).mutate();
            this.drawableLeft = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.drawableRight = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i == 5) {
            this.drawable = context.getResources().getDrawable(R.drawable.filled_stop_location).mutate();
            this.drawableLeft = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.drawableRight = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else if (i == 1) {
            this.drawable = context.getResources().getDrawable(R.drawable.smallanimationpin).mutate();
            this.drawableLeft = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
            this.drawableRight = context.getResources().getDrawable(R.drawable.smallanimationpinright).mutate();
        } else {
            this.drawable = context.getResources().getDrawable(R.drawable.animationpin).mutate();
            this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.drawableRight = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
        }
    }

    private void update() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        if (j > 16) {
            j = 16;
        }
        for (int i = 0; i < 2; i++) {
            float[] fArr = this.progress;
            if (fArr[i] >= 1.0f) {
                fArr[i] = 0.0f;
            }
            float f = fArr[i] + (j / 1300.0f);
            fArr[i] = f;
            if (f > 1.0f) {
                fArr[i] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public void draw(Canvas canvas) {
        int iDp;
        int iDp2;
        int iDp3;
        int iDp4;
        int iDp5;
        int iDp6;
        int iDp7;
        int i;
        float f;
        float f2;
        int iDp8;
        int iDp9;
        int intrinsicWidth = this.drawable.getIntrinsicWidth();
        int intrinsicHeight = this.drawable.getIntrinsicHeight();
        int i2 = this.currentType;
        int i3 = 3;
        int i4 = 5;
        int i5 = 1;
        if (i2 == 4 || i2 == 5) {
            iDp = AndroidUtilities.dp(24.0f);
        } else if (i2 == 3) {
            iDp = AndroidUtilities.dp(44.0f);
        } else if (i2 == 2) {
            iDp = AndroidUtilities.dp(32.0f);
        } else if (i2 == 1) {
            iDp = AndroidUtilities.dp(30.0f);
        } else {
            iDp = AndroidUtilities.dp(120.0f);
        }
        int intrinsicHeight2 = getBounds().top + ((getIntrinsicHeight() - iDp) / 2);
        int intrinsicWidth2 = getBounds().left + ((getIntrinsicWidth() - iDp) / 2);
        int i6 = intrinsicWidth + intrinsicWidth2;
        this.drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i6, intrinsicHeight2 + intrinsicHeight);
        this.drawable.draw(canvas);
        int i7 = 0;
        while (i7 < 2) {
            float f3 = this.progress[i7];
            if (f3 >= 0.0f) {
                float f4 = (f3 * 0.5f) + 0.5f;
                int i8 = this.currentType;
                if (i8 == 4 || i8 == i4) {
                    iDp2 = AndroidUtilities.dp(2.5f * f4);
                    iDp3 = AndroidUtilities.dp(f4 * 6.5f);
                    iDp4 = AndroidUtilities.dp(this.progress[i7] * 6.0f);
                    iDp5 = (intrinsicWidth2 + AndroidUtilities.dp(3.0f)) - iDp4;
                    iDp6 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.dp(2.0f);
                    iDp7 = AndroidUtilities.dp(3.0f);
                } else {
                    if (i8 == i3) {
                        iDp2 = AndroidUtilities.dp(5.0f * f4);
                        iDp3 = AndroidUtilities.dp(f4 * 18.0f);
                        iDp8 = AndroidUtilities.dp(this.progress[i7] * 15.0f);
                        iDp5 = (intrinsicWidth2 + AndroidUtilities.dp(2.0f)) - iDp8;
                        iDp6 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.dp(7.0f);
                        iDp9 = AndroidUtilities.dp(2.0f);
                    } else if (i8 == 2) {
                        iDp2 = AndroidUtilities.dp(5.0f * f4);
                        iDp3 = AndroidUtilities.dp(f4 * 18.0f);
                        iDp8 = AndroidUtilities.dp(this.progress[i7] * 15.0f);
                        iDp5 = (intrinsicWidth2 + AndroidUtilities.dp(2.0f)) - iDp8;
                        iDp6 = intrinsicHeight2 + (intrinsicHeight / 2);
                        iDp9 = AndroidUtilities.dp(2.0f);
                    } else if (i8 == i5) {
                        iDp2 = AndroidUtilities.dp(2.5f * f4);
                        iDp3 = AndroidUtilities.dp(f4 * 6.5f);
                        iDp4 = AndroidUtilities.dp(this.progress[i7] * 6.0f);
                        iDp5 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - iDp4;
                        iDp6 = intrinsicHeight2 + (intrinsicHeight / 2);
                        iDp7 = AndroidUtilities.dp(7.0f);
                    } else {
                        iDp2 = AndroidUtilities.dp(5.0f * f4);
                        iDp3 = AndroidUtilities.dp(f4 * 18.0f);
                        iDp4 = AndroidUtilities.dp(this.progress[i7] * 15.0f);
                        iDp5 = (intrinsicWidth2 + AndroidUtilities.dp(42.0f)) - iDp4;
                        iDp6 = (intrinsicHeight2 + (intrinsicHeight / 2)) - AndroidUtilities.dp(7.0f);
                        iDp7 = AndroidUtilities.dp(42.0f);
                    }
                    i = (i6 - iDp9) + iDp8;
                    f = this.progress[i7];
                    if (f < 0.5f) {
                        f2 = f / 0.5f;
                    } else {
                        f2 = 1.0f - ((f - 0.5f) / 0.5f);
                    }
                    int i9 = (int) (f2 * 255.0f);
                    this.drawableLeft.setAlpha(i9);
                    int i10 = iDp6 - iDp3;
                    int i11 = iDp6 + iDp3;
                    this.drawableLeft.setBounds(iDp5 - iDp2, i10, iDp5 + iDp2, i11);
                    this.drawableLeft.draw(canvas);
                    this.drawableRight.setAlpha(i9);
                    this.drawableRight.setBounds(i - iDp2, i10, i + iDp2, i11);
                    this.drawableRight.draw(canvas);
                }
                i = (i6 - iDp7) + iDp4;
                f = this.progress[i7];
                if (f < 0.5f) {
                    f2 = f / 0.5f;
                } else {
                    f2 = 1.0f - ((f - 0.5f) / 0.5f);
                }
                int i12 = (int) (f2 * 255.0f);
                this.drawableLeft.setAlpha(i12);
                int i13 = iDp6 - iDp3;
                int i14 = iDp6 + iDp3;
                this.drawableLeft.setBounds(iDp5 - iDp2, i13, iDp5 + iDp2, i14);
                this.drawableLeft.draw(canvas);
                this.drawableRight.setAlpha(i12);
                this.drawableRight.setBounds(i - iDp2, i13, i + iDp2, i14);
                this.drawableRight.draw(canvas);
            }
            i7++;
            i3 = 3;
            i4 = 5;
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
        if (i == 4 || i == 5) {
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
        if (i == 4 || i == 5) {
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

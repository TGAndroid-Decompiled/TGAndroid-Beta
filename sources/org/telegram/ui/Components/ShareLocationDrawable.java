package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;

public class ShareLocationDrawable extends Drawable {
    public static final int TYPE_ADD = 4;
    public static final int TYPE_DISABLE = 5;
    private int currentType;
    private Drawable drawable;
    private Drawable drawableLeft;
    private Drawable drawableRight;
    private long lastUpdateTime = 0;
    private float[] progress = {0.0f, -0.5f};

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
            float f = (j / 1300.0f) + fArr[i];
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
        int iM;
        int intrinsicWidth = this.drawable.getIntrinsicWidth();
        int intrinsicHeight = this.drawable.getIntrinsicHeight();
        int i = this.currentType;
        int i2 = 3;
        int i3 = 5;
        int i4 = 1;
        if (i == 4 || i == 5) {
            iDp = AndroidUtilities.dp(24.0f);
        } else if (i == 3) {
            iDp = AndroidUtilities.dp(44.0f);
        } else if (i == 2) {
            iDp = AndroidUtilities.dp(32.0f);
        } else {
            iDp = i == 1 ? AndroidUtilities.dp(30.0f) : AndroidUtilities.dp(120.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - iDp) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - iDp) / 2) + getBounds().left;
        int i5 = intrinsicWidth + intrinsicWidth2;
        this.drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i5, intrinsicHeight2 + intrinsicHeight);
        this.drawable.draw(canvas);
        int i6 = 0;
        for (int i7 = 2; i6 < i7; i7 = 2) {
            float f = this.progress[i6];
            if (f >= 0.0f) {
                float f2 = (f * 0.5f) + 0.5f;
                int i8 = this.currentType;
                if (i8 == 4 || i8 == i3) {
                    iDp2 = AndroidUtilities.dp(2.5f * f2);
                    iDp3 = AndroidUtilities.dp(f2 * 6.5f);
                    int iDp6 = AndroidUtilities.dp(this.progress[i6] * 6.0f);
                    iDp4 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - iDp6;
                    iDp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    iM = zzkl.m(3.0f, i5, iDp6);
                } else if (i8 == i2) {
                    iDp2 = AndroidUtilities.dp(5.0f * f2);
                    iDp3 = AndroidUtilities.dp(f2 * 18.0f);
                    int iDp7 = AndroidUtilities.dp(this.progress[i6] * 15.0f);
                    iDp4 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - iDp7;
                    iDp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    iM = zzkl.m(2.0f, i5, iDp7);
                } else if (i8 == i7) {
                    iDp2 = AndroidUtilities.dp(5.0f * f2);
                    iDp3 = AndroidUtilities.dp(f2 * 18.0f);
                    int iDp8 = AndroidUtilities.dp(this.progress[i6] * 15.0f);
                    iDp4 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - iDp8;
                    iDp5 = (intrinsicHeight / 2) + intrinsicHeight2;
                    iM = zzkl.m(2.0f, i5, iDp8);
                } else if (i8 == i4) {
                    iDp2 = AndroidUtilities.dp(2.5f * f2);
                    iDp3 = AndroidUtilities.dp(f2 * 6.5f);
                    int iDp9 = AndroidUtilities.dp(this.progress[i6] * 6.0f);
                    iDp4 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - iDp9;
                    iDp5 = (intrinsicHeight / 2) + intrinsicHeight2;
                    iM = zzkl.m(7.0f, i5, iDp9);
                } else {
                    iDp2 = AndroidUtilities.dp(5.0f * f2);
                    iDp3 = AndroidUtilities.dp(f2 * 18.0f);
                    int iDp10 = AndroidUtilities.dp(this.progress[i6] * 15.0f);
                    iDp4 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - iDp10;
                    iDp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                    iM = zzkl.m(42.0f, i5, iDp10);
                }
                float f3 = this.progress[i6];
                int iM2 = (int) ((f3 < 0.5f ? f3 / 0.5f : ImageReceiver$$ExternalSyntheticOutline1.m(f3, 0.5f, 0.5f, 1.0f)) * 255.0f);
                this.drawableLeft.setAlpha(iM2);
                int i9 = iDp5 - iDp3;
                int i10 = iDp5 + iDp3;
                this.drawableLeft.setBounds(iDp4 - iDp2, i9, iDp4 + iDp2, i10);
                this.drawableLeft.draw(canvas);
                this.drawableRight.setAlpha(iM2);
                this.drawableRight.setBounds(iM - iDp2, i9, iM + iDp2, i10);
                this.drawableRight.draw(canvas);
            }
            i6++;
            i2 = 3;
            i3 = 5;
            i4 = 1;
        }
        update();
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
        return i == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(180.0f);
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
        return i == 1 ? AndroidUtilities.dp(40.0f) : AndroidUtilities.dp(120.0f);
    }

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setAlpha(int i) {
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
        this.drawableLeft.setColorFilter(colorFilter);
        this.drawableRight.setColorFilter(colorFilter);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;

public final class ShareLocationDrawable extends Drawable {
    public final int currentType;
    public final Drawable drawable;
    public final Drawable drawableLeft;
    public final Drawable drawableRight;
    public long lastUpdateTime = 0;
    public final float[] progress = {0.0f, -0.5f};

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

    @Override
    public final void draw(Canvas canvas) {
        int iDp;
        float[] fArr;
        int iDp2;
        int iDp3;
        int iDp4;
        int iDp5;
        int iM;
        int iDp6;
        int iM2;
        float f;
        float fM;
        Drawable drawable = this.drawable;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        int i = 3;
        int i2 = 5;
        int i3 = 1;
        int i4 = this.currentType;
        int i5 = 4;
        if (i4 == 4 || i4 == 5) {
            iDp = AndroidUtilities.dp(24.0f);
        } else if (i4 == 3) {
            iDp = AndroidUtilities.dp(44.0f);
        } else if (i4 == 2) {
            iDp = AndroidUtilities.dp(32.0f);
        } else {
            iDp = i4 == 1 ? AndroidUtilities.dp(30.0f) : AndroidUtilities.dp(120.0f);
        }
        int intrinsicHeight2 = ((getIntrinsicHeight() - iDp) / 2) + getBounds().top;
        int intrinsicWidth2 = ((getIntrinsicWidth() - iDp) / 2) + getBounds().left;
        int i6 = intrinsicWidth + intrinsicWidth2;
        drawable.setBounds(intrinsicWidth2, intrinsicHeight2, i6, intrinsicHeight2 + intrinsicHeight);
        drawable.draw(canvas);
        int i7 = 0;
        while (true) {
            fArr = this.progress;
            if (i7 >= 2) {
                break;
            }
            float f2 = fArr[i7];
            if (f2 >= 0.0f) {
                float f3 = (f2 * 0.5f) + 0.5f;
                if (i4 == i5 || i4 == i2) {
                    iDp2 = AndroidUtilities.dp(2.5f * f3);
                    iDp3 = AndroidUtilities.dp(f3 * 6.5f);
                    int iDp7 = AndroidUtilities.dp(fArr[i7] * 6.0f);
                    iDp4 = (AndroidUtilities.dp(3.0f) + intrinsicWidth2) - iDp7;
                    iDp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(2.0f);
                    iM = zzlb.m(i6, 3.0f, iDp7);
                } else {
                    if (i4 == i) {
                        iDp6 = AndroidUtilities.dp(5.0f * f3);
                        iDp3 = AndroidUtilities.dp(f3 * 18.0f);
                        int iDp8 = AndroidUtilities.dp(fArr[i7] * 15.0f);
                        iDp4 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - iDp8;
                        iDp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                        iM2 = zzlb.m(i6, 2.0f, iDp8);
                    } else if (i4 == 2) {
                        iDp6 = AndroidUtilities.dp(5.0f * f3);
                        iDp3 = AndroidUtilities.dp(f3 * 18.0f);
                        int iDp9 = AndroidUtilities.dp(fArr[i7] * 15.0f);
                        iDp4 = (AndroidUtilities.dp(2.0f) + intrinsicWidth2) - iDp9;
                        iDp5 = (intrinsicHeight / 2) + intrinsicHeight2;
                        iM2 = zzlb.m(i6, 2.0f, iDp9);
                    } else if (i4 == i3) {
                        iDp2 = AndroidUtilities.dp(2.5f * f3);
                        iDp3 = AndroidUtilities.dp(f3 * 6.5f);
                        int iDp10 = AndroidUtilities.dp(fArr[i7] * 6.0f);
                        iDp4 = (AndroidUtilities.dp(7.0f) + intrinsicWidth2) - iDp10;
                        iDp5 = (intrinsicHeight / 2) + intrinsicHeight2;
                        iM = zzlb.m(i6, 7.0f, iDp10);
                    } else {
                        iDp6 = AndroidUtilities.dp(5.0f * f3);
                        iDp3 = AndroidUtilities.dp(f3 * 18.0f);
                        int iDp11 = AndroidUtilities.dp(fArr[i7] * 15.0f);
                        iDp4 = (AndroidUtilities.dp(42.0f) + intrinsicWidth2) - iDp11;
                        iDp5 = ((intrinsicHeight / 2) + intrinsicHeight2) - AndroidUtilities.dp(7.0f);
                        iM2 = zzlb.m(i6, 42.0f, iDp11);
                    }
                    f = fArr[i7];
                    if (f < 0.5f) {
                        fM = f / 0.5f;
                    } else {
                        fM = ImageReceiver$$ExternalSyntheticOutline1.m(f, 0.5f, 0.5f, 1.0f);
                    }
                    int i8 = (int) (fM * 255.0f);
                    Drawable drawable2 = this.drawableLeft;
                    drawable2.setAlpha(i8);
                    int i9 = iDp5 - iDp3;
                    int i10 = iDp5 + iDp3;
                    drawable2.setBounds(iDp4 - iDp6, i9, iDp4 + iDp6, i10);
                    drawable2.draw(canvas);
                    Drawable drawable3 = this.drawableRight;
                    drawable3.setAlpha(i8);
                    drawable3.setBounds(iM2 - iDp6, i9, iM2 + iDp6, i10);
                    drawable3.draw(canvas);
                }
                iDp6 = iDp2;
                iM2 = iM;
                f = fArr[i7];
                if (f < 0.5f) {
                    fM = f / 0.5f;
                } else {
                    fM = ImageReceiver$$ExternalSyntheticOutline1.m(f, 0.5f, 0.5f, 1.0f);
                }
                int i11 = (int) (fM * 255.0f);
                Drawable drawable4 = this.drawableLeft;
                drawable4.setAlpha(i11);
                int i12 = iDp5 - iDp3;
                int i13 = iDp5 + iDp3;
                drawable4.setBounds(iDp4 - iDp6, i12, iDp4 + iDp6, i13);
                drawable4.draw(canvas);
                Drawable drawable5 = this.drawableRight;
                drawable5.setAlpha(i11);
                drawable5.setBounds(iM2 - iDp6, i12, iM2 + iDp6, i13);
                drawable5.draw(canvas);
            }
            i7++;
            i = 3;
            i2 = 5;
            i3 = 1;
            i5 = 4;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = jCurrentTimeMillis;
        if (j > 16) {
            j = 16;
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (fArr[i14] >= 1.0f) {
                fArr[i14] = 0.0f;
            }
            float f4 = (j / 1300.0f) + fArr[i14];
            fArr[i14] = f4;
            if (f4 > 1.0f) {
                fArr[i14] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public final int getIntrinsicHeight() {
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
    public final int getIntrinsicWidth() {
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
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
        this.drawableLeft.setColorFilter(colorFilter);
        this.drawableRight.setColorFilter(colorFilter);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
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
        } else if (i == 3) {
            this.drawable = context.getResources().getDrawable(R.drawable.nearby_l).mutate();
            this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.drawableRight = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
        } else if (i == 2) {
            this.drawable = context.getResources().getDrawable(R.drawable.nearby_m).mutate();
            this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
            this.drawableRight = context.getResources().getDrawable(R.drawable.animationpinright).mutate();
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
            float f = fArr[i] + (((float) j) / 1300.0f);
            fArr[i] = f;
            if (f > 1.0f) {
                fArr[i] = 1.0f;
            }
        }
        invalidateSelf();
    }

    @Override
    public void draw(android.graphics.Canvas r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareLocationDrawable.draw(android.graphics.Canvas):void");
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

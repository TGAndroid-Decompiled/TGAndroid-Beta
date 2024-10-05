package org.telegram.ui.Components;

import android.content.Context;
import android.content.res.Resources;
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

    public ShareLocationDrawable(Context context, int i) {
        Resources resources;
        int i2;
        Resources resources2;
        int i3;
        this.currentType = i;
        if (i == 4) {
            resources2 = context.getResources();
            i3 = R.drawable.filled_extend_location;
        } else if (i == 5) {
            resources2 = context.getResources();
            i3 = R.drawable.filled_stop_location;
        } else {
            if (i != 1) {
                this.drawable = context.getResources().getDrawable(R.drawable.animationpin).mutate();
                this.drawableLeft = context.getResources().getDrawable(R.drawable.animationpinleft).mutate();
                resources = context.getResources();
                i2 = R.drawable.animationpinright;
                this.drawableRight = resources.getDrawable(i2).mutate();
            }
            resources2 = context.getResources();
            i3 = R.drawable.smallanimationpin;
        }
        this.drawable = resources2.getDrawable(i3).mutate();
        this.drawableLeft = context.getResources().getDrawable(R.drawable.smallanimationpinleft).mutate();
        resources = context.getResources();
        i2 = R.drawable.smallanimationpinright;
        this.drawableRight = resources.getDrawable(i2).mutate();
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
    public int getIntrinsicHeight() {
        int i = this.currentType;
        return AndroidUtilities.dp((i == 4 || i == 5) ? 42.0f : i == 3 ? 100.0f : i == 2 ? 74.0f : i == 1 ? 40.0f : 180.0f);
    }

    @Override
    public int getIntrinsicWidth() {
        int i = this.currentType;
        return AndroidUtilities.dp((i == 4 || i == 5) ? 42.0f : i == 3 ? 100.0f : i == 2 ? 74.0f : i == 1 ? 40.0f : 120.0f);
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

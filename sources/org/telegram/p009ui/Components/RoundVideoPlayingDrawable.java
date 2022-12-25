package org.telegram.p009ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class RoundVideoPlayingDrawable extends Drawable {
    public float colorProgress;
    private View parentView;
    private final Theme.ResourcesProvider resourcesProvider;
    public int timeColor;
    private long lastUpdateTime = 0;
    private boolean started = false;
    private Paint paint = new Paint(1);
    private float progress1 = 0.47f;
    private float progress2 = 0.0f;
    private float progress3 = 0.32f;
    private int progress1Direction = 1;
    private int progress2Direction = 1;
    private int progress3Direction = 1;
    int alpha = 255;

    @Override
    public int getOpacity() {
        return -2;
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public RoundVideoPlayingDrawable(View view, Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
        this.parentView = view;
    }

    private void update() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - this.lastUpdateTime;
        this.lastUpdateTime = currentTimeMillis;
        if (j > 50) {
            j = 50;
        }
        float f = (float) j;
        float f2 = this.progress1 + ((f / 300.0f) * this.progress1Direction);
        this.progress1 = f2;
        if (f2 > 1.0f) {
            this.progress1Direction = -1;
            this.progress1 = 1.0f;
        } else if (f2 < 0.0f) {
            this.progress1Direction = 1;
            this.progress1 = 0.0f;
        }
        float f3 = this.progress2 + ((f / 310.0f) * this.progress2Direction);
        this.progress2 = f3;
        if (f3 > 1.0f) {
            this.progress2Direction = -1;
            this.progress2 = 1.0f;
        } else if (f3 < 0.0f) {
            this.progress2Direction = 1;
            this.progress2 = 0.0f;
        }
        float f4 = this.progress3 + ((f / 320.0f) * this.progress3Direction);
        this.progress3 = f4;
        if (f4 > 1.0f) {
            this.progress3Direction = -1;
            this.progress3 = 1.0f;
        } else if (f4 < 0.0f) {
            this.progress3Direction = 1;
            this.progress3 = 0.0f;
        }
        this.parentView.invalidate();
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.lastUpdateTime = System.currentTimeMillis();
        this.started = true;
        this.parentView.invalidate();
    }

    public void stop() {
        if (this.started) {
            this.started = false;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        this.paint.setColor(ColorUtils.blendARGB(getThemedColor("chat_serviceText"), this.timeColor, this.colorProgress));
        int i = this.alpha;
        if (i != 255) {
            Paint paint = this.paint;
            paint.setAlpha((int) (i * (paint.getAlpha() / 255.0f)));
        }
        int i2 = getBounds().left;
        int i3 = getBounds().top;
        for (int i4 = 0; i4 < 3; i4++) {
            canvas.drawRect(AndroidUtilities.m35dp(2.0f) + i2, AndroidUtilities.m35dp((this.progress1 * 7.0f) + 2.0f) + i3, AndroidUtilities.m35dp(4.0f) + i2, AndroidUtilities.m35dp(10.0f) + i3, this.paint);
            canvas.drawRect(AndroidUtilities.m35dp(5.0f) + i2, AndroidUtilities.m35dp((this.progress2 * 7.0f) + 2.0f) + i3, AndroidUtilities.m35dp(7.0f) + i2, AndroidUtilities.m35dp(10.0f) + i3, this.paint);
            canvas.drawRect(AndroidUtilities.m35dp(8.0f) + i2, AndroidUtilities.m35dp((this.progress3 * 7.0f) + 2.0f) + i3, AndroidUtilities.m35dp(10.0f) + i2, AndroidUtilities.m35dp(10.0f) + i3, this.paint);
        }
        if (this.started) {
            update();
        }
    }

    @Override
    public void setAlpha(int i) {
        this.alpha = i;
    }

    @Override
    public int getIntrinsicWidth() {
        return AndroidUtilities.m35dp(12.0f);
    }

    @Override
    public int getIntrinsicHeight() {
        return AndroidUtilities.m35dp(12.0f);
    }

    private int getThemedColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer color = resourcesProvider != null ? resourcesProvider.getColor(str) : null;
        return color != null ? color.intValue() : Theme.getColor(str);
    }
}

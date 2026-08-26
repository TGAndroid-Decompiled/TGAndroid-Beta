package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline1;
import org.telegram.ui.ActionBar.Theme;

public class LoadingSpan extends ReplacementSpan {
    public float alpha;
    private LoadingDrawable drawable;
    public boolean fullWidth;
    public float height;
    private float scaleY;
    public int size;
    private View view;
    public int yOffset;

    public LoadingSpan(View view, int i) {
        this(view, i, AndroidUtilities.dp(2.0f));
    }

    @Override
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        View view;
        int measuredWidth = this.size;
        if (this.fullWidth && (view = this.view) != null && view.getMeasuredWidth() > 0) {
            measuredWidth = ((this.view.getMeasuredWidth() - this.view.getPaddingLeft()) - this.view.getPaddingRight()) - this.size;
        }
        float f2 = this.height;
        if (f2 > 0.0f) {
            float f3 = (i3 + i5) / 2.0f;
            int i6 = (int) f;
            float f4 = f2 / 2.0f;
            this.drawable.setBounds(i6, (int) (f3 - f4), measuredWidth + i6, (int) (f4 + f3));
        } else {
            int i7 = (int) f;
            this.drawable.setBounds(i7, (int) (DiffUtil.m(1.0f, this.scaleY, RichMessageLayout$$ExternalSyntheticOutline1.m(2.0f, i5, i3) / 2.0f, i3) + this.yOffset), measuredWidth + i7, (int) (BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.scaleY, RichMessageLayout$$ExternalSyntheticOutline1.m(2.0f, i5, i3) / 2.0f, i5 - AndroidUtilities.dp(2.0f)) + this.yOffset));
        }
        this.drawable.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.alpha));
        this.drawable.draw(canvas);
        View view2 = this.view;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        View view;
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = (int) fontMetrics.ascent;
            fontMetricsInt.bottom = (int) fontMetrics.bottom;
            fontMetricsInt.descent = (int) fontMetrics.descent;
            fontMetricsInt.leading = (int) fontMetrics.leading;
            fontMetricsInt.top = (int) fontMetrics.top;
        }
        LoadingDrawable loadingDrawable = this.drawable;
        if (loadingDrawable.color1 == null && loadingDrawable.color2 == null) {
            loadingDrawable.setColors(Theme.multAlpha(0.1f, paint.getColor()), Theme.multAlpha(0.25f, paint.getColor()));
        }
        return (!this.fullWidth || (view = this.view) == null || view.getMeasuredWidth() <= 0) ? this.size : ((this.view.getMeasuredWidth() - this.view.getPaddingLeft()) - this.view.getPaddingRight()) - this.size;
    }

    public LoadingSpan setAlpha(float f) {
        this.alpha = f;
        return this;
    }

    public void setColorKeys(int i, int i2) {
        LoadingDrawable loadingDrawable = this.drawable;
        loadingDrawable.colorKey1 = i;
        loadingDrawable.colorKey2 = i2;
    }

    public void setColors(int i, int i2) {
        this.drawable.color1 = Integer.valueOf(i);
        this.drawable.color2 = Integer.valueOf(i2);
    }

    public LoadingSpan setFullWidth(boolean z) {
        this.fullWidth = z;
        return this;
    }

    public LoadingSpan setHeight(float f) {
        this.height = f;
        return this;
    }

    public void setScaleY(float f) {
        this.scaleY = f;
    }

    public void setView(View view) {
        this.view = view;
    }

    public LoadingSpan(View view, int i, int i2) {
        this(view, i, i2, null);
    }

    public LoadingSpan(View view, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        this.scaleY = 1.0f;
        this.height = -1.0f;
        this.alpha = 1.0f;
        this.fullWidth = false;
        this.view = view;
        this.size = i;
        this.yOffset = i2;
        LoadingDrawable loadingDrawable = new LoadingDrawable(resourcesProvider);
        this.drawable = loadingDrawable;
        loadingDrawable.setRadiiDp(4.0f);
    }

    public void setColorKeys(int i, int i2, Theme.ResourcesProvider resourcesProvider) {
        LoadingDrawable loadingDrawable = this.drawable;
        loadingDrawable.resourcesProvider = resourcesProvider;
        loadingDrawable.colorKey1 = i;
        loadingDrawable.colorKey2 = i2;
    }
}

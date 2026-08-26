package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import android.view.View;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.ui.ActionBar.Theme;

public final class LoadingSpan extends ReplacementSpan {
    public float alpha;
    public final LoadingDrawable drawable;
    public boolean fullWidth;
    public float height;
    public float scaleY;
    public final int size;
    public View view;
    public final int yOffset;

    public LoadingSpan(int i, View view) {
        this(i, AndroidUtilities.dp(2.0f), view, null);
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        View view;
        boolean z = this.fullWidth;
        int measuredWidth = this.size;
        if (z && (view = this.view) != null && view.getMeasuredWidth() > 0) {
            measuredWidth = ((this.view.getMeasuredWidth() - this.view.getPaddingLeft()) - this.view.getPaddingRight()) - measuredWidth;
        }
        float f2 = this.height;
        LoadingDrawable loadingDrawable = this.drawable;
        if (f2 > 0.0f) {
            float f3 = (i3 + i5) / 2.0f;
            int i6 = (int) f;
            float f4 = f2 / 2.0f;
            loadingDrawable.setBounds(i6, (int) (f3 - f4), measuredWidth + i6, (int) (f4 + f3));
        } else {
            int i7 = (int) f;
            float fM = DiffUtil.m(1.0f, this.scaleY, RichMessageLayout$$ExternalSyntheticOutline2.m(i5, 2.0f, i3) / 2.0f, i3);
            float f5 = this.yOffset;
            loadingDrawable.setBounds(i7, (int) (fM + f5), measuredWidth + i7, (int) (BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.scaleY, RichMessageLayout$$ExternalSyntheticOutline2.m(i5, 2.0f, i3) / 2.0f, i5 - AndroidUtilities.dp(2.0f)) + f5));
        }
        loadingDrawable.setAlpha((int) ((paint == null ? 255 : paint.getAlpha()) * this.alpha));
        loadingDrawable.draw(canvas);
        View view2 = this.view;
        if (view2 != null) {
            view2.invalidate();
        }
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
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
        boolean z = this.fullWidth;
        int i3 = this.size;
        return (!z || (view = this.view) == null || view.getMeasuredWidth() <= 0) ? i3 : ((this.view.getMeasuredWidth() - this.view.getPaddingLeft()) - this.view.getPaddingRight()) - i3;
    }

    public final void setColors(int i, int i2) {
        Integer numValueOf = Integer.valueOf(i);
        LoadingDrawable loadingDrawable = this.drawable;
        loadingDrawable.color1 = numValueOf;
        loadingDrawable.color2 = Integer.valueOf(i2);
    }

    public LoadingSpan(int i, int i2, View view, Theme.ResourcesProvider resourcesProvider) {
        this.scaleY = 1.0f;
        this.height = -1.0f;
        this.alpha = 1.0f;
        this.fullWidth = false;
        this.view = view;
        this.size = i;
        this.yOffset = i2;
        LoadingDrawable loadingDrawable = new LoadingDrawable();
        loadingDrawable.resourcesProvider = resourcesProvider;
        this.drawable = loadingDrawable;
        loadingDrawable.setRadii(AndroidUtilities.dp(4.0f));
    }
}

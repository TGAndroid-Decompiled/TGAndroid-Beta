package org.telegram.ui.Components.Reactions;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public final class AddReactionsSpan extends ReplacementSpan {
    public int alpha;
    public float height;
    public StaticLayout layout;
    public final RectF rectF;
    public final TextPaint textPaint;
    public float width;

    public AddReactionsSpan(Theme.ResourcesProvider resourcesProvider) {
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.rectF = new RectF();
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText5, resourcesProvider));
    }

    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        makeLayout();
        RectF rectF = this.rectF;
        rectF.set(canvas.getClipBounds());
        canvas.saveLayerAlpha(rectF, this.alpha, 31);
        canvas.translate(f + AndroidUtilities.dp(4.0f), (((i5 - i3) / 2.0f) + i3) - (this.height / 2.0f));
        this.layout.draw(canvas);
        canvas.restore();
    }

    @Override
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        makeLayout();
        return (int) (AndroidUtilities.dp(8.0f) + this.width);
    }

    public final void makeLayout() {
        if (this.layout == null) {
            StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.ReactionAddReactionsHint), this.textPaint, AndroidUtilities.displaySize.x, LocaleController.isRTL ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.layout = staticLayout;
            this.width = staticLayout.getLineWidth(0);
            this.height = this.layout.getHeight();
        }
    }
}

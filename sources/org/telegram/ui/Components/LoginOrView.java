package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;

public final class LoginOrView extends View {
    public final Paint linePaint;
    public View measureAfter;
    public final String string;
    public final Rect textBounds;
    public final TextPaint textPaint;

    public LoginOrView(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.linePaint = new Paint(1);
        this.textBounds = new Rect();
        this.string = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.measureAfter;
        Rect rect = this.textBounds;
        float width = view != null ? ((((getWidth() - rect.width()) - AndroidUtilities.dp(8.0f)) - this.measureAfter.getPaddingLeft()) - this.measureAfter.getPaddingRight()) / 2.0f : AndroidUtilities.dp(64.0f);
        float width2 = (((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - width;
        float height = getHeight() / 2.0f;
        float width3 = ((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f);
        float height2 = getHeight() / 2.0f;
        Paint paint = this.linePaint;
        canvas.drawLine(width2, height, width3, height2, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + width, getHeight() / 2.0f, paint);
        canvas.drawText(this.string, (getWidth() - rect.width()) / 2.0f, (rect.height() + getHeight()) / 2.0f, this.textPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        View view = this.measureAfter;
        if (view != null) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i, i2);
        TextPaint textPaint = this.textPaint;
        String str = this.string;
        textPaint.getTextBounds(str, 0, str.length(), this.textBounds);
    }

    public void setMeasureAfter(View view) {
        this.measureAfter = view;
    }

    public final void updateColors() {
        this.textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        this.linePaint.setColor(Theme.getColor(null, Theme.key_sheet_scrollUp, false));
        invalidate();
    }
}

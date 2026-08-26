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

public class LoginOrView extends View {
    private static final int LINE_SIZE_DP = 64;
    private Paint linePaint;
    private View measureAfter;
    private String string;
    private Rect textBounds;
    private TextPaint textPaint;

    public LoginOrView(Context context) {
        super(context);
        this.textPaint = new TextPaint(1);
        this.linePaint = new Paint(1);
        this.textBounds = new Rect();
        this.string = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        this.textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        updateColors();
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = this.measureAfter != null ? ((((getWidth() - this.textBounds.width()) - AndroidUtilities.dp(8.0f)) - this.measureAfter.getPaddingLeft()) - this.measureAfter.getPaddingRight()) / 2.0f : AndroidUtilities.dp(64.0f);
        canvas.drawLine((((getWidth() - this.textBounds.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - width, getHeight() / 2.0f, ((getWidth() - this.textBounds.width()) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, this.linePaint);
        canvas.drawLine(((this.textBounds.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((this.textBounds.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + width, getHeight() / 2.0f, this.linePaint);
        canvas.drawText(this.string, (getWidth() - this.textBounds.width()) / 2.0f, (this.textBounds.height() + getHeight()) / 2.0f, this.textPaint);
    }

    @Override
    public void onMeasure(int i, int i2) {
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

    public void updateColors() {
        this.textPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        this.linePaint.setColor(Theme.getColor(null, Theme.key_sheet_scrollUp, false));
        invalidate();
    }
}

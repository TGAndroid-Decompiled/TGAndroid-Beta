package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;

public class LoginOrView extends View {
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
        this.string = LocaleController.getString(C1072R.string.LoginOrSingInWithGoogle);
        this.textPaint.setTextSize(AndroidUtilities.m36dp(14.0f));
        updateColors();
    }

    public void setMeasureAfter(View view) {
        this.measureAfter = view;
    }

    public void updateColors() {
        this.textPaint.setColor(Theme.getColor("windowBackgroundWhiteGrayText"));
        this.linePaint.setColor(Theme.getColor("key_sheet_scrollUp"));
        invalidate();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        View view = this.measureAfter;
        if (view != null) {
            i = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i, i2);
        TextPaint textPaint = this.textPaint;
        String str = this.string;
        textPaint.getTextBounds(str, 0, str.length(), this.textBounds);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = this.measureAfter != null ? ((((getWidth() - this.textBounds.width()) - AndroidUtilities.m36dp(8.0f)) - this.measureAfter.getPaddingLeft()) - this.measureAfter.getPaddingRight()) / 2.0f : AndroidUtilities.m36dp(48.0f);
        canvas.drawLine((((getWidth() - this.textBounds.width()) / 2.0f) - AndroidUtilities.m36dp(8.0f)) - width, getHeight() / 2.0f, ((getWidth() - this.textBounds.width()) / 2.0f) - AndroidUtilities.m36dp(8.0f), getHeight() / 2.0f, this.linePaint);
        canvas.drawLine(((getWidth() + this.textBounds.width()) / 2.0f) + AndroidUtilities.m36dp(8.0f), getHeight() / 2.0f, ((getWidth() + this.textBounds.width()) / 2.0f) + AndroidUtilities.m36dp(8.0f) + width, getHeight() / 2.0f, this.linePaint);
        canvas.drawText(this.string, (getWidth() - this.textBounds.width()) / 2.0f, (getHeight() + this.textBounds.height()) / 2.0f, this.textPaint);
    }
}

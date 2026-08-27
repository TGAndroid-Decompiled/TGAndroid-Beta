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

public final class w80 extends View {

    public final TextPaint f34140a;

    public final Paint f34141b;

    public final String f34142c;
    public final Rect d;

    public View f34143e;

    public w80(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f34140a = textPaint;
        this.f34141b = new Paint(1);
        this.d = new Rect();
        this.f34142c = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        a();
    }

    public final void a() {
        this.f34140a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23423y6, false));
        this.f34141b.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        View view = this.f34143e;
        Rect rect = this.d;
        float width = view != null ? ((((getWidth() - rect.width()) - AndroidUtilities.dp(8.0f)) - this.f34143e.getPaddingLeft()) - this.f34143e.getPaddingRight()) / 2.0f : AndroidUtilities.dp(64.0f);
        float width2 = (((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - width;
        float height = getHeight() / 2.0f;
        float width3 = ((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f);
        float height2 = getHeight() / 2.0f;
        Paint paint = this.f34141b;
        canvas.drawLine(width2, height, width3, height2, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + width, getHeight() / 2.0f, paint);
        canvas.drawText(this.f34142c, (getWidth() - rect.width()) / 2.0f, (rect.height() + getHeight()) / 2.0f, this.f34140a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.f34143e;
        if (view != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i10, i11);
        String str = this.f34142c;
        this.f34140a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f34143e = view;
    }
}

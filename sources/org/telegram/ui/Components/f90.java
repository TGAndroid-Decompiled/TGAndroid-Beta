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
public final class f90 extends View {
    public final TextPaint f28360a;
    public final Paint f28361b;
    public final String f28362c;
    public final Rect d;
    public View f28363e;

    public f90(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f28360a = textPaint;
        this.f28361b = new Paint(1);
        this.d = new Rect();
        this.f28362c = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        a();
    }

    public final void a() {
        this.f28360a.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23433y6, false));
        this.f28361b.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Ii, false));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        super.onDraw(canvas);
        View view = this.f28363e;
        Rect rect = this.d;
        if (view != null) {
            dp = ((((getWidth() - rect.width()) - AndroidUtilities.dp(8.0f)) - this.f28363e.getPaddingLeft()) - this.f28363e.getPaddingRight()) / 2.0f;
        } else {
            dp = AndroidUtilities.dp(64.0f);
        }
        Paint paint = this.f28361b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - dp, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + dp, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f28362c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f28360a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.f28363e;
        if (view != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i10, i11);
        String str = this.f28362c;
        this.f28360a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f28363e = view;
    }
}

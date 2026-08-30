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
public final class l90 extends View {
    public final TextPaint f26604a;
    public final Paint f26605b;
    public final String f26606c;
    public final Rect d;
    public View e;

    public l90(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f26604a = textPaint;
        this.f26605b = new Paint(1);
        this.d = new Rect();
        this.f26606c = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        a();
    }

    public final void a() {
        this.f26604a.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20281y6, false));
        this.f26605b.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Ii, false));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        super.onDraw(canvas);
        View view = this.e;
        Rect rect = this.d;
        if (view != null) {
            dp = ((((getWidth() - rect.width()) - AndroidUtilities.dp(8.0f)) - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / 2.0f;
        } else {
            dp = AndroidUtilities.dp(64.0f);
        }
        Paint paint = this.f26605b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - dp, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + dp, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f26606c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f26604a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.e;
        if (view != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i10, i11);
        String str = this.f26606c;
        this.f26604a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.e = view;
    }
}

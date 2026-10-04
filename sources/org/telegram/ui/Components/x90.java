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
public final class x90 extends View {
    public final TextPaint f32751a;
    public final Paint f32752b;
    public final String f32753c;
    public final Rect d;
    public View f32754e;

    public x90(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f32751a = textPaint;
        this.f32752b = new Paint(1);
        this.d = new Rect();
        this.f32753c = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        a();
    }

    public final void a() {
        this.f32751a.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21209y6, false));
        this.f32752b.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Ii, false));
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        super.onDraw(canvas);
        View view = this.f32754e;
        Rect rect = this.d;
        if (view != null) {
            dp = ((((getWidth() - rect.width()) - AndroidUtilities.dp(8.0f)) - this.f32754e.getPaddingLeft()) - this.f32754e.getPaddingRight()) / 2.0f;
        } else {
            dp = AndroidUtilities.dp(64.0f);
        }
        Paint paint = this.f32752b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - dp, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + dp, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f32753c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f32751a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.f32754e;
        if (view != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i10, i11);
        String str = this.f32753c;
        this.f32751a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f32754e = view;
    }
}

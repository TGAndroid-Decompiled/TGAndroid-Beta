package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ga0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final TextPaint f28511a;
    public final Paint f28512b;
    public final String f28513c;
    public final Rect d;
    public View e;

    public ga0(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f28511a = textPaint;
        this.f28512b = new Paint(1);
        this.d = new Rect();
        this.f28513c = LocaleController.getString(R.string.LoginOrSingInWithGoogle);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        updateColors();
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
        Paint paint = this.f28512b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f)) - dp, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + AndroidUtilities.dp(8.0f) + dp, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f28513c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f28511a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.e;
        if (view != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i10, i11);
        String str = this.f28513c;
        this.f28511a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.e = view;
    }

    @Override
    public final void updateColors() {
        this.f28511a.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false));
        this.f28512b.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ii, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

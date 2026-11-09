package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class e80 extends View implements org.telegram.ui.ActionBar.b6 {
    public final TextPaint f33336a;
    public final Paint f33337b;
    public final String f33338c;
    public final Rect d;
    public View f33339e;

    public e80(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f33336a = textPaint;
        this.f33337b = new Paint(1);
        this.d = new Rect();
        this.f33338c = org.telegram.messenger.id.M0(2131748727, null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.f33339e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - org.telegram.messenger.g0.L(8.0f)) - this.f33339e.getPaddingLeft()) - this.f33339e.getPaddingRight()) / 2.0f;
        } else {
            L = org.telegram.messenger.g0.L(64.0f);
        }
        Paint paint = this.f33337b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + L, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f33338c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f33336a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = this.f33339e;
        if (view != null) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i7, i10);
        String str = this.f33338c;
        this.f33336a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f33339e = view;
    }

    @Override
    public final void updateColors() {
        this.f33336a.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f28257y6, false));
        this.f33337b.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.wj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

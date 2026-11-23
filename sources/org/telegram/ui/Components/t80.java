package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class t80 extends View implements org.telegram.ui.ActionBar.b6 {
    public final TextPaint f39802a;
    public final Paint f39803b;
    public final String f39804c;
    public final Rect d;
    public View f39805e;

    public t80(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f39802a = textPaint;
        this.f39803b = new Paint(1);
        this.d = new Rect();
        this.f39804c = org.telegram.messenger.hd.N0(2131748534, null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.f39805e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - org.telegram.messenger.g0.L(8.0f)) - this.f39805e.getPaddingLeft()) - this.f39805e.getPaddingRight()) / 2.0f;
        } else {
            L = org.telegram.messenger.g0.L(64.0f);
        }
        Paint paint = this.f39803b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + L, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f39804c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f39802a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = this.f39805e;
        if (view != null) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i7, i10);
        String str = this.f39804c;
        this.f39802a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f39805e = view;
    }

    @Override
    public final void updateColors() {
        this.f39802a.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29773y6, false));
        this.f39803b.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.zj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

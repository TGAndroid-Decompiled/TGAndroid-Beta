package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class z70 extends View implements org.telegram.ui.ActionBar.z5 {
    public final TextPaint f40980a;
    public final Paint f40981b;
    public final String f40982c;
    public final Rect d;
    public View f40983e;

    public z70(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f40980a = textPaint;
        this.f40981b = new Paint(1);
        this.d = new Rect();
        this.f40982c = org.telegram.messenger.bd.M0(2131748735, null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.f40983e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - org.telegram.messenger.g0.L(8.0f)) - this.f40983e.getPaddingLeft()) - this.f40983e.getPaddingRight()) / 2.0f;
        } else {
            L = org.telegram.messenger.g0.L(64.0f);
        }
        Paint paint = this.f40981b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + L, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f40982c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f40980a);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        View view = this.f40983e;
        if (view != null) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i3, i10);
        String str = this.f40982c;
        this.f40980a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f40983e = view;
    }

    @Override
    public final void updateColors() {
        this.f40980a.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28273y6, false));
        this.f40981b.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.wj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

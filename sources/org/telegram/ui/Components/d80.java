package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class d80 extends View implements org.telegram.ui.ActionBar.c6 {
    public final TextPaint f32921a;
    public final Paint f32922b;
    public final String f32923c;
    public final Rect d;
    public View f32924e;

    public d80(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f32921a = textPaint;
        this.f32922b = new Paint(1);
        this.d = new Rect();
        this.f32923c = org.telegram.messenger.id.M0(2131748727, null);
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.f32924e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - org.telegram.messenger.g0.L(8.0f)) - this.f32924e.getPaddingLeft()) - this.f32924e.getPaddingRight()) / 2.0f;
        } else {
            L = org.telegram.messenger.g0.L(64.0f);
        }
        Paint paint = this.f32922b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.g0.L(8.0f) + L, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f32923c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f32921a);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        View view = this.f32924e;
        if (view != null) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i7, i10);
        String str = this.f32923c;
        this.f32921a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.f32924e = view;
    }

    @Override
    public final void updateColors() {
        this.f32921a.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28282y6, false));
        this.f32922b.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.wj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

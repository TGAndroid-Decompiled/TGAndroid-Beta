package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import java.util.HashSet;
public final class w80 extends View implements org.telegram.ui.ActionBar.k6 {
    public final TextPaint f32105a;
    public final Paint f32106b;
    public final String f32107c;
    public final Rect d;
    public View e;

    public w80(Context context) {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.f32105a = textPaint;
        this.f32106b = new Paint(1);
        this.d = new Rect();
        this.f32107c = org.telegram.messenger.cd.L0(2131748738, null);
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        updateColors();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        super.onDraw(canvas);
        View view = this.e;
        Rect rect = this.d;
        if (view != null) {
            L = ((((getWidth() - rect.width()) - org.telegram.messenger.i0.L(8.0f)) - this.e.getPaddingLeft()) - this.e.getPaddingRight()) / 2.0f;
        } else {
            L = org.telegram.messenger.i0.L(64.0f);
        }
        Paint paint = this.f32106b;
        canvas.drawLine((((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.i0.L(8.0f)) - L, getHeight() / 2.0f, ((getWidth() - rect.width()) / 2.0f) - org.telegram.messenger.i0.L(8.0f), getHeight() / 2.0f, paint);
        canvas.drawLine(((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.i0.L(8.0f), getHeight() / 2.0f, ((rect.width() + getWidth()) / 2.0f) + org.telegram.messenger.i0.L(8.0f) + L, getHeight() / 2.0f, paint);
        int height = getHeight();
        canvas.drawText(this.f32107c, (getWidth() - rect.width()) / 2.0f, (rect.height() + height) / 2.0f, this.f32105a);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        View view = this.e;
        if (view != null) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(view.getMeasuredWidth()), 1073741824);
        }
        super.onMeasure(i10, i11);
        String str = this.f32107c;
        this.f32105a.getTextBounds(str, 0, str.length(), this.d);
    }

    public void setMeasureAfter(View view) {
        this.e = view;
    }

    @Override
    public final void updateColors() {
        this.f32105a.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21311y6, false));
        this.f32106b.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.wj, false));
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

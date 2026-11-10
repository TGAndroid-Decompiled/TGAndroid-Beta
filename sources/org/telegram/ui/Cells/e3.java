package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class e3 extends View {
    public boolean f29066a;
    public final Paint f29067b;
    public final org.telegram.ui.ActionBar.h6 f29068c;

    public e3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f29067b = new Paint();
        this.f29068c = h6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.f29066a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f29068c;
        Paint paint = this.f29067b;
        if (z9) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27991ih, h6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27891d7, h6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z9) {
        this.f29066a = z9;
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class e3 extends View {
    public boolean f29048a;
    public final Paint f29049b;
    public final org.telegram.ui.ActionBar.f6 f29050c;

    public e3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29049b = new Paint();
        this.f29050c = f6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.f29048a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f29050c;
        Paint paint = this.f29049b;
        if (z9) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27950ih, f6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27850d7, f6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z9) {
        this.f29048a = z9;
    }
}

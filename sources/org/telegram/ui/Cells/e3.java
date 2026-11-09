package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class e3 extends View {
    public boolean f29055a;
    public final Paint f29056b;
    public final org.telegram.ui.ActionBar.g6 f29057c;

    public e3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29056b = new Paint();
        this.f29057c = g6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z9 = this.f29055a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f29057c;
        Paint paint = this.f29056b;
        if (z9) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27966ih, g6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27866d7, g6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z9) {
        this.f29055a = z9;
    }
}

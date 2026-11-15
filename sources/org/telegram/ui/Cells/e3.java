package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class e3 extends View {
    public boolean f30165a;
    public final Paint f30166b;
    public final org.telegram.ui.ActionBar.e6 f30167c;

    public e3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30166b = new Paint();
        this.f30167c = e6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f30165a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f30167c;
        Paint paint = this.f30166b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29006lh, e6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28850d7, e6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f30165a = z10;
    }
}

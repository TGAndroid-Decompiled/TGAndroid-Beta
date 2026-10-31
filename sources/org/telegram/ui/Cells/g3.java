package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class g3 extends View {
    public boolean f21910a;
    public final Paint f21911b;
    public final org.telegram.ui.ActionBar.p6 f21912c;

    public g3(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f21911b = new Paint();
        this.f21912c = p6Var;
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f21910a;
        org.telegram.ui.ActionBar.p6 p6Var = this.f21912c;
        Paint paint = this.f21911b;
        if (z10) {
            paint.setColor(i0.b.f(0.2f, -16777216, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21029ih, p6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f20930d7, p6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f21910a = z10;
    }
}

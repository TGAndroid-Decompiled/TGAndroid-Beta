package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d3 extends View {
    public boolean f21062a;
    public final Paint f21063b;
    public final org.telegram.ui.ActionBar.c6 f21064c;

    public d3(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21063b = new Paint();
        this.f21064c = c6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f21062a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f21064c;
        Paint paint = this.f21063b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20225ug, c6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19902d7, c6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f21062a = z10;
    }
}

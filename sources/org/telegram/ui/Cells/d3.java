package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d3 extends View {
    public boolean f21968a;
    public final Paint f21969b;
    public final org.telegram.ui.ActionBar.e6 f21970c;

    public d3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f21969b = new Paint();
        this.f21970c = e6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f21968a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f21970c;
        Paint paint = this.f21969b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21124ug, e6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20802d7, e6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f21968a = z10;
    }
}

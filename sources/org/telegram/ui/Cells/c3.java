package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f21676a;
    public final Paint f21677b;
    public final org.telegram.ui.ActionBar.f6 f21678c;

    public c3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21677b = new Paint();
        this.f21678c = f6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f21676a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21678c;
        Paint paint = this.f21677b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20983ug, f6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20665d7, f6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f21676a = z10;
    }
}

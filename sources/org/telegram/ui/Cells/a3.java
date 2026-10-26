package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends View {
    public boolean f23844a;
    public final Paint f23845b;
    public final org.telegram.ui.ActionBar.u6 f23846c;

    public a3(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f23845b = new Paint();
        this.f23846c = u6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f23844a;
        org.telegram.ui.ActionBar.u6 u6Var = this.f23846c;
        Paint paint = this.f23845b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23683ug, u6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d7, u6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f23844a = z10;
    }
}

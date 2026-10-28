package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class a3 extends View {
    public boolean f23845a;
    public final Paint f23846b;
    public final org.telegram.ui.ActionBar.u6 f23847c;

    public a3(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f23846b = new Paint();
        this.f23847c = u6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f23845a;
        org.telegram.ui.ActionBar.u6 u6Var = this.f23847c;
        Paint paint = this.f23846b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23684ug, u6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23358d7, u6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f23845a = z10;
    }
}

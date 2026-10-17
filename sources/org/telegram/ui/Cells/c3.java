package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f22083a;
    public final Paint f22084b;
    public final org.telegram.ui.ActionBar.d6 f22085c;

    public c3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f22084b = new Paint();
        this.f22085c = d6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f22083a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f22085c;
        Paint paint = this.f22084b;
        if (z10) {
            paint.setColor(i0.b.f(0.2f, -16777216, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21311ug, d6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20987d7, d6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f22083a = z10;
    }
}

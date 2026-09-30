package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d3 extends View {
    public boolean f20144a;
    public final Paint f20145b;
    public final org.telegram.ui.ActionBar.d6 f20146c;

    public d3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20145b = new Paint();
        this.f20146c = d6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f20144a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f20146c;
        Paint paint = this.f20145b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19399ug, d6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19077d7, d6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f20144a = z10;
    }
}

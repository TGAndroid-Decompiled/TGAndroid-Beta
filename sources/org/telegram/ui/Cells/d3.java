package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class d3 extends View {
    public boolean f20129a;
    public final Paint f20130b;
    public final org.telegram.ui.ActionBar.d6 f20131c;

    public d3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f20130b = new Paint();
        this.f20131c = d6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f20129a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f20131c;
        Paint paint = this.f20130b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19384ug, d6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19062d7, d6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f20129a = z10;
    }
}

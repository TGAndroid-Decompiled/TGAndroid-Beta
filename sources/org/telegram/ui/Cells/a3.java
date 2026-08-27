package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class a3 extends View {

    public boolean f24056a;

    public final Paint f24057b;

    public final org.telegram.ui.ActionBar.c6 f24058c;

    public a3(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24057b = new Paint();
        this.f24058c = c6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f24056a;
        org.telegram.ui.ActionBar.c6 c6Var = this.f24058c;
        Paint paint = this.f24057b;
        if (z10) {
            paint.setColor(i0.b.d(0.2f, -16777216, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23367ug, c6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23054d7, c6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f24056a = z10;
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f24183a;
    public final Paint f24184b;
    public final org.telegram.ui.ActionBar.b6 f24185c;

    public c3(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24184b = new Paint();
        this.f24185c = b6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f24183a;
        org.telegram.ui.ActionBar.b6 b6Var = this.f24185c;
        Paint paint = this.f24184b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23313ug, b6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23002d7, b6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f24183a = z10;
    }
}

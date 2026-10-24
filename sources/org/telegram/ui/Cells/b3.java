package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class b3 extends View {
    public boolean f22129a;
    public final Paint f22130b;
    public final org.telegram.ui.ActionBar.g6 f22131c;

    public b3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22130b = new Paint();
        this.f22131c = g6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f22129a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22131c;
        Paint paint = this.f22130b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21509ug, g6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21185d7, g6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f22129a = z10;
    }
}

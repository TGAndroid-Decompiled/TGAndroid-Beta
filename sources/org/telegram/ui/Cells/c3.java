package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f22637a;
    public final Paint f22638b;
    public final org.telegram.ui.ActionBar.g6 f22639c;

    public c3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22638b = new Paint();
        this.f22639c = g6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z4 = this.f22637a;
        org.telegram.ui.ActionBar.g6 g6Var = this.f22639c;
        Paint paint = this.f22638b;
        if (z4) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21973ug, g6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21662d7, g6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z4) {
        this.f22637a = z4;
    }
}

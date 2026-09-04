package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f21675a;
    public final Paint f21676b;
    public final org.telegram.ui.ActionBar.f6 f21677c;

    public c3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21676b = new Paint();
        this.f21677c = f6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f21675a;
        org.telegram.ui.ActionBar.f6 f6Var = this.f21677c;
        Paint paint = this.f21676b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20982ug, f6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20664d7, f6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f21675a = z10;
    }
}

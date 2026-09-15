package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f19853a;
    public final Paint f19854b;
    public final org.telegram.ui.ActionBar.e6 f19855c;

    public c3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19854b = new Paint();
        this.f19855c = e6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f19853a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19855c;
        Paint paint = this.f19854b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19158ug, e6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18837d7, e6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f19853a = z10;
    }
}

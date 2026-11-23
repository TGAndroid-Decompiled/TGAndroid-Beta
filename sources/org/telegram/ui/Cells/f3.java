package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class f3 extends View {
    public boolean f30685a;
    public final Paint f30686b;
    public final org.telegram.ui.ActionBar.i6 f30687c;

    public f3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30686b = new Paint();
        this.f30687c = i6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f30685a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30687c;
        Paint paint = this.f30686b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29608lh, i6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29452d7, i6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f30685a = z10;
    }
}

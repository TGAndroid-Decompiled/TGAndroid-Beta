package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class e3 extends View {
    public boolean f30550a;
    public final Paint f30551b;
    public final org.telegram.ui.ActionBar.i6 f30552c;

    public e3(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30551b = new Paint();
        this.f30552c = i6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f30550a;
        org.telegram.ui.ActionBar.i6 i6Var = this.f30552c;
        Paint paint = this.f30551b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29553lh, i6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29397d7, i6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f30550a = z10;
    }
}

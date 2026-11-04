package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class e3 extends View {
    public boolean f29109a;
    public final Paint f29110b;
    public final org.telegram.ui.ActionBar.e6 f29111c;

    public e3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29110b = new Paint();
        this.f29111c = e6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f29109a;
        org.telegram.ui.ActionBar.e6 e6Var = this.f29111c;
        Paint paint = this.f29110b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27980ih, e6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27879d7, e6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f29109a = z10;
    }
}

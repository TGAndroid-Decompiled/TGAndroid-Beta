package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class f3 extends View {
    public boolean f30633a;
    public final Paint f30634b;
    public final org.telegram.ui.ActionBar.h6 f30635c;

    public f3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30634b = new Paint();
        this.f30635c = h6Var;
        setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f30633a;
        org.telegram.ui.ActionBar.h6 h6Var = this.f30635c;
        Paint paint = this.f30634b;
        if (z10) {
            paint.setColor(i0.a.f(0.2f, -16777216, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29538lh, h6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29382d7, h6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f30633a = z10;
    }
}

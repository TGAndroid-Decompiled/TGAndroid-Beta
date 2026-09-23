package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class c3 extends View {
    public boolean f19834a;
    public final Paint f19835b;
    public final org.telegram.ui.ActionBar.d6 f19836c;

    public c3(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f19835b = new Paint();
        this.f19836c = d6Var;
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.f19834a;
        org.telegram.ui.ActionBar.d6 d6Var = this.f19836c;
        Paint paint = this.f19835b;
        if (z10) {
            paint.setColor(i0.a.d(0.2f, -16777216, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19110ug, d6Var)));
        } else {
            paint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18790d7, d6Var));
        }
        canvas.drawLine(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop(), paint);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), getPaddingBottom() + getPaddingTop() + 1);
    }

    public void setForceDarkTheme(boolean z10) {
        this.f19834a = z10;
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends View {
    public final int f33156a;
    public final xi f33157b;

    public yh(xi xiVar, Context context, int i10) {
        super(context);
        this.f33156a = i10;
        this.f33157b = xiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f33156a) {
            case 0:
                super.draw(canvas);
                this.f33157b.f32798b0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f33156a) {
            case 1:
                xi xiVar = this.f33157b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, xiVar.f32874y0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(xiVar.J0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.C5);
                xiVar.J0.setColor(i0.a.k(themedColor, (int) (((xiVar.V0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                xiVar.L0.setColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20890h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                xiVar.K0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(xiVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), xiVar.L0);
                xiVar.L0.setColor(xiVar.getThemedColor(org.telegram.ui.ActionBar.i6.W9));
                xiVar.K0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(xiVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), xiVar.L0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), xiVar.J0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f33156a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f33157b.f32798b0.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

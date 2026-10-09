package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ci extends View {
    public final int f25377a;
    public final yi f25378b;

    public ci(yi yiVar, Context context, int i10) {
        super(context);
        this.f25377a = i10;
        this.f25378b = yiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f25377a) {
            case 0:
                super.draw(canvas);
                this.f25378b.f33213b0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f25377a) {
            case 1:
                yi yiVar = this.f25378b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, yiVar.B0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(yiVar.M0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.C5);
                yiVar.M0.setColor(i0.a.k(themedColor, (int) (((yiVar.Y0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                yiVar.O0.setColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.f20868h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                yiVar.N0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(yiVar.N0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), yiVar.O0);
                yiVar.O0.setColor(yiVar.getThemedColor(org.telegram.ui.ActionBar.i6.W9));
                yiVar.N0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(yiVar.N0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), yiVar.O0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), yiVar.M0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f25377a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f25378b.f33213b0.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

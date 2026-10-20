package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class yh extends View {
    public final int f32652a;
    public final ti f32653b;

    public yh(ti tiVar, Context context, int i10) {
        super(context);
        this.f32652a = i10;
        this.f32653b = tiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f32652a) {
            case 0:
                super.draw(canvas);
                this.f32653b.f30531b0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32652a) {
            case 1:
                ti tiVar = this.f32653b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, tiVar.B0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(tiVar.M0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.C5);
                tiVar.M0.setColor(i0.a.o(themedColor, (int) (((tiVar.Y0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                tiVar.O0.setColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21061h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                tiVar.N0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(tiVar.N0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), tiVar.O0);
                tiVar.O0.setColor(tiVar.getThemedColor(org.telegram.ui.ActionBar.h6.W9));
                tiVar.N0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(tiVar.N0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), tiVar.O0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), tiVar.M0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f32652a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f32653b.f30531b0.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

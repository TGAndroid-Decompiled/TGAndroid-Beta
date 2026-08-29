package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class rh extends View {
    public final int f32300a;
    public final ni f32301b;

    public rh(ni niVar, Context context, int i10) {
        super(context);
        this.f32300a = i10;
        this.f32301b = niVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f32300a) {
            case 0:
                super.draw(canvas);
                this.f32301b.X.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32300a) {
            case 1:
                ni niVar = this.f32301b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, niVar.f31051u0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(niVar.F0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = niVar.getThemedColor(org.telegram.ui.ActionBar.g6.C5);
                niVar.F0.setColor(i0.a.k(themedColor, (int) (((niVar.R0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                niVar.H0.setColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                niVar.G0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(niVar.G0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), niVar.H0);
                niVar.H0.setColor(niVar.getThemedColor(org.telegram.ui.ActionBar.g6.W9));
                niVar.G0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(niVar.G0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), niVar.H0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), niVar.F0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f32300a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f32301b.X.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

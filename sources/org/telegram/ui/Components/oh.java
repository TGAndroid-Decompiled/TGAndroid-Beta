package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oh extends View {
    public final int f31385a;
    public final ki f31386b;

    public oh(ki kiVar, Context context, int i9) {
        super(context);
        this.f31385a = i9;
        this.f31386b = kiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f31385a) {
            case 0:
                super.draw(canvas);
                this.f31386b.X.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f31385a) {
            case 1:
                ki kiVar = this.f31386b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kiVar.f30160u0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(kiVar.F0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.C5);
                kiVar.F0.setColor(i0.a.k(themedColor, (int) (((kiVar.R0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                kiVar.H0.setColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5));
                int i9 = max / 2;
                int i10 = measuredWidth - i9;
                int i11 = i9 + measuredWidth;
                kiVar.G0.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(kiVar.G0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), kiVar.H0);
                kiVar.H0.setColor(kiVar.getThemedColor(org.telegram.ui.ActionBar.f6.W9));
                kiVar.G0.set(AndroidUtilities.dp(2.0f) + i10, AndroidUtilities.dp(2.0f), i11 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(kiVar.G0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), kiVar.H0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), kiVar.F0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f31385a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                this.f31386b.X.setBounds(0, (i10 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i9, i10);
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }
}

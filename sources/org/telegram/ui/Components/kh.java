package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

public final class kh extends View {

    public final int f30109a;

    public final gi f30110b;

    public kh(gi giVar, Context context, int i10) {
        super(context);
        this.f30109a = i10;
        this.f30110b = giVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f30109a) {
            case 0:
                super.draw(canvas);
                this.f30110b.X.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30109a) {
            case 1:
                gi giVar = this.f30110b;
                String str = String.format("%d", Integer.valueOf(Math.max(1, giVar.f28696u0.getSelectedItemsCount())));
                int iCeil = (int) Math.ceil(giVar.F0.measureText(str));
                int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = giVar.getThemedColor(org.telegram.ui.ActionBar.g6.C5);
                giVar.F0.setColor(i0.b.k(themedColor, (int) (((((double) giVar.R0) * 0.42d) + 0.58d) * ((double) Color.alpha(themedColor)))));
                giVar.H0.setColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5));
                int i10 = iMax / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                giVar.G0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(giVar.G0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), giVar.H0);
                giVar.H0.setColor(giVar.getThemedColor(org.telegram.ui.ActionBar.g6.W9));
                giVar.G0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(giVar.G0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), giVar.H0);
                canvas.drawText(str, measuredWidth - (iCeil / 2), AndroidUtilities.dp(16.2f), giVar.F0);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f30109a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f30110b.X.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }
}

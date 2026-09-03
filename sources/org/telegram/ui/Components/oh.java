package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class oh extends View {
    public final int f27568a;
    public final li f27569b;

    public oh(li liVar, Context context, int i10) {
        super(context);
        this.f27568a = i10;
        this.f27569b = liVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f27568a) {
            case 0:
                super.draw(canvas);
                this.f27569b.Y.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f27568a) {
            case 1:
                li liVar = this.f27569b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, liVar.f26744v0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(liVar.G0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = liVar.getThemedColor(org.telegram.ui.ActionBar.j6.C5);
                liVar.G0.setColor(i0.a.k(themedColor, (int) (((liVar.S0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                liVar.I0.setColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                liVar.H0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(liVar.H0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), liVar.I0);
                liVar.I0.setColor(liVar.getThemedColor(org.telegram.ui.ActionBar.j6.W9));
                liVar.H0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(liVar.H0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), liVar.I0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), liVar.G0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f27568a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f27569b.Y.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

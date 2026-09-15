package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class zh extends View {
    public final int f30594a;
    public final vi f30595b;

    public zh(vi viVar, Context context, int i10) {
        super(context);
        this.f30594a = i10;
        this.f30595b = viVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f30594a) {
            case 0:
                super.draw(canvas);
                this.f30595b.f28736b0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f30594a) {
            case 1:
                vi viVar = this.f30595b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, viVar.f28811y0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(viVar.J0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = viVar.getThemedColor(org.telegram.ui.ActionBar.i6.C5);
                viVar.J0.setColor(i0.a.k(themedColor, (int) (((viVar.V0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                viVar.L0.setColor(viVar.getThemedColor(org.telegram.ui.ActionBar.i6.f18907h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                viVar.K0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(viVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), viVar.L0);
                viVar.L0.setColor(viVar.getThemedColor(org.telegram.ui.ActionBar.i6.W9));
                viVar.K0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(viVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), viVar.L0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), viVar.J0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f30594a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f30595b.f28736b0.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

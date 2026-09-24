package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ai extends View {
    public final int f22680a;
    public final wi f22681b;

    public ai(wi wiVar, Context context, int i10) {
        super(context);
        this.f22680a = i10;
        this.f22681b = wiVar;
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f22680a) {
            case 0:
                super.draw(canvas);
                this.f22681b.f29971b0.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f22680a) {
            case 1:
                wi wiVar = this.f22681b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, wiVar.f30046y0.getSelectedItemsCount())));
                int ceil = (int) Math.ceil(wiVar.J0.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int themedColor = wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.C5);
                wiVar.J0.setColor(i0.a.k(themedColor, (int) (((wiVar.V0 * 0.42d) + 0.58d) * Color.alpha(themedColor))));
                wiVar.L0.setColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.f19115h5));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                wiVar.K0.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(wiVar.K0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), wiVar.L0);
                wiVar.L0.setColor(wiVar.getThemedColor(org.telegram.ui.ActionBar.h6.W9));
                wiVar.K0.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(wiVar.K0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), wiVar.L0);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), wiVar.J0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f22680a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                this.f22681b.f29971b0.setBounds(0, (i11 - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(48.0f), i10, i11);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}

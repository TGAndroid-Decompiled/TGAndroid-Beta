package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class ta extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean f25468a;
    public org.telegram.ui.Components.y9 f25469b;
    public TextView f25470c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23341c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f25468a) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.y9 y9Var = this.f25469b;
        if (y9Var != null) {
            try {
                if (y9Var.getImageReceiver() != null && (y9Var.getImageReceiver().getDrawable() instanceof pg.c)) {
                    ((pg.c) y9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23341c9, false));
                    y9Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}

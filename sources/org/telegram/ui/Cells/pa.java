package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class pa extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean f22908a;
    public org.telegram.ui.Components.u9 f22909b;
    public TextView f22910c;
    public TextView d;

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21168c9));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f22908a) {
            canvas.drawLine(AndroidUtilities.dp(72.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21305k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.u9 u9Var = this.f22909b;
        if (u9Var != null) {
            try {
                if (u9Var.getImageReceiver() != null && (u9Var.getImageReceiver().getDrawable() instanceof og.c)) {
                    ((og.c) u9Var.getImageReceiver().getDrawable()).a(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21168c9, false));
                    u9Var.invalidate();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}

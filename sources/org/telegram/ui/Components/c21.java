package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class c21 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22608q.y * 0.33f), View.MeasureSpec.getSize(i10)), 1073741824));
    }
}

package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class h21 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.g0.f22567q.y * 0.33f), View.MeasureSpec.getSize(i10)), 1073741824));
    }
}

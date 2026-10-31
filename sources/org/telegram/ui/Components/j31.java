package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public final class j31 extends ActionBarPopupWindow$ActionBarPopupWindowLayout {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min((int) (org.telegram.messenger.i0.f16026q.y * 0.33f), View.MeasureSpec.getSize(i11)), 1073741824));
    }
}

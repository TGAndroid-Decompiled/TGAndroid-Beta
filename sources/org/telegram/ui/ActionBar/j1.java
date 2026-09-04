package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class j1 extends LinearLayout {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f20562a;

    public j1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, Context context) {
        super(context);
        this.f20562a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if ((view instanceof k1) && this.f20562a.N != null) {
            return false;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        j1 j1Var = this;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j1Var.f20562a;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.O) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.E = -1000000;
            actionBarPopupWindow$ActionBarPopupWindowLayout.F = -1000000;
            int childCount = j1Var.getChildCount();
            ArrayList arrayList = null;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < childCount) {
                View childAt = j1Var.getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag(R.id.width_tag);
                    Object tag2 = childAt.getTag(R.id.object_tag);
                    Object tag3 = childAt.getTag(R.id.fit_width_tag);
                    if (tag != null) {
                        childAt.getLayoutParams().width = -2;
                    }
                    j1Var.measureChildWithMargins(childAt, i10, 0, i11, 0);
                    if (tag3 == null) {
                        boolean z10 = tag instanceof Integer;
                        if (!z10 && tag2 == null) {
                            i13 = Math.max(i13, childAt.getMeasuredWidth());
                        } else if (z10) {
                            i14 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                            actionBarPopupWindow$ActionBarPopupWindowLayout.E = childAt.getMeasuredHeight();
                            actionBarPopupWindow$ActionBarPopupWindowLayout.F = AndroidUtilities.dp(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.E;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                }
                i12++;
                j1Var = this;
            }
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    ((View) arrayList.get(i15)).getLayoutParams().width = Math.max(i13, i14);
                }
            }
        }
        super.onMeasure(i10, i11);
    }
}

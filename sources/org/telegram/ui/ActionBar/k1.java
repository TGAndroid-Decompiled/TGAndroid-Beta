package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class k1 extends LinearLayout {
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f23579a;

    public k1(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, Context context) {
        super(context);
        this.f23579a = actionBarPopupWindow$ActionBarPopupWindowLayout;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if ((view instanceof l1) && this.f23579a.J != null) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        k1 k1Var = this;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = k1Var.f23579a;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout.K) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.A = -1000000;
            actionBarPopupWindow$ActionBarPopupWindowLayout.B = -1000000;
            int childCount = k1Var.getChildCount();
            ArrayList arrayList = null;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i12 < childCount) {
                View childAt = k1Var.getChildAt(i12);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag(R.id.width_tag);
                    Object tag2 = childAt.getTag(R.id.object_tag);
                    Object tag3 = childAt.getTag(R.id.fit_width_tag);
                    if (tag != null) {
                        childAt.getLayoutParams().width = -2;
                    }
                    k1Var.measureChildWithMargins(childAt, i10, 0, i11, 0);
                    if (tag3 == null) {
                        boolean z10 = tag instanceof Integer;
                        if (!z10 && tag2 == null) {
                            i13 = Math.max(i13, childAt.getMeasuredWidth());
                        } else if (z10) {
                            i14 = Math.max(((Integer) tag).intValue(), childAt.getMeasuredWidth());
                            actionBarPopupWindow$ActionBarPopupWindowLayout.A = childAt.getMeasuredHeight();
                            actionBarPopupWindow$ActionBarPopupWindowLayout.B = AndroidUtilities.dp(6.0f) + actionBarPopupWindow$ActionBarPopupWindowLayout.A;
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(childAt);
                }
                i12++;
                k1Var = this;
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

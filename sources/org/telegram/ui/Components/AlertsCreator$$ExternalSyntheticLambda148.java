package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextColorCell;

public final class AlertsCreator$$ExternalSyntheticLambda148 implements View.OnClickListener {
    public final int $r8$classId = 1;
    public final int[] f$0;
    public final LinearLayout f$1;

    public AlertsCreator$$ExternalSyntheticLambda148(LinearLayout linearLayout, int[] iArr) {
        this.f$1 = linearLayout;
        this.f$0 = iArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0[0] = ((Integer) view.getTag()).intValue();
                LinearLayout linearLayout = this.f$1;
                int childCount = linearLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = linearLayout.getChildAt(i);
                    if (childAt instanceof RadioColorCell) {
                        ((RadioColorCell) childAt).radioButton.setChecked(childAt == view, true);
                    }
                }
                break;
            default:
                LinearLayout linearLayout2 = this.f$1;
                int childCount2 = linearLayout2.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    RadioColorCell radioColorCell = (RadioColorCell) linearLayout2.getChildAt(i2);
                    radioColorCell.radioButton.setChecked(radioColorCell == view, true);
                }
                this.f$0[0] = TextColorCell.colorsToSave[((Integer) view.getTag()).intValue()];
                break;
        }
    }

    public AlertsCreator$$ExternalSyntheticLambda148(int[] iArr, LinearLayout linearLayout) {
        this.f$0 = iArr;
        this.f$1 = linearLayout;
    }
}

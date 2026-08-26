package org.telegram.ui.Stories;

import android.view.View;
import org.telegram.ui.Cells.CheckBoxCell;

public final class LiveCommentsView$$ExternalSyntheticLambda25 implements View.OnClickListener {
    public final int $r8$classId;
    public final CheckBoxCell f$0;

    public LiveCommentsView$$ExternalSyntheticLambda25(CheckBoxCell checkBoxCell, int i) {
        this.$r8$classId = i;
        this.f$0 = checkBoxCell;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                CheckBoxCell checkBoxCell = this.f$0;
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                break;
            case 1:
                CheckBoxCell checkBoxCell2 = this.f$0;
                checkBoxCell2.setChecked(!checkBoxCell2.isChecked(), true);
                break;
            case 2:
                CheckBoxCell checkBoxCell3 = this.f$0;
                checkBoxCell3.setChecked(!checkBoxCell3.isChecked(), true);
                break;
            default:
                CheckBoxCell checkBoxCell4 = this.f$0;
                checkBoxCell4.setChecked(!checkBoxCell4.isChecked(), true);
                break;
        }
    }
}

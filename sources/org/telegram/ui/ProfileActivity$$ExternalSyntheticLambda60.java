package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Cells.CheckBoxCell;

public final class ProfileActivity$$ExternalSyntheticLambda60 implements View.OnClickListener {
    public final int $r8$classId;
    public final CheckBoxCell[] f$0;

    public ProfileActivity$$ExternalSyntheticLambda60(CheckBoxCell[] checkBoxCellArr, int i) {
        this.$r8$classId = i;
        this.f$0 = checkBoxCellArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                CheckBoxCell checkBoxCell = this.f$0[0];
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                break;
            case 1:
                Integer num = (Integer) view.getTag();
                int iIntValue = num.intValue();
                CheckBoxCell[] checkBoxCellArr = this.f$0;
                checkBoxCellArr[iIntValue].setChecked(!checkBoxCellArr[num.intValue()].isChecked(), true);
                break;
            case 2:
                Integer num2 = (Integer) view.getTag();
                int iIntValue2 = num2.intValue();
                CheckBoxCell[] checkBoxCellArr2 = this.f$0;
                checkBoxCellArr2[iIntValue2].setChecked(!checkBoxCellArr2[num2.intValue()].isChecked(), true);
                break;
            case 3:
                Integer num3 = (Integer) view.getTag();
                int iIntValue3 = num3.intValue();
                CheckBoxCell[] checkBoxCellArr3 = this.f$0;
                checkBoxCellArr3[iIntValue3].setChecked(!checkBoxCellArr3[num3.intValue()].isChecked(), true);
                break;
            default:
                CheckBoxCell checkBoxCell2 = this.f$0[0];
                checkBoxCell2.setChecked(!checkBoxCell2.isChecked(), true);
                break;
        }
    }
}

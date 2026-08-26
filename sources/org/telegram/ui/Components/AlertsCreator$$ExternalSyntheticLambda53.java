package org.telegram.ui.Components;

import android.view.View;
import org.telegram.ui.Cells.CheckBoxCell;

public final class AlertsCreator$$ExternalSyntheticLambda53 implements View.OnClickListener {
    public final int $r8$classId;
    public final CheckBoxCell[] f$0;

    public AlertsCreator$$ExternalSyntheticLambda53(CheckBoxCell[] checkBoxCellArr, int i) {
        this.$r8$classId = i;
        this.f$0 = checkBoxCellArr;
    }

    @Override
    public final void onClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$showBlockReportSpamReplyAlert$35(this.f$0, view);
                break;
            default:
                AlertsCreator.lambda$showBlockReportSpamAlert$38(this.f$0, view);
                break;
        }
    }
}

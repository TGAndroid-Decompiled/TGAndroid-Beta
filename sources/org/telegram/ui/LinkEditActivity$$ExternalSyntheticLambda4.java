package org.telegram.ui;

import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.SlideChooseView;

public final class LinkEditActivity$$ExternalSyntheticLambda4 implements AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate, SlideChooseView.Callback {
    public final int $r8$classId;
    public final LinkEditActivity f$0;

    public LinkEditActivity$$ExternalSyntheticLambda4(LinkEditActivity linkEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = linkEditActivity;
    }

    @Override
    public void didSelectDate(boolean z, int i, int i2) {
        this.f$0.lambda$createView$0(z, i, i2);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$createView$9(alertDialog, i);
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 2:
                this.f$0.lambda$createView$2(i);
                break;
            default:
                this.f$0.lambda$createView$3(i);
                break;
        }
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
        SlideChooseView.Callback.CC.$default$onTouchEnd(this);
    }
}

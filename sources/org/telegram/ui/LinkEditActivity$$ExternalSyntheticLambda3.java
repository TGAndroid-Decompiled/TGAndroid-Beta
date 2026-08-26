package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.SlideChooseView;

public final class LinkEditActivity$$ExternalSyntheticLambda3 implements AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate, SlideChooseView.Callback {
    public final int $r8$classId;
    public final LinkEditActivity f$0;

    public LinkEditActivity$$ExternalSyntheticLambda3(LinkEditActivity linkEditActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = linkEditActivity;
    }

    private final void onTouchEnd$org$telegram$ui$LinkEditActivity$$ExternalSyntheticLambda3() {
    }

    private final void onTouchEnd$org$telegram$ui$LinkEditActivity$$ExternalSyntheticLambda4() {
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        this.f$0.chooseDate(i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        LinkEditActivity linkEditActivity = this.f$0;
        linkEditActivity.callback.revokeLink(linkEditActivity.inviteToEdit);
        linkEditActivity.finishFragment();
    }

    @Override
    public void onOptionSelected(int i) {
        switch (this.$r8$classId) {
            case 0:
                LinkEditActivity linkEditActivity = this.f$0;
                ArrayList arrayList = linkEditActivity.dispalyedDates;
                if (i >= arrayList.size()) {
                    linkEditActivity.timeEditText.setText("");
                } else {
                    linkEditActivity.timeEditText.setText(LocaleController.formatDateAudio(linkEditActivity.getConnectionsManager().getCurrentTime() + ((Integer) arrayList.get(i)).intValue(), false));
                }
                break;
            default:
                LinkEditActivity linkEditActivity2 = this.f$0;
                linkEditActivity2.usesEditText.clearFocus();
                linkEditActivity2.ignoreSet = true;
                ArrayList arrayList2 = linkEditActivity2.dispalyedUses;
                if (i < arrayList2.size()) {
                    linkEditActivity2.usesEditText.setText(((Integer) arrayList2.get(i)).toString());
                } else {
                    linkEditActivity2.usesEditText.setText("");
                }
                linkEditActivity2.ignoreSet = false;
                break;
        }
    }

    @Override
    public void onTouchEnd() {
        int i = this.$r8$classId;
    }
}

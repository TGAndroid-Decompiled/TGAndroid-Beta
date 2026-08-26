package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

public final class TagEditCell$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public TagEditCell$$ExternalSyntheticLambda3(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TagEditCell.lambda$showSheet$5(this.f$0);
                break;
            case 1:
                AlertsCreator.lambda$createThemeCreateDialog$239(this.f$0);
                break;
            case 2:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 3:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 4:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 5:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            case 6:
                AndroidUtilities.showKeyboard(this.f$0);
                break;
            default:
                StickersAlert.lambda$showNameEnterAlert$39(this.f$0);
                break;
        }
    }
}

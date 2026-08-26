package org.telegram.ui.Components;

import android.content.DialogInterface;

public final class AlertsCreator$$ExternalSyntheticLambda63 implements DialogInterface.OnShowListener {
    public final int $r8$classId;
    public final EditTextBoldCursor f$0;

    public AlertsCreator$$ExternalSyntheticLambda63(int i, EditTextBoldCursor editTextBoldCursor) {
        this.$r8$classId = i;
        this.f$0 = editTextBoldCursor;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                AlertsCreator.lambda$showAddBrowserException$29(this.f$0, dialogInterface);
                break;
            case 1:
                AlertsCreator.lambda$createSimpleTextInputAlert$17(this.f$0, dialogInterface);
                break;
            case 2:
                AlertsCreator.lambda$createThemeCreateDialog$240(this.f$0, dialogInterface);
                break;
            case 3:
                AlertsCreator.lambda$showAddLinkToPoll$23(this.f$0, dialogInterface);
                break;
            case 4:
                EditTextCaption.lambda$showInputDialog$8(this.f$0, dialogInterface);
                break;
            case 5:
                EditTextCaption.lambda$showInputDialog$9(this.f$0, dialogInterface);
                break;
            case 6:
                SearchTagsList.lambda$openRenameTagAlert$8(this.f$0, dialogInterface);
                break;
            case 7:
                SearchTagsList.lambda$openRenameTagAlert$10(this.f$0, dialogInterface);
                break;
            default:
                StickersAlert.lambda$showNameEnterAlert$40(this.f$0, dialogInterface);
                break;
        }
    }
}

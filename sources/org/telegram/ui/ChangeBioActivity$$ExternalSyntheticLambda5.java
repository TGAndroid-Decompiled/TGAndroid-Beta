package org.telegram.ui;

import android.content.DialogInterface;

public final class ChangeBioActivity$$ExternalSyntheticLambda5 implements DialogInterface.OnCancelListener {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;

    public ChangeBioActivity$$ExternalSyntheticLambda5(Object obj, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
    }

    @Override
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.$r8$classId) {
            case 0:
                ((ChangeBioActivity) this.f$0).lambda$saveName$5(this.f$1, dialogInterface);
                break;
            case 1:
                ((ChatActivity.ChatMessageCellDelegate) this.f$0).lambda$didPressOther$5(this.f$1, dialogInterface);
                break;
            case 2:
                ((ChangeUsernameActivity) this.f$0).lambda$saveName$11(this.f$1, dialogInterface);
                break;
            case 3:
                ((ChatEditActivity) this.f$0).lambda$processDone$66(this.f$1, dialogInterface);
                break;
            case 4:
                ((GroupCallActivity) this.f$0).lambda$inviteUserToCall$64(this.f$1, dialogInterface);
                break;
            case 5:
                ((LanguageSelectActivity) this.f$0).lambda$createView$2(this.f$1, dialogInterface);
                break;
            case 6:
                ((LocationActivity) this.f$0).lambda$createView$15(this.f$1, dialogInterface);
                break;
            default:
                ((ThemeSetUrlActivity) this.f$0).lambda$saveTheme$13(this.f$1, dialogInterface);
                break;
        }
    }
}

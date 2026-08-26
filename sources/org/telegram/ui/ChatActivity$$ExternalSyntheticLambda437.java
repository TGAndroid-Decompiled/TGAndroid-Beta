package org.telegram.ui;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.NumberPicker;

public final class ChatActivity$$ExternalSyntheticLambda437 implements AlertDialog.OnButtonClickListener, AlertsCreator.DatePickerDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda437(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
    }

    @Override
    public void didSelectDate(int i, int i2, int i3) {
        ((PassportActivity) this.f$0).lambda$createIdentityInterface$47(this.f$1, (EditTextBoldCursor) this.f$2, i, i2, i3);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$329(this.f$1, (boolean[]) this.f$2, alertDialog, i);
                break;
            case 1:
                ((GroupCallActivity.AnonymousClass6.AnonymousClass1) this.f$0).lambda$onStartRecord$3((EditTextBoldCursor) this.f$2, this.f$1, alertDialog, i);
                break;
            case 2:
                ((ChatActivity) this.f$0).lambda$shareMyContact$128(this.f$1, (MessageObject) this.f$2, alertDialog, i);
                break;
            case 3:
                ((LaunchActivity) this.f$0).lambda$didReceivedNotification$151((HashMap) this.f$2, this.f$1, alertDialog, i);
                break;
            case 4:
                ((LocationActivity) this.f$0).lambda$openProximityAlert$31((TLRPC.User) this.f$2, this.f$1, alertDialog, i);
                break;
            case 5:
                ((PasscodeActivity) this.f$0).lambda$createView$4((NumberPicker) this.f$2, this.f$1, alertDialog, i);
                break;
            case 6:
            default:
                ((StickersActivity) this.f$0).lambda$processSelectionMenu$13((ArrayList) this.f$2, this.f$1, alertDialog, i);
                break;
            case 7:
                ((SessionsActivity) this.f$0).lambda$createView$19(this.f$1, (boolean[]) this.f$2, alertDialog, i);
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda437(BaseFragment baseFragment, int i, Object obj, int i2) {
        this.$r8$classId = i2;
        this.f$0 = baseFragment;
        this.f$1 = i;
        this.f$2 = obj;
    }
}

package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ItemOptions;

public final class DialogsActivity$$ExternalSyntheticLambda6 implements View.OnLongClickListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda6(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final boolean onLongClick(View view) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.openAccountSelector(view);
                return true;
            case 1:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.performSelectedDialogsAction(dialogsActivity.selectedDialogs, 104, true, true, null);
                return true;
            case 2:
                DialogsActivity dialogsActivity2 = this.f$0;
                if (dialogsActivity2.getParentActivity() == null) {
                    return false;
                }
                int i = 0;
                boolean z = true;
                while (true) {
                    ArrayList arrayList = dialogsActivity2.selectedDialogs;
                    if (i >= arrayList.size()) {
                        ItemOptions itemOptions = new ItemOptions(dialogsActivity2, view, false, true);
                        itemOptions.add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new DialogsActivity$$ExternalSyntheticLambda27(dialogsActivity2, 7), false);
                        itemOptions.addIf(R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new DialogsActivity$$ExternalSyntheticLambda27(dialogsActivity2, 8), z);
                        itemOptions.show();
                        return true;
                    }
                    long jLongValue = ((Long) arrayList.get(i)).longValue();
                    if (DialogObject.isEncryptedDialog(jLongValue)) {
                        z = false;
                    }
                    TLRPC.Chat chat = dialogsActivity2.getMessagesController().getChat(Long.valueOf(-jLongValue));
                    if (chat != null && !ChatObject.canWriteToChat(chat)) {
                        z = false;
                    }
                    i++;
                }
                break;
            default:
                DialogsActivity dialogsActivity3 = this.f$0;
                dialogsActivity3.getContactsController().loadGlobalPrivacySetting();
                dialogsActivity3.showItemOptions$1();
                return true;
        }
    }
}

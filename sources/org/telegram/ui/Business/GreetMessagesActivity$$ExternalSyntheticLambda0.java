package org.telegram.ui.Business;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.UItem;

public final class GreetMessagesActivity$$ExternalSyntheticLambda0 implements AlertDialog.OnButtonClickListener, Utilities.Callback5 {
    public final int $r8$classId;
    public final GreetMessagesActivity f$0;

    public GreetMessagesActivity$$ExternalSyntheticLambda0(GreetMessagesActivity greetMessagesActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = greetMessagesActivity;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.processDone$2();
                break;
            default:
                this.f$0.lambda$onBackPressed$4$1(alertDialog, i);
                break;
        }
    }

    @Override
    public void mo1122run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UItem uItem = (UItem) obj;
        ((Integer) obj3).intValue();
        ((Float) obj4).floatValue();
        ((Float) obj5).floatValue();
        GreetMessagesActivity greetMessagesActivity = this.f$0;
        if (greetMessagesActivity.recipientsHelper.onClick(uItem)) {
            return;
        }
        int i = uItem.id;
        if (i == 2 || uItem.viewType == 17) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", greetMessagesActivity.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "hello");
            greetMessagesActivity.presentFragment(new ChatActivity(bundle));
            return;
        }
        if (i == 1) {
            greetMessagesActivity.enabled = !greetMessagesActivity.enabled;
            greetMessagesActivity.listView.adapter.update(true);
            greetMessagesActivity.checkDone$1$1(true);
        } else {
            if (i == 3) {
                BusinessRecipientsHelper businessRecipientsHelper = greetMessagesActivity.recipientsHelper;
                greetMessagesActivity.exclude = true;
                businessRecipientsHelper.exclude = true;
                greetMessagesActivity.listView.adapter.update(true);
                greetMessagesActivity.checkDone$1$1(true);
                return;
            }
            if (i == 4) {
                BusinessRecipientsHelper businessRecipientsHelper2 = greetMessagesActivity.recipientsHelper;
                greetMessagesActivity.exclude = false;
                businessRecipientsHelper2.exclude = false;
                greetMessagesActivity.listView.adapter.update(true);
                greetMessagesActivity.checkDone$1$1(true);
            }
        }
    }
}

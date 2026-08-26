package org.telegram.ui.Business;

import android.text.TextUtils;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Adapters.SearchAdapterHelper;

public final class ChatbotsActivity$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final ChatbotsActivity f$0;

    public ChatbotsActivity$$ExternalSyntheticLambda5(ChatbotsActivity chatbotsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = chatbotsActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ChatbotsActivity chatbotsActivity = this.f$0;
                chatbotsActivity.listView.adapter.update(true);
                chatbotsActivity.checkDone$6(true);
                break;
            case 1:
                ChatbotsActivity chatbotsActivity2 = this.f$0;
                TL_account.TL_businessBotRights tL_businessBotRights = chatbotsActivity2.rights;
                tL_businessBotRights.manage_stories = !tL_businessBotRights.manage_stories;
                chatbotsActivity2.listView.adapter.update(true);
                chatbotsActivity2.checkDone$6(true);
                break;
            case 2:
                ChatbotsActivity chatbotsActivity3 = this.f$0;
                TL_account.TL_businessBotRights tL_businessBotRights2 = chatbotsActivity3.rights;
                tL_businessBotRights2.edit_username = true;
                tL_businessBotRights2.edit_profile_photo = true;
                tL_businessBotRights2.edit_bio = true;
                tL_businessBotRights2.edit_name = true;
                chatbotsActivity3.listView.adapter.update(true);
                chatbotsActivity3.checkDone$6(true);
                break;
            case 3:
                ChatbotsActivity chatbotsActivity4 = this.f$0;
                TL_account.TL_businessBotRights tL_businessBotRights3 = chatbotsActivity4.rights;
                tL_businessBotRights3.transfer_stars = true;
                tL_businessBotRights3.transfer_and_upgrade_gifts = true;
                tL_businessBotRights3.change_gift_settings = true;
                tL_businessBotRights3.sell_gifts = true;
                tL_businessBotRights3.view_gifts = true;
                chatbotsActivity4.listView.adapter.update(true);
                chatbotsActivity4.checkDone$6(true);
                break;
            default:
                ChatbotsActivity chatbotsActivity5 = this.f$0;
                String string = chatbotsActivity5.editText.getText().toString();
                String str = chatbotsActivity5.lastQuery;
                if (str == null || !TextUtils.equals(str, string)) {
                    chatbotsActivity5.scheduledLoading = false;
                    if (!TextUtils.isEmpty(string)) {
                        SearchAdapterHelper searchAdapterHelper = chatbotsActivity5.searchHelper;
                        chatbotsActivity5.lastQuery = string;
                        int i = chatbotsActivity5.searchId;
                        chatbotsActivity5.searchId = i + 1;
                        searchAdapterHelper.queryServerSearch(string, true, false, true, false, false, 0L, false, 0, i, 0L, null);
                    } else {
                        chatbotsActivity5.lastQuery = null;
                        chatbotsActivity5.searchHelper.clear();
                        chatbotsActivity5.listView.adapter.update(true);
                    }
                }
                break;
        }
    }
}

package org.telegram.ui;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.StoriesController;

public final class DialogsActivity$$ExternalSyntheticLambda11 implements RecyclerListView.OnItemClickListener {
    public final int $r8$classId;
    public final DialogsActivity f$0;

    public DialogsActivity$$ExternalSyntheticLambda11(DialogsActivity dialogsActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = dialogsActivity;
    }

    @Override
    public final void onItemClick(int i, View view) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = this.f$0;
                dialogsActivity.filtersView.cancelClickRunnables(true);
                FiltersView filtersView = dialogsActivity.filtersView;
                dialogsActivity.addSearchFilter(filtersView.usersFilters.isEmpty() ? FiltersView.filters[i] : (FiltersView.MediaFilterData) filtersView.usersFilters.get(i));
                break;
            default:
                DialogsActivity dialogsActivity2 = this.f$0;
                Object obj = dialogsActivity2.searchViewPager.hashtagSearchAdapter.getItem(i).object;
                if (obj instanceof MessageObject) {
                    MessageObject messageObject = (MessageObject) obj;
                    Bundle bundle = new Bundle();
                    if (messageObject.getDialogId() >= 0) {
                        bundle.putLong("user_id", messageObject.getDialogId());
                    } else {
                        bundle.putLong("chat_id", -messageObject.getDialogId());
                    }
                    bundle.putInt("message_id", messageObject.getId());
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    DialogsActivity.highlightFoundQuote(chatActivity, messageObject);
                    dialogsActivity2.presentFragment(chatActivity);
                } else if (obj instanceof StoriesController.SearchStoriesList) {
                    StoriesController.SearchStoriesList searchStoriesList = (StoriesController.SearchStoriesList) obj;
                    Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(3, "type");
                    bundleM.putString("hashtag", searchStoriesList.query);
                    bundleM.putInt("storiesCount", searchStoriesList.count);
                    dialogsActivity2.presentFragment(new MediaActivity(bundleM, null));
                }
                break;
        }
    }
}

package org.telegram.ui;

import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Stories.StoriesController;

public final class ProfileActivity$$ExternalSyntheticLambda70 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;

    public ProfileActivity$$ExternalSyntheticLambda70(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void s(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ProfileActivity profileActivity = (ProfileActivity) this.f$0;
                profileActivity.getClass();
                ArrayList arrayList = new ArrayList((HashSet) obj);
                int i = 0;
                while (i < arrayList.size()) {
                    if (profileActivity.getMessagesController().getTopicsController().findTopic(profileActivity.chatId, ((Integer) arrayList.get(i)).intValue()) == null) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                HashSet hashSet = profileActivity.notificationsExceptionTopics;
                hashSet.clear();
                hashSet.addAll(arrayList);
                profileActivity.updateNotifications(true);
                break;
            default:
                StoriesController.StoriesCollections storiesCollections = (StoriesController.StoriesCollections) this.f$0;
                storiesCollections.getClass();
                AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(26, storiesCollections, (List) obj));
                break;
        }
    }

    public final Consumer andThen(Consumer consumer) {
        int i = this.$r8$classId;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}

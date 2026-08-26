package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Adapters.SearchAdapterHelper;

public final class NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final NotificationsCustomSettingsActivity.SearchAdapter f$0;
    public final String f$1;

    public NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0(NotificationsCustomSettingsActivity.SearchAdapter searchAdapter, String str, int i) {
        this.$r8$classId = i;
        this.f$0 = searchAdapter;
        this.f$1 = str;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                NotificationsCustomSettingsActivity.SearchAdapter searchAdapter = this.f$0;
                searchAdapter.getClass();
                AndroidUtilities.runOnUIThread(new NotificationsCustomSettingsActivity$SearchAdapter$$ExternalSyntheticLambda0(searchAdapter, this.f$1, 1));
                break;
            default:
                NotificationsCustomSettingsActivity.SearchAdapter searchAdapter2 = this.f$0;
                String str = this.f$1;
                SearchAdapterHelper searchAdapterHelper = searchAdapter2.searchAdapterHelper;
                int i = NotificationsCustomSettingsActivity.this.currentType;
                searchAdapterHelper.queryServerSearch(str, true, (i == 1 || i == 3) ? false : true, true, false, false, 0L, false, 0, 0, 0L, null);
                Utilities.searchQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda21(searchAdapter2, str, new ArrayList(NotificationsCustomSettingsActivity.this.exceptions), false, 24));
                break;
        }
    }
}

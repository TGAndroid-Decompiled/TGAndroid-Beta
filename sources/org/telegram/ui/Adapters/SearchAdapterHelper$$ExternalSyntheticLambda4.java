package org.telegram.ui.Adapters;

import androidx.car.app.utils.RemoteUtils$$ExternalSyntheticLambda2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesStorage;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda5;

public final class SearchAdapterHelper$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final SearchAdapterHelper f$0;

    public SearchAdapterHelper$$ExternalSyntheticLambda4(SearchAdapterHelper searchAdapterHelper, int i) {
        this.$r8$classId = i;
        this.f$0 = searchAdapterHelper;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                SearchAdapterHelper searchAdapterHelper = this.f$0;
                searchAdapterHelper.getClass();
                try {
                    MessagesStorage.getInstance(searchAdapterHelper.currentAccount).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE 1").stepThis().dispose();
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            default:
                SearchAdapterHelper searchAdapterHelper2 = this.f$0;
                searchAdapterHelper2.getClass();
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(searchAdapterHelper2.currentAccount).getDatabase().queryFinalized("SELECT id, date FROM hashtag_recent_v2 WHERE 1", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    HashMap map = new HashMap();
                    while (sQLiteCursorQueryFinalized.next()) {
                        SearchAdapterHelper.HashtagObject hashtagObject = new SearchAdapterHelper.HashtagObject();
                        hashtagObject.hashtag = sQLiteCursorQueryFinalized.stringValue(0);
                        hashtagObject.date = sQLiteCursorQueryFinalized.intValue(1);
                        arrayList.add(hashtagObject);
                        map.put(hashtagObject.hashtag, hashtagObject);
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    Collections.sort(arrayList, new Theme$$ExternalSyntheticLambda5(28));
                    AndroidUtilities.runOnUIThread(new RemoteUtils$$ExternalSyntheticLambda2(searchAdapterHelper2, arrayList, map, 17));
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                break;
        }
    }
}

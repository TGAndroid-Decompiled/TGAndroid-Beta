package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class z7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f20212a;
    public final Object f20213b;
    public final Object f20214c;
    public final Object d;

    public z7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f20212a = baseController;
        this.f20213b = obj;
        this.f20214c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f20212a).lambda$prepareImportHistory$108((Uri) this.f20213b, (ArrayList) this.f20214c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f20212a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f20213b, (MediaDataController.SearchStickersResult) this.f20214c, (Utilities.Callback) this.d, arrayList, str);
    }
}

package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class z7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f20219a;
    public final Object f20220b;
    public final Object f20221c;
    public final Object d;

    public z7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f20219a = baseController;
        this.f20220b = obj;
        this.f20221c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j10) {
        ((SendMessagesHelper) this.f20219a).lambda$prepareImportHistory$108((Uri) this.f20220b, (ArrayList) this.f20221c, (MessagesStorage.LongCallback) this.d, j10);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f20219a).lambda$searchStickers$249((MediaDataController.SearchStickersKey) this.f20220b, (MediaDataController.SearchStickersResult) this.f20221c, (Utilities.Callback) this.d, arrayList, str);
    }
}

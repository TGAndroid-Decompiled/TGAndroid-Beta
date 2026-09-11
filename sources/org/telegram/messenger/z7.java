package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class z7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19812a;
    public final Object f19813b;
    public final Object f19814c;
    public final Object d;

    public z7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19812a = baseController;
        this.f19813b = obj;
        this.f19814c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19812a).lambda$prepareImportHistory$105((Uri) this.f19813b, (ArrayList) this.f19814c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19812a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19813b, (MediaDataController.SearchStickersResult) this.f19814c, (Utilities.Callback) this.d, arrayList, str);
    }
}

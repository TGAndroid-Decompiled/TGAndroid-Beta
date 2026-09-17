package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.Utilities;
public final class z7 implements MediaDataController.KeywordResultCallback, MessagesStorage.LongCallback {
    public final BaseController f19839a;
    public final Object f19840b;
    public final Object f19841c;
    public final Object d;

    public z7(BaseController baseController, Object obj, Object obj2, Object obj3) {
        this.f19839a = baseController;
        this.f19840b = obj;
        this.f19841c = obj2;
        this.d = obj3;
    }

    @Override
    public void run(long j3) {
        ((SendMessagesHelper) this.f19839a).lambda$prepareImportHistory$105((Uri) this.f19840b, (ArrayList) this.f19841c, (MessagesStorage.LongCallback) this.d, j3);
    }

    @Override
    public void run(ArrayList arrayList, String str) {
        ((MediaDataController) this.f19839a).lambda$searchStickers$248((MediaDataController.SearchStickersKey) this.f19840b, (MediaDataController.SearchStickersResult) this.f19841c, (Utilities.Callback) this.d, arrayList, str);
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
public final class zk implements Runnable {
    public final int f18906a;
    public final long f18907b;
    public final BaseController f18908c;
    public final Object d;

    public zk(BaseController baseController, Object obj, long j10, int i10) {
        this.f18906a = i10;
        this.f18908c = baseController;
        this.d = obj;
        this.f18907b = j10;
    }

    @Override
    public final void run() {
        switch (this.f18906a) {
            case 0:
                ((TopicsController) this.f18908c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f18907b);
                return;
            case 1:
                ((TranslateController) this.f18908c).lambda$setDialogTranslateTo$0(this.f18907b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f18908c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f18907b);
                return;
        }
    }

    public zk(TranslateController translateController, long j10, String str) {
        this.f18906a = 1;
        this.f18908c = translateController;
        this.f18907b = j10;
        this.d = str;
    }
}

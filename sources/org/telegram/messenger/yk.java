package org.telegram.messenger;

import java.util.ArrayList;
public final class yk implements Runnable {
    public final int f19115a;
    public final long f19116b;
    public final BaseController f19117c;
    public final Object d;

    public yk(BaseController baseController, Object obj, long j10, int i10) {
        this.f19115a = i10;
        this.f19117c = baseController;
        this.d = obj;
        this.f19116b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19115a) {
            case 0:
                ((TopicsController) this.f19117c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19116b);
                return;
            case 1:
                ((TranslateController) this.f19117c).lambda$setDialogTranslateTo$0(this.f19116b, (String) this.d);
                return;
            default:
                ((TranslateController) this.f19117c).lambda$invalidateTranslation$9((MessageObject) this.d, this.f19116b);
                return;
        }
    }

    public yk(TranslateController translateController, long j10, String str) {
        this.f19115a = 1;
        this.f19117c = translateController;
        this.f19116b = j10;
        this.d = str;
    }
}

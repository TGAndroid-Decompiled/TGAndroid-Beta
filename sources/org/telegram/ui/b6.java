package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class b6 implements t70 {
    public final int f35511a;
    public final e6 f35512b;
    public final CacheByChatsController.KeepMediaException f35513c;

    public b6(e6 e6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f35511a = i10;
        this.f35512b = e6Var;
        this.f35513c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35511a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                e6 e6Var = this.f35512b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f35513c;
                if (i10 == i11) {
                    e6Var.d.remove(keepMediaException);
                    e6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(e6Var.f36553b);
                }
                e6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var.e, e6Var.d);
                return;
            default:
                this.f35513c.keepMedia = i10;
                e6 e6Var2 = this.f35512b;
                e6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var2.e, e6Var2.d);
                AndroidUtilities.updateVisibleRows(e6Var2.f36553b);
                return;
        }
    }
}

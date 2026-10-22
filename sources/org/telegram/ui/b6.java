package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class b6 implements t70 {
    public final int f35515a;
    public final e6 f35516b;
    public final CacheByChatsController.KeepMediaException f35517c;

    public b6(e6 e6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f35515a = i10;
        this.f35516b = e6Var;
        this.f35517c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35515a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                e6 e6Var = this.f35516b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f35517c;
                if (i10 == i11) {
                    e6Var.d.remove(keepMediaException);
                    e6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(e6Var.f36557b);
                }
                e6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var.e, e6Var.d);
                return;
            default:
                this.f35517c.keepMedia = i10;
                e6 e6Var2 = this.f35516b;
                e6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var2.e, e6Var2.d);
                AndroidUtilities.updateVisibleRows(e6Var2.f36557b);
                return;
        }
    }
}

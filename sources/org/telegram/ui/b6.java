package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class b6 implements r80 {
    public final int f34207a;
    public final e6 f34208b;
    public final CacheByChatsController.KeepMediaException f34209c;

    public b6(e6 e6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f34207a = i10;
        this.f34208b = e6Var;
        this.f34209c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f34207a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                e6 e6Var = this.f34208b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f34209c;
                if (i10 == i11) {
                    e6Var.d.remove(keepMediaException);
                    e6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(e6Var.f35207b);
                }
                e6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var.e, e6Var.d);
                return;
            default:
                this.f34209c.keepMedia = i10;
                e6 e6Var2 = this.f34208b;
                e6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(e6Var2.e, e6Var2.d);
                AndroidUtilities.updateVisibleRows(e6Var2.f35207b);
                return;
        }
    }
}

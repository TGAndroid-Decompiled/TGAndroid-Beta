package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class a6 implements f80 {
    public final int f35031a;
    public final d6 f35032b;
    public final CacheByChatsController.KeepMediaException f35033c;

    public a6(d6 d6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f35031a = i10;
        this.f35032b = d6Var;
        this.f35033c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35031a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                d6 d6Var = this.f35032b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f35033c;
                if (i10 == i11) {
                    d6Var.d.remove(keepMediaException);
                    d6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(d6Var.f35987b);
                }
                d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.f35989e, d6Var.d);
                return;
            default:
                this.f35033c.keepMedia = i10;
                d6 d6Var2 = this.f35032b;
                d6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var2.f35989e, d6Var2.d);
                AndroidUtilities.updateVisibleRows(d6Var2.f35987b);
                return;
        }
    }
}

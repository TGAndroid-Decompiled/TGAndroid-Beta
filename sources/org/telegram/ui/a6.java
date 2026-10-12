package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class a6 implements p80 {
    public final int f35708a;
    public final d6 f35709b;
    public final CacheByChatsController.KeepMediaException f35710c;

    public a6(d6 d6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f35708a = i10;
        this.f35709b = d6Var;
        this.f35710c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35708a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                d6 d6Var = this.f35709b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f35710c;
                if (i10 == i11) {
                    d6Var.d.remove(keepMediaException);
                    d6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(d6Var.f36653b);
                }
                d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.f36655e, d6Var.d);
                return;
            default:
                this.f35710c.keepMedia = i10;
                d6 d6Var2 = this.f35709b;
                d6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var2.f36655e, d6Var2.d);
                AndroidUtilities.updateVisibleRows(d6Var2.f36653b);
                return;
        }
    }
}

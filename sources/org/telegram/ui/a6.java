package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class a6 implements f80 {
    public final int f35023a;
    public final d6 f35024b;
    public final CacheByChatsController.KeepMediaException f35025c;

    public a6(d6 d6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f35023a = i10;
        this.f35024b = d6Var;
        this.f35025c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35023a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                d6 d6Var = this.f35024b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f35025c;
                if (i10 == i11) {
                    d6Var.d.remove(keepMediaException);
                    d6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(d6Var.f36008b);
                }
                d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.f36010e, d6Var.d);
                return;
            default:
                this.f35025c.keepMedia = i10;
                d6 d6Var2 = this.f35024b;
                d6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var2.f36010e, d6Var2.d);
                AndroidUtilities.updateVisibleRows(d6Var2.f36008b);
                return;
        }
    }
}

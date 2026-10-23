package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class a6 implements z70 {
    public final int f35576a;
    public final d6 f35577b;
    public final CacheByChatsController.KeepMediaException f35578c;

    public a6(d6 d6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f35576a = i10;
        this.f35577b = d6Var;
        this.f35578c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f35576a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                d6 d6Var = this.f35577b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f35578c;
                if (i10 == i11) {
                    d6Var.d.remove(keepMediaException);
                    d6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(d6Var.f36518b);
                }
                d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.e, d6Var.d);
                return;
            default:
                this.f35578c.keepMedia = i10;
                d6 d6Var2 = this.f35577b;
                d6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var2.e, d6Var2.d);
                AndroidUtilities.updateVisibleRows(d6Var2.f36518b);
                return;
        }
    }
}

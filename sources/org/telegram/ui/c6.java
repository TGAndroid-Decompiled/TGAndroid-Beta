package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class c6 implements g80 {
    public final int f33023a;
    public final f6 f33024b;
    public final CacheByChatsController.KeepMediaException f33025c;

    public c6(f6 f6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f33023a = i10;
        this.f33024b = f6Var;
        this.f33025c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f33023a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                f6 f6Var = this.f33024b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f33025c;
                if (i10 == i11) {
                    f6Var.d.remove(keepMediaException);
                    f6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(f6Var.f33960b);
                }
                f6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(f6Var.e, f6Var.d);
                return;
            default:
                this.f33025c.keepMedia = i10;
                f6 f6Var2 = this.f33024b;
                f6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(f6Var2.e, f6Var2.d);
                AndroidUtilities.updateVisibleRows(f6Var2.f33960b);
                return;
        }
    }
}

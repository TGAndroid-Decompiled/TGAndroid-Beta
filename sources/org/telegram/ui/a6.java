package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
public final class a6 implements e80 {
    public final int f32462a;
    public final d6 f32463b;
    public final CacheByChatsController.KeepMediaException f32464c;

    public a6(d6 d6Var, CacheByChatsController.KeepMediaException keepMediaException, int i10) {
        this.f32462a = i10;
        this.f32463b = d6Var;
        this.f32464c = keepMediaException;
    }

    @Override
    public final void a(int i10) {
        switch (this.f32462a) {
            case 0:
                int i11 = CacheByChatsController.KEEP_MEDIA_DELETE;
                d6 d6Var = this.f32463b;
                CacheByChatsController.KeepMediaException keepMediaException = this.f32464c;
                if (i10 == i11) {
                    d6Var.d.remove(keepMediaException);
                    d6Var.U();
                } else {
                    keepMediaException.keepMedia = i10;
                    AndroidUtilities.updateVisibleRows(d6Var.f33521b);
                }
                d6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var.e, d6Var.d);
                return;
            default:
                this.f32464c.keepMedia = i10;
                d6 d6Var2 = this.f32463b;
                d6Var2.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(d6Var2.e, d6Var2.d);
                AndroidUtilities.updateVisibleRows(d6Var2.f33521b);
                return;
        }
    }
}

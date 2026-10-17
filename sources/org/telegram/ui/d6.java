package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class d6 extends pg.a {
    public final CacheByChatsController.KeepMediaException f36079c;

    public d6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f36079c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || d6.class != obj.getClass()) {
            return false;
        }
        d6 d6Var = (d6) obj;
        if (this.f44314a != d6Var.f44314a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f36079c;
        if (keepMediaException2 == null || (keepMediaException = d6Var.f36079c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

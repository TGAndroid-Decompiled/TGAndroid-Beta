package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class c6 extends pg.a {
    public final CacheByChatsController.KeepMediaException f36248c;

    public c6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f36248c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || c6.class != obj.getClass()) {
            return false;
        }
        c6 c6Var = (c6) obj;
        if (this.f44713a != c6Var.f44713a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f36248c;
        if (keepMediaException2 == null || (keepMediaException = c6Var.f36248c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

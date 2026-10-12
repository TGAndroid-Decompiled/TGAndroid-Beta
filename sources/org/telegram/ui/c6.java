package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class c6 extends og.a {
    public final CacheByChatsController.KeepMediaException f36332c;

    public c6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f36332c = keepMediaException;
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
        if (this.f16876a != c6Var.f16876a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f36332c;
        if (keepMediaException2 == null || (keepMediaException = c6Var.f36332c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

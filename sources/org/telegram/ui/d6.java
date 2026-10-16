package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class d6 extends pg.a {
    public final CacheByChatsController.KeepMediaException f34884c;

    public d6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f34884c = keepMediaException;
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
        if (this.f42904a != d6Var.f42904a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f34884c;
        if (keepMediaException2 == null || (keepMediaException = d6Var.f34884c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

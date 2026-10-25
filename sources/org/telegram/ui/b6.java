package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class b6 extends qg.a {
    public final CacheByChatsController.KeepMediaException f37978c;

    public b6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f37978c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || b6.class != obj.getClass()) {
            return false;
        }
        b6 b6Var = (b6) obj;
        if (this.f47037a != b6Var.f47037a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f37978c;
        if (keepMediaException2 == null || (keepMediaException = b6Var.f37978c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

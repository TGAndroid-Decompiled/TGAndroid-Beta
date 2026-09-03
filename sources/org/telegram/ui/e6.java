package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class e6 extends bg.b {
    public final CacheByChatsController.KeepMediaException f33616c;

    public e6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f33616c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || e6.class != obj.getClass()) {
            return false;
        }
        e6 e6Var = (e6) obj;
        if (this.f1830a != e6Var.f1830a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f33616c;
        if (keepMediaException2 == null || (keepMediaException = e6Var.f33616c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class c6 extends bg.b {
    public final CacheByChatsController.KeepMediaException f33097c;

    public c6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f33097c = keepMediaException;
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
        if (this.f1808a != c6Var.f1808a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f33097c;
        if (keepMediaException2 == null || (keepMediaException = c6Var.f33097c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class a6 extends og.a {
    public final CacheByChatsController.KeepMediaException f31725c;

    public a6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f31725c = keepMediaException;
    }

    public final boolean equals(Object obj) {
        CacheByChatsController.KeepMediaException keepMediaException;
        if (this == obj) {
            return true;
        }
        if (obj == null || a6.class != obj.getClass()) {
            return false;
        }
        a6 a6Var = (a6) obj;
        if (this.f15543a != a6Var.f15543a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f31725c;
        if (keepMediaException2 == null || (keepMediaException = a6Var.f31725c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

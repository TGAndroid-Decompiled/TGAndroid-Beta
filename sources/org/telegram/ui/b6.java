package org.telegram.ui;

import org.telegram.messenger.CacheByChatsController;
public final class b6 extends og.a {
    public final CacheByChatsController.KeepMediaException f32244c;

    public b6(int i10, CacheByChatsController.KeepMediaException keepMediaException) {
        super(i10, false);
        this.f32244c = keepMediaException;
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
        if (this.f15754a != b6Var.f15754a) {
            return false;
        }
        CacheByChatsController.KeepMediaException keepMediaException2 = this.f32244c;
        if (keepMediaException2 == null || (keepMediaException = b6Var.f32244c) == null || keepMediaException2.dialogId == keepMediaException.dialogId) {
            return true;
        }
        return false;
    }
}

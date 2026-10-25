package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class al implements MessagesStorage.IntCallback {
    public final un f37818a;

    public al(un unVar) {
        this.f37818a = unVar;
    }

    @Override
    public final void run(int i10) {
        this.f37818a.P9(i10);
    }
}

package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class dl implements MessagesStorage.IntCallback {
    public final zn f33095a;

    public dl(zn znVar) {
        this.f33095a = znVar;
    }

    @Override
    public final void run(int i10) {
        this.f33095a.G9(i10);
    }
}

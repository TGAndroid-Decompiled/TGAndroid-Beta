package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
public final class dl implements MessagesStorage.IntCallback {
    public final xn f32993a;

    public dl(xn xnVar) {
        this.f32993a = xnVar;
    }

    @Override
    public final void run(int i10) {
        this.f32993a.G9(i10);
    }
}

package org.telegram.messenger;

import android.util.SparseArray;
public final class yd implements Runnable {
    public final int f22261a;
    public final MessagesController f22262b;
    public final SparseArray f22263c;

    public yd(MessagesController messagesController, SparseArray sparseArray, int i10) {
        this.f22261a = i10;
        this.f22262b = messagesController;
        this.f22263c = sparseArray;
    }

    @Override
    public final void run() {
        switch (this.f22261a) {
            case 0:
                this.f22262b.lambda$getDifference$352(this.f22263c);
                return;
            default:
                this.f22262b.lambda$getChannelDifference$339(this.f22263c);
                return;
        }
    }
}

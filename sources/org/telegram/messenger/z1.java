package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;

public final class z1 implements Handler.Callback {

    public final int f22283a;

    public final Thread f22284b;

    public z1(Thread thread, int i10) {
        this.f22283a = i10;
        this.f22284b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f22283a) {
            case 0:
                return ((DispatchQueue) this.f22284b).lambda$run$0(message);
            default:
                return ((DispatchQueueMainThreadSync) this.f22284b).lambda$run$1(message);
        }
    }
}

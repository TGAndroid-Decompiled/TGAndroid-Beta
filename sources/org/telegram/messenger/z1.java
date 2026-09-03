package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class z1 implements Handler.Callback {
    public final int f19069a;
    public final Thread f19070b;

    public z1(Thread thread, int i10) {
        this.f19069a = i10;
        this.f19070b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19069a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19070b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f19070b, message);
        }
    }
}

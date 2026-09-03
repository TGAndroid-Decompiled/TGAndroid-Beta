package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class z1 implements Handler.Callback {
    public final int f20747a;
    public final Thread f20748b;

    public z1(Thread thread, int i10) {
        this.f20747a = i10;
        this.f20748b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f20747a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f20748b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f20748b, message);
        }
    }
}

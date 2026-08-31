package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class z1 implements Handler.Callback {
    public final int f20745a;
    public final Thread f20746b;

    public z1(Thread thread, int i10) {
        this.f20745a = i10;
        this.f20746b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f20745a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f20746b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f20746b, message);
        }
    }
}

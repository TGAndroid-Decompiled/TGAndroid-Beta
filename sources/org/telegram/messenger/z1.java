package org.telegram.messenger;

import android.os.Handler;
import android.os.Message;
public final class z1 implements Handler.Callback {
    public final int f19094a;
    public final Thread f19095b;

    public z1(Thread thread, int i10) {
        this.f19094a = i10;
        this.f19095b = thread;
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.f19094a) {
            case 0:
                return DispatchQueue.a((DispatchQueue) this.f19095b, message);
            default:
                return DispatchQueueMainThreadSync.b((DispatchQueueMainThreadSync) this.f19095b, message);
        }
    }
}

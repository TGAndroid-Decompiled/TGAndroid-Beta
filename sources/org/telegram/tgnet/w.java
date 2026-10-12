package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f19484a;
    public final OutputSerializedData f19485b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f19484a = i10;
        this.f19485b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19484a) {
            case 0:
                this.f19485b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f19485b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f19485b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f19485b.writeString((String) obj);
                return;
        }
    }
}

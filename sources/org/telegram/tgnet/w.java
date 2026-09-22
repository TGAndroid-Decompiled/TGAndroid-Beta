package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18371a;
    public final OutputSerializedData f18372b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18371a = i10;
        this.f18372b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18371a) {
            case 0:
                this.f18372b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18372b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18372b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18372b.writeString((String) obj);
                return;
        }
    }
}

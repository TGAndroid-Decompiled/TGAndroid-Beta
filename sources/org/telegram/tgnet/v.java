package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20540a;
    public final OutputSerializedData f20541b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20540a = i10;
        this.f20541b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20540a) {
            case 0:
                this.f20541b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20541b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20541b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20541b.writeString((String) obj);
                return;
        }
    }
}

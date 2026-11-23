package org.telegram.tgnet;

import org.telegram.messenger.w10;
public final class w implements w10 {
    public final int f28763a;
    public final OutputSerializedData f28764b;

    public w(OutputSerializedData outputSerializedData, int i7) {
        this.f28763a = i7;
        this.f28764b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28763a) {
            case 0:
                this.f28764b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28764b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28764b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28764b.writeString((String) obj);
                return;
        }
    }
}

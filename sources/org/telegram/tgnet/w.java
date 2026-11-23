package org.telegram.tgnet;

import org.telegram.messenger.y10;
public final class w implements y10 {
    public final int f28705a;
    public final OutputSerializedData f28706b;

    public w(OutputSerializedData outputSerializedData, int i7) {
        this.f28705a = i7;
        this.f28706b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28705a) {
            case 0:
                this.f28706b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28706b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28706b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28706b.writeString((String) obj);
                return;
        }
    }
}

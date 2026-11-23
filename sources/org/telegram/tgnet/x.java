package org.telegram.tgnet;

import org.telegram.messenger.y10;
public final class x implements y10 {
    public final int f28671a;
    public final OutputSerializedData f28672b;

    public x(OutputSerializedData outputSerializedData, int i7) {
        this.f28671a = i7;
        this.f28672b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28671a) {
            case 0:
                this.f28672b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28672b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28672b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28672b.writeString((String) obj);
                return;
        }
    }
}

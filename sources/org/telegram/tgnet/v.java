package org.telegram.tgnet;

import org.telegram.messenger.x10;
public final class v implements x10 {
    public final int f28672a;
    public final OutputSerializedData f28673b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f28672a = i7;
        this.f28673b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28672a) {
            case 0:
                this.f28673b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28673b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28673b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28673b.writeString((String) obj);
                return;
        }
    }
}

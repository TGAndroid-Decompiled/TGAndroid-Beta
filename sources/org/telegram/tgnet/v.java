package org.telegram.tgnet;

import org.telegram.messenger.x10;
public final class v implements x10 {
    public final int f28674a;
    public final OutputSerializedData f28675b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f28674a = i7;
        this.f28675b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28674a) {
            case 0:
                this.f28675b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28675b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28675b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28675b.writeString((String) obj);
                return;
        }
    }
}

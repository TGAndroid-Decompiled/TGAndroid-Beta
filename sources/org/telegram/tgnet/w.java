package org.telegram.tgnet;

import org.telegram.messenger.x10;
public final class w implements x10 {
    public final int f28702a;
    public final OutputSerializedData f28703b;

    public w(OutputSerializedData outputSerializedData, int i7) {
        this.f28702a = i7;
        this.f28703b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28702a) {
            case 0:
                this.f28703b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28703b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28703b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28703b.writeString((String) obj);
                return;
        }
    }
}

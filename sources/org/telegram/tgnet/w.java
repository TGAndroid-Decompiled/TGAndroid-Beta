package org.telegram.tgnet;

import org.telegram.messenger.q20;
public final class w implements q20 {
    public final int f20064a;
    public final OutputSerializedData f20065b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20064a = i10;
        this.f20065b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f20064a) {
            case 0:
                this.f20065b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20065b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20065b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20065b.writeString((String) obj);
                return;
        }
    }
}

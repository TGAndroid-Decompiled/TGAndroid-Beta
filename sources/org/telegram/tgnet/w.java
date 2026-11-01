package org.telegram.tgnet;

import org.telegram.messenger.r20;
public final class w implements r20 {
    public final int f20065a;
    public final OutputSerializedData f20066b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20065a = i10;
        this.f20066b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f20065a) {
            case 0:
                this.f20066b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20066b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20066b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20066b.writeString((String) obj);
                return;
        }
    }
}

package org.telegram.tgnet;

import org.telegram.messenger.c20;
public final class v implements c20 {
    public final int f27225a;
    public final OutputSerializedData f27226b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f27225a = i7;
        this.f27226b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27225a) {
            case 0:
                this.f27226b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f27226b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f27226b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f27226b.writeString((String) obj);
                return;
        }
    }
}

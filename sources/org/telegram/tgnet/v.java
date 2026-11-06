package org.telegram.tgnet;

import org.telegram.messenger.c20;
public final class v implements c20 {
    public final int f27221a;
    public final OutputSerializedData f27222b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f27221a = i7;
        this.f27222b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27221a) {
            case 0:
                this.f27222b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f27222b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f27222b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f27222b.writeString((String) obj);
                return;
        }
    }
}

package org.telegram.tgnet;

import org.telegram.messenger.c20;
public final class v implements c20 {
    public final int f27222a;
    public final OutputSerializedData f27223b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f27222a = i7;
        this.f27223b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27222a) {
            case 0:
                this.f27223b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f27223b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f27223b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f27223b.writeString((String) obj);
                return;
        }
    }
}

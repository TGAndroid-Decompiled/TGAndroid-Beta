package org.telegram.tgnet;

import org.telegram.messenger.c20;
public final class v implements c20 {
    public final int f27229a;
    public final OutputSerializedData f27230b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f27229a = i7;
        this.f27230b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27229a) {
            case 0:
                this.f27230b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f27230b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f27230b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f27230b.writeString((String) obj);
                return;
        }
    }
}

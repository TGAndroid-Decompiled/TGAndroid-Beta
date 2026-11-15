package org.telegram.tgnet;

import org.telegram.messenger.z10;
public final class v implements z10 {
    public final int f28320a;
    public final OutputSerializedData f28321b;

    public v(OutputSerializedData outputSerializedData, int i7) {
        this.f28320a = i7;
        this.f28321b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f28320a) {
            case 0:
                this.f28321b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f28321b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f28321b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f28321b.writeString((String) obj);
                return;
        }
    }
}

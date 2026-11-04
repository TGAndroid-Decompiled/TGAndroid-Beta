package org.telegram.tgnet;

import org.telegram.messenger.u10;
public final class v implements u10 {
    public final int f27271a;
    public final OutputSerializedData f27272b;

    public v(OutputSerializedData outputSerializedData, int i3) {
        this.f27271a = i3;
        this.f27272b = outputSerializedData;
    }

    @Override
    public final void a(Object obj) {
        switch (this.f27271a) {
            case 0:
                this.f27272b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f27272b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f27272b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f27272b.writeString((String) obj);
                return;
        }
    }
}

package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20132a;
    public final OutputSerializedData f20133b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20132a = i10;
        this.f20133b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20132a) {
            case 0:
                this.f20133b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20133b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20133b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20133b.writeString((String) obj);
                return;
        }
    }
}

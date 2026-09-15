package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f18373a;
    public final OutputSerializedData f18374b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f18373a = i10;
        this.f18374b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18373a) {
            case 0:
                this.f18374b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18374b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18374b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18374b.writeString((String) obj);
                return;
        }
    }
}

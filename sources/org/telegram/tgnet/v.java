package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20544a;
    public final OutputSerializedData f20545b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20544a = i10;
        this.f20545b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20544a) {
            case 0:
                this.f20545b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20545b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20545b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20545b.writeString((String) obj);
                return;
        }
    }
}

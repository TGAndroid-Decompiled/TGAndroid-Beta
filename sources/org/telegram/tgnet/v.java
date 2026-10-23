package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20545a;
    public final OutputSerializedData f20546b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20545a = i10;
        this.f20546b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20545a) {
            case 0:
                this.f20546b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20546b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20546b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20546b.writeString((String) obj);
                return;
        }
    }
}

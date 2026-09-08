package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20159a;
    public final OutputSerializedData f20160b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20159a = i10;
        this.f20160b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20159a) {
            case 0:
                this.f20160b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20160b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20160b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20160b.writeString((String) obj);
                return;
        }
    }
}

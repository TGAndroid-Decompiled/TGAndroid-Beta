package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f20160a;
    public final OutputSerializedData f20161b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20160a = i10;
        this.f20161b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20160a) {
            case 0:
                this.f20161b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20161b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20161b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20161b.writeString((String) obj);
                return;
        }
    }
}

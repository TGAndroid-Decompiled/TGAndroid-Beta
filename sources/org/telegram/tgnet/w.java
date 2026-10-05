package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f20311a;
    public final OutputSerializedData f20312b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20311a = i10;
        this.f20312b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20311a) {
            case 0:
                this.f20312b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20312b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20312b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20312b.writeString((String) obj);
                return;
        }
    }
}

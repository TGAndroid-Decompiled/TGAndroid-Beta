package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f20133a;
    public final OutputSerializedData f20134b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20133a = i10;
        this.f20134b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20133a) {
            case 0:
                this.f20134b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20134b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20134b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20134b.writeString((String) obj);
                return;
        }
    }
}

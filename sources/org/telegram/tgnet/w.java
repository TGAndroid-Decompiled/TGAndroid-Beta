package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18590a;
    public final OutputSerializedData f18591b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18590a = i10;
        this.f18591b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18590a) {
            case 0:
                this.f18591b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18591b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18591b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18591b.writeString((String) obj);
                return;
        }
    }
}

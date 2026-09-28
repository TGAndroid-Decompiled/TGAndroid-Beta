package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18597a;
    public final OutputSerializedData f18598b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18597a = i10;
        this.f18598b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18597a) {
            case 0:
                this.f18598b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18598b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18598b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18598b.writeString((String) obj);
                return;
        }
    }
}

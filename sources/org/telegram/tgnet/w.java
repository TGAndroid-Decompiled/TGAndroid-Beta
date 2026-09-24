package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18583a;
    public final OutputSerializedData f18584b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18583a = i10;
        this.f18584b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18583a) {
            case 0:
                this.f18584b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18584b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18584b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18584b.writeString((String) obj);
                return;
        }
    }
}

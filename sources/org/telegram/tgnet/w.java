package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18599a;
    public final OutputSerializedData f18600b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18599a = i10;
        this.f18600b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18599a) {
            case 0:
                this.f18600b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18600b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18600b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18600b.writeString((String) obj);
                return;
        }
    }
}

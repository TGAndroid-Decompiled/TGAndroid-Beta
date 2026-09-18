package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18383a;
    public final OutputSerializedData f18384b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18383a = i10;
        this.f18384b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18383a) {
            case 0:
                this.f18384b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18384b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18384b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18384b.writeString((String) obj);
                return;
        }
    }
}

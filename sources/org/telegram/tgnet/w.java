package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f19184a;
    public final OutputSerializedData f19185b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f19184a = i10;
        this.f19185b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f19184a) {
            case 0:
                this.f19185b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f19185b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f19185b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f19185b.writeString((String) obj);
                return;
        }
    }
}

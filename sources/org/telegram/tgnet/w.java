package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f20308a;
    public final OutputSerializedData f20309b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20308a = i10;
        this.f20309b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20308a) {
            case 0:
                this.f20309b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20309b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20309b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20309b.writeString((String) obj);
                return;
        }
    }
}

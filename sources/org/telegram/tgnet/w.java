package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18598a;
    public final OutputSerializedData f18599b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18598a = i10;
        this.f18599b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18598a) {
            case 0:
                this.f18599b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18599b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18599b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18599b.writeString((String) obj);
                return;
        }
    }
}

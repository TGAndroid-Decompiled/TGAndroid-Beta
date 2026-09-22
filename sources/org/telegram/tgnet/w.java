package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18605a;
    public final OutputSerializedData f18606b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18605a = i10;
        this.f18606b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18605a) {
            case 0:
                this.f18606b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18606b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18606b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18606b.writeString((String) obj);
                return;
        }
    }
}

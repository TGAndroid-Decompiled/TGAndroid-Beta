package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f18614a;
    public final OutputSerializedData f18615b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f18614a = i10;
        this.f18615b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f18614a) {
            case 0:
                this.f18615b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f18615b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f18615b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f18615b.writeString((String) obj);
                return;
        }
    }
}

package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class x implements Utilities.Callback {
    public final int f20075a;
    public final OutputSerializedData f20076b;

    public x(OutputSerializedData outputSerializedData, int i10) {
        this.f20075a = i10;
        this.f20076b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20075a) {
            case 0:
                this.f20076b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20076b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20076b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20076b.writeString((String) obj);
                return;
        }
    }
}

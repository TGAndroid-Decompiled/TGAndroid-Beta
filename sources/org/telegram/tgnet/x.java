package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class x implements Utilities.Callback {
    public final int f20076a;
    public final OutputSerializedData f20077b;

    public x(OutputSerializedData outputSerializedData, int i10) {
        this.f20076a = i10;
        this.f20077b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20076a) {
            case 0:
                this.f20077b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20077b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20077b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20077b.writeString((String) obj);
                return;
        }
    }
}

package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class v implements Utilities.Callback {
    public final int f20541a;
    public final OutputSerializedData f20542b;

    public v(OutputSerializedData outputSerializedData, int i10) {
        this.f20541a = i10;
        this.f20542b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20541a) {
            case 0:
                this.f20542b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20542b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20542b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20542b.writeString((String) obj);
                return;
        }
    }
}

package org.telegram.tgnet;

import org.telegram.messenger.Utilities;
public final class w implements Utilities.Callback {
    public final int f20338a;
    public final OutputSerializedData f20339b;

    public w(OutputSerializedData outputSerializedData, int i10) {
        this.f20338a = i10;
        this.f20339b = outputSerializedData;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f20338a) {
            case 0:
                this.f20339b.writeInt64(((Long) obj).longValue());
                return;
            case 1:
                this.f20339b.writeInt32(((Integer) obj).intValue());
                return;
            case 2:
                this.f20339b.writeByteArray((byte[]) obj);
                return;
            default:
                this.f20339b.writeString((String) obj);
                return;
        }
    }
}

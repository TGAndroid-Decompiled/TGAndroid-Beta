package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_codeSettings extends TLObject {
    public static int constructor = -1973130814;
    public boolean allow_app_hash;
    public boolean allow_flashcall;
    public boolean allow_missed_call;
    public boolean current_number;
    public int flags;
    public ArrayList<byte[]> logout_tokens = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.allow_flashcall = (readInt32 & 1) != 0;
        this.current_number = (readInt32 & 2) != 0;
        this.allow_app_hash = (readInt32 & 16) != 0;
        this.allow_missed_call = (readInt32 & 32) != 0;
        if ((readInt32 & 64) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                this.logout_tokens.add(abstractSerializedData.readByteArray(z));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.allow_flashcall ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.current_number ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.allow_app_hash ? i2 | 16 : i2 & (-17);
        this.flags = i3;
        int i4 = this.allow_missed_call ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        abstractSerializedData.writeInt32(i4);
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.logout_tokens.size();
            abstractSerializedData.writeInt32(size);
            for (int i5 = 0; i5 < size; i5++) {
                abstractSerializedData.writeByteArray(this.logout_tokens.get(i5));
            }
        }
    }
}

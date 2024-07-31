package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_codeSettings extends TLObject {
    public boolean allow_app_hash;
    public boolean allow_firebase;
    public boolean allow_flashcall;
    public boolean allow_missed_call;
    public boolean app_sandbox;
    public boolean current_number;
    public int flags;
    public ArrayList<byte[]> logout_tokens = new ArrayList<>();
    public String token;
    public boolean unknown_number;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.allow_flashcall = (readInt32 & 1) != 0;
        this.current_number = (readInt32 & 2) != 0;
        this.allow_app_hash = (readInt32 & 16) != 0;
        this.allow_missed_call = (readInt32 & 32) != 0;
        this.allow_firebase = (readInt32 & 128) != 0;
        this.unknown_number = (readInt32 & 512) != 0;
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
                byte[] readByteArray = abstractSerializedData.readByteArray(z);
                if (readByteArray == null) {
                    return;
                }
                this.logout_tokens.add(readByteArray);
            }
        }
        if ((this.flags & 256) != 0) {
            this.token = abstractSerializedData.readString(z);
        }
        this.app_sandbox = (this.flags & 256) != 0;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1390068360);
        int i = this.allow_flashcall ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.current_number ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.allow_app_hash ? i2 | 16 : i2 & (-17);
        this.flags = i3;
        int i4 = this.allow_missed_call ? i3 | 32 : i3 & (-33);
        this.flags = i4;
        int i5 = this.allow_firebase ? i4 | 128 : i4 & (-129);
        this.flags = i5;
        int i6 = this.app_sandbox ? i5 | 256 : i5 & (-257);
        this.flags = i6;
        int i7 = this.unknown_number ? i6 | 512 : i6 & (-513);
        this.flags = i7;
        abstractSerializedData.writeInt32(i7);
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.logout_tokens.size();
            abstractSerializedData.writeInt32(size);
            for (int i8 = 0; i8 < size; i8++) {
                abstractSerializedData.writeByteArray(this.logout_tokens.get(i8));
            }
        }
        if ((this.flags & 256) != 0) {
            abstractSerializedData.writeString(this.token);
        }
    }
}

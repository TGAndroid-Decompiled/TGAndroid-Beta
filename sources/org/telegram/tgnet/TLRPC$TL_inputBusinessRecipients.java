package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_inputBusinessRecipients extends TLObject {
    public boolean contacts;
    public boolean exclude_selected;
    public boolean existing_chats;
    public int flags;
    public boolean new_chats;
    public boolean non_contacts;
    public ArrayList<TLRPC$InputUser> users = new ArrayList<>();

    public static TLRPC$TL_inputBusinessRecipients TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 1871393450) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_inputBusinessRecipients", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_inputBusinessRecipients tLRPC$TL_inputBusinessRecipients = new TLRPC$TL_inputBusinessRecipients();
        tLRPC$TL_inputBusinessRecipients.readParams(abstractSerializedData, z);
        return tLRPC$TL_inputBusinessRecipients;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.existing_chats = (readInt32 & 1) != 0;
        this.new_chats = (readInt32 & 2) != 0;
        this.contacts = (readInt32 & 4) != 0;
        this.non_contacts = (readInt32 & 8) != 0;
        this.exclude_selected = (readInt32 & 32) != 0;
        if ((readInt32 & 16) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                this.users.add(TLRPC$InputUser.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1871393450);
        int i = this.existing_chats ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.new_chats ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.contacts ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.non_contacts ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.exclude_selected ? i4 | 32 : i4 & (-33);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.users.size();
            abstractSerializedData.writeInt32(size);
            for (int i6 = 0; i6 < size; i6++) {
                this.users.get(i6).serializeToStream(abstractSerializedData);
            }
        }
    }
}

package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$contacts_Contacts extends TLObject {
    public int saved_count;
    public ArrayList<TLRPC$TL_contact> contacts = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$contacts_Contacts TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$contacts_Contacts tLRPC$contacts_Contacts;
        if (i == -1219778094) {
            tLRPC$contacts_Contacts = new TLRPC$contacts_Contacts() {
                public static int constructor = -1219778094;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$contacts_Contacts = i != -353862078 ? null : new TLRPC$contacts_Contacts() {
                public static int constructor = -353862078;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$TL_contact TLdeserialize = TLRPC$TL_contact.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.contacts.add(TLdeserialize);
                    }
                    this.saved_count = abstractSerializedData2.readInt32(z2);
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    if (readInt323 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                        return;
                    }
                    int readInt324 = abstractSerializedData2.readInt32(z2);
                    for (int i3 = 0; i3 < readInt324; i3++) {
                        TLRPC$User TLdeserialize2 = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize2 == null) {
                            return;
                        }
                        this.users.add(TLdeserialize2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.contacts.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.contacts.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(this.saved_count);
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.users.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.users.get(i3).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$contacts_Contacts == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in contacts_Contacts", Integer.valueOf(i)));
        }
        if (tLRPC$contacts_Contacts != null) {
            tLRPC$contacts_Contacts.readParams(abstractSerializedData, z);
        }
        return tLRPC$contacts_Contacts;
    }
}

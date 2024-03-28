package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.BirthdayController;
public class TLRPC$TL_contacts_contactBirthdays extends TLObject {
    public ArrayList<TLRPC$TL_contactBirthday> contacts = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_contacts_contactBirthdays TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 290452237) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_contacts_contactBirthdays", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_contacts_contactBirthdays tLRPC$TL_contacts_contactBirthdays = new TLRPC$TL_contacts_contactBirthdays();
        tLRPC$TL_contacts_contactBirthdays.readParams(abstractSerializedData, z);
        return tLRPC$TL_contacts_contactBirthdays;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.contacts.add(TLRPC$TL_contactBirthday.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
            return;
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt324; i2++) {
            this.users.add(TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(BirthdayController.TL_birthdays.constructor);
        abstractSerializedData.writeInt32(481674261);
        int size = this.contacts.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.contacts.get(i).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.users.size();
        abstractSerializedData.writeInt32(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            this.users.get(i2).serializeToStream(abstractSerializedData);
        }
    }
}

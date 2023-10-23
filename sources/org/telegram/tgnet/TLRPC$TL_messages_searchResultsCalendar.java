package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messages_searchResultsCalendar extends TLObject {
    public int count;
    public int flags;
    public boolean inexact;
    public int min_date;
    public int min_msg_id;
    public int offset_id_offset;
    public ArrayList<TLRPC$TL_searchResultsCalendarPeriod> periods = new ArrayList<>();
    public ArrayList<TLRPC$Message> messages = new ArrayList<>();
    public ArrayList<TLRPC$Chat> chats = new ArrayList<>();
    public ArrayList<TLRPC$User> users = new ArrayList<>();

    public static TLRPC$TL_messages_searchResultsCalendar TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (343859772 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_messages_searchResultsCalendar", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_messages_searchResultsCalendar tLRPC$TL_messages_searchResultsCalendar = new TLRPC$TL_messages_searchResultsCalendar();
        tLRPC$TL_messages_searchResultsCalendar.readParams(abstractSerializedData, z);
        return tLRPC$TL_messages_searchResultsCalendar;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.inexact = (readInt32 & 1) != 0;
        this.count = abstractSerializedData.readInt32(z);
        this.min_date = abstractSerializedData.readInt32(z);
        this.min_msg_id = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.offset_id_offset = abstractSerializedData.readInt32(z);
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TLRPC$TL_searchResultsCalendarPeriod TLdeserialize = TLRPC$TL_searchResultsCalendarPeriod.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.periods.add(TLdeserialize);
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        if (readInt324 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            }
            return;
        }
        int readInt325 = abstractSerializedData.readInt32(z);
        for (int i2 = 0; i2 < readInt325; i2++) {
            TLRPC$Message TLdeserialize2 = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize2 == null) {
                return;
            }
            this.messages.add(TLdeserialize2);
        }
        int readInt326 = abstractSerializedData.readInt32(z);
        if (readInt326 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
            }
            return;
        }
        int readInt327 = abstractSerializedData.readInt32(z);
        for (int i3 = 0; i3 < readInt327; i3++) {
            TLRPC$Chat TLdeserialize3 = TLRPC$Chat.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize3 == null) {
                return;
            }
            this.chats.add(TLdeserialize3);
        }
        int readInt328 = abstractSerializedData.readInt32(z);
        if (readInt328 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt328)));
            }
            return;
        }
        int readInt329 = abstractSerializedData.readInt32(z);
        for (int i4 = 0; i4 < readInt329; i4++) {
            TLRPC$User TLdeserialize4 = TLRPC$User.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize4 == null) {
                return;
            }
            this.users.add(TLdeserialize4);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(343859772);
        int i = this.inexact ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt32(this.min_date);
        abstractSerializedData.writeInt32(this.min_msg_id);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.offset_id_offset);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.periods.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.periods.get(i2).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size2 = this.messages.size();
        abstractSerializedData.writeInt32(size2);
        for (int i3 = 0; i3 < size2; i3++) {
            this.messages.get(i3).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size3 = this.chats.size();
        abstractSerializedData.writeInt32(size3);
        for (int i4 = 0; i4 < size3; i4++) {
            this.chats.get(i4).serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size4 = this.users.size();
        abstractSerializedData.writeInt32(size4);
        for (int i5 = 0; i5 < size4; i5++) {
            this.users.get(i5).serializeToStream(abstractSerializedData);
        }
    }
}

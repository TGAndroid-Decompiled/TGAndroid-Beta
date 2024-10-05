package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_inputStorePaymentPremiumGiveaway extends TLRPC$InputStorePaymentPurpose {
    public long amount;
    public TLRPC$InputPeer boost_peer;
    public String currency;
    public int flags;
    public boolean only_new_subscribers;
    public String prize_description;
    public long random_id;
    public int until_date;
    public boolean winners_are_visible;
    public ArrayList additional_peers = new ArrayList();
    public ArrayList countries_iso2 = new ArrayList();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.only_new_subscribers = (readInt32 & 1) != 0;
        this.winners_are_visible = (readInt32 & 8) != 0;
        this.boost_peer = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 2) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TLRPC$InputPeer TLdeserialize = TLRPC$InputPeer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.additional_peers.add(TLdeserialize);
            }
        }
        if ((this.flags & 4) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            } else {
                int readInt325 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt325; i2++) {
                    this.countries_iso2.add(abstractSerializedData.readString(z));
                }
            }
        }
        if ((this.flags & 16) != 0) {
            this.prize_description = abstractSerializedData.readString(z);
        }
        this.random_id = abstractSerializedData.readInt64(z);
        this.until_date = abstractSerializedData.readInt32(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(369444042);
        int i = this.only_new_subscribers ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.winners_are_visible ? i | 8 : i & (-9);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.boost_peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.additional_peers.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                ((TLRPC$InputPeer) this.additional_peers.get(i3)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.countries_iso2.size();
            abstractSerializedData.writeInt32(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                abstractSerializedData.writeString((String) this.countries_iso2.get(i4));
            }
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.prize_description);
        }
        abstractSerializedData.writeInt64(this.random_id);
        abstractSerializedData.writeInt32(this.until_date);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}

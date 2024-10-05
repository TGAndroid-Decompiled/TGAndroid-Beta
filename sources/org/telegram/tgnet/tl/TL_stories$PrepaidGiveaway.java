package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stories$PrepaidGiveaway extends TLObject {
    public int boosts;
    public int date;
    public long id;
    public int quantity;

    public static TL_stories$PrepaidGiveaway TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$PrepaidGiveaway tL_stories$TL_prepaidGiveaway = i != -1700956192 ? i != -1303143084 ? null : new TL_stories$TL_prepaidGiveaway() : new TL_stories$TL_prepaidStarsGiveaway();
        if (tL_stories$TL_prepaidGiveaway == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in PrepaidGiveaway", Integer.valueOf(i)));
        }
        if (tL_stories$TL_prepaidGiveaway != null) {
            tL_stories$TL_prepaidGiveaway.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_prepaidGiveaway;
    }
}

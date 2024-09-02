package org.telegram.tgnet;

public class TLRPC$BusinessAwayMessageSchedule extends TLObject {
    public static TLRPC$BusinessAwayMessageSchedule TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BusinessAwayMessageSchedule tLRPC$TL_businessAwayMessageScheduleCustom = i != -1007487743 ? i != -910564679 ? i != -867328308 ? null : new TLRPC$TL_businessAwayMessageScheduleCustom() : new TLRPC$TL_businessAwayMessageScheduleAlways() : new TLRPC$TL_businessAwayMessageScheduleOutsideWorkHours();
        if (tLRPC$TL_businessAwayMessageScheduleCustom == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BusinessAwayMessageSchedule", Integer.valueOf(i)));
        }
        if (tLRPC$TL_businessAwayMessageScheduleCustom != null) {
            tLRPC$TL_businessAwayMessageScheduleCustom.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_businessAwayMessageScheduleCustom;
    }
}

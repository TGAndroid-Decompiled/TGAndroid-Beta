package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class VectorLegacy {
    private VectorLegacy() {
    }

    public static ArrayList<Long> deserialize_IntAsLong(InputSerializedData inputSerializedData, boolean z9) {
        ArrayList<Integer> deserializeInt = Vector.deserializeInt(inputSerializedData, z9);
        ArrayList<Long> arrayList = new ArrayList<>(deserializeInt.size());
        int size = deserializeInt.size();
        int i7 = 0;
        while (i7 < size) {
            Integer num = deserializeInt.get(i7);
            i7++;
            arrayList.add(Long.valueOf(num.intValue()));
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_IntUserIdAsPeer(InputSerializedData inputSerializedData, boolean z9) {
        ArrayList<Integer> deserializeInt = Vector.deserializeInt(inputSerializedData, z9);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(deserializeInt.size());
        int size = deserializeInt.size();
        int i7 = 0;
        while (i7 < size) {
            Integer num = deserializeInt.get(i7);
            i7++;
            int intValue = num.intValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = intValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_LongUserIdAsPeer(InputSerializedData inputSerializedData, boolean z9) {
        ArrayList<Long> deserializeLong = Vector.deserializeLong(inputSerializedData, z9);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(deserializeLong.size());
        int size = deserializeLong.size();
        int i7 = 0;
        while (i7 < size) {
            Long l10 = deserializeLong.get(i7);
            i7++;
            long longValue = l10.longValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = longValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static void serialize_LongAsInt(OutputSerializedData outputSerializedData, ArrayList<Long> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Long l10 = arrayList.get(i7);
            i7++;
            arrayList2.add(Integer.valueOf((int) l10.longValue()));
        }
        Vector.serializeInt(outputSerializedData, arrayList2);
    }

    public static void serialize_PeerAsIntUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i7 = 0; i7 < size; i7++) {
            outputSerializedData.writeInt32((int) arrayList.get(i7).user_id);
        }
    }

    public static void serialize_PeerAsLongUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i7 = 0; i7 < size; i7++) {
            outputSerializedData.writeInt64(arrayList.get(i7).user_id);
        }
    }
}

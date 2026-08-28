package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class VectorLegacy {
    private VectorLegacy() {
    }

    public static ArrayList<Long> deserialize_IntAsLong(InputSerializedData inputSerializedData, boolean z10) {
        ArrayList<Integer> deserializeInt = Vector.deserializeInt(inputSerializedData, z10);
        ArrayList<Long> arrayList = new ArrayList<>(deserializeInt.size());
        int size = deserializeInt.size();
        int i9 = 0;
        while (i9 < size) {
            Integer num = deserializeInt.get(i9);
            i9++;
            arrayList.add(Long.valueOf(num.intValue()));
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_IntUserIdAsPeer(InputSerializedData inputSerializedData, boolean z10) {
        ArrayList<Integer> deserializeInt = Vector.deserializeInt(inputSerializedData, z10);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(deserializeInt.size());
        int size = deserializeInt.size();
        int i9 = 0;
        while (i9 < size) {
            Integer num = deserializeInt.get(i9);
            i9++;
            int intValue = num.intValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = intValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_LongUserIdAsPeer(InputSerializedData inputSerializedData, boolean z10) {
        ArrayList<Long> deserializeLong = Vector.deserializeLong(inputSerializedData, z10);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(deserializeLong.size());
        int size = deserializeLong.size();
        int i9 = 0;
        while (i9 < size) {
            Long l10 = deserializeLong.get(i9);
            i9++;
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
        int i9 = 0;
        while (i9 < size) {
            Long l10 = arrayList.get(i9);
            i9++;
            arrayList2.add(Integer.valueOf((int) l10.longValue()));
        }
        Vector.serializeInt(outputSerializedData, arrayList2);
    }

    public static void serialize_PeerAsIntUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i9 = 0; i9 < size; i9++) {
            outputSerializedData.writeInt32((int) arrayList.get(i9).user_id);
        }
    }

    public static void serialize_PeerAsLongUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i9 = 0; i9 < size; i9++) {
            outputSerializedData.writeInt64(arrayList.get(i9).user_id);
        }
    }
}

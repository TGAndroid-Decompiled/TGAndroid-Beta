package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public class VectorLegacy {
    private VectorLegacy() {
    }

    public static ArrayList<Long> deserialize_IntAsLong(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Integer> deserializeInt = Vector.deserializeInt(inputSerializedData, z);
        ArrayList<Long> arrayList = new ArrayList<>(deserializeInt.size());
        int size = deserializeInt.size();
        int i = 0;
        while (i < size) {
            Integer num = deserializeInt.get(i);
            i++;
            arrayList.add(Long.valueOf(num.intValue()));
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_IntUserIdAsPeer(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Integer> deserializeInt = Vector.deserializeInt(inputSerializedData, z);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(deserializeInt.size());
        int size = deserializeInt.size();
        int i = 0;
        while (i < size) {
            Integer num = deserializeInt.get(i);
            i++;
            int intValue = num.intValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = intValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_LongUserIdAsPeer(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Long> deserializeLong = Vector.deserializeLong(inputSerializedData, z);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(deserializeLong.size());
        int size = deserializeLong.size();
        int i = 0;
        while (i < size) {
            Long l = deserializeLong.get(i);
            i++;
            long longValue = l.longValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = longValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static void serialize_LongAsInt(OutputSerializedData outputSerializedData, ArrayList<Long> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Long l = arrayList.get(i);
            i++;
            arrayList2.add(Integer.valueOf((int) l.longValue()));
        }
        Vector.serializeInt(outputSerializedData, arrayList2);
    }

    public static void serialize_PeerAsIntUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            outputSerializedData.writeInt32((int) arrayList.get(i).user_id);
        }
    }

    public static void serialize_PeerAsLongUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            outputSerializedData.writeInt64(arrayList.get(i).user_id);
        }
    }
}

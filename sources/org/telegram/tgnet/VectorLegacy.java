package org.telegram.tgnet;

import java.util.ArrayList;

public class VectorLegacy {
    private VectorLegacy() {
    }

    public static ArrayList<Long> deserialize_IntAsLong(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Integer> arrayListDeserializeInt = Vector.deserializeInt(inputSerializedData, z);
        ArrayList<Long> arrayList = new ArrayList<>(arrayListDeserializeInt.size());
        int size = arrayListDeserializeInt.size();
        int i = 0;
        while (i < size) {
            Integer num = arrayListDeserializeInt.get(i);
            i++;
            arrayList.add(Long.valueOf(num.intValue()));
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

    public static ArrayList<TLRPC.Peer> deserialize_IntUserIdAsPeer(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Integer> arrayListDeserializeInt = Vector.deserializeInt(inputSerializedData, z);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(arrayListDeserializeInt.size());
        int size = arrayListDeserializeInt.size();
        int i = 0;
        while (i < size) {
            Integer num = arrayListDeserializeInt.get(i);
            i++;
            int iIntValue = num.intValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = iIntValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static void serialize_PeerAsIntUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            outputSerializedData.writeInt32((int) arrayList.get(i).user_id);
        }
    }

    public static ArrayList<TLRPC.Peer> deserialize_LongUserIdAsPeer(InputSerializedData inputSerializedData, boolean z) {
        ArrayList<Long> arrayListDeserializeLong = Vector.deserializeLong(inputSerializedData, z);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(arrayListDeserializeLong.size());
        int size = arrayListDeserializeLong.size();
        int i = 0;
        while (i < size) {
            Long l = arrayListDeserializeLong.get(i);
            i++;
            long jLongValue = l.longValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = jLongValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
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

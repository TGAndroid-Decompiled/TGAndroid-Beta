package org.telegram.tgnet;

import java.util.ArrayList;

public class VectorLegacy {
    private VectorLegacy() {
    }

    public static ArrayList<Long> deserialize_IntAsLong(InputSerializedData inputSerializedData, boolean z10) {
        ArrayList<Integer> arrayListDeserializeInt = Vector.deserializeInt(inputSerializedData, z10);
        ArrayList<Long> arrayList = new ArrayList<>(arrayListDeserializeInt.size());
        int size = arrayListDeserializeInt.size();
        int i10 = 0;
        while (i10 < size) {
            Integer num = arrayListDeserializeInt.get(i10);
            i10++;
            arrayList.add(Long.valueOf(num.intValue()));
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_IntUserIdAsPeer(InputSerializedData inputSerializedData, boolean z10) {
        ArrayList<Integer> arrayListDeserializeInt = Vector.deserializeInt(inputSerializedData, z10);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(arrayListDeserializeInt.size());
        int size = arrayListDeserializeInt.size();
        int i10 = 0;
        while (i10 < size) {
            Integer num = arrayListDeserializeInt.get(i10);
            i10++;
            int iIntValue = num.intValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = iIntValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static ArrayList<TLRPC.Peer> deserialize_LongUserIdAsPeer(InputSerializedData inputSerializedData, boolean z10) {
        ArrayList<Long> arrayListDeserializeLong = Vector.deserializeLong(inputSerializedData, z10);
        ArrayList<TLRPC.Peer> arrayList = new ArrayList<>(arrayListDeserializeLong.size());
        int size = arrayListDeserializeLong.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayListDeserializeLong.get(i10);
            i10++;
            long jLongValue = l10.longValue();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = jLongValue;
            arrayList.add(tL_peerUser);
        }
        return arrayList;
    }

    public static void serialize_LongAsInt(OutputSerializedData outputSerializedData, ArrayList<Long> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Long l10 = arrayList.get(i10);
            i10++;
            arrayList2.add(Integer.valueOf((int) l10.longValue()));
        }
        Vector.serializeInt(outputSerializedData, arrayList2);
    }

    public static void serialize_PeerAsIntUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            outputSerializedData.writeInt32((int) arrayList.get(i10).user_id);
        }
    }

    public static void serialize_PeerAsLongUserId(OutputSerializedData outputSerializedData, ArrayList<TLRPC.Peer> arrayList) {
        outputSerializedData.writeInt32(481674261);
        int size = arrayList.size();
        outputSerializedData.writeInt32(size);
        for (int i10 = 0; i10 < size; i10++) {
            outputSerializedData.writeInt64(arrayList.get(i10).user_id);
        }
    }
}
